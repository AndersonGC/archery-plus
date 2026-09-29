package com.archeryplus.combat;

import com.archeryplus.item.ArcheryBowItem;
import com.archeryplus.item.BowStats;
import com.archeryplus.quiver.QuiverEquipment;
import com.archeryplus.registry.ModRegistries;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.living.LivingGetProjectileEvent;
import net.neoforged.neoforge.event.entity.player.ArrowLooseEvent;
import net.neoforged.neoforge.event.entity.player.ArrowNockEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

public final class BowCombat {
    private record Draw(ItemStack bow, long revision) {}
    private static final Map<Player, Draw> DRAWS = new WeakHashMap<>();
    private BowCombat() {}

    public static void register(IEventBus bus) {
        bus.addListener(BowCombat::projectile);
        bus.addListener(BowCombat::nock);
        bus.addListener(BowCombat::loose);
        bus.addListener((PlayerTickEvent.Post event) -> {
            Player player = event.getEntity();
            if (!player.level().isClientSide() && !player.isUsingItem()) DRAWS.remove(player);
        });
    }

    public static boolean supported(ItemStack weapon) {
        return weapon.is(Items.BOW) || weapon.is(ModRegistries.RECURVE_BOW.get()) || weapon.is(ModRegistries.LONGBOW.get());
    }

    public static BowStats stats(ItemStack weapon) {
        return weapon.getItem() instanceof ArcheryBowItem bow ? bow.stats() : BowStats.VANILLA;
    }

    private static void projectile(LivingGetProjectileEvent event) {
        if (!(event.getEntity() instanceof Player player) || !supported(event.getProjectileWeaponItemStack())) return;
        QuiverEquipment equipment = QuiverEquipment.get(player);
        ItemStack selected = equipment.equipped() ? equipment.contents().get(equipment.contents().selected()) : ItemStack.EMPTY;
        if (!selected.isEmpty() || !player.hasInfiniteMaterials()) event.setProjectileItemStack(selected);
    }

    private static void nock(ArrowNockEvent event) {
        if (!supported(event.getBow())) return;
        Player player = event.getEntity();
        if (!player.hasInfiniteMaterials() && player.getProjectile(event.getBow()).isEmpty()) {
            event.setCanceled(true);
            return;
        }
        if (!player.level().isClientSide()) DRAWS.put(player, new Draw(event.getBow(), QuiverEquipment.get(player).revision()));
    }

    private static void loose(ArrowLooseEvent event) {
        if (!supported(event.getBow())) return;
        event.setCanceled(true);
        if (event.getEntity() instanceof ServerPlayer player) release(player, event.getBow(), event.getCharge());
    }

    public static void cancel(Player player) {
        DRAWS.remove(player);
        player.stopUsingItem();
    }

    private static void release(ServerPlayer player, ItemStack bow, int ticks) {
        Draw draw = DRAWS.remove(player);
        QuiverEquipment equipment = QuiverEquipment.get(player);
        if (draw == null || draw.bow != bow || draw.revision != equipment.revision() || !player.isAlive()) return;
        BowStats stats = stats(bow);
        float power = stats.power(ticks);
        if (power < 0.1F) return;
        ItemStack ammunition = player.getProjectile(bow);
        if (ammunition.isEmpty()) return;
        if (!player.hasInfiniteMaterials() && !equipment.equipped()) return;
        var infinity = player.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.INFINITY);
        boolean free = player.hasInfiniteMaterials() || bow.getEnchantmentLevel(infinity) > 0;
        ItemStack projectile = ammunition.copyWithCount(1);
        if (free) projectile.set(DataComponents.INTANGIBLE_PROJECTILE, Unit.INSTANCE);
        ModRegistries.RECURVE_BOW.get().fire(player.level(), player, bow, List.of(projectile), power, stats.speedMultiplier());
        if (!free) {
            int selected = equipment.contents().selected();
            ammunition.shrink(1);
            equipment.contents(player, equipment.contents().with(selected, ammunition));
        }
    }
}

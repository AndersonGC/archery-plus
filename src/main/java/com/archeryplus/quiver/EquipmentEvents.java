package com.archeryplus.quiver;

import com.archeryplus.registry.ModRegistries;
import com.archeryplus.network.ModNetwork;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.gamerules.GameRules;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

public final class EquipmentEvents {
    private EquipmentEvents() {}
    public static void register(IEventBus bus) {
        bus.addListener((PlayerEvent.PlayerLoggedOutEvent event) -> {
            if (event.getEntity() instanceof ServerPlayer player) ModNetwork.clear(player);
        });
        bus.addListener(EquipmentEvents::drops);
        bus.addListener(EquipmentEvents::clonePlayer);
        bus.addListener((PlayerEvent.PlayerLoggedInEvent event) -> renew(event));
        bus.addListener((PlayerEvent.PlayerChangedDimensionEvent event) -> renew(event));
        bus.addListener((PlayerEvent.PlayerRespawnEvent event) -> renew(event));
    }

    private static void renew(PlayerEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) ModNetwork.clear(player);
        QuiverEquipment.get(event.getEntity()).renew(event.getEntity());
    }

    private static void drops(LivingDropsEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player) || player.level().getGameRules().get(GameRules.KEEP_INVENTORY)) return;
        QuiverEquipment equipment = QuiverEquipment.get(player);
        if (!equipment.equipped()) return;
        ItemEntity drop = new ItemEntity(player.level(), player.getX(), player.getY(), player.getZ(), equipment.stack().copy());
        drop.setDefaultPickUpDelay();
        event.getDrops().add(drop);
        equipment.equip(player, ItemStack.EMPTY);
    }

    private static void clonePlayer(PlayerEvent.Clone event) {
        if (event.isWasDeath() && event.getEntity() instanceof ServerPlayer player
                && player.level().getGameRules().get(GameRules.KEEP_INVENTORY)) {
            player.setData(ModRegistries.EQUIPMENT, new QuiverEquipment(QuiverEquipment.get(event.getOriginal()).stack(), 0));
            QuiverEquipment.get(player).renew(player);
        }
    }
}

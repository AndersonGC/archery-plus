package com.archeryplus.item;

import java.util.List;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.EventHooks;

public final class ArcheryBowItem extends BowItem {
    private final BowStats stats;

    public ArcheryBowItem(Properties properties, BowStats stats) {
        super(properties);
        this.stats = stats;
    }

    public BowStats stats() {
        return stats;
    }

    @Override
    public boolean releaseUsing(ItemStack bow, Level level, LivingEntity entity, int remaining) {
        if (!(entity instanceof Player player)) return false;
        ItemStack ammo = player.getProjectile(bow);
        if (ammo.isEmpty()) return false;
        int charge = EventHooks.onArrowLoose(bow, level, player, getUseDuration(bow, entity) - remaining, true);
        if (charge < 0 || stats.power(charge) < 0.1F) return false;
        if (level instanceof ServerLevel server) {
            fire(server, player, bow, draw(bow, ammo, player), stats.power(charge), stats.speedMultiplier());
        }
        return true;
    }

    public void fire(ServerLevel level, Player player, ItemStack bow, List<ItemStack> ammunition, float power, float speed) {
        var usedItem = bow.getItem();
        shoot(level, player, player.getUsedItemHand(), bow, ammunition, power * 3 * speed, 1, power == 1, null);
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT,
                SoundSource.PLAYERS, 1, 1 / (level.getRandom().nextFloat() * 0.4F + 1.2F) + power * 0.5F);
        player.awardStat(Stats.ITEM_USED.get(usedItem));
    }
}

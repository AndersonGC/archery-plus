package com.archeryplus.quiver;

import com.archeryplus.registry.ModRegistries;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public final class EquipmentContainer implements Container {
    private final Player player;
    public EquipmentContainer(Player player) { this.player = player; }
    @Override public int getContainerSize() { return 1; }
    @Override public boolean isEmpty() { return getItem(0).isEmpty(); }
    @Override public ItemStack getItem(int slot) { return QuiverEquipment.get(player).stack(); }
    @Override public int getMaxStackSize() { return 1; }
    @Override public boolean canPlaceItem(int slot, ItemStack stack) { return stack.is(ModRegistries.IRON_QUIVER.get()); }
    @Override public boolean stillValid(Player player) { return this.player == player && player.isAlive(); }
    @Override public void setChanged() { QuiverEquipment.get(player).changed(player); }
    @Override public void setItem(int slot, ItemStack stack) { QuiverEquipment.get(player).equip(player, stack); }
    @Override public void clearContent() { setItem(0, ItemStack.EMPTY); }
    @Override public ItemStack removeItemNoUpdate(int slot) { return removeItem(slot, 1); }
    @Override public ItemStack removeItem(int slot, int count) {
        if (count <= 0) return ItemStack.EMPTY;
        ItemStack removed = getItem(0);
        setItem(0, ItemStack.EMPTY);
        return removed;
    }
}

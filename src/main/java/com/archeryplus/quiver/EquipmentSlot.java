package com.archeryplus.quiver;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public final class EquipmentSlot extends Slot {
    public EquipmentSlot(Player player, int x, int y) { super(new EquipmentContainer(player), 0, x, y); }
    @Override public boolean mayPlace(ItemStack stack) { return container.canPlaceItem(0, stack); }
    @Override public int getMaxStackSize() { return 1; }
}

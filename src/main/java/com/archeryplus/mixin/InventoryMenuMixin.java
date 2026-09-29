package com.archeryplus.mixin;

import com.archeryplus.quiver.EquipmentSlot;
import com.archeryplus.registry.ModRegistries;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InventoryMenu.class)
public abstract class InventoryMenuMixin extends AbstractContainerMenu {
    @Unique private int archeryPlus$slot;
    protected InventoryMenuMixin(MenuType<?> type, int id) { super(type, id); }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void archeryPlus$addSlot(Inventory inventory, boolean active, Player player, CallbackInfo ci) {
        archeryPlus$slot = slots.size();
        addSlot(new EquipmentSlot(player, 77, 44));
    }

    @Inject(method = "quickMoveStack", at = @At("HEAD"), cancellable = true)
    private void archeryPlus$transfer(Player player, int index, CallbackInfoReturnable<ItemStack> cir) {
        if (index < 0 || index >= slots.size()) return;
        Slot source = slots.get(index);
        if (!source.hasItem()) return;
        ItemStack stack = source.getItem();
        boolean outgoing = index == archeryPlus$slot;
        if (!outgoing && (!stack.is(ModRegistries.IRON_QUIVER.get()) || slots.get(archeryPlus$slot).hasItem())) return;
        ItemStack original = stack.copy();
        boolean moved = outgoing ? moveItemStackTo(stack, 9, 45, false)
                : moveItemStackTo(stack, archeryPlus$slot, archeryPlus$slot + 1, false);
        if (!moved) { cir.setReturnValue(ItemStack.EMPTY); return; }
        if (stack.isEmpty()) source.setByPlayer(ItemStack.EMPTY); else source.setChanged();
        source.onTake(player, stack);
        cir.setReturnValue(original);
    }
}

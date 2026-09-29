package com.archeryplus.mixin;

import com.archeryplus.client.CreativeEquipmentBridge;
import com.archeryplus.quiver.EquipmentSlot;
import net.minecraft.client.gui.screens.inventory.CreativeInventoryListener;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreativeInventoryListener.class)
public abstract class CreativeInventoryListenerMixin {
    @Inject(method = "slotChanged", at = @At("HEAD"), cancellable = true)
    private void archeryPlus$skipEcho(AbstractContainerMenu menu, int index, ItemStack stack, CallbackInfo ci) {
        if (CreativeEquipmentBridge.active() || menu.getSlot(index) instanceof EquipmentSlot) ci.cancel();
    }
}

package com.archeryplus.mixin;

import com.archeryplus.client.CreativeEquipmentBridge;
import com.archeryplus.network.InventoryAction;
import com.archeryplus.quiver.EquipmentSlot;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.CreativeModeTab;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(CreativeModeInventoryScreen.class)
public abstract class CreativeInventoryScreenMixin {
    @Shadow private static CreativeModeTab selectedTab;
    @Shadow private Slot destroyItemSlot;
    @Unique private boolean archeryPlus$session;

    @Inject(method = "selectTab", at = @At("HEAD"))
    private void archeryPlus$transition(CreativeModeTab tab, CallbackInfo ci) {
        boolean inventory = tab.getType() == CreativeModeTab.Type.INVENTORY;
        if (inventory && !archeryPlus$session) CreativeEquipmentBridge.begin();
        if (!inventory && archeryPlus$session) CreativeEquipmentBridge.end();
        archeryPlus$session = inventory;
    }

    @ModifyArgs(method = "selectTab", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/CreativeModeInventoryScreen$SlotWrapper;<init>(Lnet/minecraft/world/inventory/Slot;III)V"))
    private void archeryPlus$position(Args args) {
        if (args.get(0) instanceof EquipmentSlot) { args.set(2, 35); args.set(3, 2); }
    }

    @Inject(method = "slotClicked", at = @At("HEAD"), cancellable = true)
    private void archeryPlus$click(Slot slot, int index, int button, ContainerInput input, CallbackInfo ci) {
        if (selectedTab.getType() != CreativeModeTab.Type.INVENTORY) return;
        if (slot == destroyItemSlot) CreativeEquipmentBridge.send(InventoryAction.TRASH, 0, input == ContainerInput.QUICK_MOVE ? 1 : 0, 0);
        else {
            int target = slot == null ? index : ((CreativeModeInventoryScreen) (Object) this).getMenu().slots.indexOf(slot);
            CreativeEquipmentBridge.send(InventoryAction.CLICK, target, button, input.ordinal());
        }
        ci.cancel();
    }

    @Inject(method = "removed", at = @At("HEAD"))
    private void archeryPlus$close(CallbackInfo ci) {
        if (archeryPlus$session) CreativeEquipmentBridge.end();
        archeryPlus$session = false;
    }
}

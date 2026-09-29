package com.archeryplus.client;

import com.archeryplus.network.InventoryAction;
import com.archeryplus.quiver.QuiverEquipment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

public final class CreativeEquipmentBridge {
    private CreativeEquipmentBridge() {}
    public static boolean active() {
        return Minecraft.getInstance().screen instanceof CreativeModeInventoryScreen screen && screen.isInventoryOpen();
    }

    public static void begin() {
        var mc = Minecraft.getInstance();
        var player = mc.player;
        ItemStack carried = player.inventoryMenu.getCarried();
        if (!carried.isEmpty()) {
            for (int i = 9; i < 45 && !carried.isEmpty(); i++) {
                var slot = player.inventoryMenu.getSlot(i);
                ItemStack remainder = slot.safeInsert(carried);
                mc.gameMode.handleCreativeModeItemAdd(slot.getItem(), i);
                carried = remainder;
            }
            if (!carried.isEmpty()) mc.gameMode.handleCreativeModeItemDrop(carried);
            player.inventoryMenu.setCarried(ItemStack.EMPTY);
        }
        send(InventoryAction.BEGIN, 0, 0, 0);
    }

    public static void end() {
        send(InventoryAction.END, 0, 0, 0);
        var player = Minecraft.getInstance().player;
        if (player != null) player.inventoryMenu.setCarried(ItemStack.EMPTY);
    }

    public static void send(int action, int slot, int button, int input) {
        var player = Minecraft.getInstance().player;
        if (player != null) ClientPacketDistributor.sendToServer(new InventoryAction(action, QuiverEquipment.get(player).revision(), slot, button, input));
    }
}

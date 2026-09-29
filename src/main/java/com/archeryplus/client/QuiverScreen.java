package com.archeryplus.client;

import com.archeryplus.menu.QuiverMenu;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public final class QuiverScreen extends AbstractContainerScreen<QuiverMenu> {
    public QuiverScreen(QuiverMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title, 176, 148);
        inventoryLabelY = 54;
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        super.extractBackground(graphics, mouseX, mouseY, partialTick);
        graphics.fill(leftPos, topPos, leftPos + imageWidth, topPos + imageHeight, 0xFFB9B2A3);
        graphics.fill(leftPos + 3, topPos + 3, leftPos + imageWidth - 3, topPos + imageHeight - 3, 0xFFD5CCBB);
        for (var slot : menu.slots) drawSlot(graphics, leftPos + slot.x, topPos + slot.y);
    }

    public static void drawSlot(GuiGraphicsExtractor graphics, int x, int y) {
        graphics.fill(x - 1, y - 1, x + 17, y + 17, 0xFFEEE8DB);
        graphics.fill(x - 1, y - 1, x + 16, y + 16, 0xFF45433E);
        graphics.fill(x, y, x + 16, y + 16, 0xFF817B70);
    }
}

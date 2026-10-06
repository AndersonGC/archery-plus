package com.archeryplus.client;

import com.archeryplus.menu.QuiverMenu;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import com.archeryplus.ArcheryPlus;

public final class QuiverScreen extends AbstractContainerScreen<QuiverMenu> {
    private static final Identifier BACKGROUND = Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, "textures/gui/quiver.png");
    public QuiverScreen(QuiverMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title, 176, 148);
        inventoryLabelY = 54;
        titleLabelY = 8;
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        super.extractBackground(graphics, mouseX, mouseY, partialTick);
        graphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, leftPos, topPos, 0, 0, imageWidth, imageHeight, 176, 148);
        for (var slot : menu.slots) drawSlot(graphics, leftPos + slot.x, topPos + slot.y);
    }

    public static void drawSlot(GuiGraphicsExtractor graphics, int x, int y) {
        graphics.fill(x - 1, y - 1, x + 17, y + 17, 0xFFEEE8DB);
        graphics.fill(x - 1, y - 1, x + 16, y + 16, 0xFF45433E);
        graphics.fill(x, y, x + 16, y + 16, 0xFF817B70);
    }

    @Override
    protected void extractLabels(GuiGraphicsExtractor graphics, int mouseX, int mouseY) {
        graphics.text(font, title, titleLabelX, titleLabelY, 0xFFE9D4A4, false);
        graphics.text(font, playerInventoryTitle, inventoryLabelX, inventoryLabelY, 0xFF4B3527, false);
    }
}

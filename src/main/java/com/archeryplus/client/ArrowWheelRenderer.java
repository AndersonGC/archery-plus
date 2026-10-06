package com.archeryplus.client;

import com.archeryplus.ArcheryPlus;
import com.archeryplus.quiver.QuiverContents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

/** Four textured leather wedges, with independent, frame-rate-independent hover transitions. */
final class ArrowWheelRenderer {
    static final int INNER_RADIUS = 44;
    private static final float[] HOVER = new float[QuiverContents.SIZE];
    private static final int[] DX = {0, 1, 0, -1}, DY = {-1, 0, 1, 0};
    private static final String[] NUMERALS = {"I", "II", "III", "IV"};
    private static final Identifier[][] SECTORS = new Identifier[4][3];
    private static final Identifier HUB = texture("hub");
    private static long lastFrame;
    static {
        for (int i = 0; i < 4; i++) for (int state = 0; state < 3; state++) SECTORS[i][state] = texture("sector_" + i + "_" + state);
    }
    private ArrowWheelRenderer() {}
    private static Identifier texture(String name) { return Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, "textures/gui/wheel/" + name + ".png"); }

    static float scale(int width, int height) {
        return Math.min(1.0f, Math.min(width / 300.0f, height / 330.0f));
    }

    static void reset() {
        java.util.Arrays.fill(HOVER, 0);
        lastFrame = System.nanoTime();
    }

    static void render(GuiGraphicsExtractor graphics, QuiverContents contents, int pointed) {
        Minecraft mc = Minecraft.getInstance();
        long now = System.nanoTime();
        double dt = Math.min(0.05, Math.max(0, (now - lastFrame) / 1_000_000_000.0));
        lastFrame = now;
        float ease = (float) (1 - Math.exp(-dt / 0.06));
        int cx = graphics.guiWidth() / 2, cy = graphics.guiHeight() / 2;
        graphics.fill(0, 0, graphics.guiWidth(), graphics.guiHeight(), 0x550D0A08);
        graphics.pose().pushMatrix();
        graphics.pose().translate(cx, cy);
        float scale = scale(graphics.guiWidth(), graphics.guiHeight());
        graphics.pose().scale(scale, scale);

        for (int i = 0; i < 4; i++) {
            HOVER[i] += ((pointed == i ? 1 : 0) - HOVER[i]) * ease;
            if (i != pointed) drawSector(graphics, contents, i, pointed);
        }
        // Draw the pointed wedge last, so the enlarged edge and icon stay in front.
        if (pointed >= 0) drawSector(graphics, contents, pointed, pointed);
        graphics.blit(RenderPipelines.GUI_TEXTURED, HUB, -48, -48, 0, 0, 96, 96, 128, 128, 128, 128);

        int preview = pointed >= 0 ? pointed : contents.selected();
        var stack = contents.get(preview);
        if (!stack.isEmpty()) graphics.item(stack, -8, -27);
        else centered(graphics, Component.translatable("gui.archery_plus.empty"),  -22, 0xFFCCAD78);
        centered(graphics, Component.translatable(pointed >= 0 ? "gui.archery_plus.preview" : "gui.archery_plus.selected"), -4, 0xFFECD8AE);
        centered(graphics, Component.literal(stack.getCount() + " / " + QuiverContents.CAPACITY), 10, 0xFFD3B985);
        // The total occupancy bar uses the same denominator as the back model.
        graphics.fill(-25, 26, 25, 29, 0xFF211B16);
        int bar = Math.round(50.0f * contents.totalArrows() / contents.totalCapacity());
        if (bar > 0) graphics.fill(-25, 26, -25 + bar, 29, 0xFFB19A60);

        Component title = stack.isEmpty() ? Component.translatable("gui.archery_plus.empty") : stack.getHoverName();
        int y = 137;
        for (var line : mc.font.split(title, 270)) {
            graphics.text(mc.font, line, -mc.font.width(line) / 2, y, 0xFFFFE8BD);
            y += 10;
        }
        Component hint = Component.translatable("gui.archery_plus.wheel_release", ArcheryControls.SELECT.getTranslatedKeyMessage());
        centered(graphics, hint, -151, 0xFFE7D3AB);
        centered(graphics, Component.translatable(pointed < 0 ? "gui.archery_plus.wheel_cancel" : stack.isEmpty() ? "gui.archery_plus.wheel_unavailable" : "gui.archery_plus.wheel_confirm"), -137, 0xFFBCA17A);
        graphics.pose().popMatrix();
    }

    private static void drawSector(GuiGraphicsExtractor graphics, QuiverContents contents, int i, int pointed) {
        Minecraft mc = Minecraft.getInstance();
        float hover = HOVER[i], growth = 1 + 0.10f * hover;
        boolean empty = contents.get(i).isEmpty();
        int state = pointed == i ? 1 : contents.selected() == i ? 2 : 0;
        graphics.pose().pushMatrix();
        graphics.pose().translate(DX[i] * 5 * hover, DY[i] * 5 * hover);
        graphics.pose().scale(growth, growth);
        graphics.blit(RenderPipelines.GUI_TEXTURED, SECTORS[i][state], -128, -128, 0, 0, 256, 256, 256, 256,
                empty ? 0xBBD0C2AC : 0xFFFFFFFF);
        int x = DX[i] * 78, y = DY[i] * 78;
        graphics.text(mc.font, NUMERALS[i], x - mc.font.width(NUMERALS[i]) / 2, y - 24, 0xFF4B3220, false);
        var stack = contents.get(i);
        if (!stack.isEmpty()) graphics.item(stack, x - 8, y - 10);
        else graphics.text(mc.font, "-", x - 2, y - 4, 0xFF4B3220, false);
        String count = empty ? "0" : Integer.toString(stack.getCount());
        graphics.text(mc.font, count, x - mc.font.width(count) / 2, y + 11, 0xFF3C291D, false);
        if (contents.selected() == i) {
            graphics.fill(x - 8, y + 24, x + 8, y + 26, 0xFF476046);
            graphics.fill(x - 5, y + 24, x + 5, y + 25, 0xFFA4B484);
        }
        graphics.pose().popMatrix();
    }

    private static void centered(GuiGraphicsExtractor graphics, Component text, int y, int color) {
        var font = Minecraft.getInstance().font;
        graphics.text(font, text, -font.width(text) / 2, y, color, false);
    }
}

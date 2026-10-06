package com.archeryplus.client;

import com.archeryplus.ArcheryPlus;
import com.archeryplus.control.WheelMath;
import com.archeryplus.control.ZoomTransition;
import com.archeryplus.network.QuiverRequest;
import com.archeryplus.quiver.QuiverEquipment;
import com.archeryplus.registry.ModRegistries;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.client.event.RegisterGuiLayersEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.neoforged.neoforge.client.event.ViewportEvent;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import org.lwjgl.glfw.GLFW;

public final class ArcheryControls {
    private static final KeyMapping.Category CATEGORY = new KeyMapping.Category(Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, "controls"));
    public static final KeyMapping OPEN = new KeyMapping("key.archery_plus.open_quiver", GLFW.GLFW_KEY_H, CATEGORY);
    public static final KeyMapping SELECT = new KeyMapping("key.archery_plus.select_arrow", GLFW.GLFW_KEY_R, CATEGORY);
    private static final ZoomTransition ZOOM = new ZoomTransition();
    private static boolean wheel, held, blockedUntilRelease;
    private static long revision;
    private static Object world;
    private ArcheryControls() {}
    public static boolean wheelOpen() { return wheel; }

    public static void register(IEventBus modBus, IEventBus gameBus) {
        modBus.addListener((RegisterKeyMappingsEvent event) -> { event.registerCategory(CATEGORY); event.register(OPEN); event.register(SELECT); });
        modBus.addListener((RegisterMenuScreensEvent event) -> event.register(ModRegistries.QUIVER_MENU.get(), QuiverScreen::new));
        modBus.addListener((RegisterGuiLayersEvent event) -> event.registerAboveAll(Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, "arrow_wheel"),
                (graphics, delta) -> renderWheel(graphics)));
        gameBus.addListener(ArcheryControls::tick);
        gameBus.addListener(ArcheryControls::fov);
        gameBus.addListener(ArcheryControls::inventoryBackground);
        gameBus.addListener((InputEvent.Key event) -> {
            if (InputConstants.getKey(event.getKeyEvent()).equals(SELECT.getKey())) acknowledgeKey(event.getAction());
        });
        gameBus.addListener((InputEvent.MouseButton.Post event) -> {
            if (SELECT.getKey().getType() == InputConstants.Type.MOUSE && SELECT.getKey().getValue() == event.getButton()) acknowledgeKey(event.getAction());
        });
        gameBus.addListener((InputEvent.InteractionKeyMappingTriggered event) -> {
            if (wheel) { event.setCanceled(true); event.setSwingHand(false); }
        });
    }

    private static void acknowledgeKey(int action) {
        if (action == GLFW.GLFW_RELEASE || action == GLFW.GLFW_PRESS && Minecraft.getInstance().isWindowActive()) blockedUntilRelease = false;
    }

    private static void tick(ClientTickEvent.Pre event) {
        Minecraft mc = Minecraft.getInstance();
        if (world != mc.level) {
            close(false);
            ZOOM.reset();
            world = mc.level;
            blockedUntilRelease = SELECT.isDown();
        }
        boolean down = SELECT.isDown();
        while (SELECT.consumeClick()) {}
        if (mc.player == null || !mc.player.isAlive() || mc.player.isSpectator() || mc.screen != null || !mc.isWindowActive()) {
            if (wheel || down) blockedUntilRelease = true;
            close(false);
            while (OPEN.consumeClick()) {}
            held = down;
            return;
        }
        var equipment = QuiverEquipment.get(mc.player);
        if (wheel && (!equipment.equipped() || equipment.revision() != revision)) {
            close(false);
            blockedUntilRelease = true;
        }
        while (OPEN.consumeClick()) {
            close(false);
            blockedUntilRelease = down;
            mc.player.stopUsingItem();
            request(QuiverRequest.OPEN, -1);
        }
        if (down && !held && !blockedUntilRelease) {
            if (equipment.equipped()) {
                revision = equipment.revision();
                mc.player.stopUsingItem();
                request(QuiverRequest.WHEEL, -1);
                wheel = true;
                ArrowWheelRenderer.reset();
                mc.mouseHandler.releaseMouse();
            } else request(QuiverRequest.WHEEL, -1);
        }
        if (wheel && !down) close(true);
        held = down;
    }

    private static int pointed(Minecraft mc) {
        var window = mc.getWindow();
        double x = mc.mouseHandler.xpos() * window.getGuiScaledWidth() / window.getScreenWidth() - window.getGuiScaledWidth() / 2.0;
        double y = mc.mouseHandler.ypos() * window.getGuiScaledHeight() / window.getScreenHeight() - window.getGuiScaledHeight() / 2.0;
        return WheelMath.sector(x, y, ArrowWheelRenderer.INNER_RADIUS * ArrowWheelRenderer.scale(window.getGuiScaledWidth(), window.getGuiScaledHeight()));
    }

    private static void close(boolean confirm) {
        if (!wheel) return;
        Minecraft mc = Minecraft.getInstance();
        if (confirm && mc.player != null) {
            var equipment = QuiverEquipment.get(mc.player);
            int index = pointed(mc);
            if (equipment.revision() == revision && index >= 0 && !equipment.contents().get(index).isEmpty()) {
                ClientPacketDistributor.sendToServer(new QuiverRequest(QuiverRequest.SELECT, revision, index));
            }
        }
        wheel = false;
        if (mc.player != null && mc.screen == null && mc.isWindowActive()) mc.mouseHandler.grabMouse();
    }

    private static void request(int action, int index) {
        var player = Minecraft.getInstance().player;
        if (player != null) ClientPacketDistributor.sendToServer(new QuiverRequest(action, QuiverEquipment.get(player).revision(), index));
    }

    private static void fov(ViewportEvent.ComputeFov event) {
        Minecraft mc = Minecraft.getInstance();
        if (world != mc.level) ZOOM.reset();
        boolean aiming = mc.player != null && mc.player.isAlive() && mc.screen == null && mc.isWindowActive() && !wheel
                && mc.player.isUsingItem() && mc.player.getUseItem().is(ModRegistries.LONGBOW.get());
        float factor = ZOOM.value(aiming, System.nanoTime());
        if (event.usedConfiguredFov()) event.setFOV(event.getFOV() * factor);
    }

    private static void inventoryBackground(ScreenEvent.Render.Background event) {
        var screen = event.getScreen();
        if (screen instanceof InventoryScreen inventory) {
            QuiverScreen.drawSlot(event.getGuiGraphics(), inventory.getLeftPos() + 77, inventory.getTopPos() + 44);
        } else if (screen instanceof CreativeModeInventoryScreen creative && creative.isInventoryOpen()) {
            QuiverScreen.drawSlot(event.getGuiGraphics(), creative.getLeftPos() + 35, creative.getTopPos() + 2);
        }
    }

    private static void renderWheel(GuiGraphicsExtractor graphics) {
        Minecraft mc = Minecraft.getInstance();
        if (!wheel || mc.player == null || mc.screen != null || !mc.isWindowActive()) return;
        ArrowWheelRenderer.render(graphics, QuiverEquipment.get(mc.player).contents(), pointed(mc));
    }
}

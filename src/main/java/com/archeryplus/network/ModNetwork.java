package com.archeryplus.network;

import com.archeryplus.menu.QuiverMenu;
import com.archeryplus.combat.BowCombat;
import com.archeryplus.quiver.QuiverEquipment;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public final class ModNetwork {
    private static final Set<UUID> CREATIVE_SESSIONS = new HashSet<>();
    private ModNetwork() {}
    public static boolean creativeSession(ServerPlayer player) { return CREATIVE_SESSIONS.contains(player.getUUID()); }
    public static void clear(ServerPlayer player) { CREATIVE_SESSIONS.remove(player.getUUID()); }

    public static void register(RegisterPayloadHandlersEvent event) {
        var registrar = event.registrar("1");
        registrar.playToServer(QuiverRequest.TYPE, QuiverRequest.STREAM_CODEC, ModNetwork::quiver);
        registrar.playToServer(InventoryAction.TYPE, InventoryAction.STREAM_CODEC, ModNetwork::inventory);
    }

    public static void quiver(QuiverRequest request, IPayloadContext context) {
        if (context.player() instanceof ServerPlayer player) handleQuiver(player, request);
    }

    public static void handleQuiver(ServerPlayer player, QuiverRequest request) {
        QuiverEquipment equipment = QuiverEquipment.get(player);
        if (!player.isAlive() || player.isSpectator() || player.containerMenu != player.inventoryMenu) return;
        if (request.action() == QuiverRequest.WHEEL) BowCombat.cancel(player);
        if (!equipment.equipped()) {
            player.sendOverlayMessage(Component.translatable("message.archery_plus.no_quiver"));
            equipment.changed(player);
            return;
        }
        if (request.revision() != equipment.revision()) { equipment.changed(player); return; }
        switch (request.action()) {
            case QuiverRequest.OPEN -> {
                BowCombat.cancel(player);
                player.openMenu(new SimpleMenuProvider((id, inventory, owner) -> new QuiverMenu(id, inventory, equipment.revision()),
                        Component.translatable("container.archery_plus.quiver")), buf -> buf.writeLong(equipment.revision()));
            }
            case QuiverRequest.WHEEL -> BowCombat.cancel(player);
            case QuiverRequest.SELECT -> equipment.select(player, request.revision(), request.index());
            default -> equipment.changed(player);
        }
    }

    private static void inventory(InventoryAction action, IPayloadContext context) {
        if (context.player() instanceof ServerPlayer player) handleInventory(player, action);
    }

    public static void handleInventory(ServerPlayer player, InventoryAction action) {
        if (action.action() == InventoryAction.END) {
            if (creativeSession(player) && player.containerMenu == player.inventoryMenu) {
                player.inventoryMenu.removed(player);
                player.inventoryMenu.broadcastFullState();
            }
            clear(player);
            return;
        }
        if (!player.isCreative() || !player.isAlive()
                || player.containerMenu != player.inventoryMenu) return;
        var menu = player.inventoryMenu;
        var equipment = QuiverEquipment.get(player);
        if (action.action() == InventoryAction.BEGIN) CREATIVE_SESSIONS.add(player.getUUID());
        else if (creativeSession(player) && equipment.revision() == action.revision()) {
            if (action.action() == InventoryAction.TRASH) {
                if (action.button() == 1) {
                    for (var slot : menu.slots) slot.setByPlayer(ItemStack.EMPTY);
                }
                menu.setCarried(ItemStack.EMPTY);
            } else if (action.action() == InventoryAction.CLICK && action.input() >= 0 && action.input() < ContainerInput.values().length
                    && (action.slot() == -999 || action.slot() >= 0 && action.slot() < menu.slots.size())
                    && validButton(action)) {
                menu.clicked(action.slot(), action.button(), ContainerInput.values()[action.input()], player);
            }
        }
        equipment.changed(player);
        menu.broadcastFullState();
    }

    private static boolean validButton(InventoryAction action) {
        return switch (ContainerInput.values()[action.input()]) {
            case PICKUP, QUICK_MOVE, THROW, PICKUP_ALL -> action.button() == 0 || action.button() == 1;
            case CLONE -> action.button() == 2;
            case SWAP -> action.button() >= 0 && action.button() <= 8 || action.button() == 40;
            case QUICK_CRAFT -> action.button() >= 0 && action.button() <= 10 && (action.button() & 3) <= 2
                    && ((action.button() & 3) != 1 || action.slot() >= 0);
        };
    }
}

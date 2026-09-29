package com.archeryplus.network;

import com.archeryplus.ArcheryPlus;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record InventoryAction(int action, long revision, int slot, int button, int input) implements CustomPacketPayload {
    public static final int BEGIN = 0, CLICK = 1, TRASH = 2, END = 3;
    public static final Type<InventoryAction> TYPE = new Type<>(Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, "inventory_action"));
    public static final StreamCodec<RegistryFriendlyByteBuf, InventoryAction> STREAM_CODEC = StreamCodec.of(
            (buf, value) -> { buf.writeVarInt(value.action); buf.writeLong(value.revision); buf.writeInt(value.slot); buf.writeInt(value.button); buf.writeInt(value.input); },
            buf -> new InventoryAction(buf.readVarInt(), buf.readLong(), buf.readInt(), buf.readInt(), buf.readInt()));
    @Override public Type<InventoryAction> type() { return TYPE; }
}

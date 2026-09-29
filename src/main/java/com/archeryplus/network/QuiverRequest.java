package com.archeryplus.network;

import com.archeryplus.ArcheryPlus;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record QuiverRequest(int action, long revision, int index) implements CustomPacketPayload {
    public static final int OPEN = 0, WHEEL = 1, SELECT = 2;
    public static final Type<QuiverRequest> TYPE = new Type<>(Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, "quiver_request"));
    public static final StreamCodec<RegistryFriendlyByteBuf, QuiverRequest> STREAM_CODEC = StreamCodec.of(
            (buf, value) -> { buf.writeVarInt(value.action); buf.writeLong(value.revision); buf.writeVarInt(value.index); },
            buf -> new QuiverRequest(buf.readVarInt(), buf.readLong(), buf.readVarInt()));
    @Override public Type<QuiverRequest> type() { return TYPE; }
}

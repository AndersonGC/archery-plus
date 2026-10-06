package com.archeryplus.quiver;

import com.archeryplus.item.QuiverItem;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

/** Public cosmetic snapshot. Inventory contents and selection remain owner-only. */
public record QuiverAppearance(int material, int arrows) {
    public static final QuiverAppearance NONE = new QuiverAppearance(-1, 0);
    public static final StreamCodec<RegistryFriendlyByteBuf, QuiverAppearance> STREAM_CODEC = StreamCodec.of(
            (buf, value) -> { buf.writeByte(value.material); buf.writeByte(value.arrows); },
            buf -> new QuiverAppearance(buf.readByte(), buf.readUnsignedByte()));

    public QuiverAppearance {
        if (material < -1 || material >= QuiverItem.Material.values().length || arrows != 0 && arrows != 4 && arrows != 8) {
            throw new IllegalArgumentException("Invalid quiver appearance");
        }
    }

    public static QuiverAppearance of(QuiverEquipment equipment) {
        return equipment.equipped()
                ? new QuiverAppearance(((QuiverItem) equipment.stack().getItem()).material().ordinal(), equipment.contents().visibleArrows())
                : NONE;
    }
}

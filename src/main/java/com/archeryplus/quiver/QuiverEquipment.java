package com.archeryplus.quiver;

import com.archeryplus.registry.ModRegistries;
import com.archeryplus.item.QuiverItem;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public final class QuiverEquipment {
    private static final AtomicLong NEXT_REVISION = new AtomicLong(System.currentTimeMillis());
    public static final MapCodec<QuiverEquipment> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            ItemStack.OPTIONAL_CODEC.fieldOf("quiver").forGetter(QuiverEquipment::stack),
            Codec.LONG.optionalFieldOf("revision", 0L).forGetter(QuiverEquipment::revision)
    ).apply(instance, QuiverEquipment::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, QuiverEquipment> STREAM_CODEC = ByteBufCodecs.fromCodecWithRegistries(CODEC.codec());
    private ItemStack stack;
    private long revision;

    public QuiverEquipment() { this(ItemStack.EMPTY, NEXT_REVISION.incrementAndGet()); }

    public QuiverEquipment(ItemStack stack, long revision) {
        if (!stack.isEmpty() && (!isQuiver(stack) || stack.getCount() != 1)) {
            throw new IllegalArgumentException("Invalid equipped quiver");
        }
        this.stack = stack.copy();
        this.revision = revision;
    }

    public static QuiverEquipment get(Player player) { return player.getData(ModRegistries.EQUIPMENT); }
    public ItemStack stack() { return stack; }
    public long revision() { return revision; }
    public static boolean isQuiver(ItemStack stack) { return stack.getItem() instanceof QuiverItem; }
    public boolean equipped() { return !stack.isEmpty() && isQuiver(stack); }
    public QuiverContents contents() { return stack.getOrDefault(ModRegistries.QUIVER_CONTENTS, QuiverContents.EMPTY); }

    public void equip(Player player, ItemStack value) {
        if (!value.isEmpty() && (!isQuiver(value) || value.getCount() != 1)) return;
        stack = value;
        renew(player);
    }

    public void renew(Player player) {
        if (!player.level().isClientSide()) revision = NEXT_REVISION.incrementAndGet();
        changed(player);
    }

    public void contents(Player player, QuiverContents value) {
        if (!equipped()) return;
        stack.set(ModRegistries.QUIVER_CONTENTS, value);
        changed(player);
    }

    public void changed(Player player) {
        if (!player.level().isClientSide()) {
            player.syncData(ModRegistries.EQUIPMENT);
            QuiverAppearance appearance = QuiverAppearance.of(this);
            if (!appearance.equals(player.getData(ModRegistries.APPEARANCE))) player.setData(ModRegistries.APPEARANCE, appearance);
        }
    }

    public boolean select(Player player, long expected, int index) {
        if (!equipped() || expected != revision || index < 0 || index >= QuiverContents.SIZE || contents().get(index).isEmpty()) {
            changed(player);
            return false;
        }
        contents(player, contents().select(index));
        return true;
    }
}

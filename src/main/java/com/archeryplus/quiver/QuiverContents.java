package com.archeryplus.quiver;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class QuiverContents {
    public static final int SIZE = 4;
    public static final int CAPACITY = 64;
    public static final QuiverContents EMPTY = new QuiverContents(List.of(ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY), 0);
    private static final Codec<List<ItemStack>> SLOTS_CODEC = ItemStack.OPTIONAL_CODEC.listOf().validate(stacks ->
            stacks.size() == SIZE && stacks.stream().allMatch(QuiverContents::validStack)
                    ? DataResult.success(stacks) : DataResult.error(() -> "Quiver requires four valid stacks, each at most 64 arrows"));
    public static final Codec<QuiverContents> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            SLOTS_CODEC.fieldOf("slots").forGetter(QuiverContents::stacks),
            Codec.intRange(0, SIZE - 1).fieldOf("selected").forGetter(QuiverContents::selected)
    ).apply(instance, QuiverContents::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, QuiverContents> STREAM_CODEC = ByteBufCodecs.fromCodecWithRegistries(CODEC);
    private final List<ItemStack> slots;
    private final int selected;

    public QuiverContents(List<ItemStack> slots, int selected) {
        if (slots.size() != SIZE || selected < 0 || selected >= SIZE || !slots.stream().allMatch(QuiverContents::validStack)) {
            throw new IllegalArgumentException("Invalid quiver contents");
        }
        this.slots = slots.stream().map(ItemStack::copy).toList();
        this.selected = selected;
    }

    public static boolean accepts(ItemStack stack) {
        return stack.is(Items.ARROW) || stack.is(Items.SPECTRAL_ARROW) || stack.is(Items.TIPPED_ARROW);
    }

    public static boolean validStack(ItemStack stack) {
        return stack.isEmpty() || accepts(stack) && stack.getCount() > 0 && stack.getCount() <= CAPACITY;
    }

    public int selected() { return selected; }
    public ItemStack get(int index) { return slots.get(index).copy(); }
    public List<ItemStack> stacks() { return slots.stream().map(ItemStack::copy).toList(); }

    public QuiverContents with(int index, ItemStack stack) {
        List<ItemStack> updated = new ArrayList<>(slots);
        updated.set(index, stack);
        return new QuiverContents(updated, selected);
    }

    public QuiverContents select(int index) {
        return new QuiverContents(slots, index);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof QuiverContents contents) || selected != contents.selected) return false;
        for (int i = 0; i < SIZE; i++) if (!ItemStack.matches(slots.get(i), contents.slots.get(i))) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = selected;
        for (ItemStack stack : slots) hash = 31 * hash + ItemStack.hashItemAndComponents(stack) * 31 + stack.getCount();
        return hash;
    }
}

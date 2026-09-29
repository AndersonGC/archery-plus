package com.archeryplus.menu;

import com.archeryplus.quiver.QuiverContents;
import com.archeryplus.quiver.QuiverEquipment;
import com.archeryplus.registry.ModRegistries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public final class QuiverMenu extends AbstractContainerMenu {
    private final Player owner;
    private final long revision;
    private final SimpleContainer arrows;
    private boolean ready;

    public QuiverMenu(int id, Inventory inventory, RegistryFriendlyByteBuf data) {
        this(id, inventory, data.readLong());
    }

    public QuiverMenu(int id, Inventory inventory, long revision) {
        super(ModRegistries.QUIVER_MENU.get(), id);
        this.owner = inventory.player;
        this.revision = revision;
        this.arrows = new SimpleContainer(QuiverContents.SIZE) {
            @Override public void setChanged() {
                if (ready && !owner.level().isClientSide() && QuiverMenu.this.stillValid(owner)) {
                    QuiverEquipment equipped = QuiverEquipment.get(owner);
                    equipped.contents(owner, new QuiverContents(getItems(), equipped.contents().selected()));
                }
            }
        };
        QuiverContents contents = QuiverEquipment.get(owner).contents();
        for (int i = 0; i < QuiverContents.SIZE; i++) {
            arrows.setItem(i, contents.get(i));
            addSlot(new Slot(arrows, i, 53 + i * 18, 24) {
                @Override public boolean mayPlace(ItemStack stack) { return QuiverContents.accepts(stack); }
                @Override public int getMaxStackSize() { return QuiverContents.CAPACITY; }
            });
        }
        ready = true;
        addStandardInventorySlots(inventory, 8, 66);
    }

    @Override
    public boolean stillValid(Player player) {
        QuiverEquipment equipment = QuiverEquipment.get(player);
        return player == owner && player.isAlive() && equipment.equipped() && equipment.revision() == revision;
    }

    @Override
    public void clicked(int slot, int button, ContainerInput input, Player player) {
        if (stillValid(player)) super.clicked(slot, button, input, player);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        if (!stillValid(player) || index < 0 || index >= slots.size()) return ItemStack.EMPTY;
        Slot slot = slots.get(index);
        if (!slot.hasItem()) return ItemStack.EMPTY;
        ItemStack stack = slot.getItem();
        ItemStack original = stack.copy();
        if (index < 4) {
            if (!moveItemStackTo(stack, 4, slots.size(), true)) return ItemStack.EMPTY;
        } else if (!QuiverContents.accepts(stack) || !moveItemStackTo(stack, 0, 4, false)) {
            return ItemStack.EMPTY;
        }
        if (stack.isEmpty()) slot.setByPlayer(ItemStack.EMPTY); else slot.setChanged();
        slot.onTake(player, stack);
        return original;
    }
}

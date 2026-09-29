package com.archeryplus.registry;

import com.archeryplus.ArcheryPlus;
import com.archeryplus.item.ArcheryBowItem;
import com.archeryplus.item.BowStats;
import com.archeryplus.quiver.QuiverContents;
import com.archeryplus.quiver.QuiverEquipment;
import com.archeryplus.menu.QuiverMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.minecraft.core.component.DataComponentType;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModRegistries {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcheryPlus.MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArcheryPlus.MODID);
    public static final DeferredRegister<DataComponentType<?>> COMPONENTS = DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, ArcheryPlus.MODID);
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENTS = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, ArcheryPlus.MODID);
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, ArcheryPlus.MODID);
    public static final DeferredHolder<MenuType<?>, MenuType<QuiverMenu>> QUIVER_MENU = MENUS.register("quiver", () -> IMenuTypeExtension.create(QuiverMenu::new));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<QuiverContents>> QUIVER_CONTENTS = COMPONENTS.register("quiver_contents",
            () -> DataComponentType.<QuiverContents>builder().persistent(QuiverContents.CODEC).networkSynchronized(QuiverContents.STREAM_CODEC).build());
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<QuiverEquipment>> EQUIPMENT = ATTACHMENTS.register("quiver_equipment",
            () -> AttachmentType.builder(QuiverEquipment::new).serialize(QuiverEquipment.CODEC)
                    .sync((holder, player) -> holder == player, QuiverEquipment.STREAM_CODEC).build());

    public static final DeferredItem<ArcheryBowItem> RECURVE_BOW = bow("recurve_bow", BowStats.RECURVE);
    public static final DeferredItem<ArcheryBowItem> LONGBOW = bow("longbow", BowStats.LONG);
    public static final DeferredItem<Item> IRON_QUIVER = ITEMS.registerSimpleItem("iron_quiver",
            p -> p.stacksTo(1).component(QUIVER_CONTENTS.get(), QuiverContents.EMPTY));
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("archery",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.archery_plus"))
                    .withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> RECURVE_BOW.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(RECURVE_BOW.get());
                        output.accept(LONGBOW.get());
                        output.accept(IRON_QUIVER.get());
                    }).build());

    private static DeferredItem<ArcheryBowItem> bow(String name, BowStats stats) {
        return ITEMS.registerItem(name, p -> new ArcheryBowItem(p, stats),
                p -> p.durability(stats.durability()).enchantable(1).repairable(ItemTags.PLANKS));
    }

    private ModRegistries() {
    }

    public static void register(IEventBus modEventBus) {
        COMPONENTS.register(modEventBus);
        ATTACHMENTS.register(modEventBus);
        MENUS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}

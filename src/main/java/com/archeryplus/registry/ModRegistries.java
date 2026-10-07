package com.archeryplus.registry;

import com.archeryplus.ArcheryPlus;
import com.archeryplus.block.ArcheryWorkbenchBlock;
import com.mojang.serialization.MapCodec;
import com.archeryplus.item.ArcheryBowItem;
import com.archeryplus.item.BowStats;
import com.archeryplus.item.QuiverItem;
import com.archeryplus.quiver.QuiverContents;
import com.archeryplus.quiver.QuiverEquipment;
import com.archeryplus.quiver.QuiverAppearance;
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
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModRegistries {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ArcheryPlus.MODID);
    public static final DeferredRegister<MapCodec<? extends Block>> BLOCK_TYPES =
            DeferredRegister.create(Registries.BLOCK_TYPE, ArcheryPlus.MODID);
    public static final DeferredHolder<MapCodec<? extends Block>, MapCodec<ArcheryWorkbenchBlock>> WORKBENCH_TYPE =
            BLOCK_TYPES.register("archery_workbench", () -> ArcheryWorkbenchBlock.CODEC);
    public static final DeferredBlock<ArcheryWorkbenchBlock> ARCHERY_WORKBENCH = BLOCKS.registerBlock("archery_workbench",
            ArcheryWorkbenchBlock::new, p -> p.mapColor(MapColor.COLOR_BROWN).strength(2.5f).sound(SoundType.WOOD)
                    .noOcclusion().pushReaction(PushReaction.BLOCK));
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArcheryPlus.MODID);
    public static final DeferredItem<BlockItem> ARCHERY_WORKBENCH_ITEM = ITEMS.registerSimpleBlockItem(ARCHERY_WORKBENCH);
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
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<QuiverAppearance>> APPEARANCE = ATTACHMENTS.register("quiver_appearance",
            () -> AttachmentType.builder(() -> QuiverAppearance.NONE).sync(QuiverAppearance.STREAM_CODEC).build());

    public static final DeferredItem<ArcheryBowItem> RECURVE_BOW = bow("recurve_bow", BowStats.RECURVE);
    public static final DeferredItem<ArcheryBowItem> LONGBOW = bow("longbow", BowStats.LONG);
    public static final DeferredItem<QuiverItem> LEATHER_QUIVER = quiver(QuiverItem.Material.LEATHER);
    public static final DeferredItem<QuiverItem> IRON_QUIVER = quiver(QuiverItem.Material.IRON);
    public static final DeferredItem<QuiverItem> GOLD_QUIVER = quiver(QuiverItem.Material.GOLD);
    public static final DeferredItem<QuiverItem> DIAMOND_QUIVER = quiver(QuiverItem.Material.DIAMOND);
    public static final DeferredItem<QuiverItem> NETHERITE_QUIVER = quiver(QuiverItem.Material.NETHERITE);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("archery",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.archery_plus"))
                    .withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> RECURVE_BOW.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(RECURVE_BOW.get());
                        output.accept(LONGBOW.get());
                        output.accept(LEATHER_QUIVER.get());
                        output.accept(IRON_QUIVER.get());
                        output.accept(GOLD_QUIVER.get());
                        output.accept(DIAMOND_QUIVER.get());
                        output.accept(NETHERITE_QUIVER.get());
                        output.accept(ARCHERY_WORKBENCH_ITEM.get());
                    }).build());

    private static DeferredItem<ArcheryBowItem> bow(String name, BowStats stats) {
        return ITEMS.registerItem(name, p -> new ArcheryBowItem(p, stats),
                p -> p.durability(stats.durability()).enchantable(1).repairable(ItemTags.PLANKS));
    }

    private static DeferredItem<QuiverItem> quiver(QuiverItem.Material material) {
        return ITEMS.registerItem(material.id() + "_quiver", p -> new QuiverItem(p, material), p -> {
            p.stacksTo(1).component(QUIVER_CONTENTS.get(), QuiverContents.EMPTY);
            if (material == QuiverItem.Material.NETHERITE) p.fireResistant();
            return p;
        });
    }

    private ModRegistries() {
    }

    public static void register(IEventBus modEventBus) {
        BLOCK_TYPES.register(modEventBus);
        BLOCKS.register(modEventBus);
        COMPONENTS.register(modEventBus);
        ATTACHMENTS.register(modEventBus);
        MENUS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}

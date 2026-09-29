package com.archeryplus.gametest;

import com.archeryplus.ArcheryPlus;
import com.archeryplus.control.WheelMath;
import com.archeryplus.control.ZoomTransition;
import com.archeryplus.combat.BowCombat;
import com.archeryplus.menu.QuiverMenu;
import com.archeryplus.network.ModNetwork;
import com.archeryplus.network.InventoryAction;
import com.archeryplus.network.QuiverRequest;
import com.archeryplus.quiver.QuiverContents;
import com.archeryplus.quiver.QuiverEquipment;
import com.archeryplus.registry.ModRegistries;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.JsonOps;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.gametest.framework.FunctionGameTestInstance;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.gametest.framework.TestData;
import net.minecraft.gametest.framework.TestEnvironmentDefinition;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.gamerules.GameRules;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.event.RegisterGameTestsEvent;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ArcheryGameTests {
    private static final DeferredRegister<Consumer<GameTestHelper>> FUNCTIONS = DeferredRegister.create(Registries.TEST_FUNCTION, ArcheryPlus.MODID);
    private static final List<String> NAMES = new ArrayList<>();
    private ArcheryGameTests() {}

    public static void register(IEventBus bus) {
        test("storage_and_codecs", ArcheryGameTests::storage);
        test("transfers_and_stale_menu", ArcheryGameTests::transfers);
        test("equipment_lifecycle", ArcheryGameTests::lifecycle);
        test("selection_and_cancel", ArcheryGameTests::selection);
        test("controls_math", ArcheryGameTests::controls);
        test("recipes_and_enchantability", ArcheryGameTests::recipes);
        test("creative_inventory_transactions", ArcheryGameTests::creativeInventory);
        test("drag_and_potion_transfers", ArcheryGameTests::drag);
        test("effects_and_enchantments", ArcheryGameTests::effects);
        for (String bow : List.of("vanilla", "recurve", "longbow")) {
            test(bow + "_shots", helper -> shots(helper, bow));
            for (String ammo : List.of("normal", "spectral", "potion")) test(bow + "_infinity_" + ammo, helper -> infinity(helper, bow, ammo));
        }
        test("creative_and_crossbows", ArcheryGameTests::creativeAndCrossbows);
        test("balance_measurements", ArcheryGameTests::measurements);
        FUNCTIONS.register(bus);
        bus.addListener(ArcheryGameTests::instances);
    }

    private static void test(String name, Consumer<GameTestHelper> test) { NAMES.add(name); FUNCTIONS.register(name, () -> test); }
    private static Identifier id(String path) { return Identifier.fromNamespaceAndPath(ArcheryPlus.MODID, path); }
    private static void instances(RegisterGameTestsEvent event) {
        Holder<TestEnvironmentDefinition<?>> environment = event.registerEnvironment(id("tests"), new TestEnvironmentDefinition.AllOf(List.of()));
        for (String name : NAMES) event.registerTest(id(name), new FunctionGameTestInstance(ResourceKey.create(Registries.TEST_FUNCTION, id(name)),
                new TestData<>(environment, id("empty"), 200, 0, true)));
    }

    private static FakePlayer player(GameTestHelper helper) {
        FakePlayer player = new FakePlayer(helper.getLevel(), new GameProfile(UUID.randomUUID(), "archery-test"));
        player.setGameMode(GameType.SURVIVAL);
        BlockPos pos = helper.absolutePos(new BlockPos(3, 2, 3));
        player.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
        return player;
    }

    private static ItemStack potion() {
        return PotionContents.createItemStack(Items.TIPPED_ARROW, Potions.POISON);
    }

    private static void equip(ServerPlayer player, ItemStack ammo) {
        var equipment = QuiverEquipment.get(player);
        equipment.equip(player, new ItemStack(ModRegistries.IRON_QUIVER.get()));
        equipment.contents(player, QuiverContents.EMPTY.with(0, ammo));
    }

    private static Item bow(String name) {
        return switch (name) { case "recurve" -> ModRegistries.RECURVE_BOW.get(); case "longbow" -> ModRegistries.LONGBOW.get(); default -> Items.BOW; };
    }

    private static List<AbstractArrow> arrows(GameTestHelper helper, ServerPlayer player) {
        return helper.getLevel().getEntitiesOfClass(AbstractArrow.class, player.getBoundingBox().inflate(8), arrow -> arrow.getOwner() == player);
    }

    private static void release(ServerPlayer player, ItemStack bow, int ticks) {
        bow.getItem().releaseUsing(bow, player.level(), player, bow.getUseDuration(player) - ticks);
        player.stopUsingItem();
    }

    private static void fire(ServerPlayer player, ItemStack bow, int ticks) {
        player.setItemInHand(InteractionHand.MAIN_HAND, bow);
        bow.getItem().use(player.level(), player, InteractionHand.MAIN_HAND);
        release(player, bow, ticks);
    }

    private static void storage(GameTestHelper helper) {
        var normal = new ItemStack(Items.ARROW, 64);
        var poison = potion();
        var healing = PotionContents.createItemStack(Items.TIPPED_ARROW, Potions.HEALING);
        var contents = new QuiverContents(List.of(normal, normal, poison, healing), 3);
        normal.setCount(1);
        helper.assertTrue(contents.get(0).getCount() == 64, "constructor must copy stacks");
        contents.get(0).setCount(2);
        helper.assertTrue(contents.get(0).getCount() == 64, "accessor must copy stacks");
        helper.assertTrue(!ItemStack.isSameItemSameComponents(contents.get(2), contents.get(3)), "potion components must differ");
        var ops = RegistryOps.create(JsonOps.INSTANCE, helper.getLevel().registryAccess());
        var encoded = QuiverContents.CODEC.encodeStart(ops, contents).getOrThrow();
        helper.assertTrue(contents.equals(QuiverContents.CODEC.parse(ops, encoded).getOrThrow()), "codec roundtrip");
        ItemStack quiver = new ItemStack(ModRegistries.IRON_QUIVER.get());
        quiver.set(ModRegistries.QUIVER_CONTENTS, contents);
        var decoded = ItemStack.CODEC.parse(ops, ItemStack.CODEC.encodeStart(ops, quiver).getOrThrow()).getOrThrow();
        helper.assertTrue(contents.equals(decoded.get(ModRegistries.QUIVER_CONTENTS)), "item roundtrip carries all contents");
        for (ItemStack invalid : List.of(new ItemStack(Items.ARROW, 65), new ItemStack(Items.STONE), quiver)) {
            boolean rejected = false;
            try { contents.with(0, invalid); } catch (IllegalArgumentException expected) { rejected = true; }
            helper.assertTrue(rejected, "invalid compartment accepted");
        }
        var invalidJson = encoded.deepCopy();
        invalidJson.getAsJsonObject().addProperty("selected", 4);
        helper.assertTrue(QuiverContents.CODEC.parse(ops, invalidJson).isError(), "codec must reject invalid index");
        helper.succeed();
    }

    private static void transfers(GameTestHelper helper) {
        var player = player(helper);
        equip(player, new ItemStack(Items.ARROW, 60));
        var equipment = QuiverEquipment.get(player);
        var menu = new QuiverMenu(1, player.getInventory(), equipment.revision());
        player.getInventory().setItem(9, new ItemStack(Items.ARROW, 10));
        menu.quickMoveStack(player, 4);
        helper.assertTrue(menu.getSlot(0).getItem().getCount() == 64 && menu.getSlot(1).getItem().getCount() == 6, "merge before empty");
        helper.assertTrue(equipment.contents().get(0).getCount() == 64 && equipment.contents().get(1).getCount() == 6, "menu must persist mutations");
        for (int i = 0; i < 36; i++) player.getInventory().setItem(i, new ItemStack(Items.STONE, 64));
        menu.quickMoveStack(player, 0);
        helper.assertTrue(menu.getSlot(0).getItem().getCount() == 64, "full inventory must conserve source");
        menu.clicked(0, 1, ContainerInput.PICKUP, player);
        helper.assertTrue(menu.getCarried().getCount() == 32 && equipment.contents().get(0).getCount() == 32, "right click splits stack");
        long revision = equipment.revision();
        equipment.equip(player, new ItemStack(ModRegistries.IRON_QUIVER.get()));
        helper.assertTrue(equipment.revision() != revision && !menu.stillValid(player), "replacement invalidates menu");
        menu.clicked(1, 0, ContainerInput.PICKUP, player);
        helper.assertTrue(equipment.contents().get(1).isEmpty() && menu.getCarried().getCount() == 32, "stale request rejected");
        player.getInventory().setItem(9, ItemStack.EMPTY);
        menu.removed(player);
        helper.assertTrue(menu.getCarried().isEmpty() && player.getInventory().countItem(Items.ARROW) == 32, "cursor safely returned");
        helper.succeed();
    }

    private static void lifecycle(GameTestHelper helper) {
        var player = player(helper);
        equip(player, potion());
        var equipment = QuiverEquipment.get(player);
        equipment.contents(player, equipment.contents().with(3, new ItemStack(Items.SPECTRAL_ARROW, 17)).select(3));
        var ops = RegistryOps.create(JsonOps.INSTANCE, player.registryAccess());
        var saved = QuiverEquipment.CODEC.codec().encodeStart(ops, equipment).getOrThrow();
        var restored = QuiverEquipment.CODEC.codec().parse(ops, saved).getOrThrow();
        helper.assertTrue(restored.contents().equals(equipment.contents()), "equipment save/reload");
        var clone = player(helper);
        clone.copyAttachmentsFrom(player, false);
        helper.assertTrue(QuiverEquipment.get(clone).contents().equals(equipment.contents()), "non-death clone preserves equipment");
        var rules = helper.getLevel().getGameRules();
        boolean original = rules.get(GameRules.KEEP_INVENTORY);
        try {
            rules.set(GameRules.KEEP_INVENTORY, false, helper.getLevel().getServer());
            var drops = new ArrayList<ItemEntity>();
            NeoForge.EVENT_BUS.post(new LivingDropsEvent(player, player.damageSources().generic(), drops, false));
            helper.assertTrue(drops.size() == 1 && !equipment.equipped(), "death creates exactly one equipped drop");
            helper.assertTrue(drops.getFirst().getItem().get(ModRegistries.QUIVER_CONTENTS).equals(restored.contents()), "drop contents intact");
            equipment.equip(player, drops.getFirst().getItem());
            rules.set(GameRules.KEEP_INVENTORY, true, helper.getLevel().getServer());
            drops.clear();
            NeoForge.EVENT_BUS.post(new LivingDropsEvent(player, player.damageSources().generic(), drops, false));
            helper.assertTrue(drops.isEmpty() && equipment.equipped(), "keep inventory creates no drop");
            var respawn = player(helper);
            NeoForge.EVENT_BUS.post(new PlayerEvent.Clone(respawn, player, true));
            helper.assertTrue(QuiverEquipment.get(respawn).contents().equals(equipment.contents()), "keep inventory clone");
        } finally { rules.set(GameRules.KEEP_INVENTORY, original, helper.getLevel().getServer()); }
        helper.succeed();
    }

    private static void shots(GameTestHelper helper, String name) {
        var player = player(helper);
        var bow = new ItemStack(bow(name));
        var stats = BowCombat.stats(bow);
        player.getInventory().setItem(9, new ItemStack(Items.ARROW, 64));
        player.setItemInHand(InteractionHand.OFF_HAND, new ItemStack(Items.ARROW));
        fire(player, bow, stats.drawTicks());
        helper.assertTrue(arrows(helper, player).isEmpty() && bow.getDamageValue() == 0, "loose inventory/offhand ammo must not authorize");
        equip(player, new ItemStack(Items.ARROW));
        var equipment = QuiverEquipment.get(player);
        equipment.contents(player, equipment.contents().with(1, new ItemStack(Items.ARROW, 4)));
        fire(player, bow, 1);
        helper.assertTrue(arrows(helper, player).isEmpty() && equipment.contents().get(0).getCount() == 1, "under minimum charge consumes nothing");
        fire(player, bow, stats.drawTicks());
        helper.assertTrue(arrows(helper, player).size() == 1 && bow.getDamageValue() == 1, "one projectile and one durability");
        helper.assertTrue(equipment.contents().get(0).isEmpty() && equipment.contents().selected() == 0, "last arrow does not auto-switch");
        var arrow = arrows(helper, player).getFirst();
        helper.assertTrue(Math.abs(arrow.getDeltaMovement().length() - 3 * stats.speedMultiplier()) < 0.12, "full charge velocity");
        arrow.discard();
        fire(player, bow, stats.drawTicks());
        helper.assertTrue(arrows(helper, player).isEmpty() && bow.getDamageValue() == 1, "empty selected stops subsequent shots");
        equipment.contents(player, equipment.contents().with(0, new ItemStack(Items.ARROW, 2)));
        bow.getItem().use(player.level(), player, InteractionHand.MAIN_HAND);
        equipment.equip(player, equipment.stack().copy());
        release(player, bow, stats.drawTicks());
        helper.assertTrue(arrows(helper, player).isEmpty() && bow.getDamageValue() == 1, "equal replacement cancels draw");
        bow.getItem().use(player.level(), player, InteractionHand.MAIN_HAND);
        ItemStack removed = equipment.stack();
        equipment.equip(player, ItemStack.EMPTY);
        release(player, bow, stats.drawTicks());
        helper.assertTrue(arrows(helper, player).isEmpty() && bow.getDamageValue() == 1
                && removed.get(ModRegistries.QUIVER_CONTENTS).get(0).getCount() == 2, "removal during draw preserves ammunition and durability");
        helper.succeed();
    }

    private static void infinity(GameTestHelper helper, String name, String ammoName) {
        var player = player(helper);
        var bow = new ItemStack(bow(name));
        bow.enchant(player.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.INFINITY), 1);
        ItemStack ammo = switch (ammoName) { case "spectral" -> new ItemStack(Items.SPECTRAL_ARROW); case "potion" -> potion(); default -> new ItemStack(Items.ARROW); };
        equip(player, ammo);
        for (int i = 0; i < 3; i++) fire(player, bow, BowCombat.stats(bow).drawTicks());
        helper.assertTrue(arrows(helper, player).size() == 3 && QuiverEquipment.get(player).contents().get(0).getCount() == 1, "Infinity must retain all arrow types");
        for (var arrow : arrows(helper, player)) {
            helper.assertTrue(arrow.pickup == AbstractArrow.Pickup.CREATIVE_ONLY, "free arrows not recoverable in survival");
            ItemStack pickup = arrow.getPickupItemStackOrigin().copy();
            pickup.remove(DataComponents.INTANGIBLE_PROJECTILE);
            helper.assertTrue(ItemStack.isSameItemSameComponents(pickup, ammo), "projectile retains components apart from free-projectile marker");
            arrow.discard();
        }
        QuiverEquipment.get(player).contents(player, QuiverContents.EMPTY);
        fire(player, bow, 40);
        helper.assertTrue(arrows(helper, player).isEmpty(), "Infinity still needs selected ammo");
        helper.succeed();
    }

    private static void selection(GameTestHelper helper) {
        var player = player(helper);
        equip(player, new ItemStack(Items.ARROW, 2));
        var equipment = QuiverEquipment.get(player);
        equipment.contents(player, equipment.contents().with(2, potion()));
        ModNetwork.handleQuiver(player, new QuiverRequest(QuiverRequest.SELECT, equipment.revision(), -1));
        ModNetwork.handleQuiver(player, new QuiverRequest(QuiverRequest.SELECT, equipment.revision(), 4));
        ModNetwork.handleQuiver(player, new QuiverRequest(QuiverRequest.SELECT, equipment.revision(), 1));
        ModNetwork.handleQuiver(player, new QuiverRequest(QuiverRequest.SELECT, equipment.revision() - 1, 2));
        helper.assertTrue(equipment.contents().selected() == 0, "invalid/empty/stale selections rejected");
        ModNetwork.handleQuiver(player, new QuiverRequest(QuiverRequest.SELECT, equipment.revision(), 2));
        helper.assertTrue(equipment.contents().selected() == 2, "valid selection accepted");
        for (Item item : List.of(Items.BOW, ModRegistries.RECURVE_BOW.get(), ModRegistries.LONGBOW.get())) {
            var bow = new ItemStack(item);
            player.setItemInHand(InteractionHand.MAIN_HAND, bow);
            item.use(player.level(), player, InteractionHand.MAIN_HAND);
            ModNetwork.handleQuiver(player, new QuiverRequest(QuiverRequest.WHEEL, equipment.revision(), -1));
            release(player, bow, 40);
            helper.assertTrue(arrows(helper, player).isEmpty() && bow.getDamageValue() == 0, "wheel cancellation must not fire");
        }
        helper.assertTrue(equipment.contents().get(2).getCount() == 1, "cancel must retain ammo");
        helper.succeed();
    }

    private static void creativeAndCrossbows(GameTestHelper helper) {
        var player = player(helper);
        player.setGameMode(GameType.CREATIVE);
        for (Item item : List.of(Items.BOW, ModRegistries.RECURVE_BOW.get(), ModRegistries.LONGBOW.get())) fire(player, new ItemStack(item), 40);
        helper.assertTrue(arrows(helper, player).size() == 3, "creative bows without equipment");
        arrows(helper, player).forEach(Entity::discard);
        player.setGameMode(GameType.SURVIVAL);
        for (Item item : List.of(Items.ARROW, Items.FIREWORK_ROCKET)) {
            var crossbow = new ItemStack(Items.CROSSBOW);
            player.setItemInHand(InteractionHand.MAIN_HAND, crossbow);
            player.setItemInHand(InteractionHand.OFF_HAND, new ItemStack(item, 2));
            Items.CROSSBOW.use(player.level(), player, InteractionHand.MAIN_HAND);
            Items.CROSSBOW.onUseTick(player.level(), player, crossbow, crossbow.getUseDuration(player) - 40);
            helper.assertTrue(CrossbowItem.isCharged(crossbow) && player.getOffhandItem().getCount() == 1, "crossbow loads conventional ammo");
            player.stopUsingItem();
            Items.CROSSBOW.use(player.level(), player, InteractionHand.MAIN_HAND);
            helper.assertTrue(!CrossbowItem.isCharged(crossbow), "crossbow discharges");
        }
        helper.assertTrue(arrows(helper, player).size() == 1, "crossbow arrow projectile");
        helper.assertTrue(helper.getLevel().getEntitiesOfClass(FireworkRocketEntity.class, player.getBoundingBox().inflate(8)).size() >= 1, "crossbow rocket projectile");
        helper.succeed();
    }

    private static void controls(GameTestHelper helper) {
        helper.assertTrue(WheelMath.sector(0, 0) == -1 && WheelMath.sector(12, 0) == -1, "neutral radius");
        helper.assertTrue(WheelMath.sector(0, -20) == 0 && WheelMath.sector(20, 0) == 1
                && WheelMath.sector(0, 20) == 2 && WheelMath.sector(-20, 0) == 3, "four fixed directions");
        var zoom = new ZoomTransition();
        zoom.value(true, 1_000_000_000L);
        helper.assertTrue(Math.abs(zoom.value(true, 1_150_000_000L) - 0.75F) < 0.001F, "150ms zoom in");
        zoom.value(false, 1_150_000_000L);
        helper.assertTrue(zoom.value(false, 1_300_000_000L) == 1, "150ms zoom out");
        zoom.reset();
        helper.assertTrue(zoom.value(false, 1_301_000_000L) == 1, "world reset");
        helper.succeed();
    }

    private static void measurements(GameTestHelper helper) {
        for (String name : List.of("vanilla", "recurve", "longbow")) {
            var player = player(helper);
            var bow = new ItemStack(bow(name));
            var stats = BowCombat.stats(bow);
            for (int charge : new int[]{stats.drawTicks() / 2, stats.drawTicks()}) {
                equip(player, new ItemStack(Items.ARROW, 64));
                double total = 0, rangeTotal = 0, damageTotal = 0;
                for (int i = 0; i < 10; i++) {
                    fire(player, bow, charge);
                    var arrow = arrows(helper, player).getFirst();
                    total += arrow.getDeltaMovement().length();
                    double startX = arrow.getX(), startZ = arrow.getZ(), ground = player.getY() + 100;
                    arrow.setPos(startX, arrow.getY() + 100, startZ);
                    for (int tick = 0; tick < 100 && arrow.getY() > ground; tick++) arrow.tick();
                    rangeTotal += Math.hypot(arrow.getX() - startX, arrow.getZ() - startZ);
                    arrow.discard();
                    fire(player, bow, charge);
                    arrow = arrows(helper, player).getFirst();
                    var target = EntityType.IRON_GOLEM.create(helper.getLevel(), EntitySpawnReason.COMMAND);
                    target.setNoAi(true);
                    target.setPos(arrow.getX(), player.getY(), arrow.getZ() + 2);
                    helper.getLevel().addFreshEntity(target);
                    for (int tick = 0; tick < 5 && target.getHealth() == target.getMaxHealth(); tick++) arrow.tick();
                    helper.assertTrue(target.getHealth() < target.getMaxHealth(), "measurement target must be hit");
                    damageTotal += target.getMaxHealth() - target.getHealth();
                    target.discard(); arrow.discard();
                }
                ArcheryPlus.LOGGER.info("BALANCE bow={} charge={} samples=10 mean_speed={} mean_horizontal_plane_range={} mean_damage_at_2_blocks={} full_draw_shots_per_second={}",
                        name, charge, total / 10, rangeTotal / 10, damageTotal / 10, 20.0 / stats.drawTicks());
            }
        }
        helper.succeed();
    }

    private static void recipes(GameTestHelper helper) {
        String[] patterns = {" TSL S TS", "TPST STPS", "LILL L L ", " TST S TS"};
        Item[] expected = {ModRegistries.RECURVE_BOW.get(), ModRegistries.LONGBOW.get(), ModRegistries.IRON_QUIVER.get(), Items.BOW};
        var manager = helper.getLevel().getServer().getRecipeManager();
        for (int r = 0; r < patterns.length; r++) {
            List<ItemStack> grid = new ArrayList<>();
            for (char c : patterns[r].toCharArray()) grid.add(switch (c) {
                case 'T' -> new ItemStack(Items.STICK); case 'P' -> new ItemStack(Items.OAK_PLANKS);
                case 'S' -> new ItemStack(Items.STRING); case 'L' -> new ItemStack(Items.LEATHER);
                case 'I' -> new ItemStack(Items.IRON_INGOT); default -> ItemStack.EMPTY;
            });
            CraftingInput input = CraftingInput.of(3, 3, grid);
            var recipe = manager.getRecipeFor(RecipeType.CRAFTING, input, helper.getLevel()).orElseThrow();
            helper.assertTrue(recipe.value().assemble(input).is(expected[r]), "recipe output " + r);
            long matches = manager.getRecipes().stream().filter(holder -> holder.value() instanceof CraftingRecipe crafting && crafting.matches(input, helper.getLevel())).count();
            helper.assertTrue(matches == 1, "recipe collision " + r);
        }
        var enchantments = helper.getLevel().registryAccess().lookupOrThrow(Registries.ENCHANTMENT);
        for (Item item : List.of(ModRegistries.RECURVE_BOW.get(), ModRegistries.LONGBOW.get())) {
            var stack = new ItemStack(item);
            for (var key : List.of(Enchantments.POWER, Enchantments.PUNCH, Enchantments.FLAME, Enchantments.INFINITY, Enchantments.UNBREAKING, Enchantments.MENDING)) {
                helper.assertTrue(enchantments.getOrThrow(key).value().canEnchant(stack), "bow enchantability " + key);
            }
            helper.assertTrue(stack.get(DataComponents.REPAIRABLE).isValidRepairItem(new ItemStack(Items.OAK_PLANKS)), "repair by planks");
        }
        helper.succeed();
    }

    private static void creativeInventory(GameTestHelper helper) {
        var player = player(helper);
        player.setGameMode(GameType.CREATIVE);
        var equipment = QuiverEquipment.get(player);
        var inventory = player.inventoryMenu;
        int equipmentSlot = inventory.slots.size() - 1;
        helper.assertTrue(equipmentSlot == 46 && inventory.getSlot(45).x == 77 && inventory.getSlot(45).y == 62, "vanilla slot indices intact");
        helper.assertTrue(!inventory.getSlot(equipmentSlot).mayPlace(new ItemStack(Items.STONE)), "equipment rejects unrelated item");
        inventory.getSlot(9).set(new ItemStack(ModRegistries.IRON_QUIVER.get()));
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.BEGIN, equipment.revision(), 0, 0, 0));
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.CLICK, equipment.revision(), 9, 0, ContainerInput.QUICK_MOVE.ordinal()));
        helper.assertTrue(equipment.equipped() && inventory.getSlot(9).getItem().isEmpty(), "creative shift equips on server");
        long stale = equipment.revision() - 1;
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.CLICK, stale, equipmentSlot, 0, ContainerInput.PICKUP.ordinal()));
        helper.assertTrue(equipment.equipped(), "stale creative action rejected");
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.CLICK, equipment.revision(), -999, 1, ContainerInput.QUICK_CRAFT.ordinal()));
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.CLICK, equipment.revision(), equipmentSlot, 0, ContainerInput.PICKUP.ordinal()));
        helper.assertTrue(!equipment.equipped() && inventory.getCarried().is(ModRegistries.IRON_QUIVER.get()), "creative cursor is authoritative");
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.END, equipment.revision(), 0, 0, 0));
        helper.assertTrue(inventory.getCarried().isEmpty() && player.getInventory().countItem(ModRegistries.IRON_QUIVER.get()) == 1, "exit safely returns cursor");
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.BEGIN, equipment.revision(), 0, 0, 0));
        player.setGameMode(GameType.SURVIVAL);
        ModNetwork.handleInventory(player, new InventoryAction(InventoryAction.END, equipment.revision(), 0, 0, 0));
        helper.assertTrue(!ModNetwork.creativeSession(player), "mode change cannot leave stale creative session");
        helper.succeed();
    }

    private static void drag(GameTestHelper helper) {
        var player = player(helper);
        equip(player, ItemStack.EMPTY);
        var equipment = QuiverEquipment.get(player);
        var menu = new QuiverMenu(1, player.getInventory(), equipment.revision());
        menu.setCarried(new ItemStack(Items.ARROW, 16));
        menu.clicked(-999, 0, ContainerInput.QUICK_CRAFT, player);
        menu.clicked(0, 1, ContainerInput.QUICK_CRAFT, player);
        menu.clicked(1, 1, ContainerInput.QUICK_CRAFT, player);
        menu.clicked(-999, 2, ContainerInput.QUICK_CRAFT, player);
        helper.assertTrue(menu.getCarried().isEmpty() && equipment.contents().get(0).getCount() == 8 && equipment.contents().get(1).getCount() == 8, "drag conservation");
        player.getInventory().setItem(9, potion());
        player.getInventory().setItem(10, PotionContents.createItemStack(Items.TIPPED_ARROW, Potions.HEALING));
        menu.quickMoveStack(player, 4); menu.quickMoveStack(player, 5);
        helper.assertTrue(equipment.contents().get(2).is(Items.TIPPED_ARROW) && equipment.contents().get(3).is(Items.TIPPED_ARROW)
                && !ItemStack.isSameItemSameComponents(equipment.contents().get(2), equipment.contents().get(3)), "different potion stacks remain distinct");
        helper.succeed();
    }

    private static void effects(GameTestHelper helper) {
        var player = player(helper);
        var registry = player.registryAccess().lookupOrThrow(Registries.ENCHANTMENT);
        for (String name : List.of("vanilla", "recurve", "longbow")) {
            for (String kind : List.of("poison", "spectral", "enchanted")) {
                var weapon = new ItemStack(bow(name));
                ItemStack ammo = kind.equals("poison") ? potion() : new ItemStack(kind.equals("spectral") ? Items.SPECTRAL_ARROW : Items.ARROW);
                equip(player, ammo);
                if (kind.equals("enchanted")) {
                    weapon.enchant(registry.getOrThrow(Enchantments.POWER), 5);
                    weapon.enchant(registry.getOrThrow(Enchantments.PUNCH), 2);
                    weapon.enchant(registry.getOrThrow(Enchantments.FLAME), 1);
                }
                fire(player, weapon, BowCombat.stats(weapon).drawTicks());
                var arrow = arrows(helper, player).getFirst();
                var target = EntityType.IRON_GOLEM.create(helper.getLevel(), EntitySpawnReason.COMMAND);
                target.setNoAi(true);
                target.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE).setBaseValue(0);
                target.setPos(arrow.getX(), player.getY(), arrow.getZ() + 1.8);
                helper.getLevel().addFreshEntity(target);
                arrow.tick();
                helper.assertTrue(target.getHealth() < target.getMaxHealth(), "projectile actually hits " + kind);
                if (kind.equals("poison")) helper.assertTrue(target.hasEffect(MobEffects.POISON), "poison effect preserved");
                if (kind.equals("spectral")) helper.assertTrue(target.hasEffect(MobEffects.GLOWING), "spectral effect preserved");
                if (kind.equals("enchanted")) {
                    helper.assertTrue(target.isOnFire(), "Flame preserved");
                    helper.assertTrue(target.getDeltaMovement().horizontalDistance() > 0.5, "Punch preserved");
                    helper.assertTrue(target.getMaxHealth() - target.getHealth() > 10, "Power applied at impact");
                }
                target.discard(); arrow.discard();
            }
        }
        helper.succeed();
    }
}

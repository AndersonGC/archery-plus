package com.archeryplus.tools;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.DataOutputStream;
import java.util.zip.GZIPOutputStream;

public final class GenerateAssets {
    private static final String[] MATERIALS = {"leather", "iron", "gold", "diamond", "netherite"};
    private static Path root;

    public static void main(String[] args) throws Exception {
        root = Path.of(args[0]);
        emptyStructure();
        bow("recurve_bow", 15);
        bow("longbow", 30);
        for (String material : MATERIALS) {
            model(material + "_quiver", false);
            write("assets/archery_plus/items/" + material + "_quiver.json", "{\"model\":" + modelReference(material + "_quiver") + "}");
        }
        recipe("recurve_bow", "[\" TS\",\"L S\",\" TS\"]", "\"T\":\"minecraft:stick\",\"L\":\"minecraft:leather\",\"S\":\"minecraft:string\"");
        recipe("longbow", "[\"TPS\",\"T S\",\"TPS\"]", "\"T\":\"minecraft:stick\",\"P\":\"#minecraft:planks\",\"S\":\"minecraft:string\"");
        recipe("iron_quiver", "[\"LIL\",\"L L\",\" L \"]", "\"L\":\"minecraft:leather\",\"I\":\"minecraft:iron_ingot\"");
        recipe("leather_quiver", "[\"LSL\",\"L L\",\" L \"]", "\"L\":\"minecraft:leather\",\"S\":\"minecraft:string\"");
        upgrade("leather", "iron", "iron_ingot");
        upgrade("iron", "gold", "gold_ingot");
        upgrade("gold", "diamond", "diamond");
        upgrade("diamond", "netherite", "netherite_ingot");
        for (String tag : new String[]{"bow", "durability"}) {
            write("data/minecraft/tags/item/enchantable/" + tag + ".json", """
                    {"replace":false,"values":["archery_plus:recurve_bow","archery_plus:longbow"]}
                    """);
        }
    }

    private static void bow(String name, int ticks) throws Exception {
        for (int stage = -1; stage < 3; stage++) {
            String id = name + (stage < 0 ? "" : "_pulling_" + stage);
            model(id, true);
        }
        write("assets/archery_plus/items/" + name + ".json", """
                {"model":{"type":"minecraft:condition","property":"minecraft:using_item",
                "on_false":%s,"on_true":{"type":"minecraft:range_dispatch","property":"minecraft:use_duration",
                "scale":%s,"fallback":%s,"entries":[{"threshold":0.65,"model":%s},{"threshold":0.9,"model":%s}]}}}
                """.formatted(modelReference(name), 1.0 / ticks, modelReference(name + "_pulling_0"),
                        modelReference(name + "_pulling_1"), modelReference(name + "_pulling_2")));
    }

    private static String modelReference(String name) {
        return "{\"type\":\"minecraft:model\",\"model\":\"archery_plus:item/" + name + "\"}";
    }

    private static void model(String name, boolean bow) throws Exception {
        boolean longbow = name.startsWith("longbow");
        String firstScale = longbow ? "0.92,0.92,0.92" : "0.68,0.68,0.68";
        String thirdScale = longbow ? "1.2,1.2,1.2" : "0.85,0.85,0.85";
        String display = bow ? """
                ,"display":{
                  "firstperson_righthand":{"rotation":[0,-90,25],"translation":[1.1,3.2,1.1],"scale":[%s]},
                  "firstperson_lefthand":{"rotation":[0,90,-25],"translation":[1.1,3.2,1.1],"scale":[%s]},
                  "thirdperson_righthand":{"rotation":[-80,260,-40],"translation":[-1,-2,2.5],"scale":[%s]},
                  "thirdperson_lefthand":{"rotation":[-80,-280,40],"translation":[-1,-2,2.5],"scale":[%s]}}
                """.formatted(firstScale, firstScale, thirdScale, thirdScale) : "";
        write("assets/archery_plus/models/item/" + name + ".json",
                "{\"parent\":\"minecraft:item/generated\",\"textures\":{\"layer0\":\"archery_plus:item/" + name + "\"}" + display + "}");
    }

    private static void upgrade(String from, String to, String material) throws Exception {
        // Vanilla transmutation copies the source component patch, including arrows and custom names.
        write("data/archery_plus/recipe/" + to + "_quiver_upgrade.json", """
                {"type":"minecraft:crafting_transmute","category":"equipment",
                 "input":"archery_plus:%s_quiver","material":"minecraft:%s",
                 "result":{"id":"archery_plus:%s_quiver","count":1}}
                """.formatted(from, material, to));
    }

    private static void recipe(String name, String pattern, String keys) throws Exception {
        write("data/archery_plus/recipe/" + name + ".json", "{\"type\":\"minecraft:crafting_shaped\",\"category\":\"equipment\",\"pattern\":"
                + pattern + ",\"key\":{" + keys + "},\"result\":{\"id\":\"archery_plus:" + name + "\",\"count\":1}}");
        write("data/archery_plus/advancement/recipes/" + name + ".json", """
                {"parent":"minecraft:recipes/root","criteria":{"has_material":{"trigger":"minecraft:inventory_changed",
                "conditions":{"items":[{"items":"minecraft:leather"}]}},"has_the_recipe":{"trigger":"minecraft:recipe_unlocked",
                "conditions":{"recipe":"archery_plus:%s"}}},"requirements":[["has_material","has_the_recipe"]],
                "rewards":{"recipes":["archery_plus:%s"]}}
                """.formatted(name, name));
    }

    private static void write(String relative, String text) throws Exception {
        Path path = root.resolve(relative);
        Files.createDirectories(path.getParent());
        Files.writeString(path, text);
    }

    private static void emptyStructure() throws Exception {
        Path path = root.resolve("data/archery_plus/structure/empty.nbt");
        Files.createDirectories(path.getParent());
        try (var out = new DataOutputStream(new GZIPOutputStream(Files.newOutputStream(path)))) {
            out.writeByte(10); out.writeUTF("");
            out.writeByte(3); out.writeUTF("DataVersion"); out.writeInt(4556);
            out.writeByte(9); out.writeUTF("size"); out.writeByte(3); out.writeInt(3);
            out.writeInt(8); out.writeInt(8); out.writeInt(8);
            for (String name : new String[]{"palette", "blocks", "entities"}) {
                out.writeByte(9); out.writeUTF(name); out.writeByte(10); out.writeInt(0);
            }
            out.writeByte(0);
        }
    }
}

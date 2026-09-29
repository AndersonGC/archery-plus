package com.archeryplus.tools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import java.io.DataOutputStream;
import java.util.zip.GZIPOutputStream;

public final class GenerateAssets {
    private static Path root;

    public static void main(String[] args) throws Exception {
        root = Path.of(args[0]);
        emptyStructure();
        bow("recurve_bow", 15, 0xBA8952);
        bow("longbow", 30, 0x785136);
        model("iron_quiver", false);
        write("assets/archery_plus/items/iron_quiver.json", "{\"model\":" + modelReference("iron_quiver") + "}");
        BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        g.setColor(new Color(0x493126)); g.fillRect(10, 7, 13, 23);
        g.setColor(new Color(0x92613E)); g.fillRect(12, 8, 9, 20);
        g.setColor(new Color(0xB4BBC4)); g.fillRect(9, 7, 15, 4); g.fillRect(10, 24, 13, 3);
        g.setColor(new Color(0xDBCA91)); g.fillRect(13, 1, 2, 12); g.fillRect(18, 2, 2, 10);
        g.setColor(new Color(0xE8E6D5)); g.fillRect(12, 1, 4, 3); g.fillRect(17, 2, 4, 3);
        g.dispose(); texture("iron_quiver", image);
        recipe("recurve_bow", "[\" TS\",\"L S\",\" TS\"]", "\"T\":\"minecraft:stick\",\"L\":\"minecraft:leather\",\"S\":\"minecraft:string\"");
        recipe("longbow", "[\"TPS\",\"T S\",\"TPS\"]", "\"T\":\"minecraft:stick\",\"P\":\"#minecraft:planks\",\"S\":\"minecraft:string\"");
        recipe("iron_quiver", "[\"LIL\",\"L L\",\" L \"]", "\"L\":\"minecraft:leather\",\"I\":\"minecraft:iron_ingot\"");
        for (String tag : new String[]{"bow", "durability"}) {
            write("data/minecraft/tags/item/enchantable/" + tag + ".json", """
                    {"replace":false,"values":["archery_plus:recurve_bow","archery_plus:longbow"]}
                    """);
        }
    }

    private static void bow(String name, int ticks, int color) throws Exception {
        for (int stage = -1; stage < 3; stage++) {
            String id = name + (stage < 0 ? "" : "_pulling_" + stage);
            model(id, true);
            BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = image.createGraphics();
            int mid = 10 - Math.max(0, stage);
            g.setColor(new Color(0x352720));
            g.drawPolyline(new int[]{21, 17, mid, mid, 17, 21}, new int[]{2, 5, 12, 19, 26, 29}, 6);
            g.setColor(new Color(color));
            g.drawPolyline(new int[]{22, 18, mid + 1, mid + 1, 18, 22}, new int[]{2, 5, 12, 19, 26, 29}, 6);
            g.setColor(new Color(0xD0B68A));
            g.drawPolyline(new int[]{22, 22 + Math.max(0, stage) * 2, 22}, new int[]{2, 16, 29}, 3);
            g.setColor(new Color(0x4B3930)); g.fillRect(mid, 13, 3, 6);
            if (stage >= 0) {
                g.setColor(new Color(0xD9C29B)); g.drawLine(5, 16, 26, 16);
                g.setColor(new Color(0xC6CED8)); g.fillRect(3, 15, 4, 3);
            }
            g.dispose(); texture(id, image);
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
        String display = bow ? """
                ,"display":{
                  "firstperson_righthand":{"rotation":[0,-90,25],"translation":[1.1,3.2,1.1],"scale":[0.68,0.68,0.68]},
                  "firstperson_lefthand":{"rotation":[0,90,-25],"translation":[1.1,3.2,1.1],"scale":[0.68,0.68,0.68]},
                  "thirdperson_righthand":{"rotation":[-80,260,-40],"translation":[-1,-2,2.5],"scale":[0.9,0.9,0.9]},
                  "thirdperson_lefthand":{"rotation":[-80,-280,40],"translation":[-1,-2,2.5],"scale":[0.9,0.9,0.9]}}
                """ : "";
        write("assets/archery_plus/models/item/" + name + ".json",
                "{\"parent\":\"minecraft:item/generated\",\"textures\":{\"layer0\":\"archery_plus:item/" + name + "\"}" + display + "}");
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

    private static void texture(String name, BufferedImage image) throws Exception {
        Path path = root.resolve("assets/archery_plus/textures/item/" + name + ".png");
        Files.createDirectories(path.getParent());
        ImageIO.write(image, "PNG", path.toFile());
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

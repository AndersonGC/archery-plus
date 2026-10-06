package com.archeryplus.item;

import net.minecraft.world.item.Item;

/** All tiers share the ammunition component; the material controls their appearance. */
public final class QuiverItem extends Item {
    public enum Material {
        LEATHER("leather"), IRON("iron"), GOLD("gold"), DIAMOND("diamond"), NETHERITE("netherite");

        private final String id;
        Material(String id) { this.id = id; }
        public String id() { return id; }
    }

    private final Material material;
    public QuiverItem(Properties properties, Material material) {
        super(properties);
        this.material = material;
    }
    public Material material() { return material; }
}

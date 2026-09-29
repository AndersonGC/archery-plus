package com.archeryplus.item;

public record BowStats(int drawTicks, float speedMultiplier, int durability) {
    public static final BowStats RECURVE = new BowStats(15, 0.85F, 320);
    public static final BowStats LONG = new BowStats(30, 1.25F, 512);
    public static final BowStats VANILLA = new BowStats(20, 1.0F, 384);

    public float power(int ticks) {
        float fraction = Math.max(0, ticks) / (float) drawTicks;
        return Math.min(1, (fraction * fraction + 2 * fraction) / 3);
    }
}

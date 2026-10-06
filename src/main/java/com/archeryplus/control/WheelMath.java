package com.archeryplus.control;

public final class WheelMath {
    public static final int NEUTRAL_RADIUS = 12;
    private WheelMath() {}
    public static int sector(double x, double y) {
        return sector(x, y, NEUTRAL_RADIUS);
    }
    public static int sector(double x, double y, double neutralRadius) {
        if (x * x + y * y <= neutralRadius * neutralRadius) return -1;
        return Math.floorMod((int) Math.floor((Math.atan2(y, x) + Math.PI * 0.75) / (Math.PI / 2)), 4);
    }
}

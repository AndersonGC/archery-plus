package com.archeryplus.control;

public final class ZoomTransition {
    private static final long DURATION = 150_000_000L;
    private float from = 1, target = 1;
    private long started;

    public float value(boolean aiming, long now) {
        float current = sample(now);
        float wanted = aiming ? 0.75F : 1;
        if (target != wanted) { from = current; target = wanted; started = now; }
        return sample(now);
    }

    private float sample(long now) {
        float progress = Math.clamp((now - started) / (float) DURATION, 0, 1);
        return from + (target - from) * progress;
    }

    public void reset() { from = target = 1; started = 0; }
}

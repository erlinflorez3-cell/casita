package io.sentry.android.core;

/* JADX INFO: loaded from: classes6.dex */
final class SentryFrameMetrics {
    private int frozenFrameCount;
    private long frozenFrameDelayNanos;
    private int slowFrameCount;
    private long slowFrameDelayNanos;
    private long totalDurationNanos;

    public SentryFrameMetrics() {
    }

    public SentryFrameMetrics(int i2, long j2, int i3, long j3, long j4) {
        this.slowFrameCount = i2;
        this.slowFrameDelayNanos = j2;
        this.frozenFrameCount = i3;
        this.frozenFrameDelayNanos = j3;
        this.totalDurationNanos = j4;
    }

    public void addFrame(long j2, long j3, boolean z2, boolean z3) {
        this.totalDurationNanos += j2;
        if (z3) {
            this.frozenFrameDelayNanos += j3;
            this.frozenFrameCount++;
        } else if (z2) {
            this.slowFrameDelayNanos += j3;
            this.slowFrameCount++;
        }
    }

    public void clear() {
        this.slowFrameCount = 0;
        this.slowFrameDelayNanos = 0L;
        this.frozenFrameCount = 0;
        this.frozenFrameDelayNanos = 0L;
        this.totalDurationNanos = 0L;
    }

    public boolean containsValidData() {
        return this.slowFrameCount >= 0 && this.slowFrameDelayNanos >= 0 && this.frozenFrameCount >= 0 && this.frozenFrameDelayNanos >= 0 && this.totalDurationNanos >= 0;
    }

    public SentryFrameMetrics diffTo(SentryFrameMetrics sentryFrameMetrics) {
        return new SentryFrameMetrics(this.slowFrameCount - sentryFrameMetrics.slowFrameCount, this.slowFrameDelayNanos - sentryFrameMetrics.slowFrameDelayNanos, this.frozenFrameCount - sentryFrameMetrics.frozenFrameCount, this.frozenFrameDelayNanos - sentryFrameMetrics.frozenFrameDelayNanos, this.totalDurationNanos - sentryFrameMetrics.totalDurationNanos);
    }

    public SentryFrameMetrics duplicate() {
        return new SentryFrameMetrics(this.slowFrameCount, this.slowFrameDelayNanos, this.frozenFrameCount, this.frozenFrameDelayNanos, this.totalDurationNanos);
    }

    public int getFrozenFrameCount() {
        return this.frozenFrameCount;
    }

    public long getFrozenFrameDelayNanos() {
        return this.frozenFrameDelayNanos;
    }

    public int getSlowFrameCount() {
        return this.slowFrameCount;
    }

    public long getSlowFrameDelayNanos() {
        return this.slowFrameDelayNanos;
    }

    public int getSlowFrozenFrameCount() {
        return this.slowFrameCount + this.frozenFrameCount;
    }

    public long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }
}

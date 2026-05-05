package com.airbnb.lottie.utils;

import androidx.core.os.TraceCompat;

/* JADX INFO: loaded from: classes.dex */
public class LottieTrace {
    private static final int MAX_DEPTH = 5;
    private final String[] sections = new String[5];
    private final long[] startTimeNs = new long[5];
    private int traceDepth = 0;
    private int depthPastMaxDepth = 0;

    public void beginSection(String str) {
        int i2 = this.traceDepth;
        if (i2 == 5) {
            this.depthPastMaxDepth++;
            return;
        }
        this.sections[i2] = str;
        this.startTimeNs[i2] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.traceDepth++;
    }

    public float endSection(String str) {
        int i2 = this.depthPastMaxDepth;
        if (i2 > 0) {
            this.depthPastMaxDepth = i2 - 1;
            return 0.0f;
        }
        int i3 = this.traceDepth - 1;
        this.traceDepth = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(this.sections[i3])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.sections[this.traceDepth] + ".");
        }
        TraceCompat.endSection();
        return (System.nanoTime() - this.startTimeNs[this.traceDepth]) / 1000000.0f;
    }
}

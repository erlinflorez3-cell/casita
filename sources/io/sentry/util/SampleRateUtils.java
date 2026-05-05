package io.sentry.util;

/* JADX INFO: loaded from: classes6.dex */
public final class SampleRateUtils {
    public static boolean isValidProfilesSampleRate(Double d2) {
        return isValidRate(d2, true);
    }

    private static boolean isValidRate(Double d2, boolean z2) {
        return d2 == null ? z2 : !d2.isNaN() && d2.doubleValue() >= 0.0d && d2.doubleValue() <= 1.0d;
    }

    public static boolean isValidSampleRate(Double d2) {
        return isValidRate(d2, true);
    }

    public static boolean isValidTracesSampleRate(Double d2) {
        return isValidTracesSampleRate(d2, true);
    }

    public static boolean isValidTracesSampleRate(Double d2, boolean z2) {
        return isValidRate(d2, z2);
    }
}

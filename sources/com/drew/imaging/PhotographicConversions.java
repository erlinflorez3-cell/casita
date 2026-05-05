package com.drew.imaging;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotographicConversions {
    public static final double ROOT_TWO = Math.sqrt(2.0d);

    private PhotographicConversions() throws Exception {
        throw new Exception("Not intended for instantiation.");
    }

    public static double apertureToFStop(double d2) {
        return Math.pow(ROOT_TWO, d2);
    }

    public static double shutterSpeedToExposureTime(double d2) {
        return (float) (1.0d / Math.exp(d2 * Math.log(2.0d)));
    }
}

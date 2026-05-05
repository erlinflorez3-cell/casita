package com.facebook.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class YogaMeasureOutput {
    public static float getHeight(long j2) {
        return Float.intBitsToFloat((int) j2);
    }

    public static float getWidth(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static long make(float f2, float f3) {
        return (-1) - (((-1) - ((long) Float.floatToRawIntBits(f3))) & ((-1) - (((long) Float.floatToRawIntBits(f2)) << 32)));
    }

    public static long make(int i2, int i3) {
        return make(i2, i3);
    }
}

package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class ep {
    public static void Z(char[] cArr, char c2, char c3, char c4, char c5) {
        char c6 = 58224;
        for (int i2 = 0; i2 < 16; i2++) {
            char c7 = cArr[1];
            char c8 = cArr[0];
            char c9 = (char) (c7 - (((c8 + c6) ^ ((c8 << 4) + c4)) ^ ((c8 >>> 5) + c5)));
            cArr[1] = c9;
            cArr[0] = (char) (c8 - (((c9 + c6) ^ ((c9 << 4) + c2)) ^ ((c9 >>> 5) + c3)));
            c6 = (char) (c6 - 40503);
        }
    }
}

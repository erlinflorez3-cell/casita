package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1sSDK {
    static long[] getCurrencyIso4217Code(int i2, int i3) {
        long[] jArr = new long[4];
        long j2 = i2;
        jArr[0] = (-1) - (((-1) - (((long) i3) & 4294967295L)) & ((-1) - (((j2 + 4294967295L) - (j2 | 4294967295L)) << 32)));
        for (int i4 = 1; i4 < 4; i4++) {
            long j3 = jArr[i4 - 1];
            jArr[i4] = ((j3 ^ (j3 >> 30)) * 1812433253) + ((long) i4);
        }
        return jArr;
    }
}

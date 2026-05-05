package com.facetec.sdk;

import androidx.core.view.ViewCompat;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
final class is {
    public static final Charset V = Charset.forName("UTF-8");

    public static int I(int i2) {
        int i3 = ((-1) - (((-1) - ViewCompat.MEASURED_STATE_MASK) | ((-1) - i2))) >>> 24;
        int i4 = ((16711680 + i2) - (16711680 | i2)) >>> 8;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = (65280 & i2) << 8;
        return (((-1) - (((-1) - i2) | ((-1) - 255))) << 24) | ((i5 + i6) - (i5 & i6));
    }

    public static short I(short s2) {
        int i2 = (65535 & s2) >>> 8;
        return (short) (((s2 & 255) << 8) | ((i2 + 255) - (i2 | 255)));
    }

    public static void I(Throwable th) throws Throwable {
        throw th;
    }

    public static void Z(long j2, long j3, long j4) {
        if ((-1) - (((-1) - j3) & ((-1) - j4)) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
        }
    }

    public static boolean Z(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }
}

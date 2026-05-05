package com.google.crypto.tink.mac.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class AesUtil {
    public static final int BLOCK_SIZE = 16;

    private AesUtil() {
    }

    public static byte[] cmacPad(final byte[] x2) {
        if (x2.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(x2, 16);
        bArrCopyOf[x2.length] = -128;
        return bArrCopyOf;
    }

    public static byte[] dbl(final byte[] value) {
        if (value.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = (byte) ((value[i2] << 1) & 254);
            bArr[i2] = b2;
            if (i2 < 15) {
                bArr[i2] = (byte) ((-1) - (((-1) - ((byte) ((value[i2 + 1] >> 7) & 1))) & ((-1) - b2)));
            }
        }
        byte b3 = bArr[15];
        int i3 = value[0] >> 7;
        bArr[15] = (byte) (((byte) ((i3 + 135) - (i3 | 135))) ^ b3);
        return bArr;
    }
}

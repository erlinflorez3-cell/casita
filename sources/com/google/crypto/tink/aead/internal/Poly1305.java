package com.google.crypto.tink.aead.internal;

import com.google.common.base.Ascii;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    public static byte[] computeMac(final byte[] key, byte[] data) {
        if (key.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i2 = 0;
        long jLoad26 = (-1) - (((-1) - load26(key, 0, 0)) | ((-1) - 67108863));
        int i3 = 3;
        long jLoad262 = load26(key, 3, 2) & 67108611;
        long jLoad263 = load26(key, 6, 4) & 67092735;
        long jLoad264 = load26(key, 9, 6) & 66076671;
        long jLoad265 = load26(key, 12, 8);
        long j2 = (jLoad265 + 1048575) - (jLoad265 | 1048575);
        long j3 = jLoad262 * 5;
        long j4 = jLoad263 * 5;
        long j5 = jLoad264 * 5;
        long j6 = j2 * 5;
        byte[] bArr = new byte[17];
        long j7 = 0;
        int i4 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (i4 < data.length) {
            copyBlockSize(bArr, data, i4);
            long jLoad266 = j11 + load26(bArr, i2, i2);
            long jLoad267 = j7 + load26(bArr, i3, 2);
            long jLoad268 = j8 + load26(bArr, 6, 4);
            long jLoad269 = j9 + load26(bArr, 9, 6);
            long jLoad2610 = load26(bArr, 12, 8);
            long j12 = bArr[16] << Ascii.CAN;
            long j13 = j10 + ((jLoad2610 + j12) - (jLoad2610 & j12));
            long j14 = (jLoad266 * jLoad26) + (jLoad267 * j6) + (jLoad268 * j5) + (jLoad269 * j4) + (j13 * j3);
            long j15 = (jLoad266 * jLoad262) + (jLoad267 * jLoad26) + (jLoad268 * j6) + (jLoad269 * j5) + (j13 * j4);
            long j16 = (jLoad266 * jLoad263) + (jLoad267 * jLoad262) + (jLoad268 * jLoad26) + (jLoad269 * j6) + (j13 * j5);
            long j17 = (jLoad266 * jLoad264) + (jLoad267 * jLoad263) + (jLoad268 * jLoad262) + (jLoad269 * jLoad26) + (j13 * j6);
            long j18 = (jLoad266 * j2) + (jLoad267 * jLoad264) + (jLoad268 * jLoad263) + (jLoad269 * jLoad262) + (j13 * jLoad26);
            long j19 = j15 + (j14 >> 26);
            long j20 = j16 + (j19 >> 26);
            j8 = (-1) - (((-1) - j20) | ((-1) - 67108863));
            long j21 = j17 + (j20 >> 26);
            j9 = (-1) - (((-1) - j21) | ((-1) - 67108863));
            long j22 = j18 + (j21 >> 26);
            j10 = (-1) - (((-1) - j22) | ((-1) - 67108863));
            long j23 = ((-1) - (((-1) - j14) | ((-1) - 67108863))) + ((j22 >> 26) * 5);
            j7 = (j19 & 67108863) + (j23 >> 26);
            i4 += 16;
            i3 = 3;
            j11 = j23 & 67108863;
            i2 = 0;
        }
        long j24 = (-1) - (((-1) - j7) | ((-1) - 67108863));
        long j25 = j8 + (j7 >> 26);
        long j26 = (-1) - (((-1) - j25) | ((-1) - 67108863));
        long j27 = j9 + (j25 >> 26);
        long j28 = (j27 + 67108863) - (j27 | 67108863);
        long j29 = j10 + (j27 >> 26);
        long j30 = (j29 + 67108863) - (j29 | 67108863);
        long j31 = j11 + ((j29 >> 26) * 5);
        long j32 = (-1) - (((-1) - j31) | ((-1) - 67108863));
        long j33 = j24 + (j31 >> 26);
        long j34 = j32 + 5;
        long j35 = j34 >> 26;
        long j36 = j34 & 67108863;
        long j37 = j35 + j33;
        long j38 = j26 + (j37 >> 26);
        long j39 = j28 + (j38 >> 26);
        long j40 = (-1) - (((-1) - j39) | ((-1) - 67108863));
        long j41 = (j30 + (j39 >> 26)) - 67108864;
        long j42 = j41 >> 63;
        long j43 = (j33 + j42) - (j33 | j42);
        long j44 = j30 & j42;
        long j45 = ~j42;
        long j46 = (-1) - (((-1) - (j32 & j42)) & ((-1) - ((j36 + j45) - (j36 | j45))));
        long j47 = ((j37 + 67108863) - (j37 | 67108863)) & j45;
        long j48 = (j47 + j43) - (j47 & j43);
        long j49 = ((-1) - (((-1) - (j38 & 67108863)) | ((-1) - j45))) | ((j26 + j42) - (j26 | j42));
        long j50 = (-1) - (((-1) - ((-1) - (((-1) - j40) | ((-1) - j45)))) & ((-1) - ((j28 + j42) - (j28 | j42))));
        long j51 = (j41 + j45) - (j41 | j45);
        long j52 = (j51 + j44) - (j51 & j44);
        long j53 = (-1) - (((-1) - ((-1) - (((-1) - j46) & ((-1) - (j48 << 26))))) | ((-1) - 4294967295L));
        long j54 = j48 >> 6;
        long j55 = j49 << 20;
        long j56 = (j54 + j55) - (j54 & j55);
        long jLoad32 = j53 + load32(key, 16);
        long jLoad322 = ((j56 + 4294967295L) - (j56 | 4294967295L)) + load32(key, 20) + (jLoad32 >> 32);
        long jLoad323 = ((-1) - (((-1) - ((-1) - (((-1) - (j49 >> 12)) & ((-1) - (j50 << 14))))) | ((-1) - 4294967295L))) + load32(key, 24) + (jLoad322 >> 32);
        long jLoad324 = ((-1) - (((-1) - ((j50 >> 18) | (j52 << 8))) | ((-1) - 4294967295L))) + load32(key, 28) + (jLoad323 >> 32);
        byte[] bArr2 = new byte[16];
        toByteArray(bArr2, (-1) - (((-1) - jLoad32) | ((-1) - 4294967295L)), 0);
        toByteArray(bArr2, jLoad322 & 4294967295L, 4);
        toByteArray(bArr2, (jLoad323 + 4294967295L) - (jLoad323 | 4294967295L), 8);
        toByteArray(bArr2, (jLoad324 + 4294967295L) - (jLoad324 | 4294967295L), 12);
        return bArr2;
    }

    private static void copyBlockSize(byte[] output, byte[] in, int idx) {
        int iMin = Math.min(16, in.length - idx);
        System.arraycopy(in, idx, output, 0, iMin);
        output[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(output, iMin + 1, output.length, (byte) 0);
        }
    }

    private static long load26(byte[] in, int idx, int shift) {
        return (load32(in, idx) >> shift) & 67108863;
    }

    private static long load32(byte[] in, int idx) {
        int i2 = in[idx] & 255;
        byte b2 = in[idx + 1];
        int i3 = ((b2 + 255) - (b2 | 255)) << 8;
        int i4 = (i2 + i3) - (i2 & i3);
        int i5 = ((-1) - (((-1) - in[idx + 2]) | ((-1) - 255))) << 16;
        return ((long) ((-1) - (((-1) - ((in[idx + 3] & 255) << 24)) & ((-1) - ((i4 + i5) - (i4 & i5)))))) & 4294967295L;
    }

    private static void toByteArray(byte[] output, long num, int idx) {
        int i2 = 0;
        while (i2 < 4) {
            output[idx + i2] = (byte) ((255 + num) - (255 | num));
            i2++;
            num >>= 8;
        }
    }

    public static void verifyMac(final byte[] key, byte[] data, byte[] mac) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(key, data), mac)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}

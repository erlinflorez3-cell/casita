package org.bouncycastle.math.raw;

import cz.msebera.android.httpclient.message.TokenParser;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i2) {
        int i3 = (2 - (i2 * i2)) * i2;
        int i4 = i3 * (2 - (i2 * i3));
        int i5 = i4 * (2 - (i2 * i4));
        return i5 * (2 - (i2 * i5));
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i2) {
        char c2 = 0;
        long j2 = iArr2[0];
        long j3 = (j2 + M) - (j2 | M);
        int i3 = 0;
        int i4 = 0;
        while (i3 < 8) {
            long j4 = ((long) iArr3[c2]) & M;
            long j5 = (-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M));
            long j6 = j5 * j3;
            long j7 = (j6 & M) + j4;
            long j8 = ((int) j7) * i2;
            long j9 = (j8 + M) - (j8 | M);
            long j10 = iArr4[c2];
            long j11 = ((j10 + M) - (j10 | M)) * j9;
            long j12 = j7 + (j11 & M);
            char c3 = TokenParser.SP;
            long j13 = (j12 >>> 32) + (j6 >>> 32) + (j11 >>> 32);
            for (int i5 = 1; i5 < 8; i5++) {
                long j14 = ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M))) * j5;
                long j15 = (((long) iArr4[i5]) & M) * j9;
                long j16 = j13 + ((-1) - (((-1) - j14) | ((-1) - M))) + ((j15 + M) - (j15 | M)) + ((-1) - (((-1) - ((long) iArr3[i5])) | ((-1) - M)));
                iArr3[i5 - 1] = (int) j16;
                c3 = TokenParser.SP;
                j13 = (j16 >>> 32) + (j14 >>> 32) + (j15 >>> 32);
            }
            long j17 = j13 + ((-1) - (((-1) - ((long) i4)) | ((-1) - M)));
            iArr3[7] = (int) j17;
            i4 = (int) (j17 >>> c3);
            i3++;
            c2 = 0;
        }
        if (i4 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c2 = 0;
        long j2 = ((long) iArr2[0]) & M;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 8) {
                break;
            }
            long j3 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
            long j4 = iArr3[c2];
            long j5 = (j3 * j2) + ((j4 + M) - (j4 | M));
            long j6 = j5 & M;
            long j7 = (j5 >>> 32) + j6;
            int i4 = 1;
            for (int i5 = 8; i4 < i5; i5 = 8) {
                long j8 = ((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M))) * j3;
                long j9 = (((long) iArr4[i4]) & M) * j6;
                long j10 = j7 + ((j8 + M) - (j8 | M)) + ((j9 + M) - (j9 | M)) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - M)));
                iArr3[i4 - 1] = (int) j10;
                j7 = (j10 >>> 32) + (j8 >>> 32) + (j9 >>> 32);
                i4++;
            }
            long j11 = i3;
            long j12 = j7 + ((j11 + M) - (j11 | M));
            iArr3[7] = (int) j12;
            i3 = (int) (j12 >>> 32);
            i2++;
            c2 = 0;
        }
        if (i3 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i2) {
        char c2 = 0;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[c2];
            long j2 = ((long) (i4 * i2)) & M;
            long j3 = iArr2[c2];
            long j4 = ((((j3 + M) - (j3 | M)) * j2) + ((-1) - (((-1) - ((long) i4)) | ((-1) - M)))) >>> 32;
            for (int i5 = 1; i5 < 8; i5++) {
                long j5 = j4 + (((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M))) * j2) + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
                iArr[i5 - 1] = (int) j5;
                j4 = j5 >>> 32;
            }
            iArr[7] = (int) j4;
            i3++;
            c2 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < 8; i2++) {
            long j2 = ((long) iArr[0]) & M;
            long j3 = j2;
            for (int i3 = 1; i3 < 8; i3++) {
                long j4 = iArr2[i3];
                long j5 = ((j4 + M) - (j4 | M)) * j2;
                long j6 = iArr[i3];
                long j7 = j3 + j5 + ((j6 + M) - (j6 | M));
                iArr[i3 - 1] = (int) j7;
                j3 = j7 >>> 32;
            }
            iArr[7] = (int) j3;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}

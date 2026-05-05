package org.spongycastle.math.raw;

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
            long j7 = ((j6 + M) - (j6 | M)) + j4;
            long j8 = (-1) - (((-1) - ((long) (((int) j7) * i2))) | ((-1) - M));
            long j9 = ((-1) - (((-1) - ((long) iArr4[c2])) | ((-1) - M))) * j8;
            long j10 = j7 + (j9 & M);
            char c3 = TokenParser.SP;
            long j11 = (j10 >>> 32) + (j6 >>> 32) + (j9 >>> 32);
            for (int i5 = 1; i5 < 8; i5++) {
                long j12 = (((long) iArr2[i5]) & M) * j5;
                long j13 = (((long) iArr4[i5]) & M) * j8;
                long j14 = j11 + ((j12 + M) - (j12 | M)) + ((-1) - (((-1) - j13) | ((-1) - M))) + (((long) iArr3[i5]) & M);
                iArr3[i5 - 1] = (int) j14;
                c3 = TokenParser.SP;
                j11 = (j14 >>> 32) + (j12 >>> 32) + (j13 >>> 32);
            }
            long j15 = j11 + (((long) i4) & M);
            iArr3[7] = (int) j15;
            i4 = (int) (j15 >>> c3);
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
            long j4 = (j3 * j2) + (((long) iArr3[c2]) & M);
            long j5 = j4 & M;
            long j6 = (j4 >>> 32) + j5;
            int i4 = 1;
            for (int i5 = 8; i4 < i5; i5 = 8) {
                long j7 = iArr2[i4];
                long j8 = ((j7 + M) - (j7 | M)) * j3;
                long j9 = iArr4[i4];
                long j10 = ((j9 + M) - (j9 | M)) * j5;
                long j11 = (j8 & M) + ((-1) - (((-1) - j10) | ((-1) - M)));
                long j12 = iArr3[i4];
                long j13 = j6 + j11 + ((j12 + M) - (j12 | M));
                iArr3[i4 - 1] = (int) j13;
                j6 = (j13 >>> 32) + (j8 >>> 32) + (j10 >>> 32);
                i4++;
            }
            long j14 = j6 + (((long) i3) & M);
            iArr3[7] = (int) j14;
            i3 = (int) (j14 >>> 32);
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
            long j3 = (((((long) iArr2[c2]) & M) * j2) + ((-1) - (((-1) - ((long) i4)) | ((-1) - M)))) >>> 32;
            for (int i5 = 1; i5 < 8; i5++) {
                long j4 = j3 + ((((long) iArr2[i5]) & M) * j2) + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
                iArr[i5 - 1] = (int) j4;
                j3 = j4 >>> 32;
            }
            iArr[7] = (int) j3;
            i3++;
            c2 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < 8; i2++) {
            long j2 = (-1) - (((-1) - ((long) iArr[0])) | ((-1) - M));
            long j3 = j2;
            for (int i3 = 1; i3 < 8; i3++) {
                long j4 = iArr2[i3];
                long j5 = j3 + (((j4 + M) - (j4 | M)) * j2) + (((long) iArr[i3]) & M);
                iArr[i3 - 1] = (int) j5;
                j3 = j5 >>> 32;
            }
            iArr[7] = (int) j3;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}

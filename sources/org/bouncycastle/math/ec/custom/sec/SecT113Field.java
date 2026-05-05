package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat128;

/* JADX INFO: loaded from: classes2.dex */
public class SecT113Field {
    private static final long M49 = 562949953421311L;
    private static final long M57 = 144115188075855871L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat128.fromBigInteger64(bigInteger);
        reduce15(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = ((jArr[1] << 7) ^ (j2 >>> 57)) & M57;
        long j4 = (j2 + M57) - (j2 | M57);
        long j5 = jArr2[0];
        long j6 = (-1) - (((-1) - ((jArr2[1] << 7) ^ (j5 >>> 57))) | ((-1) - M57));
        long j7 = (-1) - (((-1) - M57) | ((-1) - j5));
        long[] jArr4 = new long[6];
        implMulw(j4, j7, jArr4, 0);
        implMulw(j3, j6, jArr4, 2);
        implMulw(j4 ^ j3, j7 ^ j6, jArr4, 4);
        long j8 = jArr4[1] ^ jArr4[2];
        long j9 = jArr4[0];
        long j10 = jArr4[3];
        long j11 = (jArr4[4] ^ j9) ^ j8;
        long j12 = j8 ^ (jArr4[5] ^ j10);
        jArr3[0] = j9 ^ (j11 << 57);
        jArr3[1] = (j11 >>> 7) ^ (j12 << 50);
        jArr3[2] = (j12 >>> 14) ^ (j10 << 43);
        jArr3[3] = j10 >>> 21;
    }

    protected static void implMulw(long j2, long j3, long[] jArr, int i2) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j3 << 2;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i3 = (int) j2;
        long j8 = jArr2[(i3 + 7) - (i3 | 7)];
        long j9 = 0;
        int i4 = 48;
        do {
            int i5 = (int) (j2 >>> i4);
            long j10 = (jArr2[(i5 + 7) - (7 | i5)] ^ (jArr2[(-1) - (((-1) - (i5 >>> 3)) | ((-1) - 7))] << 3)) ^ (jArr2[(-1) - (((-1) - (i5 >>> 6)) | ((-1) - 7))] << 6);
            j8 ^= j10 << i4;
            j9 ^= j10 >>> (-i4);
            i4 -= 9;
        } while (i4 > 0);
        long j11 = (j2 + 72198606942111744L) - (j2 | 72198606942111744L);
        long j12 = (j3 << 7) >> 63;
        jArr[i2] = (-1) - (((-1) - M57) | ((-1) - j8));
        jArr[i2 + 1] = (((((j11 + j12) - (j11 | j12)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat128.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat128.create64();
        long[] jArrCreate642 = Nat128.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 28, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 56, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = j4 ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j7 = (j3 ^ ((j5 << 15) ^ (j5 << 24))) ^ ((j6 >>> 40) ^ (j6 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = ((j2 ^ ((j6 << 15) ^ (j6 << 24))) ^ j8) ^ (j8 << 9);
        jArr2[1] = M49 & j7;
    }

    public static void reduce15(long[] jArr, int i2) {
        int i3 = i2 + 1;
        long j2 = jArr[i3];
        long j3 = j2 >>> 49;
        jArr[i2] = (j3 ^ (j3 << 9)) ^ jArr[i2];
        jArr[i3] = j2 & M49;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (4294967295L + jUnshuffle) - (4294967295L | jUnshuffle);
        long j3 = jUnshuffle2 << 32;
        long j4 = (j2 + j3) - (j2 & j3);
        long j5 = jUnshuffle >>> 32;
        long j6 = (jUnshuffle2 - 4294967296L) - (jUnshuffle2 | (-4294967296L));
        long j7 = (j5 + j6) - (j5 & j6);
        jArr2[0] = ((j7 << 57) ^ j4) ^ (j7 << 5);
        jArr2[1] = (j7 >>> 59) ^ (j7 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i2, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}

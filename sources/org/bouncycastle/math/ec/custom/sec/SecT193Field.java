package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes2.dex */
public class SecT193Field {
    private static final long M01 = 1;
    private static final long M49 = 562949953421311L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat256.fromBigInteger64(bigInteger);
        reduce63(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    protected static void implCompactExt(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        jArr[0] = j2 ^ (j3 << 49);
        jArr[1] = (j3 >>> 15) ^ (j4 << 34);
        jArr[2] = (j4 >>> 30) ^ (j5 << 19);
        jArr[3] = ((j5 >>> 45) ^ (j6 << 4)) ^ (j7 << 53);
        jArr[4] = ((j6 >>> 60) ^ (j8 << 38)) ^ (j7 >>> 11);
        jArr[5] = (j8 >>> 26) ^ (j9 << 23);
        jArr[6] = j9 >>> 41;
        jArr[7] = 0;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        jArr2[0] = (j2 + M49) - (j2 | M49);
        jArr2[1] = (-1) - (((-1) - ((j2 >>> 49) ^ (j3 << 15))) | ((-1) - M49));
        jArr2[2] = (-1) - (((-1) - ((j3 >>> 34) ^ (j4 << 30))) | ((-1) - M49));
        jArr2[3] = (j4 >>> 19) ^ (j5 << 45);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        implMulwAcc(jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr4[3], jArr5[3], jArr3, 3);
        for (int i2 = 5; i2 > 0; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 1];
        }
        implMulwAcc(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j2 = jArr4[0] ^ jArr4[2];
        long j3 = jArr4[1] ^ jArr4[3];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr5[1] ^ jArr5[3];
        implMulwAcc(j2 ^ j3, j4 ^ j5, jArr3, 3);
        long[] jArr6 = new long[3];
        implMulwAcc(j2, j4, jArr6, 0);
        implMulwAcc(j3, j5, jArr6, 1);
        long j6 = jArr6[0];
        long j7 = jArr6[1];
        long j8 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j6;
        jArr3[3] = (j6 ^ j7) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j8 ^ j7);
        jArr3[5] = jArr3[5] ^ j8;
        implCompactExt(jArr3);
    }

    protected static void implMulwAcc(long j2, long j3, long[] jArr, int i2) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j3 << 2;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i3 = (int) j2;
        long j8 = (jArr2[(-1) - (((-1) - (i3 >>> 3)) | ((-1) - 7))] << 3) ^ jArr2[(i3 + 7) - (7 | i3)];
        long j9 = 0;
        int i4 = 36;
        do {
            int i5 = (int) (j2 >>> i4);
            int i6 = i5 >>> 3;
            long j10 = jArr2[(-1) - (((-1) - i5) | ((-1) - 7))] ^ (jArr2[(i6 + 7) - (i6 | 7)] << 3);
            int i7 = i5 >>> 6;
            long j11 = j10 ^ (jArr2[(i7 + 7) - (i7 | 7)] << 6);
            int i8 = i5 >>> 9;
            long j12 = (j11 ^ (jArr2[(i8 + 7) - (i8 | 7)] << 9)) ^ (jArr2[(-1) - (((-1) - (i5 >>> 12)) | ((-1) - 7))] << 12);
            j8 ^= j12 << i4;
            j9 ^= j12 >>> (-i4);
            i4 -= 15;
        } while (i4 > 0);
        jArr[i2] = jArr[i2] ^ (M49 & j8);
        int i9 = i2 + 1;
        jArr[i9] = jArr[i9] ^ ((j8 >>> 49) ^ (j9 << 15));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        Interleave.expand64To128(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate642 = Nat256.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 6, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 12, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = j6 ^ (j8 >>> 50);
        long j10 = (j5 ^ ((j8 >>> 1) ^ (j8 << 14))) ^ (j7 >>> 50);
        long j11 = j10 >>> 1;
        jArr2[0] = ((j2 ^ (j9 << 63)) ^ j11) ^ (j11 << 15);
        jArr2[1] = (j10 >>> 50) ^ ((j3 ^ (j7 << 63)) ^ ((j9 >>> 1) ^ (j9 << 14)));
        jArr2[2] = ((j4 ^ (j8 << 63)) ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j9 >>> 50);
        jArr2[3] = (-1) - (((-1) - 1) | ((-1) - j10));
    }

    public static void reduce63(long[] jArr, int i2) {
        int i3 = i2 + 3;
        long j2 = jArr[i3];
        long j3 = j2 >>> 1;
        jArr[i2] = (j3 ^ (j3 << 15)) ^ jArr[i2];
        int i4 = i2 + 1;
        jArr[i4] = jArr[i4] ^ (j2 >>> 50);
        jArr[i3] = j2 & 1;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (-1) - (((-1) - ((-1) - (((-1) - jUnshuffle) | ((-1) - 4294967295L)))) & ((-1) - (jUnshuffle2 << 32)));
        long j3 = (jUnshuffle >>> 32) | ((jUnshuffle2 - 4294967296L) - (jUnshuffle2 | (-4294967296L)));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long j4 = ((jUnshuffle3 + 4294967295L) - (jUnshuffle3 | 4294967295L)) ^ (jArr[3] << 32);
        long j5 = jUnshuffle3 >>> 32;
        jArr2[0] = j2 ^ (j3 << 8);
        jArr2[1] = ((j4 ^ (j5 << 8)) ^ (j3 >>> 56)) ^ (j3 << 33);
        jArr2[2] = (j3 >>> 31) ^ (j5 << 33);
        jArr2[3] = jUnshuffle3 >>> 63;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i2, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
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

package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat192.fromBigInteger64(bigInteger);
        reduce29(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    protected static void implCompactExt(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        jArr[0] = j2 ^ (j3 << 55);
        jArr[1] = (j3 >>> 9) ^ (j4 << 46);
        jArr[2] = (j4 >>> 18) ^ (j5 << 37);
        jArr[3] = (j5 >>> 27) ^ (j6 << 28);
        jArr[4] = (j6 >>> 36) ^ (j7 << 19);
        jArr[5] = j7 >>> 45;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = (jArr[2] << 18) ^ (j3 >>> 46);
        long j5 = ((j3 << 9) ^ (j2 >>> 55)) & M55;
        long j6 = (-1) - (((-1) - j2) | ((-1) - M55));
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = (j8 >>> 46) ^ (jArr2[2] << 18);
        long j10 = (j7 >>> 55) ^ (j8 << 9);
        long j11 = (j10 + M55) - (j10 | M55);
        long j12 = (j7 + M55) - (j7 | M55);
        long[] jArr4 = new long[10];
        implMulw(j6, j12, jArr4, 0);
        implMulw(j4, j9, jArr4, 2);
        long j13 = (j6 ^ j5) ^ j4;
        long j14 = (j12 ^ j11) ^ j9;
        implMulw(j13, j14, jArr4, 4);
        long j15 = (j5 << 1) ^ (j4 << 2);
        long j16 = (j11 << 1) ^ (j9 << 2);
        implMulw(j6 ^ j15, j12 ^ j16, jArr4, 6);
        implMulw(j13 ^ j15, j14 ^ j16, jArr4, 8);
        long j17 = jArr4[6];
        long j18 = jArr4[8] ^ j17;
        long j19 = jArr4[7];
        long j20 = jArr4[9] ^ j19;
        long j21 = (j18 << 1) ^ j17;
        long j22 = jArr4[0];
        long j23 = jArr4[1];
        long j24 = (j23 ^ j22) ^ jArr4[4];
        long j25 = j23 ^ jArr4[5];
        long j26 = jArr4[2];
        long j27 = ((j21 ^ j22) ^ (j26 << 4)) ^ (j26 << 1);
        long j28 = jArr4[3];
        long j29 = (((j24 ^ ((j18 ^ (j20 << 1)) ^ j19)) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 55);
        long j30 = (-1) - (((-1) - j27) | ((-1) - M55));
        long j31 = (j25 ^ j20) ^ (j29 >>> 55);
        long j32 = (j30 >>> 1) ^ ((j29 & 1) << 54);
        long j33 = ((j29 & M55) >>> 1) ^ ((j31 & 1) << 54);
        long j34 = j32 ^ (j32 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (-1) - (((-1) - (j38 ^ (j38 << 32))) | ((-1) - M55));
        long j40 = j33 ^ (j39 >>> 54);
        long j41 = j40 ^ (j40 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = (j45 ^ (j45 << 32)) & M55;
        long j47 = (j31 >>> 1) ^ (j46 >>> 54);
        long j48 = j47 ^ (j47 << 1);
        long j49 = j48 ^ (j48 << 2);
        long j50 = j49 ^ (j49 << 4);
        long j51 = j50 ^ (j50 << 8);
        long j52 = j51 ^ (j51 << 16);
        long j53 = j52 ^ (j52 << 32);
        jArr3[0] = j22;
        jArr3[1] = (j24 ^ j39) ^ j26;
        jArr3[2] = ((j25 ^ j46) ^ j39) ^ j28;
        jArr3[3] = j53 ^ j46;
        jArr3[4] = jArr4[2] ^ j53;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
    }

    protected static void implMulw(long j2, long j3, long[] jArr, int i2) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j3 << 2;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        long j8 = jArr2[(-1) - (((-1) - ((int) j2)) | ((-1) - 3))];
        long j9 = 0;
        int i3 = 47;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = (jArr2[7 & i4] ^ (jArr2[(-1) - (((-1) - (i4 >>> 3)) | ((-1) - 7))] << 3)) ^ (jArr2[(-1) - (((-1) - (i4 >>> 6)) | ((-1) - 7))] << 6);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr[i2] = (-1) - (((-1) - M55) | ((-1) - j8));
        jArr[i2 + 1] = (j8 >>> 55) ^ (j9 << 9);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        long j2 = jArr[2];
        jArr2[4] = Interleave.expand32to64((int) j2);
        jArr2[5] = ((long) Interleave.expand8to16((int) (j2 >>> 32))) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate642 = Nat192.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 9, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 9, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 27, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 27, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 81, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat192.createExt64();
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
        long j8 = j5 ^ ((((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)) ^ (j7 >>> 28));
        long j9 = (j4 ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36))) ^ ((j6 >>> 28) ^ (((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)));
        long j10 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j8 >>> 28) ^ (((j8 >>> 35) ^ (j8 >>> 32)) ^ (j8 >>> 29)));
        long j11 = j9 >>> 35;
        jArr2[0] = ((((j2 ^ ((((j8 << 29) ^ (j8 << 32)) ^ (j8 << 35)) ^ (j8 << 36))) ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = (-1) - (((-1) - M35) | ((-1) - j9));
    }

    public static void reduce29(long[] jArr, int i2) {
        int i3 = i2 + 2;
        long j2 = jArr[i3];
        long j3 = j2 >>> 35;
        jArr[i2] = ((j3 << 7) ^ (((j3 << 3) ^ j3) ^ (j3 << 6))) ^ jArr[i2];
        jArr[i3] = j2 & M35;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = ((jUnshuffle + 4294967295L) - (jUnshuffle | 4294967295L)) | (jUnshuffle2 << 32);
        long j3 = jUnshuffle >>> 32;
        long j4 = (-1) - (((-1) - jUnshuffle2) | ((-1) - (-4294967296L)));
        jArrCreate64[0] = (j3 + j4) - (j3 & j4);
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ ((-1) - (((-1) - jUnshuffle3) | ((-1) - 4294967295L)));
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i2, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        return (-1) - (((-1) - ((int) (jArr[0] ^ (jArr[2] >>> 29)))) | ((-1) - 1));
    }
}

package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Interleave;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes2.dex */
public class SecT131Field {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrFromBigInteger64 = Nat192.fromBigInteger64(bigInteger);
        reduce61(jArrFromBigInteger64, 0);
        return jArrFromBigInteger64;
    }

    protected static void implCompactExt(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        jArr[0] = j2 ^ (j3 << 44);
        jArr[1] = (j3 >>> 20) ^ (j4 << 24);
        jArr[2] = ((j4 >>> 40) ^ (j5 << 4)) ^ (j6 << 48);
        jArr[3] = ((j5 >>> 60) ^ (j7 << 28)) ^ (j6 >>> 16);
        jArr[4] = j7 >>> 36;
        jArr[5] = 0;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = (jArr[2] << 40) ^ (j3 >>> 24);
        long j5 = (j4 + M44) - (j4 | M44);
        long j6 = (j3 << 20) ^ (j2 >>> 44);
        long j7 = (j6 + M44) - (j6 | M44);
        long j8 = (-1) - (((-1) - j2) | ((-1) - M44));
        long j9 = jArr2[0];
        long j10 = jArr2[1];
        long j11 = ((j10 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j12 = (-1) - (((-1) - ((j9 >>> 44) ^ (j10 << 20))) | ((-1) - M44));
        long j13 = (j9 + M44) - (j9 | M44);
        long[] jArr4 = new long[10];
        implMulw(j8, j13, jArr4, 0);
        implMulw(j5, j11, jArr4, 2);
        long j14 = (j8 ^ j7) ^ j5;
        long j15 = (j13 ^ j12) ^ j11;
        implMulw(j14, j15, jArr4, 4);
        long j16 = (j7 << 1) ^ (j5 << 2);
        long j17 = (j12 << 1) ^ (j11 << 2);
        implMulw(j8 ^ j16, j13 ^ j17, jArr4, 6);
        implMulw(j14 ^ j16, j15 ^ j17, jArr4, 8);
        long j18 = jArr4[6];
        long j19 = jArr4[8] ^ j18;
        long j20 = jArr4[7];
        long j21 = jArr4[9] ^ j20;
        long j22 = (j19 << 1) ^ j18;
        long j23 = jArr4[0];
        long j24 = jArr4[1];
        long j25 = (j24 ^ j23) ^ jArr4[4];
        long j26 = j24 ^ jArr4[5];
        long j27 = jArr4[2];
        long j28 = ((j22 ^ j23) ^ (j27 << 4)) ^ (j27 << 1);
        long j29 = jArr4[3];
        long j30 = (((j25 ^ ((j19 ^ (j21 << 1)) ^ j20)) ^ (j29 << 4)) ^ (j29 << 1)) ^ (j28 >>> 44);
        long j31 = j28 & M44;
        long j32 = (j26 ^ j21) ^ (j30 >>> 44);
        long j33 = (j31 >>> 1) ^ (((j30 + 1) - (j30 | 1)) << 43);
        long j34 = (((j30 + M44) - (j30 | M44)) >>> 1) ^ ((j32 & 1) << 43);
        long j35 = j33 ^ (j33 << 1);
        long j36 = j35 ^ (j35 << 2);
        long j37 = j36 ^ (j36 << 4);
        long j38 = j37 ^ (j37 << 8);
        long j39 = j38 ^ (j38 << 16);
        long j40 = (-1) - (((-1) - (j39 ^ (j39 << 32))) | ((-1) - M44));
        long j41 = j34 ^ (j40 >>> 43);
        long j42 = j41 ^ (j41 << 1);
        long j43 = j42 ^ (j42 << 2);
        long j44 = j43 ^ (j43 << 4);
        long j45 = j44 ^ (j44 << 8);
        long j46 = j45 ^ (j45 << 16);
        long j47 = (-1) - (((-1) - (j46 ^ (j46 << 32))) | ((-1) - M44));
        long j48 = (j47 >>> 43) ^ (j32 >>> 1);
        long j49 = j48 ^ (j48 << 1);
        long j50 = j49 ^ (j49 << 2);
        long j51 = j50 ^ (j50 << 4);
        long j52 = j51 ^ (j51 << 8);
        long j53 = j52 ^ (j52 << 16);
        long j54 = j53 ^ (j53 << 32);
        jArr3[0] = j23;
        jArr3[1] = (j25 ^ j40) ^ j27;
        jArr3[2] = ((j26 ^ j47) ^ j40) ^ j29;
        jArr3[3] = j54 ^ j47;
        jArr3[4] = jArr4[2] ^ j54;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
    }

    protected static void implMulw(long j2, long j3, long[] jArr, int i2) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j3 << 2;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i3 = (int) j2;
        long j8 = jArr2[(-1) - (((-1) - i3) | ((-1) - 7))] ^ (jArr2[(i3 >>> 3) & 7] << 3);
        int i4 = i3 >>> 6;
        long j9 = (jArr2[(i4 + 7) - (i4 | 7)] << 6) ^ j8;
        long j10 = 0;
        int i5 = 33;
        do {
            int i6 = (int) (j2 >>> i5);
            long j11 = ((jArr2[7 & i6] ^ (jArr2[(i6 >>> 3) & 7] << 3)) ^ (jArr2[(i6 >>> 6) & 7] << 6)) ^ (jArr2[(i6 >>> 9) & 7] << 9);
            j9 ^= j11 << i5;
            j10 ^= j11 >>> (-i5);
            i5 -= 12;
        } while (i5 > 0);
        jArr[i2] = M44 & j9;
        jArr[i2 + 1] = (j9 >>> 44) ^ (j10 << 20);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        long jExpand8to16 = Interleave.expand8to16((int) jArr[2]);
        jArr2[4] = (jExpand8to16 + 4294967295L) - (jExpand8to16 | 4294967295L);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate642 = Nat192.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 16, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 32, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArr2);
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
        long j7 = j5 ^ (j6 >>> 59);
        long j8 = (j4 ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5))) ^ (j7 >>> 59);
        long j9 = j8 >>> 3;
        jArr2[0] = ((((j2 ^ ((j7 << 61) ^ (j7 << 63))) ^ j9) ^ (j9 << 2)) ^ (j9 << 3)) ^ (j9 << 8);
        jArr2[1] = (j8 >>> 59) ^ ((j3 ^ ((j6 << 61) ^ (j6 << 63))) ^ ((((j7 >>> 3) ^ (j7 >>> 1)) ^ j7) ^ (j7 << 5)));
        jArr2[2] = (-1) - (((-1) - M03) | ((-1) - j8));
    }

    public static void reduce61(long[] jArr, int i2) {
        int i3 = i2 + 2;
        long j2 = jArr[i3];
        long j3 = j2 >>> 3;
        jArr[i2] = ((j3 << 8) ^ (((j3 << 2) ^ j3) ^ (j3 << 3))) ^ jArr[i2];
        int i4 = i2 + 1;
        jArr[i4] = jArr[i4] ^ (j2 >>> 59);
        jArr[i3] = (j2 + M03) - (j2 | M03);
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        jArrCreate64[0] = (-1) - (((-1) - (jUnshuffle >>> 32)) & ((-1) - ((jUnshuffle2 - 4294967296L) - (jUnshuffle2 | (-4294967296L)))));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ ((jUnshuffle & 4294967295L) | (jUnshuffle2 << 32));
        jArr2[1] = jArr2[1] ^ ((-1) - (((-1) - jUnshuffle3) | ((-1) - 4294967295L)));
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i2, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        return (-1) - (((-1) - ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1)))) | ((-1) - 1));
    }
}

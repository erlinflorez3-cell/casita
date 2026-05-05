package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr[i2];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[i3];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        iArr3[i4] = (int) j5;
        long j6 = iArr[i2 + 1];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M)) + (((long) iArr2[i3 + 1]) & M);
        iArr3[i4 + 1] = (int) j7;
        long j8 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
        long j9 = iArr2[i3 + 2];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr3[i4 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (((long) iArr[i2 + 3]) & M) + ((-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M)));
        iArr3[i4 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M)));
        iArr3[i4 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[i2 + 5]) & M) + (((long) iArr2[i3 + 5]) & M);
        iArr3[i4 + 5] = (int) j13;
        long j14 = iArr[i2 + 6];
        long j15 = (j13 >>> 32) + ((j14 + M) - (j14 | M)) + (((long) iArr2[i3 + 6]) & M);
        iArr3[i4 + 6] = (int) j15;
        long j16 = (-1) - (((-1) - ((long) iArr[i2 + 7])) | ((-1) - M));
        long j17 = iArr2[i3 + 7];
        long j18 = (j15 >>> 32) + j16 + ((j17 + M) - (j17 | M));
        iArr3[i4 + 7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[0];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        iArr3[0] = (int) j5;
        long j6 = iArr[1];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M)) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M)));
        iArr3[1] = (int) j7;
        long j8 = iArr[2];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = iArr2[2];
        long j11 = (j7 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (((long) iArr[3]) & M) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M)));
        iArr3[3] = (int) j12;
        long j13 = iArr[4];
        long j14 = (j13 + M) - (j13 | M);
        long j15 = iArr2[4];
        long j16 = (j12 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr3[4] = (int) j16;
        long j17 = (-1) - (((-1) - ((long) iArr[5])) | ((-1) - M));
        long j18 = iArr2[5];
        long j19 = (j16 >>> 32) + j17 + ((j18 + M) - (j18 | M));
        iArr3[5] = (int) j19;
        long j20 = (j19 >>> 32) + (((long) iArr[6]) & M) + ((-1) - (((-1) - ((long) iArr2[6])) | ((-1) - M)));
        iArr3[6] = (int) j20;
        long j21 = (j20 >>> 32) + ((-1) - (((-1) - ((long) iArr[7])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M)));
        iArr3[7] = (int) j21;
        return (int) (j21 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (((long) iArr[i2]) & M) + (((long) iArr2[i3]) & M);
        long j3 = iArr3[i4];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        iArr3[i4] = (int) j4;
        long j5 = iArr[i2 + 1];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[i3 + 1];
        int i5 = i4 + 1;
        long j8 = (j4 >>> 32) + j6 + ((j7 + M) - (j7 | M)) + (((long) iArr3[i5]) & M);
        iArr3[i5] = (int) j8;
        long j9 = iArr[i2 + 2];
        long j10 = ((j9 + M) - (j9 | M)) + (((long) iArr2[i3 + 2]) & M);
        int i6 = i4 + 2;
        long j11 = iArr3[i6];
        long j12 = (j8 >>> 32) + j10 + ((j11 + M) - (j11 | M));
        iArr3[i6] = (int) j12;
        int i7 = i4 + 3;
        long j13 = (j12 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))) + (((long) iArr2[i3 + 3]) & M) + (((long) iArr3[i7]) & M);
        iArr3[i7] = (int) j13;
        long j14 = ((long) iArr[i2 + 4]) & M;
        long j15 = iArr2[i3 + 4];
        int i8 = i4 + 4;
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M)) + (((long) iArr3[i8]) & M);
        iArr3[i8] = (int) j16;
        int i9 = i4 + 5;
        long j17 = (j16 >>> 32) + (((long) iArr[i2 + 5]) & M) + (((long) iArr2[i3 + 5]) & M) + (((long) iArr3[i9]) & M);
        iArr3[i9] = (int) j17;
        long j18 = iArr[i2 + 6];
        long j19 = (j18 + M) - (j18 | M);
        long j20 = iArr2[i3 + 6];
        int i10 = i4 + 6;
        long j21 = (j17 >>> 32) + j19 + ((j20 + M) - (j20 | M)) + (((long) iArr3[i10]) & M);
        iArr3[i10] = (int) j21;
        long j22 = iArr[i2 + 7];
        int i11 = i4 + 7;
        long j23 = (j21 >>> 32) + ((j22 + M) - (j22 | M)) + (((long) iArr2[i3 + 7]) & M) + ((-1) - (((-1) - ((long) iArr3[i11])) | ((-1) - M)));
        iArr3[i11] = (int) j23;
        return (int) (j23 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) + (((long) iArr2[0]) & M) + (((long) iArr3[0]) & M);
        iArr3[0] = (int) j2;
        long j3 = iArr[1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = iArr2[1];
        long j6 = (j2 >>> 32) + j4 + ((j5 + M) - (j5 | M)) + ((-1) - (((-1) - ((long) iArr3[1])) | ((-1) - M)));
        iArr3[1] = (int) j6;
        long j7 = (((long) iArr[2]) & M) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M)));
        long j8 = iArr3[2];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr3[2] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
        long j11 = iArr2[3];
        long j12 = j10 + ((j11 + M) - (j11 | M));
        long j13 = iArr3[3];
        long j14 = (j9 >>> 32) + j12 + ((j13 + M) - (j13 | M));
        iArr3[3] = (int) j14;
        long j15 = iArr[4];
        long j16 = (j15 + M) - (j15 | M);
        long j17 = iArr2[4];
        long j18 = (j14 >>> 32) + j16 + ((j17 + M) - (j17 | M)) + ((-1) - (((-1) - ((long) iArr3[4])) | ((-1) - M)));
        iArr3[4] = (int) j18;
        long j19 = iArr[5];
        long j20 = (j18 >>> 32) + ((j19 + M) - (j19 | M)) + (((long) iArr2[5]) & M) + ((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M)));
        iArr3[5] = (int) j20;
        long j21 = ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + (((long) iArr2[6]) & M);
        long j22 = iArr3[6];
        long j23 = (j20 >>> 32) + j21 + ((j22 + M) - (j22 | M));
        iArr3[6] = (int) j23;
        long j24 = (j23 >>> 32) + (((long) iArr[7]) & M) + ((-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr3[7])) | ((-1) - M)));
        iArr3[7] = (int) j24;
        return (int) (j24 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = i4;
        long j3 = ((j2 + M) - (j2 | M)) + (((long) iArr[i2]) & M) + (((long) iArr2[i3]) & M);
        iArr2[i3] = (int) j3;
        int i5 = i3 + 1;
        long j4 = (j3 >>> 32) + (((long) iArr[i2 + 1]) & M) + (((long) iArr2[i5]) & M);
        iArr2[i5] = (int) j4;
        long j5 = iArr[i2 + 2];
        int i6 = i3 + 2;
        long j6 = (j4 >>> 32) + ((j5 + M) - (j5 | M)) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        iArr2[i6] = (int) j6;
        long j7 = ((long) iArr[i2 + 3]) & M;
        int i7 = i3 + 3;
        long j8 = iArr2[i7];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr2[i7] = (int) j9;
        long j10 = iArr[i2 + 4];
        long j11 = (j10 + M) - (j10 | M);
        int i8 = i3 + 4;
        long j12 = iArr2[i8];
        long j13 = (j9 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr2[i8] = (int) j13;
        int i9 = i3 + 5;
        long j14 = (j13 >>> 32) + (((long) iArr[i2 + 5]) & M) + (((long) iArr2[i9]) & M);
        iArr2[i9] = (int) j14;
        long j15 = iArr[i2 + 6];
        int i10 = i3 + 6;
        long j16 = (j14 >>> 32) + ((j15 + M) - (j15 | M)) + ((-1) - (((-1) - ((long) iArr2[i10])) | ((-1) - M)));
        iArr2[i10] = (int) j16;
        long j17 = iArr[i2 + 7];
        int i11 = i3 + 7;
        long j18 = (j16 >>> 32) + ((j17 + M) - (j17 | M)) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i11]))));
        iArr2[i11] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M);
        iArr2[1] = (int) j3;
        long j4 = ((long) iArr[2]) & M;
        long j5 = iArr2[2];
        long j6 = (j3 >>> 32) + j4 + ((j5 + M) - (j5 | M));
        iArr2[2] = (int) j6;
        long j7 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
        long j8 = iArr2[3];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j10;
        long j11 = iArr[5];
        long j12 = (j10 >>> 32) + ((j11 + M) - (j11 | M)) + (((long) iArr2[5]) & M);
        iArr2[5] = (int) j12;
        long j13 = (j12 >>> 32) + ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + (((long) iArr2[6]) & M);
        iArr2[6] = (int) j13;
        long j14 = iArr[7];
        long j15 = (j14 + M) - (j14 | M);
        long j16 = iArr2[7];
        long j17 = (j13 >>> 32) + j15 + ((M + j16) - (M | j16));
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M))) + (((long) iArr2[i3]) & M);
        int i4 = (int) j2;
        iArr[i2] = i4;
        iArr2[i3] = i4;
        int i5 = i2 + 1;
        int i6 = i3 + 1;
        long j3 = (j2 >>> 32) + (((long) iArr[i5]) & M) + (((long) iArr2[i6]) & M);
        int i7 = (int) j3;
        iArr[i5] = i7;
        iArr2[i6] = i7;
        int i8 = i2 + 2;
        long j4 = iArr[i8];
        int i9 = i3 + 2;
        long j5 = (j3 >>> 32) + ((j4 + M) - (j4 | M)) + ((-1) - (((-1) - ((long) iArr2[i9])) | ((-1) - M)));
        int i10 = (int) j5;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        int i12 = i3 + 3;
        long j6 = (j5 >>> 32) + ((-1) - (((-1) - ((long) iArr[i11])) | ((-1) - M))) + (((long) iArr2[i12]) & M);
        int i13 = (int) j6;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i2 + 4;
        long j7 = iArr[i14];
        int i15 = i3 + 4;
        long j8 = (j6 >>> 32) + ((j7 + M) - (j7 | M)) + ((-1) - (((-1) - ((long) iArr2[i15])) | ((-1) - M)));
        int i16 = (int) j8;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i2 + 5;
        long j9 = iArr[i17];
        int i18 = i3 + 5;
        long j10 = (j8 >>> 32) + ((j9 + M) - (j9 | M)) + (((long) iArr2[i18]) & M);
        int i19 = (int) j10;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        int i20 = i2 + 6;
        int i21 = i3 + 6;
        long j11 = (j10 >>> 32) + (((long) iArr[i20]) & M) + ((-1) - (((-1) - ((long) iArr2[i21])) | ((-1) - M)));
        int i22 = (int) j11;
        iArr[i20] = i22;
        iArr2[i21] = i22;
        int i23 = i2 + 7;
        long j12 = (-1) - (((-1) - ((long) iArr[i23])) | ((-1) - M));
        int i24 = i3 + 7;
        long j13 = iArr2[i24];
        long j14 = (j11 >>> 32) + j12 + ((M + j13) - (M | j13));
        int i25 = (int) j14;
        iArr[i23] = i25;
        iArr2[i24] = i25;
        return (int) (j14 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
    }

    public static boolean diff(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        boolean zGte = gte(iArr, i2, iArr2, i3);
        if (zGte) {
            sub(iArr, i2, iArr2, i3, iArr3, i4);
        } else {
            sub(iArr2, i3, iArr, i2, iArr3, i4);
        }
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i2 = 7; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i2 = 3; i2 >= 0; i2--) {
            if (jArr[i2] != jArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArrCreate[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            jArrCreate64[i2] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i2++;
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i2) {
        int i3;
        if (i2 == 0) {
            i3 = iArr[0];
        } else {
            if ((255 & i2) != i2) {
                return 0;
            }
            i3 = iArr[i2 >>> 5] >>> (i2 & 31);
        }
        return (-1) - (((-1) - i3) | ((-1) - 1));
    }

    public static boolean gte(int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 7; i4 >= 0; i4--) {
            int i5 = iArr[i2 + i4] ^ Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE ^ iArr2[i3 + i4];
            if (i5 < i6) {
                return false;
            }
            if (i5 > i6) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 8; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 4; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j4 = iArr2[i3 + 2];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = (-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M));
        long j8 = (-1) - (((-1) - ((long) iArr2[i3 + 5])) | ((-1) - M));
        long j9 = (-1) - (((-1) - ((long) iArr2[i3 + 6])) | ((-1) - M));
        long j10 = (-1) - (((-1) - ((long) iArr2[i3 + 7])) | ((-1) - M));
        long j11 = iArr[i2];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = j12 * j2;
        iArr3[i4] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j3);
        iArr3[i4 + 1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j5);
        iArr3[i4 + 2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j6);
        iArr3[i4 + 3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j7);
        iArr3[i4 + 4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j8);
        iArr3[i4 + 5] = (int) j18;
        long j19 = (j18 >>> 32) + (j12 * j9);
        iArr3[i4 + 6] = (int) j19;
        long j20 = (j19 >>> 32) + (j12 * j10);
        iArr3[i4 + 7] = (int) j20;
        iArr3[i4 + 8] = (int) (j20 >>> 32);
        int i5 = 1;
        while (i5 < 8) {
            int i6 = i4 + 1;
            long j21 = ((long) iArr[i2 + i5]) & M;
            long j22 = (j21 * j2) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j22;
            int i7 = i4 + 2;
            long j23 = (j22 >>> 32) + (j21 * j3) + (((long) iArr3[i7]) & M);
            iArr3[i7] = (int) j23;
            int i8 = i4 + 3;
            long j24 = iArr3[i8];
            long j25 = (j23 >>> 32) + (j21 * j5) + ((j24 + M) - (j24 | M));
            iArr3[i8] = (int) j25;
            int i9 = i4 + 4;
            long j26 = (j25 >>> 32) + (j21 * j6) + ((-1) - (((-1) - ((long) iArr3[i9])) | ((-1) - M)));
            iArr3[i9] = (int) j26;
            int i10 = i4 + 5;
            long j27 = (j26 >>> 32) + (j21 * j7) + (((long) iArr3[i10]) & M);
            iArr3[i10] = (int) j27;
            int i11 = i4 + 6;
            long j28 = (j27 >>> 32) + (j21 * j8) + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j28;
            int i12 = i4 + 7;
            long j29 = (j28 >>> 32) + (j21 * j9) + ((-1) - (((-1) - ((long) iArr3[i12])) | ((-1) - M)));
            iArr3[i12] = (int) j29;
            int i13 = i4 + 8;
            long j30 = (j29 >>> 32) + (j21 * j10) + (((long) iArr3[i13]) & M);
            iArr3[i13] = (int) j30;
            iArr3[i4 + 9] = (int) (j30 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[1];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = iArr2[2];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j9 = ((long) iArr2[4]) & M;
        long j10 = (-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M));
        long j11 = iArr2[6];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
        long j14 = ((long) iArr[0]) & M;
        long j15 = j14 * j3;
        iArr3[0] = (int) j15;
        long j16 = (j15 >>> 32) + (j14 * j5);
        int i2 = 1;
        iArr3[1] = (int) j16;
        long j17 = (j16 >>> 32) + (j14 * j7);
        iArr3[2] = (int) j17;
        long j18 = (j17 >>> 32) + (j14 * j8);
        iArr3[3] = (int) j18;
        long j19 = (j18 >>> 32) + (j14 * j9);
        iArr3[4] = (int) j19;
        long j20 = (j19 >>> 32) + (j14 * j10);
        iArr3[5] = (int) j20;
        long j21 = (j20 >>> 32) + (j14 * j12);
        iArr3[6] = (int) j21;
        long j22 = (j21 >>> 32) + (j14 * j13);
        iArr3[7] = (int) j22;
        iArr3[8] = (int) (j22 >>> 32);
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j23 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
            long j24 = (j23 * j3) + (((long) iArr3[i2]) & M);
            iArr3[i2] = (int) j24;
            int i4 = i2 + 1;
            long j25 = iArr3[i4];
            long j26 = (j24 >>> 32) + (j23 * j5) + ((j25 + M) - (j25 | M));
            iArr3[i4] = (int) j26;
            int i5 = i2 + 2;
            long j27 = (j26 >>> 32) + (j23 * j7) + ((-1) - (((-1) - ((long) iArr3[i5])) | ((-1) - M)));
            iArr3[i5] = (int) j27;
            int i6 = i2 + 3;
            long j28 = iArr3[i6];
            long j29 = (j27 >>> 32) + (j23 * j8) + ((j28 + M) - (j28 | M));
            iArr3[i6] = (int) j29;
            int i7 = i2 + 4;
            long j30 = iArr3[i7];
            long j31 = (j29 >>> 32) + (j23 * j9) + ((j30 + M) - (j30 | M));
            iArr3[i7] = (int) j31;
            int i8 = i2 + 5;
            long j32 = iArr3[i8];
            long j33 = (j31 >>> 32) + (j23 * j10) + ((j32 + M) - (j32 | M));
            iArr3[i8] = (int) j33;
            int i9 = i2 + 6;
            long j34 = (j33 >>> 32) + (j23 * j12) + ((-1) - (((-1) - ((long) iArr3[i9])) | ((-1) - M)));
            iArr3[i9] = (int) j34;
            int i10 = i2 + 7;
            long j35 = iArr3[i10];
            long j36 = (j34 >>> 32) + (j23 * j13) + ((j35 + M) - (j35 | M));
            iArr3[i10] = (int) j36;
            iArr3[i2 + 8] = (int) (j36 >>> 32);
            i2 = i4;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = ((long) i2) & M;
        long j3 = (-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M));
        long j4 = iArr2[i4];
        long j5 = (j2 * j3) + ((j4 + M) - (j4 | M));
        iArr3[i5] = (int) j5;
        long j6 = ((long) iArr[i3 + 1]) & M;
        long j7 = (j5 >>> 32) + (j2 * j6) + j3 + (((long) iArr2[i4 + 1]) & M);
        iArr3[i5 + 1] = (int) j7;
        long j8 = iArr[i3 + 2];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = (j7 >>> 32) + (j2 * j9) + j6 + (((long) iArr2[i4 + 2]) & M);
        iArr3[i5 + 2] = (int) j10;
        long j11 = ((long) iArr[i3 + 3]) & M;
        long j12 = (j10 >>> 32) + (j2 * j11) + j9 + ((-1) - (((-1) - ((long) iArr2[i4 + 3])) | ((-1) - M)));
        iArr3[i5 + 3] = (int) j12;
        long j13 = (-1) - (((-1) - ((long) iArr[i3 + 4])) | ((-1) - M));
        long j14 = (j2 * j13) + j11;
        long j15 = iArr2[i4 + 4];
        long j16 = (j12 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr3[i5 + 4] = (int) j16;
        long j17 = iArr[i3 + 5];
        long j18 = (j17 + M) - (j17 | M);
        long j19 = (j16 >>> 32) + (j2 * j18) + j13 + (((long) iArr2[i4 + 5]) & M);
        iArr3[i5 + 5] = (int) j19;
        long j20 = ((long) iArr[i3 + 6]) & M;
        long j21 = iArr2[i4 + 6];
        long j22 = (j19 >>> 32) + (j2 * j20) + j18 + ((j21 + M) - (j21 | M));
        iArr3[i5 + 6] = (int) j22;
        long j23 = ((long) iArr[i3 + 7]) & M;
        long j24 = (j22 >>> 32) + (j2 * j23) + j20 + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i4 + 7]))));
        iArr3[i5 + 7] = (int) j24;
        return (j24 >>> 32) + j23;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = ((long) i2) & M;
        long j4 = j2 & M;
        long j5 = (j3 * j4) + (((long) iArr[i3]) & M);
        iArr[i3] = (int) j5;
        long j6 = j2 >>> 32;
        int i4 = i3 + 1;
        long j7 = (j5 >>> 32) + (j3 * j6) + j4 + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j7;
        int i5 = i3 + 2;
        long j8 = iArr[i5];
        long j9 = (j7 >>> 32) + j6 + ((j8 + M) - (j8 | M));
        iArr[i5] = (int) j9;
        int i6 = i3 + 3;
        long j10 = (j9 >>> 32) + (((long) iArr[i6]) & M);
        iArr[i6] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 4);
    }

    public static int mul33WordAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = ((long) i2) & M;
        long j3 = i3;
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (j2 * j4) + (((long) iArr[i4]) & M);
        iArr[i4] = (int) j5;
        int i5 = i4 + 1;
        long j6 = (j5 >>> 32) + j4 + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j6;
        int i6 = i4 + 2;
        long j7 = (j6 >>> 32) + (((long) iArr[i6]) & M);
        iArr[i6] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((long) iArr2[i3]) & M;
        long j3 = iArr2[i3 + 1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = iArr2[i3 + 2];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[i3 + 3];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = ((long) iArr2[i3 + 4]) & M;
        long j10 = ((long) iArr2[i3 + 5]) & M;
        long j11 = ((long) iArr2[i3 + 6]) & M;
        long j12 = iArr2[i3 + 7];
        long j13 = (j12 + M) - (j12 | M);
        long j14 = 0;
        int i5 = 0;
        while (i5 < 8) {
            long j15 = ((long) iArr[i2 + i5]) & M;
            long j16 = iArr3[i4];
            long j17 = (j15 * j2) + ((j16 + M) - (j16 | M));
            iArr3[i4] = (int) j17;
            int i6 = i4 + 1;
            long j18 = (j17 >>> 32) + (j15 * j4) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j18;
            int i7 = i4 + 2;
            long j19 = (j18 >>> 32) + (j15 * j6) + (((long) iArr3[i7]) & M);
            iArr3[i7] = (int) j19;
            int i8 = i4 + 3;
            long j20 = (j19 >>> 32) + (j15 * j8) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j20;
            int i9 = i4 + 4;
            long j21 = (j20 >>> 32) + (j15 * j9) + ((-1) - (((-1) - ((long) iArr3[i9])) | ((-1) - M)));
            iArr3[i9] = (int) j21;
            int i10 = i4 + 5;
            long j22 = (j21 >>> 32) + (j15 * j10) + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - M)));
            iArr3[i10] = (int) j22;
            int i11 = i4 + 6;
            long j23 = (j22 >>> 32) + (j15 * j11) + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j23;
            int i12 = i4 + 7;
            long j24 = (j23 >>> 32) + (j15 * j13) + (((long) iArr3[i12]) & M);
            iArr3[i12] = (int) j24;
            int i13 = i4 + 8;
            long j25 = iArr3[i13];
            long j26 = (j24 >>> 32) + j14 + ((j25 + M) - (j25 | M));
            iArr3[i13] = (int) j26;
            j14 = j26 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j14;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0];
        long j3 = M;
        long j4 = (-1) - (((-1) - j2) | ((-1) - M));
        long j5 = (-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M));
        long j6 = iArr2[2];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[3];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = (-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M));
        long j11 = iArr2[5];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = (-1) - (((-1) - ((long) iArr2[6])) | ((-1) - M));
        long j14 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
        long j15 = 0;
        int i2 = 0;
        while (i2 < 8) {
            long j16 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - j3));
            long j17 = ((-1) - (((-1) - ((long) iArr3[i2])) | ((-1) - j3))) + (j16 * j4);
            iArr3[i2] = (int) j17;
            int i3 = i2 + 1;
            long j18 = (j17 >>> 32) + (j16 * j5) + (((long) iArr3[i3]) & j3);
            iArr3[i3] = (int) j18;
            int i4 = i2 + 2;
            long j19 = (j18 >>> 32) + (j16 * j7) + (((long) iArr3[i4]) & j3);
            iArr3[i4] = (int) j19;
            int i5 = i2 + 3;
            long j20 = iArr3[i5];
            long j21 = (j19 >>> 32) + (j16 * j9) + ((j20 + j3) - (j20 | j3));
            iArr3[i5] = (int) j21;
            int i6 = i2 + 4;
            long j22 = (j21 >>> 32) + (j16 * j10) + (((long) iArr3[i6]) & j3);
            iArr3[i6] = (int) j22;
            int i7 = i2 + 5;
            long j23 = (j22 >>> 32) + (j16 * j12) + (((long) iArr3[i7]) & j3);
            iArr3[i7] = (int) j23;
            int i8 = i2 + 6;
            long j24 = (j23 >>> 32) + (j16 * j13) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - j3)));
            iArr3[i8] = (int) j24;
            int i9 = i2 + 7;
            long j25 = (j24 >>> 32) + (j16 * j14) + (((long) iArr3[i9]) & j3);
            iArr3[i9] = (int) j25;
            int i10 = i2 + 8;
            long j26 = (j25 >>> 32) + j15 + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - j3)));
            iArr3[i10] = (int) j26;
            j15 = j26 >>> 32;
            i2 = i3;
            j3 = M;
        }
        return (int) j15;
    }

    public static int mulByWord(int i2, int[] iArr) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr[0];
        long j5 = ((j4 + M) - (j4 | M)) * j3;
        iArr[0] = (int) j5;
        long j6 = iArr[1];
        long j7 = (j5 >>> 32) + (((j6 + M) - (j6 | M)) * j3);
        iArr[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) * j3);
        iArr[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) * j3);
        iArr[3] = (int) j9;
        long j10 = (j9 >>> 32) + ((((long) iArr[4]) & M) * j3);
        iArr[4] = (int) j10;
        long j11 = iArr[5];
        long j12 = (j10 >>> 32) + (((j11 + M) - (j11 | M)) * j3);
        iArr[5] = (int) j12;
        long j13 = (j12 >>> 32) + ((((long) iArr[6]) & M) * j3);
        iArr[6] = (int) j13;
        long j14 = (j13 >>> 32) + (j3 * ((-1) - (((-1) - M) | ((-1) - ((long) iArr[7])))));
        iArr[7] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int mulByWordAddTo(int i2, int[] iArr, int[] iArr2) {
        long j2 = ((long) i2) & M;
        long j3 = ((((long) iArr2[0]) & M) * j2) + (((long) iArr[0]) & M);
        iArr2[0] = (int) j3;
        long j4 = (((long) iArr2[1]) & M) * j2;
        long j5 = iArr[1];
        long j6 = (j3 >>> 32) + j4 + ((j5 + M) - (j5 | M));
        iArr2[1] = (int) j6;
        long j7 = (j6 >>> 32) + (((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))) * j2) + (((long) iArr[2]) & M);
        iArr2[2] = (int) j7;
        long j8 = ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M))) * j2;
        long j9 = iArr[3];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr2[3] = (int) j10;
        long j11 = (j10 >>> 32) + (((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))) * j2) + (((long) iArr[4]) & M);
        iArr2[4] = (int) j11;
        long j12 = iArr2[5];
        long j13 = (j11 >>> 32) + (((j12 + M) - (j12 | M)) * j2) + (((long) iArr[5]) & M);
        iArr2[5] = (int) j13;
        long j14 = (j13 >>> 32) + ((((long) iArr2[6]) & M) * j2) + (((long) iArr[6]) & M);
        iArr2[6] = (int) j14;
        long j15 = iArr2[7];
        long j16 = (j14 >>> 32) + (j2 * ((j15 + M) - (j15 | M))) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr[7]))));
        iArr2[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWord(int i2, int[] iArr, int[] iArr2, int i3) {
        long j2 = ((long) i2) & M;
        long j3 = 0;
        int i4 = 0;
        do {
            long j4 = j3 + (((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M))) * j2);
            iArr2[i3 + i4] = (int) j4;
            j3 = j4 >>> 32;
            i4++;
        } while (i4 < 8);
        return (int) j3;
    }

    public static int mulWordAddTo(int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j2 = ((long) i2) & M;
        long j3 = ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M))) * j2;
        long j4 = iArr2[i4];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        iArr2[i4] = (int) j5;
        long j6 = iArr[i3 + 1];
        long j7 = ((j6 + M) - (j6 | M)) * j2;
        int i5 = i4 + 1;
        long j8 = iArr2[i5];
        long j9 = (j5 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr2[i5] = (int) j9;
        int i6 = i4 + 2;
        long j10 = (j9 >>> 32) + ((((long) iArr[i3 + 2]) & M) * j2) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        iArr2[i6] = (int) j10;
        int i7 = i4 + 3;
        long j11 = (j10 >>> 32) + ((((long) iArr[i3 + 3]) & M) * j2) + ((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M)));
        iArr2[i7] = (int) j11;
        long j12 = iArr[i3 + 4];
        int i8 = i4 + 4;
        long j13 = (j11 >>> 32) + (((j12 + M) - (j12 | M)) * j2) + ((-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M)));
        iArr2[i8] = (int) j13;
        long j14 = (((long) iArr[i3 + 5]) & M) * j2;
        int i9 = i4 + 5;
        long j15 = iArr2[i9];
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr2[i9] = (int) j16;
        long j17 = iArr[i3 + 6];
        int i10 = i4 + 6;
        long j18 = (j16 >>> 32) + (((j17 + M) - (j17 | M)) * j2) + ((-1) - (((-1) - ((long) iArr2[i10])) | ((-1) - M)));
        iArr2[i10] = (int) j18;
        long j19 = iArr[i3 + 7];
        long j20 = j2 * ((j19 + M) - (j19 | M));
        int i11 = i4 + 7;
        long j21 = (j18 >>> 32) + j20 + (((long) iArr2[i11]) & M);
        iArr2[i11] = (int) j21;
        return (int) (j21 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = i2;
        long j4 = (j3 + M) - (j3 | M);
        long j5 = ((-1) - (((-1) - j2) | ((-1) - M))) * j4;
        long j6 = iArr[i3];
        long j7 = j5 + ((j6 + M) - (j6 | M));
        iArr[i3] = (int) j7;
        int i4 = i3 + 1;
        long j8 = iArr[i4];
        long j9 = (j7 >>> 32) + (j4 * (j2 >>> 32)) + ((j8 + M) - (j8 | M));
        iArr[i4] = (int) j9;
        int i5 = i3 + 2;
        long j10 = iArr[i5];
        long j11 = (j9 >>> 32) + ((j10 + M) - (j10 | M));
        iArr[i5] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static void square(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = ((long) iArr[i2]) & M;
        int i4 = 0;
        int i5 = 16;
        int i6 = 7;
        while (true) {
            int i7 = i6 - 1;
            long j3 = ((long) iArr[i2 + i6]) & M;
            long j4 = j3 * j3;
            iArr2[i3 + (i5 - 1)] = (i4 << 31) | ((int) (j4 >>> 33));
            i5 -= 2;
            iArr2[i3 + i5] = (int) (j4 >>> 1);
            i4 = (int) j4;
            if (i7 <= 0) {
                long j5 = j2 * j2;
                long j6 = i4 << 31;
                long j7 = (j6 + M) - (j6 | M);
                long j8 = j5 >>> 33;
                long j9 = (j8 + j7) - (j8 & j7);
                iArr2[i3] = (int) j5;
                int i8 = ((int) (j5 >>> 32)) & 1;
                long j10 = ((long) iArr[i2 + 1]) & M;
                int i9 = i3 + 2;
                long j11 = ((long) iArr2[i9]) & M;
                long j12 = j9 + (j10 * j2);
                int i10 = (int) j12;
                iArr2[i3 + 1] = (-1) - (((-1) - (i10 << 1)) & ((-1) - i8));
                long j13 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
                int i11 = i3 + 3;
                long j14 = (-1) - (((-1) - ((long) iArr2[i11])) | ((-1) - M));
                int i12 = i3 + 4;
                long j15 = (-1) - (((-1) - ((long) iArr2[i12])) | ((-1) - M));
                long j16 = j11 + (j12 >>> 32) + (j13 * j2);
                int i13 = (int) j16;
                iArr2[i9] = (-1) - (((-1) - (i13 << 1)) & ((-1) - (i10 >>> 31)));
                int i14 = i13 >>> 31;
                long j17 = j14 + (j16 >>> 32) + (j13 * j10);
                long j18 = j15 + (j17 >>> 32);
                long j19 = (j17 + M) - (j17 | M);
                long j20 = iArr[i2 + 3];
                long j21 = (j20 + M) - (j20 | M);
                int i15 = i3 + 5;
                long j22 = ((-1) - (((-1) - ((long) iArr2[i15])) | ((-1) - M))) + (j18 >>> 32);
                long j23 = (j18 + M) - (j18 | M);
                int i16 = i3 + 6;
                long j24 = iArr2[i16];
                long j25 = ((j24 + M) - (j24 | M)) + (j22 >>> 32);
                long j26 = j22 & M;
                long j27 = j19 + (j21 * j2);
                int i17 = (int) j27;
                iArr2[i11] = (i17 << 1) | i14;
                int i18 = i17 >>> 31;
                long j28 = j23 + (j27 >>> 32) + (j21 * j10);
                long j29 = j26 + (j28 >>> 32) + (j21 * j13);
                long j30 = j28 & M;
                long j31 = j25 + (j29 >>> 32);
                long j32 = (j29 + M) - (j29 | M);
                long j33 = ((long) iArr[i2 + 4]) & M;
                int i19 = i3 + 7;
                long j34 = iArr2[i19];
                long j35 = ((j34 + M) - (j34 | M)) + (j31 >>> 32);
                long j36 = (j31 + M) - (j31 | M);
                int i20 = i3 + 8;
                long j37 = ((-1) - (((-1) - ((long) iArr2[i20])) | ((-1) - M))) + (j35 >>> 32);
                long j38 = (j35 + M) - (j35 | M);
                long j39 = j30 + (j33 * j2);
                int i21 = (int) j39;
                int i22 = i21 << 1;
                iArr2[i12] = (i22 + i18) - (i22 & i18);
                int i23 = i21 >>> 31;
                long j40 = j32 + (j39 >>> 32) + (j33 * j10);
                long j41 = j36 + (j40 >>> 32) + (j33 * j13);
                long j42 = j40 & M;
                long j43 = j38 + (j41 >>> 32) + (j33 * j21);
                long j44 = (j41 + M) - (j41 | M);
                long j45 = j37 + (j43 >>> 32);
                long j46 = (-1) - (((-1) - j43) | ((-1) - M));
                long j47 = ((long) iArr[i2 + 5]) & M;
                int i24 = i3 + 9;
                long j48 = ((-1) - (((-1) - ((long) iArr2[i24])) | ((-1) - M))) + (j45 >>> 32);
                long j49 = (-1) - (((-1) - j45) | ((-1) - M));
                int i25 = i3 + 10;
                long j50 = (((long) iArr2[i25]) & M) + (j48 >>> 32);
                long j51 = (-1) - (((-1) - j48) | ((-1) - M));
                long j52 = j42 + (j47 * j2);
                int i26 = (int) j52;
                iArr2[i15] = (i26 << 1) | i23;
                int i27 = i26 >>> 31;
                long j53 = j44 + (j52 >>> 32) + (j47 * j10);
                long j54 = j46 + (j53 >>> 32) + (j47 * j13);
                long j55 = (-1) - (((-1) - j53) | ((-1) - M));
                long j56 = j49 + (j54 >>> 32) + (j47 * j21);
                long j57 = (-1) - (((-1) - j54) | ((-1) - M));
                long j58 = j51 + (j56 >>> 32) + (j47 * j33);
                long j59 = j56 & M;
                long j60 = j50 + (j58 >>> 32);
                long j61 = (j58 + M) - (j58 | M);
                long j62 = (-1) - (((-1) - ((long) iArr[i2 + 6])) | ((-1) - M));
                int i28 = i3 + 11;
                long j63 = (((long) iArr2[i28]) & M) + (j60 >>> 32);
                long j64 = j60 & M;
                int i29 = i3 + 12;
                long j65 = (((long) iArr2[i29]) & M) + (j63 >>> 32);
                long j66 = (-1) - (((-1) - j63) | ((-1) - M));
                long j67 = j55 + (j62 * j2);
                int i30 = (int) j67;
                int i31 = i30 << 1;
                iArr2[i16] = (i31 + i27) - (i31 & i27);
                int i32 = i30 >>> 31;
                long j68 = j57 + (j67 >>> 32) + (j62 * j10);
                long j69 = j59 + (j68 >>> 32) + (j62 * j13);
                long j70 = (-1) - (((-1) - j68) | ((-1) - M));
                long j71 = j61 + (j69 >>> 32) + (j62 * j21);
                long j72 = j69 & M;
                long j73 = j64 + (j71 >>> 32) + (j62 * j33);
                long j74 = (j71 + M) - (j71 | M);
                long j75 = j66 + (j73 >>> 32) + (j62 * j47);
                long j76 = (j73 + M) - (j73 | M);
                long j77 = j65 + (j75 >>> 32);
                long j78 = (-1) - (((-1) - j75) | ((-1) - M));
                long j79 = iArr[i2 + 7];
                long j80 = (j79 + M) - (j79 | M);
                int i33 = i3 + 13;
                long j81 = (((long) iArr2[i33]) & M) + (j77 >>> 32);
                long j82 = j77 & M;
                int i34 = i3 + 14;
                long j83 = iArr2[i34];
                long j84 = ((j83 + M) - (j83 | M)) + (j81 >>> 32);
                long j85 = (M + j81) - (M | j81);
                long j86 = j70 + (j2 * j80);
                int i35 = (int) j86;
                iArr2[i19] = (-1) - (((-1) - (i35 << 1)) & ((-1) - i32));
                int i36 = i35 >>> 31;
                long j87 = j72 + (j86 >>> 32) + (j10 * j80);
                long j88 = j74 + (j87 >>> 32) + (j80 * j13);
                long j89 = j76 + (j88 >>> 32) + (j80 * j21);
                long j90 = j78 + (j89 >>> 32) + (j80 * j33);
                long j91 = j82 + (j90 >>> 32) + (j80 * j47);
                long j92 = j85 + (j91 >>> 32) + (j80 * j62);
                long j93 = j84 + (j92 >>> 32);
                int i37 = (int) j87;
                int i38 = i37 << 1;
                iArr2[i20] = (i36 + i38) - (i36 & i38);
                int i39 = i37 >>> 31;
                int i40 = (int) j88;
                iArr2[i24] = i39 | (i40 << 1);
                int i41 = i40 >>> 31;
                int i42 = (int) j89;
                iArr2[i25] = i41 | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = (int) j90;
                int i45 = i44 << 1;
                iArr2[i28] = (i43 + i45) - (i43 & i45);
                int i46 = i44 >>> 31;
                int i47 = (int) j91;
                iArr2[i29] = (-1) - (((-1) - i46) & ((-1) - (i47 << 1)));
                int i48 = (int) j92;
                iArr2[i33] = (i47 >>> 31) | (i48 << 1);
                int i49 = i48 >>> 31;
                int i50 = (int) j93;
                int i51 = i50 << 1;
                iArr2[i34] = (i49 + i51) - (i49 & i51);
                int i52 = i50 >>> 31;
                int i53 = i3 + 15;
                iArr2[i53] = i52 | ((iArr2[i53] + ((int) (j93 >>> 32))) << 1);
                return;
            }
            i6 = i7;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = (-1) - (((-1) - ((long) iArr[0])) | ((-1) - M));
        int i2 = 16;
        int i3 = 0;
        int i4 = 7;
        while (true) {
            int i5 = i4 - 1;
            long j3 = (-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M));
            long j4 = j3 * j3;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j4 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                long j6 = (j5 >>> 33) | ((-1) - (((-1) - ((long) (i3 << 31))) | ((-1) - M)));
                iArr2[0] = (int) j5;
                int i6 = (-1) - (((-1) - ((int) (j5 >>> 32))) | ((-1) - 1));
                long j7 = iArr[1];
                long j8 = (j7 + M) - (j7 | M);
                long j9 = ((long) iArr2[2]) & M;
                long j10 = j6 + (j8 * j2);
                int i7 = (int) j10;
                iArr2[1] = (-1) - (((-1) - (i7 << 1)) & ((-1) - i6));
                int i8 = i7 >>> 31;
                long j11 = j9 + (j10 >>> 32);
                long j12 = (-1) - (((-1) - ((long) iArr[2])) | ((-1) - M));
                long j13 = iArr2[3];
                long j14 = (j13 + M) - (j13 | M);
                long j15 = iArr2[4];
                long j16 = (j15 + M) - (j15 | M);
                long j17 = j11 + (j12 * j2);
                int i9 = (int) j17;
                int i10 = i9 << 1;
                iArr2[2] = (i10 + i8) - (i10 & i8);
                int i11 = i9 >>> 31;
                long j18 = j14 + (j17 >>> 32) + (j12 * j8);
                long j19 = j16 + (j18 >>> 32);
                long j20 = j18 & M;
                long j21 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
                long j22 = ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))) + (j19 >>> 32);
                long j23 = (j19 + M) - (j19 | M);
                long j24 = iArr2[6];
                long j25 = ((j24 + M) - (j24 | M)) + (j22 >>> 32);
                long j26 = (j22 + M) - (j22 | M);
                long j27 = j20 + (j21 * j2);
                int i12 = (int) j27;
                iArr2[3] = (-1) - (((-1) - (i12 << 1)) & ((-1) - i11));
                long j28 = j23 + (j27 >>> 32) + (j21 * j8);
                long j29 = j26 + (j28 >>> 32) + (j21 * j12);
                long j30 = (j28 + M) - (j28 | M);
                long j31 = j25 + (j29 >>> 32);
                long j32 = (j29 + M) - (j29 | M);
                long j33 = (-1) - (((-1) - ((long) iArr[4])) | ((-1) - M));
                long j34 = (((long) iArr2[7]) & M) + (j31 >>> 32);
                long j35 = (j31 + M) - (j31 | M);
                long j36 = ((-1) - (((-1) - ((long) iArr2[8])) | ((-1) - M))) + (j34 >>> 32);
                long j37 = j34 & M;
                long j38 = j30 + (j33 * j2);
                int i13 = (int) j38;
                iArr2[4] = (i13 << 1) | (i12 >>> 31);
                int i14 = i13 >>> 31;
                long j39 = j32 + (j38 >>> 32) + (j33 * j8);
                long j40 = j35 + (j39 >>> 32) + (j33 * j12);
                long j41 = j39 & M;
                long j42 = j37 + (j40 >>> 32) + (j33 * j21);
                long j43 = (-1) - (((-1) - j40) | ((-1) - M));
                long j44 = j36 + (j42 >>> 32);
                long j45 = j42 & M;
                long j46 = (-1) - (((-1) - ((long) iArr[5])) | ((-1) - M));
                long j47 = iArr2[9];
                long j48 = ((j47 + M) - (j47 | M)) + (j44 >>> 32);
                long j49 = (-1) - (((-1) - j44) | ((-1) - M));
                long j50 = ((-1) - (((-1) - ((long) iArr2[10])) | ((-1) - M))) + (j48 >>> 32);
                long j51 = (-1) - (((-1) - j48) | ((-1) - M));
                long j52 = j41 + (j46 * j2);
                int i15 = (int) j52;
                iArr2[5] = (-1) - (((-1) - (i15 << 1)) & ((-1) - i14));
                int i16 = i15 >>> 31;
                long j53 = j43 + (j52 >>> 32) + (j46 * j8);
                long j54 = j45 + (j53 >>> 32) + (j46 * j12);
                long j55 = (-1) - (((-1) - j53) | ((-1) - M));
                long j56 = j49 + (j54 >>> 32) + (j46 * j21);
                long j57 = j54 & M;
                long j58 = j51 + (j56 >>> 32) + (j46 * j33);
                long j59 = j56 & M;
                long j60 = j50 + (j58 >>> 32);
                long j61 = j58 & M;
                long j62 = (-1) - (((-1) - ((long) iArr[6])) | ((-1) - M));
                long j63 = (((long) iArr2[11]) & M) + (j60 >>> 32);
                long j64 = (j60 + M) - (j60 | M);
                long j65 = iArr2[12];
                long j66 = ((j65 + M) - (j65 | M)) + (j63 >>> 32);
                long j67 = j63 & M;
                long j68 = j55 + (j62 * j2);
                int i17 = (int) j68;
                int i18 = i17 << 1;
                iArr2[6] = (i18 + i16) - (i18 & i16);
                long j69 = j57 + (j68 >>> 32) + (j62 * j8);
                long j70 = j59 + (j69 >>> 32) + (j62 * j12);
                long j71 = (-1) - (((-1) - j69) | ((-1) - M));
                long j72 = j61 + (j70 >>> 32) + (j62 * j21);
                long j73 = (-1) - (((-1) - j70) | ((-1) - M));
                long j74 = j64 + (j72 >>> 32) + (j62 * j33);
                long j75 = j72 & M;
                long j76 = j67 + (j74 >>> 32) + (j62 * j46);
                long j77 = j74 & M;
                long j78 = j66 + (j76 >>> 32);
                long j79 = (-1) - (((-1) - j76) | ((-1) - M));
                long j80 = iArr[7];
                long j81 = (j80 + M) - (j80 | M);
                long j82 = iArr2[13];
                long j83 = ((j82 + M) - (j82 | M)) + (j78 >>> 32);
                long j84 = (-1) - (((-1) - j78) | ((-1) - M));
                long j85 = (((long) iArr2[14]) & M) + (j83 >>> 32);
                long j86 = M & j83;
                long j87 = j71 + (j2 * j81);
                int i19 = (int) j87;
                iArr2[7] = (i17 >>> 31) | (i19 << 1);
                long j88 = j73 + (j87 >>> 32) + (j81 * j8);
                long j89 = j75 + (j88 >>> 32) + (j81 * j12);
                long j90 = j77 + (j89 >>> 32) + (j81 * j21);
                long j91 = j79 + (j90 >>> 32) + (j81 * j33);
                long j92 = j84 + (j91 >>> 32) + (j81 * j46);
                long j93 = j86 + (j92 >>> 32) + (j81 * j62);
                long j94 = j85 + (j93 >>> 32);
                int i20 = (int) j88;
                iArr2[8] = (-1) - (((-1) - (i19 >>> 31)) & ((-1) - (i20 << 1)));
                int i21 = i20 >>> 31;
                int i22 = (int) j89;
                iArr2[9] = (-1) - (((-1) - i21) & ((-1) - (i22 << 1)));
                int i23 = i22 >>> 31;
                int i24 = (int) j90;
                iArr2[10] = (-1) - (((-1) - i23) & ((-1) - (i24 << 1)));
                int i25 = (int) j91;
                iArr2[11] = (i24 >>> 31) | (i25 << 1);
                int i26 = (int) j92;
                iArr2[12] = (i25 >>> 31) | (i26 << 1);
                int i27 = (int) j93;
                iArr2[13] = (-1) - (((-1) - (i26 >>> 31)) & ((-1) - (i27 << 1)));
                int i28 = i27 >>> 31;
                int i29 = (int) j94;
                iArr2[14] = (-1) - (((-1) - i28) & ((-1) - (i29 << 1)));
                iArr2[15] = (-1) - (((-1) - (i29 >>> 31)) & ((-1) - ((iArr2[15] + ((int) (j94 >>> 32))) << 1)));
                return;
            }
            i4 = i5;
        }
    }

    public static int sub(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        long j3 = iArr2[i3];
        long j4 = j2 - ((j3 + M) - (j3 | M));
        iArr3[i4] = (int) j4;
        long j5 = iArr[i2 + 1];
        long j6 = (j4 >> 32) + (((j5 + M) - (j5 | M)) - (((long) iArr2[i3 + 1]) & M));
        iArr3[i4 + 1] = (int) j6;
        long j7 = (j6 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M))));
        iArr3[i4 + 2] = (int) j7;
        long j8 = (j7 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))) - (((long) iArr2[i3 + 3]) & M));
        iArr3[i4 + 3] = (int) j8;
        long j9 = iArr[i2 + 4];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr2[i3 + 4];
        long j12 = (j8 >> 32) + (j10 - ((j11 + M) - (j11 | M)));
        iArr3[i4 + 4] = (int) j12;
        long j13 = (j12 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M))) - (((long) iArr2[i3 + 5]) & M));
        iArr3[i4 + 5] = (int) j13;
        long j14 = iArr[i2 + 6];
        long j15 = (j13 >> 32) + (((j14 + M) - (j14 | M)) - (((long) iArr2[i3 + 6]) & M));
        iArr3[i4 + 6] = (int) j15;
        long j16 = (j15 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 7])) | ((-1) - M))) - (((long) iArr2[i3 + 7]) & M));
        iArr3[i4 + 7] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) - ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j2;
        long j3 = (j2 >> 32) + (((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j3;
        long j4 = iArr[2];
        long j5 = (j3 >> 32) + (((j4 + M) - (j4 | M)) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j5;
        long j6 = iArr[3];
        long j7 = (j5 >> 32) + (((j6 + M) - (j6 | M)) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[4]) & M) - (((long) iArr2[4]) & M));
        iArr3[4] = (int) j8;
        long j9 = ((long) iArr[5]) & M;
        long j10 = iArr2[5];
        long j11 = (j8 >> 32) + (j9 - ((j10 + M) - (j10 | M)));
        iArr3[5] = (int) j11;
        long j12 = iArr[6];
        long j13 = (j12 + M) - (j12 | M);
        long j14 = iArr2[6];
        long j15 = (j11 >> 32) + (j13 - ((j14 + M) - (j14 | M)));
        iArr3[6] = (int) j15;
        long j16 = iArr[7];
        long j17 = (j15 >> 32) + (((j16 + M) - (j16 | M)) - (((long) iArr2[7]) & M));
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((-1) - (((-1) - ((long) iArr3[0])) | ((-1) - M))) - (((long) iArr[0]) & M)) - ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j2;
        long j3 = iArr3[1];
        long j4 = (j2 >> 32) + ((((j3 + M) - (j3 | M)) - (((long) iArr[1]) & M)) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j4;
        long j5 = iArr3[2];
        long j6 = (j4 >> 32) + ((((j5 + M) - (j5 | M)) - (((long) iArr[2]) & M)) - ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))));
        iArr3[2] = (int) j6;
        long j7 = (j6 >> 32) + ((((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M))) - (((long) iArr[3]) & M)) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j7;
        long j8 = ((-1) - (((-1) - ((long) iArr3[4])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M)));
        long j9 = iArr2[4];
        long j10 = (j7 >> 32) + (j8 - ((j9 + M) - (j9 | M)));
        iArr3[4] = (int) j10;
        long j11 = (j10 >> 32) + ((((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))));
        iArr3[5] = (int) j11;
        long j12 = (j11 >> 32) + ((((-1) - (((-1) - ((long) iArr3[6])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M)))) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j12;
        long j13 = (-1) - (((-1) - ((long) iArr3[7])) | ((-1) - M));
        long j14 = iArr[7];
        long j15 = (j12 >> 32) + ((j13 - ((j14 + M) - (j14 | M))) - (((long) iArr2[7]) & M));
        iArr3[7] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = (((long) iArr2[i3]) & M) - (((long) iArr[i2]) & M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >> 32) + ((((long) iArr2[i4]) & M) - (((long) iArr[i2 + 1]) & M));
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = iArr2[i5];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = iArr[i2 + 2];
        long j7 = (j3 >> 32) + (j5 - ((j6 + M) - (j6 | M)));
        iArr2[i5] = (int) j7;
        int i6 = i3 + 3;
        long j8 = iArr2[i6];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = iArr[i2 + 3];
        long j11 = (j7 >> 32) + (j9 - ((j10 + M) - (j10 | M)));
        iArr2[i6] = (int) j11;
        int i7 = i3 + 4;
        long j12 = (j11 >> 32) + (((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))));
        iArr2[i7] = (int) j12;
        int i8 = i3 + 5;
        long j13 = (-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M));
        long j14 = iArr[i2 + 5];
        long j15 = (j12 >> 32) + (j13 - ((j14 + M) - (j14 | M)));
        iArr2[i8] = (int) j15;
        int i9 = i3 + 6;
        long j16 = (-1) - (((-1) - ((long) iArr2[i9])) | ((-1) - M));
        long j17 = iArr[i2 + 6];
        long j18 = (j15 >> 32) + (j16 - ((j17 + M) - (j17 | M)));
        iArr2[i9] = (int) j18;
        int i10 = i3 + 7;
        long j19 = (-1) - (((-1) - ((long) iArr2[i10])) | ((-1) - M));
        long j20 = iArr[i2 + 7];
        long j21 = (j18 >> 32) + (j19 - ((j20 + M) - (j20 | M)));
        iArr2[i10] = (int) j21;
        return (int) (j21 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & M) - ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M)));
        iArr2[0] = (int) j2;
        long j3 = ((long) iArr2[1]) & M;
        long j4 = iArr[1];
        long j5 = (j2 >> 32) + (j3 - ((j4 + M) - (j4 | M)));
        iArr2[1] = (int) j5;
        long j6 = iArr2[2];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr[2];
        long j9 = (j5 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr2[2] = (int) j9;
        long j10 = (j9 >> 32) + ((((long) iArr2[3]) & M) - (((long) iArr[3]) & M));
        iArr2[3] = (int) j10;
        long j11 = iArr2[4];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = iArr[4];
        long j14 = (j10 >> 32) + (j12 - ((j13 + M) - (j13 | M)));
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + (((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))) - (((long) iArr[5]) & M));
        iArr2[5] = (int) j15;
        long j16 = ((long) iArr2[6]) & M;
        long j17 = iArr[6];
        long j18 = (j15 >> 32) + (j16 - ((j17 + M) - (j17 | M)));
        iArr2[6] = (int) j18;
        long j19 = iArr2[7];
        long j20 = (j18 >> 32) + (((j19 + M) - (j19 | M)) - (M & ((long) iArr[7])));
        iArr2[7] = (int) j20;
        return (int) (j20 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, (7 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 4; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                Pack.longToBigEndian(j2, bArr, (3 - i2) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }
}

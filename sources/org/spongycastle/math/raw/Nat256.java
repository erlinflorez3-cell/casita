package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        long j3 = iArr2[i3];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        iArr3[i4] = (int) j4;
        long j5 = iArr[i2 + 1];
        long j6 = (j4 >>> 32) + ((j5 + M) - (j5 | M)) + (((long) iArr2[i3 + 1]) & M);
        iArr3[i4 + 1] = (int) j6;
        long j7 = iArr[i2 + 2];
        long j8 = (j6 >>> 32) + ((j7 + M) - (j7 | M)) + ((-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M)));
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & M;
        long j10 = iArr2[i3 + 3];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr3[i4 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))) + (((long) iArr2[i3 + 4]) & M);
        iArr3[i4 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3 + 5])) | ((-1) - M)));
        iArr3[i4 + 5] = (int) j13;
        long j14 = (-1) - (((-1) - ((long) iArr[i2 + 6])) | ((-1) - M));
        long j15 = iArr2[i3 + 6];
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr3[i4 + 6] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[i2 + 7]) & M) + ((-1) - (((-1) - ((long) iArr2[i3 + 7])) | ((-1) - M)));
        iArr3[i4 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[1]) & M;
        long j4 = iArr2[1];
        long j5 = (j2 >>> 32) + j3 + ((j4 + M) - (j4 | M));
        iArr3[1] = (int) j5;
        long j6 = iArr[2];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[2];
        long j9 = (j5 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr3[2] = (int) j9;
        long j10 = iArr[3];
        long j11 = (j9 >>> 32) + ((j10 + M) - (j10 | M)) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M)));
        iArr3[3] = (int) j11;
        long j12 = iArr[4];
        long j13 = (j11 >>> 32) + ((j12 + M) - (j12 | M)) + (((long) iArr2[4]) & M);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[5]) & M) + ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M)));
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + (((long) iArr2[6]) & M);
        iArr3[6] = (int) j15;
        long j16 = (-1) - (((-1) - ((long) iArr[7])) | ((-1) - M));
        long j17 = iArr2[7];
        long j18 = (j15 >>> 32) + j16 + ((j17 + M) - (j17 | M));
        iArr3[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr[i2];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[i3];
        long j5 = j3 + ((j4 + M) - (j4 | M)) + (((long) iArr3[i4]) & M);
        iArr3[i4] = (int) j5;
        int i5 = i4 + 1;
        long j6 = (j5 >>> 32) + (((long) iArr[i2 + 1]) & M) + ((-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M))) + (((long) iArr3[i5]) & M);
        iArr3[i5] = (int) j6;
        long j7 = (((long) iArr[i2 + 2]) & M) + ((-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M)));
        int i6 = i4 + 2;
        long j8 = iArr3[i6];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr3[i6] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M));
        long j11 = iArr2[i3 + 3];
        long j12 = j10 + ((j11 + M) - (j11 | M));
        int i7 = i4 + 3;
        long j13 = iArr3[i7];
        long j14 = (j9 >>> 32) + j12 + ((j13 + M) - (j13 | M));
        iArr3[i7] = (int) j14;
        long j15 = ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M)));
        int i8 = i4 + 4;
        long j16 = iArr3[i8];
        long j17 = (j14 >>> 32) + j15 + ((j16 + M) - (j16 | M));
        iArr3[i8] = (int) j17;
        int i9 = i4 + 5;
        long j18 = (j17 >>> 32) + (((long) iArr[i2 + 5]) & M) + (((long) iArr2[i3 + 5]) & M) + (((long) iArr3[i9]) & M);
        iArr3[i9] = (int) j18;
        long j19 = (((long) iArr[i2 + 6]) & M) + ((-1) - (((-1) - ((long) iArr2[i3 + 6])) | ((-1) - M)));
        int i10 = i4 + 6;
        long j20 = iArr3[i10];
        long j21 = (j18 >>> 32) + j19 + ((j20 + M) - (j20 | M));
        iArr3[i10] = (int) j21;
        long j22 = (-1) - (((-1) - ((long) iArr[i2 + 7])) | ((-1) - M));
        long j23 = iArr2[i3 + 7];
        int i11 = i4 + 7;
        long j24 = (j21 >>> 32) + j22 + ((j23 + M) - (j23 | M)) + ((-1) - (((-1) - ((long) iArr3[i11])) | ((-1) - M)));
        iArr3[i11] = (int) j24;
        return (int) (j24 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr[0]) & M;
        long j3 = iArr2[0];
        long j4 = j2 + ((j3 + M) - (j3 | M)) + (((long) iArr3[0]) & M);
        iArr3[0] = (int) j4;
        long j5 = (j4 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M) + (((long) iArr3[1]) & M);
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))) + (((long) iArr3[2]) & M);
        iArr3[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[3]) & M) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M)));
        iArr3[3] = (int) j7;
        long j8 = ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M)));
        long j9 = iArr3[4];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr3[4] = (int) j10;
        long j11 = (j10 >>> 32) + ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M))) + (((long) iArr2[5]) & M) + ((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M)));
        iArr3[5] = (int) j11;
        long j12 = iArr[6];
        long j13 = ((j12 + M) - (j12 | M)) + (((long) iArr2[6]) & M);
        long j14 = iArr3[6];
        long j15 = (j11 >>> 32) + j13 + ((j14 + M) - (j14 | M));
        iArr3[6] = (int) j15;
        long j16 = iArr[7];
        long j17 = ((j16 + M) - (j16 | M)) + ((-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M)));
        long j18 = iArr3[7];
        long j19 = (j15 >>> 32) + j17 + ((j18 + M) - (j18 | M));
        iArr3[7] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = ((-1) - (((-1) - ((long) i4)) | ((-1) - M))) + (((long) iArr[i2]) & M) + (((long) iArr2[i3]) & M);
        iArr2[i3] = (int) j2;
        long j3 = iArr[i2 + 1];
        int i5 = i3 + 1;
        long j4 = (j2 >>> 32) + ((j3 + M) - (j3 | M)) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j4;
        long j5 = iArr[i2 + 2];
        int i6 = i3 + 2;
        long j6 = (j4 >>> 32) + ((j5 + M) - (j5 | M)) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        iArr2[i6] = (int) j6;
        long j7 = iArr[i2 + 3];
        long j8 = (j7 + M) - (j7 | M);
        int i7 = i3 + 3;
        long j9 = iArr2[i7];
        long j10 = (j6 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr2[i7] = (int) j10;
        long j11 = (-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M));
        int i8 = i3 + 4;
        long j12 = iArr2[i8];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr2[i8] = (int) j13;
        long j14 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
        int i9 = i3 + 5;
        long j15 = iArr2[i9];
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr2[i9] = (int) j16;
        long j17 = (-1) - (((-1) - ((long) iArr[i2 + 6])) | ((-1) - M));
        int i10 = i3 + 6;
        long j18 = iArr2[i10];
        long j19 = (j16 >>> 32) + j17 + ((j18 + M) - (j18 | M));
        iArr2[i10] = (int) j19;
        int i11 = i3 + 7;
        long j20 = (j19 >>> 32) + (((long) iArr[i2 + 7]) & M) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i11]))));
        iArr2[i11] = (int) j20;
        return (int) (j20 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = (-1) - (((-1) - ((long) iArr[0])) | ((-1) - M));
        long j3 = iArr2[0];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        iArr2[0] = (int) j4;
        long j5 = (j4 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M);
        iArr2[1] = (int) j5;
        long j6 = ((long) iArr[2]) & M;
        long j7 = iArr2[2];
        long j8 = (j5 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M)));
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M))) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j10;
        long j11 = (-1) - (((-1) - ((long) iArr[5])) | ((-1) - M));
        long j12 = iArr2[5];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr2[5] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[6]) & M) + (((long) iArr2[6]) & M);
        iArr2[6] = (int) j14;
        long j15 = iArr[7];
        long j16 = (j15 + M) - (j15 | M);
        long j17 = iArr2[7];
        long j18 = (j14 >>> 32) + j16 + ((M + j17) - (M | j17));
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        long j3 = iArr2[i3];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        int i4 = (int) j4;
        iArr[i2] = i4;
        iArr2[i3] = i4;
        int i5 = i2 + 1;
        int i6 = i3 + 1;
        long j5 = (j4 >>> 32) + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        int i7 = (int) j5;
        iArr[i5] = i7;
        iArr2[i6] = i7;
        int i8 = i2 + 2;
        long j6 = ((long) iArr[i8]) & M;
        int i9 = i3 + 2;
        long j7 = iArr2[i9];
        long j8 = (j5 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        int i10 = (int) j8;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        int i12 = i3 + 3;
        long j9 = (j8 >>> 32) + (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M);
        int i13 = (int) j9;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i2 + 4;
        int i15 = i3 + 4;
        long j10 = (j9 >>> 32) + (((long) iArr[i14]) & M) + ((-1) - (((-1) - ((long) iArr2[i15])) | ((-1) - M)));
        int i16 = (int) j10;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i2 + 5;
        long j11 = ((long) iArr[i17]) & M;
        int i18 = i3 + 5;
        long j12 = iArr2[i18];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        int i19 = (int) j13;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        int i20 = i2 + 6;
        long j14 = iArr[i20];
        long j15 = (j14 + M) - (j14 | M);
        int i21 = i3 + 6;
        long j16 = iArr2[i21];
        long j17 = (j13 >>> 32) + j15 + ((j16 + M) - (j16 | M));
        int i22 = (int) j17;
        iArr[i20] = i22;
        iArr2[i21] = i22;
        int i23 = i2 + 7;
        int i24 = i3 + 7;
        long j18 = (j17 >>> 32) + ((-1) - (((-1) - ((long) iArr[i23])) | ((-1) - M))) + (M & ((long) iArr2[i24]));
        int i25 = (int) j18;
        iArr[i23] = i25;
        iArr2[i24] = i25;
        return (int) (j18 >>> 32);
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
            i3 = iArr[i2 >>> 5] >>> ((-1) - (((-1) - i2) | ((-1) - 31)));
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
        long j7 = ((long) iArr2[i3 + 4]) & M;
        long j8 = iArr2[i3 + 5];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = ((long) iArr2[i3 + 6]) & M;
        long j11 = ((long) iArr2[i3 + 7]) & M;
        long j12 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
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
        long j18 = (j17 >>> 32) + (j12 * j9);
        iArr3[i4 + 5] = (int) j18;
        long j19 = (j18 >>> 32) + (j12 * j10);
        iArr3[i4 + 6] = (int) j19;
        long j20 = (j19 >>> 32) + (j12 * j11);
        iArr3[i4 + 7] = (int) j20;
        iArr3[i4 + 8] = (int) (j20 >>> 32);
        int i5 = 1;
        while (i5 < 8) {
            int i6 = i4 + 1;
            long j21 = iArr[i2 + i5];
            long j22 = (j21 + M) - (j21 | M);
            long j23 = (j22 * j2) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j23;
            int i7 = i4 + 2;
            long j24 = (j23 >>> 32) + (j22 * j3) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j24;
            int i8 = i4 + 3;
            long j25 = (j24 >>> 32) + (j22 * j5) + (((long) iArr3[i8]) & M);
            iArr3[i8] = (int) j25;
            int i9 = i4 + 4;
            long j26 = (j25 >>> 32) + (j22 * j6) + (((long) iArr3[i9]) & M);
            iArr3[i9] = (int) j26;
            int i10 = i4 + 5;
            long j27 = iArr3[i10];
            long j28 = (j26 >>> 32) + (j22 * j7) + ((j27 + M) - (j27 | M));
            iArr3[i10] = (int) j28;
            int i11 = i4 + 6;
            long j29 = iArr3[i11];
            long j30 = (j28 >>> 32) + (j22 * j9) + ((j29 + M) - (j29 | M));
            iArr3[i11] = (int) j30;
            int i12 = i4 + 7;
            long j31 = (j30 >>> 32) + (j22 * j10) + (((long) iArr3[i12]) & M);
            iArr3[i12] = (int) j31;
            int i13 = i4 + 8;
            long j32 = (j31 >>> 32) + (j22 * j11) + (((long) iArr3[i13]) & M);
            iArr3[i13] = (int) j32;
            iArr3[i4 + 9] = (int) (j32 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & M;
        long j3 = (-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M));
        long j4 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
        long j5 = iArr2[3];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[4];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = (-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M));
        long j10 = iArr2[6];
        long j11 = (j10 + M) - (j10 | M);
        long j12 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
        long j13 = (-1) - (((-1) - ((long) iArr[0])) | ((-1) - M));
        long j14 = j13 * j2;
        iArr3[0] = (int) j14;
        long j15 = (j14 >>> 32) + (j13 * j3);
        int i2 = 1;
        iArr3[1] = (int) j15;
        long j16 = (j15 >>> 32) + (j13 * j4);
        iArr3[2] = (int) j16;
        long j17 = (j16 >>> 32) + (j13 * j6);
        iArr3[3] = (int) j17;
        long j18 = (j17 >>> 32) + (j13 * j8);
        iArr3[4] = (int) j18;
        long j19 = (j18 >>> 32) + (j13 * j9);
        iArr3[5] = (int) j19;
        long j20 = (j19 >>> 32) + (j13 * j11);
        iArr3[6] = (int) j20;
        long j21 = (j20 >>> 32) + (j13 * j12);
        iArr3[7] = (int) j21;
        iArr3[8] = (int) (j21 >>> 32);
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j22 = ((long) iArr[i2]) & M;
            long j23 = (j22 * j2) + (((long) iArr3[i2]) & M);
            iArr3[i2] = (int) j23;
            int i4 = i2 + 1;
            long j24 = (j23 >>> 32) + (j22 * j3) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - M)));
            iArr3[i4] = (int) j24;
            int i5 = i2 + 2;
            long j25 = (j24 >>> 32) + (j22 * j4) + ((-1) - (((-1) - ((long) iArr3[i5])) | ((-1) - M)));
            iArr3[i5] = (int) j25;
            int i6 = i2 + 3;
            long j26 = (j25 >>> 32) + (j22 * j6) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j26;
            int i7 = i2 + 4;
            long j27 = iArr3[i7];
            long j28 = (j26 >>> 32) + (j22 * j8) + ((j27 + M) - (j27 | M));
            iArr3[i7] = (int) j28;
            int i8 = i2 + 5;
            long j29 = (j28 >>> 32) + (j22 * j9) + (((long) iArr3[i8]) & M);
            iArr3[i8] = (int) j29;
            int i9 = i2 + 6;
            long j30 = (j29 >>> 32) + (j22 * j11) + (((long) iArr3[i9]) & M);
            iArr3[i9] = (int) j30;
            int i10 = i2 + 7;
            long j31 = (j30 >>> 32) + (j22 * j12) + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - M)));
            iArr3[i10] = (int) j31;
            iArr3[i2 + 8] = (int) (j31 >>> 32);
            i2 = i4;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = ((long) i2) & M;
        long j3 = iArr[i3];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (j2 * j4) + (((long) iArr2[i4]) & M);
        iArr3[i5] = (int) j5;
        long j6 = iArr[i3 + 1];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = (j5 >>> 32) + (j2 * j7) + j4 + (((long) iArr2[i4 + 1]) & M);
        iArr3[i5 + 1] = (int) j8;
        long j9 = iArr[i3 + 2];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = (j8 >>> 32) + (j2 * j10) + j7 + ((-1) - (((-1) - ((long) iArr2[i4 + 2])) | ((-1) - M)));
        iArr3[i5 + 2] = (int) j11;
        long j12 = ((long) iArr[i3 + 3]) & M;
        long j13 = (j11 >>> 32) + (j2 * j12) + j10 + (((long) iArr2[i4 + 3]) & M);
        iArr3[i5 + 3] = (int) j13;
        long j14 = iArr[i3 + 4];
        long j15 = (j14 + M) - (j14 | M);
        long j16 = iArr2[i4 + 4];
        long j17 = (j13 >>> 32) + (j2 * j15) + j12 + ((j16 + M) - (j16 | M));
        iArr3[i5 + 4] = (int) j17;
        long j18 = iArr[i3 + 5];
        long j19 = (j18 + M) - (j18 | M);
        long j20 = (j17 >>> 32) + (j2 * j19) + j15 + (((long) iArr2[i4 + 5]) & M);
        iArr3[i5 + 5] = (int) j20;
        long j21 = ((long) iArr[i3 + 6]) & M;
        long j22 = (j20 >>> 32) + (j2 * j21) + j19 + (((long) iArr2[i4 + 6]) & M);
        iArr3[i5 + 6] = (int) j22;
        long j23 = (-1) - (((-1) - ((long) iArr[i3 + 7])) | ((-1) - M));
        long j24 = iArr2[i4 + 7];
        long j25 = (j22 >>> 32) + (j2 * j23) + j21 + ((M + j24) - (M | j24));
        iArr3[i5 + 7] = (int) j25;
        return (j25 >>> 32) + j23;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = i2;
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (j2 + M) - (j2 | M);
        long j6 = iArr[i3];
        long j7 = (j4 * j5) + ((j6 + M) - (j6 | M));
        iArr[i3] = (int) j7;
        long j8 = j2 >>> 32;
        int i4 = i3 + 1;
        long j9 = (j7 >>> 32) + (j4 * j8) + j5 + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j9;
        int i5 = i3 + 2;
        long j10 = (j9 >>> 32) + j8 + (((long) iArr[i5]) & M);
        iArr[i5] = (int) j10;
        int i6 = i3 + 3;
        long j11 = iArr[i6];
        long j12 = (j10 >>> 32) + ((j11 + M) - (j11 | M));
        iArr[i6] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 4);
    }

    public static int mul33WordAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) i3)) | ((-1) - M));
        long j4 = iArr[i4];
        long j5 = (j2 * j3) + ((j4 + M) - (j4 | M));
        iArr[i4] = (int) j5;
        int i5 = i4 + 1;
        long j6 = iArr[i5];
        long j7 = (j5 >>> 32) + j3 + ((j6 + M) - (j6 | M));
        iArr[i5] = (int) j7;
        int i6 = i4 + 2;
        long j8 = (j7 >>> 32) + (((long) iArr[i6]) & M);
        iArr[i6] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j4 = iArr2[i3 + 2];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = iArr2[i3 + 3];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = (-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M));
        long j9 = iArr2[i3 + 5];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = (-1) - (((-1) - ((long) iArr2[i3 + 6])) | ((-1) - M));
        long j12 = (-1) - (((-1) - ((long) iArr2[i3 + 7])) | ((-1) - M));
        long j13 = 0;
        int i5 = 0;
        while (i5 < 8) {
            long j14 = (-1) - (((-1) - ((long) iArr[i2 + i5])) | ((-1) - M));
            long j15 = (j14 * j2) + (((long) iArr3[i4]) & M);
            iArr3[i4] = (int) j15;
            int i6 = i4 + 1;
            long j16 = (j15 >>> 32) + (j14 * j3) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j16;
            int i7 = i4 + 2;
            long j17 = (j16 >>> 32) + (j14 * j5) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j17;
            int i8 = i4 + 3;
            long j18 = (j17 >>> 32) + (j14 * j7) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j18;
            int i9 = i4 + 4;
            long j19 = iArr3[i9];
            long j20 = (j18 >>> 32) + (j14 * j8) + ((j19 + M) - (j19 | M));
            iArr3[i9] = (int) j20;
            int i10 = i4 + 5;
            long j21 = (j20 >>> 32) + (j14 * j10) + (((long) iArr3[i10]) & M);
            iArr3[i10] = (int) j21;
            int i11 = i4 + 6;
            long j22 = iArr3[i11];
            long j23 = (j21 >>> 32) + (j14 * j11) + ((j22 + M) - (j22 | M));
            iArr3[i11] = (int) j23;
            int i12 = i4 + 7;
            long j24 = (j23 >>> 32) + (j14 * j12) + (((long) iArr3[i12]) & M);
            iArr3[i12] = (int) j24;
            int i13 = i4 + 8;
            long j25 = (j24 >>> 32) + j13 + ((-1) - (((-1) - ((long) iArr3[i13])) | ((-1) - M)));
            iArr3[i13] = (int) j25;
            j13 = j25 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j13;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0];
        long j3 = M;
        long j4 = (-1) - (((-1) - j2) | ((-1) - M));
        long j5 = iArr2[1];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[2];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = ((long) iArr2[3]) & M;
        long j10 = ((long) iArr2[4]) & M;
        long j11 = (-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M));
        long j12 = (-1) - (((-1) - ((long) iArr2[6])) | ((-1) - M));
        long j13 = iArr2[7];
        long j14 = (j13 + M) - (j13 | M);
        long j15 = 0;
        int i2 = 0;
        while (i2 < 8) {
            long j16 = ((long) iArr[i2]) & j3;
            long j17 = (((long) iArr3[i2]) & j3) + (j16 * j4);
            iArr3[i2] = (int) j17;
            int i3 = i2 + 1;
            long j18 = (j17 >>> 32) + (j16 * j6) + ((-1) - (((-1) - ((long) iArr3[i3])) | ((-1) - j3)));
            iArr3[i3] = (int) j18;
            int i4 = i2 + 2;
            long j19 = (j18 >>> 32) + (j16 * j8) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - j3)));
            iArr3[i4] = (int) j19;
            int i5 = i2 + 3;
            long j20 = iArr3[i5];
            long j21 = (j19 >>> 32) + (j16 * j9) + ((j20 + j3) - (j20 | j3));
            iArr3[i5] = (int) j21;
            int i6 = i2 + 4;
            long j22 = (j21 >>> 32) + (j16 * j10) + (((long) iArr3[i6]) & j3);
            iArr3[i6] = (int) j22;
            int i7 = i2 + 5;
            long j23 = (j22 >>> 32) + (j16 * j11) + (((long) iArr3[i7]) & j3);
            iArr3[i7] = (int) j23;
            int i8 = i2 + 6;
            long j24 = (j23 >>> 32) + (j16 * j12) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - j3)));
            iArr3[i8] = (int) j24;
            int i9 = i2 + 7;
            long j25 = (j24 >>> 32) + (j16 * j14) + ((-1) - (((-1) - ((long) iArr3[i9])) | ((-1) - j3)));
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
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) * j2;
        iArr[0] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr[1]) & M) * j2);
        iArr[1] = (int) j4;
        long j5 = iArr[2];
        long j6 = (j4 >>> 32) + (((j5 + M) - (j5 | M)) * j2);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr[3]) & M) * j2);
        iArr[3] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr[4]) & M) * j2);
        iArr[4] = (int) j8;
        long j9 = (j8 >>> 32) + (((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M))) * j2);
        iArr[5] = (int) j9;
        long j10 = (j9 >>> 32) + ((((long) iArr[6]) & M) * j2);
        iArr[6] = (int) j10;
        long j11 = (j10 >>> 32) + (j2 * (M & ((long) iArr[7])));
        iArr[7] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int mulByWordAddTo(int i2, int[] iArr, int[] iArr2) {
        long j2 = ((long) i2) & M;
        long j3 = ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M))) * j2;
        long j4 = iArr[0];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        iArr2[0] = (int) j5;
        long j6 = (j5 >>> 32) + (((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))) * j2) + (((long) iArr[1]) & M);
        iArr2[1] = (int) j6;
        long j7 = (j6 >>> 32) + (((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))) * j2) + (((long) iArr[2]) & M);
        iArr2[2] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[3]) & M) * j2) + ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M)));
        iArr2[3] = (int) j8;
        long j9 = ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))) * j2;
        long j10 = iArr[4];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr2[4] = (int) j11;
        long j12 = iArr2[5];
        long j13 = (j11 >>> 32) + (((j12 + M) - (j12 | M)) * j2) + (((long) iArr[5]) & M);
        iArr2[5] = (int) j13;
        long j14 = iArr2[6];
        long j15 = (j13 >>> 32) + (((j14 + M) - (j14 | M)) * j2) + ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M)));
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + (j2 * ((-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M)))) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr[7]))));
        iArr2[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWord(int i2, int[] iArr, int[] iArr2, int i3) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
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
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M))) * j3;
        long j5 = iArr2[i4];
        long j6 = j4 + ((j5 + M) - (j5 | M));
        iArr2[i4] = (int) j6;
        int i5 = i4 + 1;
        long j7 = (j6 >>> 32) + ((((long) iArr[i3 + 1]) & M) * j3) + (((long) iArr2[i5]) & M);
        iArr2[i5] = (int) j7;
        long j8 = (((long) iArr[i3 + 2]) & M) * j3;
        int i6 = i4 + 2;
        long j9 = iArr2[i6];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr2[i6] = (int) j10;
        long j11 = iArr[i3 + 3];
        long j12 = ((j11 + M) - (j11 | M)) * j3;
        int i7 = i4 + 3;
        long j13 = iArr2[i7];
        long j14 = (j10 >>> 32) + j12 + ((j13 + M) - (j13 | M));
        iArr2[i7] = (int) j14;
        long j15 = iArr[i3 + 4];
        int i8 = i4 + 4;
        long j16 = (j14 >>> 32) + (((j15 + M) - (j15 | M)) * j3) + ((-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M)));
        iArr2[i8] = (int) j16;
        int i9 = i4 + 5;
        long j17 = (j16 >>> 32) + (((-1) - (((-1) - ((long) iArr[i3 + 5])) | ((-1) - M))) * j3) + (((long) iArr2[i9]) & M);
        iArr2[i9] = (int) j17;
        int i10 = i4 + 6;
        long j18 = (j17 >>> 32) + ((((long) iArr[i3 + 6]) & M) * j3) + (((long) iArr2[i10]) & M);
        iArr2[i10] = (int) j18;
        int i11 = i4 + 7;
        long j19 = (j18 >>> 32) + (j3 * ((-1) - (((-1) - ((long) iArr[i3 + 7])) | ((-1) - M)))) + ((-1) - (((-1) - ((long) iArr2[i11])) | ((-1) - M)));
        iArr2[i11] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j4 = (((j2 + M) - (j2 | M)) * j3) + ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M)));
        iArr[i3] = (int) j4;
        int i4 = i3 + 1;
        long j5 = (j4 >>> 32) + (j3 * (j2 >>> 32)) + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j5;
        int i5 = i3 + 2;
        long j6 = (j5 >>> 32) + (((long) iArr[i5]) & M);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static void square(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr[i2];
        long j3 = (j2 + M) - (j2 | M);
        int i4 = 0;
        int i5 = 16;
        int i6 = 7;
        while (true) {
            int i7 = i6 - 1;
            long j4 = (-1) - (((-1) - ((long) iArr[i2 + i6])) | ((-1) - M));
            long j5 = j4 * j4;
            iArr2[i3 + (i5 - 1)] = (i4 << 31) | ((int) (j5 >>> 33));
            i5 -= 2;
            iArr2[i3 + i5] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i7 <= 0) {
                long j6 = j3 * j3;
                long j7 = (-1) - (((-1) - ((long) (i4 << 31))) | ((-1) - M));
                long j8 = j6 >>> 33;
                long j9 = (j8 + j7) - (j8 & j7);
                iArr2[i3] = (int) j6;
                int i8 = ((int) (j6 >>> 32)) & 1;
                long j10 = iArr[i2 + 1];
                long j11 = (j10 + M) - (j10 | M);
                int i9 = i3 + 2;
                long j12 = iArr2[i9];
                long j13 = (j12 + M) - (j12 | M);
                long j14 = j9 + (j11 * j3);
                int i10 = (int) j14;
                int i11 = i10 << 1;
                iArr2[i3 + 1] = (i11 + i8) - (i11 & i8);
                long j15 = j13 + (j14 >>> 32);
                long j16 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
                int i12 = i3 + 3;
                long j17 = (-1) - (((-1) - ((long) iArr2[i12])) | ((-1) - M));
                int i13 = i3 + 4;
                long j18 = iArr2[i13];
                long j19 = (j18 + M) - (j18 | M);
                long j20 = j15 + (j16 * j3);
                int i14 = (int) j20;
                iArr2[i9] = (i14 << 1) | (i10 >>> 31);
                long j21 = j17 + (j20 >>> 32) + (j16 * j11);
                long j22 = j19 + (j21 >>> 32);
                long j23 = (j21 + M) - (j21 | M);
                long j24 = ((long) iArr[i2 + 3]) & M;
                int i15 = i3 + 5;
                long j25 = ((long) iArr2[i15]) & M;
                int i16 = i3 + 6;
                long j26 = ((long) iArr2[i16]) & M;
                long j27 = j23 + (j24 * j3);
                int i17 = (int) j27;
                iArr2[i12] = (-1) - (((-1) - (i17 << 1)) & ((-1) - (i14 >>> 31)));
                long j28 = j22 + (j27 >>> 32) + (j24 * j11);
                long j29 = j25 + (j28 >>> 32) + (j24 * j16);
                long j30 = (j28 + M) - (j28 | M);
                long j31 = j26 + (j29 >>> 32);
                long j32 = (j29 + M) - (j29 | M);
                long j33 = iArr[i2 + 4];
                long j34 = (j33 + M) - (j33 | M);
                int i18 = i3 + 7;
                long j35 = iArr2[i18];
                long j36 = (j35 + M) - (j35 | M);
                int i19 = i3 + 8;
                long j37 = (-1) - (((-1) - ((long) iArr2[i19])) | ((-1) - M));
                long j38 = j30 + (j34 * j3);
                int i20 = (int) j38;
                iArr2[i13] = (-1) - (((-1) - (i20 << 1)) & ((-1) - (i17 >>> 31)));
                int i21 = i20 >>> 31;
                long j39 = j32 + (j38 >>> 32) + (j34 * j11);
                long j40 = j31 + (j39 >>> 32) + (j34 * j16);
                long j41 = (j39 + M) - (j39 | M);
                long j42 = j36 + (j40 >>> 32) + (j34 * j24);
                long j43 = j40 & M;
                long j44 = (j42 + M) - (j42 | M);
                long j45 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
                int i22 = i3 + 9;
                long j46 = (-1) - (((-1) - ((long) iArr2[i22])) | ((-1) - M));
                int i23 = i3 + 10;
                long j47 = iArr2[i23];
                long j48 = (j47 + M) - (j47 | M);
                long j49 = j41 + (j45 * j3);
                int i24 = (int) j49;
                iArr2[i15] = (-1) - (((-1) - i21) & ((-1) - (i24 << 1)));
                int i25 = i24 >>> 31;
                long j50 = j43 + (j49 >>> 32) + (j45 * j11);
                long j51 = j44 + (j50 >>> 32) + (j45 * j16);
                long j52 = (-1) - (((-1) - j50) | ((-1) - M));
                long j53 = j37 + (j42 >>> 32) + (j51 >>> 32) + (j45 * j24);
                long j54 = (j51 + M) - (j51 | M);
                long j55 = j46 + (j53 >>> 32) + (j45 * j34);
                long j56 = (j53 + M) - (j53 | M);
                long j57 = j48 + (j55 >>> 32);
                long j58 = (j55 + M) - (j55 | M);
                long j59 = iArr[i2 + 6];
                long j60 = (j59 + M) - (j59 | M);
                int i26 = i3 + 11;
                long j61 = iArr2[i26];
                long j62 = (j61 + M) - (j61 | M);
                int i27 = i3 + 12;
                long j63 = (-1) - (((-1) - ((long) iArr2[i27])) | ((-1) - M));
                long j64 = j52 + (j60 * j3);
                int i28 = (int) j64;
                iArr2[i16] = (-1) - (((-1) - i25) & ((-1) - (i28 << 1)));
                int i29 = i28 >>> 31;
                long j65 = j54 + (j64 >>> 32) + (j60 * j11);
                long j66 = j56 + (j65 >>> 32) + (j60 * j16);
                long j67 = (j65 + M) - (j65 | M);
                long j68 = j58 + (j66 >>> 32) + (j60 * j24);
                long j69 = (-1) - (((-1) - j66) | ((-1) - M));
                long j70 = j57 + (j68 >>> 32) + (j60 * j34);
                long j71 = j68 & M;
                long j72 = j62 + (j70 >>> 32) + (j60 * j45);
                long j73 = (-1) - (((-1) - j70) | ((-1) - M));
                long j74 = j63 + (j72 >>> 32);
                long j75 = j72 & M;
                long j76 = iArr[i2 + 7];
                long j77 = (j76 + M) - (j76 | M);
                int i30 = i3 + 13;
                long j78 = (-1) - (((-1) - ((long) iArr2[i30])) | ((-1) - M));
                int i31 = i3 + 14;
                long j79 = (-1) - (((-1) - M) | ((-1) - ((long) iArr2[i31])));
                long j80 = j67 + (j3 * j77);
                int i32 = (int) j80;
                iArr2[i18] = (-1) - (((-1) - (i32 << 1)) & ((-1) - i29));
                long j81 = j69 + (j80 >>> 32) + (j11 * j77);
                long j82 = j71 + (j81 >>> 32) + (j77 * j16);
                long j83 = j73 + (j82 >>> 32) + (j77 * j24);
                long j84 = j75 + (j83 >>> 32) + (j77 * j34);
                long j85 = j74 + (j84 >>> 32) + (j77 * j45);
                long j86 = j78 + (j85 >>> 32) + (j77 * j60);
                long j87 = j79 + (j86 >>> 32);
                int i33 = (int) j81;
                iArr2[i19] = (-1) - (((-1) - (i32 >>> 31)) & ((-1) - (i33 << 1)));
                int i34 = (int) j82;
                iArr2[i22] = (i33 >>> 31) | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j83;
                iArr2[i23] = (-1) - (((-1) - i35) & ((-1) - (i36 << 1)));
                int i37 = i36 >>> 31;
                int i38 = (int) j84;
                iArr2[i26] = (-1) - (((-1) - i37) & ((-1) - (i38 << 1)));
                int i39 = i38 >>> 31;
                int i40 = (int) j85;
                int i41 = i40 << 1;
                iArr2[i27] = (i39 + i41) - (i39 & i41);
                int i42 = (int) j86;
                iArr2[i30] = (i40 >>> 31) | (i42 << 1);
                int i43 = (int) j87;
                iArr2[i31] = (-1) - (((-1) - (i42 >>> 31)) & ((-1) - (i43 << 1)));
                int i44 = i3 + 15;
                iArr2[i44] = (-1) - (((-1) - (i43 >>> 31)) & ((-1) - ((iArr2[i44] + ((int) (j87 >> 32))) << 1)));
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
            iArr2[i2 - 1] = (-1) - (((-1) - (i3 << 31)) & ((-1) - ((int) (j4 >>> 33))));
            i2 -= 2;
            iArr2[i2] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                long j6 = i3 << 31;
                long j7 = (j5 >>> 33) | ((j6 + M) - (j6 | M));
                iArr2[0] = (int) j5;
                int i6 = ((int) (j5 >>> 32)) & 1;
                long j8 = iArr[1];
                long j9 = (j8 + M) - (j8 | M);
                long j10 = ((long) iArr2[2]) & M;
                long j11 = j7 + (j9 * j2);
                int i7 = (int) j11;
                iArr2[1] = (-1) - (((-1) - (i7 << 1)) & ((-1) - i6));
                int i8 = i7 >>> 31;
                long j12 = j10 + (j11 >>> 32);
                long j13 = ((long) iArr[2]) & M;
                long j14 = ((long) iArr2[3]) & M;
                long j15 = ((long) iArr2[4]) & M;
                long j16 = j12 + (j13 * j2);
                int i9 = (int) j16;
                int i10 = i9 << 1;
                iArr2[2] = (i10 + i8) - (i10 & i8);
                int i11 = i9 >>> 31;
                long j17 = j14 + (j16 >>> 32) + (j13 * j9);
                long j18 = j15 + (j17 >>> 32);
                long j19 = j17 & M;
                long j20 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
                long j21 = iArr2[5];
                long j22 = (j21 + M) - (j21 | M);
                long j23 = iArr2[6];
                long j24 = (j23 + M) - (j23 | M);
                long j25 = j19 + (j20 * j2);
                int i12 = (int) j25;
                iArr2[3] = (-1) - (((-1) - (i12 << 1)) & ((-1) - i11));
                int i13 = i12 >>> 31;
                long j26 = j18 + (j25 >>> 32) + (j20 * j9);
                long j27 = j22 + (j26 >>> 32) + (j20 * j13);
                long j28 = j26 & M;
                long j29 = j24 + (j27 >>> 32);
                long j30 = (j27 + M) - (j27 | M);
                long j31 = iArr[4];
                long j32 = (j31 + M) - (j31 | M);
                long j33 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
                long j34 = (-1) - (((-1) - ((long) iArr2[8])) | ((-1) - M));
                long j35 = j28 + (j32 * j2);
                int i14 = (int) j35;
                iArr2[4] = (i14 << 1) | i13;
                int i15 = i14 >>> 31;
                long j36 = j30 + (j35 >>> 32) + (j32 * j9);
                long j37 = j29 + (j36 >>> 32) + (j32 * j13);
                long j38 = (-1) - (((-1) - j36) | ((-1) - M));
                long j39 = j33 + (j37 >>> 32) + (j32 * j20);
                long j40 = j37 & M;
                long j41 = (-1) - (((-1) - j39) | ((-1) - M));
                long j42 = ((long) iArr[5]) & M;
                long j43 = ((long) iArr2[9]) & M;
                long j44 = iArr2[10];
                long j45 = (j44 + M) - (j44 | M);
                long j46 = j38 + (j42 * j2);
                int i16 = (int) j46;
                iArr2[5] = (-1) - (((-1) - (i16 << 1)) & ((-1) - i15));
                int i17 = i16 >>> 31;
                long j47 = j40 + (j46 >>> 32) + (j42 * j9);
                long j48 = j41 + (j47 >>> 32) + (j42 * j13);
                long j49 = (-1) - (((-1) - j47) | ((-1) - M));
                long j50 = j34 + (j39 >>> 32) + (j48 >>> 32) + (j42 * j20);
                long j51 = (-1) - (((-1) - j48) | ((-1) - M));
                long j52 = j43 + (j50 >>> 32) + (j42 * j32);
                long j53 = j50 & M;
                long j54 = j45 + (j52 >>> 32);
                long j55 = j52 & M;
                long j56 = ((long) iArr[6]) & M;
                long j57 = ((long) iArr2[11]) & M;
                long j58 = (-1) - (((-1) - ((long) iArr2[12])) | ((-1) - M));
                long j59 = j49 + (j56 * j2);
                int i18 = (int) j59;
                iArr2[6] = (-1) - (((-1) - (i18 << 1)) & ((-1) - i17));
                int i19 = i18 >>> 31;
                long j60 = j51 + (j59 >>> 32) + (j56 * j9);
                long j61 = j53 + (j60 >>> 32) + (j56 * j13);
                long j62 = (j60 + M) - (j60 | M);
                long j63 = j55 + (j61 >>> 32) + (j56 * j20);
                long j64 = j61 & M;
                long j65 = j54 + (j63 >>> 32) + (j56 * j32);
                long j66 = j63 & M;
                long j67 = j57 + (j65 >>> 32) + (j56 * j42);
                long j68 = (j65 + M) - (j65 | M);
                long j69 = j58 + (j67 >>> 32);
                long j70 = (-1) - (((-1) - j67) | ((-1) - M));
                long j71 = iArr[7];
                long j72 = (j71 + M) - (j71 | M);
                long j73 = ((long) iArr2[13]) & M;
                long j74 = (-1) - (((-1) - M) | ((-1) - ((long) iArr2[14])));
                long j75 = j62 + (j72 * j2);
                int i20 = (int) j75;
                int i21 = i20 << 1;
                iArr2[7] = (i21 + i19) - (i21 & i19);
                long j76 = j64 + (j75 >>> 32) + (j72 * j9);
                long j77 = j66 + (j76 >>> 32) + (j13 * j72);
                long j78 = j68 + (j77 >>> 32) + (j72 * j20);
                long j79 = j70 + (j78 >>> 32) + (j72 * j32);
                long j80 = j69 + (j79 >>> 32) + (j72 * j42);
                long j81 = j73 + (j80 >>> 32) + (j72 * j56);
                long j82 = j74 + (j81 >>> 32);
                int i22 = (int) j76;
                iArr2[8] = (-1) - (((-1) - (i22 << 1)) & ((-1) - (i20 >>> 31)));
                int i23 = (int) j77;
                iArr2[9] = (i23 << 1) | (i22 >>> 31);
                int i24 = i23 >>> 31;
                int i25 = (int) j78;
                iArr2[10] = (-1) - (((-1) - i24) & ((-1) - (i25 << 1)));
                int i26 = i25 >>> 31;
                int i27 = (int) j79;
                iArr2[11] = (-1) - (((-1) - i26) & ((-1) - (i27 << 1)));
                int i28 = i27 >>> 31;
                int i29 = (int) j80;
                int i30 = i29 << 1;
                iArr2[12] = (i28 + i30) - (i28 & i30);
                int i31 = (int) j81;
                iArr2[13] = (-1) - (((-1) - (i29 >>> 31)) & ((-1) - (i31 << 1)));
                int i32 = i31 >>> 31;
                int i33 = (int) j82;
                int i34 = i33 << 1;
                iArr2[14] = (i32 + i34) - (i32 & i34);
                iArr2[15] = (-1) - (((-1) - (i33 >>> 31)) & ((-1) - ((iArr2[15] + ((int) (j82 >> 32))) << 1)));
                return;
            }
            i4 = i5;
        }
    }

    public static int sub(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M))) - (((long) iArr2[i3]) & M);
        iArr3[i4] = (int) j2;
        long j3 = (j2 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 1])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M))));
        iArr3[i4 + 1] = (int) j3;
        long j4 = iArr[i2 + 2];
        long j5 = (j3 >> 32) + (((j4 + M) - (j4 | M)) - (((long) iArr2[i3 + 2]) & M));
        iArr3[i4 + 2] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i2 + 3]) & M) - ((-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M))));
        iArr3[i4 + 3] = (int) j6;
        long j7 = iArr[i2 + 4];
        long j8 = (j6 >> 32) + (((j7 + M) - (j7 | M)) - ((-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M))));
        iArr3[i4 + 4] = (int) j8;
        long j9 = (j8 >> 32) + ((((long) iArr[i2 + 5]) & M) - (((long) iArr2[i3 + 5]) & M));
        iArr3[i4 + 5] = (int) j9;
        long j10 = iArr[i2 + 6];
        long j11 = (j10 + M) - (j10 | M);
        long j12 = iArr2[i3 + 6];
        long j13 = (j9 >> 32) + (j11 - ((j12 + M) - (j12 | M)));
        iArr3[i4 + 6] = (int) j13;
        long j14 = iArr[i2 + 7];
        long j15 = (j14 + M) - (j14 | M);
        long j16 = iArr2[i3 + 7];
        long j17 = (j13 >> 32) + (j15 - ((j16 + M) - (j16 | M)));
        iArr3[i4 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (-1) - (((-1) - ((long) iArr[0])) | ((-1) - M));
        long j3 = iArr2[0];
        long j4 = j2 - ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = iArr[1];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[1];
        long j8 = (j4 >> 32) + (j6 - ((j7 + M) - (j7 | M)));
        iArr3[1] = (int) j8;
        long j9 = iArr[2];
        long j10 = (j8 >> 32) + (((j9 + M) - (j9 | M)) - ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))));
        iArr3[2] = (int) j10;
        long j11 = iArr[3];
        long j12 = (j10 >> 32) + (((j11 + M) - (j11 | M)) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j12;
        long j13 = (j12 >> 32) + ((((long) iArr[4]) & M) - ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))));
        iArr3[4] = (int) j13;
        long j14 = iArr[5];
        long j15 = (j13 >> 32) + (((j14 + M) - (j14 | M)) - ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))));
        iArr3[5] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[6]) & M) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j16;
        long j17 = iArr[7];
        long j18 = (j16 >> 32) + (((j17 + M) - (j17 | M)) - ((-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M))));
        iArr3[7] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (-1) - (((-1) - ((long) iArr3[0])) | ((-1) - M));
        long j3 = iArr[0];
        long j4 = (j2 - ((j3 + M) - (j3 | M))) - (((long) iArr2[0]) & M);
        iArr3[0] = (int) j4;
        long j5 = iArr3[1];
        long j6 = ((j5 + M) - (j5 | M)) - ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M)));
        long j7 = iArr2[1];
        long j8 = (j4 >> 32) + (j6 - ((j7 + M) - (j7 | M)));
        iArr3[1] = (int) j8;
        long j9 = iArr3[2];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr[2];
        long j12 = (j8 >> 32) + ((j10 - ((j11 + M) - (j11 | M))) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j12;
        long j13 = (j12 >> 32) + ((((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M)))) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr3[4]) & M) - ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M)));
        long j15 = iArr2[4];
        long j16 = (j13 >> 32) + (j14 - ((j15 + M) - (j15 | M)));
        iArr3[4] = (int) j16;
        long j17 = (j16 >> 32) + ((((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M))) - (((long) iArr[5]) & M)) - ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))));
        iArr3[5] = (int) j17;
        long j18 = iArr3[6];
        long j19 = (j17 >> 32) + ((((j18 + M) - (j18 | M)) - (((long) iArr[6]) & M)) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j19;
        long j20 = iArr3[7];
        long j21 = (j20 + M) - (j20 | M);
        long j22 = iArr[7];
        long j23 = (j19 >> 32) + ((j21 - ((j22 + M) - (j22 | M))) - (((long) iArr2[7]) & M));
        iArr3[7] = (int) j23;
        return (int) (j23 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M))) - (((long) iArr[i2]) & M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >> 32) + (((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M))) - (((long) iArr[i2 + 1]) & M));
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = ((long) iArr2[i5]) & M;
        long j5 = iArr[i2 + 2];
        long j6 = (j3 >> 32) + (j4 - ((j5 + M) - (j5 | M)));
        iArr2[i5] = (int) j6;
        int i6 = i3 + 3;
        long j7 = iArr2[i6];
        long j8 = (j6 >> 32) + (((j7 + M) - (j7 | M)) - (((long) iArr[i2 + 3]) & M));
        iArr2[i6] = (int) j8;
        int i7 = i3 + 4;
        long j9 = (j8 >> 32) + ((((long) iArr2[i7]) & M) - ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))));
        iArr2[i7] = (int) j9;
        int i8 = i3 + 5;
        long j10 = (j9 >> 32) + ((((long) iArr2[i8]) & M) - (((long) iArr[i2 + 5]) & M));
        iArr2[i8] = (int) j10;
        int i9 = i3 + 6;
        long j11 = (j10 >> 32) + ((((long) iArr2[i9]) & M) - (((long) iArr[i2 + 6]) & M));
        iArr2[i9] = (int) j11;
        int i10 = i3 + 7;
        long j12 = iArr2[i10];
        long j13 = (j11 >> 32) + (((j12 + M) - (j12 | M)) - (((long) iArr[i2 + 7]) & M));
        iArr2[i10] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & M) - (((long) iArr[0]) & M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >> 32) + (((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))) - (((long) iArr[1]) & M));
        iArr2[1] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[2]) & M) - (((long) iArr[2]) & M));
        iArr2[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[3]) & M) - ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))));
        iArr2[3] = (int) j5;
        long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M))));
        iArr2[4] = (int) j6;
        long j7 = iArr2[5];
        long j8 = (j6 >> 32) + (((j7 + M) - (j7 | M)) - ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M))));
        iArr2[5] = (int) j8;
        long j9 = (j8 >> 32) + ((((long) iArr2[6]) & M) - ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))));
        iArr2[6] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
        long j11 = iArr[7];
        long j12 = (j9 >> 32) + (j10 - ((M + j11) - (M | j11)));
        iArr2[7] = (int) j12;
        return (int) (j12 >> 32);
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

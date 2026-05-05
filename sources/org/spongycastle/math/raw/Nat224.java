package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat224 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr[i2];
        long j3 = ((j2 + M) - (j2 | M)) + (((long) iArr2[i3]) & M);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & M;
        long j5 = iArr2[i3 + 1];
        long j6 = (j3 >>> 32) + j4 + ((j5 + M) - (j5 | M));
        iArr3[i4 + 1] = (int) j6;
        long j7 = (j6 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M)));
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3];
        long j9 = (j7 >>> 32) + ((j8 + M) - (j8 | M)) + ((-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M)));
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4];
        long j11 = (j10 + M) - (j10 | M);
        long j12 = iArr2[i3 + 4];
        long j13 = (j9 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr3[i4 + 4] = (int) j13;
        long j14 = (j13 >>> 32) + (((long) iArr[i2 + 5]) & M) + (((long) iArr2[i3 + 5]) & M);
        iArr3[i4 + 5] = (int) j14;
        long j15 = iArr[i2 + 6];
        long j16 = (j15 + M) - (j15 | M);
        long j17 = iArr2[i3 + 6];
        long j18 = (j14 >>> 32) + j16 + ((j17 + M) - (j17 | M));
        iArr3[i4 + 6] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) + ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & M) + (((long) iArr2[1]) & M);
        iArr3[1] = (int) j3;
        long j4 = iArr[2];
        long j5 = (j3 >>> 32) + ((j4 + M) - (j4 | M)) + (((long) iArr2[2]) & M);
        iArr3[2] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M);
        iArr3[3] = (int) j6;
        long j7 = iArr[4];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = iArr2[4];
        long j10 = (j6 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr3[4] = (int) j10;
        long j11 = iArr[5];
        long j12 = (j10 >>> 32) + ((j11 + M) - (j11 | M)) + ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M)));
        iArr3[5] = (int) j12;
        long j13 = (j12 >>> 32) + ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[6])) | ((-1) - M)));
        iArr3[6] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr[i2];
        long j3 = ((j2 + M) - (j2 | M)) + ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - M)));
        iArr3[i4] = (int) j3;
        long j4 = (-1) - (((-1) - ((long) iArr[i2 + 1])) | ((-1) - M));
        long j5 = iArr2[i3 + 1];
        int i5 = i4 + 1;
        long j6 = (j3 >>> 32) + j4 + ((j5 + M) - (j5 | M)) + (((long) iArr3[i5]) & M);
        iArr3[i5] = (int) j6;
        int i6 = i4 + 2;
        long j7 = (j6 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
        iArr3[i6] = (int) j7;
        long j8 = ((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))) + (((long) iArr2[i3 + 3]) & M);
        int i7 = i4 + 3;
        long j9 = iArr3[i7];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr3[i7] = (int) j10;
        long j11 = iArr[i2 + 4];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = iArr2[i3 + 4];
        int i8 = i4 + 4;
        long j14 = (j10 >>> 32) + j12 + ((j13 + M) - (j13 | M)) + (((long) iArr3[i8]) & M);
        iArr3[i8] = (int) j14;
        long j15 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
        long j16 = iArr2[i3 + 5];
        int i9 = i4 + 5;
        long j17 = (j14 >>> 32) + j15 + ((j16 + M) - (j16 | M)) + (((long) iArr3[i9]) & M);
        iArr3[i9] = (int) j17;
        long j18 = iArr[i2 + 6];
        int i10 = i4 + 6;
        long j19 = (j17 >>> 32) + ((j18 + M) - (j18 | M)) + (((long) iArr2[i3 + 6]) & M) + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - M)));
        iArr3[i10] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr[0]) & M;
        long j3 = iArr2[0];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        long j5 = iArr3[0];
        long j6 = j4 + ((j5 + M) - (j5 | M));
        iArr3[0] = (int) j6;
        long j7 = iArr[1];
        long j8 = (j6 >>> 32) + ((j7 + M) - (j7 | M)) + (((long) iArr2[1]) & M) + (((long) iArr3[1]) & M);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) + (((long) iArr2[2]) & M) + (((long) iArr3[2]) & M);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + ((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M)));
        iArr3[3] = (int) j10;
        long j11 = (((long) iArr[4]) & M) + ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M)));
        long j12 = iArr3[4];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr3[4] = (int) j13;
        long j14 = (-1) - (((-1) - ((long) iArr[5])) | ((-1) - M));
        long j15 = iArr2[5];
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M)) + (((long) iArr3[5]) & M);
        iArr3[5] = (int) j16;
        long j17 = (((long) iArr[6]) & M) + ((-1) - (((-1) - ((long) iArr2[6])) | ((-1) - M)));
        long j18 = iArr3[6];
        long j19 = (j16 >>> 32) + j17 + ((j18 + M) - (j18 | M));
        iArr3[6] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = ((long) i4) & M;
        long j3 = iArr[i2];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = iArr2[i3];
        long j6 = j2 + j4 + ((j5 + M) - (j5 | M));
        iArr2[i3] = (int) j6;
        long j7 = ((long) iArr[i2 + 1]) & M;
        int i5 = i3 + 1;
        long j8 = iArr2[i5];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr2[i5] = (int) j9;
        long j10 = iArr[i2 + 2];
        int i6 = i3 + 2;
        long j11 = (j9 >>> 32) + ((j10 + M) - (j10 | M)) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        iArr2[i6] = (int) j11;
        long j12 = iArr[i2 + 3];
        long j13 = (j12 + M) - (j12 | M);
        int i7 = i3 + 3;
        long j14 = iArr2[i7];
        long j15 = (j11 >>> 32) + j13 + ((j14 + M) - (j14 | M));
        iArr2[i7] = (int) j15;
        long j16 = ((long) iArr[i2 + 4]) & M;
        int i8 = i3 + 4;
        long j17 = iArr2[i8];
        long j18 = (j15 >>> 32) + j16 + ((j17 + M) - (j17 | M));
        iArr2[i8] = (int) j18;
        long j19 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
        int i9 = i3 + 5;
        long j20 = iArr2[i9];
        long j21 = (j18 >>> 32) + j19 + ((j20 + M) - (j20 | M));
        iArr2[i9] = (int) j21;
        long j22 = iArr[i2 + 6];
        int i10 = i3 + 6;
        long j23 = (j21 >>> 32) + ((j22 + M) - (j22 | M)) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i10]))));
        iArr2[i10] = (int) j23;
        return (int) (j23 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & M) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M)));
        iArr2[1] = (int) j3;
        long j4 = ((long) iArr[2]) & M;
        long j5 = iArr2[2];
        long j6 = (j3 >>> 32) + j4 + ((j5 + M) - (j5 | M));
        iArr2[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M);
        iArr2[3] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j8;
        long j9 = iArr[5];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr2[5];
        long j12 = (j8 >>> 32) + j10 + ((j11 + M) - (j11 | M));
        iArr2[5] = (int) j12;
        long j13 = (j12 >>> 32) + (((long) iArr[6]) & M) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[6]))));
        iArr2[6] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr[i2];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[i3];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        int i4 = (int) j5;
        iArr[i2] = i4;
        iArr2[i3] = i4;
        int i5 = i2 + 1;
        int i6 = i3 + 1;
        long j6 = (j5 >>> 32) + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        int i7 = (int) j6;
        iArr[i5] = i7;
        iArr2[i6] = i7;
        int i8 = i2 + 2;
        long j7 = iArr[i8];
        int i9 = i3 + 2;
        long j8 = (j6 >>> 32) + ((j7 + M) - (j7 | M)) + (((long) iArr2[i9]) & M);
        int i10 = (int) j8;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        long j9 = (-1) - (((-1) - ((long) iArr[i11])) | ((-1) - M));
        int i12 = i3 + 3;
        long j10 = iArr2[i12];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        int i13 = (int) j11;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i2 + 4;
        int i15 = i3 + 4;
        long j12 = (j11 >>> 32) + ((-1) - (((-1) - ((long) iArr[i14])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i15])) | ((-1) - M)));
        int i16 = (int) j12;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i2 + 5;
        int i18 = i3 + 5;
        long j13 = (j12 >>> 32) + ((-1) - (((-1) - ((long) iArr[i17])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i18])) | ((-1) - M)));
        int i19 = (int) j13;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        int i20 = i2 + 6;
        int i21 = i3 + 6;
        long j14 = (j13 >>> 32) + (((long) iArr[i20]) & M) + (M & ((long) iArr2[i21]));
        int i22 = (int) j14;
        iArr[i20] = i22;
        iArr2[i21] = i22;
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
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
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
        for (int i2 = 6; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
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

    public static int getBit(int[] iArr, int i2) {
        int i3;
        if (i2 == 0) {
            i3 = iArr[0];
        } else {
            int i4 = i2 >> 5;
            if (i4 < 0 || i4 >= 7) {
                return 0;
            }
            i3 = iArr[i4] >>> ((i2 + 31) - (i2 | 31));
        }
        return (-1) - (((-1) - i3) | ((-1) - 1));
    }

    public static boolean gte(int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 6; i4 >= 0; i4--) {
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
        for (int i2 = 6; i2 >= 0; i2--) {
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
        for (int i2 = 1; i2 < 7; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M));
        long j3 = ((long) iArr2[i3 + 1]) & M;
        long j4 = ((long) iArr2[i3 + 2]) & M;
        long j5 = (-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M));
        long j6 = iArr2[i3 + 4];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = ((long) iArr2[i3 + 5]) & M;
        long j9 = iArr2[i3 + 6];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr[i2];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = j12 * j2;
        iArr3[i4] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j3);
        iArr3[i4 + 1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j4);
        iArr3[i4 + 2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j5);
        iArr3[i4 + 3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j7);
        iArr3[i4 + 4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j8);
        iArr3[i4 + 5] = (int) j18;
        long j19 = (j18 >>> 32) + (j12 * j10);
        iArr3[i4 + 6] = (int) j19;
        iArr3[i4 + 7] = (int) (j19 >>> 32);
        int i5 = 1;
        while (i5 < 7) {
            int i6 = i4 + 1;
            long j20 = iArr[i2 + i5];
            long j21 = (j20 + M) - (j20 | M);
            long j22 = (j21 * j2) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j22;
            int i7 = i4 + 2;
            long j23 = iArr3[i7];
            long j24 = (j22 >>> 32) + (j21 * j3) + ((j23 + M) - (j23 | M));
            iArr3[i7] = (int) j24;
            int i8 = i4 + 3;
            long j25 = (j24 >>> 32) + (j21 * j4) + (((long) iArr3[i8]) & M);
            iArr3[i8] = (int) j25;
            int i9 = i4 + 4;
            long j26 = iArr3[i9];
            long j27 = (j25 >>> 32) + (j21 * j5) + ((j26 + M) - (j26 | M));
            iArr3[i9] = (int) j27;
            int i10 = i4 + 5;
            long j28 = iArr3[i10];
            long j29 = (j27 >>> 32) + (j21 * j7) + ((j28 + M) - (j28 | M));
            iArr3[i10] = (int) j29;
            int i11 = i4 + 6;
            long j30 = iArr3[i11];
            long j31 = (j29 >>> 32) + (j21 * j8) + ((j30 + M) - (j30 | M));
            iArr3[i11] = (int) j31;
            int i12 = i4 + 7;
            long j32 = iArr3[i12];
            long j33 = (j31 >>> 32) + (j21 * j10) + ((j32 + M) - (j32 | M));
            iArr3[i12] = (int) j33;
            iArr3[i4 + 8] = (int) (j33 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = ((long) iArr2[1]) & M;
        long j5 = ((long) iArr2[2]) & M;
        long j6 = ((long) iArr2[3]) & M;
        long j7 = ((long) iArr2[4]) & M;
        long j8 = ((long) iArr2[5]) & M;
        long j9 = iArr2[6];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr[0];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = j12 * j3;
        iArr3[0] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j4);
        int i2 = 1;
        iArr3[1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j5);
        iArr3[2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j6);
        iArr3[3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j7);
        iArr3[4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j8);
        iArr3[5] = (int) j18;
        long j19 = (j18 >>> 32) + (j12 * j10);
        iArr3[6] = (int) j19;
        int i3 = (int) (j19 >>> 32);
        iArr3[7] = i3;
        for (int i4 = 7; i2 < i4; i4 = 7) {
            long j20 = ((long) iArr[i2]) & M;
            long j21 = (j20 * j3) + (((long) iArr3[i2]) & M);
            iArr3[i2] = (int) j21;
            int i5 = i2 + 1;
            long j22 = (j21 >>> 32) + (j20 * j4) + ((-1) - (((-1) - ((long) iArr3[i5])) | ((-1) - M)));
            iArr3[i5] = (int) j22;
            int i6 = i2 + 2;
            long j23 = (j22 >>> 32) + (j20 * j5) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j23;
            int i7 = i2 + 3;
            long j24 = (j23 >>> 32) + (j20 * j6) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j24;
            int i8 = i2 + 4;
            long j25 = (j24 >>> 32) + (j20 * j7) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j25;
            int i9 = i2 + 5;
            long j26 = iArr3[i9];
            long j27 = (j25 >>> 32) + (j20 * j8) + ((j26 + M) - (j26 | M));
            iArr3[i9] = (int) j27;
            int i10 = i2 + 6;
            long j28 = (j27 >>> 32) + (j20 * j10) + (((long) iArr3[i10]) & M);
            iArr3[i10] = (int) j28;
            iArr3[i2 + 7] = (int) (j28 >>> 32);
            i2 = i5;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = ((long) i2) & M;
        long j3 = ((long) iArr[i3]) & M;
        long j4 = (j2 * j3) + (((long) iArr2[i4]) & M);
        iArr3[i5] = (int) j4;
        long j5 = iArr[i3 + 1];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = (j4 >>> 32) + (j2 * j6) + j3 + (((long) iArr2[i4 + 1]) & M);
        iArr3[i5 + 1] = (int) j7;
        long j8 = ((long) iArr[i3 + 2]) & M;
        long j9 = (j7 >>> 32) + (j2 * j8) + j6 + (((long) iArr2[i4 + 2]) & M);
        iArr3[i5 + 2] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr[i3 + 3])) | ((-1) - M));
        long j11 = (j9 >>> 32) + (j2 * j10) + j8 + (((long) iArr2[i4 + 3]) & M);
        iArr3[i5 + 3] = (int) j11;
        long j12 = (-1) - (((-1) - ((long) iArr[i3 + 4])) | ((-1) - M));
        long j13 = iArr2[i4 + 4];
        long j14 = (j11 >>> 32) + (j2 * j12) + j10 + ((j13 + M) - (j13 | M));
        iArr3[i5 + 4] = (int) j14;
        long j15 = ((long) iArr[i3 + 5]) & M;
        long j16 = (j14 >>> 32) + (j2 * j15) + j12 + ((-1) - (((-1) - ((long) iArr2[i4 + 5])) | ((-1) - M)));
        iArr3[i5 + 5] = (int) j16;
        long j17 = (-1) - (((-1) - ((long) iArr[i3 + 6])) | ((-1) - M));
        long j18 = (j16 >>> 32) + (j2 * j17) + j15 + (M & ((long) iArr2[i4 + 6]));
        iArr3[i5 + 6] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = i2;
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (j2 + M) - (j2 | M);
        long j6 = (j4 * j5) + (((long) iArr[i3]) & M);
        iArr[i3] = (int) j6;
        long j7 = j2 >>> 32;
        long j8 = (j4 * j7) + j5;
        int i4 = i3 + 1;
        long j9 = iArr[i4];
        long j10 = (j6 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr[i4] = (int) j10;
        int i5 = i3 + 2;
        long j11 = (j10 >>> 32) + j7 + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j11;
        int i6 = i3 + 3;
        long j12 = iArr[i6];
        long j13 = (j11 >>> 32) + ((j12 + M) - (j12 | M));
        iArr[i6] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i3, 4);
    }

    public static int mul33WordAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = ((long) i3) & M;
        long j5 = iArr[i4];
        long j6 = (j3 * j4) + ((j5 + M) - (j5 | M));
        iArr[i4] = (int) j6;
        int i5 = i4 + 1;
        long j7 = (j6 >>> 32) + j4 + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j7;
        int i6 = i4 + 2;
        long j8 = (j7 >>> 32) + (((long) iArr[i6]) & M);
        iArr[i6] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((long) iArr2[i3]) & M;
        long j3 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j4 = (-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M));
        long j5 = ((long) iArr2[i3 + 3]) & M;
        long j6 = (-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr2[i3 + 5])) | ((-1) - M));
        long j8 = iArr2[i3 + 6];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = 0;
        int i5 = 0;
        while (i5 < 7) {
            long j11 = (-1) - (((-1) - ((long) iArr[i2 + i5])) | ((-1) - M));
            long j12 = (j11 * j2) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - M)));
            iArr3[i4] = (int) j12;
            int i6 = i4 + 1;
            long j13 = (j12 >>> 32) + (j11 * j3) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j13;
            int i7 = i4 + 2;
            long j14 = iArr3[i7];
            long j15 = (j13 >>> 32) + (j11 * j4) + ((j14 + M) - (j14 | M));
            iArr3[i7] = (int) j15;
            int i8 = i4 + 3;
            long j16 = iArr3[i8];
            long j17 = (j15 >>> 32) + (j11 * j5) + ((j16 + M) - (j16 | M));
            iArr3[i8] = (int) j17;
            int i9 = i4 + 4;
            long j18 = iArr3[i9];
            long j19 = (j17 >>> 32) + (j11 * j6) + ((j18 + M) - (j18 | M));
            iArr3[i9] = (int) j19;
            int i10 = i4 + 5;
            long j20 = iArr3[i10];
            long j21 = (j19 >>> 32) + (j11 * j7) + ((j20 + M) - (j20 | M));
            iArr3[i10] = (int) j21;
            int i11 = i4 + 6;
            long j22 = iArr3[i11];
            long j23 = (j21 >>> 32) + (j11 * j9) + ((j22 + M) - (j22 | M));
            iArr3[i11] = (int) j23;
            int i12 = i4 + 7;
            long j24 = iArr3[i12];
            long j25 = (j23 >>> 32) + j10 + ((j24 + M) - (j24 | M));
            iArr3[i12] = (int) j25;
            j10 = j25 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j10;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr2[0];
        long j3 = M;
        long j4 = (j2 + M) - (j2 | M);
        long j5 = (-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M));
        long j6 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j8 = ((long) iArr2[4]) & M;
        long j9 = iArr2[5];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr2[6];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = 0;
        int i2 = 0;
        while (i2 < 7) {
            long j14 = iArr[i2];
            long j15 = (j14 + j3) - (j14 | j3);
            long j16 = iArr3[i2];
            long j17 = ((j16 + j3) - (j16 | j3)) + (j15 * j4);
            iArr3[i2] = (int) j17;
            int i3 = i2 + 1;
            long j18 = (j17 >>> 32) + (j15 * j5) + ((-1) - (((-1) - ((long) iArr3[i3])) | ((-1) - j3)));
            iArr3[i3] = (int) j18;
            int i4 = i2 + 2;
            long j19 = (j18 >>> 32) + (j15 * j6) + (((long) iArr3[i4]) & j3);
            iArr3[i4] = (int) j19;
            int i5 = i2 + 3;
            long j20 = (j19 >>> 32) + (j15 * j7) + (((long) iArr3[i5]) & j3);
            iArr3[i5] = (int) j20;
            int i6 = i2 + 4;
            long j21 = iArr3[i6];
            long j22 = (j20 >>> 32) + (j15 * j8) + ((j21 + j3) - (j21 | j3));
            iArr3[i6] = (int) j22;
            int i7 = i2 + 5;
            long j23 = iArr3[i7];
            long j24 = (j22 >>> 32) + (j15 * j10) + ((j23 + j3) - (j23 | j3));
            iArr3[i7] = (int) j24;
            int i8 = i2 + 6;
            long j25 = (j24 >>> 32) + (j15 * j12) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - j3)));
            iArr3[i8] = (int) j25;
            int i9 = i2 + 7;
            long j26 = iArr3[i9];
            long j27 = (j25 >>> 32) + j13 + ((j26 + j3) - (j26 | j3));
            iArr3[i9] = (int) j27;
            j13 = j27 >>> 32;
            i2 = i3;
            j3 = M;
        }
        return (int) j13;
    }

    public static int mulByWord(int i2, int[] iArr) {
        long j2 = ((long) i2) & M;
        long j3 = iArr[0];
        long j4 = ((j3 + M) - (j3 | M)) * j2;
        iArr[0] = (int) j4;
        long j5 = (j4 >>> 32) + (((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) * j2);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + (((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) * j2);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) * j2);
        iArr[3] = (int) j7;
        long j8 = iArr[4];
        long j9 = (j7 >>> 32) + (((j8 + M) - (j8 | M)) * j2);
        iArr[4] = (int) j9;
        long j10 = iArr[5];
        long j11 = (j9 >>> 32) + (((j10 + M) - (j10 | M)) * j2);
        iArr[5] = (int) j11;
        long j12 = (j11 >>> 32) + (j2 * (M & ((long) iArr[6])));
        iArr[6] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int mulByWordAddTo(int i2, int[] iArr, int[] iArr2) {
        long j2 = ((long) i2) & M;
        long j3 = ((((long) iArr2[0]) & M) * j2) + ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M)));
        iArr2[0] = (int) j3;
        long j4 = iArr2[1];
        long j5 = (j3 >>> 32) + (((j4 + M) - (j4 | M)) * j2) + (((long) iArr[1]) & M);
        iArr2[1] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[2]) & M) * j2) + (((long) iArr[2]) & M);
        iArr2[2] = (int) j6;
        long j7 = (j6 >>> 32) + (((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M))) * j2) + ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M)));
        iArr2[3] = (int) j7;
        long j8 = (j7 >>> 32) + (((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))) * j2) + ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M)));
        iArr2[4] = (int) j8;
        long j9 = iArr2[5];
        long j10 = (j8 >>> 32) + (((j9 + M) - (j9 | M)) * j2) + (((long) iArr[5]) & M);
        iArr2[5] = (int) j10;
        long j11 = iArr2[6];
        long j12 = j2 * ((j11 + M) - (j11 | M));
        long j13 = iArr[6];
        long j14 = (j10 >>> 32) + j12 + ((M + j13) - (M | j13));
        iArr2[6] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int mulWord(int i2, int[] iArr, int[] iArr2, int i3) {
        long j2 = ((long) i2) & M;
        long j3 = 0;
        int i4 = 0;
        do {
            long j4 = iArr[i4];
            long j5 = j3 + (((j4 + M) - (j4 | M)) * j2);
            iArr2[i3 + i4] = (int) j5;
            j3 = j5 >>> 32;
            i4++;
        } while (i4 < 7);
        return (int) j3;
    }

    public static int mulWordAddTo(int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = ((((long) iArr[i3]) & M) * j2) + ((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M)));
        iArr2[i4] = (int) j3;
        int i5 = i4 + 1;
        long j4 = (j3 >>> 32) + ((((long) iArr[i3 + 1]) & M) * j2) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j4;
        long j5 = iArr[i3 + 2];
        int i6 = i4 + 2;
        long j6 = (j4 >>> 32) + (((j5 + M) - (j5 | M)) * j2) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        iArr2[i6] = (int) j6;
        long j7 = iArr[i3 + 3];
        long j8 = ((j7 + M) - (j7 | M)) * j2;
        int i7 = i4 + 3;
        long j9 = iArr2[i7];
        long j10 = (j6 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr2[i7] = (int) j10;
        long j11 = ((-1) - (((-1) - ((long) iArr[i3 + 4])) | ((-1) - M))) * j2;
        int i8 = i4 + 4;
        long j12 = iArr2[i8];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr2[i8] = (int) j13;
        long j14 = iArr[i3 + 5];
        int i9 = i4 + 5;
        long j15 = (j13 >>> 32) + (((j14 + M) - (j14 | M)) * j2) + ((-1) - (((-1) - ((long) iArr2[i9])) | ((-1) - M)));
        iArr2[i9] = (int) j15;
        int i10 = i4 + 6;
        long j16 = (j15 >>> 32) + (j2 * (((long) iArr[i3 + 6]) & M)) + (((long) iArr2[i10]) & M);
        iArr2[i10] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = ((long) i2) & M;
        long j4 = ((j2 & M) * j3) + ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M)));
        iArr[i3] = (int) j4;
        int i4 = i3 + 1;
        long j5 = (j4 >>> 32) + (j3 * (j2 >>> 32)) + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j5;
        int i5 = i3 + 2;
        long j6 = iArr[i5];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M));
        iArr[i5] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i3, 3);
    }

    public static void square(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        int i4 = 0;
        int i5 = 14;
        int i6 = 6;
        while (true) {
            int i7 = i6 - 1;
            long j3 = (-1) - (((-1) - ((long) iArr[i2 + i6])) | ((-1) - M));
            long j4 = j3 * j3;
            int i8 = i4 << 31;
            int i9 = (int) (j4 >>> 33);
            iArr2[i3 + (i5 - 1)] = (i8 + i9) - (i8 & i9);
            i5 -= 2;
            iArr2[i3 + i5] = (int) (j4 >>> 1);
            i4 = (int) j4;
            if (i7 <= 0) {
                long j5 = j2 * j2;
                long j6 = i4 << 31;
                long j7 = (j5 >>> 33) | ((j6 + M) - (j6 | M));
                iArr2[i3] = (int) j5;
                int i10 = (-1) - (((-1) - ((int) (j5 >>> 32))) | ((-1) - 1));
                long j8 = ((long) iArr[i2 + 1]) & M;
                int i11 = i3 + 2;
                long j9 = (-1) - (((-1) - ((long) iArr2[i11])) | ((-1) - M));
                long j10 = j7 + (j8 * j2);
                int i12 = (int) j10;
                iArr2[i3 + 1] = (-1) - (((-1) - (i12 << 1)) & ((-1) - i10));
                long j11 = j9 + (j10 >>> 32);
                long j12 = iArr[i2 + 2];
                long j13 = (j12 + M) - (j12 | M);
                int i13 = i3 + 3;
                long j14 = (-1) - (((-1) - ((long) iArr2[i13])) | ((-1) - M));
                int i14 = i3 + 4;
                long j15 = (-1) - (((-1) - ((long) iArr2[i14])) | ((-1) - M));
                long j16 = j11 + (j13 * j2);
                int i15 = (int) j16;
                iArr2[i11] = (i15 << 1) | (i12 >>> 31);
                long j17 = j14 + (j16 >>> 32) + (j13 * j8);
                long j18 = j15 + (j17 >>> 32);
                long j19 = (j17 + M) - (j17 | M);
                long j20 = ((long) iArr[i2 + 3]) & M;
                int i16 = i3 + 5;
                long j21 = iArr2[i16];
                long j22 = (j21 + M) - (j21 | M);
                int i17 = i3 + 6;
                long j23 = (-1) - (((-1) - ((long) iArr2[i17])) | ((-1) - M));
                long j24 = j19 + (j20 * j2);
                int i18 = (int) j24;
                iArr2[i13] = (i18 << 1) | (i15 >>> 31);
                int i19 = i18 >>> 31;
                long j25 = j18 + (j24 >>> 32) + (j20 * j8);
                long j26 = j22 + (j25 >>> 32) + (j20 * j13);
                long j27 = j25 & M;
                long j28 = j23 + (j26 >>> 32);
                long j29 = (-1) - (((-1) - j26) | ((-1) - M));
                long j30 = ((long) iArr[i2 + 4]) & M;
                int i20 = i3 + 7;
                long j31 = iArr2[i20];
                long j32 = (j31 + M) - (j31 | M);
                int i21 = i3 + 8;
                long j33 = (-1) - (((-1) - ((long) iArr2[i21])) | ((-1) - M));
                long j34 = j27 + (j30 * j2);
                int i22 = (int) j34;
                iArr2[i14] = (i22 << 1) | i19;
                int i23 = i22 >>> 31;
                long j35 = j29 + (j34 >>> 32) + (j30 * j8);
                long j36 = j28 + (j35 >>> 32) + (j30 * j13);
                long j37 = (j35 + M) - (j35 | M);
                long j38 = j32 + (j36 >>> 32) + (j30 * j20);
                long j39 = (j36 + M) - (j36 | M);
                long j40 = j33 + (j38 >>> 32);
                long j41 = (j38 + M) - (j38 | M);
                long j42 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
                int i24 = i3 + 9;
                long j43 = ((long) iArr2[i24]) & M;
                int i25 = i3 + 10;
                long j44 = iArr2[i25];
                long j45 = (j44 + M) - (j44 | M);
                long j46 = j37 + (j42 * j2);
                int i26 = (int) j46;
                iArr2[i16] = i23 | (i26 << 1);
                long j47 = j39 + (j46 >>> 32) + (j42 * j8);
                long j48 = j41 + (j47 >>> 32) + (j42 * j13);
                long j49 = (j47 + M) - (j47 | M);
                long j50 = j40 + (j48 >>> 32) + (j42 * j20);
                long j51 = j48 & M;
                long j52 = j43 + (j50 >>> 32) + (j42 * j30);
                long j53 = j50 & M;
                long j54 = j45 + (j52 >>> 32);
                long j55 = (j52 + M) - (j52 | M);
                long j56 = ((long) iArr[i2 + 6]) & M;
                int i27 = i3 + 11;
                long j57 = iArr2[i27];
                long j58 = (j57 + M) - (j57 | M);
                int i28 = i3 + 12;
                long j59 = iArr2[i28];
                long j60 = (M + j59) - (M | j59);
                long j61 = j49 + (j2 * j56);
                int i29 = (int) j61;
                iArr2[i17] = (-1) - (((-1) - (i29 << 1)) & ((-1) - (i26 >>> 31)));
                long j62 = j51 + (j61 >>> 32) + (j8 * j56);
                long j63 = j53 + (j62 >>> 32) + (j56 * j13);
                long j64 = j55 + (j63 >>> 32) + (j56 * j20);
                long j65 = j54 + (j64 >>> 32) + (j56 * j30);
                long j66 = j58 + (j65 >>> 32) + (j56 * j42);
                long j67 = j60 + (j66 >>> 32);
                int i30 = (int) j62;
                iArr2[i20] = (-1) - (((-1) - (i29 >>> 31)) & ((-1) - (i30 << 1)));
                int i31 = (int) j63;
                iArr2[i21] = (i30 >>> 31) | (i31 << 1);
                int i32 = (int) j64;
                iArr2[i24] = (i31 >>> 31) | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j65;
                int i35 = i34 << 1;
                iArr2[i25] = (i33 + i35) - (i33 & i35);
                int i36 = i34 >>> 31;
                int i37 = (int) j66;
                int i38 = i37 << 1;
                iArr2[i27] = (i36 + i38) - (i36 & i38);
                int i39 = i37 >>> 31;
                int i40 = (int) j67;
                int i41 = i40 << 1;
                iArr2[i28] = (i39 + i41) - (i39 & i41);
                int i42 = i40 >>> 31;
                int i43 = i3 + 13;
                iArr2[i43] = i42 | ((iArr2[i43] + ((int) (j67 >> 32))) << 1);
                return;
            }
            i6 = i7;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        int i2 = 14;
        int i3 = 0;
        int i4 = 6;
        while (true) {
            int i5 = i4 - 1;
            long j4 = ((long) iArr[i4]) & M;
            long j5 = j4 * j4;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j5 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j5 >>> 1);
            i3 = (int) j5;
            if (i5 <= 0) {
                long j6 = j3 * j3;
                long j7 = (-1) - (((-1) - (j6 >>> 33)) & ((-1) - (((long) (i3 << 31)) & M)));
                iArr2[0] = (int) j6;
                int i6 = (int) (j6 >>> 32);
                long j8 = (-1) - (((-1) - ((long) iArr[1])) | ((-1) - M));
                long j9 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
                long j10 = j7 + (j8 * j3);
                int i7 = (int) j10;
                iArr2[1] = (-1) - (((-1) - (i7 << 1)) & ((-1) - ((i6 + 1) - (i6 | 1))));
                long j11 = j9 + (j10 >>> 32);
                long j12 = (-1) - (((-1) - ((long) iArr[2])) | ((-1) - M));
                long j13 = iArr2[3];
                long j14 = (j13 + M) - (j13 | M);
                long j15 = (-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M));
                long j16 = j11 + (j12 * j3);
                int i8 = (int) j16;
                iArr2[2] = (-1) - (((-1) - (i8 << 1)) & ((-1) - (i7 >>> 31)));
                long j17 = j14 + (j16 >>> 32) + (j12 * j8);
                long j18 = j15 + (j17 >>> 32);
                long j19 = j17 & M;
                long j20 = iArr[3];
                long j21 = (j20 + M) - (j20 | M);
                long j22 = iArr2[5];
                long j23 = (j22 + M) - (j22 | M);
                long j24 = ((long) iArr2[6]) & M;
                long j25 = j19 + (j21 * j3);
                int i9 = (int) j25;
                iArr2[3] = (-1) - (((-1) - (i9 << 1)) & ((-1) - (i8 >>> 31)));
                int i10 = i9 >>> 31;
                long j26 = j18 + (j25 >>> 32) + (j21 * j8);
                long j27 = j23 + (j26 >>> 32) + (j21 * j12);
                long j28 = (j26 + M) - (j26 | M);
                long j29 = j24 + (j27 >>> 32);
                long j30 = j27 & M;
                long j31 = (-1) - (((-1) - ((long) iArr[4])) | ((-1) - M));
                long j32 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
                long j33 = (-1) - (((-1) - ((long) iArr2[8])) | ((-1) - M));
                long j34 = j28 + (j31 * j3);
                int i11 = (int) j34;
                int i12 = i11 << 1;
                iArr2[4] = (i12 + i10) - (i12 & i10);
                int i13 = i11 >>> 31;
                long j35 = j30 + (j34 >>> 32) + (j31 * j8);
                long j36 = j29 + (j35 >>> 32) + (j31 * j12);
                long j37 = (-1) - (((-1) - j35) | ((-1) - M));
                long j38 = j32 + (j36 >>> 32) + (j31 * j21);
                long j39 = j36 & M;
                long j40 = j33 + (j38 >>> 32);
                long j41 = j38 & M;
                long j42 = (-1) - (((-1) - ((long) iArr[5])) | ((-1) - M));
                long j43 = iArr2[9];
                long j44 = (j43 + M) - (j43 | M);
                long j45 = iArr2[10];
                long j46 = (j45 + M) - (j45 | M);
                long j47 = j37 + (j42 * j3);
                int i14 = (int) j47;
                iArr2[5] = (-1) - (((-1) - (i14 << 1)) & ((-1) - i13));
                int i15 = i14 >>> 31;
                long j48 = j39 + (j47 >>> 32) + (j42 * j8);
                long j49 = j41 + (j48 >>> 32) + (j42 * j12);
                long j50 = (-1) - (((-1) - j48) | ((-1) - M));
                long j51 = j40 + (j49 >>> 32) + (j42 * j21);
                long j52 = (-1) - (((-1) - j49) | ((-1) - M));
                long j53 = j44 + (j51 >>> 32) + (j42 * j31);
                long j54 = (j51 + M) - (j51 | M);
                long j55 = j46 + (j53 >>> 32);
                long j56 = j53 & M;
                long j57 = ((long) iArr[6]) & M;
                long j58 = (-1) - (((-1) - ((long) iArr2[11])) | ((-1) - M));
                long j59 = M & ((long) iArr2[12]);
                long j60 = j50 + (j57 * j3);
                int i16 = (int) j60;
                iArr2[6] = (i16 << 1) | i15;
                long j61 = j52 + (j60 >>> 32) + (j57 * j8);
                long j62 = j54 + (j61 >>> 32) + (j12 * j57);
                long j63 = j56 + (j62 >>> 32) + (j57 * j21);
                long j64 = j55 + (j63 >>> 32) + (j57 * j31);
                long j65 = j58 + (j64 >>> 32) + (j57 * j42);
                long j66 = j59 + (j65 >>> 32);
                int i17 = (int) j61;
                iArr2[7] = (i17 << 1) | (i16 >>> 31);
                int i18 = i17 >>> 31;
                int i19 = (int) j62;
                int i20 = i19 << 1;
                iArr2[8] = (i20 + i18) - (i20 & i18);
                int i21 = i19 >>> 31;
                int i22 = (int) j63;
                iArr2[9] = (-1) - (((-1) - (i22 << 1)) & ((-1) - i21));
                int i23 = i22 >>> 31;
                int i24 = (int) j64;
                int i25 = i24 << 1;
                iArr2[10] = (i23 + i25) - (i23 & i25);
                int i26 = i24 >>> 31;
                int i27 = (int) j65;
                int i28 = i27 << 1;
                iArr2[11] = (i26 + i28) - (i26 & i28);
                int i29 = i27 >>> 31;
                int i30 = (int) j66;
                iArr2[12] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (iArr2[13] + ((int) (j66 >> 32))) << 1;
                iArr2[13] = (i31 + i32) - (i31 & i32);
                return;
            }
            i4 = i5;
        }
    }

    public static int sub(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (((long) iArr[i2]) & M) - ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
        iArr3[i4] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i2 + 1]) & M) - ((-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M))));
        iArr3[i4 + 1] = (int) j3;
        long j4 = (j3 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M))));
        iArr3[i4 + 2] = (int) j4;
        long j5 = (j4 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M))));
        iArr3[i4 + 3] = (int) j5;
        long j6 = iArr[i2 + 4];
        long j7 = (j5 >> 32) + (((j6 + M) - (j6 | M)) - ((-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M))));
        iArr3[i4 + 4] = (int) j7;
        long j8 = iArr[i2 + 5];
        long j9 = (j7 >> 32) + (((j8 + M) - (j8 | M)) - (((long) iArr2[i3 + 5]) & M));
        iArr3[i4 + 5] = (int) j9;
        long j10 = (j9 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 6])) | ((-1) - M))) - (((long) iArr2[i3 + 6]) & M));
        iArr3[i4 + 6] = (int) j10;
        return (int) (j10 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) - (((long) iArr2[0]) & M);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[1]) & M;
        long j4 = iArr2[1];
        long j5 = (j2 >> 32) + (j3 - ((j4 + M) - (j4 | M)));
        iArr3[1] = (int) j5;
        long j6 = ((long) iArr[2]) & M;
        long j7 = iArr2[2];
        long j8 = (j5 >> 32) + (j6 - ((j7 + M) - (j7 | M)));
        iArr3[2] = (int) j8;
        long j9 = iArr[3];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = iArr2[3];
        long j12 = (j8 >> 32) + (j10 - ((j11 + M) - (j11 | M)));
        iArr3[3] = (int) j12;
        long j13 = ((long) iArr[4]) & M;
        long j14 = iArr2[4];
        long j15 = (j12 >> 32) + (j13 - ((j14 + M) - (j14 | M)));
        iArr3[4] = (int) j15;
        long j16 = iArr[5];
        long j17 = (j16 + M) - (j16 | M);
        long j18 = iArr2[5];
        long j19 = (j15 >> 32) + (j17 - ((j18 + M) - (j18 | M)));
        iArr3[5] = (int) j19;
        long j20 = iArr[6];
        long j21 = (j19 >> 32) + (((j20 + M) - (j20 | M)) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j21;
        return (int) (j21 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr3[0];
        long j3 = (((j2 + M) - (j2 | M)) - (((long) iArr[0]) & M)) - ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j3;
        long j4 = iArr3[1];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = iArr[1];
        long j7 = (j3 >> 32) + ((j5 - ((j6 + M) - (j6 | M))) - (((long) iArr2[1]) & M));
        iArr3[1] = (int) j7;
        long j8 = iArr3[2];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = iArr[2];
        long j11 = (j7 >> 32) + ((j9 - ((j10 + M) - (j10 | M))) - ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))));
        iArr3[2] = (int) j11;
        long j12 = ((long) iArr3[3]) & M;
        long j13 = iArr[3];
        long j14 = (j11 >> 32) + ((j12 - ((j13 + M) - (j13 | M))) - ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M))));
        iArr3[3] = (int) j14;
        long j15 = iArr3[4];
        long j16 = (j14 >> 32) + ((((j15 + M) - (j15 | M)) - ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))));
        iArr3[4] = (int) j16;
        long j17 = iArr3[5];
        long j18 = (j16 >> 32) + ((((j17 + M) - (j17 | M)) - ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))));
        iArr3[5] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr3[6]) & M) - (((long) iArr[6]) & M)) - (((long) iArr2[6]) & M));
        iArr3[6] = (int) j19;
        return (int) (j19 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = (((long) iArr2[i3]) & M) - (((long) iArr[i2]) & M);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = iArr2[i4];
        long j4 = (j2 >> 32) + (((j3 + M) - (j3 | M)) - (((long) iArr[i2 + 1]) & M));
        iArr2[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = (j4 >> 32) + ((((long) iArr2[i5]) & M) - ((-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M))));
        iArr2[i5] = (int) j5;
        int i6 = i3 + 3;
        long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M))) - (((long) iArr[i2 + 3]) & M));
        iArr2[i6] = (int) j6;
        int i7 = i3 + 4;
        long j7 = ((long) iArr2[i7]) & M;
        long j8 = iArr[i2 + 4];
        long j9 = (j6 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr2[i7] = (int) j9;
        int i8 = i3 + 5;
        long j10 = (j9 >> 32) + (((-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M))));
        iArr2[i8] = (int) j10;
        int i9 = i3 + 6;
        long j11 = (j10 >> 32) + (((-1) - (((-1) - ((long) iArr2[i9])) | ((-1) - M))) - (((long) iArr[i2 + 6]) & M));
        iArr2[i9] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & M) - ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M)));
        iArr2[0] = (int) j2;
        long j3 = iArr2[1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = iArr[1];
        long j6 = (j2 >> 32) + (j4 - ((j5 + M) - (j5 | M)));
        iArr2[1] = (int) j6;
        long j7 = (j6 >> 32) + (((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))) - (((long) iArr[2]) & M));
        iArr2[2] = (int) j7;
        long j8 = iArr2[3];
        long j9 = (j7 >> 32) + (((j8 + M) - (j8 | M)) - ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))));
        iArr2[3] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M));
        long j11 = iArr[4];
        long j12 = (j9 >> 32) + (j10 - ((j11 + M) - (j11 | M)));
        iArr2[4] = (int) j12;
        long j13 = (j12 >> 32) + ((((long) iArr2[5]) & M) - ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M))));
        iArr2[5] = (int) j13;
        long j14 = (-1) - (((-1) - ((long) iArr2[6])) | ((-1) - M));
        long j15 = iArr[6];
        long j16 = (j13 >> 32) + (j14 - ((M + j15) - (M | j15)));
        iArr2[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, (6 - i2) << 2);
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
    }
}

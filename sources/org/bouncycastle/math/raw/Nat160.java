package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat160 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[1]) & M;
        long j4 = iArr2[1];
        long j5 = (j2 >>> 32) + j3 + ((j4 + M) - (j4 | M));
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) + (((long) iArr2[2]) & M);
        iArr3[2] = (int) j6;
        long j7 = iArr[3];
        long j8 = (j6 >>> 32) + ((j7 + M) - (j7 | M)) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M)));
        iArr3[3] = (int) j8;
        long j9 = (-1) - (((-1) - ((long) iArr[4])) | ((-1) - M));
        long j10 = iArr2[4];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr3[4] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) + ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr3[0])) | ((-1) - M)));
        iArr3[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M) + (((long) iArr3[1]) & M);
        iArr3[1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (((long) iArr3[2]) & M);
        iArr3[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M))) + (((long) iArr3[3]) & M);
        iArr3[3] = (int) j5;
        long j6 = iArr[4];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M)) + (((long) iArr2[4]) & M) + ((-1) - (((-1) - ((long) iArr3[4])) | ((-1) - M)));
        iArr3[4] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = i4;
        long j3 = ((j2 + M) - (j2 | M)) + ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M))) + (((long) iArr2[i3]) & M);
        iArr2[i3] = (int) j3;
        int i5 = i3 + 1;
        long j4 = (j3 >>> 32) + (((long) iArr[i2 + 1]) & M) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j4;
        long j5 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
        int i6 = i3 + 2;
        long j6 = iArr2[i6];
        long j7 = (j4 >>> 32) + j5 + ((j6 + M) - (j6 | M));
        iArr2[i6] = (int) j7;
        long j8 = iArr[i2 + 3];
        int i7 = i3 + 3;
        long j9 = (j7 >>> 32) + ((j8 + M) - (j8 | M)) + ((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M)));
        iArr2[i7] = (int) j9;
        int i8 = i3 + 4;
        long j10 = (j9 >>> 32) + (((long) iArr[i2 + 4]) & M) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i8]))));
        iArr2[i8] = (int) j10;
        return (int) (j10 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = iArr[0];
        long j3 = ((j2 + M) - (j2 | M)) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j3;
        long j4 = (j3 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M);
        iArr2[1] = (int) j4;
        long j5 = iArr[2];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[2];
        long j8 = (j4 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        iArr2[2] = (int) j8;
        long j9 = iArr[3];
        long j10 = (j8 >>> 32) + ((j9 + M) - (j9 | M)) + (((long) iArr2[3]) & M);
        iArr2[3] = (int) j10;
        long j11 = ((long) iArr[4]) & M;
        long j12 = iArr2[4];
        long j13 = (j10 >>> 32) + j11 + ((M + j12) - (M | j12));
        iArr2[4] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr[i2];
        long j3 = ((j2 + M) - (j2 | M)) + (((long) iArr2[i3]) & M);
        int i4 = (int) j3;
        iArr[i2] = i4;
        iArr2[i3] = i4;
        int i5 = i2 + 1;
        int i6 = i3 + 1;
        long j4 = (j3 >>> 32) + (((long) iArr[i5]) & M) + (((long) iArr2[i6]) & M);
        int i7 = (int) j4;
        iArr[i5] = i7;
        iArr2[i6] = i7;
        int i8 = i2 + 2;
        long j5 = iArr[i8];
        long j6 = (j5 + M) - (j5 | M);
        int i9 = i3 + 2;
        long j7 = iArr2[i9];
        long j8 = (j4 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        int i10 = (int) j8;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        int i12 = i3 + 3;
        long j9 = (j8 >>> 32) + ((-1) - (((-1) - ((long) iArr[i11])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i12])) | ((-1) - M)));
        int i13 = (int) j9;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i2 + 4;
        int i15 = i3 + 4;
        long j10 = (j9 >>> 32) + ((-1) - (((-1) - ((long) iArr[i14])) | ((-1) - M))) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i15]))));
        int i16 = (int) j10;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        return (int) (j10 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
    }

    public static int[] create() {
        return new int[5];
    }

    public static int[] createExt() {
        return new int[10];
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
        for (int i2 = 4; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
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
            if (i4 < 0 || i4 >= 5) {
                return 0;
            }
            i3 = iArr[i4] >>> ((i2 + 31) - (i2 | 31));
        }
        return (-1) - (((-1) - i3) | ((-1) - 1));
    }

    public static boolean gte(int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 4; i4 >= 0; i4--) {
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
        for (int i2 = 4; i2 >= 0; i2--) {
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
        for (int i2 = 1; i2 < 5; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i2 = 0; i2 < 5; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j4 = (-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M));
        long j5 = iArr2[i3 + 3];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = ((long) iArr2[i3 + 4]) & M;
        long j8 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        long j9 = j8 * j2;
        iArr3[i4] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j3);
        iArr3[i4 + 1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j4);
        iArr3[i4 + 2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j6);
        iArr3[i4 + 3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j7);
        iArr3[i4 + 4] = (int) j13;
        iArr3[i4 + 5] = (int) (j13 >>> 32);
        int i5 = 1;
        while (i5 < 5) {
            int i6 = i4 + 1;
            long j14 = ((long) iArr[i2 + i5]) & M;
            long j15 = (j14 * j2) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j15;
            int i7 = i4 + 2;
            long j16 = iArr3[i7];
            long j17 = (j15 >>> 32) + (j14 * j3) + ((j16 + M) - (j16 | M));
            iArr3[i7] = (int) j17;
            int i8 = i4 + 3;
            long j18 = (j17 >>> 32) + (j14 * j4) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j18;
            int i9 = i4 + 4;
            long j19 = iArr3[i9];
            long j20 = (j18 >>> 32) + (j14 * j6) + ((j19 + M) - (j19 | M));
            iArr3[i9] = (int) j20;
            int i10 = i4 + 5;
            long j21 = (j20 >>> 32) + (j14 * j7) + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - M)));
            iArr3[i10] = (int) j21;
            iArr3[i4 + 6] = (int) (j21 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M));
        int i2 = 1;
        long j3 = (-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M));
        long j4 = iArr2[2];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = iArr2[3];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[4];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = ((long) iArr[0]) & M;
        long j11 = j10 * j2;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j3);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j5);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j7);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j9);
        iArr3[4] = (int) j15;
        iArr3[5] = (int) (j15 >>> 32);
        for (int i3 = 5; i2 < i3; i3 = 5) {
            long j16 = ((long) iArr[i2]) & M;
            long j17 = iArr3[i2];
            long j18 = (j16 * j2) + ((j17 + M) - (j17 | M));
            iArr3[i2] = (int) j18;
            int i4 = i2 + 1;
            long j19 = (j18 >>> 32) + (j16 * j3) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - M)));
            iArr3[i4] = (int) j19;
            int i5 = i2 + 2;
            long j20 = (j19 >>> 32) + (j16 * j5) + (((long) iArr3[i5]) & M);
            iArr3[i5] = (int) j20;
            int i6 = i2 + 3;
            long j21 = iArr3[i6];
            long j22 = (j20 >>> 32) + (j16 * j7) + ((j21 + M) - (j21 | M));
            iArr3[i6] = (int) j22;
            int i7 = i2 + 4;
            long j23 = iArr3[i7];
            long j24 = (j22 >>> 32) + (j16 * j9) + ((j23 + M) - (j23 | M));
            iArr3[i7] = (int) j24;
            iArr3[i2 + 5] = (int) (j24 >>> 32);
            i2 = i4;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = ((long) iArr[i3]) & M;
        long j5 = (j3 * j4) + (((long) iArr2[i4]) & M);
        iArr3[i5] = (int) j5;
        long j6 = ((long) iArr[i3 + 1]) & M;
        long j7 = (j5 >>> 32) + (j3 * j6) + j4 + ((-1) - (((-1) - ((long) iArr2[i4 + 1])) | ((-1) - M)));
        iArr3[i5 + 1] = (int) j7;
        long j8 = iArr[i3 + 2];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = (j7 >>> 32) + (j3 * j9) + j6 + ((-1) - (((-1) - ((long) iArr2[i4 + 2])) | ((-1) - M)));
        iArr3[i5 + 2] = (int) j10;
        long j11 = ((long) iArr[i3 + 3]) & M;
        long j12 = (j10 >>> 32) + (j3 * j11) + j9 + ((-1) - (((-1) - ((long) iArr2[i4 + 3])) | ((-1) - M)));
        iArr3[i5 + 3] = (int) j12;
        long j13 = (-1) - (((-1) - ((long) iArr[i3 + 4])) | ((-1) - M));
        long j14 = (j12 >>> 32) + (j3 * j13) + j11 + (M & ((long) iArr2[i4 + 4]));
        iArr3[i5 + 4] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j4 = j2 & M;
        long j5 = (j3 * j4) + ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M)));
        iArr[i3] = (int) j5;
        long j6 = j2 >>> 32;
        int i4 = i3 + 1;
        long j7 = (j5 >>> 32) + (j3 * j6) + j4 + (((long) iArr[i4]) & M);
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
        return Nat.incAt(5, iArr, i3, 4);
    }

    public static int mul33WordAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = ((long) i3) & M;
        long j4 = (j2 * j3) + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j4;
        int i5 = i4 + 1;
        long j5 = (j4 >>> 32) + j3 + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j5;
        int i6 = i4 + 2;
        long j6 = (j5 >>> 32) + ((-1) - (((-1) - ((long) iArr[i6])) | ((-1) - M)));
        iArr[i6] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr2[i3];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j5 = iArr2[i3 + 2];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[i3 + 3];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = (-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M));
        long j10 = 0;
        int i5 = 0;
        while (i5 < 5) {
            long j11 = (-1) - (((-1) - ((long) iArr[i2 + i5])) | ((-1) - M));
            long j12 = (j11 * j3) + (((long) iArr3[i4]) & M);
            iArr3[i4] = (int) j12;
            int i6 = i4 + 1;
            long j13 = (j12 >>> 32) + (j11 * j4) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j13;
            int i7 = i4 + 2;
            long j14 = iArr3[i7];
            long j15 = (j13 >>> 32) + (j11 * j6) + ((j14 + M) - (j14 | M));
            iArr3[i7] = (int) j15;
            int i8 = i4 + 3;
            long j16 = iArr3[i8];
            long j17 = (j15 >>> 32) + (j11 * j8) + ((j16 + M) - (j16 | M));
            iArr3[i8] = (int) j17;
            int i9 = i4 + 4;
            long j18 = (j17 >>> 32) + (j11 * j9) + (((long) iArr3[i9]) & M);
            iArr3[i9] = (int) j18;
            int i10 = i4 + 5;
            long j19 = (j18 >>> 32) + j10 + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - M)));
            iArr3[i10] = (int) j19;
            j10 = j19 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j10;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        long j2 = ((long) iArr2[0]) & M;
        long j3 = ((long) iArr2[1]) & M;
        long j4 = ((long) iArr2[2]) & M;
        long j5 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j6 = ((long) iArr2[4]) & M;
        long j7 = 0;
        while (i2 < 5) {
            long j8 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
            long j9 = (j8 * j2) + ((-1) - (((-1) - ((long) iArr3[i2])) | ((-1) - M)));
            iArr3[i2] = (int) j9;
            int i3 = i2 + 1;
            long j10 = (j9 >>> 32) + (j8 * j3) + ((-1) - (((-1) - ((long) iArr3[i3])) | ((-1) - M)));
            iArr3[i3] = (int) j10;
            int i4 = i2 + 2;
            long j11 = (j10 >>> 32) + (j8 * j4) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - M)));
            iArr3[i4] = (int) j11;
            int i5 = i2 + 3;
            long j12 = iArr3[i5];
            long j13 = (j11 >>> 32) + (j8 * j5) + ((j12 + M) - (j12 | M));
            iArr3[i5] = (int) j13;
            int i6 = i2 + 4;
            long j14 = (j13 >>> 32) + (j8 * j6) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j14;
            int i7 = i2 + 5;
            long j15 = (j14 >>> 32) + j7 + (((long) iArr3[i7]) & M);
            iArr3[i7] = (int) j15;
            j7 = j15 >>> 32;
            i2 = i3;
        }
        return (int) j7;
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
        } while (i4 < 5);
        return (int) j3;
    }

    public static int mulWordAddExt(int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M))) * j2;
        long j4 = iArr2[i4];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        iArr2[i4] = (int) j5;
        int i5 = i4 + 1;
        long j6 = (j5 >>> 32) + ((((long) iArr[i3 + 1]) & M) * j2) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j6;
        long j7 = (((long) iArr[i3 + 2]) & M) * j2;
        int i6 = i4 + 2;
        long j8 = iArr2[i6];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr2[i6] = (int) j9;
        long j10 = iArr[i3 + 3];
        int i7 = i4 + 3;
        long j11 = (j9 >>> 32) + (((j10 + M) - (j10 | M)) * j2) + (((long) iArr2[i7]) & M);
        iArr2[i7] = (int) j11;
        int i8 = i4 + 4;
        long j12 = (j11 >>> 32) + (j2 * (((long) iArr[i3 + 4]) & M)) + ((-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M)));
        iArr2[i8] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = i2;
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (((j2 + M) - (j2 | M)) * j4) + ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M)));
        iArr[i3] = (int) j5;
        int i4 = i3 + 1;
        long j6 = (j5 >>> 32) + (j4 * (j2 >>> 32)) + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j6;
        int i5 = i3 + 2;
        long j7 = (j6 >>> 32) + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i3, 3);
    }

    public static int mulWordsAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = (((long) i3) & M) * ((-1) - (((-1) - ((long) i2)) | ((-1) - M)));
        long j3 = iArr[i4];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        iArr[i4] = (int) j4;
        int i5 = i4 + 1;
        long j5 = (j4 >>> 32) + (M & ((long) iArr[i5]));
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(5, iArr, i4, 2);
    }

    public static void square(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        int i4 = 0;
        int i5 = 10;
        int i6 = 4;
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
                long j6 = (j5 >>> 33) | (((long) (i4 << 31)) & M);
                iArr2[i3] = (int) j5;
                int i8 = (int) (j5 >>> 32);
                int i9 = (i8 + 1) - (i8 | 1);
                long j7 = ((long) iArr[i2 + 1]) & M;
                int i10 = i3 + 2;
                long j8 = (-1) - (((-1) - ((long) iArr2[i10])) | ((-1) - M));
                long j9 = j6 + (j7 * j2);
                int i11 = (int) j9;
                int i12 = i11 << 1;
                iArr2[i3 + 1] = (i12 + i9) - (i12 & i9);
                long j10 = j8 + (j9 >>> 32);
                long j11 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
                int i13 = i3 + 3;
                long j12 = ((long) iArr2[i13]) & M;
                int i14 = i3 + 4;
                long j13 = iArr2[i14];
                long j14 = (j13 + M) - (j13 | M);
                long j15 = j10 + (j11 * j2);
                int i15 = (int) j15;
                iArr2[i10] = (i15 << 1) | (i11 >>> 31);
                long j16 = j12 + (j15 >>> 32) + (j11 * j7);
                long j17 = j14 + (j16 >>> 32);
                long j18 = (-1) - (((-1) - j16) | ((-1) - M));
                long j19 = ((long) iArr[i2 + 3]) & M;
                int i16 = i3 + 5;
                long j20 = (((long) iArr2[i16]) & M) + (j17 >>> 32);
                long j21 = j17 & M;
                int i17 = i3 + 6;
                long j22 = iArr2[i17];
                long j23 = ((j22 + M) - (j22 | M)) + (j20 >>> 32);
                long j24 = j20 & M;
                long j25 = j18 + (j19 * j2);
                int i18 = (int) j25;
                iArr2[i13] = (i18 << 1) | (i15 >>> 31);
                long j26 = j21 + (j25 >>> 32) + (j19 * j7);
                long j27 = j24 + (j26 >>> 32) + (j19 * j11);
                long j28 = (j26 + M) - (j26 | M);
                long j29 = j23 + (j27 >>> 32);
                long j30 = j27 & M;
                long j31 = (-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M));
                int i19 = i3 + 7;
                long j32 = (((long) iArr2[i19]) & M) + (j29 >>> 32);
                long j33 = (-1) - (((-1) - j29) | ((-1) - M));
                int i20 = i3 + 8;
                long j34 = iArr2[i20];
                long j35 = ((j34 + M) - (j34 | M)) + (j32 >>> 32);
                long j36 = (-1) - (((-1) - j32) | ((-1) - M));
                long j37 = j28 + (j2 * j31);
                int i21 = (int) j37;
                iArr2[i14] = (-1) - (((-1) - (i21 << 1)) & ((-1) - (i18 >>> 31)));
                int i22 = i21 >>> 31;
                long j38 = j30 + (j37 >>> 32) + (j7 * j31);
                long j39 = j33 + (j38 >>> 32) + (j31 * j11);
                long j40 = j36 + (j39 >>> 32) + (j31 * j19);
                long j41 = j35 + (j40 >>> 32);
                int i23 = (int) j38;
                iArr2[i16] = (-1) - (((-1) - i22) & ((-1) - (i23 << 1)));
                int i24 = i23 >>> 31;
                int i25 = (int) j39;
                int i26 = i25 << 1;
                iArr2[i17] = (i24 + i26) - (i24 & i26);
                int i27 = i25 >>> 31;
                int i28 = (int) j40;
                int i29 = i28 << 1;
                iArr2[i19] = (i27 + i29) - (i27 & i29);
                int i30 = (int) j41;
                iArr2[i20] = (i28 >>> 31) | (i30 << 1);
                int i31 = i3 + 9;
                iArr2[i31] = (-1) - (((-1) - (i30 >>> 31)) & ((-1) - ((iArr2[i31] + ((int) (j41 >>> 32))) << 1)));
                return;
            }
            i6 = i7;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        int i2 = 10;
        int i3 = 0;
        int i4 = 4;
        while (true) {
            int i5 = i4 - 1;
            long j4 = ((long) iArr[i4]) & M;
            long j5 = j4 * j4;
            iArr2[i2 - 1] = (-1) - (((-1) - (i3 << 31)) & ((-1) - ((int) (j5 >>> 33))));
            i2 -= 2;
            iArr2[i2] = (int) (j5 >>> 1);
            i3 = (int) j5;
            if (i5 <= 0) {
                long j6 = j3 * j3;
                long j7 = (j6 >>> 33) | (((long) (i3 << 31)) & M);
                iArr2[0] = (int) j6;
                int i6 = (-1) - (((-1) - ((int) (j6 >>> 32))) | ((-1) - 1));
                long j8 = iArr[1];
                long j9 = (j8 + M) - (j8 | M);
                long j10 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
                long j11 = j7 + (j9 * j3);
                int i7 = (int) j11;
                iArr2[1] = (i7 << 1) | i6;
                long j12 = j10 + (j11 >>> 32);
                long j13 = ((long) iArr[2]) & M;
                long j14 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
                long j15 = ((long) iArr2[4]) & M;
                long j16 = j12 + (j13 * j3);
                int i8 = (int) j16;
                iArr2[2] = (-1) - (((-1) - (i8 << 1)) & ((-1) - (i7 >>> 31)));
                int i9 = i8 >>> 31;
                long j17 = j14 + (j16 >>> 32) + (j13 * j9);
                long j18 = j15 + (j17 >>> 32);
                long j19 = (-1) - (((-1) - j17) | ((-1) - M));
                long j20 = ((long) iArr[3]) & M;
                long j21 = (((long) iArr2[5]) & M) + (j18 >>> 32);
                long j22 = (j18 + M) - (j18 | M);
                long j23 = iArr2[6];
                long j24 = ((j23 + M) - (j23 | M)) + (j21 >>> 32);
                long j25 = (-1) - (((-1) - j21) | ((-1) - M));
                long j26 = j19 + (j20 * j3);
                int i10 = (int) j26;
                iArr2[3] = (i10 << 1) | i9;
                int i11 = i10 >>> 31;
                long j27 = j22 + (j26 >>> 32) + (j20 * j9);
                long j28 = j25 + (j27 >>> 32) + (j20 * j13);
                long j29 = j27 & M;
                long j30 = j24 + (j28 >>> 32);
                long j31 = j28 & M;
                long j32 = ((long) iArr[4]) & M;
                long j33 = (((long) iArr2[7]) & M) + (j30 >>> 32);
                long j34 = (-1) - (((-1) - j30) | ((-1) - M));
                long j35 = (((long) iArr2[8]) & M) + (j33 >>> 32);
                long j36 = (-1) - (((-1) - M) | ((-1) - j33));
                long j37 = j29 + (j32 * j3);
                int i12 = (int) j37;
                iArr2[4] = (-1) - (((-1) - i11) & ((-1) - (i12 << 1)));
                long j38 = j31 + (j37 >>> 32) + (j9 * j32);
                long j39 = j34 + (j38 >>> 32) + (j32 * j13);
                long j40 = j36 + (j39 >>> 32) + (j32 * j20);
                long j41 = j35 + (j40 >>> 32);
                int i13 = (int) j38;
                iArr2[5] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) j39;
                iArr2[6] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                int i17 = (int) j40;
                int i18 = i17 << 1;
                iArr2[7] = (i16 + i18) - (i16 & i18);
                int i19 = (int) j41;
                iArr2[8] = (i17 >>> 31) | (i19 << 1);
                iArr2[9] = (i19 >>> 31) | ((iArr2[9] + ((int) (j41 >>> 32))) << 1);
                return;
            }
            i4 = i5;
        }
    }

    public static int sub(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr[i2];
        long j3 = ((j2 + M) - (j2 | M)) - ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
        iArr3[i4] = (int) j3;
        long j4 = (j3 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 1])) | ((-1) - M))) - (((long) iArr2[i3 + 1]) & M));
        iArr3[i4 + 1] = (int) j4;
        long j5 = ((long) iArr[i2 + 2]) & M;
        long j6 = iArr2[i3 + 2];
        long j7 = (j4 >> 32) + (j5 - ((j6 + M) - (j6 | M)));
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3];
        long j9 = (j7 >> 32) + (((j8 + M) - (j8 | M)) - (((long) iArr2[i3 + 3]) & M));
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4];
        long j11 = (j9 >> 32) + (((j10 + M) - (j10 | M)) - ((-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M))));
        iArr3[i4 + 4] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr[0]) & M;
        long j3 = iArr2[0];
        long j4 = j2 - ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[1]) & M) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j5;
        long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j6;
        long j7 = iArr[3];
        long j8 = (j6 >> 32) + (((j7 + M) - (j7 | M)) - ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M))));
        iArr3[3] = (int) j8;
        long j9 = (j8 >> 32) + ((((long) iArr[4]) & M) - ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))));
        iArr3[4] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr3[0]) & M;
        long j3 = iArr[0];
        long j4 = (j2 - ((j3 + M) - (j3 | M))) - ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j4;
        long j5 = ((-1) - (((-1) - ((long) iArr3[1])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M)));
        long j6 = iArr2[1];
        long j7 = (j4 >> 32) + (j5 - ((j6 + M) - (j6 | M)));
        iArr3[1] = (int) j7;
        long j8 = (-1) - (((-1) - ((long) iArr3[2])) | ((-1) - M));
        long j9 = iArr[2];
        long j10 = (j7 >> 32) + ((j8 - ((j9 + M) - (j9 | M))) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j10;
        long j11 = iArr3[3];
        long j12 = ((j11 + M) - (j11 | M)) - ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M)));
        long j13 = iArr2[3];
        long j14 = (j10 >> 32) + (j12 - ((j13 + M) - (j13 | M)));
        iArr3[3] = (int) j14;
        long j15 = ((long) iArr3[4]) & M;
        long j16 = iArr[4];
        long j17 = j15 - ((j16 + M) - (j16 | M));
        long j18 = iArr2[4];
        long j19 = (j14 >> 32) + (j17 - ((j18 + M) - (j18 | M)));
        iArr3[4] = (int) j19;
        return (int) (j19 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr2[i3];
        long j3 = ((j2 + M) - (j2 | M)) - ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M)));
        iArr2[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = ((long) iArr2[i4]) & M;
        long j5 = iArr[i2 + 1];
        long j6 = (j3 >> 32) + (j4 - ((j5 + M) - (j5 | M)));
        iArr2[i4] = (int) j6;
        int i5 = i3 + 2;
        long j7 = iArr2[i5];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = iArr[i2 + 2];
        long j10 = (j6 >> 32) + (j8 - ((j9 + M) - (j9 | M)));
        iArr2[i5] = (int) j10;
        int i6 = i3 + 3;
        long j11 = (-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M));
        long j12 = iArr[i2 + 3];
        long j13 = (j10 >> 32) + (j11 - ((j12 + M) - (j12 | M)));
        iArr2[i6] = (int) j13;
        int i7 = i3 + 4;
        long j14 = (j13 >> 32) + (((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))));
        iArr2[i7] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = iArr2[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr[0];
        long j5 = j3 - ((j4 + M) - (j4 | M));
        iArr2[0] = (int) j5;
        long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))));
        iArr2[1] = (int) j6;
        long j7 = ((long) iArr2[2]) & M;
        long j8 = iArr[2];
        long j9 = (j6 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr2[2] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j11 = iArr[3];
        long j12 = (j9 >> 32) + (j10 - ((j11 + M) - (j11 | M)));
        iArr2[3] = (int) j12;
        long j13 = iArr2[4];
        long j14 = (j12 >> 32) + (((j13 + M) - (j13 | M)) - (M & ((long) iArr[4])));
        iArr2[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, (4 - i2) << 2);
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
    }
}

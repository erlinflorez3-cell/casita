package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[0];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        iArr3[0] = (int) j5;
        long j6 = (-1) - (((-1) - ((long) iArr[1])) | ((-1) - M));
        long j7 = iArr2[1];
        long j8 = (j5 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[2]) & M) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M)));
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) + (((long) iArr2[3]) & M);
        iArr3[3] = (int) j10;
        long j11 = ((long) iArr[4]) & M;
        long j12 = iArr2[4];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M));
        iArr3[4] = (int) j13;
        long j14 = ((long) iArr[5]) & M;
        long j15 = iArr2[5];
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr3[5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        long j3 = iArr3[0];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = (-1) - (((-1) - ((long) iArr[1])) | ((-1) - M));
        long j6 = iArr2[1];
        long j7 = j5 + ((j6 + M) - (j6 | M));
        long j8 = iArr3[1];
        long j9 = (j4 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (((long) iArr[2]) & M) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))) + (((long) iArr3[2]) & M);
        iArr3[2] = (int) j10;
        long j11 = iArr[3];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = iArr2[3];
        long j14 = (j10 >>> 32) + j12 + ((j13 + M) - (j13 | M)) + ((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M)));
        iArr3[3] = (int) j14;
        long j15 = (-1) - (((-1) - ((long) iArr[4])) | ((-1) - M));
        long j16 = iArr2[4];
        long j17 = (j14 >>> 32) + j15 + ((j16 + M) - (j16 | M)) + ((-1) - (((-1) - ((long) iArr3[4])) | ((-1) - M)));
        iArr3[4] = (int) j17;
        long j18 = ((long) iArr[5]) & M;
        long j19 = iArr2[5];
        long j20 = (j17 >>> 32) + j18 + ((j19 + M) - (j19 | M)) + ((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M)));
        iArr3[5] = (int) j20;
        return (int) (j20 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = (-1) - (((-1) - ((long) i4)) | ((-1) - M));
        long j3 = iArr[i2];
        long j4 = j2 + ((j3 + M) - (j3 | M)) + ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
        iArr2[i3] = (int) j4;
        long j5 = iArr[i2 + 1];
        int i5 = i3 + 1;
        long j6 = (j4 >>> 32) + ((j5 + M) - (j5 | M)) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j6;
        int i6 = i3 + 2;
        long j7 = (j6 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M)));
        iArr2[i6] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & M;
        int i7 = i3 + 3;
        long j9 = iArr2[i7];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr2[i7] = (int) j10;
        int i8 = i3 + 4;
        long j11 = (j10 >>> 32) + ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M)));
        iArr2[i8] = (int) j11;
        int i9 = i3 + 5;
        long j12 = (j11 >>> 32) + (((long) iArr[i2 + 5]) & M) + (M & ((long) iArr2[i9]));
        iArr2[i9] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = iArr[0];
        long j3 = ((j2 + M) - (j2 | M)) + ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr2[0] = (int) j3;
        long j4 = iArr[1];
        long j5 = (j3 >>> 32) + ((j4 + M) - (j4 | M)) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M)));
        iArr2[1] = (int) j5;
        long j6 = ((long) iArr[2]) & M;
        long j7 = iArr2[2];
        long j8 = (j5 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        iArr2[2] = (int) j8;
        long j9 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
        long j10 = iArr2[3];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr2[3] = (int) j11;
        long j12 = (j11 >>> 32) + ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M))) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j12;
        long j13 = iArr[5];
        long j14 = (j12 >>> 32) + ((j13 + M) - (j13 | M)) + (M & ((long) iArr2[5]));
        iArr2[5] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
        int i4 = (int) j2;
        iArr[i2] = i4;
        iArr2[i3] = i4;
        int i5 = i2 + 1;
        long j3 = iArr[i5];
        int i6 = i3 + 1;
        long j4 = (j2 >>> 32) + ((j3 + M) - (j3 | M)) + (((long) iArr2[i6]) & M);
        int i7 = (int) j4;
        iArr[i5] = i7;
        iArr2[i6] = i7;
        int i8 = i2 + 2;
        long j5 = (-1) - (((-1) - ((long) iArr[i8])) | ((-1) - M));
        int i9 = i3 + 2;
        long j6 = iArr2[i9];
        long j7 = (j4 >>> 32) + j5 + ((j6 + M) - (j6 | M));
        int i10 = (int) j7;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        long j8 = ((long) iArr[i11]) & M;
        int i12 = i3 + 3;
        long j9 = iArr2[i12];
        long j10 = (j7 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        int i13 = (int) j10;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i2 + 4;
        int i15 = i3 + 4;
        long j11 = (j10 >>> 32) + ((-1) - (((-1) - ((long) iArr[i14])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i15])) | ((-1) - M)));
        int i16 = (int) j11;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i2 + 5;
        int i18 = i3 + 5;
        long j12 = (j11 >>> 32) + (((long) iArr[i17]) & M) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i18]))));
        int i19 = (int) j12;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        return (int) (j12 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
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
        for (int i2 = 5; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i2 = 2; i2 >= 0; i2--) {
            if (jArr[i2] != jArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
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
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
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
            int i4 = i2 >> 5;
            if (i4 < 0 || i4 >= 6) {
                return 0;
            }
            i3 = iArr[i4] >>> (i2 & 31);
        }
        return (i3 + 1) - (i3 | 1);
    }

    public static boolean gte(int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 5; i4 >= 0; i4--) {
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
        for (int i2 = 5; i2 >= 0; i2--) {
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
        for (int i2 = 1; i2 < 6; i2++) {
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
        for (int i2 = 1; i2 < 3; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i2 = 0; i2 < 6; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i2 = 0; i2 < 3; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M));
        long j3 = iArr2[i3 + 1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = iArr2[i3 + 2];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[i3 + 3];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = ((long) iArr2[i3 + 4]) & M;
        long j10 = iArr2[i3 + 5];
        long j11 = (j10 + M) - (j10 | M);
        long j12 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        long j13 = j12 * j2;
        iArr3[i4] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j4);
        iArr3[i4 + 1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j6);
        iArr3[i4 + 2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j8);
        iArr3[i4 + 3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j9);
        iArr3[i4 + 4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j11);
        iArr3[i4 + 5] = (int) j18;
        iArr3[i4 + 6] = (int) (j18 >>> 32);
        int i5 = 1;
        while (i5 < 6) {
            int i6 = i4 + 1;
            long j19 = (-1) - (((-1) - ((long) iArr[i2 + i5])) | ((-1) - M));
            long j20 = (j19 * j2) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j20;
            int i7 = i4 + 2;
            long j21 = iArr3[i7];
            long j22 = (j20 >>> 32) + (j19 * j4) + ((j21 + M) - (j21 | M));
            iArr3[i7] = (int) j22;
            int i8 = i4 + 3;
            long j23 = (j22 >>> 32) + (j19 * j6) + (((long) iArr3[i8]) & M);
            iArr3[i8] = (int) j23;
            int i9 = i4 + 4;
            long j24 = (j23 >>> 32) + (j19 * j8) + (((long) iArr3[i9]) & M);
            iArr3[i9] = (int) j24;
            int i10 = i4 + 5;
            long j25 = iArr3[i10];
            long j26 = (j24 >>> 32) + (j19 * j9) + ((j25 + M) - (j25 | M));
            iArr3[i10] = (int) j26;
            int i11 = i4 + 6;
            long j27 = (j26 >>> 32) + (j19 * j11) + ((-1) - (((-1) - ((long) iArr3[i11])) | ((-1) - M)));
            iArr3[i11] = (int) j27;
            iArr3[i4 + 7] = (int) (j27 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M));
        long j3 = ((long) iArr2[1]) & M;
        long j4 = iArr2[2];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = iArr2[3];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[4];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = ((long) iArr2[5]) & M;
        long j11 = iArr[0];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = j12 * j2;
        iArr3[0] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j3);
        int i2 = 1;
        iArr3[1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j5);
        iArr3[2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j7);
        iArr3[3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j9);
        iArr3[4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j10);
        iArr3[5] = (int) j18;
        int i3 = (int) (j18 >>> 32);
        iArr3[6] = i3;
        for (int i4 = 6; i2 < i4; i4 = 6) {
            long j19 = iArr[i2];
            long j20 = (j19 + M) - (j19 | M);
            long j21 = (j20 * j2) + ((-1) - (((-1) - ((long) iArr3[i2])) | ((-1) - M)));
            iArr3[i2] = (int) j21;
            int i5 = i2 + 1;
            long j22 = (j21 >>> 32) + (j20 * j3) + ((-1) - (((-1) - ((long) iArr3[i5])) | ((-1) - M)));
            iArr3[i5] = (int) j22;
            int i6 = i2 + 2;
            long j23 = iArr3[i6];
            long j24 = (j22 >>> 32) + (j20 * j5) + ((j23 + M) - (j23 | M));
            iArr3[i6] = (int) j24;
            int i7 = i2 + 3;
            long j25 = iArr3[i7];
            long j26 = (j24 >>> 32) + (j20 * j7) + ((j25 + M) - (j25 | M));
            iArr3[i7] = (int) j26;
            int i8 = i2 + 4;
            long j27 = (j26 >>> 32) + (j20 * j9) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j27;
            int i9 = i2 + 5;
            long j28 = (j27 >>> 32) + (j20 * j10) + ((-1) - (((-1) - ((long) iArr3[i9])) | ((-1) - M)));
            iArr3[i9] = (int) j28;
            iArr3[i2 + 6] = (int) (j28 >>> 32);
            i2 = i5;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = iArr[i3];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (j2 * j4) + ((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M)));
        iArr3[i5] = (int) j5;
        long j6 = iArr[i3 + 1];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[i4 + 1];
        long j9 = (j5 >>> 32) + (j2 * j7) + j4 + ((j8 + M) - (j8 | M));
        iArr3[i5 + 1] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr[i3 + 2])) | ((-1) - M));
        long j11 = iArr2[i4 + 2];
        long j12 = (j9 >>> 32) + (j2 * j10) + j7 + ((j11 + M) - (j11 | M));
        iArr3[i5 + 2] = (int) j12;
        long j13 = (-1) - (((-1) - ((long) iArr[i3 + 3])) | ((-1) - M));
        long j14 = (j12 >>> 32) + (j2 * j13) + j10 + (((long) iArr2[i4 + 3]) & M);
        iArr3[i5 + 3] = (int) j14;
        long j15 = (-1) - (((-1) - ((long) iArr[i3 + 4])) | ((-1) - M));
        long j16 = (j14 >>> 32) + (j2 * j15) + j13 + ((-1) - (((-1) - ((long) iArr2[i4 + 4])) | ((-1) - M)));
        iArr3[i5 + 4] = (int) j16;
        long j17 = iArr[i3 + 5];
        long j18 = (j17 + M) - (j17 | M);
        long j19 = (j16 >>> 32) + (j2 * j18) + j15 + (M & ((long) iArr2[i4 + 5]));
        iArr3[i5 + 5] = (int) j19;
        return (j19 >>> 32) + j18;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = ((long) i2) & M;
        long j4 = (j2 + M) - (j2 | M);
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
        return Nat.incAt(6, iArr, i3, 4);
    }

    public static int mul33WordAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = i3;
        long j5 = (j4 + M) - (j4 | M);
        long j6 = (j3 * j5) + (((long) iArr[i4]) & M);
        iArr[i4] = (int) j6;
        int i5 = i4 + 1;
        long j7 = (j6 >>> 32) + j5 + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j7;
        int i6 = i4 + 2;
        long j8 = iArr[i6];
        long j9 = (j7 >>> 32) + ((j8 + M) - (j8 | M));
        iArr[i6] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((long) iArr2[i3]) & M;
        long j3 = iArr2[i3 + 1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = ((long) iArr2[i3 + 2]) & M;
        long j6 = iArr2[i3 + 3];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[i3 + 4];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = iArr2[i3 + 5];
        long j11 = (j10 + M) - (j10 | M);
        long j12 = 0;
        int i5 = 0;
        while (i5 < 6) {
            long j13 = (-1) - (((-1) - ((long) iArr[i2 + i5])) | ((-1) - M));
            long j14 = iArr3[i4];
            long j15 = (j13 * j2) + ((j14 + M) - (j14 | M));
            iArr3[i4] = (int) j15;
            int i6 = i4 + 1;
            long j16 = (j15 >>> 32) + (j13 * j4) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j16;
            int i7 = i4 + 2;
            long j17 = iArr3[i7];
            long j18 = (j16 >>> 32) + (j13 * j5) + ((j17 + M) - (j17 | M));
            iArr3[i7] = (int) j18;
            int i8 = i4 + 3;
            long j19 = (j18 >>> 32) + (j13 * j7) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j19;
            int i9 = i4 + 4;
            long j20 = iArr3[i9];
            long j21 = (j19 >>> 32) + (j13 * j9) + ((j20 + M) - (j20 | M));
            iArr3[i9] = (int) j21;
            int i10 = i4 + 5;
            long j22 = (j21 >>> 32) + (j13 * j11) + (((long) iArr3[i10]) & M);
            iArr3[i10] = (int) j22;
            int i11 = i4 + 6;
            long j23 = (j22 >>> 32) + j12 + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j23;
            j12 = j23 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j12;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        long j2 = iArr2[0];
        long j3 = M;
        long j4 = j2 & M;
        long j5 = (-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M));
        long j6 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j8 = iArr2[4];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = (-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M));
        long j11 = 0;
        while (i2 < 6) {
            long j12 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - j3));
            long j13 = ((-1) - (((-1) - ((long) iArr3[i2])) | ((-1) - j3))) + (j12 * j4);
            iArr3[i2] = (int) j13;
            int i3 = i2 + 1;
            long j14 = (j13 >>> 32) + (j12 * j5) + ((-1) - (((-1) - ((long) iArr3[i3])) | ((-1) - j3)));
            iArr3[i3] = (int) j14;
            int i4 = i2 + 2;
            long j15 = iArr3[i4];
            long j16 = (j14 >>> 32) + (j12 * j6) + ((j15 + j3) - (j15 | j3));
            iArr3[i4] = (int) j16;
            int i5 = i2 + 3;
            long j17 = (j16 >>> 32) + (j12 * j7) + ((-1) - (((-1) - ((long) iArr3[i5])) | ((-1) - j3)));
            iArr3[i5] = (int) j17;
            int i6 = i2 + 4;
            long j18 = iArr3[i6];
            long j19 = (j17 >>> 32) + (j12 * j9) + ((j18 + j3) - (j18 | j3));
            iArr3[i6] = (int) j19;
            int i7 = i2 + 5;
            long j20 = (j19 >>> 32) + (j12 * j10) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - j3)));
            iArr3[i7] = (int) j20;
            int i8 = i2 + 6;
            long j21 = (j20 >>> 32) + j11 + (((long) iArr3[i8]) & j3);
            iArr3[i8] = (int) j21;
            j11 = j21 >>> 32;
            i2 = i3;
            j3 = M;
        }
        return (int) j11;
    }

    public static int mulWord(int i2, int[] iArr, int[] iArr2, int i3) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = 0;
        int i4 = 0;
        do {
            long j4 = iArr[i4];
            long j5 = j3 + (((j4 + M) - (j4 | M)) * j2);
            iArr2[i3 + i4] = (int) j5;
            j3 = j5 >>> 32;
            i4++;
        } while (i4 < 6);
        return (int) j3;
    }

    public static int mulWordAddExt(int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = (((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M))) * j3) + (((long) iArr2[i4]) & M);
        iArr2[i4] = (int) j4;
        long j5 = iArr[i3 + 1];
        long j6 = ((j5 + M) - (j5 | M)) * j3;
        int i5 = i4 + 1;
        long j7 = iArr2[i5];
        long j8 = (j4 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        iArr2[i5] = (int) j8;
        long j9 = iArr[i3 + 2];
        int i6 = i4 + 2;
        long j10 = (j8 >>> 32) + (((j9 + M) - (j9 | M)) * j3) + (((long) iArr2[i6]) & M);
        iArr2[i6] = (int) j10;
        int i7 = i4 + 3;
        long j11 = (j10 >>> 32) + ((((long) iArr[i3 + 3]) & M) * j3) + (((long) iArr2[i7]) & M);
        iArr2[i7] = (int) j11;
        long j12 = iArr[i3 + 4];
        int i8 = i4 + 4;
        long j13 = (j11 >>> 32) + (((j12 + M) - (j12 | M)) * j3) + ((-1) - (((-1) - ((long) iArr2[i8])) | ((-1) - M)));
        iArr2[i8] = (int) j13;
        long j14 = j3 * (((long) iArr[i3 + 5]) & M);
        int i9 = i4 + 5;
        long j15 = iArr2[i9];
        long j16 = (j13 >>> 32) + j14 + ((j15 + M) - (j15 | M));
        iArr2[i9] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = i2;
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (((j2 + M) - (j2 | M)) * j4) + ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M)));
        iArr[i3] = (int) j5;
        int i4 = i3 + 1;
        long j6 = iArr[i4];
        long j7 = (j5 >>> 32) + (j4 * (j2 >>> 32)) + ((j6 + M) - (j6 | M));
        iArr[i4] = (int) j7;
        int i5 = i3 + 2;
        long j8 = (j7 >>> 32) + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static void square(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr[i2];
        long j3 = (j2 + M) - (j2 | M);
        int i4 = 0;
        int i5 = 12;
        int i6 = 5;
        while (true) {
            int i7 = i6 - 1;
            long j4 = ((long) iArr[i2 + i6]) & M;
            long j5 = j4 * j4;
            iArr2[i3 + (i5 - 1)] = (-1) - (((-1) - (i4 << 31)) & ((-1) - ((int) (j5 >>> 33))));
            i5 -= 2;
            iArr2[i3 + i5] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i7 <= 0) {
                long j6 = j3 * j3;
                long j7 = (-1) - (((-1) - (j6 >>> 33)) & ((-1) - (((long) (i4 << 31)) & M)));
                iArr2[i3] = (int) j6;
                int i8 = (int) (j6 >>> 32);
                long j8 = iArr[i2 + 1];
                long j9 = (j8 + M) - (j8 | M);
                int i9 = i3 + 2;
                long j10 = (-1) - (((-1) - ((long) iArr2[i9])) | ((-1) - M));
                long j11 = j7 + (j9 * j3);
                int i10 = (int) j11;
                iArr2[i3 + 1] = (i10 << 1) | ((i8 + 1) - (i8 | 1));
                int i11 = i10 >>> 31;
                long j12 = j10 + (j11 >>> 32);
                long j13 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
                int i12 = i3 + 3;
                long j14 = iArr2[i12];
                long j15 = (j14 + M) - (j14 | M);
                int i13 = i3 + 4;
                long j16 = iArr2[i13];
                long j17 = (j16 + M) - (j16 | M);
                long j18 = j12 + (j13 * j3);
                int i14 = (int) j18;
                int i15 = i14 << 1;
                iArr2[i9] = (i15 + i11) - (i15 & i11);
                long j19 = j15 + (j18 >>> 32) + (j13 * j9);
                long j20 = j17 + (j19 >>> 32);
                long j21 = j19 & M;
                long j22 = (-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M));
                int i16 = i3 + 5;
                long j23 = (-1) - (((-1) - ((long) iArr2[i16])) | ((-1) - M));
                int i17 = i3 + 6;
                long j24 = ((long) iArr2[i17]) & M;
                long j25 = j21 + (j22 * j3);
                int i18 = (int) j25;
                iArr2[i12] = (i18 << 1) | (i14 >>> 31);
                int i19 = i18 >>> 31;
                long j26 = j20 + (j25 >>> 32) + (j22 * j9);
                long j27 = j23 + (j26 >>> 32) + (j22 * j13);
                long j28 = (-1) - (((-1) - j26) | ((-1) - M));
                long j29 = (j27 + M) - (j27 | M);
                long j30 = iArr[i2 + 4];
                long j31 = (j30 + M) - (j30 | M);
                int i20 = i3 + 7;
                long j32 = iArr2[i20];
                long j33 = (j32 + M) - (j32 | M);
                int i21 = i3 + 8;
                long j34 = iArr2[i21];
                long j35 = (j34 + M) - (j34 | M);
                long j36 = j28 + (j31 * j3);
                int i22 = (int) j36;
                iArr2[i13] = (i22 << 1) | i19;
                long j37 = j29 + (j36 >>> 32) + (j31 * j9);
                long j38 = j24 + (j27 >>> 32) + (j37 >>> 32) + (j31 * j13);
                long j39 = (j37 + M) - (j37 | M);
                long j40 = j33 + (j38 >>> 32) + (j31 * j22);
                long j41 = j38 & M;
                long j42 = j35 + (j40 >>> 32);
                long j43 = (j40 + M) - (j40 | M);
                long j44 = ((long) iArr[i2 + 5]) & M;
                int i23 = i3 + 9;
                long j45 = (-1) - (((-1) - ((long) iArr2[i23])) | ((-1) - M));
                int i24 = i3 + 10;
                long j46 = (-1) - (((-1) - ((long) iArr2[i24])) | ((-1) - M));
                long j47 = j39 + (j3 * j44);
                int i25 = (int) j47;
                iArr2[i16] = (i25 << 1) | (i22 >>> 31);
                int i26 = i25 >>> 31;
                long j48 = j41 + (j47 >>> 32) + (j9 * j44);
                long j49 = j43 + (j48 >>> 32) + (j44 * j13);
                long j50 = j42 + (j49 >>> 32) + (j44 * j22);
                long j51 = j45 + (j50 >>> 32) + (j44 * j31);
                long j52 = j46 + (j51 >>> 32);
                int i27 = (int) j48;
                int i28 = i27 << 1;
                iArr2[i17] = (i26 + i28) - (i26 & i28);
                int i29 = (int) j49;
                iArr2[i20] = (i27 >>> 31) | (i29 << 1);
                int i30 = (int) j50;
                iArr2[i21] = (i29 >>> 31) | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j51;
                int i33 = i32 << 1;
                iArr2[i23] = (i31 + i33) - (i31 & i33);
                int i34 = (int) j52;
                iArr2[i24] = (i32 >>> 31) | (i34 << 1);
                int i35 = i3 + 11;
                iArr2[i35] = (i34 >>> 31) | ((iArr2[i35] + ((int) (j52 >> 32))) << 1);
                return;
            }
            i6 = i7;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        int i2 = 12;
        int i3 = 0;
        int i4 = 5;
        while (true) {
            int i5 = i4 - 1;
            long j4 = iArr[i4];
            long j5 = (j4 + M) - (j4 | M);
            long j6 = j5 * j5;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j6 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j6 >>> 1);
            i3 = (int) j6;
            if (i5 <= 0) {
                long j7 = j3 * j3;
                long j8 = i3 << 31;
                long j9 = (j8 + M) - (j8 | M);
                long j10 = j7 >>> 33;
                long j11 = (j10 + j9) - (j10 & j9);
                iArr2[0] = (int) j7;
                int i6 = (int) (j7 >>> 32);
                int i7 = (i6 + 1) - (i6 | 1);
                long j12 = iArr[1];
                long j13 = (j12 + M) - (j12 | M);
                long j14 = ((long) iArr2[2]) & M;
                long j15 = j11 + (j13 * j3);
                int i8 = (int) j15;
                int i9 = i8 << 1;
                iArr2[1] = (i9 + i7) - (i9 & i7);
                long j16 = j14 + (j15 >>> 32);
                long j17 = iArr[2];
                long j18 = (j17 + M) - (j17 | M);
                long j19 = iArr2[3];
                long j20 = (j19 + M) - (j19 | M);
                long j21 = (-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M));
                long j22 = j16 + (j18 * j3);
                int i10 = (int) j22;
                iArr2[2] = (-1) - (((-1) - (i10 << 1)) & ((-1) - (i8 >>> 31)));
                int i11 = i10 >>> 31;
                long j23 = j20 + (j22 >>> 32) + (j18 * j13);
                long j24 = (j23 + M) - (j23 | M);
                long j25 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
                long j26 = iArr2[5];
                long j27 = (j26 + M) - (j26 | M);
                long j28 = iArr2[6];
                long j29 = (j28 + M) - (j28 | M);
                long j30 = j24 + (j25 * j3);
                int i12 = (int) j30;
                int i13 = i12 << 1;
                iArr2[3] = (i13 + i11) - (i13 & i11);
                int i14 = i12 >>> 31;
                long j31 = j21 + (j23 >>> 32) + (j30 >>> 32) + (j25 * j13);
                long j32 = j27 + (j31 >>> 32) + (j25 * j18);
                long j33 = (j31 + M) - (j31 | M);
                long j34 = (-1) - (((-1) - j32) | ((-1) - M));
                long j35 = ((long) iArr[4]) & M;
                long j36 = (-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M));
                long j37 = ((long) iArr2[8]) & M;
                long j38 = j33 + (j35 * j3);
                int i15 = (int) j38;
                int i16 = i15 << 1;
                iArr2[4] = (i16 + i14) - (i16 & i14);
                int i17 = i15 >>> 31;
                long j39 = j34 + (j38 >>> 32) + (j35 * j13);
                long j40 = j29 + (j32 >>> 32) + (j39 >>> 32) + (j35 * j18);
                long j41 = j39 & M;
                long j42 = j36 + (j40 >>> 32) + (j35 * j25);
                long j43 = (j40 + M) - (j40 | M);
                long j44 = (-1) - (((-1) - j42) | ((-1) - M));
                long j45 = iArr[5];
                long j46 = (j45 + M) - (j45 | M);
                long j47 = (-1) - (((-1) - ((long) iArr2[9])) | ((-1) - M));
                long j48 = M & ((long) iArr2[10]);
                long j49 = j41 + (j46 * j3);
                int i18 = (int) j49;
                int i19 = i18 << 1;
                iArr2[5] = (i19 + i17) - (i19 & i17);
                long j50 = j43 + (j49 >>> 32) + (j46 * j13);
                long j51 = j44 + (j50 >>> 32) + (j18 * j46);
                long j52 = j37 + (j42 >>> 32) + (j51 >>> 32) + (j46 * j25);
                long j53 = j47 + (j52 >>> 32) + (j46 * j35);
                long j54 = j48 + (j53 >>> 32);
                int i20 = (int) j50;
                iArr2[6] = (i20 << 1) | (i18 >>> 31);
                int i21 = i20 >>> 31;
                int i22 = (int) j51;
                iArr2[7] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j52;
                iArr2[8] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j53;
                int i27 = i26 << 1;
                iArr2[9] = (i25 + i27) - (i25 & i27);
                int i28 = i26 >>> 31;
                int i29 = (int) j54;
                iArr2[10] = (-1) - (((-1) - i28) & ((-1) - (i29 << 1)));
                int i30 = i29 >>> 31;
                int i31 = (iArr2[11] + ((int) (j54 >> 32))) << 1;
                iArr2[11] = (i30 + i31) - (i30 & i31);
                return;
            }
            i4 = i5;
        }
    }

    public static int sub(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
        iArr3[i4] = (int) j2;
        long j3 = iArr[i2 + 1];
        long j4 = (j2 >> 32) + (((j3 + M) - (j3 | M)) - ((-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M))));
        iArr3[i4 + 1] = (int) j4;
        long j5 = iArr[i2 + 2];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr2[i3 + 2];
        long j8 = (j4 >> 32) + (j6 - ((j7 + M) - (j7 | M)));
        iArr3[i4 + 2] = (int) j8;
        long j9 = (j8 >> 32) + ((((long) iArr[i2 + 3]) & M) - ((-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M))));
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4];
        long j11 = (j9 >> 32) + (((j10 + M) - (j10 | M)) - (((long) iArr2[i3 + 4]) & M));
        iArr3[i4 + 4] = (int) j11;
        long j12 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
        long j13 = iArr2[i3 + 5];
        long j14 = (j11 >> 32) + (j12 - ((j13 + M) - (j13 | M)));
        iArr3[i4 + 5] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr[0]) & M;
        long j3 = iArr2[0];
        long j4 = j2 - ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[1]) & M) - (((long) iArr2[1]) & M));
        iArr3[1] = (int) j5;
        long j6 = (-1) - (((-1) - ((long) iArr[2])) | ((-1) - M));
        long j7 = iArr2[2];
        long j8 = (j5 >> 32) + (j6 - ((j7 + M) - (j7 | M)));
        iArr3[2] = (int) j8;
        long j9 = (j8 >> 32) + (((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j9;
        long j10 = iArr[4];
        long j11 = (j10 + M) - (j10 | M);
        long j12 = iArr2[4];
        long j13 = (j9 >> 32) + (j11 - ((j12 + M) - (j12 | M)));
        iArr3[4] = (int) j13;
        long j14 = ((long) iArr[5]) & M;
        long j15 = iArr2[5];
        long j16 = (j13 >> 32) + (j14 - ((j15 + M) - (j15 | M)));
        iArr3[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((-1) - (((-1) - ((long) iArr3[0])) | ((-1) - M))) - (((long) iArr[0]) & M);
        long j3 = iArr2[0];
        long j4 = j2 - ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = (j4 >> 32) + ((((-1) - (((-1) - ((long) iArr3[1])) | ((-1) - M))) - (((long) iArr[1]) & M)) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j5;
        long j6 = iArr3[2];
        long j7 = ((j6 + M) - (j6 | M)) - (((long) iArr[2]) & M);
        long j8 = iArr2[2];
        long j9 = (j5 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr3[2] = (int) j9;
        long j10 = (((long) iArr3[3]) & M) - ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M)));
        long j11 = iArr2[3];
        long j12 = (j9 >> 32) + (j10 - ((j11 + M) - (j11 | M)));
        iArr3[3] = (int) j12;
        long j13 = (j12 >> 32) + ((((-1) - (((-1) - ((long) iArr3[4])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))));
        iArr3[4] = (int) j13;
        long j14 = ((long) iArr3[5]) & M;
        long j15 = iArr[5];
        long j16 = (j13 >> 32) + ((j14 - ((j15 + M) - (j15 | M))) - (((long) iArr2[5]) & M));
        iArr3[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr2[i3];
        long j3 = ((j2 + M) - (j2 | M)) - ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M)));
        iArr2[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >> 32) + (((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M))) - (((long) iArr[i2 + 1]) & M));
        iArr2[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = iArr2[i5];
        long j6 = (j4 >> 32) + (((j5 + M) - (j5 | M)) - (((long) iArr[i2 + 2]) & M));
        iArr2[i5] = (int) j6;
        int i6 = i3 + 3;
        long j7 = (j6 >> 32) + (((-1) - (((-1) - ((long) iArr2[i6])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))));
        iArr2[i6] = (int) j7;
        int i7 = i3 + 4;
        long j8 = (j7 >> 32) + (((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M))) - (((long) iArr[i2 + 4]) & M));
        iArr2[i7] = (int) j8;
        int i8 = i3 + 5;
        long j9 = (j8 >> 32) + ((((long) iArr2[i8]) & M) - ((-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M))));
        iArr2[i8] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = iArr2[0];
        long j3 = ((j2 + M) - (j2 | M)) - ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M)));
        iArr2[0] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[1]) & M) - (((long) iArr[1]) & M));
        iArr2[1] = (int) j4;
        long j5 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
        long j6 = iArr[2];
        long j7 = (j4 >> 32) + (j5 - ((j6 + M) - (j6 | M)));
        iArr2[2] = (int) j7;
        long j8 = iArr2[3];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = iArr[3];
        long j11 = (j7 >> 32) + (j9 - ((j10 + M) - (j10 | M)));
        iArr2[3] = (int) j11;
        long j12 = (-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M));
        long j13 = iArr[4];
        long j14 = (j11 >> 32) + (j12 - ((j13 + M) - (j13 | M)));
        iArr2[4] = (int) j14;
        long j15 = iArr2[5];
        long j16 = (j14 >> 32) + (((j15 + M) - (j15 | M)) - ((-1) - (((-1) - M) | ((-1) - ((long) iArr[5])))));
        iArr2[5] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, (5 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i2 = 0; i2 < 3; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                Pack.longToBigEndian(j2, bArr, (2 - i2) << 3);
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
    }
}

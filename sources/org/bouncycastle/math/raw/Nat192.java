package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & M) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M)));
        iArr3[1] = (int) j3;
        long j4 = iArr[2];
        long j5 = (j3 >>> 32) + ((j4 + M) - (j4 | M)) + (((long) iArr2[2]) & M);
        iArr3[2] = (int) j5;
        long j6 = iArr[3];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M)) + (((long) iArr2[3]) & M);
        iArr3[3] = (int) j7;
        long j8 = iArr[4];
        long j9 = (j7 >>> 32) + ((j8 + M) - (j8 | M)) + ((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M)));
        iArr3[4] = (int) j9;
        long j10 = iArr[5];
        long j11 = (j9 >>> 32) + ((j10 + M) - (j10 | M)) + ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M)));
        iArr3[5] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & M) + ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        long j3 = iArr3[0];
        long j4 = j2 + ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M);
        long j6 = iArr3[1];
        long j7 = (j4 >>> 32) + j5 + ((j6 + M) - (j6 | M));
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + ((-1) - (((-1) - ((long) iArr3[2])) | ((-1) - M)));
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + ((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M)));
        iArr3[3] = (int) j9;
        long j10 = ((-1) - (((-1) - ((long) iArr[4])) | ((-1) - M))) + (((long) iArr2[4]) & M);
        long j11 = iArr3[4];
        long j12 = (j9 >>> 32) + j10 + ((j11 + M) - (j11 | M));
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M))) + (((long) iArr2[5]) & M) + ((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M)));
        iArr3[5] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = ((-1) - (((-1) - ((long) i4)) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
        iArr2[i3] = (int) j2;
        long j3 = iArr[i2 + 1];
        int i5 = i3 + 1;
        long j4 = (j2 >>> 32) + ((j3 + M) - (j3 | M)) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j4;
        long j5 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
        int i6 = i3 + 2;
        long j6 = iArr2[i6];
        long j7 = (j4 >>> 32) + j5 + ((j6 + M) - (j6 | M));
        iArr2[i6] = (int) j7;
        int i7 = i3 + 3;
        long j8 = (j7 >>> 32) + (((long) iArr[i2 + 3]) & M) + (((long) iArr2[i7]) & M);
        iArr2[i7] = (int) j8;
        long j9 = ((long) iArr[i2 + 4]) & M;
        int i8 = i3 + 4;
        long j10 = iArr2[i8];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr2[i8] = (int) j11;
        long j12 = (-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M));
        int i9 = i3 + 5;
        long j13 = iArr2[i9];
        long j14 = (j11 >>> 32) + j12 + ((M + j13) - (M | j13));
        iArr2[i9] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M)));
        iArr2[1] = (int) j3;
        long j4 = iArr[2];
        long j5 = (j3 >>> 32) + ((j4 + M) - (j4 | M)) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M)));
        iArr2[2] = (int) j5;
        long j6 = iArr[3];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M)) + ((-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M)));
        iArr2[3] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[4]) & M) + (((long) iArr2[4]) & M);
        iArr2[4] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[5]) & M) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[5]))));
        iArr2[5] = (int) j9;
        return (int) (j9 >>> 32);
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
        int i9 = i3 + 2;
        long j6 = (j5 >>> 32) + (((long) iArr[i8]) & M) + (((long) iArr2[i9]) & M);
        int i10 = (int) j6;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        int i12 = i3 + 3;
        long j7 = (j6 >>> 32) + ((-1) - (((-1) - ((long) iArr[i11])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[i12])) | ((-1) - M)));
        int i13 = (int) j7;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i2 + 4;
        long j8 = iArr[i14];
        int i15 = i3 + 4;
        long j9 = (j7 >>> 32) + ((j8 + M) - (j8 | M)) + (((long) iArr2[i15]) & M);
        int i16 = (int) j9;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i2 + 5;
        long j10 = iArr[i17];
        int i18 = i3 + 5;
        long j11 = (j9 >>> 32) + ((j10 + M) - (j10 | M)) + (M & ((long) iArr2[i18]));
        int i19 = (int) j11;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        return (int) (j11 >>> 32);
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
        return (-1) - (((-1) - i3) | ((-1) - 1));
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
        long j2 = ((long) iArr2[i3]) & M;
        long j3 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j4 = (-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M));
        long j5 = ((long) iArr2[i3 + 3]) & M;
        long j6 = (-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr2[i3 + 5])) | ((-1) - M));
        long j8 = iArr[i2];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = j9 * j2;
        iArr3[i4] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j3);
        iArr3[i4 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j4);
        iArr3[i4 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j5);
        iArr3[i4 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j6);
        iArr3[i4 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j7);
        iArr3[i4 + 5] = (int) j15;
        iArr3[i4 + 6] = (int) (j15 >>> 32);
        int i5 = 1;
        while (i5 < 6) {
            int i6 = i4 + 1;
            long j16 = (-1) - (((-1) - ((long) iArr[i2 + i5])) | ((-1) - M));
            long j17 = iArr3[i6];
            long j18 = (j16 * j2) + ((j17 + M) - (j17 | M));
            iArr3[i6] = (int) j18;
            int i7 = i4 + 2;
            long j19 = (j18 >>> 32) + (j16 * j3) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j19;
            int i8 = i4 + 3;
            long j20 = iArr3[i8];
            long j21 = (j19 >>> 32) + (j16 * j4) + ((j20 + M) - (j20 | M));
            iArr3[i8] = (int) j21;
            int i9 = i4 + 4;
            long j22 = iArr3[i9];
            long j23 = (j21 >>> 32) + (j16 * j5) + ((j22 + M) - (j22 | M));
            iArr3[i9] = (int) j23;
            int i10 = i4 + 5;
            long j24 = (j23 >>> 32) + (j16 * j6) + (((long) iArr3[i10]) & M);
            iArr3[i10] = (int) j24;
            int i11 = i4 + 6;
            long j25 = (j24 >>> 32) + (j16 * j7) + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j25;
            iArr3[i4 + 7] = (int) (j25 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M));
        long j3 = ((long) iArr2[1]) & M;
        long j4 = ((long) iArr2[2]) & M;
        long j5 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j6 = iArr2[4];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = ((long) iArr2[5]) & M;
        long j9 = iArr[0];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = j10 * j2;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j3);
        int i2 = 1;
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j4);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j5);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j7);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (j10 * j8);
        iArr3[5] = (int) j16;
        int i3 = (int) (j16 >>> 32);
        iArr3[6] = i3;
        for (int i4 = 6; i2 < i4; i4 = 6) {
            long j17 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
            long j18 = (j17 * j2) + (((long) iArr3[i2]) & M);
            iArr3[i2] = (int) j18;
            int i5 = i2 + 1;
            long j19 = iArr3[i5];
            long j20 = (j18 >>> 32) + (j17 * j3) + ((j19 + M) - (j19 | M));
            iArr3[i5] = (int) j20;
            int i6 = i2 + 2;
            long j21 = (j20 >>> 32) + (j17 * j4) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j21;
            int i7 = i2 + 3;
            long j22 = (j21 >>> 32) + (j17 * j5) + (((long) iArr3[i7]) & M);
            iArr3[i7] = (int) j22;
            int i8 = i2 + 4;
            long j23 = iArr3[i8];
            long j24 = (j22 >>> 32) + (j17 * j7) + ((j23 + M) - (j23 | M));
            iArr3[i8] = (int) j24;
            int i9 = i2 + 5;
            long j25 = iArr3[i9];
            long j26 = (j24 >>> 32) + (j17 * j8) + ((j25 + M) - (j25 | M));
            iArr3[i9] = (int) j26;
            iArr3[i2 + 6] = (int) (j26 >>> 32);
            i2 = i5;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M));
        long j4 = iArr2[i4];
        long j5 = (j2 * j3) + ((j4 + M) - (j4 | M));
        iArr3[i5] = (int) j5;
        long j6 = (-1) - (((-1) - ((long) iArr[i3 + 1])) | ((-1) - M));
        long j7 = iArr2[i4 + 1];
        long j8 = (j5 >>> 32) + (j2 * j6) + j3 + ((j7 + M) - (j7 | M));
        iArr3[i5 + 1] = (int) j8;
        long j9 = (-1) - (((-1) - ((long) iArr[i3 + 2])) | ((-1) - M));
        long j10 = (j8 >>> 32) + (j2 * j9) + j6 + ((-1) - (((-1) - ((long) iArr2[i4 + 2])) | ((-1) - M)));
        iArr3[i5 + 2] = (int) j10;
        long j11 = iArr[i3 + 3];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = (j10 >>> 32) + (j2 * j12) + j9 + ((-1) - (((-1) - ((long) iArr2[i4 + 3])) | ((-1) - M)));
        iArr3[i5 + 3] = (int) j13;
        long j14 = (-1) - (((-1) - ((long) iArr[i3 + 4])) | ((-1) - M));
        long j15 = (j13 >>> 32) + (j2 * j14) + j12 + ((-1) - (((-1) - ((long) iArr2[i4 + 4])) | ((-1) - M)));
        iArr3[i5 + 4] = (int) j15;
        long j16 = iArr[i3 + 5];
        long j17 = (j16 + M) - (j16 | M);
        long j18 = (j15 >>> 32) + (j2 * j17) + j14 + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i4 + 5]))));
        iArr3[i5 + 5] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j4 = (j2 + M) - (j2 | M);
        long j5 = iArr[i3];
        long j6 = (j3 * j4) + ((j5 + M) - (j5 | M));
        iArr[i3] = (int) j6;
        long j7 = j2 >>> 32;
        int i4 = i3 + 1;
        long j8 = iArr[i4];
        long j9 = (j6 >>> 32) + (j3 * j7) + j4 + ((j8 + M) - (j8 | M));
        iArr[i4] = (int) j9;
        int i5 = i3 + 2;
        long j10 = (j9 >>> 32) + j7 + ((-1) - (((-1) - ((long) iArr[i5])) | ((-1) - M)));
        iArr[i5] = (int) j10;
        int i6 = i3 + 3;
        long j11 = (j10 >>> 32) + ((-1) - (((-1) - ((long) iArr[i6])) | ((-1) - M)));
        iArr[i6] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 4);
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
        return Nat.incAt(6, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = (-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) iArr2[i3 + 1])) | ((-1) - M));
        long j4 = (-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M));
        long j5 = iArr2[i3 + 3];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = ((long) iArr2[i3 + 4]) & M;
        long j8 = (-1) - (((-1) - ((long) iArr2[i3 + 5])) | ((-1) - M));
        long j9 = 0;
        int i5 = 0;
        while (i5 < 6) {
            long j10 = ((long) iArr[i2 + i5]) & M;
            long j11 = (j10 * j2) + (((long) iArr3[i4]) & M);
            iArr3[i4] = (int) j11;
            int i6 = i4 + 1;
            long j12 = (j11 >>> 32) + (j10 * j3) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j12;
            int i7 = i4 + 2;
            long j13 = (j12 >>> 32) + (j10 * j4) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j13;
            int i8 = i4 + 3;
            long j14 = (j13 >>> 32) + (j10 * j6) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j14;
            int i9 = i4 + 4;
            long j15 = (j14 >>> 32) + (j10 * j7) + (((long) iArr3[i9]) & M);
            iArr3[i9] = (int) j15;
            int i10 = i4 + 5;
            long j16 = (j15 >>> 32) + (j10 * j8) + ((-1) - (((-1) - ((long) iArr3[i10])) | ((-1) - M)));
            iArr3[i10] = (int) j16;
            int i11 = i4 + 6;
            long j17 = iArr3[i11];
            long j18 = (j16 >>> 32) + j9 + ((j17 + M) - (j17 | M));
            iArr3[i11] = (int) j18;
            j9 = j18 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        long j2 = iArr2[0];
        long j3 = M;
        long j4 = (j2 + M) - (j2 | M);
        long j5 = ((long) iArr2[1]) & M;
        long j6 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
        long j7 = ((long) iArr2[3]) & M;
        long j8 = (-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M));
        long j9 = iArr2[5];
        long j10 = (j9 + M) - (j9 | M);
        long j11 = 0;
        while (i2 < 6) {
            long j12 = ((long) iArr[i2]) & j3;
            long j13 = ((-1) - (((-1) - ((long) iArr3[i2])) | ((-1) - j3))) + (j12 * j4);
            iArr3[i2] = (int) j13;
            int i3 = i2 + 1;
            long j14 = (j13 >>> 32) + (j12 * j5) + (((long) iArr3[i3]) & j3);
            iArr3[i3] = (int) j14;
            int i4 = i2 + 2;
            long j15 = (j14 >>> 32) + (j12 * j6) + ((-1) - (((-1) - ((long) iArr3[i4])) | ((-1) - j3)));
            iArr3[i4] = (int) j15;
            int i5 = i2 + 3;
            long j16 = iArr3[i5];
            long j17 = (j15 >>> 32) + (j12 * j7) + ((j16 + j3) - (j16 | j3));
            iArr3[i5] = (int) j17;
            int i6 = i2 + 4;
            long j18 = iArr3[i6];
            long j19 = (j17 >>> 32) + (j12 * j8) + ((j18 + j3) - (j18 | j3));
            iArr3[i6] = (int) j19;
            int i7 = i2 + 5;
            long j20 = iArr3[i7];
            long j21 = (j19 >>> 32) + (j12 * j10) + ((j20 + j3) - (j20 | j3));
            iArr3[i7] = (int) j21;
            int i8 = i2 + 6;
            long j22 = (j21 >>> 32) + j11 + (((long) iArr3[i8]) & j3);
            iArr3[i8] = (int) j22;
            j11 = j22 >>> 32;
            i2 = i3;
            j3 = M;
        }
        return (int) j11;
    }

    public static int mulWord(int i2, int[] iArr, int[] iArr2, int i3) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = 0;
        int i4 = 0;
        do {
            long j5 = j4 + (((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M))) * j3);
            iArr2[i3 + i4] = (int) j5;
            j4 = j5 >>> 32;
            i4++;
        } while (i4 < 6);
        return (int) j4;
    }

    public static int mulWordAddExt(int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = (((long) iArr[i3]) & M) * j3;
        long j5 = iArr2[i4];
        long j6 = j4 + ((j5 + M) - (j5 | M));
        iArr2[i4] = (int) j6;
        long j7 = iArr[i3 + 1];
        long j8 = ((j7 + M) - (j7 | M)) * j3;
        int i5 = i4 + 1;
        long j9 = iArr2[i5];
        long j10 = (j6 >>> 32) + j8 + ((j9 + M) - (j9 | M));
        iArr2[i5] = (int) j10;
        long j11 = iArr[i3 + 2];
        int i6 = i4 + 2;
        long j12 = (j10 >>> 32) + (((j11 + M) - (j11 | M)) * j3) + (((long) iArr2[i6]) & M);
        iArr2[i6] = (int) j12;
        int i7 = i4 + 3;
        long j13 = (j12 >>> 32) + (((-1) - (((-1) - ((long) iArr[i3 + 3])) | ((-1) - M))) * j3) + ((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M)));
        iArr2[i7] = (int) j13;
        int i8 = i4 + 4;
        long j14 = (j13 >>> 32) + ((((long) iArr[i3 + 4]) & M) * j3) + (((long) iArr2[i8]) & M);
        iArr2[i8] = (int) j14;
        long j15 = j3 * (((long) iArr[i3 + 5]) & M);
        int i9 = i4 + 5;
        long j16 = iArr2[i9];
        long j17 = (j14 >>> 32) + j15 + ((j16 + M) - (j16 | M));
        iArr2[i9] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = ((long) i2) & M;
        long j4 = ((-1) - (((-1) - j2) | ((-1) - M))) * j3;
        long j5 = iArr[i3];
        long j6 = j4 + ((j5 + M) - (j5 | M));
        iArr[i3] = (int) j6;
        int i4 = i3 + 1;
        long j7 = iArr[i4];
        long j8 = (j6 >>> 32) + (j3 * (j2 >>> 32)) + ((j7 + M) - (j7 | M));
        iArr[i4] = (int) j8;
        int i5 = i3 + 2;
        long j9 = iArr[i5];
        long j10 = (j8 >>> 32) + ((j9 + M) - (j9 | M));
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
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
            long j4 = (-1) - (((-1) - ((long) iArr[i2 + i6])) | ((-1) - M));
            long j5 = j4 * j4;
            int i8 = i4 << 31;
            int i9 = (int) (j5 >>> 33);
            iArr2[i3 + (i5 - 1)] = (i8 + i9) - (i8 & i9);
            i5 -= 2;
            iArr2[i3 + i5] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i7 <= 0) {
                long j6 = j3 * j3;
                long j7 = (j6 >>> 33) | (((long) (i4 << 31)) & M);
                iArr2[i3] = (int) j6;
                int i10 = ((int) (j6 >>> 32)) & 1;
                long j8 = (-1) - (((-1) - ((long) iArr[i2 + 1])) | ((-1) - M));
                int i11 = i3 + 2;
                long j9 = ((long) iArr2[i11]) & M;
                long j10 = j7 + (j8 * j3);
                int i12 = (int) j10;
                iArr2[i3 + 1] = (i12 << 1) | i10;
                long j11 = j9 + (j10 >>> 32);
                long j12 = ((long) iArr[i2 + 2]) & M;
                int i13 = i3 + 3;
                long j13 = ((long) iArr2[i13]) & M;
                int i14 = i3 + 4;
                long j14 = iArr2[i14];
                long j15 = (j14 + M) - (j14 | M);
                long j16 = j11 + (j12 * j3);
                int i15 = (int) j16;
                iArr2[i11] = (i15 << 1) | (i12 >>> 31);
                int i16 = i15 >>> 31;
                long j17 = j13 + (j16 >>> 32) + (j12 * j8);
                long j18 = j15 + (j17 >>> 32);
                long j19 = (j17 + M) - (j17 | M);
                long j20 = (-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M));
                int i17 = i3 + 5;
                long j21 = iArr2[i17];
                long j22 = ((j21 + M) - (j21 | M)) + (j18 >>> 32);
                long j23 = (-1) - (((-1) - j18) | ((-1) - M));
                int i18 = i3 + 6;
                long j24 = iArr2[i18];
                long j25 = ((j24 + M) - (j24 | M)) + (j22 >>> 32);
                long j26 = j22 & M;
                long j27 = j19 + (j20 * j3);
                int i19 = (int) j27;
                int i20 = i19 << 1;
                iArr2[i13] = (i20 + i16) - (i20 & i16);
                int i21 = i19 >>> 31;
                long j28 = j23 + (j27 >>> 32) + (j20 * j8);
                long j29 = j26 + (j28 >>> 32) + (j20 * j12);
                long j30 = (-1) - (((-1) - j28) | ((-1) - M));
                long j31 = j25 + (j29 >>> 32);
                long j32 = j29 & M;
                long j33 = iArr[i2 + 4];
                long j34 = (j33 + M) - (j33 | M);
                int i22 = i3 + 7;
                long j35 = ((-1) - (((-1) - ((long) iArr2[i22])) | ((-1) - M))) + (j31 >>> 32);
                long j36 = (-1) - (((-1) - j31) | ((-1) - M));
                int i23 = i3 + 8;
                long j37 = ((-1) - (((-1) - ((long) iArr2[i23])) | ((-1) - M))) + (j35 >>> 32);
                long j38 = j35 & M;
                long j39 = j30 + (j34 * j3);
                int i24 = (int) j39;
                int i25 = i24 << 1;
                iArr2[i14] = (i25 + i21) - (i25 & i21);
                int i26 = i24 >>> 31;
                long j40 = j32 + (j39 >>> 32) + (j34 * j8);
                long j41 = j36 + (j40 >>> 32) + (j34 * j12);
                long j42 = (-1) - (((-1) - j40) | ((-1) - M));
                long j43 = j38 + (j41 >>> 32) + (j34 * j20);
                long j44 = (j41 + M) - (j41 | M);
                long j45 = j37 + (j43 >>> 32);
                long j46 = (j43 + M) - (j43 | M);
                long j47 = ((long) iArr[i2 + 5]) & M;
                int i27 = i3 + 9;
                long j48 = (((long) iArr2[i27]) & M) + (j45 >>> 32);
                long j49 = (-1) - (((-1) - j45) | ((-1) - M));
                int i28 = i3 + 10;
                long j50 = (((long) iArr2[i28]) & M) + (j48 >>> 32);
                long j51 = (j48 + M) - (j48 | M);
                long j52 = j42 + (j3 * j47);
                int i29 = (int) j52;
                int i30 = i29 << 1;
                iArr2[i17] = (i30 + i26) - (i30 & i26);
                int i31 = i29 >>> 31;
                long j53 = j44 + (j52 >>> 32) + (j8 * j47);
                long j54 = j46 + (j53 >>> 32) + (j47 * j12);
                long j55 = j49 + (j54 >>> 32) + (j47 * j20);
                long j56 = j51 + (j55 >>> 32) + (j47 * j34);
                long j57 = j50 + (j56 >>> 32);
                int i32 = (int) j53;
                int i33 = i32 << 1;
                iArr2[i18] = (i31 + i33) - (i31 & i33);
                int i34 = (int) j54;
                iArr2[i22] = (i32 >>> 31) | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j55;
                iArr2[i23] = i35 | (i36 << 1);
                int i37 = (int) j56;
                iArr2[i27] = (-1) - (((-1) - (i36 >>> 31)) & ((-1) - (i37 << 1)));
                int i38 = (int) j57;
                iArr2[i28] = (i37 >>> 31) | (i38 << 1);
                int i39 = i38 >>> 31;
                int i40 = i3 + 11;
                int i41 = (iArr2[i40] + ((int) (j57 >>> 32))) << 1;
                iArr2[i40] = (i39 + i41) - (i39 & i41);
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
            long j4 = ((long) iArr[i4]) & M;
            long j5 = j4 * j4;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j5 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j5 >>> 1);
            i3 = (int) j5;
            if (i5 <= 0) {
                long j6 = j3 * j3;
                long j7 = i3 << 31;
                long j8 = (-1) - (((-1) - (j6 >>> 33)) & ((-1) - ((j7 + M) - (j7 | M))));
                iArr2[0] = (int) j6;
                int i6 = (int) (j6 >>> 32);
                int i7 = (i6 + 1) - (i6 | 1);
                long j9 = (-1) - (((-1) - ((long) iArr[1])) | ((-1) - M));
                long j10 = iArr2[2];
                long j11 = (j10 + M) - (j10 | M);
                long j12 = j8 + (j9 * j3);
                int i8 = (int) j12;
                iArr2[1] = (i8 << 1) | i7;
                int i9 = i8 >>> 31;
                long j13 = iArr[2];
                long j14 = (j13 + M) - (j13 | M);
                long j15 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
                long j16 = iArr2[4];
                long j17 = (j16 + M) - (j16 | M);
                long j18 = j11 + (j12 >>> 32) + (j14 * j3);
                int i10 = (int) j18;
                int i11 = i10 << 1;
                iArr2[2] = (i11 + i9) - (i11 & i9);
                int i12 = i10 >>> 31;
                long j19 = j15 + (j18 >>> 32) + (j14 * j9);
                long j20 = j17 + (j19 >>> 32);
                long j21 = (j19 + M) - (j19 | M);
                long j22 = iArr[3];
                long j23 = (j22 + M) - (j22 | M);
                long j24 = (((long) iArr2[5]) & M) + (j20 >>> 32);
                long j25 = (-1) - (((-1) - j20) | ((-1) - M));
                long j26 = iArr2[6];
                long j27 = ((j26 + M) - (j26 | M)) + (j24 >>> 32);
                long j28 = (j24 + M) - (j24 | M);
                long j29 = j21 + (j23 * j3);
                int i13 = (int) j29;
                iArr2[3] = (i13 << 1) | i12;
                long j30 = j25 + (j29 >>> 32) + (j23 * j9);
                long j31 = j28 + (j30 >>> 32) + (j23 * j14);
                long j32 = j30 & M;
                long j33 = j27 + (j31 >>> 32);
                long j34 = (-1) - (((-1) - j31) | ((-1) - M));
                long j35 = iArr[4];
                long j36 = (j35 + M) - (j35 | M);
                long j37 = ((-1) - (((-1) - ((long) iArr2[7])) | ((-1) - M))) + (j33 >>> 32);
                long j38 = j33 & M;
                long j39 = ((-1) - (((-1) - ((long) iArr2[8])) | ((-1) - M))) + (j37 >>> 32);
                long j40 = j37 & M;
                long j41 = j32 + (j36 * j3);
                int i14 = (int) j41;
                iArr2[4] = (i14 << 1) | (i13 >>> 31);
                long j42 = j34 + (j41 >>> 32) + (j36 * j9);
                long j43 = j38 + (j42 >>> 32) + (j36 * j14);
                long j44 = j42 & M;
                long j45 = j40 + (j43 >>> 32) + (j36 * j23);
                long j46 = j43 & M;
                long j47 = j39 + (j45 >>> 32);
                long j48 = (j45 + M) - (j45 | M);
                long j49 = iArr[5];
                long j50 = (j49 + M) - (j49 | M);
                long j51 = iArr2[9];
                long j52 = ((j51 + M) - (j51 | M)) + (j47 >>> 32);
                long j53 = j47 & M;
                long j54 = ((-1) - (((-1) - ((long) iArr2[10])) | ((-1) - M))) + (j52 >>> 32);
                long j55 = M & j52;
                long j56 = j44 + (j3 * j50);
                int i15 = (int) j56;
                iArr2[5] = (i15 << 1) | (i14 >>> 31);
                long j57 = j46 + (j56 >>> 32) + (j50 * j9);
                long j58 = j48 + (j57 >>> 32) + (j50 * j14);
                long j59 = j53 + (j58 >>> 32) + (j50 * j23);
                long j60 = j55 + (j59 >>> 32) + (j50 * j36);
                long j61 = j54 + (j60 >>> 32);
                int i16 = (int) j57;
                iArr2[6] = (-1) - (((-1) - (i15 >>> 31)) & ((-1) - (i16 << 1)));
                int i17 = (int) j58;
                iArr2[7] = (-1) - (((-1) - (i16 >>> 31)) & ((-1) - (i17 << 1)));
                int i18 = i17 >>> 31;
                int i19 = (int) j59;
                iArr2[8] = (-1) - (((-1) - i18) & ((-1) - (i19 << 1)));
                int i20 = i19 >>> 31;
                int i21 = (int) j60;
                int i22 = i21 << 1;
                iArr2[9] = (i20 + i22) - (i20 & i22);
                int i23 = i21 >>> 31;
                int i24 = (int) j61;
                iArr2[10] = (-1) - (((-1) - i23) & ((-1) - (i24 << 1)));
                iArr2[11] = (-1) - (((-1) - (i24 >>> 31)) & ((-1) - ((iArr2[11] + ((int) (j61 >>> 32))) << 1)));
                return;
            }
            i4 = i5;
        }
    }

    public static int sub(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr[i2];
        long j3 = ((j2 + M) - (j2 | M)) - (((long) iArr2[i3]) & M);
        iArr3[i4] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i2 + 1]) & M) - (((long) iArr2[i3 + 1]) & M));
        iArr3[i4 + 1] = (int) j4;
        long j5 = iArr[i2 + 2];
        long j6 = (j4 >> 32) + (((j5 + M) - (j5 | M)) - (((long) iArr2[i3 + 2]) & M));
        iArr3[i4 + 2] = (int) j6;
        long j7 = (-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M));
        long j8 = iArr2[i3 + 3];
        long j9 = (j6 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4];
        long j11 = (j9 >> 32) + (((j10 + M) - (j10 | M)) - ((-1) - (((-1) - ((long) iArr2[i3 + 4])) | ((-1) - M))));
        iArr3[i4 + 4] = (int) j11;
        long j12 = ((long) iArr[i2 + 5]) & M;
        long j13 = iArr2[i3 + 5];
        long j14 = (j11 >> 32) + (j12 - ((j13 + M) - (j13 | M)));
        iArr3[i4 + 5] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[0];
        long j5 = j3 - ((j4 + M) - (j4 | M));
        iArr3[0] = (int) j5;
        long j6 = (-1) - (((-1) - ((long) iArr[1])) | ((-1) - M));
        long j7 = iArr2[1];
        long j8 = (j5 >> 32) + (j6 - ((j7 + M) - (j7 | M)));
        iArr3[1] = (int) j8;
        long j9 = (j8 >> 32) + (((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))));
        iArr3[2] = (int) j9;
        long j10 = (j9 >> 32) + ((((long) iArr[3]) & M) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j10;
        long j11 = iArr[4];
        long j12 = (j10 >> 32) + (((j11 + M) - (j11 | M)) - (((long) iArr2[4]) & M));
        iArr3[4] = (int) j12;
        long j13 = (j12 >> 32) + ((((long) iArr[5]) & M) - (((long) iArr2[5]) & M));
        iArr3[5] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((-1) - (((-1) - ((long) iArr3[0])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M)));
        long j3 = iArr2[0];
        long j4 = j2 - ((j3 + M) - (j3 | M));
        iArr3[0] = (int) j4;
        long j5 = ((long) iArr3[1]) & M;
        long j6 = iArr[1];
        long j7 = (j4 >> 32) + ((j5 - ((j6 + M) - (j6 | M))) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j7;
        long j8 = (j7 >> 32) + ((((-1) - (((-1) - ((long) iArr3[2])) | ((-1) - M))) - (((long) iArr[2]) & M)) - ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))));
        iArr3[2] = (int) j8;
        long j9 = ((long) iArr3[3]) & M;
        long j10 = iArr[3];
        long j11 = (j8 >> 32) + ((j9 - ((j10 + M) - (j10 | M))) - (((long) iArr2[3]) & M));
        iArr3[3] = (int) j11;
        long j12 = ((-1) - (((-1) - ((long) iArr3[4])) | ((-1) - M))) - (((long) iArr[4]) & M);
        long j13 = iArr2[4];
        long j14 = (j11 >> 32) + (j12 - ((j13 + M) - (j13 | M)));
        iArr3[4] = (int) j14;
        long j15 = (j14 >> 32) + ((((-1) - (((-1) - ((long) iArr3[5])) | ((-1) - M))) - (((long) iArr[5]) & M)) - ((-1) - (((-1) - ((long) iArr2[5])) | ((-1) - M))));
        iArr3[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M)));
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
        long j8 = (j6 >> 32) + (((j7 + M) - (j7 | M)) - ((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))));
        iArr2[i6] = (int) j8;
        int i7 = i3 + 4;
        long j9 = (j8 >> 32) + (((-1) - (((-1) - ((long) iArr2[i7])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[i2 + 4])) | ((-1) - M))));
        iArr2[i7] = (int) j9;
        int i8 = i3 + 5;
        long j10 = iArr2[i8];
        long j11 = (j9 >> 32) + (((j10 + M) - (j10 | M)) - ((-1) - (((-1) - ((long) iArr[i2 + 5])) | ((-1) - M))));
        iArr2[i8] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = iArr2[0];
        long j3 = ((j2 + M) - (j2 | M)) - (((long) iArr[0]) & M);
        iArr2[0] = (int) j3;
        long j4 = iArr2[1];
        long j5 = (j3 >> 32) + (((j4 + M) - (j4 | M)) - ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))));
        iArr2[1] = (int) j5;
        long j6 = iArr2[2];
        long j7 = (j5 >> 32) + (((j6 + M) - (j6 | M)) - ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))));
        iArr2[2] = (int) j7;
        long j8 = iArr2[3];
        long j9 = (j8 + M) - (j8 | M);
        long j10 = iArr[3];
        long j11 = (j7 >> 32) + (j9 - ((j10 + M) - (j10 | M)));
        iArr2[3] = (int) j11;
        long j12 = (j11 >> 32) + (((-1) - (((-1) - ((long) iArr2[4])) | ((-1) - M))) - (((long) iArr[4]) & M));
        iArr2[4] = (int) j12;
        long j13 = iArr2[5];
        long j14 = (j12 >> 32) + (((j13 + M) - (j13 | M)) - (M & ((long) iArr[5])));
        iArr2[5] = (int) j14;
        return (int) (j14 >> 32);
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

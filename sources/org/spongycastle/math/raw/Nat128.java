package org.spongycastle.math.raw;

import cz.msebera.android.httpclient.message.TokenParser;
import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat128 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr[0];
        long j3 = ((j2 + M) - (j2 | M)) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j3;
        long j4 = (j3 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M)));
        iArr3[1] = (int) j4;
        long j5 = iArr[2];
        long j6 = (j4 >>> 32) + ((j5 + M) - (j5 | M)) + (((long) iArr2[2]) & M);
        iArr3[2] = (int) j6;
        long j7 = iArr[3];
        long j8 = (j6 >>> 32) + ((j7 + M) - (j7 | M)) + (((long) iArr2[3]) & M);
        iArr3[3] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr[0];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr2[0];
        long j5 = j3 + ((j4 + M) - (j4 | M));
        long j6 = iArr3[0];
        long j7 = j5 + ((j6 + M) - (j6 | M));
        iArr3[0] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[1]) & M) + ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))) + ((-1) - (((-1) - ((long) iArr3[1])) | ((-1) - M)));
        iArr3[1] = (int) j8;
        long j9 = iArr[2];
        long j10 = (j8 >>> 32) + ((j9 + M) - (j9 | M)) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))) + (((long) iArr3[2]) & M);
        iArr3[2] = (int) j10;
        long j11 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
        long j12 = iArr2[3];
        long j13 = (j10 >>> 32) + j11 + ((j12 + M) - (j12 | M)) + ((-1) - (((-1) - ((long) iArr3[3])) | ((-1) - M)));
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addTo(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        long j2 = (-1) - (((-1) - ((long) i4)) | ((-1) - M));
        long j3 = ((long) iArr[i2]) & M;
        long j4 = iArr2[i3];
        long j5 = j2 + j3 + ((j4 + M) - (j4 | M));
        iArr2[i3] = (int) j5;
        int i5 = i3 + 1;
        long j6 = (j5 >>> 32) + (((long) iArr[i2 + 1]) & M) + ((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M)));
        iArr2[i5] = (int) j6;
        long j7 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
        int i6 = i3 + 2;
        long j8 = iArr2[i6];
        long j9 = (j6 >>> 32) + j7 + ((j8 + M) - (j8 | M));
        iArr2[i6] = (int) j9;
        int i7 = i3 + 3;
        long j10 = (j9 >>> 32) + (((long) iArr[i2 + 3]) & M) + (M & ((long) iArr2[i7]));
        iArr2[i7] = (int) j10;
        return (int) (j10 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) + (((long) iArr2[1]) & M);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[2]) & M) + ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M)));
        iArr2[2] = (int) j4;
        long j5 = (-1) - (((-1) - ((long) iArr[3])) | ((-1) - M));
        long j6 = iArr2[3];
        long j7 = (j4 >>> 32) + j5 + ((M + j6) - (M | j6));
        iArr2[3] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr[i2];
        long j3 = ((j2 + M) - (j2 | M)) + ((-1) - (((-1) - ((long) iArr2[i3])) | ((-1) - M)));
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
        long j5 = ((long) iArr[i8]) & M;
        int i9 = i3 + 2;
        long j6 = iArr2[i9];
        long j7 = (j4 >>> 32) + j5 + ((j6 + M) - (j6 | M));
        int i10 = (int) j7;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        int i11 = i2 + 3;
        long j8 = iArr[i11];
        int i12 = i3 + 3;
        long j9 = (j7 >>> 32) + ((j8 + M) - (j8 | M)) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i12]))));
        int i13 = (int) j9;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        return (int) (j9 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
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
        for (int i2 = 3; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i2 = 1; i2 >= 0; i2--) {
            if (jArr[i2] != jArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
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
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
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
            if (i4 < 0 || i4 >= 4) {
                return 0;
            }
            i3 = iArr[i4] >>> ((-1) - (((-1) - i2) | ((-1) - 31)));
        }
        return i3 & 1;
    }

    public static boolean gte(int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 3; i4 >= 0; i4--) {
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
        for (int i2 = 3; i2 >= 0; i2--) {
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
        for (int i2 = 1; i2 < 4; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean isZero(int[] iArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((long) iArr2[i3]) & M;
        long j3 = iArr2[i3 + 1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (-1) - (((-1) - ((long) iArr2[i3 + 2])) | ((-1) - M));
        long j6 = (-1) - (((-1) - ((long) iArr2[i3 + 3])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
        long j8 = j7 * j2;
        iArr3[i4] = (int) j8;
        char c2 = TokenParser.SP;
        long j9 = (j8 >>> 32) + (j7 * j4);
        iArr3[i4 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j5);
        iArr3[i4 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j6);
        iArr3[i4 + 3] = (int) j11;
        iArr3[i4 + 4] = (int) (j11 >>> 32);
        int i5 = 1;
        while (i5 < 4) {
            int i6 = i4 + 1;
            long j12 = ((long) iArr[i2 + i5]) & M;
            long j13 = (j12 * j2) + (((long) iArr3[i6]) & M);
            iArr3[i6] = (int) j13;
            int i7 = i4 + 2;
            long j14 = (j13 >>> c2) + (j12 * j4) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j14;
            int i8 = i4 + 3;
            long j15 = iArr3[i8];
            long j16 = (j14 >>> 32) + (j12 * j5) + ((j15 + M) - (j15 | M));
            iArr3[i8] = (int) j16;
            c2 = TokenParser.SP;
            int i9 = i4 + 4;
            long j17 = (j16 >>> 32) + (j12 * j6) + ((-1) - (((-1) - ((long) iArr3[i9])) | ((-1) - M)));
            iArr3[i9] = (int) j17;
            iArr3[i4 + 5] = (int) (j17 >>> 32);
            i5++;
            i4 = i6;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M));
        int i2 = 1;
        long j3 = (-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M));
        long j4 = ((long) iArr2[2]) & M;
        long j5 = iArr2[3];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = iArr[0];
        long j8 = (j7 + M) - (j7 | M);
        long j9 = j8 * j2;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j3);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j4);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j6);
        iArr3[3] = (int) j12;
        iArr3[4] = (int) (j12 >>> 32);
        for (int i3 = 4; i2 < i3; i3 = 4) {
            long j13 = ((long) iArr[i2]) & M;
            long j14 = iArr3[i2];
            long j15 = (j13 * j2) + ((j14 + M) - (j14 | M));
            iArr3[i2] = (int) j15;
            int i4 = i2 + 1;
            long j16 = iArr3[i4];
            long j17 = (j15 >>> 32) + (j13 * j3) + ((j16 + M) - (j16 | M));
            iArr3[i4] = (int) j17;
            int i5 = i2 + 2;
            long j18 = iArr3[i5];
            long j19 = (j17 >>> 32) + (j13 * j4) + ((j18 + M) - (j18 | M));
            iArr3[i5] = (int) j19;
            int i6 = i2 + 3;
            long j20 = (j19 >>> 32) + (j13 * j6) + ((-1) - (((-1) - ((long) iArr3[i6])) | ((-1) - M)));
            iArr3[i6] = (int) j20;
            iArr3[i2 + 4] = (int) (j20 >>> 32);
            i2 = i4;
        }
    }

    public static long mul33Add(int i2, int[] iArr, int i3, int[] iArr2, int i4, int[] iArr3, int i5) {
        long j2 = ((long) i2) & M;
        long j3 = (-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M));
        long j4 = (j2 * j3) + ((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M)));
        iArr3[i5] = (int) j4;
        long j5 = (-1) - (((-1) - ((long) iArr[i3 + 1])) | ((-1) - M));
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr2[i4 + 1]) & M);
        iArr3[i5 + 1] = (int) j6;
        long j7 = (-1) - (((-1) - ((long) iArr[i3 + 2])) | ((-1) - M));
        long j8 = iArr2[i4 + 2];
        long j9 = (j6 >>> 32) + (j2 * j7) + j5 + ((j8 + M) - (j8 | M));
        iArr3[i5 + 2] = (int) j9;
        long j10 = (-1) - (((-1) - ((long) iArr[i3 + 3])) | ((-1) - M));
        long j11 = (j9 >>> 32) + (j2 * j10) + j7 + ((-1) - (((-1) - M) | ((-1) - ((long) iArr2[i4 + 3]))));
        iArr3[i5 + 3] = (int) j11;
        return (j11 >>> 32) + j10;
    }

    public static int mul33DWordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = ((long) i2) & M;
        long j4 = (-1) - (((-1) - j2) | ((-1) - M));
        long j5 = (j3 * j4) + ((-1) - (((-1) - ((long) iArr[i3])) | ((-1) - M)));
        iArr[i3] = (int) j5;
        long j6 = j2 >>> 32;
        int i4 = i3 + 1;
        long j7 = iArr[i4];
        long j8 = (j5 >>> 32) + (j3 * j6) + j4 + ((j7 + M) - (j7 | M));
        iArr[i4] = (int) j8;
        int i5 = i3 + 2;
        long j9 = iArr[i5];
        long j10 = (j8 >>> 32) + j6 + ((j9 + M) - (j9 | M));
        iArr[i5] = (int) j10;
        int i6 = i3 + 3;
        long j11 = iArr[i6];
        long j12 = (j10 >>> 32) + ((j11 + M) - (j11 | M));
        iArr[i6] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static int mul33WordAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = ((long) i2) & M;
        long j3 = (-1) - (((-1) - ((long) i3)) | ((-1) - M));
        long j4 = (j2 * j3) + (((long) iArr[i4]) & M);
        iArr[i4] = (int) j4;
        int i5 = i4 + 1;
        long j5 = (j4 >>> 32) + j3 + (((long) iArr[i5]) & M);
        iArr[i5] = (int) j5;
        int i6 = i4 + 2;
        long j6 = iArr[i6];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M));
        iArr[i6] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i4, 3);
    }

    public static int mulAddTo(int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = iArr2[i3];
        long j3 = M;
        long j4 = (j2 + M) - (j2 | M);
        long j5 = iArr2[i3 + 1];
        long j6 = (j5 + M) - (j5 | M);
        long j7 = ((long) iArr2[i3 + 2]) & M;
        long j8 = ((long) iArr2[i3 + 3]) & M;
        long j9 = 0;
        int i5 = 0;
        while (i5 < 4) {
            long j10 = ((long) iArr[i2 + i5]) & j3;
            long j11 = (j10 * j4) + (((long) iArr3[i4]) & j3);
            iArr3[i4] = (int) j11;
            int i6 = i4 + 1;
            long j12 = iArr3[i6];
            j3 = M;
            long j13 = (j11 >>> 32) + (j10 * j6) + (j12 & M);
            iArr3[i6] = (int) j13;
            int i7 = i4 + 2;
            long j14 = (j13 >>> 32) + (j10 * j7) + ((-1) - (((-1) - ((long) iArr3[i7])) | ((-1) - M)));
            iArr3[i7] = (int) j14;
            int i8 = i4 + 3;
            long j15 = (j14 >>> 32) + (j10 * j8) + ((-1) - (((-1) - ((long) iArr3[i8])) | ((-1) - M)));
            iArr3[i8] = (int) j15;
            int i9 = i4 + 4;
            long j16 = (j15 >>> 32) + j9 + (((long) iArr3[i9]) & M);
            iArr3[i9] = (int) j16;
            j9 = j16 >>> 32;
            i5++;
            i4 = i6;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        long j2 = (-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M));
        long j3 = iArr2[1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M));
        long j6 = (-1) - (((-1) - ((long) iArr2[3])) | ((-1) - M));
        long j7 = 0;
        while (i2 < 4) {
            long j8 = (-1) - (((-1) - ((long) iArr[i2])) | ((-1) - M));
            long j9 = iArr3[i2];
            long j10 = ((j9 + M) - (j9 | M)) + (j8 * j2);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = iArr3[i3];
            long j12 = (j10 >>> 32) + (j8 * j4) + ((j11 + M) - (j11 | M));
            iArr3[i3] = (int) j12;
            int i4 = i2 + 2;
            long j13 = iArr3[i4];
            long j14 = (j12 >>> 32) + (j8 * j5) + ((j13 + M) - (j13 | M));
            iArr3[i4] = (int) j14;
            int i5 = i2 + 3;
            long j15 = iArr3[i5];
            long j16 = (j14 >>> 32) + (j8 * j6) + ((j15 + M) - (j15 | M));
            iArr3[i5] = (int) j16;
            int i6 = i2 + 4;
            long j17 = iArr3[i6];
            long j18 = (j16 >>> 32) + j7 + ((j17 + M) - (j17 | M));
            iArr3[i6] = (int) j18;
            j7 = j18 >>> 32;
            i2 = i3;
        }
        return (int) j7;
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
        } while (i4 < 4);
        return (int) j4;
    }

    public static int mulWordAddExt(int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j2 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j3 = iArr[i3];
        long j4 = (((j3 + M) - (j3 | M)) * j2) + ((-1) - (((-1) - ((long) iArr2[i4])) | ((-1) - M)));
        iArr2[i4] = (int) j4;
        int i5 = i4 + 1;
        long j5 = (j4 >>> 32) + ((((long) iArr[i3 + 1]) & M) * j2) + (((long) iArr2[i5]) & M);
        iArr2[i5] = (int) j5;
        long j6 = ((-1) - (((-1) - ((long) iArr[i3 + 2])) | ((-1) - M))) * j2;
        int i6 = i4 + 2;
        long j7 = iArr2[i6];
        long j8 = (j5 >>> 32) + j6 + ((j7 + M) - (j7 | M));
        iArr2[i6] = (int) j8;
        long j9 = j2 * (((long) iArr[i3 + 3]) & M);
        int i7 = i4 + 3;
        long j10 = iArr2[i7];
        long j11 = (j8 >>> 32) + j9 + ((j10 + M) - (j10 | M));
        iArr2[i7] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int mulWordDwordAdd(int i2, long j2, int[] iArr, int i3) {
        long j3 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
        long j4 = (((j2 + M) - (j2 | M)) * j3) + (((long) iArr[i3]) & M);
        iArr[i3] = (int) j4;
        int i4 = i3 + 1;
        long j5 = (j4 >>> 32) + (j3 * (j2 >>> 32)) + (((long) iArr[i4]) & M);
        iArr[i4] = (int) j5;
        int i5 = i3 + 2;
        long j6 = iArr[i5];
        long j7 = (j5 >>> 32) + ((j6 + M) - (j6 | M));
        iArr[i5] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 3);
    }

    public static int mulWordsAdd(int i2, int i3, int[] iArr, int i4) {
        long j2 = i2;
        long j3 = (j2 + M) - (j2 | M);
        long j4 = i3;
        long j5 = (((j4 + M) - (j4 | M)) * j3) + ((-1) - (((-1) - ((long) iArr[i4])) | ((-1) - M)));
        iArr[i4] = (int) j5;
        int i5 = i4 + 1;
        long j6 = (j5 >>> 32) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr[i5]))));
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i4, 2);
    }

    public static void square(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr[i2];
        long j3 = (j2 + M) - (j2 | M);
        int i4 = 0;
        int i5 = 8;
        int i6 = 3;
        while (true) {
            int i7 = i6 - 1;
            long j4 = ((long) iArr[i2 + i6]) & M;
            long j5 = j4 * j4;
            int i8 = i4 << 31;
            int i9 = (int) (j5 >>> 33);
            iArr2[i3 + (i5 - 1)] = (i8 + i9) - (i8 & i9);
            i5 -= 2;
            iArr2[i3 + i5] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i7 <= 0) {
                long j6 = j3 * j3;
                long j7 = i4 << 31;
                long j8 = (-1) - (((-1) - (j6 >>> 33)) & ((-1) - ((j7 + M) - (j7 | M))));
                iArr2[i3] = (int) j6;
                int i10 = (-1) - (((-1) - ((int) (j6 >>> 32))) | ((-1) - 1));
                long j9 = (-1) - (((-1) - ((long) iArr[i2 + 1])) | ((-1) - M));
                int i11 = i3 + 2;
                long j10 = iArr2[i11];
                long j11 = (j10 + M) - (j10 | M);
                long j12 = j8 + (j9 * j3);
                int i12 = (int) j12;
                iArr2[i3 + 1] = (-1) - (((-1) - (i12 << 1)) & ((-1) - i10));
                int i13 = i12 >>> 31;
                long j13 = j11 + (j12 >>> 32);
                long j14 = ((long) iArr[i2 + 2]) & M;
                int i14 = i3 + 3;
                long j15 = iArr2[i14];
                long j16 = (j15 + M) - (j15 | M);
                int i15 = i3 + 4;
                long j17 = ((long) iArr2[i15]) & M;
                long j18 = j13 + (j14 * j3);
                int i16 = (int) j18;
                int i17 = i16 << 1;
                iArr2[i11] = (i17 + i13) - (i17 & i13);
                int i18 = i16 >>> 31;
                long j19 = j16 + (j18 >>> 32) + (j14 * j9);
                long j20 = j17 + (j19 >>> 32);
                long j21 = j19 & M;
                long j22 = ((long) iArr[i2 + 3]) & M;
                int i19 = i3 + 5;
                long j23 = (-1) - (((-1) - ((long) iArr2[i19])) | ((-1) - M));
                int i20 = i3 + 6;
                long j24 = iArr2[i20];
                long j25 = (M + j24) - (M | j24);
                long j26 = j21 + (j3 * j22);
                int i21 = (int) j26;
                int i22 = i21 << 1;
                iArr2[i14] = (i22 + i18) - (i22 & i18);
                long j27 = j20 + (j26 >>> 32) + (j9 * j22);
                long j28 = j23 + (j27 >>> 32) + (j22 * j14);
                long j29 = j25 + (j28 >>> 32);
                int i23 = (int) j27;
                iArr2[i15] = (i21 >>> 31) | (i23 << 1);
                int i24 = (int) j28;
                iArr2[i19] = (-1) - (((-1) - (i23 >>> 31)) & ((-1) - (i24 << 1)));
                int i25 = i24 >>> 31;
                int i26 = (int) j29;
                iArr2[i20] = (-1) - (((-1) - i25) & ((-1) - (i26 << 1)));
                int i27 = i26 >>> 31;
                int i28 = i3 + 7;
                iArr2[i28] = i27 | ((iArr2[i28] + ((int) (j29 >> 32))) << 1);
                return;
            }
            i6 = i7;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & M;
        int i2 = 8;
        int i3 = 0;
        int i4 = 3;
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
                long j6 = i3 << 31;
                long j7 = (j5 >>> 33) | ((j6 + M) - (j6 | M));
                iArr2[0] = (int) j5;
                int i6 = (int) (j5 >>> 32);
                int i7 = (i6 + 1) - (i6 | 1);
                long j8 = (-1) - (((-1) - ((long) iArr[1])) | ((-1) - M));
                long j9 = iArr2[2];
                long j10 = (j9 + M) - (j9 | M);
                long j11 = j7 + (j8 * j2);
                int i8 = (int) j11;
                iArr2[1] = (-1) - (((-1) - (i8 << 1)) & ((-1) - i7));
                int i9 = i8 >>> 31;
                long j12 = j10 + (j11 >>> 32);
                long j13 = iArr[2];
                long j14 = (j13 + M) - (j13 | M);
                long j15 = ((long) iArr2[3]) & M;
                long j16 = iArr2[4];
                long j17 = (j16 + M) - (j16 | M);
                long j18 = j12 + (j14 * j2);
                int i10 = (int) j18;
                int i11 = i10 << 1;
                iArr2[2] = (i11 + i9) - (i11 & i9);
                int i12 = i10 >>> 31;
                long j19 = j15 + (j18 >>> 32) + (j14 * j8);
                long j20 = j17 + (j19 >>> 32);
                long j21 = (j19 + M) - (j19 | M);
                long j22 = ((long) iArr[3]) & M;
                long j23 = iArr2[5];
                long j24 = (j23 + M) - (j23 | M);
                long j25 = ((long) iArr2[6]) & M;
                long j26 = j21 + (j2 * j22);
                int i13 = (int) j26;
                iArr2[3] = (i13 << 1) | i12;
                long j27 = j20 + (j26 >>> 32) + (j8 * j22);
                long j28 = j24 + (j27 >>> 32) + (j22 * j14);
                long j29 = j25 + (j28 >>> 32);
                long j30 = j28 & M;
                int i14 = (int) j27;
                iArr2[4] = (-1) - (((-1) - (i13 >>> 31)) & ((-1) - (i14 << 1)));
                int i15 = (int) j30;
                iArr2[5] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j29;
                int i18 = i17 << 1;
                iArr2[6] = (i16 + i18) - (i16 & i18);
                iArr2[7] = (-1) - (((-1) - (i17 >>> 31)) & ((-1) - ((iArr2[7] + ((int) (j29 >> 32))) << 1)));
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
        long j5 = ((long) iArr[i2 + 1]) & M;
        long j6 = iArr2[i3 + 1];
        long j7 = (j4 >> 32) + (j5 - ((j6 + M) - (j6 | M)));
        iArr3[i4 + 1] = (int) j7;
        long j8 = (-1) - (((-1) - ((long) iArr[i2 + 2])) | ((-1) - M));
        long j9 = iArr2[i3 + 2];
        long j10 = (j7 >> 32) + (j8 - ((j9 + M) - (j9 | M)));
        iArr3[i4 + 2] = (int) j10;
        long j11 = (j10 >> 32) + (((-1) - (((-1) - ((long) iArr[i2 + 3])) | ((-1) - M))) - (((long) iArr2[i3 + 3]) & M));
        iArr3[i4 + 3] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[1]) & M) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j3;
        long j4 = iArr[2];
        long j5 = (j3 >> 32) + (((j4 + M) - (j4 | M)) - (((long) iArr2[2]) & M));
        iArr3[2] = (int) j5;
        long j6 = iArr[3];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = iArr2[3];
        long j9 = (j5 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr3[3] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = iArr3[0];
        long j3 = (((j2 + M) - (j2 | M)) - ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M)));
        iArr3[0] = (int) j3;
        long j4 = (j3 >> 32) + ((((-1) - (((-1) - ((long) iArr3[1])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[1])) | ((-1) - M))));
        iArr3[1] = (int) j4;
        long j5 = (j4 >> 32) + ((((-1) - (((-1) - ((long) iArr3[2])) | ((-1) - M))) - ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)))) - ((-1) - (((-1) - ((long) iArr2[2])) | ((-1) - M))));
        iArr3[2] = (int) j5;
        long j6 = iArr3[3];
        long j7 = ((j6 + M) - (j6 | M)) - (((long) iArr[3]) & M);
        long j8 = iArr2[3];
        long j9 = (j5 >> 32) + (j7 - ((j8 + M) - (j8 | M)));
        iArr3[3] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int subFrom(int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = iArr2[i3];
        long j3 = ((j2 + M) - (j2 | M)) - (((long) iArr[i2]) & M);
        iArr2[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = iArr2[i4];
        long j5 = (j3 >> 32) + (((j4 + M) - (j4 | M)) - (((long) iArr[i2 + 1]) & M));
        iArr2[i4] = (int) j5;
        int i5 = i3 + 2;
        long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr2[i5])) | ((-1) - M))) - (((long) iArr[i2 + 2]) & M));
        iArr2[i5] = (int) j6;
        int i6 = i3 + 3;
        long j7 = (j6 >> 32) + ((((long) iArr2[i6]) & M) - (((long) iArr[i2 + 3]) & M));
        iArr2[i6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = ((-1) - (((-1) - ((long) iArr2[0])) | ((-1) - M))) - (((long) iArr[0]) & M);
        iArr2[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[1]) & M) - ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))));
        iArr2[1] = (int) j3;
        long j4 = ((long) iArr2[2]) & M;
        long j5 = iArr[2];
        long j6 = (j3 >> 32) + (j4 - ((j5 + M) - (j5 | M)));
        iArr2[2] = (int) j6;
        long j7 = iArr2[3];
        long j8 = (j6 >> 32) + (((j7 + M) - (j7 | M)) - ((-1) - (((-1) - M) | ((-1) - ((long) iArr[3])))));
        iArr2[3] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, (3 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 2; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                Pack.longToBigEndian(j2, bArr, (1 - i2) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}

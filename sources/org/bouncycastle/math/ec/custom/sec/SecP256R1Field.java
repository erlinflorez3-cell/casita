package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256R1Field {
    private static final long M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15 = -1;
    static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j2 = iArr[0];
        long j3 = ((j2 + M) - (j2 | M)) + 1;
        iArr[0] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + (((long) iArr[1]) & M);
            iArr[1] = (int) j5;
            long j6 = iArr[2];
            long j7 = (j5 >> 32) + ((j6 + M) - (j6 | M));
            iArr[2] = (int) j7;
            j4 = j7 >> 32;
        }
        long j8 = j4 + ((((long) iArr[3]) & M) - 1);
        iArr[3] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = iArr[4];
            long j11 = j9 + ((j10 + M) - (j10 | M));
            iArr[4] = (int) j11;
            long j12 = iArr[5];
            long j13 = (j11 >> 32) + ((j12 + M) - (j12 | M));
            iArr[5] = (int) j13;
            j9 = j13 >> 32;
        }
        long j14 = iArr[6];
        long j15 = j9 + (((j14 + M) - (j14 | M)) - 1);
        iArr[6] = (int) j15;
        long j16 = iArr[7];
        iArr[7] = (int) ((j15 >> 32) + ((M + j16) - (M | j16)) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat256.isZero(iArr)) {
            Nat256.zero(iArr2);
        } else {
            Nat256.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = (-1) - (((-1) - ((long) iArr[8])) | ((-1) - M));
        long j3 = (-1) - (((-1) - ((long) iArr[9])) | ((-1) - M));
        long j4 = (-1) - (((-1) - ((long) iArr[10])) | ((-1) - M));
        long j5 = (-1) - (((-1) - ((long) iArr[11])) | ((-1) - M));
        long j6 = iArr[12];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = ((long) iArr[13]) & M;
        long j9 = ((long) iArr[14]) & M;
        long j10 = ((long) iArr[15]) & M;
        long j11 = j2 - 6;
        long j12 = j11 + j3;
        long j13 = j3 + j4;
        long j14 = (j4 + j5) - j10;
        long j15 = j5 + j7;
        long j16 = j7 + j8;
        long j17 = j8 + j9;
        long j18 = j9 + j10;
        long j19 = j17 - j12;
        long j20 = iArr[0];
        long j21 = (((j20 + M) - (j20 | M)) - j15) - j19;
        iArr2[0] = (int) j21;
        long j22 = iArr[1];
        long j23 = (j21 >> 32) + (((((j22 + M) - (j22 | M)) + j13) - j16) - j18);
        iArr2[1] = (int) j23;
        long j24 = iArr[2];
        long j25 = (j23 >> 32) + ((((j24 + M) - (j24 | M)) + j14) - j17);
        iArr2[2] = (int) j25;
        long j26 = iArr[3];
        long j27 = (j25 >> 32) + (((((j26 + M) - (j26 | M)) + (j15 << 1)) + j19) - j18);
        iArr2[3] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[4]) & M) + (j16 << 1)) + j9) - j13);
        iArr2[4] = (int) j28;
        long j29 = (j28 >> 32) + ((((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M))) + (j17 << 1)) - j14);
        iArr2[5] = (int) j29;
        long j30 = (j29 >> 32) + ((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + (j18 << 1) + j19;
        iArr2[6] = (int) j30;
        long j31 = iArr[7];
        long j32 = (j30 >> 32) + ((((((j31 + M) - (j31 | M)) + (j10 << 1)) + j11) - j14) - j16);
        iArr2[7] = (int) j32;
        reduce32((int) ((j32 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
            long j4 = iArr[0];
            long j5 = ((j4 + M) - (j4 | M)) + j3;
            iArr[0] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = iArr[1];
                long j8 = j6 + ((j7 + M) - (j7 | M));
                iArr[1] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr[2]) & M);
                iArr[2] = (int) j9;
                j6 = j9 >> 32;
            }
            long j10 = iArr[3];
            long j11 = j6 + (((j10 + M) - (j10 | M)) - j3);
            iArr[3] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (((long) iArr[4]) & M);
                iArr[4] = (int) j13;
                long j14 = (j13 >> 32) + ((-1) - (((-1) - ((long) iArr[5])) | ((-1) - M)));
                iArr[5] = (int) j14;
                j12 = j14 >> 32;
            }
            long j15 = j12 + (((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) - j3);
            iArr[6] = (int) j15;
            long j16 = (j15 >> 32) + ((-1) - (((-1) - M) | ((-1) - ((long) iArr[7])))) + j3;
            iArr[7] = (int) j16;
            j2 = j16 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || (iArr[7] == -1 && Nat256.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i2, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = (((long) iArr[0]) & M) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M)));
            iArr[1] = (int) j4;
            long j5 = iArr[2];
            long j6 = (j4 >> 32) + ((j5 + M) - (j5 | M));
            iArr[2] = (int) j6;
            j3 = j6 >> 32;
        }
        long j7 = j3 + (((long) iArr[3]) & M) + 1;
        iArr[3] = (int) j7;
        long j8 = j7 >> 32;
        if (j8 != 0) {
            long j9 = iArr[4];
            long j10 = j8 + ((j9 + M) - (j9 | M));
            iArr[4] = (int) j10;
            long j11 = iArr[5];
            long j12 = (j10 >> 32) + ((j11 + M) - (j11 | M));
            iArr[5] = (int) j12;
            j8 = j12 >> 32;
        }
        long j13 = j8 + (((long) iArr[6]) & M) + 1;
        iArr[6] = (int) j13;
        long j14 = iArr[7];
        iArr[7] = (int) ((j13 >> 32) + (((M + j14) - (M | j14)) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}

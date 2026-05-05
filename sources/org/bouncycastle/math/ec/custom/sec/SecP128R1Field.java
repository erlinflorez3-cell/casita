package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes2.dex */
public class SecP128R1Field {
    private static final long M = 4294967295L;
    private static final int P3 = -3;
    private static final int PExt7 = -4;
    static final int[] P = {-1, -1, -1, -3};
    static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || (iArr3[3] == -3 && Nat128.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = iArr[1];
            long j5 = j3 + ((j4 + M) - (j4 | M));
            iArr[1] = (int) j5;
            long j6 = iArr[2];
            long j7 = (j5 >> 32) + ((j6 + M) - (j6 | M));
            iArr[2] = (int) j7;
            j3 = j7 >> 32;
        }
        long j8 = iArr[3];
        iArr[3] = (int) (j3 + ((M + j8) - (M | j8)) + 2);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat128.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[3] == -3) {
            int[] iArr = P;
            if (Nat128.gte(iArrFromBigInteger, iArr)) {
                Nat128.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i2 = iArr[0];
        if ((i2 + 1) - (i2 | 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat128.isZero(iArr)) {
            Nat128.zero(iArr2);
        } else {
            Nat128.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = (-1) - (((-1) - ((long) iArr[0])) | ((-1) - M));
        long j3 = iArr[1];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (-1) - (((-1) - ((long) iArr[2])) | ((-1) - M));
        long j6 = iArr[3];
        long j7 = (j6 + M) - (j6 | M);
        long j8 = ((long) iArr[4]) & M;
        long j9 = (-1) - (((-1) - ((long) iArr[5])) | ((-1) - M));
        long j10 = ((long) iArr[6]) & M;
        long j11 = iArr[7];
        long j12 = (j11 + M) - (j11 | M);
        long j13 = j10 + (j12 << 1);
        long j14 = j9 + (j13 << 1);
        long j15 = j8 + (j14 << 1);
        long j16 = j2 + j15;
        iArr2[0] = (int) j16;
        long j17 = j4 + j14 + (j16 >>> 32);
        iArr2[1] = (int) j17;
        long j18 = j5 + j13 + (j17 >>> 32);
        iArr2[2] = (int) j18;
        long j19 = j7 + j12 + (j15 << 1) + (j18 >>> 32);
        iArr2[3] = (int) j19;
        reduce32((int) (j19 >>> 32), iArr2);
    }

    public static void reduce32(int i2, int[] iArr) {
        while (i2 != 0) {
            long j2 = i2;
            long j3 = (j2 + M) - (j2 | M);
            long j4 = (((long) iArr[0]) & M) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[1]) & M);
                iArr[1] = (int) j6;
                long j7 = iArr[2];
                long j8 = (j6 >> 32) + ((j7 + M) - (j7 | M));
                iArr[2] = (int) j8;
                j5 = j8 >> 32;
            }
            long j9 = iArr[3];
            long j10 = j5 + ((M + j9) - (M | j9)) + (j3 << 1);
            iArr[3] = (int) j10;
            i2 = (int) (j10 >> 32);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i2, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                Nat128.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = (((long) iArr[0]) & M) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & M);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)));
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        iArr[3] = (int) (j3 + ((M & ((long) iArr[3])) - 2));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || (iArr2[3] == -3 && Nat128.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}

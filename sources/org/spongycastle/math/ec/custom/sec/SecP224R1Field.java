package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat224;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224R1Field {
    private static final long M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;
    static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & M);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (((long) iArr[2]) & M);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = j3 + ((-1) - (((-1) - M) | ((-1) - ((long) iArr[3])))) + 1;
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = P;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((-1) - (((-1) - iArr[0]) | ((-1) - 1)) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat224.isZero(iArr)) {
            Nat224.zero(iArr2);
        } else {
            Nat224.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = iArr[10];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr[11];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = ((long) iArr[12]) & M;
        long j7 = ((long) iArr[13]) & M;
        long j8 = (((-1) - (((-1) - ((long) iArr[7])) | ((-1) - M))) + j5) - 1;
        long j9 = (((long) iArr[8]) & M) + j6;
        long j10 = (((long) iArr[9]) & M) + j7;
        long j11 = (((long) iArr[0]) & M) - j8;
        long j12 = (-1) - (((-1) - j11) | ((-1) - M));
        long j13 = (j11 >> 32) + ((((long) iArr[1]) & M) - j9);
        int i2 = (int) j13;
        iArr2[1] = i2;
        long j14 = iArr[2];
        long j15 = (j13 >> 32) + (((j14 + M) - (j14 | M)) - j10);
        int i3 = (int) j15;
        iArr2[2] = i3;
        long j16 = iArr[3];
        long j17 = (j15 >> 32) + ((((j16 + M) - (j16 | M)) + j8) - j3);
        long j18 = (j17 + M) - (j17 | M);
        long j19 = iArr[4];
        long j20 = (j17 >> 32) + ((((j19 + M) - (j19 | M)) + j9) - j5);
        iArr2[4] = (int) j20;
        long j21 = (j20 >> 32) + (((((long) iArr[5]) & M) + j10) - j6);
        iArr2[5] = (int) j21;
        long j22 = (j21 >> 32) + (((((long) iArr[6]) & M) + j3) - j7);
        iArr2[6] = (int) j22;
        long j23 = (j22 >> 32) + 1;
        long j24 = j18 + j23;
        long j25 = j12 - j23;
        iArr2[0] = (int) j25;
        long j26 = j25 >> 32;
        if (j26 != 0) {
            long j27 = j26 + (((long) i2) & M);
            iArr2[1] = (int) j27;
            long j28 = i3;
            long j29 = (j27 >> 32) + ((M + j28) - (M | j28));
            iArr2[2] = (int) j29;
            j24 += j29 >> 32;
        }
        iArr2[3] = (int) j24;
        if (((j24 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = ((long) i2) & M;
            long j4 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) - j3;
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
            long j9 = j5 + (M & ((long) iArr[3])) + j3;
            iArr[3] = (int) j9;
            j2 = j9 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i2, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            Nat224.square(iArr2, iArrCreateExt);
            reduce(iArrCreateExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & M);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)));
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = j3 + (((-1) - (((-1) - M) | ((-1) - ((long) iArr[3])))) - 1);
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}

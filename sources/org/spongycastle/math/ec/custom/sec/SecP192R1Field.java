package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192R1Field {
    private static final long M = 4294967295L;
    private static final int P5 = -1;
    private static final int PExt11 = -1;
    static final int[] P = {-1, -1, -2, -1, -1, -1};
    static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Nat192.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
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
            j3 = j5 >> 32;
        }
        long j6 = iArr[2];
        long j7 = j3 + ((M + j6) - (M | j6)) + 1;
        iArr[2] = (int) j7;
        if ((j7 >> 32) != 0) {
            Nat.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat192.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[5] == -1) {
            int[] iArr = P;
            if (Nat192.gte(iArrFromBigInteger, iArr)) {
                Nat192.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i2 = iArr[0];
        if ((i2 + 1) - (i2 | 1) == 0) {
            Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(6, iArr2, Nat192.add(iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat192.isZero(iArr)) {
            Nat192.zero(iArr2);
        } else {
            Nat192.sub(P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = iArr[6];
        long j3 = (j2 + M) - (j2 | M);
        long j4 = iArr[7];
        long j5 = (j4 + M) - (j4 | M);
        long j6 = (-1) - (((-1) - ((long) iArr[8])) | ((-1) - M));
        long j7 = (-1) - (((-1) - ((long) iArr[9])) | ((-1) - M));
        long j8 = iArr[10];
        long j9 = ((j8 + M) - (j8 | M)) + j3;
        long j10 = ((-1) - (((-1) - ((long) iArr[11])) | ((-1) - M))) + j5;
        long j11 = (((long) iArr[0]) & M) + j9;
        int i2 = (int) j11;
        long j12 = iArr[1];
        long j13 = (j11 >> 32) + ((j12 + M) - (j12 | M)) + j10;
        int i3 = (int) j13;
        iArr2[1] = i3;
        long j14 = j9 + j6;
        long j15 = j10 + j7;
        long j16 = (j13 >> 32) + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) + j14;
        long j17 = (-1) - (((-1) - j16) | ((-1) - M));
        long j18 = (j16 >> 32) + (((long) iArr[3]) & M) + j15;
        iArr2[3] = (int) j18;
        long j19 = (j18 >> 32) + (((long) iArr[4]) & M) + (j14 - j3);
        iArr2[4] = (int) j19;
        long j20 = (j19 >> 32) + (((long) iArr[5]) & M) + (j15 - j5);
        iArr2[5] = (int) j20;
        long j21 = j20 >> 32;
        long j22 = j17 + j21;
        long j23 = j21 + ((-1) - (((-1) - ((long) i2)) | ((-1) - M)));
        iArr2[0] = (int) j23;
        long j24 = j23 >> 32;
        if (j24 != 0) {
            long j25 = j24 + (M & ((long) i3));
            iArr2[1] = (int) j25;
            j22 += j25 >> 32;
        }
        iArr2[2] = (int) j22;
        if (((j22 >> 32) == 0 || Nat.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2;
            long j4 = (j3 + M) - (j3 | M);
            long j5 = iArr[0];
            long j6 = ((j5 + M) - (j5 | M)) + j4;
            iArr[0] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (((long) iArr[1]) & M);
                iArr[1] = (int) j8;
                j7 = j8 >> 32;
            }
            long j9 = j7 + ((-1) - (((-1) - M) | ((-1) - ((long) iArr[2])))) + j4;
            iArr[2] = (int) j9;
            j2 = j9 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || Nat.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && Nat192.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i2, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            Nat192.square(iArr2, iArrCreateExt);
            reduce(iArrCreateExt, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + ((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M)));
            iArr[1] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = iArr[2];
        long j6 = j3 + (((M + j5) - (M | j5)) - 1);
        iArr[2] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}

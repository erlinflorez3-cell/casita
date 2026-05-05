package org.bouncycastle.math.ec.custom.sec;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

/* JADX INFO: loaded from: classes2.dex */
public class SecP384R1Field {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j2 = (((long) iArr[0]) & M) + 1;
        iArr[0] = (int) j2;
        long j3 = (j2 >> 32) + (((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) - 1);
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)));
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = iArr[3];
        long j7 = j4 + ((j6 + M) - (j6 | M)) + 1;
        iArr[3] = (int) j7;
        long j8 = (j7 >> 32) + (M & ((long) iArr[4])) + 1;
        iArr[4] = (int) j8;
        if ((j8 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, bigInteger);
        if (iArrFromBigInteger[11] == -1) {
            int[] iArr = P;
            if (Nat.gte(12, iArrFromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((-1) - (((-1) - iArr[0]) | ((-1) - 1)) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(24);
        Nat384.mul(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat.isZero(12, iArr)) {
            Nat.zero(12, iArr2);
        } else {
            Nat.sub(12, P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = (-1) - (((-1) - ((long) iArr[16])) | ((-1) - M));
        long j3 = ((long) iArr[17]) & M;
        long j4 = (-1) - (((-1) - ((long) iArr[18])) | ((-1) - M));
        long j5 = ((long) iArr[19]) & M;
        long j6 = ((long) iArr[20]) & M;
        long j7 = (-1) - (((-1) - ((long) iArr[21])) | ((-1) - M));
        long j8 = ((long) iArr[22]) & M;
        long j9 = (-1) - (((-1) - ((long) iArr[23])) | ((-1) - M));
        long j10 = iArr[12];
        long j11 = (((j10 + M) - (j10 | M)) + j6) - 1;
        long j12 = (((long) iArr[13]) & M) + j8;
        long j13 = (((long) iArr[14]) & M) + j8 + j9;
        long j14 = (((long) iArr[15]) & M) + j9;
        long j15 = j3 + j7;
        long j16 = j7 - j9;
        long j17 = j8 - j9;
        long j18 = j11 + j16;
        long j19 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) + j18;
        iArr2[0] = (int) j19;
        long j20 = iArr[1];
        long j21 = (j19 >> 32) + ((((j20 + M) - (j20 | M)) + j9) - j11) + j12;
        iArr2[1] = (int) j21;
        long j22 = (j21 >> 32) + ((((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M))) - j7) - j12) + j13;
        iArr2[2] = (int) j22;
        long j23 = (j22 >> 32) + ((((long) iArr[3]) & M) - j13) + j14 + j18;
        iArr2[3] = (int) j23;
        long j24 = (j23 >> 32) + (((((((long) iArr[4]) & M) + j2) + j7) + j12) - j14) + j18;
        iArr2[4] = (int) j24;
        long j25 = (j24 >> 32) + ((((long) iArr[5]) & M) - j2) + j12 + j13 + j15;
        iArr2[5] = (int) j25;
        long j26 = (j25 >> 32) + ((((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + j4) - j3) + j13 + j14;
        iArr2[6] = (int) j26;
        long j27 = (j26 >> 32) + ((((((long) iArr[7]) & M) + j2) + j5) - j4) + j14;
        iArr2[7] = (int) j27;
        long j28 = (j27 >> 32) + ((((((-1) - (((-1) - ((long) iArr[8])) | ((-1) - M))) + j2) + j3) + j6) - j5);
        iArr2[8] = (int) j28;
        long j29 = (j28 >> 32) + (((((long) iArr[9]) & M) + j4) - j6) + j15;
        iArr2[9] = (int) j29;
        long j30 = (j29 >> 32) + ((((((long) iArr[10]) & M) + j4) + j5) - j16) + j17;
        iArr2[10] = (int) j30;
        long j31 = (j30 >> 32) + (((((-1) - (((-1) - ((long) iArr[11])) | ((-1) - M))) + j5) + j6) - j17);
        iArr2[11] = (int) j31;
        reduce32((int) ((j31 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2;
            long j4 = (j3 + M) - (j3 | M);
            long j5 = (((long) iArr[0]) & M) + j4;
            iArr[0] = (int) j5;
            long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) - j4);
            iArr[1] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = iArr[2];
                long j9 = j7 + ((j8 + M) - (j8 | M));
                iArr[2] = (int) j9;
                j7 = j9 >> 32;
            }
            long j10 = iArr[3];
            long j11 = j7 + ((j10 + M) - (j10 | M)) + j4;
            iArr[3] = (int) j11;
            long j12 = (j11 >> 32) + (M & ((long) iArr[4])) + j4;
            iArr[4] = (int) j12;
            j2 = j12 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i2, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArrCreate);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) - 1;
        iArr[0] = (int) j2;
        long j3 = (j2 >> 32) + (((long) iArr[1]) & M) + 1;
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)));
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = iArr[3];
        long j7 = j4 + (((j6 + M) - (j6 | M)) - 1);
        iArr[3] = (int) j7;
        long j8 = iArr[4];
        long j9 = (j7 >> 32) + (((M + j8) - (M | j8)) - 1);
        iArr[4] = (int) j9;
        if ((j9 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}

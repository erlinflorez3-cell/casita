package org.spongycastle.math.ec.custom.sec;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat384;

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
        long j2 = iArr[0];
        long j3 = ((j2 + M) - (j2 | M)) + 1;
        iArr[0] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[1]) & M) - 1);
        iArr[1] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            long j6 = j5 + (((long) iArr[2]) & M);
            iArr[2] = (int) j6;
            j5 = j6 >> 32;
        }
        long j7 = j5 + ((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) + 1;
        iArr[3] = (int) j7;
        long j8 = iArr[4];
        long j9 = (j7 >> 32) + ((M + j8) - (M | j8)) + 1;
        iArr[4] = (int) j9;
        if ((j9 >> 32) != 0) {
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
        if ((iArr[0] & 1) == 0) {
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
        long j2 = ((long) iArr[16]) & M;
        long j3 = iArr[17];
        long j4 = (j3 + M) - (j3 | M);
        long j5 = (-1) - (((-1) - ((long) iArr[18])) | ((-1) - M));
        long j6 = ((long) iArr[19]) & M;
        long j7 = (-1) - (((-1) - ((long) iArr[20])) | ((-1) - M));
        long j8 = ((long) iArr[21]) & M;
        long j9 = ((long) iArr[22]) & M;
        long j10 = (-1) - (((-1) - ((long) iArr[23])) | ((-1) - M));
        long j11 = iArr[12];
        long j12 = (((j11 + M) - (j11 | M)) + j7) - 1;
        long j13 = ((-1) - (((-1) - ((long) iArr[13])) | ((-1) - M))) + j9;
        long j14 = ((-1) - (((-1) - ((long) iArr[14])) | ((-1) - M))) + j9 + j10;
        long j15 = iArr[15];
        long j16 = ((j15 + M) - (j15 | M)) + j10;
        long j17 = j4 + j8;
        long j18 = j8 - j10;
        long j19 = j9 - j10;
        long j20 = (((long) iArr[0]) & M) + j12 + j18;
        iArr2[0] = (int) j20;
        long j21 = iArr[1];
        long j22 = (j20 >> 32) + ((((j21 + M) - (j21 | M)) + j10) - j12) + j13;
        iArr2[1] = (int) j22;
        long j23 = iArr[2];
        long j24 = (j22 >> 32) + ((((j23 + M) - (j23 | M)) - j8) - j13) + j14;
        iArr2[2] = (int) j24;
        long j25 = (j24 >> 32) + ((((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) + j12) - j14) + j16 + j18;
        iArr2[3] = (int) j25;
        long j26 = (j25 >> 32) + ((((((((long) iArr[4]) & M) + j2) + j8) + j12) + j13) - j16) + j18;
        iArr2[4] = (int) j26;
        long j27 = iArr[5];
        long j28 = (j26 >> 32) + (((j27 + M) - (j27 | M)) - j2) + j13 + j14 + j17;
        iArr2[5] = (int) j28;
        long j29 = (j28 >> 32) + ((((-1) - (((-1) - ((long) iArr[6])) | ((-1) - M))) + j5) - j4) + j14 + j16;
        iArr2[6] = (int) j29;
        long j30 = (j29 >> 32) + ((((((long) iArr[7]) & M) + j2) + j6) - j5) + j16;
        iArr2[7] = (int) j30;
        long j31 = iArr[8];
        long j32 = (j30 >> 32) + ((((((j31 + M) - (j31 | M)) + j2) + j4) + j7) - j6);
        iArr2[8] = (int) j32;
        long j33 = (j32 >> 32) + ((((-1) - (((-1) - ((long) iArr[9])) | ((-1) - M))) + j5) - j7) + j17;
        iArr2[9] = (int) j33;
        long j34 = iArr[10];
        long j35 = (j33 >> 32) + (((((j34 + M) - (j34 | M)) + j5) + j6) - j18) + j19;
        iArr2[10] = (int) j35;
        long j36 = iArr[11];
        long j37 = (j35 >> 32) + (((((j36 + M) - (j36 | M)) + j6) + j7) - j19);
        iArr2[11] = (int) j37;
        reduce32((int) ((j37 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = (-1) - (((-1) - ((long) i2)) | ((-1) - M));
            long j4 = iArr[0];
            long j5 = ((j4 + M) - (j4 | M)) + j3;
            iArr[0] = (int) j5;
            long j6 = (j5 >> 32) + (((-1) - (((-1) - ((long) iArr[1])) | ((-1) - M))) - j3);
            iArr[1] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)));
                iArr[2] = (int) j8;
                j7 = j8 >> 32;
            }
            long j9 = j7 + (((long) iArr[3]) & M) + j3;
            iArr[3] = (int) j9;
            long j10 = iArr[4];
            long j11 = (j9 >> 32) + ((M + j10) - (M | j10)) + j3;
            iArr[4] = (int) j11;
            j2 = j11 >> 32;
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
        reduce(iArrCreate, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            Nat384.square(iArr2, iArrCreate);
            reduce(iArrCreate, iArr2);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = ((-1) - (((-1) - ((long) iArr[0])) | ((-1) - M))) - 1;
        iArr[0] = (int) j2;
        long j3 = iArr[1];
        long j4 = (j2 >> 32) + ((j3 + M) - (j3 | M)) + 1;
        iArr[1] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            long j6 = j5 + ((-1) - (((-1) - ((long) iArr[2])) | ((-1) - M)));
            iArr[2] = (int) j6;
            j5 = j6 >> 32;
        }
        long j7 = j5 + (((-1) - (((-1) - ((long) iArr[3])) | ((-1) - M))) - 1);
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

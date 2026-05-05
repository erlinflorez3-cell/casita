package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat512;

/* JADX INFO: loaded from: classes2.dex */
public class SecP521R1Field {
    static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    private static final int P16 = 511;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int iAdd = Nat.add(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iAdd > 511 || (iAdd == 511 && Nat.eq(16, iArr3, P))) {
            iAdd = (iAdd + Nat.inc(16, iArr3)) & 511;
        }
        iArr3[16] = iAdd;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int iInc = Nat.inc(16, iArr, iArr2) + iArr[16];
        if (iInc > 511 || (iInc == 511 && Nat.eq(16, iArr2, P))) {
            int iInc2 = iInc + Nat.inc(16, iArr2);
            iInc = (iInc2 + 511) - (iInc2 | 511);
        }
        iArr2[16] = iInc;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(521, bigInteger);
        if (Nat.eq(17, iArrFromBigInteger, P)) {
            Nat.zero(17, iArrFromBigInteger);
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i2 = iArr[16];
        iArr2[16] = (-1) - (((-1) - (Nat.shiftDownBit(16, iArr, i2, iArr2) >>> 23)) & ((-1) - (i2 >>> 1)));
    }

    protected static void implMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat512.mul(iArr, iArr2, iArr3);
        int i2 = iArr[16];
        int i3 = iArr2[16];
        iArr3[32] = Nat.mul31BothAdd(16, i2, iArr2, i3, iArr, iArr3, 16) + (i2 * i3);
    }

    protected static void implSquare(int[] iArr, int[] iArr2) {
        Nat512.square(iArr, iArr2);
        int i2 = iArr[16];
        iArr2[32] = Nat.mulWordAddTo(16, i2 << 1, iArr, 0, iArr2, 16) + (i2 * i2);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(33);
        implMultiply(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat.isZero(17, iArr)) {
            Nat.zero(17, iArr2);
        } else {
            Nat.sub(17, P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i2 = iArr[32];
        int iShiftDownBits = (Nat.shiftDownBits(16, iArr, 16, 9, i2, iArr2, 0) >>> 23) + (i2 >>> 9) + Nat.addTo(16, iArr, iArr2);
        if (iShiftDownBits > 511 || (iShiftDownBits == 511 && Nat.eq(16, iArr2, P))) {
            iShiftDownBits = (iShiftDownBits + Nat.inc(16, iArr2)) & 511;
        }
        iArr2[16] = iShiftDownBits;
    }

    public static void reduce23(int[] iArr) {
        int i2 = iArr[16];
        int iAddWordTo = Nat.addWordTo(16, i2 >>> 9, iArr) + ((i2 + 511) - (i2 | 511));
        if (iAddWordTo > 511 || (iAddWordTo == 511 && Nat.eq(16, iArr, P))) {
            iAddWordTo = (iAddWordTo + Nat.inc(16, iArr)) & 511;
        }
        iArr[16] = iAddWordTo;
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(33);
        implSquare(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i2, int[] iArr2) {
        int[] iArrCreate = Nat.create(33);
        implSquare(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            implSquare(iArr2, iArrCreate);
            reduce(iArrCreate, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int iSub = (Nat.sub(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iSub < 0) {
            iSub = (-1) - (((-1) - (iSub + Nat.dec(16, iArr3))) | ((-1) - 511));
        }
        iArr3[16] = iSub;
    }

    public static void twice(int[] iArr, int[] iArr2) {
        int i2 = iArr[16];
        iArr2[16] = (-1) - (((-1) - ((-1) - (((-1) - Nat.shiftUpBit(16, iArr, i2 << 23, iArr2)) & ((-1) - (i2 << 1))))) | ((-1) - 511));
    }
}

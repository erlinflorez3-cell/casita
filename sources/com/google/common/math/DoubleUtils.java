package com.google.common.math;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    static double bigToDouble(BigInteger x2) {
        BigInteger bigIntegerAbs = x2.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i2 = iBitLength - 1;
        if (i2 < 63) {
            return x2.longValue();
        }
        if (i2 > EXPONENT_BIAS) {
            return ((double) x2.signum()) * Double.POSITIVE_INFINITY;
        }
        int i3 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i3).longValue();
        long j2 = jLongValue >> 1;
        long j3 = SIGNIFICAND_MASK & j2;
        if ((-1) - (((-1) - jLongValue) | ((-1) - 1)) != 0 && ((j2 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i3)) {
            j3++;
        }
        return Double.longBitsToDouble((-1) - (((-1) - ((((long) (iBitLength + PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)) << 52) + j3)) & ((-1) - (((long) x2.signum()) & Long.MIN_VALUE))));
    }

    static double ensureNonNegative(double value) {
        Preconditions.checkArgument(!Double.isNaN(value));
        return Math.max(value, 0.0d);
    }

    static long getSignificand(double d2) {
        Preconditions.checkArgument(isFinite(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = (-1) - (((-1) - Double.doubleToRawLongBits(d2)) | ((-1) - SIGNIFICAND_MASK));
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | IMPLICIT_BIT;
    }

    static boolean isFinite(double d2) {
        return Math.getExponent(d2) <= EXPONENT_BIAS;
    }

    static boolean isNormal(double d2) {
        return Math.getExponent(d2) >= -1022;
    }

    static double nextDown(double d2) {
        return -Math.nextUp(-d2);
    }

    static double scaleNormalize(double x2) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(x2);
        long j2 = (jDoubleToRawLongBits + SIGNIFICAND_MASK) - (jDoubleToRawLongBits | SIGNIFICAND_MASK);
        return Double.longBitsToDouble((j2 + ONE_BITS) - (j2 & ONE_BITS));
    }
}

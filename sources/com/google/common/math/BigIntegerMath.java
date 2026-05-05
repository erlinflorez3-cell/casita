package com.google.common.math;

import com.braze.Constants;
import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class BigIntegerMath {
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;
    static final BigInteger SQRT2_PRECOMPUTED_BITS = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double LN_10 = Math.log(10.0d);
    private static final double LN_2 = Math.log(2.0d);

    /* JADX INFO: renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {
        static final BigIntegerToDoubleRounder INSTANCE = new BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public BigInteger minus(BigInteger a2, BigInteger b2) {
            return a2.subtract(b2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(BigInteger bigInteger) {
            return DoubleUtils.bigToDouble(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public int sign(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        public BigInteger toX(double d2, RoundingMode mode) {
            return DoubleMath.roundToBigInteger(d2, mode);
        }
    }

    private BigIntegerMath() {
    }

    public static BigInteger binomial(int n2, int k2) {
        int i2;
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        MathPreconditions.checkNonNegative("k", k2);
        int i3 = 1;
        Preconditions.checkArgument(k2 <= n2, "k (%s) > n (%s)", k2, n2);
        if (k2 > (n2 >> 1)) {
            k2 = n2 - k2;
        }
        if (k2 < LongMath.biggestBinomials.length && n2 <= LongMath.biggestBinomials[k2]) {
            return BigInteger.valueOf(LongMath.binomial(n2, k2));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j2 = n2;
        int iLog2 = LongMath.log2(j2, RoundingMode.CEILING);
        long j3 = 1;
        while (true) {
            int i4 = iLog2;
            while (i3 < k2) {
                i2 = n2 - i3;
                i3++;
                i4 += iLog2;
                if (i4 >= 63) {
                    break;
                }
                j2 *= (long) i2;
                j3 *= (long) i3;
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j2)).divide(BigInteger.valueOf(j3));
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j2)).divide(BigInteger.valueOf(j3));
            j2 = i2;
            j3 = i3;
        }
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger x2) {
        return BigInteger.ZERO.setBit(log2(x2, RoundingMode.CEILING));
    }

    public static BigInteger divide(BigInteger p2, BigInteger q2, RoundingMode mode) {
        return new BigDecimal(p2).divide(new BigDecimal(q2), 0, mode).toBigIntegerExact();
    }

    public static BigInteger factorial(int n2) {
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        if (n2 < LongMath.factorials.length) {
            return BigInteger.valueOf(LongMath.factorials[n2]);
        }
        ArrayList arrayList = new ArrayList(IntMath.divide(IntMath.log2(n2, RoundingMode.CEILING) * n2, 64, RoundingMode.CEILING));
        int length = LongMath.factorials.length;
        long j2 = LongMath.factorials[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros;
        int iLog2 = LongMath.log2(j3, RoundingMode.FLOOR) + 1;
        long j4 = length;
        int iLog22 = LongMath.log2(j4, RoundingMode.FLOOR);
        int i2 = iLog22 + 1;
        int i3 = 1 << iLog22;
        while (j4 <= n2) {
            if ((j4 & ((long) i3)) != 0) {
                i3 <<= 1;
                i2++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j4);
            long j5 = j4 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i2 - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(BigInteger.valueOf(j3));
                j3 = 1;
            }
            j3 *= j5;
            iLog2 = LongMath.log2(j3, RoundingMode.FLOOR) + 1;
            j4++;
        }
        if (j3 > 1) {
            arrayList.add(BigInteger.valueOf(j3));
        }
        return listProduct(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    static boolean fitsInLong(BigInteger x2) {
        return x2.bitLength() <= 63;
    }

    public static BigInteger floorPowerOfTwo(BigInteger x2) {
        return BigInteger.ZERO.setBit(log2(x2, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger x2) {
        Preconditions.checkNotNull(x2);
        return x2.signum() > 0 && x2.getLowestSetBit() == x2.bitLength() - 1;
    }

    static BigInteger listProduct(List<BigInteger> nums) {
        return listProduct(nums, 0, nums.size());
    }

    static BigInteger listProduct(List<BigInteger> nums, int start, int end) {
        int i2 = end - start;
        if (i2 == 0) {
            return BigInteger.ONE;
        }
        if (i2 == 1) {
            return nums.get(start);
        }
        if (i2 == 2) {
            return nums.get(start).multiply(nums.get(start + 1));
        }
        if (i2 == 3) {
            return nums.get(start).multiply(nums.get(start + 1)).multiply(nums.get(start + 2));
        }
        int i3 = (end + start) >>> 1;
        return listProduct(nums, start, i3).multiply(listProduct(nums, i3, end));
    }

    public static int log10(BigInteger x2, RoundingMode mode) {
        MathPreconditions.checkPositive("x", x2);
        if (fitsInLong(x2)) {
            return LongMath.log10(x2.longValue(), mode);
        }
        int iLog2 = (int) ((((double) log2(x2, RoundingMode.FLOOR)) * LN_2) / LN_10);
        BigInteger bigIntegerPow = BigInteger.TEN.pow(iLog2);
        int iCompareTo = bigIntegerPow.compareTo(x2);
        if (iCompareTo > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(x2);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = BigInteger.TEN.multiply(bigIntegerPow);
            int iCompareTo2 = bigIntegerMultiply.compareTo(x2);
            while (iCompareTo2 <= 0) {
                iLog2++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
                iCompareTo = iCompareTo2;
                iCompareTo2 = bigIntegerMultiply2.compareTo(x2);
            }
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompareTo == 0);
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(x2) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return x2.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new AssertionError();
        }
    }

    public static int log2(BigInteger x2, RoundingMode mode) {
        MathPreconditions.checkPositive("x", (BigInteger) Preconditions.checkNotNull(x2));
        int iBitLength = x2.bitLength();
        int i2 = iBitLength - 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x2));
            case 2:
            case 3:
                return i2;
            case 4:
            case 5:
                return isPowerOfTwo(x2) ? i2 : iBitLength;
            case 6:
            case 7:
            case 8:
                return i2 < 256 ? x2.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - i2)) <= 0 ? i2 : iBitLength : x2.pow(2).bitLength() + (-1) < (i2 * 2) + 1 ? i2 : iBitLength;
            default:
                throw new AssertionError();
        }
    }

    public static double roundToDouble(BigInteger x2, RoundingMode mode) {
        return BigIntegerToDoubleRounder.INSTANCE.roundToDouble(x2, mode);
    }

    public static BigInteger sqrt(BigInteger x2, RoundingMode mode) {
        MathPreconditions.checkNonNegative("x", x2);
        if (fitsInLong(x2)) {
            return BigInteger.valueOf(LongMath.sqrt(x2.longValue(), mode));
        }
        BigInteger bigIntegerSqrtFloor = sqrtFloor(x2);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(bigIntegerSqrtFloor.pow(2).equals(x2));
            case 2:
            case 3:
                return bigIntegerSqrtFloor;
            case 4:
            case 5:
                int iIntValue = bigIntegerSqrtFloor.intValue();
                return (iIntValue * iIntValue == x2.intValue() && bigIntegerSqrtFloor.pow(2).equals(x2)) ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerSqrtFloor.pow(2).add(bigIntegerSqrtFloor).compareTo(x2) >= 0 ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    private static BigInteger sqrtApproxWithDoubles(BigInteger x2) {
        return DoubleMath.roundToBigInteger(Math.sqrt(DoubleUtils.bigToDouble(x2)), RoundingMode.HALF_EVEN);
    }

    private static BigInteger sqrtFloor(BigInteger x2) {
        BigInteger bigIntegerShiftLeft;
        int iLog2 = log2(x2, RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = sqrtApproxWithDoubles(x2);
        } else {
            int i2 = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = sqrtApproxWithDoubles(x2.shiftRight(i2)).shiftLeft(i2 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(x2.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(x2.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }
}

package com.google.common.math;

import com.braze.Constants;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class IntMath {
    static final int FLOOR_SQRT_MAX_INT = 46340;
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: com.google.common.math.IntMath$1 */
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

    private IntMath() {
    }

    public static int binomial(int n2, int k2) {
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        MathPreconditions.checkNonNegative("k", k2);
        int i2 = 0;
        Preconditions.checkArgument(k2 <= n2, "k (%s) > n (%s)", k2, n2);
        if (k2 > (n2 >> 1)) {
            k2 = n2 - k2;
        }
        int[] iArr = biggestBinomials;
        if (k2 >= iArr.length || n2 > iArr[k2]) {
            return Integer.MAX_VALUE;
        }
        if (k2 == 0) {
            return 1;
        }
        if (k2 == 1) {
            return n2;
        }
        long j2 = 1;
        while (i2 < k2) {
            long j3 = j2 * ((long) (n2 - i2));
            i2++;
            j2 = j3 / ((long) i2);
        }
        return (int) j2;
    }

    public static int ceilingPowerOfTwo(int x2) {
        MathPreconditions.checkPositive("x", x2);
        if (x2 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(x2 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x2 + ") not representable as an int");
    }

    public static int checkedAdd(int a2, int b2) {
        long j2 = ((long) a2) + ((long) b2);
        int i2 = (int) j2;
        MathPreconditions.checkNoOverflow(j2 == ((long) i2), "checkedAdd", a2, b2);
        return i2;
    }

    public static int checkedMultiply(int a2, int b2) {
        long j2 = ((long) a2) * ((long) b2);
        int i2 = (int) j2;
        MathPreconditions.checkNoOverflow(j2 == ((long) i2), "checkedMultiply", a2, b2);
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    public static int checkedPow(int b2, int k2) {
        MathPreconditions.checkNonNegative("exponent", k2);
        if (b2 == -2) {
            MathPreconditions.checkNoOverflow(k2 < 32, "checkedPow", b2, k2);
            return (-1) - (((-1) - k2) | ((-1) - 1)) == 0 ? 1 << k2 : (-1) << k2;
        }
        if (b2 == -1) {
            return (k2 & 1) == 0 ? 1 : -1;
        }
        if (b2 == 0) {
            return k2 == 0 ? 1 : 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            MathPreconditions.checkNoOverflow(k2 < 31, "checkedPow", b2, k2);
            return 1 << k2;
        }
        int iCheckedMultiply = 1;
        while (k2 != 0) {
            if (k2 == 1) {
                return checkedMultiply(iCheckedMultiply, b2);
            }
            if ((k2 + 1) - (1 | k2) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, b2);
            }
            k2 >>= 1;
            if (k2 > 0) {
                int i2 = -46340 <= b2 ? 1 : 0;
                int i3 = b2 <= FLOOR_SQRT_MAX_INT ? 1 : 0;
                MathPreconditions.checkNoOverflow((boolean) ((i2 + i3) - (i2 | i3)), "checkedPow", b2, k2);
                b2 *= b2;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int a2, int b2) {
        long j2 = ((long) a2) - ((long) b2);
        int i2 = (int) j2;
        MathPreconditions.checkNoOverflow(j2 == ((long) i2), "checkedSubtract", a2, b2);
        return i2;
    }

    public static int divide(int p2, int q2, RoundingMode mode) {
        Preconditions.checkNotNull(mode);
        if (q2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i2 = p2 / q2;
        int i3 = p2 - (q2 * i2);
        if (i3 == 0) {
            return i2;
        }
        int i4 = (-1) - (((-1) - ((p2 ^ q2) >> 31)) & ((-1) - 1));
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i3 == 0);
                return i2;
            case 2:
                return i2;
            case 3:
                if (i4 >= 0) {
                    return i2;
                }
                break;
            case 4:
                break;
            case 5:
                if (i4 <= 0) {
                    return i2;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i3);
                int iAbs2 = iAbs - (Math.abs(q2) - iAbs);
                if (iAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP) {
                        if (!((mode == RoundingMode.HALF_EVEN) & ((i2 + 1) - (1 | i2) != 0))) {
                            return i2;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i2;
                }
            default:
                throw new AssertionError();
        }
        return i2 + i4;
    }

    public static int factorial(int n2) {
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        int[] iArr = factorials;
        if (n2 < iArr.length) {
            return iArr[n2];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int x2) {
        MathPreconditions.checkPositive("x", x2);
        return Integer.highestOneBit(x2);
    }

    public static int gcd(int a2, int b2) {
        MathPreconditions.checkNonNegative("a", a2);
        MathPreconditions.checkNonNegative("b", b2);
        if (a2 == 0) {
            return b2;
        }
        if (b2 == 0) {
            return a2;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(a2);
        int iNumberOfTrailingZeros2 = a2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(b2);
        int i2 = b2 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i2) {
            int i3 = iNumberOfTrailingZeros2 - i2;
            int i4 = (-1) - (((-1) - (i3 >> 31)) | ((-1) - i3));
            int i5 = (i3 - i4) - i4;
            i2 += i4;
            iNumberOfTrailingZeros2 = i5 >> Integer.numberOfTrailingZeros(i5);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int x2) {
        return (x2 > 0) & ((x2 & (x2 + (-1))) == 0);
    }

    public static boolean isPrime(int n2) {
        return LongMath.isPrime(n2);
    }

    static int lessThanBranchFree(int x2, int y2) {
        return (~(~(x2 - y2))) >>> 31;
    }

    public static int log10(int x2, RoundingMode mode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", x2);
        int iLog10Floor = log10Floor(x2);
        int i2 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(x2 == i2);
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(i2, x2);
                return iLog10Floor + iLessThanBranchFree;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], x2);
                return iLog10Floor + iLessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    private static int log10Floor(int x2) {
        byte b2 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(x2)];
        return b2 - lessThanBranchFree(x2, powersOf10[b2]);
    }

    public static int log2(int x2, RoundingMode mode) {
        MathPreconditions.checkPositive("x", x2);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(x2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(x2);
                return (31 - iNumberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, x2);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(x2);
    }

    public static int mean(int x2, int y2) {
        return (x2 & y2) + ((x2 ^ y2) >> 1);
    }

    public static int mod(int x2, int m2) {
        if (m2 <= 0) {
            throw new ArithmeticException("Modulus " + m2 + " must be > 0");
        }
        int i2 = x2 % m2;
        return i2 >= 0 ? i2 : i2 + m2;
    }

    public static int pow(int b2, int k2) {
        MathPreconditions.checkNonNegative("exponent", k2);
        if (b2 == -2) {
            if (k2 < 32) {
                return (1 & k2) == 0 ? 1 << k2 : -(1 << k2);
            }
            return 0;
        }
        if (b2 == -1) {
            return (k2 + 1) - (k2 | 1) == 0 ? 1 : -1;
        }
        if (b2 == 0) {
            return k2 == 0 ? 1 : 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            if (k2 < 32) {
                return 1 << k2;
            }
            return 0;
        }
        int i2 = 1;
        while (k2 != 0) {
            if (k2 == 1) {
                return b2 * i2;
            }
            i2 *= (k2 + 1) - (1 | k2) == 0 ? 1 : b2;
            b2 *= b2;
            k2 >>= 1;
        }
        return i2;
    }

    public static int saturatedAdd(int a2, int b2) {
        return Ints.saturatedCast(((long) a2) + ((long) b2));
    }

    public static int saturatedMultiply(int a2, int b2) {
        return Ints.saturatedCast(((long) a2) * ((long) b2));
    }

    public static int saturatedPow(int b2, int k2) {
        MathPreconditions.checkNonNegative("exponent", k2);
        if (b2 == -2) {
            return k2 >= 32 ? (k2 & 1) + Integer.MAX_VALUE : (-1) - (((-1) - k2) | ((-1) - 1)) == 0 ? 1 << k2 : (-1) << k2;
        }
        if (b2 == -1) {
            return (k2 + 1) - (k2 | 1) == 0 ? 1 : -1;
        }
        if (b2 == 0) {
            return k2 == 0 ? 1 : 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            if (k2 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << k2;
        }
        int i2 = ((-1) - (((-1) - (b2 >>> 31)) | ((-1) - ((-1) - (((-1) - k2) | ((-1) - 1)))))) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (k2 != 0) {
            if (k2 == 1) {
                return saturatedMultiply(iSaturatedMultiply, b2);
            }
            if ((1 & k2) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, b2);
            }
            k2 >>= 1;
            if (k2 > 0) {
                if ((-46340 > b2) || (b2 > FLOOR_SQRT_MAX_INT)) {
                    return i2;
                }
                b2 *= b2;
            }
        }
        return iSaturatedMultiply;
    }

    public static int saturatedSubtract(int a2, int b2) {
        return Ints.saturatedCast(((long) a2) - ((long) b2));
    }

    public static int sqrt(int x2, RoundingMode mode) {
        int iLessThanBranchFree;
        MathPreconditions.checkNonNegative("x", x2);
        int iSqrtFloor = sqrtFloor(x2);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iSqrtFloor * iSqrtFloor == x2);
            case 2:
            case 3:
                return iSqrtFloor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(iSqrtFloor * iSqrtFloor, x2);
                return iSqrtFloor + iLessThanBranchFree;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree((iSqrtFloor * iSqrtFloor) + iSqrtFloor, x2);
                return iSqrtFloor + iLessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    private static int sqrtFloor(int x2) {
        return (int) Math.sqrt(x2);
    }
}

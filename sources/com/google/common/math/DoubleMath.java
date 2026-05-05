package com.google.common.math;

import com.braze.Constants;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class DoubleMath {
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
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
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    private static double checkFinite(double argument) {
        Preconditions.checkArgument(DoubleUtils.isFinite(argument));
        return argument;
    }

    public static double factorial(int n2) {
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        if (n2 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0d;
        for (int i2 = ((n2 - 16) - ((-16) | n2)) + 1; i2 <= n2; i2++) {
            d2 *= (double) i2;
        }
        return d2 * everySixteenthFactorial[n2 >> 4];
    }

    public static int fuzzyCompare(double a2, double b2, double tolerance) {
        if (fuzzyEquals(a2, b2, tolerance)) {
            return 0;
        }
        if (a2 < b2) {
            return -1;
        }
        if (a2 > b2) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(a2), Double.isNaN(b2));
    }

    public static boolean fuzzyEquals(double a2, double b2, double tolerance) {
        MathPreconditions.checkNonNegative("tolerance", tolerance);
        return Math.copySign(a2 - b2, 1.0d) <= tolerance || a2 == b2 || (Double.isNaN(a2) && Double.isNaN(b2));
    }

    public static boolean isMathematicalInteger(double x2) {
        return DoubleUtils.isFinite(x2) && (x2 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(x2)) <= Math.getExponent(x2));
    }

    public static boolean isPowerOfTwo(double x2) {
        if (x2 <= 0.0d || !DoubleUtils.isFinite(x2)) {
            return false;
        }
        long significand = DoubleUtils.getSignificand(x2);
        return (-1) - (((-1) - significand) | ((-1) - (significand - 1))) == 0;
    }

    public static double log2(double x2) {
        return Math.log(x2) / LN_2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int log2(double r8, java.math.RoundingMode r10) {
        /*
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r7 = 0
            r6 = 1
            if (r0 <= 0) goto L28
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r8)
            if (r0 == 0) goto L28
            r1 = r6
        Lf:
            java.lang.String r0 = "x must be positive and finite"
            com.google.common.base.Preconditions.checkArgument(r1, r0)
            int r5 = java.lang.Math.getExponent(r8)
            boolean r0 = com.google.common.math.DoubleUtils.isNormal(r8)
            if (r0 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r8 = r8 * r0
            int r0 = log2(r8, r10)
            int r0 = r0 + (-52)
            return r0
        L28:
            r1 = r7
            goto Lf
        L2a:
            int[] r1 = com.google.common.math.DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r0 = r10.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L3b;
                case 2: goto L68;
                case 3: goto L43;
                case 4: goto L4a;
                case 5: goto L52;
                case 6: goto L5c;
                case 7: goto L5c;
                case 8: goto L5c;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L3b:
            boolean r0 = isPowerOfTwo(r8)
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r0)
            goto L68
        L43:
            boolean r0 = isPowerOfTwo(r8)
            r7 = r0 ^ 1
            goto L68
        L4a:
            if (r5 >= 0) goto L4d
            r7 = r6
        L4d:
            boolean r0 = isPowerOfTwo(r8)
            goto L59
        L52:
            if (r5 < 0) goto L55
            r7 = r6
        L55:
            boolean r0 = isPowerOfTwo(r8)
        L59:
            r0 = r0 ^ r6
            r7 = r7 & r0
            goto L68
        L5c:
            double r3 = com.google.common.math.DoubleUtils.scaleNormalize(r8)
            double r3 = r3 * r3
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L68
            r7 = r6
        L68:
            if (r7 == 0) goto L6c
            int r5 = r5 + 1
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.DoubleMath.log2(double, java.math.RoundingMode):int");
    }

    @Deprecated
    public static double mean(Iterable<? extends Number> values) {
        return mean(values.iterator());
    }

    @Deprecated
    public static double mean(Iterator<? extends Number> values) {
        Preconditions.checkArgument(values.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values.next().doubleValue());
        long j2 = 1;
        while (values.hasNext()) {
            j2++;
            dCheckFinite += (checkFinite(values.next().doubleValue()) - dCheckFinite) / j2;
        }
        return dCheckFinite;
    }

    @Deprecated
    public static double mean(double... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values[0]);
        long j2 = 1;
        for (int i2 = 1; i2 < values.length; i2++) {
            checkFinite(values[i2]);
            j2++;
            dCheckFinite += (values[i2] - dCheckFinite) / j2;
        }
        return dCheckFinite;
    }

    @Deprecated
    public static double mean(int... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        long j2 = 0;
        for (int i2 : values) {
            j2 += (long) i2;
        }
        return j2 / ((double) values.length);
    }

    @Deprecated
    public static double mean(long... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double d2 = values[0];
        long j2 = 1;
        for (int i2 = 1; i2 < values.length; i2++) {
            j2++;
            d2 += (values[i2] - d2) / j2;
        }
        return d2;
    }

    static double roundIntermediate(double x2, RoundingMode mode) {
        if (!DoubleUtils.isFinite(x2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(x2));
                return x2;
            case 2:
                return (x2 >= 0.0d || isMathematicalInteger(x2)) ? x2 : ((long) x2) - 1;
            case 3:
                return (x2 <= 0.0d || isMathematicalInteger(x2)) ? x2 : ((long) x2) + 1;
            case 4:
                return x2;
            case 5:
                if (isMathematicalInteger(x2)) {
                    return x2;
                }
                return ((long) x2) + ((long) (x2 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(x2);
            case 7:
                double dRint = Math.rint(x2);
                return Math.abs(x2 - dRint) == 0.5d ? x2 + Math.copySign(0.5d, x2) : dRint;
            case 8:
                double dRint2 = Math.rint(x2);
                return Math.abs(x2 - dRint2) == 0.5d ? x2 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static BigInteger roundToBigInteger(double x2, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x2, mode);
        if ((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) && (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE)) {
            return BigInteger.valueOf((long) dRoundIntermediate);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(dRoundIntermediate)).shiftLeft(Math.getExponent(dRoundIntermediate) - 52);
        return dRoundIntermediate < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    public static int roundToInt(double x2, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x2, mode);
        MathPreconditions.checkInRangeForRoundingInputs((dRoundIntermediate > -2.147483649E9d) & (dRoundIntermediate < 2.147483648E9d), x2, mode);
        return (int) dRoundIntermediate;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static long roundToLong(double x2, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x2, mode);
        MathPreconditions.checkInRangeForRoundingInputs((-1) - (((-1) - (MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d ? 1 : 0)) | ((-1) - (dRoundIntermediate >= MAX_LONG_AS_DOUBLE_PLUS_ONE ? 0 : 1))), x2, mode);
        return (long) dRoundIntermediate;
    }
}

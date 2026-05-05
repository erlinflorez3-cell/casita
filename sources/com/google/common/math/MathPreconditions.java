package com.google.common.math;

import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class MathPreconditions {
    private MathPreconditions() {
    }

    static void checkInRangeForRoundingInputs(boolean condition, double input, RoundingMode mode) {
        if (!condition) {
            throw new ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
        }
    }

    static void checkNoOverflow(boolean condition, String methodName, int a2, int b2) {
        if (!condition) {
            throw new ArithmeticException("overflow: " + methodName + "(" + a2 + ", " + b2 + ")");
        }
    }

    static void checkNoOverflow(boolean condition, String methodName, long a2, long b2) {
        if (!condition) {
            throw new ArithmeticException("overflow: " + methodName + "(" + a2 + ", " + b2 + ")");
        }
    }

    static double checkNonNegative(String role, double x2) {
        if (x2 >= 0.0d) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be >= 0");
    }

    static int checkNonNegative(String role, int x2) {
        if (x2 >= 0) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be >= 0");
    }

    static long checkNonNegative(String role, long x2) {
        if (x2 >= 0) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be >= 0");
    }

    static BigInteger checkNonNegative(String role, BigInteger x2) {
        if (x2.signum() >= 0) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be >= 0");
    }

    static int checkPositive(String role, int x2) {
        if (x2 > 0) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be > 0");
    }

    static long checkPositive(String role, long x2) {
        if (x2 > 0) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be > 0");
    }

    static BigInteger checkPositive(String role, BigInteger x2) {
        if (x2.signum() > 0) {
            return x2;
        }
        throw new IllegalArgumentException(role + " (" + x2 + ") must be > 0");
    }

    static void checkRoundingUnnecessary(boolean condition) {
        if (!condition) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

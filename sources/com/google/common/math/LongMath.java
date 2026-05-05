package com.google.common.math;

import androidx.compose.animation.core.AnimationKt;
import com.braze.Constants;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import com.squareup.wire.internal.MathMethodsKt;
import cz.msebera.android.httpclient.HttpStatus;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class LongMath {
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;
    static final byte[] maxLog10ForLeadingZeros = {19, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 17, 17, 17, 16, 16, 16, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.VT, Ascii.VT, Ascii.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, AnimationKt.MillisToNanos, 10000000, 100000000, MathMethodsKt.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER};
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, OlympusCameraSettingsMakernoteDirectory.TagPictureModeSaturation, 684, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, Mp4VideoDirectory.TAG_FRAME_RATE, 169, 139, PanasonicMakernoteDirectory.TAG_BURST_SPEED, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
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

    private enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long a2, long b2, long m2) {
                return (a2 * b2) % m2;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long a2, long m2) {
                return (a2 * a2) % m2;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long a2, long b2, long m2) {
                long j2 = a2 + b2;
                return a2 >= m2 - b2 ? j2 - m2 : j2;
            }

            private long times2ToThe32Mod(long a2, long m2) {
                int i2 = 32;
                do {
                    int iMin = Math.min(i2, Long.numberOfLeadingZeros(a2));
                    a2 = UnsignedLongs.remainder(a2 << iMin, m2);
                    i2 -= iMin;
                } while (i2 > 0);
                return a2;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long a2, long b2, long m2) {
                long j2 = a2 >>> 32;
                long j3 = b2 >>> 32;
                long j4 = a2 & 4294967295L;
                long j5 = b2 & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j2 * j3, m2) + (j2 * j5);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.remainder(jTimes2ToThe32Mod, m2);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + (j3 * j4), m2), UnsignedLongs.remainder(j4 * j5, m2), m2);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long a2, long m2) {
                long j2 = a2 >>> 32;
                long j3 = (a2 + 4294967295L) - (a2 | 4294967295L);
                long jTimes2ToThe32Mod = times2ToThe32Mod(j2 * j2, m2);
                long jRemainder = j2 * j3 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, m2);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, m2), UnsignedLongs.remainder(j3 * j3, m2), m2);
            }
        };

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }

        private long powMod(long a2, long p2, long m2) {
            long jSquareMod = a2;
            long jMulMod = 1;
            while (p2 != 0) {
                if ((p2 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, m2);
                }
                jSquareMod = squareMod(jSquareMod, m2);
                p2 >>= 1;
            }
            return jMulMod;
        }

        static boolean test(long base, long n2) {
            return (n2 <= LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(base, n2);
        }

        private boolean testWitness(long base, long n2) {
            long j2 = n2 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
            long j3 = j2 >> iNumberOfTrailingZeros;
            long j4 = base % n2;
            if (j4 == 0) {
                return true;
            }
            long jPowMod = powMod(j4, j3, n2);
            if (jPowMod == 1) {
                return true;
            }
            int i2 = 0;
            while (jPowMod != j2) {
                i2++;
                if (i2 == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, n2);
            }
            return true;
        }

        abstract long mulMod(long a2, long b2, long m2);

        abstract long squareMod(long a2, long m2);
    }

    private LongMath() {
    }

    public static long binomial(int n2, int k2) {
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        MathPreconditions.checkNonNegative("k", k2);
        Preconditions.checkArgument(k2 <= n2, "k (%s) > n (%s)", k2, n2);
        if (k2 > (n2 >> 1)) {
            k2 = n2 - k2;
        }
        long jMultiplyFraction = 1;
        if (k2 == 0) {
            return 1L;
        }
        if (k2 == 1) {
            return n2;
        }
        long[] jArr = factorials;
        if (n2 < jArr.length) {
            return jArr[n2] / (jArr[k2] * jArr[n2 - k2]);
        }
        int[] iArr = biggestBinomials;
        if (k2 >= iArr.length || n2 > iArr[k2]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        int i2 = 2;
        if (k2 < iArr2.length && n2 <= iArr2[k2]) {
            int i3 = n2 - 1;
            long j2 = n2;
            while (i2 <= k2) {
                j2 = (j2 * ((long) i3)) / ((long) i2);
                i3--;
                i2++;
            }
            return j2;
        }
        long j3 = n2;
        int iLog2 = log2(j3, RoundingMode.CEILING);
        int i4 = n2 - 1;
        int i5 = iLog2;
        long j4 = 1;
        while (i2 <= k2) {
            i5 += iLog2;
            if (i5 < 63) {
                j3 *= (long) i4;
                j4 *= (long) i2;
            } else {
                jMultiplyFraction = multiplyFraction(jMultiplyFraction, j3, j4);
                j3 = i4;
                j4 = i2;
                i5 = iLog2;
            }
            i2++;
            i4--;
        }
        return multiplyFraction(jMultiplyFraction, j3, j4);
    }

    public static long ceilingPowerOfTwo(long x2) {
        MathPreconditions.checkPositive("x", x2);
        if (x2 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(x2 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x2 + ") is not representable as a long");
    }

    public static long checkedAdd(long a2, long b2) {
        long j2 = a2 + b2;
        MathPreconditions.checkNoOverflow(((a2 ^ b2) < 0) | ((a2 ^ j2) >= 0), "checkedAdd", a2, b2);
        return j2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    public static long checkedMultiply(long a2, long b2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a2) + Long.numberOfLeadingZeros(~a2) + Long.numberOfLeadingZeros(b2) + Long.numberOfLeadingZeros(~b2);
        if (iNumberOfLeadingZeros > 65) {
            return a2 * b2;
        }
        boolean z2 = true;
        MathPreconditions.checkNoOverflow(iNumberOfLeadingZeros >= 64, "checkedMultiply", a2, b2);
        MathPreconditions.checkNoOverflow((boolean) ((-1) - (((-1) - (a2 >= 0 ? 1 : 0)) & ((-1) - (b2 != Long.MIN_VALUE ? 1 : 0)))), "checkedMultiply", a2, b2);
        long j2 = a2 * b2;
        if (a2 != 0 && j2 / a2 != b2) {
            z2 = false;
        }
        MathPreconditions.checkNoOverflow(z2, "checkedMultiply", a2, b2);
        return j2;
    }

    public static long checkedPow(long b2, int k2) {
        long j2 = b2;
        int i2 = k2;
        MathPreconditions.checkNonNegative("exponent", i2);
        long jCheckedMultiply = 1;
        if (!(j2 >= -2) || !(j2 <= 2)) {
            while (i2 != 0) {
                if (i2 == 1) {
                    return checkedMultiply(jCheckedMultiply, j2);
                }
                if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j2);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j2 && j2 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j2, i2);
                    j2 *= j2;
                }
            }
            return jCheckedMultiply;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            MathPreconditions.checkNoOverflow(i2 < 64, "checkedPow", j2, i2);
            return (-1) - (((-1) - i2) | ((-1) - 1)) == 0 ? 1 << i2 : (-1) << i2;
        }
        if (i3 == -1) {
            return (-1) - (((-1) - i2) | ((-1) - 1)) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.checkNoOverflow(i2 < 63, "checkedPow", j2, i2);
        return 1 << i2;
    }

    public static long checkedSubtract(long a2, long b2) {
        long j2 = a2 - b2;
        MathPreconditions.checkNoOverflow(((a2 ^ b2) >= 0) | ((a2 ^ j2) >= 0), "checkedSubtract", a2, b2);
        return j2;
    }

    public static long divide(long p2, long q2, RoundingMode mode) {
        Preconditions.checkNotNull(mode);
        long j2 = p2 / q2;
        long j3 = p2 - (q2 * j2);
        if (j3 == 0) {
            return j2;
        }
        int i2 = (-1) - (((-1) - ((int) ((p2 ^ q2) >> 63))) & ((-1) - 1));
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j3 == 0);
                return j2;
            case 2:
                return j2;
            case 3:
                if (i2 >= 0) {
                    return j2;
                }
                break;
            case 4:
                break;
            case 5:
                if (i2 <= 0) {
                    return j2;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j3);
                long jAbs2 = jAbs - (Math.abs(q2) - jAbs);
                if (jAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP && (mode != RoundingMode.HALF_EVEN || (1 & j2) == 0)) {
                        return j2;
                    }
                } else if (jAbs2 <= 0) {
                    return j2;
                }
            default:
                throw new AssertionError();
        }
        return j2 + ((long) i2);
    }

    public static long factorial(int n2) {
        MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
        long[] jArr = factorials;
        if (n2 < jArr.length) {
            return jArr[n2];
        }
        return Long.MAX_VALUE;
    }

    static boolean fitsInInt(long x2) {
        return ((long) ((int) x2)) == x2;
    }

    public static long floorPowerOfTwo(long x2) {
        MathPreconditions.checkPositive("x", x2);
        return 1 << (63 - Long.numberOfLeadingZeros(x2));
    }

    public static long gcd(long a2, long b2) {
        MathPreconditions.checkNonNegative("a", a2);
        MathPreconditions.checkNonNegative("b", b2);
        if (a2 == 0) {
            return b2;
        }
        if (b2 == 0) {
            return a2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(a2);
        long jNumberOfTrailingZeros = a2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(b2);
        long j2 = b2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j2) {
            long j3 = jNumberOfTrailingZeros - j2;
            long j4 = j3 >> 63;
            long j5 = (j4 + j3) - (j4 | j3);
            long j6 = (j3 - j5) - j5;
            j2 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long x2) {
        return (x2 > 0) & ((-1) - (((-1) - x2) | ((-1) - (x2 - 1))) == 0);
    }

    public static boolean isPrime(long n2) {
        if (n2 < 2) {
            MathPreconditions.checkNonNegative(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, n2);
            return false;
        }
        if (n2 < 66) {
            long j2 = 722865708377213483 >> (((int) n2) - 2);
            return (j2 + 1) - (j2 | 1) != 0;
        }
        if (((1 << ((int) (n2 % 30))) & SIEVE_30) != 0 || n2 % 7 == 0 || n2 % 11 == 0 || n2 % 13 == 0) {
            return false;
        }
        if (n2 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (n2 <= jArr[0]) {
                for (int i2 = 1; i2 < jArr.length; i2++) {
                    if (!MillerRabinTester.test(jArr[i2], n2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    static int lessThanBranchFree(long x2, long y2) {
        return (int) ((~(~(x2 - y2))) >>> 63);
    }

    public static int log10(long x2, RoundingMode mode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", x2);
        int iLog10Floor = log10Floor(x2);
        long j2 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(x2 == j2);
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(j2, x2);
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

    static int log10Floor(long x2) {
        byte b2 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(x2)];
        return b2 - lessThanBranchFree(x2, powersOf10[b2]);
    }

    public static int log2(long x2, RoundingMode mode) {
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
                return 64 - Long.numberOfLeadingZeros(x2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(x2);
                return (63 - iNumberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, x2);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(x2);
    }

    public static long mean(long x2, long y2) {
        return ((x2 + y2) - (x2 | y2)) + ((x2 ^ y2) >> 1);
    }

    public static int mod(long x2, int m2) {
        return (int) mod(x2, m2);
    }

    public static long mod(long x2, long m2) {
        if (m2 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j2 = x2 % m2;
        return j2 >= 0 ? j2 : j2 + m2;
    }

    static long multiplyFraction(long x2, long numerator, long denominator) {
        if (x2 == 1) {
            return numerator / denominator;
        }
        long jGcd = gcd(x2, denominator);
        return (x2 / jGcd) * (numerator / (denominator / jGcd));
    }

    public static long pow(long b2, int k2) {
        MathPreconditions.checkNonNegative("exponent", k2);
        if (-2 > b2 || b2 > 2) {
            long j2 = 1;
            while (k2 != 0) {
                if (k2 == 1) {
                    return j2 * b2;
                }
                j2 *= (1 & k2) == 0 ? 1L : b2;
                b2 *= b2;
                k2 >>= 1;
            }
            return j2;
        }
        int i2 = (int) b2;
        if (i2 == -2) {
            if (k2 < 64) {
                return (1 & k2) == 0 ? 1 << k2 : -(1 << k2);
            }
            return 0L;
        }
        if (i2 == -1) {
            return (k2 + 1) - (k2 | 1) == 0 ? 1L : -1L;
        }
        if (i2 == 0) {
            return k2 == 0 ? 1L : 0L;
        }
        if (i2 == 1) {
            return 1L;
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        if (k2 < 64) {
            return 1 << k2;
        }
        return 0L;
    }

    public static double roundToDouble(long x2, RoundingMode mode) {
        long jCeil;
        double dNextUp;
        double d2 = x2;
        long jFloor = (long) d2;
        int iCompare = jFloor == Long.MAX_VALUE ? -1 : Longs.compare(x2, jFloor);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompare == 0);
                return d2;
            case 2:
                return x2 >= 0 ? iCompare >= 0 ? d2 : DoubleUtils.nextDown(d2) : iCompare <= 0 ? d2 : Math.nextUp(d2);
            case 3:
                return iCompare >= 0 ? d2 : DoubleUtils.nextDown(d2);
            case 4:
                return x2 >= 0 ? iCompare <= 0 ? d2 : Math.nextUp(d2) : iCompare >= 0 ? d2 : DoubleUtils.nextDown(d2);
            case 5:
                return iCompare <= 0 ? d2 : Math.nextUp(d2);
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d2);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dNextDown = DoubleUtils.nextDown(d2);
                    jCeil = jFloor;
                    jFloor = (long) Math.floor(dNextDown);
                    dNextUp = d2;
                    d2 = dNextDown;
                }
                long j2 = x2 - jFloor;
                long j3 = jCeil - x2;
                if (jCeil == Long.MAX_VALUE) {
                    j3++;
                }
                int iCompare2 = Longs.compare(j2, j3);
                if (iCompare2 < 0) {
                    return d2;
                }
                if (iCompare2 > 0) {
                    return dNextUp;
                }
                int i2 = AnonymousClass1.$SwitchMap$java$math$RoundingMode[mode.ordinal()];
                if (i2 == 6) {
                    return x2 >= 0 ? d2 : dNextUp;
                }
                if (i2 == 7) {
                    return x2 >= 0 ? dNextUp : d2;
                }
                if (i2 == 8) {
                    return (-1) - (((-1) - DoubleUtils.getSignificand(d2)) | ((-1) - 1)) == 0 ? d2 : dNextUp;
                }
                throw new AssertionError("impossible");
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long a2, long b2) {
        long j2 = a2 + b2;
        return (((b2 ^ a2) > 0L ? 1 : ((b2 ^ a2) == 0L ? 0 : -1)) < 0) | ((a2 ^ j2) >= 0) ? j2 : ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long a2, long b2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a2) + Long.numberOfLeadingZeros(~a2) + Long.numberOfLeadingZeros(b2) + Long.numberOfLeadingZeros(~b2);
        if (iNumberOfLeadingZeros > 65) {
            return a2 * b2;
        }
        long j2 = ((a2 ^ b2) >>> 63) + Long.MAX_VALUE;
        if (((iNumberOfLeadingZeros < 64 ? 1 : 0) | ((-1) - (((-1) - (b2 != Long.MIN_VALUE ? 0 : 1)) | ((-1) - (a2 < 0 ? 1 : 0))))) != 0) {
            return j2;
        }
        long j3 = a2 * b2;
        return (a2 == 0 || j3 / a2 == b2) ? j3 : j2;
    }

    public static long saturatedPow(long b2, int k2) {
        long j2 = b2;
        int i2 = k2;
        MathPreconditions.checkNonNegative("exponent", i2);
        long jSaturatedMultiply = 1;
        if ((-1) - (((-1) - (j2 >= -2 ? 1 : 0)) | ((-1) - (j2 <= 2 ? 1 : 0))) == 0) {
            long j3 = ((-1) - (((-1) - (j2 >>> 63)) | ((-1) - ((long) ((i2 + 1) - (1 | i2)))))) + Long.MAX_VALUE;
            while (i2 != 0) {
                if (i2 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j2);
                }
                if ((1 & i2) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j2);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    if ((-3037000499L > j2) || (j2 > FLOOR_SQRT_MAX_LONG)) {
                        return j3;
                    }
                    j2 *= j2;
                }
            }
            return jSaturatedMultiply;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            return i2 >= 64 ? ((long) (i2 & 1)) + Long.MAX_VALUE : (1 & i2) == 0 ? 1 << i2 : (-1) << i2;
        }
        if (i3 == -1) {
            return (-1) - (((-1) - i2) | ((-1) - 1)) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        if (i2 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i2;
    }

    public static long saturatedSubtract(long a2, long b2) {
        long j2 = a2 - b2;
        return (-1) - (((-1) - (((b2 ^ a2) > 0L ? 1 : ((b2 ^ a2) == 0L ? 0 : -1)) >= 0 ? 1 : 0)) & ((-1) - ((a2 ^ j2) < 0 ? 0 : 1))) != 0 ? j2 : ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long sqrt(long j2, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j2);
        if (fitsInInt(j2)) {
            return IntMath.sqrt((int) j2, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j2);
        long j3 = jSqrt * jSqrt;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j3 == j2);
                return jSqrt;
            case 2:
            case 3:
                return j2 < j3 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j2 > j3 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j4 = jSqrt - ((long) (j2 >= j3 ? 0 : 1));
                return j4 + ((long) lessThanBranchFree((j4 * j4) + j4, j2));
            default:
                throw new AssertionError();
        }
    }
}

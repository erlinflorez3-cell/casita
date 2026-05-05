package com.google.common.primitives;

import com.dynatrace.android.agent.AdkSettings;
import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] left, long[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                long j2 = left[i2];
                long j3 = right[i2];
                if (j2 != j3) {
                    return UnsignedLongs.compare(j2, j3);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    private static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i2 = 2; i2 <= 36; i2++) {
                long j2 = i2;
                maxValueDivs[i2] = UnsignedLongs.divide(-1L, j2);
                maxValueMods[i2] = (int) UnsignedLongs.remainder(-1L, j2);
                maxSafeDigits[i2] = bigInteger.toString(i2).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }

        static boolean overflowInParse(long current, int digit, int radix) {
            if (current < 0) {
                return true;
            }
            long j2 = maxValueDivs[radix];
            if (current < j2) {
                return false;
            }
            return current > j2 || digit > maxValueMods[radix];
        }
    }

    private UnsignedLongs() {
    }

    public static int compare(long a2, long b2) {
        return Longs.compare(flip(a2), flip(b2));
    }

    public static long decode(String stringValue) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(stringValue);
        try {
            return parseUnsignedLong(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    public static long divide(long dividend, long divisor) {
        if (divisor < 0) {
            return compare(dividend, divisor) < 0 ? 0L : 1L;
        }
        if (dividend >= 0) {
            return dividend / divisor;
        }
        long j2 = ((dividend >>> 1) / divisor) << 1;
        return j2 + ((long) (compare(dividend - (j2 * divisor), divisor) < 0 ? 0 : 1));
    }

    private static long flip(long a2) {
        return a2 ^ Long.MIN_VALUE;
    }

    public static String join(String separator, long... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append(toString(array[0]));
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append(toString(array[i2]));
        }
        return sb.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long jFlip = flip(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            long jFlip2 = flip(array[i2]);
            if (jFlip2 > jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long min(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long jFlip = flip(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            long jFlip2 = flip(array[i2]);
            if (jFlip2 < jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long parseUnsignedLong(String string) {
        return parseUnsignedLong(string, 10);
    }

    public static long parseUnsignedLong(String string, int radix) {
        Preconditions.checkNotNull(string);
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (radix < 2 || radix > 36) {
            throw new NumberFormatException("illegal radix: " + radix);
        }
        int i2 = ParseOverflowDetection.maxSafeDigits[radix] - 1;
        long j2 = 0;
        for (int i3 = 0; i3 < string.length(); i3++) {
            int iDigit = Character.digit(string.charAt(i3), radix);
            if (iDigit == -1) {
                throw new NumberFormatException(string);
            }
            if (i3 > i2 && ParseOverflowDetection.overflowInParse(j2, iDigit, radix)) {
                throw new NumberFormatException("Too large for unsigned long: " + string);
            }
            j2 = (j2 * ((long) radix)) + ((long) iDigit);
        }
        return j2;
    }

    public static long remainder(long dividend, long divisor) {
        if (divisor < 0) {
            return compare(dividend, divisor) < 0 ? dividend : dividend - divisor;
        }
        if (dividend >= 0) {
            return dividend % divisor;
        }
        long j2 = dividend - ((((dividend >>> 1) / divisor) << 1) * divisor);
        if (compare(j2, divisor) < 0) {
            divisor = 0;
        }
        return j2 - divisor;
    }

    public static void sort(long[] array) {
        Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = fromIndex; i2 < toIndex; i2++) {
            array[i2] = flip(array[i2]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = flip(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void sortDescending(long[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = fromIndex; i2 < toIndex; i2++) {
            array[i2] = Long.MAX_VALUE ^ array[i2];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Long.MAX_VALUE;
            fromIndex++;
        }
    }

    public static String toString(long x2) {
        return toString(x2, 10);
    }

    public static String toString(long x2, int radix) {
        Preconditions.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        if (x2 == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (x2 > 0) {
            return Long.toString(x2, radix);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = radix - 1;
        if ((radix + i3) - (radix | i3) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(radix);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) x2) & i3, radix);
                x2 >>>= iNumberOfTrailingZeros;
            } while (x2 != 0);
        } else {
            long jDivide = (1 & radix) == 0 ? (x2 >>> 1) / ((long) (radix >>> 1)) : divide(x2, radix);
            long j2 = radix;
            i2 = 63;
            cArr[63] = Character.forDigit((int) (x2 - (jDivide * j2)), radix);
            while (jDivide > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (jDivide % j2), radix);
                jDivide /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}

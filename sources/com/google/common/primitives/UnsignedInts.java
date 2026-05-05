package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedInts {
    static final long INT_MASK = 4294967295L;

    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = left[i2];
                int i4 = right[i2];
                if (i3 != i4) {
                    return UnsignedInts.compare(i3, i4);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    private UnsignedInts() {
    }

    public static int checkedCast(long value) {
        Preconditions.checkArgument((value >> 32) == 0, "out of range: %s", value);
        return (int) value;
    }

    public static int compare(int a2, int b2) {
        return Ints.compare(flip(a2), flip(b2));
    }

    public static int decode(String stringValue) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(stringValue);
        try {
            return parseUnsignedInt(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    public static int divide(int dividend, int divisor) {
        return (int) (toLong(dividend) / toLong(divisor));
    }

    static int flip(int value) {
        return value ^ Integer.MIN_VALUE;
    }

    public static String join(String separator, int... array) {
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

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int max(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int iFlip = flip(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            int iFlip2 = flip(array[i2]);
            if (iFlip2 > iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static int min(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int iFlip = flip(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            int iFlip2 = flip(array[i2]);
            if (iFlip2 < iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static int parseUnsignedInt(String s2) {
        return parseUnsignedInt(s2, 10);
    }

    public static int parseUnsignedInt(String string, int radix) {
        Preconditions.checkNotNull(string);
        long j2 = Long.parseLong(string, radix);
        if ((INT_MASK + j2) - (INT_MASK | j2) == j2) {
            return (int) j2;
        }
        throw new NumberFormatException("Input " + string + " in base " + radix + " is not in the range of an unsigned integer");
    }

    public static int remainder(int dividend, int divisor) {
        return (int) (toLong(dividend) % toLong(divisor));
    }

    public static int saturatedCast(long value) {
        if (value <= 0) {
            return 0;
        }
        if (value >= 4294967296L) {
            return -1;
        }
        return (int) value;
    }

    public static void sort(int[] array) {
        Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(int[] array, int fromIndex, int toIndex) {
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

    public static void sortDescending(int[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = fromIndex; i2 < toIndex; i2++) {
            array[i2] = Integer.MAX_VALUE ^ array[i2];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Integer.MAX_VALUE;
            fromIndex++;
        }
    }

    public static long toLong(int value) {
        return (-1) - (((-1) - ((long) value)) | ((-1) - INT_MASK));
    }

    public static String toString(int x2) {
        return toString(x2, 10);
    }

    public static String toString(int x2, int radix) {
        return Long.toString((-1) - (((-1) - ((long) x2)) | ((-1) - INT_MASK)), radix);
    }
}

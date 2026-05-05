package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    private enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] left, byte[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = SignedBytes.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long value) {
        byte b2 = (byte) value;
        Preconditions.checkArgument(((long) b2) == value, "Out of range: %s", value);
        return b2;
    }

    public static int compare(byte a2, byte b2) {
        return a2 - b2;
    }

    public static String join(String separator, byte... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append((int) array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append((int) array[i2]);
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte max(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        byte b2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            byte b3 = array[i2];
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public static byte min(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        byte b2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            byte b3 = array[i2];
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public static byte saturatedCast(long value) {
        if (value > 127) {
            return (byte) 127;
        }
        if (value < -128) {
            return (byte) -128;
        }
        return (byte) value;
    }

    public static void sortDescending(byte[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        Bytes.reverse(array, fromIndex, toIndex);
    }
}

package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < 10; i2++) {
                bArr[i2 + 48] = (byte) i2;
            }
            for (int i3 = 0; i3 < 26; i3++) {
                byte b2 = (byte) (i3 + 10);
                bArr[i3 + 65] = b2;
                bArr[i3 + 97] = b2;
            }
            asciiDigits = bArr;
        }

        private AsciiDigits() {
        }

        static int digit(char c2) {
            if (c2 < 128) {
                return asciiDigits[c2];
            }
            return -1;
        }
    }

    private enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] left, long[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Longs.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    private static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        LongArrayAsList(long[] array) {
            this(array, 0, array.length);
        }

        LongArrayAsList(long[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Long) && Longs.indexOf(this.array, ((Long) target).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof LongArrayAsList)) {
                return super.equals(object);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) object;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != longArrayAsList.array[longArrayAsList.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Long.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i2]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Long) || (iIndexOf = Longs.indexOf(this.array, ((Long) target).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int iLastIndexOf;
            if (!(target instanceof Long) || (iLastIndexOf = Longs.lastIndexOf(this.array, ((Long) target).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int index, Long element) {
            Preconditions.checkElementIndex(index, size());
            long[] jArr = this.array;
            int i2 = this.start;
            long j2 = jArr[i2 + index];
            jArr[i2 + index] = ((Long) Preconditions.checkNotNull(element)).longValue();
            return Long.valueOf(j2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i2 = this.start;
            return new LongArrayAsList(jArr, fromIndex + i2, i2 + toIndex);
        }

        long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.array[this.start]);
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    return sb.append(AbstractJsonLexerKt.END_LIST).toString();
                }
                sb.append(", ").append(this.array[i2]);
            }
        }
    }

    private static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Long value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Long doForward(String value) {
            return Long.decode(value);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    private Longs() {
    }

    public static List<Long> asList(long... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new LongArrayAsList(backingArray);
    }

    private static int checkNoOverflow(long result) {
        int i2 = (int) result;
        Preconditions.checkArgument(result == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i2;
    }

    public static int compare(long a2, long b2) {
        if (a2 < b2) {
            return -1;
        }
        return a2 > b2 ? 1 : 0;
    }

    public static long[] concat(long[]... arrays) {
        long length = 0;
        for (long[] jArr : arrays) {
            length += (long) jArr.length;
        }
        long[] jArr2 = new long[checkNoOverflow(length)];
        int length2 = 0;
        for (long[] jArr3 : arrays) {
            System.arraycopy(jArr3, 0, jArr2, length2, jArr3.length);
            length2 += jArr3.length;
        }
        return jArr2;
    }

    public static long constrainToRange(long value, long min, long max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean contains(long[] array, long target) {
        for (long j2 : array) {
            if (j2 == target) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static long fromByteArray(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 8, "array too small: %s < %s", bytes.length, 8);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7]);
    }

    public static long fromBytes(byte b12, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        long j2 = b12;
        long j3 = ((j2 + 255) - (j2 | 255)) << 56;
        long j4 = (((long) b2) & 255) << 48;
        long j5 = (j4 + j3) - (j4 & j3);
        long j6 = b3;
        long j7 = ((j6 + 255) - (j6 | 255)) << 40;
        long j8 = (-1) - (((-1) - ((((j5 + j7) - (j5 & j7)) | (((-1) - (((-1) - ((long) b4)) | ((-1) - 255))) << 32)) | (((-1) - (((-1) - ((long) b5)) | ((-1) - 255))) << 24))) & ((-1) - ((((long) b6) & 255) << 16)));
        long j9 = ((-1) - (((-1) - ((long) b7)) | ((-1) - 255))) << 8;
        long j10 = (j8 + j9) - (j8 & j9);
        long j11 = ((long) b8) & 255;
        return (j10 + j11) - (j10 & j11);
    }

    public static int hashCode(long value) {
        return (int) (value ^ (value >>> 32));
    }

    public static int indexOf(long[] array, long target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] array, long target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(long[] r8, long[] r9) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            int r0 = r9.length
            r7 = 0
            if (r0 != 0) goto Lf
            return r7
        Lf:
            r6 = r7
        L10:
            int r1 = r8.length
            int r0 = r9.length
            int r1 = r1 - r0
            int r0 = r1 + 1
            if (r6 >= r0) goto L2c
            r5 = r7
        L18:
            int r0 = r9.length
            if (r5 >= r0) goto L2b
            int r0 = r6 + r5
            r3 = r8[r0]
            r1 = r9[r5]
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            int r6 = r6 + 1
            goto L10
        L28:
            int r5 = r5 + 1
            goto L18
        L2b:
            return r6
        L2c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Longs.indexOf(long[], long[]):int");
    }

    public static String join(String separator, long... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 10);
        sb.append(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append(array[i2]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(long[] array, long target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] array, long target, int start, int end) {
        for (int i2 = end - 1; i2 >= start; i2--) {
            if (array[i2] == target) {
                return i2;
            }
        }
        return -1;
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long j2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            long j3 = array[i2];
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static long min(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long j2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            long j3 = array[i2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static void reverse(long[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = toIndex - 1; fromIndex < i2; i2--) {
            long j2 = array[fromIndex];
            array[fromIndex] = array[i2];
            array[i2] = j2;
            fromIndex++;
        }
    }

    public static void rotate(long[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(long[] array, int distance, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i2 = toIndex - fromIndex;
        int i3 = (-distance) % i2;
        if (i3 < 0) {
            i3 += i2;
        }
        int i4 = i3 + fromIndex;
        if (i4 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i4);
        reverse(array, i4, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static void sortDescending(long[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = ((Number) Preconditions.checkNotNull(array[i2])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long value) {
        byte[] bArr = new byte[8];
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i2] = (byte) (255 & value);
            value >>= 8;
        }
        return bArr;
    }

    @CheckForNull
    public static Long tryParse(String string) {
        return tryParse(string, 10);
    }

    @CheckForNull
    public static Long tryParse(String string, int radix) {
        if (((String) Preconditions.checkNotNull(string)).isEmpty()) {
            return null;
        }
        if (radix < 2 || radix > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + radix);
        }
        int i2 = string.charAt(0) == '-' ? 1 : 0;
        if (i2 == string.length()) {
            return null;
        }
        int i3 = i2 + 1;
        int iDigit = AsciiDigits.digit(string.charAt(i2));
        if (iDigit < 0 || iDigit >= radix) {
            return null;
        }
        long j2 = -iDigit;
        long j3 = radix;
        long j4 = Long.MIN_VALUE / j3;
        while (i3 < string.length()) {
            int i4 = i3 + 1;
            int iDigit2 = AsciiDigits.digit(string.charAt(i3));
            if (iDigit2 < 0 || iDigit2 >= radix || j2 < j4) {
                return null;
            }
            long j5 = j2 * j3;
            long j6 = iDigit2;
            if (j5 < j6 - Long.MIN_VALUE) {
                return null;
            }
            j2 = j5 - j6;
            i3 = i4;
        }
        if (i2 != 0) {
            return Long.valueOf(j2);
        }
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j2);
    }
}

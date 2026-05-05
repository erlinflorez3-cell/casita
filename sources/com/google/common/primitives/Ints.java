package com.google.common.primitives;

import com.google.common.base.Ascii;
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
public final class Ints extends IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    private static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        IntArrayAsList(int[] array) {
            this(array, 0, array.length);
        }

        IntArrayAsList(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Integer) && Ints.indexOf(this.array, ((Integer) target).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof IntArrayAsList)) {
                return super.equals(object);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) object;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != intArrayAsList.array[intArrayAsList.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Integer.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iHashCode = (iHashCode * 31) + Ints.hashCode(this.array[i2]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Integer) || (iIndexOf = Ints.indexOf(this.array, ((Integer) target).intValue(), this.start, this.end)) < 0) {
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
            if (!(target instanceof Integer) || (iLastIndexOf = Ints.lastIndexOf(this.array, ((Integer) target).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int index, Integer element) {
            Preconditions.checkElementIndex(index, size());
            int[] iArr = this.array;
            int i2 = this.start;
            int i3 = iArr[i2 + index];
            iArr[i2 + index] = ((Integer) Preconditions.checkNotNull(element)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i2 = this.start;
            return new IntArrayAsList(iArr, fromIndex + i2, i2 + toIndex);
        }

        int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

    private static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Integer value) {
            return value.toString();
        }

        @Override // com.google.common.base.Converter
        public Integer doForward(String value) {
            return Integer.decode(value);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    private enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Ints.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    private Ints() {
    }

    public static List<Integer> asList(int... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new IntArrayAsList(backingArray);
    }

    public static int checkedCast(long value) {
        int i2 = (int) value;
        Preconditions.checkArgument(((long) i2) == value, "Out of range: %s", value);
        return i2;
    }

    public static int compare(int a2, int b2) {
        if (a2 < b2) {
            return -1;
        }
        return a2 > b2 ? 1 : 0;
    }

    public static int[] concat(int[]... arrays) {
        int length = 0;
        for (int[] iArr : arrays) {
            length += iArr.length;
        }
        int[] iArr2 = new int[length];
        int length2 = 0;
        for (int[] iArr3 : arrays) {
            System.arraycopy(iArr3, 0, iArr2, length2, iArr3.length);
            length2 += iArr3.length;
        }
        return iArr2;
    }

    public static int constrainToRange(int value, int min, int max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean contains(int[] array, int target) {
        for (int i2 : array) {
            if (i2 == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] ensureCapacity(int[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int fromByteArray(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 4, "array too small: %s < %s", bytes.length, 4);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3]);
    }

    public static int fromBytes(byte b12, byte b2, byte b3, byte b4) {
        int i2 = b12 << Ascii.CAN;
        int i3 = ((-1) - (((-1) - b2) | ((-1) - 255))) << 16;
        return (-1) - (((-1) - (((i2 + i3) - (i2 & i3)) | (((b3 + 255) - (b3 | 255)) << 8))) & ((-1) - ((b4 + 255) - (b4 | 255))));
    }

    public static int hashCode(int value) {
        return value;
    }

    public static int indexOf(int[] array, int target) {
        return indexOf(array, target, 0, array.length);
    }

    public static int indexOf(int[] array, int target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0023, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(int[] r5, int[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r4 = 0
            if (r0 != 0) goto Lf
            return r4
        Lf:
            r3 = r4
        L10:
            int r1 = r5.length
            int r0 = r6.length
            int r1 = r1 - r0
            int r0 = r1 + 1
            if (r3 >= r0) goto L2a
            r2 = r4
        L18:
            int r0 = r6.length
            if (r2 >= r0) goto L29
            int r0 = r3 + r2
            r1 = r5[r0]
            r0 = r6[r2]
            if (r1 == r0) goto L26
            int r3 = r3 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r3
        L2a:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Ints.indexOf(int[], int[]):int");
    }

    public static String join(String separator, int... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append(array[i2]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(int[] array, int target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static int lastIndexOf(int[] array, int target, int start, int end) {
        for (int i2 = end - 1; i2 >= start; i2--) {
            if (array[i2] == target) {
                return i2;
            }
        }
        return -1;
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int max(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int i2 = array[0];
        for (int i3 = 1; i3 < array.length; i3++) {
            int i4 = array[i3];
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public static int min(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int i2 = array[0];
        for (int i3 = 1; i3 < array.length; i3++) {
            int i4 = array[i3];
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public static void reverse(int[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = toIndex - 1; fromIndex < i2; i2--) {
            int i3 = array[fromIndex];
            array[fromIndex] = array[i2];
            array[i2] = i3;
            fromIndex++;
        }
    }

    public static void rotate(int[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(int[] array, int distance, int fromIndex, int toIndex) {
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

    public static int saturatedCast(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static void sortDescending(int[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static Converter<String, Integer> stringConverter() {
        return IntConverter.INSTANCE;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Number) Preconditions.checkNotNull(array[i2])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int value) {
        return new byte[]{(byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value};
    }

    @CheckForNull
    public static Integer tryParse(String string) {
        return tryParse(string, 10);
    }

    @CheckForNull
    public static Integer tryParse(String string, int radix) {
        Long lTryParse = Longs.tryParse(string, radix);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }
}

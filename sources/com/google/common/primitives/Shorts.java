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
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    private enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] left, short[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Shorts.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    private static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        ShortArrayAsList(short[] array) {
            this(array, 0, array.length);
        }

        ShortArrayAsList(short[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Short) && Shorts.indexOf(this.array, ((Short) target).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof ShortArrayAsList)) {
                return super.equals(object);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) object;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != shortArrayAsList.array[shortArrayAsList.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Short.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iHashCode = (iHashCode * 31) + Shorts.hashCode(this.array[i2]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Short) || (iIndexOf = Shorts.indexOf(this.array, ((Short) target).shortValue(), this.start, this.end)) < 0) {
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
            if (!(target instanceof Short) || (iLastIndexOf = Shorts.lastIndexOf(this.array, ((Short) target).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int index, Short element) {
            Preconditions.checkElementIndex(index, size());
            short[] sArr = this.array;
            int i2 = this.start;
            short s2 = sArr[i2 + index];
            sArr[i2 + index] = ((Short) Preconditions.checkNotNull(element)).shortValue();
            return Short.valueOf(s2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            short[] sArr = this.array;
            int i2 = this.start;
            return new ShortArrayAsList(sArr, fromIndex + i2, i2 + toIndex);
        }

        short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append(AbstractJsonLexerKt.BEGIN_LIST).append((int) this.array[this.start]);
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    return sb.append(AbstractJsonLexerKt.END_LIST).toString();
                }
                sb.append(", ").append((int) this.array[i2]);
            }
        }
    }

    private static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final ShortConverter INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Short value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Short doForward(String value) {
            return Short.decode(value);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private Shorts() {
    }

    public static List<Short> asList(short... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new ShortArrayAsList(backingArray);
    }

    public static short checkedCast(long value) {
        short s2 = (short) value;
        Preconditions.checkArgument(((long) s2) == value, "Out of range: %s", value);
        return s2;
    }

    public static int compare(short a2, short b2) {
        return a2 - b2;
    }

    public static short[] concat(short[]... arrays) {
        int length = 0;
        for (short[] sArr : arrays) {
            length += sArr.length;
        }
        short[] sArr2 = new short[length];
        int length2 = 0;
        for (short[] sArr3 : arrays) {
            System.arraycopy(sArr3, 0, sArr2, length2, sArr3.length);
            length2 += sArr3.length;
        }
        return sArr2;
    }

    public static short constrainToRange(short value, short min, short max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", (int) min, (int) max);
        return value < min ? min : value < max ? value : max;
    }

    public static boolean contains(short[] array, short target) {
        for (short s2 : array) {
            if (s2 == target) {
                return true;
            }
        }
        return false;
    }

    public static short[] ensureCapacity(short[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static short fromByteArray(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    public static short fromBytes(byte b12, byte b2) {
        return (short) ((-1) - (((-1) - (b12 << 8)) & ((-1) - (b2 & 255))));
    }

    public static int hashCode(short value) {
        return value;
    }

    public static int indexOf(short[] array, short target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] array, short target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(short[] r5, short[] r6) {
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
            short r1 = r5[r0]
            short r0 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Shorts.indexOf(short[], short[]):int");
    }

    public static String join(String separator, short... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 6);
        sb.append((int) array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append((int) array[i2]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(short[] array, short target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] array, short target, int start, int end) {
        for (int i2 = end - 1; i2 >= start; i2--) {
            if (array[i2] == target) {
                return i2;
            }
        }
        return -1;
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static short max(short... array) {
        Preconditions.checkArgument(array.length > 0);
        short s2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            short s3 = array[i2];
            if (s3 > s2) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static short min(short... array) {
        Preconditions.checkArgument(array.length > 0);
        short s2 = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            short s3 = array[i2];
            if (s3 < s2) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static void reverse(short[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(short[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = toIndex - 1; fromIndex < i2; i2--) {
            short s2 = array[fromIndex];
            array[fromIndex] = array[i2];
            array[i2] = s2;
            fromIndex++;
        }
    }

    public static void rotate(short[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(short[] array, int distance, int fromIndex, int toIndex) {
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

    public static short saturatedCast(long value) {
        return value > 32767 ? ShortCompanionObject.MAX_VALUE : value < -32768 ? ShortCompanionObject.MIN_VALUE : (short) value;
    }

    public static void sortDescending(short[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(short[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static Converter<String, Short> stringConverter() {
        return ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = ((Number) Preconditions.checkNotNull(array[i2])).shortValue();
        }
        return sArr;
    }

    public static byte[] toByteArray(short value) {
        return new byte[]{(byte) (value >> 8), (byte) value};
    }
}

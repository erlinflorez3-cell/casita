package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
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
public final class Floats extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    private static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        FloatArrayAsList(float[] array) {
            this(array, 0, array.length);
        }

        FloatArrayAsList(float[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Float) && Floats.indexOf(this.array, ((Float) target).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof FloatArrayAsList)) {
                return super.equals(object);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) object;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != floatArrayAsList.array[floatArrayAsList.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Float.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iHashCode = (iHashCode * 31) + Floats.hashCode(this.array[i2]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Float) || (iIndexOf = Floats.indexOf(this.array, ((Float) target).floatValue(), this.start, this.end)) < 0) {
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
            if (!(target instanceof Float) || (iLastIndexOf = Floats.lastIndexOf(this.array, ((Float) target).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int index, Float element) {
            Preconditions.checkElementIndex(index, size());
            float[] fArr = this.array;
            int i2 = this.start;
            float f2 = fArr[i2 + index];
            fArr[i2 + index] = ((Float) Preconditions.checkNotNull(element)).floatValue();
            return Float.valueOf(f2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            float[] fArr = this.array;
            int i2 = this.start;
            return new FloatArrayAsList(fArr, fromIndex + i2, i2 + toIndex);
        }

        float[] toFloatArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
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

    private static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final FloatConverter INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Float value) {
            return value.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Float doForward(String value) {
            return Float.valueOf(value);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    private enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] left, float[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Float.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    private Floats() {
    }

    public static List<Float> asList(float... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new FloatArrayAsList(backingArray);
    }

    public static int compare(float a2, float b2) {
        return Float.compare(a2, b2);
    }

    public static float[] concat(float[]... arrays) {
        int length = 0;
        for (float[] fArr : arrays) {
            length += fArr.length;
        }
        float[] fArr2 = new float[length];
        int length2 = 0;
        for (float[] fArr3 : arrays) {
            System.arraycopy(fArr3, 0, fArr2, length2, fArr3.length);
            length2 += fArr3.length;
        }
        return fArr2;
    }

    public static float constrainToRange(float value, float min, float max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(min), Float.valueOf(max)));
    }

    public static boolean contains(float[] array, float target) {
        for (float f2 : array) {
            if (f2 == target) {
                return true;
            }
        }
        return false;
    }

    public static float[] ensureCapacity(float[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int hashCode(float value) {
        return Float.valueOf(value).hashCode();
    }

    public static int indexOf(float[] array, float target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] array, float target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(float[] r5, float[] r6) {
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
            if (r3 >= r0) goto L2c
            r2 = r4
        L18:
            int r0 = r6.length
            if (r2 >= r0) goto L2b
            int r0 = r3 + r2
            r1 = r5[r0]
            r0 = r6[r2]
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            int r3 = r3 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r3
        L2c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Floats.indexOf(float[], float[]):int");
    }

    public static boolean isFinite(float value) {
        return Float.NEGATIVE_INFINITY < value && value < Float.POSITIVE_INFINITY;
    }

    public static String join(String separator, float... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 12);
        sb.append(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append(array[i2]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(float[] array, float target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] array, float target, int start, int end) {
        for (int i2 = end - 1; i2 >= start; i2--) {
            if (array[i2] == target) {
                return i2;
            }
        }
        return -1;
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static float max(float... array) {
        Preconditions.checkArgument(array.length > 0);
        float fMax = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            fMax = Math.max(fMax, array[i2]);
        }
        return fMax;
    }

    public static float min(float... array) {
        Preconditions.checkArgument(array.length > 0);
        float fMin = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            fMin = Math.min(fMin, array[i2]);
        }
        return fMin;
    }

    public static void reverse(float[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(float[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = toIndex - 1; fromIndex < i2; i2--) {
            float f2 = array[fromIndex];
            array[fromIndex] = array[i2];
            array[i2] = f2;
            fromIndex++;
        }
    }

    public static void rotate(float[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(float[] array, int distance, int fromIndex, int toIndex) {
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

    public static void sortDescending(float[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(float[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    public static Converter<String, Float> stringConverter() {
        return FloatConverter.INSTANCE;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).toFloatArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = ((Number) Preconditions.checkNotNull(array[i2])).floatValue();
        }
        return fArr;
    }

    @CheckForNull
    public static Float tryParse(String string) {
        if (!Doubles.FLOATING_POINT_PATTERN.matcher(string).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

package com.google.common.primitives;

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
public final class Booleans {

    private static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        BooleanArrayAsList(boolean[] array) {
            this(array, 0, array.length);
        }

        BooleanArrayAsList(boolean[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Boolean) && Booleans.indexOf(this.array, ((Boolean) target).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof BooleanArrayAsList)) {
                return super.equals(object);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) object;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != booleanArrayAsList.array[booleanArrayAsList.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Boolean.valueOf(this.array[this.start + index]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iHashCode = (iHashCode * 31) + Booleans.hashCode(this.array[i2]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int iIndexOf;
            if (!(target instanceof Boolean) || (iIndexOf = Booleans.indexOf(this.array, ((Boolean) target).booleanValue(), this.start, this.end)) < 0) {
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
            if (!(target instanceof Boolean) || (iLastIndexOf = Booleans.lastIndexOf(this.array, ((Boolean) target).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int index, Boolean element) {
            Preconditions.checkElementIndex(index, size());
            boolean[] zArr = this.array;
            int i2 = this.start;
            boolean z2 = zArr[i2 + index];
            zArr[i2 + index] = ((Boolean) Preconditions.checkNotNull(element)).booleanValue();
            return Boolean.valueOf(z2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i2 = this.start;
            return new BooleanArrayAsList(zArr, fromIndex + i2, i2 + toIndex);
        }

        boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    return sb.append(AbstractJsonLexerKt.END_LIST).toString();
                }
                sb.append(this.array[i2] ? ", true" : ", false");
            }
        }
    }

    private enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        BooleanComparator(int trueValue, String toString) {
            this.trueValue = trueValue;
            this.toString = toString;
        }

        @Override // java.util.Comparator
        public int compare(Boolean a2, Boolean b2) {
            return (b2.booleanValue() ? this.trueValue : 0) - (a2.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }
    }

    private enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(boolean[] left, boolean[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int iCompare = Booleans.compare(left[i2], right[i2]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    private Booleans() {
    }

    public static List<Boolean> asList(boolean... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new BooleanArrayAsList(backingArray);
    }

    public static int compare(boolean a2, boolean b2) {
        if (a2 == b2) {
            return 0;
        }
        return a2 ? 1 : -1;
    }

    public static boolean[] concat(boolean[]... arrays) {
        int length = 0;
        for (boolean[] zArr : arrays) {
            length += zArr.length;
        }
        boolean[] zArr2 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr3 : arrays) {
            System.arraycopy(zArr3, 0, zArr2, length2, zArr3.length);
            length2 += zArr3.length;
        }
        return zArr2;
    }

    public static boolean contains(boolean[] array, boolean target) {
        for (boolean z2 : array) {
            if (z2 == target) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... values) {
        int i2 = 0;
        for (boolean z2 : values) {
            if (z2) {
                i2++;
            }
        }
        return i2;
    }

    public static boolean[] ensureCapacity(boolean[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean value) {
        return value ? 1231 : 1237;
    }

    public static int indexOf(boolean[] array, boolean target) {
        return indexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] array, boolean target, int start, int end) {
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
    public static int indexOf(boolean[] r5, boolean[] r6) {
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
            boolean r1 = r5[r0]
            boolean r0 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Booleans.indexOf(boolean[], boolean[]):int");
    }

    public static String join(String separator, boolean... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 7);
        sb.append(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            sb.append(separator).append(array[i2]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(boolean[] array, boolean target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] array, boolean target, int start, int end) {
        for (int i2 = end - 1; i2 >= start; i2--) {
            if (array[i2] == target) {
                return i2;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] array) {
        Preconditions.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void reverse(boolean[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i2 = toIndex - 1; fromIndex < i2; i2--) {
            boolean z2 = array[fromIndex];
            array[fromIndex] = array[i2];
            array[i2] = z2;
            fromIndex++;
        }
    }

    public static void rotate(boolean[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void rotate(boolean[] array, int distance, int fromIndex, int toIndex) {
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

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).toBooleanArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = ((Boolean) Preconditions.checkNotNull(array[i2])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }
}

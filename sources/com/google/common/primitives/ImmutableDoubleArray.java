package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
@Immutable(containerOf = {})
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        private AsList(ImmutableDoubleArray parent) {
            this.parent = parent;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof AsList) {
                return this.parent.equals(((AsList) object).parent);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i2 = this.parent.start;
            for (Object obj : list) {
                if (obj instanceof Double) {
                    int i3 = i2 + 1;
                    if (ImmutableDoubleArray.areEqual(this.parent.array[i2], ((Double) obj).doubleValue())) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int index) {
            return Double.valueOf(this.parent.get(index));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            if (target instanceof Double) {
                return this.parent.indexOf(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            if (target instanceof Double) {
                return this.parent.lastIndexOf(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            return this.parent.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    public static final class Builder {
        private double[] array;
        private int count = 0;

        Builder(int initialCapacity) {
            this.array = new double[initialCapacity];
        }

        private void ensureRoomFor(int numberToAdd) {
            int i2 = this.count + numberToAdd;
            double[] dArr = this.array;
            if (i2 > dArr.length) {
                this.array = Arrays.copyOf(dArr, expandedCapacity(dArr.length, i2));
            }
        }

        private static int expandedCapacity(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public Builder add(double value) {
            ensureRoomFor(1);
            double[] dArr = this.array;
            int i2 = this.count;
            dArr[i2] = value;
            this.count = i2 + 1;
            return this;
        }

        public Builder addAll(ImmutableDoubleArray values) {
            ensureRoomFor(values.length());
            System.arraycopy(values.array, values.start, this.array, this.count, values.length());
            this.count += values.length();
            return this;
        }

        public Builder addAll(Iterable<Double> values) {
            if (values instanceof Collection) {
                return addAll((Collection<Double>) values);
            }
            Iterator<Double> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        public Builder addAll(Collection<Double> values) {
            ensureRoomFor(values.size());
            for (Double d2 : values) {
                double[] dArr = this.array;
                int i2 = this.count;
                this.count = i2 + 1;
                dArr[i2] = d2.doubleValue();
            }
            return this;
        }

        public Builder addAll(double[] values) {
            ensureRoomFor(values.length);
            System.arraycopy(values, 0, this.array, this.count, values.length);
            this.count += values.length;
            return this;
        }

        public ImmutableDoubleArray build() {
            if (this.count == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.array, 0, this.count);
        }
    }

    private ImmutableDoubleArray(double[] array) {
        this(array, 0, array.length);
    }

    private ImmutableDoubleArray(double[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double a2, double b2) {
        return Double.doubleToLongBits(a2) == Double.doubleToLongBits(b2);
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static Builder builder(int initialCapacity) {
        Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new Builder(initialCapacity);
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> values) {
        return values instanceof Collection ? copyOf((Collection<Double>) values) : builder().addAll(values).build();
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> values) {
        return values.isEmpty() ? EMPTY : new ImmutableDoubleArray(Doubles.toArray(values));
    }

    public static ImmutableDoubleArray copyOf(double[] values) {
        return values.length == 0 ? EMPTY : new ImmutableDoubleArray(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableDoubleArray of() {
        return EMPTY;
    }

    public static ImmutableDoubleArray of(double e02) {
        return new ImmutableDoubleArray(new double[]{e02});
    }

    public static ImmutableDoubleArray of(double e02, double e12) {
        return new ImmutableDoubleArray(new double[]{e02, e12});
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e2) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e2});
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e2, double e3) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e2, e3});
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e2, double e3, double e4) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e2, e3, e4});
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e2, double e3, double e4, double e5) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e2, e3, e4, e5});
    }

    public static ImmutableDoubleArray of(double first, double... rest) {
        Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr = new double[rest.length + 1];
        dArr[0] = first;
        System.arraycopy(rest, 0, dArr, 1, rest.length);
        return new ImmutableDoubleArray(dArr);
    }

    public List<Double> asList() {
        return new AsList();
    }

    public boolean contains(double target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) object;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length(); i2++) {
            if (!areEqual(get(i2), immutableDoubleArray.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public double get(int index) {
        Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            iHashCode = (iHashCode * 31) + Doubles.hashCode(this.array[i2]);
        }
        return iHashCode;
    }

    public int indexOf(double target) {
        for (int i2 = this.start; i2 < this.end; i2++) {
            if (areEqual(this.array[i2], target)) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double target) {
        for (int i2 = this.end - 1; i2 >= this.start; i2--) {
            if (areEqual(this.array[i2], target)) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public int length() {
        return this.end - this.start;
    }

    Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableDoubleArray subArray(int startIndex, int endIndex) {
        Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i2 = this.start;
        return new ImmutableDoubleArray(dArr, startIndex + i2, i2 + endIndex);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.array[this.start]);
        int i2 = this.start;
        while (true) {
            i2++;
            if (i2 >= this.end) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ").append(this.array[i2]);
        }
    }

    public ImmutableDoubleArray trimmed() {
        return isPartialView() ? new ImmutableDoubleArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }
}

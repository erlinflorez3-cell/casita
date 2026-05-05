package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;

    @CheckForNull
    @LazyInit
    private transient ImmutableList<E> asList;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @CheckForNull
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        Builder(int capacity) {
            super(capacity);
            this.hashTable = new Object[ImmutableSet.chooseTableSize(capacity)];
        }

        private void addDeduping(E element) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int iHashCode = element.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i2 = (-1) - (((-1) - iSmear) | ((-1) - length));
                Object[] objArr = this.hashTable;
                Object obj = objArr[i2];
                if (obj == null) {
                    objArr[i2] = element;
                    this.hashCode += iHashCode;
                    super.add((Object) element);
                    return;
                } else if (obj.equals(element)) {
                    return;
                } else {
                    iSmear = i2 + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E element) {
            Preconditions.checkNotNull(element);
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(element);
                return this;
            }
            this.hashTable = null;
            super.add((Object) element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E... elements) {
            if (this.hashTable != null) {
                for (E e2 : elements) {
                    add((Object) e2);
                }
            } else {
                super.add((Object[]) elements);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterable<? extends E> elements) {
            Preconditions.checkNotNull(elements);
            if (this.hashTable != null) {
                Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
            } else {
                super.addAll((Iterable) elements);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterator<? extends E> elements) {
            Preconditions.checkNotNull(elements);
            while (elements.hasNext()) {
                add((Object) elements.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetConstruct;
            int i2 = this.size;
            if (i2 == 0) {
                return ImmutableSet.of();
            }
            if (i2 == 1) {
                return ImmutableSet.of(Objects.requireNonNull(this.contents[0]));
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(this.size) != this.hashTable.length) {
                immutableSetConstruct = ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                immutableSetConstruct = new RegularImmutableSet<>(objArrCopyOf, this.hashCode, this.hashTable, r6.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return immutableSetConstruct;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Builder<E> combine(Builder<E> other) {
            if (this.hashTable != null) {
                for (int i2 = 0; i2 < other.size; i2++) {
                    add(Objects.requireNonNull(other.contents[i2]));
                }
            } else {
                addAll(other.contents, other.size);
            }
            return this;
        }
    }

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] elements) {
            this.elements = elements;
        }

        Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    ImmutableSet() {
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int expectedSize) {
        CollectPreconditions.checkNonnegative(expectedSize, "expectedSize");
        return new Builder<>(expectedSize);
    }

    static int chooseTableSize(int setSize) {
        int iMax = Math.max(setSize, 2);
        if (iMax >= CUTOFF) {
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> construct(int n2, Object... elements) {
        Object[] objArrCopyOf = elements;
        if (n2 == 0) {
            return of();
        }
        if (n2 == 1) {
            return of(Objects.requireNonNull(objArrCopyOf[0]));
        }
        int iChooseTableSize = chooseTableSize(n2);
        Object[] objArr = new Object[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < n2; i5++) {
            Object objCheckElementNotNull = ObjectArrays.checkElementNotNull(objArrCopyOf[i5], i5);
            int iHashCode = objCheckElementNotNull.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i6 = (iSmear + i2) - (iSmear | i2);
                Object obj = objArr[i6];
                if (obj == null) {
                    objArrCopyOf[i4] = objCheckElementNotNull;
                    objArr[i6] = objCheckElementNotNull;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj.equals(objCheckElementNotNull)) {
                    break;
                }
                iSmear++;
            }
        }
        Arrays.fill(objArrCopyOf, i4, n2, (Object) null);
        if (i4 == 1) {
            return new SingletonImmutableSet(Objects.requireNonNull(objArrCopyOf[0]));
        }
        if (chooseTableSize(i4) < iChooseTableSize / 2) {
            return construct(i4, objArrCopyOf);
        }
        if (shouldTrim(i4, objArrCopyOf.length)) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
        }
        return new RegularImmutableSet(objArrCopyOf, i3, objArr, i2, i4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> elements) {
        return elements instanceof Collection ? copyOf((Collection) elements) : copyOf(elements.iterator());
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> elements) {
        if ((elements instanceof ImmutableSet) && !(elements instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) elements;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = elements.toArray();
        return construct(array.length, array);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        E next = elements.next();
        return !elements.hasNext() ? of((Object) next) : new Builder().add((Object) next).addAll((Iterator) elements).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] elements) {
        int length = elements.length;
        return length != 0 ? length != 1 ? construct(elements.length, (Object[]) elements.clone()) : of((Object) elements[0]) : of();
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    public static <E> ImmutableSet<E> of(E element) {
        return new SingletonImmutableSet(element);
    }

    public static <E> ImmutableSet<E> of(E e12, E e2) {
        return construct(2, e12, e2);
    }

    public static <E> ImmutableSet<E> of(E e12, E e2, E e3) {
        return construct(3, e12, e2, e3);
    }

    public static <E> ImmutableSet<E> of(E e12, E e2, E e3, E e4) {
        return construct(4, e12, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> of(E e12, E e2, E e3, E e4, E e5) {
        return construct(5, e12, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e12, E e2, E e3, E e4, E e5, E e6, E... others) {
        Preconditions.checkArgument(others.length <= 2147483641, "the total number of elements must fit in an int");
        int length = others.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e12;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(others, 0, objArr, 6, others.length);
        return construct(length, objArr);
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static boolean shouldTrim(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) object).isHashCodeFast() && hashCode() != object.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }
}

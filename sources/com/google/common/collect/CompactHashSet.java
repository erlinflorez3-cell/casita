package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @CheckForNull
    transient Object[] elements;

    @CheckForNull
    private transient int[] entries;
    private transient int metadata;
    private transient int size;

    @CheckForNull
    private transient Object table;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashSet$1 */
    class AnonymousClass1 implements Iterator<E> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove = -1;

        AnonymousClass1() {
            this.expectedMetadata = CompactHashSet.this.metadata;
            this.currentIndex = CompactHashSet.this.firstEntryIndex();
        }

        private void checkForConcurrentModification() {
            if (CompactHashSet.this.metadata != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.currentIndex;
            this.indexToRemove = i2;
            E e2 = (E) CompactHashSet.this.element(i2);
            this.currentIndex = CompactHashSet.this.getSuccessor(this.currentIndex);
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.element(this.indexToRemove));
            this.currentIndex = CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }
    }

    CompactHashSet() {
        init(3);
    }

    CompactHashSet(int expectedSize) {
        init(expectedSize);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... elements) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(elements.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, elements);
        return compactHashSetCreateWithExpectedSize;
    }

    private Set<E> createHashFloodingResistantDelegate(int tableSize) {
        return new LinkedHashSet(tableSize, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int expectedSize) {
        return new CompactHashSet<>(expectedSize);
    }

    public E element(int i2) {
        return (E) requireElements()[i2];
    }

    private int entry(int i2) {
        return requireEntries()[i2];
    }

    private int hashTableMask() {
        return (1 << ((-1) - (((-1) - this.metadata) | ((-1) - 31)))) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i2 = stream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Invalid size: " + i2);
        }
        init(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            add(stream.readObject());
        }
    }

    private Object[] requireElements() {
        return (Object[]) Objects.requireNonNull(this.elements);
    }

    private int[] requireEntries() {
        return (int[]) Objects.requireNonNull(this.entries);
    }

    private Object requireTable() {
        return Objects.requireNonNull(this.table);
    }

    private void resizeMeMaybe(int newSize) {
        int iMin;
        int length = requireEntries().length;
        if (newSize <= length || (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (-1) - (((-1) - (Math.max(1, length >>> 1) + length)) & ((-1) - 1)))) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    private int resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object objCreateTable = CompactHashing.createTable(newCapacity);
        int i2 = newCapacity - 1;
        if (targetEntryIndex != 0) {
            CompactHashing.tableSet(objCreateTable, (-1) - (((-1) - targetHash) | ((-1) - i2)), targetEntryIndex + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i3 = 0; i3 <= oldMask; i3++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i3);
            while (iTableGet != 0) {
                int i4 = iTableGet - 1;
                int i5 = iArrRequireEntries[i4];
                int hashPrefix = CompactHashing.getHashPrefix(i5, oldMask) | i3;
                int i6 = (-1) - (((-1) - hashPrefix) | ((-1) - i2));
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i6);
                CompactHashing.tableSet(objCreateTable, i6, iTableGet);
                iArrRequireEntries[i4] = CompactHashing.maskCombine(hashPrefix, iTableGet2, i2);
                iTableGet = CompactHashing.getNext(i5, oldMask);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i2);
        return i2;
    }

    private void setElement(int i2, E value) {
        requireElements()[i2] = value;
    }

    private void setEntry(int i2, int value) {
        requireEntries()[i2] = value;
    }

    private void setHashTableMask(int mask) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@ParametricNullness E object) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(object);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int i2 = this.size;
        int i3 = i2 + 1;
        int iSmearedHash = Hashing.smearedHash(object);
        int iHashTableMask = hashTableMask();
        int i4 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i4);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i5 = 0;
            while (true) {
                int i6 = iTableGet - 1;
                int i7 = iArrRequireEntries[i6];
                if (CompactHashing.getHashPrefix(i7, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(object, objArrRequireElements[i6])) {
                    return false;
                }
                int next = CompactHashing.getNext(i7, iHashTableMask);
                i5++;
                if (next != 0) {
                    iTableGet = next;
                } else {
                    if (i5 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(object);
                    }
                    if (i3 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i2);
                    } else {
                        iArrRequireEntries[i6] = CompactHashing.maskCombine(i7, i3, iHashTableMask);
                    }
                }
            }
        } else if (i3 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i2);
        } else {
            CompactHashing.tableSet(requireTable(), i4, i3);
        }
        resizeMeMaybe(i3);
        insertEntry(i2, object, iSmearedHash, iHashTableMask);
        this.size = i3;
        incrementModCount();
        return true;
    }

    int adjustAfterRemove(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i2 = this.metadata;
        int iTableSize = CompactHashing.tableSize(i2);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i2];
        this.elements = new Object[i2];
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            setDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(object);
        }
        int iSmearedHash = Hashing.smearedHash(object);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return false;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i2 = iTableGet - 1;
            int iEntry = entry(i2);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(object, element(i2))) {
                return true;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return false;
    }

    Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setCreateHashFloodingResistantDelegate.add(element(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = setCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return setCreateHashFloodingResistantDelegate;
    }

    @CheckForNull
    Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    int getSuccessor(int entryIndex) {
        int i2 = entryIndex + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    void init(int expectedSize) {
        Preconditions.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(expectedSize, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    void insertEntry(int entryIndex, @ParametricNullness E object, int hash, int mask) {
        setEntry(entryIndex, CompactHashing.maskCombine(hash, 0, mask));
        setElement(entryIndex, object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.iterator() : new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1
            int currentIndex;
            int expectedMetadata;
            int indexToRemove = -1;

            AnonymousClass1() {
                this.expectedMetadata = CompactHashSet.this.metadata;
                this.currentIndex = CompactHashSet.this.firstEntryIndex();
            }

            private void checkForConcurrentModification() {
                if (CompactHashSet.this.metadata != this.expectedMetadata) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            void incrementExpectedModCount() {
                this.expectedMetadata += 32;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                checkForConcurrentModification();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.currentIndex;
                this.indexToRemove = i2;
                E e2 = (E) CompactHashSet.this.element(i2);
                this.currentIndex = CompactHashSet.this.getSuccessor(this.currentIndex);
                return e2;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForConcurrentModification();
                CollectPreconditions.checkRemove(this.indexToRemove >= 0);
                incrementExpectedModCount();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.element(this.indexToRemove));
                this.currentIndex = CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
                this.indexToRemove = -1;
            }
        };
    }

    void moveLastEntry(int dstIndex, int mask) {
        int i2;
        int i3;
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int size = size();
        int i4 = size - 1;
        if (dstIndex >= i4) {
            objArrRequireElements[dstIndex] = null;
            iArrRequireEntries[dstIndex] = 0;
            return;
        }
        Object obj = objArrRequireElements[i4];
        objArrRequireElements[dstIndex] = obj;
        objArrRequireElements[i4] = null;
        iArrRequireEntries[dstIndex] = iArrRequireEntries[i4];
        iArrRequireEntries[i4] = 0;
        int iSmearedHash = Hashing.smearedHash(obj);
        int i5 = (iSmearedHash + mask) - (iSmearedHash | mask);
        int iTableGet = CompactHashing.tableGet(objRequireTable, i5);
        if (iTableGet == size) {
            CompactHashing.tableSet(objRequireTable, i5, dstIndex + 1);
            return;
        }
        do {
            i2 = iTableGet - 1;
            i3 = iArrRequireEntries[i2];
            iTableGet = CompactHashing.getNext(i3, mask);
        } while (iTableGet != size);
        iArrRequireEntries[i2] = CompactHashing.maskCombine(i3, dstIndex + 1, mask);
    }

    boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object object) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(object);
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(object, null, iHashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (iRemove == -1) {
            return false;
        }
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    void resizeEntries(int newCapacity) {
        this.entries = Arrays.copyOf(requireEntries(), newCapacity);
        this.elements = Arrays.copyOf(requireElements(), newCapacity);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (!needsAllocArrays()) {
            Set<E> setDelegateOrNull = delegateOrNull();
            return setDelegateOrNull != null ? (T[]) setDelegateOrNull.toArray(tArr) : (T[]) ObjectArrays.toArrayImpl(requireElements(), 0, this.size, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            setCreateHashFloodingResistantDelegate.addAll(setDelegateOrNull);
            this.table = setCreateHashFloodingResistantDelegate;
            return;
        }
        int i2 = this.size;
        if (i2 < requireEntries().length) {
            resizeEntries(i2);
        }
        int iTableSize = CompactHashing.tableSize(i2);
        int iHashTableMask = hashTableMask();
        if (iTableSize < iHashTableMask) {
            resizeTable(iHashTableMask, iTableSize, 0, 0);
        }
    }
}

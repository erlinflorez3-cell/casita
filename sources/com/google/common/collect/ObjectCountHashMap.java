package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import io.sentry.protocol.MetricSummary;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    class MapEntry extends Multisets.AbstractEntry<K> {

        @ParametricNullness
        final K key;
        int lastKnownIndex;

        MapEntry(int i2) {
            this.key = (K) ObjectCountHashMap.this.keys[i2];
            this.lastKnownIndex = i2;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.values[this.lastKnownIndex];
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.key;
        }

        public int setCount(int count) {
            updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
                ObjectCountHashMap.this.put(this.key, count);
                return 0;
            }
            int i2 = ObjectCountHashMap.this.values[this.lastKnownIndex];
            ObjectCountHashMap.this.values[this.lastKnownIndex] = count;
            return i2;
        }

        void updateLastKnownIndex() {
            int i2 = this.lastKnownIndex;
            if (i2 == -1 || i2 >= ObjectCountHashMap.this.size() || !Objects.equal(this.key, ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = ObjectCountHashMap.this.indexOf(this.key);
            }
        }
    }

    ObjectCountHashMap() {
        init(3, 1.0f);
    }

    ObjectCountHashMap(int capacity) {
        this(capacity, 1.0f);
    }

    ObjectCountHashMap(int expectedSize, float loadFactor) {
        init(expectedSize, loadFactor);
    }

    ObjectCountHashMap(ObjectCountHashMap<? extends K> map) {
        init(map.size(), 1.0f);
        int iFirstIndex = map.firstIndex();
        while (iFirstIndex != -1) {
            put(map.getKey(iFirstIndex), map.getValue(iFirstIndex));
            iFirstIndex = map.nextIndex(iFirstIndex);
        }
    }

    static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap<>();
    }

    static <K> ObjectCountHashMap<K> createWithExpectedSize(int expectedSize) {
        return new ObjectCountHashMap<>(expectedSize);
    }

    private static int getHash(long entry) {
        return (int) (entry >>> 32);
    }

    private static int getNext(long entry) {
        return (int) entry;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long[] newEntries(int size) {
        long[] jArr = new long[size];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int remove(@CheckForNull Object key, int hash) {
        int iHashTableMask = hashTableMask() & hash;
        int i2 = this.table[iHashTableMask];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (getHash(this.entries[i2]) == hash && Objects.equal(key, this.keys[i2])) {
                int i4 = this.values[i2];
                if (i3 == -1) {
                    this.table[iHashTableMask] = getNext(this.entries[i2]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                }
                moveLastEntry(i2);
                this.size--;
                this.modCount++;
                return i4;
            }
            int next = getNext(this.entries[i2]);
            if (next == -1) {
                return 0;
            }
            i3 = i2;
            i2 = next;
        }
    }

    private void resizeMeMaybe(int newSize) {
        int length = this.entries.length;
        if (newSize > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    private void resizeTable(int newCapacity) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (newCapacity * this.loadFactor)) + 1;
        int[] iArrNewTable = newTable(newCapacity);
        long[] jArr = this.entries;
        int length = iArrNewTable.length - 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            int hash = getHash(jArr[i3]);
            int i4 = (-1) - (((-1) - hash) | ((-1) - length));
            int i5 = iArrNewTable[i4];
            iArrNewTable[i4] = i3;
            long j2 = i5;
            jArr[i3] = (-1) - (((-1) - (((long) hash) << 32)) & ((-1) - ((j2 + NEXT_MASK) - (j2 | NEXT_MASK))));
        }
        this.threshold = i2;
        this.table = iArrNewTable;
    }

    private static long swapNext(long entry, int newNext) {
        long j2 = entry & HASH_MASK;
        long j3 = newNext;
        long j4 = (NEXT_MASK + j3) - (NEXT_MASK | j3);
        return (j2 + j4) - (j2 & j4);
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    public boolean containsKey(@CheckForNull Object key) {
        return indexOf(key) != -1;
    }

    void ensureCapacity(int minCapacity) {
        if (minCapacity > this.entries.length) {
            resizeEntries(minCapacity);
        }
        if (minCapacity >= this.threshold) {
            resizeTable(Math.max(2, Integer.highestOneBit(minCapacity - 1) << 1));
        }
    }

    int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(@CheckForNull Object key) {
        int iIndexOf = indexOf(key);
        if (iIndexOf == -1) {
            return 0;
        }
        return this.values[iIndexOf];
    }

    Multiset.Entry<K> getEntry(int index) {
        Preconditions.checkElementIndex(index, this.size);
        return new MapEntry(index);
    }

    @ParametricNullness
    K getKey(int i2) {
        Preconditions.checkElementIndex(i2, this.size);
        return (K) this.keys[i2];
    }

    int getValue(int index) {
        Preconditions.checkElementIndex(index, this.size);
        return this.values[index];
    }

    int indexOf(@CheckForNull Object key) {
        int iSmearedHash = Hashing.smearedHash(key);
        int next = this.table[(-1) - (((-1) - hashTableMask()) | ((-1) - iSmearedHash))];
        while (next != -1) {
            long j2 = this.entries[next];
            if (getHash(j2) == iSmearedHash && Objects.equal(key, this.keys[next])) {
                return next;
            }
            next = getNext(j2);
        }
        return -1;
    }

    void init(int expectedSize, float loadFactor) {
        Preconditions.checkArgument(expectedSize >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(loadFactor > 0.0f, "Illegal load factor");
        int iClosedTableSize = Hashing.closedTableSize(expectedSize, loadFactor);
        this.table = newTable(iClosedTableSize);
        this.loadFactor = loadFactor;
        this.keys = new Object[expectedSize];
        this.values = new int[expectedSize];
        this.entries = newEntries(expectedSize);
        this.threshold = Math.max(1, (int) (iClosedTableSize * loadFactor));
    }

    void insertEntry(int entryIndex, @ParametricNullness K key, int value, int hash) {
        this.entries[entryIndex] = (((long) hash) << 32) | NEXT_MASK;
        this.keys[entryIndex] = key;
        this.values[entryIndex] = value;
    }

    void moveLastEntry(int dstIndex) {
        int size = size() - 1;
        if (dstIndex >= size) {
            this.keys[dstIndex] = null;
            this.values[dstIndex] = 0;
            this.entries[dstIndex] = -1;
            return;
        }
        Object[] objArr = this.keys;
        objArr[dstIndex] = objArr[size];
        int[] iArr = this.values;
        iArr[dstIndex] = iArr[size];
        objArr[size] = null;
        iArr[size] = 0;
        long[] jArr = this.entries;
        long j2 = jArr[size];
        jArr[dstIndex] = j2;
        jArr[size] = -1;
        int hash = getHash(j2) & hashTableMask();
        int[] iArr2 = this.table;
        int i2 = iArr2[hash];
        if (i2 == size) {
            iArr2[hash] = dstIndex;
            return;
        }
        while (true) {
            long j3 = this.entries[i2];
            int next = getNext(j3);
            if (next == size) {
                this.entries[i2] = swapNext(j3, dstIndex);
                return;
            }
            i2 = next;
        }
    }

    int nextIndex(int index) {
        int i2 = index + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    int nextIndexAfterRemove(int oldNextIndex, int removedIndex) {
        return oldNextIndex - 1;
    }

    public int put(@ParametricNullness K key, int value) {
        CollectPreconditions.checkPositive(value, MetricSummary.JsonKeys.COUNT);
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int iSmearedHash = Hashing.smearedHash(key);
        int iHashTableMask = hashTableMask() & iSmearedHash;
        int i2 = this.size;
        int[] iArr2 = this.table;
        int i3 = iArr2[iHashTableMask];
        if (i3 == -1) {
            iArr2[iHashTableMask] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (getHash(j2) == iSmearedHash && Objects.equal(key, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = value;
                    return i4;
                }
                int next = getNext(j2);
                if (next == -1) {
                    jArr[i3] = swapNext(j2, i2);
                    break;
                }
                i3 = next;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i5 = i2 + 1;
        resizeMeMaybe(i5);
        insertEntry(i2, key, value, iSmearedHash);
        this.size = i5;
        if (i2 >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    public int remove(@CheckForNull Object key) {
        return remove(key, Hashing.smearedHash(key));
    }

    int removeEntry(int entryIndex) {
        return remove(this.keys[entryIndex], getHash(this.entries[entryIndex]));
    }

    void resizeEntries(int newCapacity) {
        this.keys = Arrays.copyOf(this.keys, newCapacity);
        this.values = Arrays.copyOf(this.values, newCapacity);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
        }
        this.entries = jArrCopyOf;
    }

    void setValue(int index, int newValue) {
        Preconditions.checkElementIndex(index, this.size);
        this.values[index] = newValue;
    }

    int size() {
        return this.size;
    }
}

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;

    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @CheckForNull
    @LazyInit
    private transient BiMap<V, K> inverse;

    @LazyInit
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;

    @LazyInit
    private transient Set<V> valueSet;
    transient V[] values;

    final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;

        EntryForKey(int i2) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i2]);
            this.index = i2;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            return this.index == -1 ? (V) NullnessCasts.unsafeNull() : (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[this.index]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v2) {
            updateIndex();
            if (this.index == -1) {
                HashBiMap.this.put(this.key, v2);
                return (V) NullnessCasts.unsafeNull();
            }
            V v3 = (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[this.index]);
            if (Objects.equal(v3, v2)) {
                return v2;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v2, false);
            return v3;
        }

        void updateIndex() {
            int i2 = this.index;
            if (i2 == -1 || i2 > HashBiMap.this.size || !Objects.equal(HashBiMap.this.keys[this.index], this.key)) {
                this.index = HashBiMap.this.findEntryByKey(this.key);
            }
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i2) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i2]);
            this.index = i2;
        }

        private void updateIndex() {
            int i2 = this.index;
            if (i2 == -1 || i2 > this.biMap.size || !Objects.equal(this.value, this.biMap.values[this.index])) {
                this.index = this.biMap.findEntryByValue(this.value);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            return this.index == -1 ? (K) NullnessCasts.unsafeNull() : (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[this.index]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k2) {
            updateIndex();
            if (this.index == -1) {
                this.biMap.putInverse(this.value, k2, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k3 = (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[this.index]);
            if (Objects.equal(k3, k2)) {
                return k2;
            }
            this.biMap.replaceKeyInEntry(this.index, k2, false);
            return k3;
        }
    }

    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o2) {
            if (!(o2 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
            return iFindEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[iFindEntryByKey]);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int entry) {
            return new EntryForKey(entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o2) {
            if (!(o2 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        Inverse(HashBiMap<K, V> forward) {
            this.forward = forward;
        }

        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.forward.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object value) {
            return this.forward.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CheckForNull
        public K forcePut(@ParametricNullness V value, @ParametricNullness K key) {
            return this.forward.putInverse(value, key, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object key) {
            return this.forward.getInverse(key);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CheckForNull
        public K put(@ParametricNullness V value, @ParametricNullness K key) {
            return this.forward.putInverse(value, key, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K remove(@CheckForNull Object value) {
            return this.forward.removeInverse(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> biMap) {
            super(biMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o2) {
            if (!(o2 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByValue = this.biMap.findEntryByValue(key);
            return iFindEntryByValue != -1 && Objects.equal(this.biMap.keys[iFindEntryByValue], value);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int entry) {
            return new EntryForValue(this.biMap, entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o2) {
            if (!(o2 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o2;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o2) {
            return HashBiMap.this.containsKey(o2);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        K forEntry(int i2) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i2]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o2) {
            int iSmearedHash = Hashing.smearedHash(o2);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(o2, iSmearedHash);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o2) {
            return HashBiMap.this.containsValue(o2);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        V forEntry(int i2) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i2]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o2) {
            int iSmearedHash = Hashing.smearedHash(o2);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(o2, iSmearedHash);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        View(HashBiMap<K, V> biMap) {
            this.biMap = biMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        @ParametricNullness
        abstract T forEntry(int entry);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    this.expectedModCount = View.this.biMap.modCount;
                    this.remaining = View.this.biMap.size;
                }

                private void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t2 = (T) View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t2;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    if (this.index == View.this.biMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = View.this.biMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }
    }

    private HashBiMap(int expectedSize) {
        init(expectedSize);
    }

    private int bucket(int hash) {
        int length = this.hashTableKToV.length - 1;
        return (hash + length) - (hash | length);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public static <K, V> HashBiMap<K, V> create(int expectedSize) {
        return new HashBiMap<>(expectedSize);
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }

    private static int[] createFilledWithAbsent(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int entry, int keyHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.hashTableKToV;
        int i2 = iArr[iBucket];
        if (i2 == entry) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i3 = this.nextInBucketKToV[i2];
        while (true) {
            int i4 = i2;
            i2 = i3;
            if (i2 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.keys[entry]);
            }
            if (i2 == entry) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i4] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i3 = this.nextInBucketKToV[i2];
        }
    }

    private void deleteFromTableVToK(int entry, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.hashTableVToK;
        int i2 = iArr[iBucket];
        if (i2 == entry) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i3 = this.nextInBucketVToK[i2];
        while (true) {
            int i4 = i2;
            i2 = i3;
            if (i2 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.values[entry]);
            }
            if (i2 == entry) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i4] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i3 = this.nextInBucketVToK[i2];
        }
    }

    private void ensureCapacity(int i2) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i2) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i2);
            this.keys = (K[]) Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i2) {
            int iClosedTableSize = Hashing.closedTableSize(i2, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i3 = 0; i3 < this.size; i3++) {
                int iBucket = bucket(Hashing.smearedHash(this.keys[i3]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i3] = iArr3[iBucket];
                iArr3[iBucket] = i3;
                int iBucket2 = bucket(Hashing.smearedHash(this.values[i3]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i3] = iArr5[iBucket2];
                iArr5[iBucket2] = i3;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] array, int newSize) {
        int length = array.length;
        int[] iArrCopyOf = Arrays.copyOf(array, newSize);
        Arrays.fill(iArrCopyOf, length, newSize, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int entry, int keyHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    private void insertIntoTableVToK(int entry, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    private void moveEntryToIndex(int src, int dest) {
        int i2;
        int i3;
        if (src == dest) {
            return;
        }
        int i4 = this.prevInInsertionOrder[src];
        int i5 = this.nextInInsertionOrder[src];
        setSucceeds(i4, dest);
        setSucceeds(dest, i5);
        K[] kArr = this.keys;
        K k2 = kArr[src];
        V[] vArr = this.values;
        V v2 = vArr[src];
        kArr[dest] = k2;
        vArr[dest] = v2;
        int iBucket = bucket(Hashing.smearedHash(k2));
        int[] iArr = this.hashTableKToV;
        int i6 = iArr[iBucket];
        if (i6 == src) {
            iArr[iBucket] = dest;
        } else {
            int i7 = this.nextInBucketKToV[i6];
            while (true) {
                i2 = i6;
                i6 = i7;
                if (i6 == src) {
                    break;
                } else {
                    i7 = this.nextInBucketKToV[i6];
                }
            }
            this.nextInBucketKToV[i2] = dest;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[dest] = iArr2[src];
        iArr2[src] = -1;
        int iBucket2 = bucket(Hashing.smearedHash(v2));
        int[] iArr3 = this.hashTableVToK;
        int i8 = iArr3[iBucket2];
        if (i8 == src) {
            iArr3[iBucket2] = dest;
        } else {
            int i9 = this.nextInBucketVToK[i8];
            while (true) {
                i3 = i8;
                i8 = i9;
                if (i8 == src) {
                    break;
                } else {
                    i9 = this.nextInBucketVToK[i8];
                }
            }
            this.nextInBucketVToK[i3] = dest;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[dest] = iArr4[src];
        iArr4[src] = -1;
    }

    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int count = Serialization.readCount(stream);
        init(16);
        Serialization.populateMap(this, stream, count);
    }

    private void removeEntry(int entry, int keyHash, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        deleteFromTableKToV(entry, keyHash);
        deleteFromTableVToK(entry, valueHash);
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        moveEntryToIndex(this.size - 1, entry);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2 - 1] = null;
        this.values[i2 - 1] = null;
        this.size = i2 - 1;
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int entry, @ParametricNullness K newKey, boolean force) {
        int i2;
        Preconditions.checkArgument(entry != -1);
        int iSmearedHash = Hashing.smearedHash(newKey);
        int iFindEntryByKey = findEntryByKey(newKey, iSmearedHash);
        int i3 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i2 = -2;
        } else {
            if (!force) {
                throw new IllegalArgumentException("Key already present in map: " + newKey);
            }
            i3 = this.prevInInsertionOrder[iFindEntryByKey];
            i2 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (entry == this.size) {
                entry = iFindEntryByKey;
            }
        }
        if (i3 == entry) {
            i3 = this.prevInInsertionOrder[entry];
        } else if (i3 == this.size) {
            i3 = iFindEntryByKey;
        }
        if (i2 == entry) {
            iFindEntryByKey = this.nextInInsertionOrder[entry];
        } else if (i2 != this.size) {
            iFindEntryByKey = i2;
        }
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        deleteFromTableKToV(entry, Hashing.smearedHash(this.keys[entry]));
        this.keys[entry] = newKey;
        insertIntoTableKToV(entry, Hashing.smearedHash(newKey));
        setSucceeds(i3, entry);
        setSucceeds(entry, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int entry, @ParametricNullness V newValue, boolean force) {
        Preconditions.checkArgument(entry != -1);
        int iSmearedHash = Hashing.smearedHash(newValue);
        int iFindEntryByValue = findEntryByValue(newValue, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (!force) {
                throw new IllegalArgumentException("Value already present in map: " + newValue);
            }
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            if (entry == this.size) {
                entry = iFindEntryByValue;
            }
        }
        deleteFromTableVToK(entry, Hashing.smearedHash(this.values[entry]));
        this.values[entry] = newValue;
        insertIntoTableVToK(entry, iSmearedHash);
    }

    private void setSucceeds(int prev, int next) {
        if (prev == -2) {
            this.firstInInsertionOrder = next;
        } else {
            this.nextInInsertionOrder[prev] = next;
        }
        if (next == -2) {
            this.lastInInsertionOrder = prev;
        } else {
            this.prevInInsertionOrder[next] = prev;
        }
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        Serialization.writeMap(this, stream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return findEntryByKey(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        return findEntryByValue(value) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    int findEntry(@CheckForNull Object o2, int oHash, int[] hashTable, int[] nextInBucket, Object[] array) {
        int i2 = hashTable[bucket(oHash)];
        while (i2 != -1) {
            if (Objects.equal(array[i2], o2)) {
                return i2;
            }
            i2 = nextInBucket[i2];
        }
        return -1;
    }

    int findEntryByKey(@CheckForNull Object key) {
        return findEntryByKey(key, Hashing.smearedHash(key));
    }

    int findEntryByKey(@CheckForNull Object key, int keyHash) {
        return findEntry(key, keyHash, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    int findEntryByValue(@CheckForNull Object value) {
        return findEntryByValue(value, Hashing.smearedHash(value));
    }

    int findEntryByValue(@CheckForNull Object value, int valueHash) {
        return findEntry(value, valueHash, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    public V forcePut(@ParametricNullness K key, @ParametricNullness V value) {
        return put(key, value, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        int iFindEntryByKey = findEntryByKey(key);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    @CheckForNull
    K getInverse(@CheckForNull Object value) {
        int iFindEntryByValue = findEntryByValue(value);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    void init(int i2) {
        CollectPreconditions.checkNonnegative(i2, "expectedSize");
        int iClosedTableSize = Hashing.closedTableSize(i2, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i2];
        this.values = (V[]) new Object[i2];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i2);
        this.nextInBucketVToK = createFilledWithAbsent(i2);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i2);
        this.nextInInsertionOrder = createFilledWithAbsent(i2);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CheckForNull
    public V put(@ParametricNullness K key, @ParametricNullness V value) {
        return put(key, value, false);
    }

    @CheckForNull
    V put(@ParametricNullness K key, @ParametricNullness V value, boolean force) {
        int iSmearedHash = Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v2 = this.values[iFindEntryByKey];
            if (Objects.equal(v2, value)) {
                return value;
            }
            replaceValueInEntry(iFindEntryByKey, value, force);
            return v2;
        }
        int iSmearedHash2 = Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash2);
        if (!force) {
            Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", value);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = key;
        this.values[i2] = value;
        insertIntoTableKToV(i2, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @CheckForNull
    K putInverse(@ParametricNullness V value, @ParametricNullness K key, boolean force) {
        int iSmearedHash = Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k2 = this.keys[iFindEntryByValue];
            if (Objects.equal(k2, key)) {
                return key;
            }
            replaceKeyInEntry(iFindEntryByValue, key, force);
            return k2;
        }
        int i2 = this.lastInInsertionOrder;
        int iSmearedHash2 = Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash2);
        if (!force) {
            Preconditions.checkArgument(iFindEntryByKey == -1, "Key already present: %s", key);
        } else if (iFindEntryByKey != -1) {
            i2 = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i3 = this.size;
        kArr[i3] = key;
        this.values[i3] = value;
        insertIntoTableKToV(i3, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        int i4 = i2 == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i2];
        setSucceeds(i2, this.size);
        setSucceeds(this.size, i4);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object key) {
        int iSmearedHash = Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v2 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v2;
    }

    void removeEntry(int entry) {
        removeEntryKeyHashKnown(entry, Hashing.smearedHash(this.keys[entry]));
    }

    void removeEntryKeyHashKnown(int entry, int keyHash) {
        removeEntry(entry, keyHash, Hashing.smearedHash(this.values[entry]));
    }

    void removeEntryValueHashKnown(int entry, int valueHash) {
        removeEntry(entry, Hashing.smearedHash(this.keys[entry]), valueHash);
    }

    @CheckForNull
    K removeInverse(@CheckForNull Object value) {
        int iSmearedHash = Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k2 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }
}

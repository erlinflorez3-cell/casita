package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();

    @CheckForNull
    transient int[] entries;

    @CheckForNull
    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySetView;

    @CheckForNull
    @LazyInit
    private transient Set<K> keySetView;

    @CheckForNull
    transient Object[] keys;
    private transient int metadata;
    private transient int size;

    @CheckForNull
    private transient Object table;

    @CheckForNull
    transient Object[] values;

    @CheckForNull
    @LazyInit
    private transient Collection<V> valuesView;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$1 */
    class AnonymousClass1 extends CompactHashMap<K, V>.Itr<K> {
        AnonymousClass1() {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        @ParametricNullness
        K getOutput(int i2) {
            return (K) CompactHashMap.this.key(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$2 */
    class AnonymousClass2 extends CompactHashMap<K, V>.Itr<Map.Entry<K, V>> {
        AnonymousClass2() {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public Map.Entry<K, V> getOutput(int entry) {
            return new MapEntry(entry);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$3 */
    class AnonymousClass3 extends CompactHashMap<K, V>.Itr<V> {
        AnonymousClass3() {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        @ParametricNullness
        V getOutput(int i2) {
            return (V) CompactHashMap.this.value(i2);
        }
    }

    class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o2) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(o2);
            }
            if (!(o2 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o2;
            int iIndexOf = CompactHashMap.this.indexOf(entry.getKey());
            return iIndexOf != -1 && Objects.equal(CompactHashMap.this.value(iIndexOf), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o2) {
            int iHashTableMask;
            int iRemove;
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(o2);
            }
            if (!(o2 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o2;
            if (CompactHashMap.this.needsAllocArrays() || (iRemove = CompactHashing.remove(entry.getKey(), entry.getValue(), (iHashTableMask = CompactHashMap.this.hashTableMask()), CompactHashMap.this.requireTable(), CompactHashMap.this.requireEntries(), CompactHashMap.this.requireKeys(), CompactHashMap.this.requireValues())) == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iRemove, iHashTableMask);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    private abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        private Itr() {
            this.expectedMetadata = CompactHashMap.this.metadata;
            this.currentIndex = CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        /* synthetic */ Itr(CompactHashMap compactHashMap, AnonymousClass1 anonymousClass1) {
            this();
        }

        private void checkForConcurrentModification() {
            if (CompactHashMap.this.metadata != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }

        @ParametricNullness
        abstract T getOutput(int entry);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.currentIndex;
            this.indexToRemove = i2;
            T output = getOutput(i2);
            this.currentIndex = CompactHashMap.this.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.indexToRemove));
            this.currentIndex = CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }
    }

    class KeySetView extends AbstractSet<K> {
        KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o2) {
            return CompactHashMap.this.containsKey(o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o2) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().remove(o2) : CompactHashMap.this.removeHelper(o2) != CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    final class MapEntry extends AbstractMapEntry<K, V> {

        @ParametricNullness
        private final K key;
        private int lastKnownIndex;

        MapEntry(int i2) {
            this.key = (K) CompactHashMap.this.key(i2);
            this.lastKnownIndex = i2;
        }

        private void updateLastKnownIndex() {
            int i2 = this.lastKnownIndex;
            if (i2 == -1 || i2 >= CompactHashMap.this.size() || !Objects.equal(this.key, CompactHashMap.this.key(this.lastKnownIndex))) {
                this.lastKnownIndex = CompactHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i2 = this.lastKnownIndex;
            return i2 == -1 ? (V) NullnessCasts.unsafeNull() : (V) CompactHashMap.this.value(i2);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v2) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.put(this.key, v2));
            }
            updateLastKnownIndex();
            int i2 = this.lastKnownIndex;
            if (i2 == -1) {
                CompactHashMap.this.put(this.key, v2);
                return (V) NullnessCasts.unsafeNull();
            }
            V v3 = (V) CompactHashMap.this.value(i2);
            CompactHashMap.this.setValue(this.lastKnownIndex, v2);
            return v3;
        }
    }

    class ValuesView extends AbstractCollection<V> {
        ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    CompactHashMap() {
        init(3);
    }

    CompactHashMap(int expectedSize) {
        init(expectedSize);
    }

    static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i2 = compactHashMap.size;
        compactHashMap.size = i2 - 1;
        return i2;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int expectedSize) {
        return new CompactHashMap<>(expectedSize);
    }

    private int entry(int i2) {
        return requireEntries()[i2];
    }

    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    public int indexOf(@CheckForNull Object key) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iSmearedHash = Hashing.smearedHash(key);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i2 = iTableGet - 1;
            int iEntry = entry(i2);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && Objects.equal(key, key(i2))) {
                return i2;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return -1;
    }

    public K key(int i2) {
        return (K) requireKeys()[i2];
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
            put(stream.readObject(), stream.readObject());
        }
    }

    public Object removeHelper(@CheckForNull Object key) {
        int iHashTableMask;
        int iRemove;
        if (!needsAllocArrays() && (iRemove = CompactHashing.remove(key, null, (iHashTableMask = hashTableMask()), requireTable(), requireEntries(), requireKeys(), null)) != -1) {
            V vValue = value(iRemove);
            moveLastEntry(iRemove, iHashTableMask);
            this.size--;
            incrementModCount();
            return vValue;
        }
        return NOT_FOUND;
    }

    public int[] requireEntries() {
        return (int[]) java.util.Objects.requireNonNull(this.entries);
    }

    public Object[] requireKeys() {
        return (Object[]) java.util.Objects.requireNonNull(this.keys);
    }

    public Object requireTable() {
        return java.util.Objects.requireNonNull(this.table);
    }

    public Object[] requireValues() {
        return (Object[]) java.util.Objects.requireNonNull(this.values);
    }

    private void resizeMeMaybe(int newSize) {
        int length = requireEntries().length;
        if (newSize > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            int iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (iMax + 1) - (iMax & 1));
            if (iMin != length) {
                resizeEntries(iMin);
            }
        }
    }

    private int resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object objCreateTable = CompactHashing.createTable(newCapacity);
        int i2 = newCapacity - 1;
        if (targetEntryIndex != 0) {
            CompactHashing.tableSet(objCreateTable, targetHash & i2, targetEntryIndex + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i3 = 0; i3 <= oldMask; i3++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i3);
            while (iTableGet != 0) {
                int i4 = iTableGet - 1;
                int i5 = iArrRequireEntries[i4];
                int hashPrefix = CompactHashing.getHashPrefix(i5, oldMask);
                int i6 = (hashPrefix + i3) - (hashPrefix & i3);
                int i7 = i6 & i2;
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i7);
                CompactHashing.tableSet(objCreateTable, i7, iTableGet);
                iArrRequireEntries[i4] = CompactHashing.maskCombine(i6, iTableGet2, i2);
                iTableGet = CompactHashing.getNext(i5, oldMask);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i2);
        return i2;
    }

    private void setEntry(int i2, int value) {
        requireEntries()[i2] = value;
    }

    private void setHashTableMask(int mask) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    private void setKey(int i2, K key) {
        requireKeys()[i2] = key;
    }

    public void setValue(int i2, V value) {
        requireValues()[i2] = value;
    }

    public V value(int i2) {
        return (V) requireValues()[i2];
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            stream.writeObject(next.getKey());
            stream.writeObject(next.getValue());
        }
    }

    void accessEntry(int index) {
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
        this.keys = new Object[i2];
        this.values = new Object[i2];
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.containsKey(key) : indexOf(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(value);
        }
        for (int i2 = 0; i2 < this.size; i2++) {
            if (Objects.equal(value, value(i2))) {
                return true;
            }
        }
        return false;
    }

    Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    Set<Map.Entry<K, V>> createEntrySet() {
        return new EntrySetView();
    }

    Map<K, V> createHashFloodingResistantDelegate(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f);
    }

    Set<K> createKeySet() {
        return new KeySetView();
    }

    Collection<V> createValues() {
        return new ValuesView();
    }

    @CheckForNull
    Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
    }

    Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new CompactHashMap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            AnonymousClass2() {
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            public Map.Entry<K, V> getOutput(int entry) {
                return new MapEntry(entry);
            }
        };
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(key);
        }
        int iIndexOf = indexOf(key);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
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

    void insertEntry(int entryIndex, @ParametricNullness K key, @ParametricNullness V value, int hash, int mask) {
        setEntry(entryIndex, CompactHashing.maskCombine(hash, 0, mask));
        setKey(entryIndex, key);
        setValue(entryIndex, value);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            AnonymousClass1() {
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            K getOutput(int i2) {
                return (K) CompactHashMap.this.key(i2);
            }
        };
    }

    void moveLastEntry(int dstIndex, int mask) {
        int i2;
        int i3;
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i4 = size - 1;
        if (dstIndex >= i4) {
            objArrRequireKeys[dstIndex] = null;
            objArrRequireValues[dstIndex] = null;
            iArrRequireEntries[dstIndex] = 0;
            return;
        }
        Object obj = objArrRequireKeys[i4];
        objArrRequireKeys[dstIndex] = obj;
        objArrRequireValues[dstIndex] = objArrRequireValues[i4];
        objArrRequireKeys[i4] = null;
        objArrRequireValues[i4] = null;
        iArrRequireEntries[dstIndex] = iArrRequireEntries[i4];
        iArrRequireEntries[i4] = 0;
        int iSmearedHash = (-1) - (((-1) - Hashing.smearedHash(obj)) | ((-1) - mask));
        int iTableGet = CompactHashing.tableGet(objRequireTable, iSmearedHash);
        if (iTableGet == size) {
            CompactHashing.tableSet(objRequireTable, iSmearedHash, dstIndex + 1);
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

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V put(@ParametricNullness K k2, @ParametricNullness V v2) {
        int i2;
        int i3;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k2, v2);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i4 = this.size;
        int i5 = i4 + 1;
        int iSmearedHash = Hashing.smearedHash(k2);
        int iHashTableMask = hashTableMask();
        int i6 = (iSmearedHash + iHashTableMask) - (iSmearedHash | iHashTableMask);
        int iTableGet = CompactHashing.tableGet(requireTable(), i6);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i7 = 0;
            do {
                i2 = iTableGet - 1;
                i3 = iArrRequireEntries[i2];
                if (CompactHashing.getHashPrefix(i3, iHashTableMask) == hashPrefix && Objects.equal(k2, objArrRequireKeys[i2])) {
                    V v3 = (V) objArrRequireValues[i2];
                    objArrRequireValues[i2] = v2;
                    accessEntry(i2);
                    return v3;
                }
                iTableGet = CompactHashing.getNext(i3, iHashTableMask);
                i7++;
            } while (iTableGet != 0);
            if (i7 >= 9) {
                return convertToHashFloodingResistantImplementation().put(k2, v2);
            }
            if (i5 > iHashTableMask) {
                iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i4);
            } else {
                iArrRequireEntries[i2] = CompactHashing.maskCombine(i3, i5, iHashTableMask);
            }
        } else if (i5 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i4);
        } else {
            CompactHashing.tableSet(requireTable(), i6, i5);
        }
        resizeMeMaybe(i5);
        insertEntry(i4, k2, v2, iSmearedHash, iHashTableMask);
        this.size = i5;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v2 = (V) removeHelper(obj);
        if (v2 == NOT_FOUND) {
            return null;
        }
        return v2;
    }

    void resizeEntries(int newCapacity) {
        this.entries = Arrays.copyOf(requireEntries(), newCapacity);
        this.keys = Arrays.copyOf(requireKeys(), newCapacity);
        this.values = Arrays.copyOf(requireValues(), newCapacity);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.size;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.table = mapCreateHashFloodingResistantDelegate;
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

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            AnonymousClass3() {
            }

            @Override // com.google.common.collect.CompactHashMap.Itr
            @ParametricNullness
            V getOutput(int i2) {
                return (V) CompactHashMap.this.value(i2);
            }
        };
    }
}

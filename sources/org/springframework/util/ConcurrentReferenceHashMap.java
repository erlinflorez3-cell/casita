package org.springframework.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentReferenceHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final ReferenceType DEFAULT_REFERENCE_TYPE = ReferenceType.SOFT;
    private static final int MAXIMUM_CONCURRENCY_LEVEL = 65536;
    private static final int MAXIMUM_SEGMENT_SIZE = 1073741824;
    private Set<Map.Entry<K, V>> entrySet;
    private final float loadFactor;
    private final ReferenceType referenceType;
    private final ConcurrentReferenceHashMap<K, V>.Segment[] segments;
    private final int shift;

    private abstract class Entries {
        private Entries() {
        }

        public abstract void add(V v2);
    }

    protected static final class Entry<K, V> implements Map.Entry<K, V> {
        private final K key;
        private volatile V value;

        public Entry(K k2, V v2) {
            this.key = k2;
            this.value = v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return ObjectUtils.nullSafeEquals(getKey(), entry.getKey()) && ObjectUtils.nullSafeEquals(getValue(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return ObjectUtils.nullSafeHashCode(this.key) ^ ObjectUtils.nullSafeHashCode(this.value);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v3 = this.value;
            this.value = v2;
            return v3;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    private class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private Entry<K, V> last;
        private Entry<K, V> next;
        private Reference<K, V> reference;
        private int referenceIndex;
        private Reference<K, V>[] references;
        private int segmentIndex;

        public EntryIterator() {
            moveToNextSegment();
        }

        private void getNextIfNecessary() {
            while (this.next == null) {
                moveToNextReference();
                Reference<K, V> reference = this.reference;
                if (reference == null) {
                    return;
                } else {
                    this.next = reference.get();
                }
            }
        }

        private void moveToNextReference() {
            Reference<K, V>[] referenceArr;
            Reference<K, V> reference = this.reference;
            if (reference != null) {
                this.reference = reference.getNext();
            }
            while (this.reference == null && (referenceArr = this.references) != null) {
                int i2 = this.referenceIndex;
                if (i2 >= referenceArr.length) {
                    moveToNextSegment();
                    this.referenceIndex = 0;
                } else {
                    this.reference = referenceArr[i2];
                    this.referenceIndex = i2 + 1;
                }
            }
        }

        private void moveToNextSegment() {
            this.reference = null;
            this.references = null;
            if (this.segmentIndex < ConcurrentReferenceHashMap.this.segments.length) {
                this.references = ConcurrentReferenceHashMap.this.segments[this.segmentIndex].references;
                this.segmentIndex++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            getNextIfNecessary();
            return this.next != null;
        }

        @Override // java.util.Iterator
        public Entry<K, V> next() {
            getNextIfNecessary();
            Entry<K, V> entry = this.next;
            if (entry == null) {
                throw new NoSuchElementException();
            }
            this.last = entry;
            this.next = null;
            return entry;
        }

        @Override // java.util.Iterator
        public void remove() {
            Assert.state(this.last != null);
            ConcurrentReferenceHashMap.this.remove(this.last.getKey());
        }
    }

    private class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentReferenceHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj == null || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Reference<K, V> reference = ConcurrentReferenceHashMap.this.getReference(entry.getKey(), Restructure.NEVER);
            Entry<K, V> entry2 = reference != null ? reference.get() : null;
            if (entry2 != null) {
                return ObjectUtils.nullSafeEquals(entry.getValue(), entry2.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return ConcurrentReferenceHashMap.this.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentReferenceHashMap.this.size();
        }
    }

    protected interface Reference<K, V> {
        Entry<K, V> get();

        int getHash();

        Reference<K, V> getNext();

        void release();
    }

    protected class ReferenceManager {
        private final ReferenceQueue<Entry<K, V>> queue = new ReferenceQueue<>();

        protected ReferenceManager() {
        }

        public Reference<K, V> createReference(Entry<K, V> entry, int i2, Reference<K, V> reference) {
            return ConcurrentReferenceHashMap.this.referenceType == ReferenceType.WEAK ? new WeakEntryReference(entry, i2, reference, this.queue) : new SoftEntryReference(entry, i2, reference, this.queue);
        }

        public Reference<K, V> pollForPurge() {
            return (Reference) this.queue.poll();
        }
    }

    public enum ReferenceType {
        SOFT,
        WEAK
    }

    protected enum Restructure {
        WHEN_NECESSARY,
        NEVER
    }

    protected final class Segment extends ReentrantLock {
        private volatile int count = 0;
        private final int initialSize;
        private final ConcurrentReferenceHashMap<K, V>.ReferenceManager referenceManager;
        private volatile Reference<K, V>[] references;
        private int resizeThreshold;

        public Segment(int i2) {
            this.referenceManager = ConcurrentReferenceHashMap.this.createReferenceManager();
            int iCalculateShift = 1 << ConcurrentReferenceHashMap.calculateShift(i2, 1073741824);
            this.initialSize = iCalculateShift;
            setReferences(createReferenceArray(iCalculateShift));
        }

        static /* synthetic */ int access$508(Segment segment) {
            int i2 = segment.count;
            segment.count = i2 + 1;
            return i2;
        }

        private Reference<K, V>[] createReferenceArray(int i2) {
            return (Reference[]) Array.newInstance((Class<?>) Reference.class, i2);
        }

        private Reference<K, V> findInChain(Reference<K, V> reference, Object obj, int i2) {
            Entry<K, V> entry;
            K key;
            while (reference != null) {
                if (reference.getHash() == i2 && (entry = reference.get()) != null && ((key = entry.getKey()) == obj || key.equals(obj))) {
                    return reference;
                }
                reference = reference.getNext();
            }
            return null;
        }

        private int getIndex(int i2, Reference<K, V>[] referenceArr) {
            return i2 & (referenceArr.length - 1);
        }

        private void setReferences(Reference<K, V>[] referenceArr) {
            this.references = referenceArr;
            this.resizeThreshold = (int) (referenceArr.length * ConcurrentReferenceHashMap.this.getLoadFactor());
        }

        public void clear() {
            if (this.count == 0) {
                return;
            }
            lock();
            try {
                setReferences(createReferenceArray(this.initialSize));
                this.count = 0;
            } finally {
                unlock();
            }
        }

        public <T> T doTask(final int i2, final Object obj, ConcurrentReferenceHashMap<K, V>.Task<T> task) {
            boolean zHasOption = task.hasOption(TaskOption.RESIZE);
            if (task.hasOption(TaskOption.RESTRUCTURE_BEFORE)) {
                restructureIfNecessary(zHasOption);
            }
            if (task.hasOption(TaskOption.SKIP_IF_EMPTY) && this.count == 0) {
                return task.execute(null, null, null);
            }
            lock();
            try {
                final int index = getIndex(i2, this.references);
                final Reference<K, V> reference = this.references[index];
                Reference<K, V> referenceFindInChain = findInChain(reference, obj, i2);
                return task.execute(referenceFindInChain, referenceFindInChain != null ? referenceFindInChain.get() : null, new ConcurrentReferenceHashMap<K, V>.Entries() { // from class: org.springframework.util.ConcurrentReferenceHashMap.Segment.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // org.springframework.util.ConcurrentReferenceHashMap.Entries
                    public void add(V v2) {
                        Segment.this.references[index] = Segment.this.referenceManager.createReference(new Entry<>(obj, v2), i2, reference);
                        Segment.access$508(Segment.this);
                    }
                });
            } finally {
                unlock();
                if (task.hasOption(TaskOption.RESTRUCTURE_AFTER)) {
                    restructureIfNecessary(zHasOption);
                }
            }
        }

        public final int getCount() {
            return this.count;
        }

        public Reference<K, V> getReference(Object obj, int i2, Restructure restructure) {
            if (restructure == Restructure.WHEN_NECESSARY) {
                restructureIfNecessary(false);
            }
            if (this.count == 0) {
                return null;
            }
            Reference<K, V>[] referenceArr = this.references;
            return findInChain(referenceArr[getIndex(i2, referenceArr)], obj, i2);
        }

        public final int getSize() {
            return this.references.length;
        }

        protected final void restructureIfNecessary(boolean z2) {
            boolean z3 = true;
            boolean z4 = this.count > 0 && this.count >= this.resizeThreshold;
            Reference<K, V> referencePollForPurge = this.referenceManager.pollForPurge();
            if (referencePollForPurge != null || (z4 && z2)) {
                lock();
                try {
                    int i2 = this.count;
                    Set setEmptySet = Collections.emptySet();
                    if (referencePollForPurge != null) {
                        setEmptySet = new HashSet();
                        while (referencePollForPurge != null) {
                            setEmptySet.add(referencePollForPurge);
                            referencePollForPurge = this.referenceManager.pollForPurge();
                        }
                    }
                    int size = i2 - setEmptySet.size();
                    boolean z5 = size > 0 && size >= this.resizeThreshold;
                    int length = this.references.length;
                    if (z2 && z5 && length < 1073741824) {
                        length <<= 1;
                    } else {
                        z3 = false;
                    }
                    Reference<K, V>[] referenceArrCreateReferenceArray = z3 ? createReferenceArray(length) : this.references;
                    for (int i3 = 0; i3 < this.references.length; i3++) {
                        if (!z3) {
                            referenceArrCreateReferenceArray[i3] = null;
                        }
                        for (Reference<K, V> next = this.references[i3]; next != null; next = next.getNext()) {
                            if (!setEmptySet.contains(next) && next.get() != null) {
                                int index = getIndex(next.getHash(), referenceArrCreateReferenceArray);
                                referenceArrCreateReferenceArray[index] = this.referenceManager.createReference(next.get(), next.getHash(), referenceArrCreateReferenceArray[index]);
                            }
                        }
                    }
                    if (z3) {
                        setReferences(referenceArrCreateReferenceArray);
                    }
                    this.count = Math.max(size, 0);
                } finally {
                    unlock();
                }
            }
        }
    }

    private static final class SoftEntryReference<K, V> extends SoftReference<Entry<K, V>> implements Reference<K, V> {
        private final int hash;
        private final Reference<K, V> nextReference;

        public SoftEntryReference(Entry<K, V> entry, int i2, Reference<K, V> reference, ReferenceQueue<Entry<K, V>> referenceQueue) {
            super(entry, referenceQueue);
            this.hash = i2;
            this.nextReference = reference;
        }

        @Override // java.lang.ref.SoftReference, java.lang.ref.Reference, org.springframework.util.ConcurrentReferenceHashMap.Reference
        public /* bridge */ /* synthetic */ Entry get() {
            return (Entry) super.get();
        }

        @Override // org.springframework.util.ConcurrentReferenceHashMap.Reference
        public int getHash() {
            return this.hash;
        }

        @Override // org.springframework.util.ConcurrentReferenceHashMap.Reference
        public Reference<K, V> getNext() {
            return this.nextReference;
        }

        @Override // org.springframework.util.ConcurrentReferenceHashMap.Reference
        public void release() {
            enqueue();
            clear();
        }
    }

    private abstract class Task<T> {
        private final EnumSet<TaskOption> options;

        public Task(TaskOption... taskOptionArr) {
            this.options = taskOptionArr.length == 0 ? EnumSet.noneOf(TaskOption.class) : EnumSet.of(taskOptionArr[0], taskOptionArr);
        }

        protected T execute(Reference<K, V> reference, Entry<K, V> entry) {
            return null;
        }

        protected T execute(Reference<K, V> reference, Entry<K, V> entry, ConcurrentReferenceHashMap<K, V>.Entries entries) {
            return execute(reference, entry);
        }

        public boolean hasOption(TaskOption taskOption) {
            return this.options.contains(taskOption);
        }
    }

    private enum TaskOption {
        RESTRUCTURE_BEFORE,
        RESTRUCTURE_AFTER,
        SKIP_IF_EMPTY,
        RESIZE
    }

    private static final class WeakEntryReference<K, V> extends WeakReference<Entry<K, V>> implements Reference<K, V> {
        private final int hash;
        private final Reference<K, V> nextReference;

        public WeakEntryReference(Entry<K, V> entry, int i2, Reference<K, V> reference, ReferenceQueue<Entry<K, V>> referenceQueue) {
            super(entry, referenceQueue);
            this.hash = i2;
            this.nextReference = reference;
        }

        @Override // java.lang.ref.Reference, org.springframework.util.ConcurrentReferenceHashMap.Reference
        public /* bridge */ /* synthetic */ Entry get() {
            return (Entry) super.get();
        }

        @Override // org.springframework.util.ConcurrentReferenceHashMap.Reference
        public int getHash() {
            return this.hash;
        }

        @Override // org.springframework.util.ConcurrentReferenceHashMap.Reference
        public Reference<K, V> getNext() {
            return this.nextReference;
        }

        @Override // org.springframework.util.ConcurrentReferenceHashMap.Reference
        public void release() {
            enqueue();
            clear();
        }
    }

    public ConcurrentReferenceHashMap() {
        this(16, 0.75f, 16, DEFAULT_REFERENCE_TYPE);
    }

    public ConcurrentReferenceHashMap(int i2) {
        this(i2, 0.75f, 16, DEFAULT_REFERENCE_TYPE);
    }

    public ConcurrentReferenceHashMap(int i2, float f2) {
        this(i2, f2, 16, DEFAULT_REFERENCE_TYPE);
    }

    public ConcurrentReferenceHashMap(int i2, float f2, int i3) {
        this(i2, f2, i3, DEFAULT_REFERENCE_TYPE);
    }

    public ConcurrentReferenceHashMap(int i2, float f2, int i3, ReferenceType referenceType) {
        int i4 = 0;
        Assert.isTrue(i2 >= 0, "Initial capacity must not be negative");
        Assert.isTrue(f2 > 0.0f, "Load factor must be positive");
        Assert.isTrue(i3 > 0, "Concurrency level must be positive");
        Assert.notNull(referenceType, "Reference type must not be null");
        this.loadFactor = f2;
        int iCalculateShift = calculateShift(i3, 65536);
        this.shift = iCalculateShift;
        int i5 = 1 << iCalculateShift;
        this.referenceType = referenceType;
        int i6 = (int) ((((long) (i2 + i5)) - 1) / ((long) i5));
        this.segments = (Segment[]) Array.newInstance((Class<?>) Segment.class, i5);
        while (true) {
            ConcurrentReferenceHashMap<K, V>.Segment[] segmentArr = this.segments;
            if (i4 >= segmentArr.length) {
                return;
            }
            segmentArr[i4] = new Segment(i6);
            i4++;
        }
    }

    public ConcurrentReferenceHashMap(int i2, int i3) {
        this(i2, 0.75f, i3, DEFAULT_REFERENCE_TYPE);
    }

    public ConcurrentReferenceHashMap(int i2, ReferenceType referenceType) {
        this(i2, 0.75f, 16, referenceType);
    }

    protected static int calculateShift(int i2, int i3) {
        int i4 = 0;
        int i5 = 1;
        while (i5 < i2 && i5 < i3) {
            i5 <<= 1;
            i4++;
        }
        return i4;
    }

    private <T> T doTask(Object obj, ConcurrentReferenceHashMap<K, V>.Task<T> task) {
        int hash = getHash(obj);
        return (T) getSegmentForHash(hash).doTask(hash, obj, task);
    }

    private ConcurrentReferenceHashMap<K, V>.Segment getSegmentForHash(int i2) {
        ConcurrentReferenceHashMap<K, V>.Segment[] segmentArr = this.segments;
        int i3 = i2 >>> (32 - this.shift);
        int length = segmentArr.length - 1;
        return segmentArr[(i3 + length) - (i3 | length)];
    }

    private V put(K k2, final V v2, final boolean z2) {
        return (V) doTask(k2, new ConcurrentReferenceHashMap<K, V>.Task<V>(new TaskOption[]{TaskOption.RESTRUCTURE_BEFORE, TaskOption.RESIZE}) { // from class: org.springframework.util.ConcurrentReferenceHashMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.springframework.util.ConcurrentReferenceHashMap.Task
            protected V execute(Reference<K, V> reference, Entry<K, V> entry, ConcurrentReferenceHashMap<K, V>.Entries entries) {
                if (entry == 0) {
                    entries.add(v2);
                    return null;
                }
                V v3 = (V) entry.getValue();
                if (z2) {
                    entry.setValue(v2);
                }
                return v3;
            }
        });
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (ConcurrentReferenceHashMap<K, V>.Segment segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Reference<K, V> reference = getReference(obj, Restructure.WHEN_NECESSARY);
        Entry<K, V> entry = reference != null ? reference.get() : null;
        return entry != null && ObjectUtils.nullSafeEquals(entry.getKey(), obj);
    }

    protected ConcurrentReferenceHashMap<K, V>.ReferenceManager createReferenceManager() {
        return new ReferenceManager();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.entrySet == null) {
            this.entrySet = new EntrySet();
        }
        return this.entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Reference<K, V> reference = getReference(obj, Restructure.WHEN_NECESSARY);
        Entry<K, V> entry = reference != null ? reference.get() : null;
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    protected int getHash(Object obj) {
        int iHashCode = obj == null ? 0 : obj.hashCode();
        int i2 = iHashCode + ((iHashCode << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    protected final float getLoadFactor() {
        return this.loadFactor;
    }

    protected final Reference<K, V> getReference(Object obj, Restructure restructure) {
        int hash = getHash(obj);
        return getSegmentForHash(hash).getReference(obj, hash, restructure);
    }

    protected final ConcurrentReferenceHashMap<K, V>.Segment getSegment(int i2) {
        return this.segments[i2];
    }

    protected final int getSegmentsSize() {
        return this.segments.length;
    }

    public void purgeUnreferencedEntries() {
        for (ConcurrentReferenceHashMap<K, V>.Segment segment : this.segments) {
            segment.restructureIfNecessary(false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        return put(k2, v2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        return put(k2, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) doTask(obj, new ConcurrentReferenceHashMap<K, V>.Task<V>(TaskOption.RESTRUCTURE_AFTER, TaskOption.SKIP_IF_EMPTY) { // from class: org.springframework.util.ConcurrentReferenceHashMap.2
            @Override // org.springframework.util.ConcurrentReferenceHashMap.Task
            protected V execute(Reference<K, V> reference, Entry<K, V> entry) {
                if (entry == null) {
                    return null;
                }
                reference.release();
                return (V) ((Entry) entry).value;
            }
        });
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, final Object obj2) {
        return ((Boolean) doTask(obj, new ConcurrentReferenceHashMap<K, V>.Task<Boolean>(new TaskOption[]{TaskOption.RESTRUCTURE_AFTER, TaskOption.SKIP_IF_EMPTY}) { // from class: org.springframework.util.ConcurrentReferenceHashMap.3
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.springframework.util.ConcurrentReferenceHashMap.Task
            public Boolean execute(Reference<K, V> reference, Entry<K, V> entry) {
                if (entry == null || !ObjectUtils.nullSafeEquals(entry.getValue(), obj2)) {
                    return false;
                }
                reference.release();
                return true;
            }
        })).booleanValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, final V v2) {
        return (V) doTask(k2, new ConcurrentReferenceHashMap<K, V>.Task<V>(new TaskOption[]{TaskOption.RESTRUCTURE_BEFORE, TaskOption.SKIP_IF_EMPTY}) { // from class: org.springframework.util.ConcurrentReferenceHashMap.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.springframework.util.ConcurrentReferenceHashMap.Task
            protected V execute(Reference<K, V> reference, Entry<K, V> entry) {
                if (entry == 0) {
                    return null;
                }
                V v3 = (V) entry.getValue();
                entry.setValue(v2);
                return v3;
            }
        });
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, final V v2, final V v3) {
        return ((Boolean) doTask(k2, new ConcurrentReferenceHashMap<K, V>.Task<Boolean>(new TaskOption[]{TaskOption.RESTRUCTURE_BEFORE, TaskOption.SKIP_IF_EMPTY}) { // from class: org.springframework.util.ConcurrentReferenceHashMap.4
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.springframework.util.ConcurrentReferenceHashMap.Task
            public Boolean execute(Reference<K, V> reference, Entry<K, V> entry) {
                if (entry == 0 || !ObjectUtils.nullSafeEquals(entry.getValue(), v2)) {
                    return false;
                }
                entry.setValue(v3);
                return true;
            }
        })).booleanValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        int count = 0;
        for (ConcurrentReferenceHashMap<K, V>.Segment segment : this.segments) {
            count += segment.getCount();
        }
        return count;
    }
}

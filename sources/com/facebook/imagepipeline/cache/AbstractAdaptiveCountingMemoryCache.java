package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.MemoryCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractAdaptiveCountingMemoryCache<K, V> implements CountingMemoryCache<K, V> {
    static final int DEFAULT_ADAPTIVE_RATE_PROMIL = 10;
    static final int DEFAULT_LFU_FRACTION_PROMIL = 500;
    static final int MAX_FRACTION_PROMIL = 900;
    static final int MIN_FRACTION_PROMIL = 100;
    private static final String TAG = "AbstractArcCountingMemoryCache";
    static final int TOTAL_PROMIL = 1000;
    final int mAdaptiveRatePromil;
    private final MemoryCache.CacheTrimStrategy mCacheTrimStrategy;
    final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mCachedEntries;
    private final int mFrequentlyUsedThreshold;
    final int mGhostListMaxSize;
    int mLFUFractionPromil;
    private long mLastCacheParamsCheck;
    final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mLeastFrequentlyUsedExclusiveEntries;
    final AbstractAdaptiveCountingMemoryCache<K, V>.IntMapArrayList<K> mLeastFrequentlyUsedKeysGhostList;
    protected MemoryCacheParams mMemoryCacheParams;
    private final Supplier<MemoryCacheParams> mMemoryCacheParamsSupplier;
    final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mMostFrequentlyUsedExclusiveEntries;
    final ArrayList<K> mMostFrequentlyUsedKeysGhostList;
    private final ValueDescriptor<V> mValueDescriptor;

    enum ArrayListType {
        LFU,
        MFU
    }

    class IntMapArrayList<E> {
        private final ArrayList<E> mFirstList;
        private final int mMaxCapacity;
        private final ArrayList<Integer> mSecondList;

        public IntMapArrayList(int i2) {
            this.mFirstList = new ArrayList<>(i2);
            this.mSecondList = new ArrayList<>(i2);
            this.mMaxCapacity = i2;
        }

        public void addPair(E e2, Integer num) {
            if (this.mFirstList.size() == this.mMaxCapacity) {
                this.mFirstList.remove(0);
                this.mSecondList.remove(0);
            }
            this.mFirstList.add(e2);
            this.mSecondList.add(num);
        }

        public boolean contains(E e2) {
            return this.mFirstList.contains(e2);
        }

        @Nullable
        public Integer getValue(E e2) {
            int iIndexOf = this.mFirstList.indexOf(e2);
            if (iIndexOf < 0) {
                return null;
            }
            return this.mSecondList.get(iIndexOf);
        }

        public void increaseValueIfExists(E e2) {
            int iIndexOf = this.mFirstList.indexOf(e2);
            if (iIndexOf < 0) {
                return;
            }
            Integer numValueOf = Integer.valueOf(this.mSecondList.get(iIndexOf).intValue() + 1);
            int i2 = this.mMaxCapacity;
            if (iIndexOf == i2 - 1) {
                this.mSecondList.set(i2 - 1, numValueOf);
                return;
            }
            this.mFirstList.remove(iIndexOf);
            this.mSecondList.remove(iIndexOf);
            this.mFirstList.add(e2);
            this.mSecondList.add(numValueOf);
        }

        public int size() {
            return this.mFirstList.size();
        }
    }

    public AbstractAdaptiveCountingMemoryCache(Supplier<MemoryCacheParams> supplier, MemoryCache.CacheTrimStrategy cacheTrimStrategy, ValueDescriptor<V> valueDescriptor, int i2, int i3, int i4, int i5) {
        FLog.d(TAG, "Create Adaptive Replacement Cache");
        this.mValueDescriptor = valueDescriptor;
        this.mLeastFrequentlyUsedExclusiveEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mMostFrequentlyUsedExclusiveEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mCachedEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mCacheTrimStrategy = cacheTrimStrategy;
        this.mMemoryCacheParamsSupplier = supplier;
        this.mMemoryCacheParams = (MemoryCacheParams) Preconditions.checkNotNull(supplier.get(), "mMemoryCacheParamsSupplier returned null");
        this.mLastCacheParamsCheck = SystemClock.uptimeMillis();
        this.mFrequentlyUsedThreshold = i3;
        this.mGhostListMaxSize = i4;
        this.mLeastFrequentlyUsedKeysGhostList = new IntMapArrayList<>(i4);
        this.mMostFrequentlyUsedKeysGhostList = new ArrayList<>(i4);
        if (i5 < 100 || i5 > 900) {
            this.mLFUFractionPromil = 500;
            logIllegalLfuFraction();
        } else {
            this.mLFUFractionPromil = i5;
        }
        if (i2 > 0 && i2 < 1000) {
            this.mAdaptiveRatePromil = i2;
        } else {
            this.mAdaptiveRatePromil = 10;
            logIllegalAdaptiveRate();
        }
    }

    private synchronized void addElementToGhostList(K k2, int i2, ArrayListType arrayListType) {
        if (arrayListType == ArrayListType.LFU) {
            this.mLeastFrequentlyUsedKeysGhostList.addPair(k2, Integer.valueOf(i2));
        } else {
            if (this.mMostFrequentlyUsedKeysGhostList.size() == this.mGhostListMaxSize) {
                this.mMostFrequentlyUsedKeysGhostList.remove(0);
            }
            this.mMostFrequentlyUsedKeysGhostList.add(k2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean canCacheNewValue(V r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.facebook.imagepipeline.cache.ValueDescriptor<V> r0 = r4.mValueDescriptor     // Catch: java.lang.Throwable -> L29
            int r3 = r0.getSizeInBytes(r5)     // Catch: java.lang.Throwable -> L29
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = r4.mMemoryCacheParams     // Catch: java.lang.Throwable -> L29
            int r0 = r0.maxCacheEntrySize     // Catch: java.lang.Throwable -> L29
            if (r3 > r0) goto L22
            int r1 = r4.getInUseCount()     // Catch: java.lang.Throwable -> L29
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = r4.mMemoryCacheParams     // Catch: java.lang.Throwable -> L29
            int r0 = r0.maxCacheEntries     // Catch: java.lang.Throwable -> L29
            r2 = 1
            int r0 = r0 - r2
            if (r1 > r0) goto L22
            int r1 = r4.getInUseSizeInBytes()     // Catch: java.lang.Throwable -> L29
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = r4.mMemoryCacheParams     // Catch: java.lang.Throwable -> L29
            int r0 = r0.maxCacheSize     // Catch: java.lang.Throwable -> L29
            goto L24
        L22:
            r2 = 0
            goto L27
        L24:
            int r0 = r0 - r3
            if (r1 > r0) goto L22
        L27:
            monitor-exit(r4)
            return r2
        L29:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.AbstractAdaptiveCountingMemoryCache.canCacheNewValue(java.lang.Object):boolean");
    }

    private synchronized void decreaseClientCount(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(entry.clientCount > 0);
        entry.clientCount--;
    }

    private synchronized void increaseAccessCount(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.accessCount++;
    }

    private synchronized void increaseCounters(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.clientCount++;
        increaseAccessCount(entry);
    }

    private synchronized void makeOrphan(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.isOrphan = true;
    }

    private synchronized void makeOrphans(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<CountingMemoryCache.Entry<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                makeOrphan(it.next());
            }
        }
    }

    private synchronized void makeOrphans(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList, @Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList2) {
        makeOrphans(arrayList);
        makeOrphans(arrayList2);
    }

    private synchronized boolean maybeAddToExclusives(CountingMemoryCache.Entry<K, V> entry) {
        if (entry.isOrphan || entry.clientCount != 0) {
            return false;
        }
        if (entry.accessCount > this.mFrequentlyUsedThreshold) {
            this.mMostFrequentlyUsedExclusiveEntries.put(entry.key, entry);
        } else {
            this.mLeastFrequentlyUsedExclusiveEntries.put(entry.key, entry);
        }
        return true;
    }

    private void maybeClose(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<CountingMemoryCache.Entry<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                CloseableReference.closeSafely((CloseableReference<?>) referenceToClose(it.next()));
            }
        }
    }

    private void maybeClose(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList, @Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList2) {
        maybeClose(arrayList);
        maybeClose(arrayList2);
    }

    private void maybeNotifyExclusiveEntriesRemoval(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList, @Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList2) {
        maybeNotifyExclusiveEntryRemoval(arrayList);
        maybeNotifyExclusiveEntryRemoval(arrayList2);
    }

    private static <K, V> void maybeNotifyExclusiveEntryInsertion(@Nullable CountingMemoryCache.Entry<K, V> entry) {
        if (entry == null || entry.observer == null) {
            return;
        }
        entry.observer.onExclusivityChanged(entry.key, true);
    }

    private static <K, V> void maybeNotifyExclusiveEntryRemoval(@Nullable CountingMemoryCache.Entry<K, V> entry) {
        if (entry == null || entry.observer == null) {
            return;
        }
        entry.observer.onExclusivityChanged(entry.key, false);
    }

    private void maybeNotifyExclusiveEntryRemoval(@Nullable CountingMemoryCache.Entry<K, V> entry, @Nullable CountingMemoryCache.Entry<K, V> entry2) {
        maybeNotifyExclusiveEntryRemoval(entry);
        maybeNotifyExclusiveEntryRemoval(entry2);
    }

    private void maybeNotifyExclusiveEntryRemoval(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<CountingMemoryCache.Entry<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                maybeNotifyExclusiveEntryRemoval(it.next());
            }
        }
    }

    private synchronized void maybeUpdateCacheFraction(K k2) {
        if (this.mLeastFrequentlyUsedKeysGhostList.contains(k2)) {
            int i2 = this.mLFUFractionPromil;
            int i3 = this.mAdaptiveRatePromil;
            if (i2 + i3 <= 900) {
                this.mLFUFractionPromil = i2 + i3;
            }
            this.mLeastFrequentlyUsedKeysGhostList.increaseValueIfExists(k2);
        } else if (this.mLFUFractionPromil - this.mAdaptiveRatePromil >= 100 && this.mMostFrequentlyUsedKeysGhostList.contains(k2)) {
            this.mLFUFractionPromil -= this.mAdaptiveRatePromil;
        }
    }

    private synchronized void maybeUpdateCacheParams() {
        if (this.mLastCacheParamsCheck + this.mMemoryCacheParams.paramsCheckIntervalMs > SystemClock.uptimeMillis()) {
            return;
        }
        this.mLastCacheParamsCheck = SystemClock.uptimeMillis();
        this.mMemoryCacheParams = (MemoryCacheParams) Preconditions.checkNotNull(this.mMemoryCacheParamsSupplier.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized CloseableReference<V> newClientReference(final CountingMemoryCache.Entry<K, V> entry) {
        increaseCounters(entry);
        return CloseableReference.of(entry.valueRef.get(), new ResourceReleaser<V>() { // from class: com.facebook.imagepipeline.cache.AbstractAdaptiveCountingMemoryCache.2
            @Override // com.facebook.common.references.ResourceReleaser
            public void release(V v2) {
                AbstractAdaptiveCountingMemoryCache.this.releaseClientReference(entry);
            }
        });
    }

    @Nullable
    private synchronized CloseableReference<V> referenceToClose(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        return (entry.isOrphan && entry.clientCount == 0) ? entry.valueRef : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseClientReference(CountingMemoryCache.Entry<K, V> entry) {
        boolean zMaybeAddToExclusives;
        CloseableReference<V> closeableReferenceReferenceToClose;
        Preconditions.checkNotNull(entry);
        synchronized (this) {
            decreaseClientCount(entry);
            zMaybeAddToExclusives = maybeAddToExclusives(entry);
            closeableReferenceReferenceToClose = referenceToClose(entry);
        }
        CloseableReference.closeSafely((CloseableReference<?>) closeableReferenceReferenceToClose);
        if (!zMaybeAddToExclusives) {
            entry = null;
        }
        maybeNotifyExclusiveEntryInsertion(entry);
        maybeUpdateCacheParams();
        maybeEvictEntries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private synchronized ArrayList<CountingMemoryCache.Entry<K, V>> trimExclusivelyOwnedEntries(int i2, int i3, CountingLruMap<K, CountingMemoryCache.Entry<K, V>> countingLruMap, ArrayListType arrayListType) {
        int iMax = Math.max(i2, 0);
        int iMax2 = Math.max(i3, 0);
        if (countingLruMap.getCount() <= iMax && countingLruMap.getSizeInBytes() <= iMax2) {
            return null;
        }
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (countingLruMap.getCount() <= iMax && countingLruMap.getSizeInBytes() <= iMax2) {
                return arrayList;
            }
            Object objCheckNotNull = Preconditions.checkNotNull(countingLruMap.getFirstKey());
            addElementToGhostList(objCheckNotNull, ((CountingMemoryCache.Entry) Preconditions.checkNotNull((CountingMemoryCache.Entry) countingLruMap.get(objCheckNotNull))).accessCount, arrayListType);
            countingLruMap.remove(objCheckNotNull);
            arrayList.add(this.mCachedEntries.remove((K) objCheckNotNull));
        }
    }

    private ValueDescriptor<CountingMemoryCache.Entry<K, V>> wrapValueDescriptor(final ValueDescriptor<V> valueDescriptor) {
        return new ValueDescriptor<CountingMemoryCache.Entry<K, V>>() { // from class: com.facebook.imagepipeline.cache.AbstractAdaptiveCountingMemoryCache.1
            @Override // com.facebook.imagepipeline.cache.ValueDescriptor
            public int getSizeInBytes(CountingMemoryCache.Entry<K, V> entry) {
                return valueDescriptor.getSizeInBytes(entry.valueRef.get());
            }
        };
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> cache(K k2, CloseableReference<V> closeableReference) {
        return cache(k2, closeableReference, null);
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    @Nullable
    public CloseableReference<V> cache(K k2, CloseableReference<V> closeableReference, @Nullable CountingMemoryCache.EntryStateObserver<K> entryStateObserver) {
        CountingMemoryCache.Entry<K, V> entryRemove;
        CountingMemoryCache.Entry<K, V> entryRemove2;
        CloseableReference<V> closeableReferenceNewClientReference;
        CloseableReference<V> closeableReferenceReferenceToClose;
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(closeableReference);
        maybeUpdateCacheParams();
        synchronized (this) {
            entryRemove = this.mLeastFrequentlyUsedExclusiveEntries.remove(k2);
            entryRemove2 = this.mMostFrequentlyUsedExclusiveEntries.remove(k2);
            Preconditions.checkState(entryRemove == null || entryRemove2 == null);
            CountingMemoryCache.Entry<K, V> entryRemove3 = this.mCachedEntries.remove(k2);
            closeableReferenceNewClientReference = null;
            if (entryRemove3 != null) {
                makeOrphan(entryRemove3);
                closeableReferenceReferenceToClose = referenceToClose(entryRemove3);
            } else {
                closeableReferenceReferenceToClose = null;
            }
            if (canCacheNewValue(closeableReference.get())) {
                CountingMemoryCache.Entry<K, V> entryOf = CountingMemoryCache.Entry.of(k2, closeableReference, entryStateObserver);
                Integer value = this.mLeastFrequentlyUsedKeysGhostList.getValue(k2);
                entryOf.accessCount = value != null ? value.intValue() : 0;
                this.mCachedEntries.put(k2, entryOf);
                closeableReferenceNewClientReference = newClientReference(entryOf);
            }
        }
        CloseableReference.closeSafely((CloseableReference<?>) closeableReferenceReferenceToClose);
        maybeNotifyExclusiveEntryRemoval(entryRemove, entryRemove2);
        maybeEvictEntries();
        return closeableReferenceNewClientReference;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public void clear() {
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListClear;
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListClear2;
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListClear3;
        synchronized (this) {
            arrayListClear = this.mLeastFrequentlyUsedExclusiveEntries.clear();
            arrayListClear2 = this.mMostFrequentlyUsedExclusiveEntries.clear();
            arrayListClear3 = this.mCachedEntries.clear();
            makeOrphans(arrayListClear3);
        }
        maybeClose(arrayListClear3);
        maybeNotifyExclusiveEntriesRemoval(arrayListClear, arrayListClear2);
        maybeUpdateCacheParams();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized boolean contains(Predicate<K> predicate) {
        return !this.mCachedEntries.getMatchingEntries(predicate).isEmpty();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized boolean contains(K k2) {
        return this.mCachedEntries.contains(k2);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> get(K k2) {
        CountingMemoryCache.Entry<K, V> entryRemove;
        CountingMemoryCache.Entry<K, V> entryRemove2;
        CloseableReference<V> closeableReferenceNewClientReference;
        Preconditions.checkNotNull(k2);
        synchronized (this) {
            entryRemove = this.mLeastFrequentlyUsedExclusiveEntries.remove(k2);
            entryRemove2 = this.mMostFrequentlyUsedExclusiveEntries.remove(k2);
            CountingMemoryCache.Entry<K, V> entry = this.mCachedEntries.get(k2);
            if (entry != null) {
                closeableReferenceNewClientReference = newClientReference(entry);
            } else {
                maybeUpdateCacheFraction(k2);
                closeableReferenceNewClientReference = null;
            }
        }
        maybeNotifyExclusiveEntryRemoval(entryRemove, entryRemove2);
        maybeUpdateCacheParams();
        maybeEvictEntries();
        return closeableReferenceNewClientReference;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public CountingLruMap getCachedEntries() {
        return this.mCachedEntries;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized int getCount() {
        return this.mCachedEntries.getCount();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getEvictionQueueCount() {
        return this.mLeastFrequentlyUsedExclusiveEntries.getCount() + this.mMostFrequentlyUsedExclusiveEntries.getCount();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getEvictionQueueSizeInBytes() {
        return this.mLeastFrequentlyUsedExclusiveEntries.getSizeInBytes() + this.mMostFrequentlyUsedExclusiveEntries.getSizeInBytes();
    }

    public synchronized int getInUseCount() {
        return (this.mCachedEntries.getCount() - this.mLeastFrequentlyUsedExclusiveEntries.getCount()) - this.mMostFrequentlyUsedExclusiveEntries.getCount();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getInUseSizeInBytes() {
        return (this.mCachedEntries.getSizeInBytes() - this.mLeastFrequentlyUsedExclusiveEntries.getSizeInBytes()) - this.mMostFrequentlyUsedExclusiveEntries.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public MemoryCacheParams getMemoryCacheParams() {
        return this.mMemoryCacheParams;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public Map<Bitmap, Object> getOtherEntries() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized int getSizeInBytes() {
        return this.mCachedEntries.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public V inspect(K k2) {
        CountingMemoryCache.Entry<K, V> entry = this.mCachedEntries.get(k2);
        if (entry == null) {
            return null;
        }
        return entry.valueRef.get();
    }

    protected abstract void logIllegalAdaptiveRate();

    protected abstract void logIllegalLfuFraction();

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public void maybeEvictEntries() {
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListTrimExclusivelyOwnedEntries;
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListTrimExclusivelyOwnedEntries2;
        synchronized (this) {
            int iMin = Math.min(this.mMemoryCacheParams.maxEvictionQueueEntries, this.mMemoryCacheParams.maxCacheEntries - getInUseCount());
            int iMin2 = Math.min(this.mMemoryCacheParams.maxEvictionQueueSize, this.mMemoryCacheParams.maxCacheSize - getInUseSizeInBytes());
            int i2 = this.mLFUFractionPromil;
            int i3 = (int) ((((long) iMin) * ((long) i2)) / 1000);
            int i4 = (int) ((((long) iMin2) * ((long) i2)) / 1000);
            arrayListTrimExclusivelyOwnedEntries = trimExclusivelyOwnedEntries(i3, i4, this.mLeastFrequentlyUsedExclusiveEntries, ArrayListType.LFU);
            arrayListTrimExclusivelyOwnedEntries2 = trimExclusivelyOwnedEntries(iMin - i3, iMin2 - i4, this.mMostFrequentlyUsedExclusiveEntries, ArrayListType.MFU);
            makeOrphans(arrayListTrimExclusivelyOwnedEntries, arrayListTrimExclusivelyOwnedEntries2);
        }
        maybeClose(arrayListTrimExclusivelyOwnedEntries, arrayListTrimExclusivelyOwnedEntries2);
        maybeNotifyExclusiveEntriesRemoval(arrayListTrimExclusivelyOwnedEntries, arrayListTrimExclusivelyOwnedEntries2);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public void probe(K k2) {
        Preconditions.checkNotNull(k2);
        synchronized (this) {
            CountingMemoryCache.Entry<K, V> entryRemove = this.mLeastFrequentlyUsedExclusiveEntries.remove(k2);
            if (entryRemove == null) {
                entryRemove = this.mMostFrequentlyUsedExclusiveEntries.remove(k2);
            }
            if (entryRemove != null) {
                increaseAccessCount(entryRemove);
                maybeAddToExclusives(entryRemove);
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int removeAll(Predicate<K> predicate) {
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListRemoveAll;
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListRemoveAll2;
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListRemoveAll3;
        synchronized (this) {
            arrayListRemoveAll = this.mLeastFrequentlyUsedExclusiveEntries.removeAll(predicate);
            arrayListRemoveAll2 = this.mMostFrequentlyUsedExclusiveEntries.removeAll(predicate);
            arrayListRemoveAll3 = this.mCachedEntries.removeAll(predicate);
            makeOrphans(arrayListRemoveAll3);
        }
        maybeClose(arrayListRemoveAll3);
        maybeNotifyExclusiveEntriesRemoval(arrayListRemoveAll, arrayListRemoveAll2);
        maybeUpdateCacheParams();
        maybeEvictEntries();
        return arrayListRemoveAll3.size();
    }

    public String reportData() {
        return Objects.toStringHelper("CountingMemoryCache").add("cached_entries_count:", this.mCachedEntries.getCount()).add("exclusive_entries_count", getEvictionQueueCount()).toString();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    @Nullable
    public CloseableReference<V> reuse(K k2) {
        CountingMemoryCache.Entry<K, V> entryRemove;
        boolean z2;
        CloseableReference<V> closeableReference;
        Preconditions.checkNotNull(k2);
        synchronized (this) {
            entryRemove = this.mLeastFrequentlyUsedExclusiveEntries.remove(k2);
            if (entryRemove == null) {
                entryRemove = this.mMostFrequentlyUsedExclusiveEntries.remove(k2);
            }
            if (entryRemove != null) {
                CountingMemoryCache.Entry<K, V> entryRemove2 = this.mCachedEntries.remove(k2);
                Preconditions.checkNotNull(entryRemove2);
                Preconditions.checkState(entryRemove2.clientCount == 0);
                closeableReference = entryRemove2.valueRef;
                z2 = true;
            } else {
                closeableReference = null;
            }
        }
        if (z2) {
            maybeNotifyExclusiveEntryRemoval(entryRemove);
        }
        return closeableReference;
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType memoryTrimType) {
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListTrimExclusivelyOwnedEntries;
        ArrayList<CountingMemoryCache.Entry<K, V>> arrayListTrimExclusivelyOwnedEntries2;
        double trimRatio = this.mCacheTrimStrategy.getTrimRatio(memoryTrimType);
        synchronized (this) {
            int i2 = 0;
            int iMax = Math.max(0, ((int) (((double) this.mCachedEntries.getSizeInBytes()) * (1.0d - trimRatio))) - getInUseSizeInBytes());
            int sizeInBytes = this.mMostFrequentlyUsedExclusiveEntries.getSizeInBytes();
            int iMax2 = Math.max(0, iMax - sizeInBytes);
            if (iMax > sizeInBytes) {
                iMax = sizeInBytes;
                i2 = iMax2;
            }
            arrayListTrimExclusivelyOwnedEntries = trimExclusivelyOwnedEntries(Integer.MAX_VALUE, i2, this.mLeastFrequentlyUsedExclusiveEntries, ArrayListType.LFU);
            arrayListTrimExclusivelyOwnedEntries2 = trimExclusivelyOwnedEntries(Integer.MAX_VALUE, iMax, this.mMostFrequentlyUsedExclusiveEntries, ArrayListType.MFU);
            makeOrphans(arrayListTrimExclusivelyOwnedEntries, arrayListTrimExclusivelyOwnedEntries2);
        }
        maybeClose(arrayListTrimExclusivelyOwnedEntries, arrayListTrimExclusivelyOwnedEntries2);
        maybeNotifyExclusiveEntriesRemoval(arrayListTrimExclusivelyOwnedEntries, arrayListTrimExclusivelyOwnedEntries2);
        maybeUpdateCacheParams();
        maybeEvictEntries();
    }
}

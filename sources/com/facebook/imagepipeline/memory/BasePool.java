package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.Throwables;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.Pool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePool<V> implements Pool<V> {
    private final Class<?> TAG;
    private boolean mAllowNewBuckets;
    final SparseArray<Bucket<V>> mBuckets;
    final Counter mFree;
    private boolean mIgnoreHardCap;
    final Set<V> mInUseValues;
    final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
    final PoolParams mPoolParams;
    private final PoolStatsTracker mPoolStatsTracker;
    final Counter mUsed;

    static class Counter {
        private static final String TAG = "com.facebook.imagepipeline.memory.BasePool.Counter";
        int mCount;
        int mNumBytes;

        Counter() {
        }

        public void decrement(int i2) {
            int i3;
            int i4 = this.mNumBytes;
            if (i4 < i2 || (i3 = this.mCount) <= 0) {
                FLog.wtf(TAG, "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i2), Integer.valueOf(this.mNumBytes), Integer.valueOf(this.mCount));
            } else {
                this.mCount = i3 - 1;
                this.mNumBytes = i4 - i2;
            }
        }

        public void increment(int i2) {
            this.mCount++;
            this.mNumBytes += i2;
        }

        public void reset() {
            this.mCount = 0;
            this.mNumBytes = 0;
        }
    }

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object obj) {
            super("Invalid value: " + obj.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i2, int i3, int i4, int i5) {
            super("Pool hard cap violation? Hard cap = " + i2 + " Used size = " + i3 + " Free size = " + i4 + " Request size = " + i5);
        }
    }

    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object obj) {
            super(obj);
        }
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        this.TAG = getClass();
        this.mMemoryTrimmableRegistry = (MemoryTrimmableRegistry) Preconditions.checkNotNull(memoryTrimmableRegistry);
        PoolParams poolParams2 = (PoolParams) Preconditions.checkNotNull(poolParams);
        this.mPoolParams = poolParams2;
        this.mPoolStatsTracker = (PoolStatsTracker) Preconditions.checkNotNull(poolStatsTracker);
        this.mBuckets = new SparseArray<>();
        if (poolParams2.fixBucketsReinitialization) {
            initBuckets();
        } else {
            legacyInitBuckets(new SparseIntArray(0));
        }
        this.mInUseValues = Sets.newIdentityHashSet();
        this.mFree = new Counter();
        this.mUsed = new Counter();
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker, boolean z2) {
        this(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        this.mIgnoreHardCap = z2;
    }

    private synchronized void ensurePoolSizeInvariant() {
        Preconditions.checkState(!isMaxSizeSoftCapExceeded() || this.mFree.mNumBytes == 0);
    }

    private void fillBuckets(SparseIntArray sparseIntArray) {
        this.mBuckets.clear();
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            int iKeyAt = sparseIntArray.keyAt(i2);
            this.mBuckets.put(iKeyAt, new Bucket<>(getSizeInBytes(iKeyAt), sparseIntArray.valueAt(i2), 0, this.mPoolParams.fixBucketsReinitialization));
        }
    }

    @Nullable
    private synchronized Bucket<V> getBucketIfPresent(int i2) {
        return this.mBuckets.get(i2);
    }

    private synchronized void initBuckets() {
        SparseIntArray sparseIntArray = this.mPoolParams.bucketSizes;
        if (sparseIntArray != null) {
            fillBuckets(sparseIntArray);
            this.mAllowNewBuckets = false;
        } else {
            this.mAllowNewBuckets = true;
        }
    }

    private synchronized void legacyInitBuckets(SparseIntArray sparseIntArray) {
        Preconditions.checkNotNull(sparseIntArray);
        this.mBuckets.clear();
        SparseIntArray sparseIntArray2 = this.mPoolParams.bucketSizes;
        if (sparseIntArray2 != null) {
            for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                int iKeyAt = sparseIntArray2.keyAt(i2);
                this.mBuckets.put(iKeyAt, new Bucket<>(getSizeInBytes(iKeyAt), sparseIntArray2.valueAt(i2), sparseIntArray.get(iKeyAt, 0), this.mPoolParams.fixBucketsReinitialization));
            }
            this.mAllowNewBuckets = false;
        } else {
            this.mAllowNewBuckets = true;
        }
    }

    private void logStats() {
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.mUsed.mCount), Integer.valueOf(this.mUsed.mNumBytes), Integer.valueOf(this.mFree.mCount), Integer.valueOf(this.mFree.mNumBytes));
        }
    }

    private List<Bucket<V>> refillBuckets() {
        ArrayList arrayList = new ArrayList(this.mBuckets.size());
        int size = this.mBuckets.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i2));
            int i3 = bucket.mItemSize;
            int i4 = bucket.mMaxLength;
            int inUseCount = bucket.getInUseCount();
            if (bucket.getFreeListSize() > 0) {
                arrayList.add(bucket);
            }
            this.mBuckets.setValueAt(i2, new Bucket<>(getSizeInBytes(i3), i4, inUseCount, this.mPoolParams.fixBucketsReinitialization));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: alloc */
    protected abstract V alloc2(int i2);

    synchronized boolean canAllocate(int i2) {
        if (this.mIgnoreHardCap) {
            return true;
        }
        int i3 = this.mPoolParams.maxSizeHardCap;
        if (i2 > i3 - this.mUsed.mNumBytes) {
            this.mPoolStatsTracker.onHardCapReached();
            return false;
        }
        int i4 = this.mPoolParams.maxSizeSoftCap;
        if (i2 > i4 - (this.mUsed.mNumBytes + this.mFree.mNumBytes)) {
            trimToSize(i4 - i2);
        }
        if (i2 <= i3 - (this.mUsed.mNumBytes + this.mFree.mNumBytes)) {
            return true;
        }
        this.mPoolStatsTracker.onHardCapReached();
        return false;
    }

    protected abstract void free(V v2);

    @Override // com.facebook.common.memory.Pool
    public V get(int i2) throws Throwable {
        V vAlloc2;
        V value;
        ensurePoolSizeInvariant();
        int bucketedSize = getBucketedSize(i2);
        synchronized (this) {
            Bucket<V> bucket = getBucket(bucketedSize);
            if (bucket != null && (value = getValue(bucket)) != null) {
                Preconditions.checkState(this.mInUseValues.add(value));
                int bucketedSizeForValue = getBucketedSizeForValue(value);
                int sizeInBytes = getSizeInBytes(bucketedSizeForValue);
                this.mUsed.increment(sizeInBytes);
                this.mFree.decrement(sizeInBytes);
                this.mPoolStatsTracker.onValueReuse(sizeInBytes);
                logStats();
                if (FLog.isLoggable(2)) {
                    FLog.v(this.TAG, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(value)), Integer.valueOf(bucketedSizeForValue));
                }
                return value;
            }
            int sizeInBytes2 = getSizeInBytes(bucketedSize);
            if (!canAllocate(sizeInBytes2)) {
                throw new PoolSizeViolationException(this.mPoolParams.maxSizeHardCap, this.mUsed.mNumBytes, this.mFree.mNumBytes, sizeInBytes2);
            }
            this.mUsed.increment(sizeInBytes2);
            if (bucket != null) {
                bucket.incrementInUseCount();
            }
            try {
                vAlloc2 = alloc2(bucketedSize);
            } catch (Throwable th) {
                synchronized (this) {
                    this.mUsed.decrement(sizeInBytes2);
                    Bucket<V> bucket2 = getBucket(bucketedSize);
                    if (bucket2 != null) {
                        bucket2.decrementInUseCount();
                    }
                    Throwables.propagateIfPossible(th);
                    vAlloc2 = null;
                }
            }
            synchronized (this) {
                Preconditions.checkState(this.mInUseValues.add(vAlloc2));
                trimToSoftCap();
                this.mPoolStatsTracker.onAlloc(sizeInBytes2);
                logStats();
                if (FLog.isLoggable(2)) {
                    FLog.v(this.TAG, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vAlloc2)), Integer.valueOf(bucketedSize));
                }
            }
            return vAlloc2;
        }
    }

    @Nullable
    synchronized Bucket<V> getBucket(int i2) {
        Bucket<V> bucket = this.mBuckets.get(i2);
        if (bucket == null && this.mAllowNewBuckets) {
            if (FLog.isLoggable(2)) {
                FLog.v(this.TAG, "creating new bucket %s", Integer.valueOf(i2));
            }
            Bucket<V> bucketNewBucket = newBucket(i2);
            this.mBuckets.put(i2, bucketNewBucket);
            return bucketNewBucket;
        }
        return bucket;
    }

    protected abstract int getBucketedSize(int i2);

    protected abstract int getBucketedSizeForValue(V v2);

    protected abstract int getSizeInBytes(int i2);

    public synchronized Map<String, Integer> getStats() {
        HashMap map;
        map = new HashMap();
        for (int i2 = 0; i2 < this.mBuckets.size(); i2++) {
            map.put("buckets_used_" + getSizeInBytes(this.mBuckets.keyAt(i2)), Integer.valueOf(((Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i2))).getInUseCount()));
        }
        map.put("soft_cap", Integer.valueOf(this.mPoolParams.maxSizeSoftCap));
        map.put("hard_cap", Integer.valueOf(this.mPoolParams.maxSizeHardCap));
        map.put("used_count", Integer.valueOf(this.mUsed.mCount));
        map.put("used_bytes", Integer.valueOf(this.mUsed.mNumBytes));
        map.put("free_count", Integer.valueOf(this.mFree.mCount));
        map.put("free_bytes", Integer.valueOf(this.mFree.mNumBytes));
        return map;
    }

    @Nullable
    protected synchronized V getValue(Bucket<V> bucket) {
        return bucket.get();
    }

    protected void initialize() {
        this.mMemoryTrimmableRegistry.registerMemoryTrimmable(this);
        this.mPoolStatsTracker.setBasePool(this);
    }

    synchronized boolean isMaxSizeSoftCapExceeded() {
        boolean z2;
        z2 = this.mUsed.mNumBytes + this.mFree.mNumBytes > this.mPoolParams.maxSizeSoftCap;
        if (z2) {
            this.mPoolStatsTracker.onSoftCapReached();
        }
        return z2;
    }

    protected boolean isReusable(V v2) {
        Preconditions.checkNotNull(v2);
        return true;
    }

    Bucket<V> newBucket(int i2) {
        return new Bucket<>(getSizeInBytes(i2), Integer.MAX_VALUE, 0, this.mPoolParams.fixBucketsReinitialization);
    }

    protected void onParamsChanged() {
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public void release(V v2) {
        Preconditions.checkNotNull(v2);
        int bucketedSizeForValue = getBucketedSizeForValue(v2);
        int sizeInBytes = getSizeInBytes(bucketedSizeForValue);
        synchronized (this) {
            Bucket<V> bucketIfPresent = getBucketIfPresent(bucketedSizeForValue);
            if (!this.mInUseValues.remove(v2)) {
                FLog.e(this.TAG, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(bucketedSizeForValue));
                free(v2);
                this.mPoolStatsTracker.onFree(sizeInBytes);
            } else if (bucketIfPresent == null || bucketIfPresent.isMaxLengthExceeded() || isMaxSizeSoftCapExceeded() || !isReusable(v2)) {
                if (bucketIfPresent != null) {
                    bucketIfPresent.decrementInUseCount();
                }
                if (FLog.isLoggable(2)) {
                    FLog.v(this.TAG, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(bucketedSizeForValue));
                }
                free(v2);
                this.mUsed.decrement(sizeInBytes);
                this.mPoolStatsTracker.onFree(sizeInBytes);
            } else {
                bucketIfPresent.release(v2);
                this.mFree.increment(sizeInBytes);
                this.mUsed.decrement(sizeInBytes);
                this.mPoolStatsTracker.onValueRelease(sizeInBytes);
                if (FLog.isLoggable(2)) {
                    FLog.v(this.TAG, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(bucketedSizeForValue));
                }
            }
            logStats();
        }
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType memoryTrimType) {
        trimToNothing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void trimToNothing() {
        int i2;
        List arrayList;
        synchronized (this) {
            if (this.mPoolParams.fixBucketsReinitialization) {
                arrayList = refillBuckets();
            } else {
                arrayList = new ArrayList(this.mBuckets.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i3 = 0; i3 < this.mBuckets.size(); i3++) {
                    Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i3));
                    if (bucket.getFreeListSize() > 0) {
                        arrayList.add(bucket);
                    }
                    sparseIntArray.put(this.mBuckets.keyAt(i3), bucket.getInUseCount());
                }
                legacyInitBuckets(sparseIntArray);
            }
            this.mFree.reset();
            logStats();
        }
        onParamsChanged();
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            Bucket bucket2 = (Bucket) arrayList.get(i2);
            while (true) {
                Object objPop = bucket2.pop();
                if (objPop == null) {
                    break;
                } else {
                    free(objPop);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized void trimToSize(int i2) {
        int iMin = Math.min((this.mUsed.mNumBytes + this.mFree.mNumBytes) - i2, this.mFree.mNumBytes);
        if (iMin <= 0) {
            return;
        }
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i2), Integer.valueOf(this.mUsed.mNumBytes + this.mFree.mNumBytes), Integer.valueOf(iMin));
        }
        logStats();
        for (int i3 = 0; i3 < this.mBuckets.size() && iMin > 0; i3++) {
            Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i3));
            while (iMin > 0) {
                Object objPop = bucket.pop();
                if (objPop == null) {
                    break;
                }
                free(objPop);
                iMin -= bucket.mItemSize;
                this.mFree.decrement(bucket.mItemSize);
            }
        }
        logStats();
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i2), Integer.valueOf(this.mUsed.mNumBytes + this.mFree.mNumBytes));
        }
    }

    synchronized void trimToSoftCap() {
        if (isMaxSizeSoftCapExceeded()) {
            trimToSize(this.mPoolParams.maxSizeSoftCap);
        }
    }
}

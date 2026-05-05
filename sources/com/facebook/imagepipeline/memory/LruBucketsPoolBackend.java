package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LruBucketsPoolBackend<T> implements PoolBackend<T> {
    private final Set<T> mCurrentItems = new HashSet();
    private final BucketMap<T> mMap = new BucketMap<>();

    @Nullable
    private T maybeRemoveFromCurrentItems(@Nullable T t2) {
        if (t2 != null) {
            synchronized (this) {
                this.mCurrentItems.remove(t2);
            }
        }
        return t2;
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public T get(int i2) {
        return maybeRemoveFromCurrentItems(this.mMap.acquire(i2));
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    @Nullable
    public T pop() {
        return maybeRemoveFromCurrentItems(this.mMap.removeFromEnd());
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public void put(T t2) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.mCurrentItems.add(t2);
        }
        if (zAdd) {
            this.mMap.release(getSize(t2), t2);
        }
    }

    int valueCount() {
        return this.mMap.valueCount();
    }
}

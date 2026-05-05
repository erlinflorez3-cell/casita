package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class Bucket<V> {
    private static final String TAG = "BUCKET";
    private final boolean mFixBucketsReinitialization;
    final Queue mFreeList;
    private int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    public Bucket(int i2, int i3, int i4, boolean z2) {
        Preconditions.checkState(i2 > 0);
        Preconditions.checkState(i3 >= 0);
        Preconditions.checkState(i4 >= 0);
        this.mItemSize = i2;
        this.mMaxLength = i3;
        this.mFreeList = new LinkedList();
        this.mInUseLength = i4;
        this.mFixBucketsReinitialization = z2;
    }

    void addToFreeList(V v2) {
        this.mFreeList.add(v2);
    }

    public void decrementInUseCount() {
        Preconditions.checkState(this.mInUseLength > 0);
        this.mInUseLength--;
    }

    @Nullable
    @Deprecated
    public V get() {
        V vPop = pop();
        if (vPop != null) {
            this.mInUseLength++;
        }
        return vPop;
    }

    int getFreeListSize() {
        return this.mFreeList.size();
    }

    public int getInUseCount() {
        return this.mInUseLength;
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    public boolean isMaxLengthExceeded() {
        return this.mInUseLength + getFreeListSize() > this.mMaxLength;
    }

    @Nullable
    public V pop() {
        return (V) this.mFreeList.poll();
    }

    public void release(V v2) {
        Preconditions.checkNotNull(v2);
        if (this.mFixBucketsReinitialization) {
            Preconditions.checkState(this.mInUseLength > 0);
            this.mInUseLength--;
            addToFreeList(v2);
        } else {
            int i2 = this.mInUseLength;
            if (i2 <= 0) {
                FLog.e(TAG, "Tried to release value %s from an empty bucket!", v2);
            } else {
                this.mInUseLength = i2 - 1;
                addToFreeList(v2);
            }
        }
    }
}

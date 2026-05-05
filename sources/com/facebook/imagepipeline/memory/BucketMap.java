package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class BucketMap<T> {

    @Nullable
    LinkedEntry<T> mHead;
    protected final SparseArray<LinkedEntry<T>> mMap = new SparseArray<>();

    @Nullable
    LinkedEntry<T> mTail;

    static class LinkedEntry<I> {
        int key;

        @Nullable
        LinkedEntry<I> next;

        @Nullable
        LinkedEntry<I> prev;
        LinkedList<I> value;

        private LinkedEntry(@Nullable LinkedEntry<I> linkedEntry, int i2, LinkedList<I> linkedList, @Nullable LinkedEntry<I> linkedEntry2) {
            this.prev = linkedEntry;
            this.key = i2;
            this.value = linkedList;
            this.next = linkedEntry2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.key + ")";
        }
    }

    private void maybePrune(LinkedEntry<T> linkedEntry) {
        if (linkedEntry == null || !linkedEntry.value.isEmpty()) {
            return;
        }
        prune(linkedEntry);
        this.mMap.remove(linkedEntry.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void moveToFront(LinkedEntry<T> linkedEntry) {
        if (this.mHead == linkedEntry) {
            return;
        }
        prune(linkedEntry);
        LinkedEntry<T> linkedEntry2 = this.mHead;
        if (linkedEntry2 == 0) {
            this.mHead = linkedEntry;
            this.mTail = linkedEntry;
        } else {
            linkedEntry.next = linkedEntry2;
            this.mHead.prev = linkedEntry;
            this.mHead = linkedEntry;
        }
    }

    private synchronized void prune(LinkedEntry<T> linkedEntry) {
        LinkedEntry linkedEntry2 = (LinkedEntry<T>) linkedEntry.prev;
        LinkedEntry linkedEntry3 = (LinkedEntry<T>) linkedEntry.next;
        if (linkedEntry2 != null) {
            linkedEntry2.next = linkedEntry3;
        }
        if (linkedEntry3 != null) {
            linkedEntry3.prev = linkedEntry2;
        }
        linkedEntry.prev = null;
        linkedEntry.next = null;
        if (linkedEntry == this.mHead) {
            this.mHead = linkedEntry3;
        }
        if (linkedEntry == this.mTail) {
            this.mTail = linkedEntry2;
        }
    }

    @Nullable
    public synchronized T acquire(int i2) {
        LinkedEntry<T> linkedEntry = this.mMap.get(i2);
        if (linkedEntry == null) {
            return null;
        }
        T tPollFirst = linkedEntry.value.pollFirst();
        moveToFront(linkedEntry);
        return tPollFirst;
    }

    public synchronized void release(int i2, T t2) {
        LinkedEntry<T> linkedEntry = this.mMap.get(i2);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry<>(null, i2, new LinkedList(), null);
            this.mMap.put(i2, linkedEntry);
        }
        linkedEntry.value.addLast(t2);
        moveToFront(linkedEntry);
    }

    @Nullable
    public synchronized T removeFromEnd() {
        LinkedEntry<T> linkedEntry = this.mTail;
        if (linkedEntry == null) {
            return null;
        }
        T tPollLast = linkedEntry.value.pollLast();
        maybePrune(linkedEntry);
        return tPollLast;
    }

    synchronized int valueCount() {
        int size;
        size = 0;
        for (LinkedEntry linkedEntry = this.mHead; linkedEntry != null; linkedEntry = linkedEntry.next) {
            if (linkedEntry.value != null) {
                size += linkedEntry.value.size();
            }
        }
        return size;
    }
}

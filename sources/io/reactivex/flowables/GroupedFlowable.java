package io.reactivex.flowables;

import io.reactivex.Flowable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {
    final K key;

    protected GroupedFlowable(K k2) {
        this.key = k2;
    }

    public K getKey() {
        return this.key;
    }
}

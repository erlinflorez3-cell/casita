package io.reactivex.observables;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {
    final K key;

    protected GroupedObservable(K k2) {
        this.key = k2;
    }

    public K getKey() {
        return this.key;
    }
}

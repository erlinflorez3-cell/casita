package io.reactivex;

import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes7.dex */
public interface Observer<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t2);

    void onSubscribe(Disposable disposable);
}

package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes6.dex */
public final class CompletableFromObservable<T> extends Completable {
    final ObservableSource<T> observable;

    static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        final CompletableObserver f19738co;

        CompletableFromObservableObserver(CompletableObserver completableObserver) {
            this.f19738co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f19738co.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f19738co.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f19738co.onSubscribe(disposable);
        }
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.observable = observableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(CompletableObserver completableObserver) {
        this.observable.subscribe(new CompletableFromObservableObserver(completableObserver));
    }
}

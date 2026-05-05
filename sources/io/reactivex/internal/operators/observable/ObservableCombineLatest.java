package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayError;
    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;

    static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final LatestCoordinator<T, R> parent;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i2) {
            this.parent = latestCoordinator;
            this.index = i2;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.parent.innerNext(this.index, t2);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final CombinerObserver<T, R>[] observers;
        final SpscLinkedArrayQueue<Object[]> queue;

        LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i2, int i3, boolean z2) {
            this.downstream = observer;
            this.combiner = function;
            this.delayError = z2;
            this.latest = new Object[i2];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                combinerObserverArr[i4] = new CombinerObserver<>(this, i4);
            }
            this.observers = combinerObserverArr;
            this.queue = new SpscLinkedArrayQueue<>(i3);
        }

        void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
            }
        }

        void clear(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.latest = null;
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear(this.queue);
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.queue;
            Observer<? super R> observer = this.downstream;
            boolean z2 = this.delayError;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!z2 && this.errors.get() != null) {
                    cancelSources();
                    clear(spscLinkedArrayQueue);
                    observer.onError(this.errors.terminate());
                    return;
                }
                boolean z3 = this.done;
                Object[] objArrPoll = spscLinkedArrayQueue.poll();
                boolean z4 = objArrPoll == null;
                if (z3 && z4) {
                    clear(spscLinkedArrayQueue);
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate == null) {
                        observer.onComplete();
                        return;
                    } else {
                        observer.onError(thTerminate);
                        return;
                    }
                }
                if (z4) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.errors.addThrowable(th);
                        cancelSources();
                        clear(spscLinkedArrayQueue);
                        observer.onError(this.errors.terminate());
                        return;
                    }
                }
            }
            clear(spscLinkedArrayQueue);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001a A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:13:0x0012, B:16:0x001c, B:15:0x001a), top: B:24:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void innerComplete(int r6) {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object[] r4 = r5.latest     // Catch: java.lang.Throwable -> L26
                if (r4 != 0) goto L7
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
                return
            L7:
                r0 = r4[r6]     // Catch: java.lang.Throwable -> L26
                r3 = 1
                if (r0 != 0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                goto L10
            Lf:
                r2 = r3
            L10:
                if (r2 != 0) goto L1a
                int r1 = r5.complete     // Catch: java.lang.Throwable -> L26
                int r1 = r1 + r3
                r5.complete = r1     // Catch: java.lang.Throwable -> L26
                int r0 = r4.length     // Catch: java.lang.Throwable -> L26
                if (r1 != r0) goto L1c
            L1a:
                r5.done = r3     // Catch: java.lang.Throwable -> L26
            L1c:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
                if (r2 == 0) goto L22
                r5.cancelSources()
            L22:
                r5.drain()
                return
            L26:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerComplete(int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0014, B:17:0x001e, B:20:0x0028, B:19:0x0026), top: B:31:0x000e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void innerError(int r6, java.lang.Throwable r7) {
            /*
                r5 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r5.errors
                boolean r0 = r0.addThrowable(r7)
                if (r0 == 0) goto L2d
                boolean r0 = r5.delayError
                r4 = 1
                if (r0 == 0) goto L32
                monitor-enter(r5)
                java.lang.Object[] r3 = r5.latest     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L14
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
                return
            L14:
                r0 = r3[r6]     // Catch: java.lang.Throwable -> L2a
                if (r0 != 0) goto L19
                goto L1b
            L19:
                r2 = 0
                goto L1c
            L1b:
                r2 = r4
            L1c:
                if (r2 != 0) goto L26
                int r1 = r5.complete     // Catch: java.lang.Throwable -> L2a
                int r1 = r1 + r4
                r5.complete = r1     // Catch: java.lang.Throwable -> L2a
                int r0 = r3.length     // Catch: java.lang.Throwable -> L2a
                if (r1 != r0) goto L28
            L26:
                r5.done = r4     // Catch: java.lang.Throwable -> L2a
            L28:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
                goto L31
            L2a:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
                throw r0
            L2d:
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
                goto L3a
            L31:
                r4 = r2
            L32:
                if (r4 == 0) goto L37
                r5.cancelSources()
            L37:
                r5.drain()
            L3a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerError(int, java.lang.Throwable):void");
        }

        void innerNext(int i2, T t2) {
            boolean z2;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i2];
                int i3 = this.active;
                if (obj == null) {
                    i3++;
                    this.active = i3;
                }
                objArr[i2] = t2;
                if (i3 == objArr.length) {
                    this.queue.offer((Object[]) objArr.clone());
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    drain();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i2 = 0; i2 < length && !this.done && !this.cancelled; i2++) {
                observableSourceArr[i2].subscribe(combinerObserverArr[i2]);
            }
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i2, boolean z2) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.combiner = function;
        this.bufferSize = i2;
        this.delayError = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new LatestCoordinator(observer, this.combiner, length, this.bufferSize, this.delayError).subscribe(observableSourceArr);
        }
    }
}

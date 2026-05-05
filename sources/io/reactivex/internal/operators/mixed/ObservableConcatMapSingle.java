package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int prefetch;
    final Observable<T> source;

    static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final Observer<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);
        R item;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final SimplePlainQueue<T> queue;
        volatile int state;
        Disposable upstream;

        static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapSingleMainObserver<?, R> parent;

            ConcatMapSingleObserver(ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.parent = concatMapSingleMainObserver;
            }

            void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r2) {
                this.parent.innerSuccess(r2);
            }
        }

        ConcatMapSingleMainObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.downstream = observer;
            this.mapper = function;
            this.errorMode = errorMode;
            this.queue = new SpscLinkedArrayQueue(i2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        
            r4.clear();
            r10.item = null;
            r2.onError(r3.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void drain() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super R> r2 = r10.downstream
                io.reactivex.internal.util.ErrorMode r6 = r10.errorMode
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r4 = r10.queue
                io.reactivex.internal.util.AtomicThrowable r3 = r10.errors
                r5 = 1
                r7 = r5
            L11:
                boolean r0 = r10.cancelled
                r9 = 0
                if (r0 == 0) goto L23
                r4.clear()
                r10.item = r9
            L1b:
                int r0 = -r7
                int r7 = r10.addAndGet(r0)
                if (r7 != 0) goto L11
                return
            L23:
                int r1 = r10.state
                java.lang.Object r0 = r3.get()
                if (r0 == 0) goto L42
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r6 == r0) goto L35
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r6 != r0) goto L42
                if (r1 != 0) goto L42
            L35:
                r4.clear()
                r10.item = r9
                java.lang.Throwable r0 = r3.terminate()
                r2.onError(r0)
                return
            L42:
                r8 = 0
                if (r1 != 0) goto L79
                boolean r0 = r10.done
                java.lang.Object r1 = r4.poll()
                if (r1 != 0) goto L4e
                r8 = r5
            L4e:
                if (r0 == 0) goto L60
                if (r8 == 0) goto L60
                java.lang.Throwable r0 = r3.terminate()
                if (r0 != 0) goto L5c
                r2.onComplete()
            L5b:
                return
            L5c:
                r2.onError(r0)
                goto L5b
            L60:
                if (r8 == 0) goto L63
                goto L1b
            L63:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r0 = r10.mapper     // Catch: java.lang.Throwable -> L86
                java.lang.Object r1 = r0.apply(r1)     // Catch: java.lang.Throwable -> L86
                java.lang.String r0 = "The mapper returned a null SingleSource"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)     // Catch: java.lang.Throwable -> L86
                io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1     // Catch: java.lang.Throwable -> L86
                r10.state = r5
                io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver<R> r0 = r10.inner
                r1.subscribe(r0)
                goto L1b
            L79:
                r0 = 2
                if (r1 != r0) goto L1b
                R r0 = r10.item
                r10.item = r9
                r2.onNext(r0)
                r10.state = r8
                goto L11
            L86:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.disposables.Disposable r0 = r10.upstream
                r0.dispose()
                r4.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r0 = r3.terminate()
                r2.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver.drain():void");
        }

        void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.state = 0;
            drain();
        }

        void innerSuccess(R r2) {
            this.item = r2;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.queue.offer(t2);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i2) {
        this.source = observable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i2;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super R> observer) {
        if (ScalarXMapZHelper.tryAsSingle(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new ConcatMapSingleMainObserver(observer, this.mapper, this.prefetch, this.errorMode));
    }
}

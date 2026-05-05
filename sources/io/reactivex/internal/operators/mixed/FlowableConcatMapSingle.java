package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes6.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final Subscriber<? super R> downstream;
        long emitted;
        final ErrorMode errorMode;
        R item;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        volatile int state;
        Subscription upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);

        static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapSingleSubscriber<?, R> parent;

            ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.parent = concatMapSingleSubscriber;
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

        ConcatMapSingleSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.downstream = subscriber;
            this.mapper = function;
            this.prefetch = i2;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        
            r8.clear();
            r15.item = null;
            r10.onError(r7.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void drain() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super R> r10 = r15.downstream
                io.reactivex.internal.util.ErrorMode r9 = r15.errorMode
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r8 = r15.queue
                io.reactivex.internal.util.AtomicThrowable r7 = r15.errors
                java.util.concurrent.atomic.AtomicLong r6 = r15.requested
                int r5 = r15.prefetch
                int r0 = r5 >> 1
                int r5 = r5 - r0
                r4 = 1
                r11 = r4
            L18:
                boolean r0 = r15.cancelled
                r1 = 0
                if (r0 == 0) goto L2a
                r8.clear()
                r15.item = r1
            L22:
                int r0 = -r11
                int r11 = r15.addAndGet(r0)
                if (r11 != 0) goto L18
                return
            L2a:
                int r2 = r15.state
                java.lang.Object r0 = r7.get()
                if (r0 == 0) goto L49
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r9 == r0) goto L3c
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r9 != r0) goto L49
                if (r2 != 0) goto L49
            L3c:
                r8.clear()
                r15.item = r1
                java.lang.Throwable r0 = r7.terminate()
                r10.onError(r0)
                return
            L49:
                r12 = 0
                if (r2 != 0) goto L92
                boolean r1 = r15.done
                java.lang.Object r3 = r8.poll()
                if (r3 != 0) goto L67
                r0 = r4
            L55:
                if (r1 == 0) goto L69
                if (r0 == 0) goto L69
                java.lang.Throwable r0 = r7.terminate()
                if (r0 != 0) goto L63
                r10.onComplete()
            L62:
                return
            L63:
                r10.onError(r0)
                goto L62
            L67:
                r0 = r12
                goto L55
            L69:
                if (r0 == 0) goto L6c
                goto L22
            L6c:
                int r0 = r15.consumed
                int r0 = r0 + r4
                if (r0 != r5) goto L7a
                r15.consumed = r12
                org.reactivestreams.Subscription r2 = r15.upstream
                long r0 = (long) r5
                r2.request(r0)
                goto L7c
            L7a:
                r15.consumed = r0
            L7c:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r0 = r15.mapper     // Catch: java.lang.Throwable -> Laf
                java.lang.Object r1 = r0.apply(r3)     // Catch: java.lang.Throwable -> Laf
                java.lang.String r0 = "The mapper returned a null SingleSource"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)     // Catch: java.lang.Throwable -> Laf
                io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1     // Catch: java.lang.Throwable -> Laf
                r15.state = r4
                io.reactivex.internal.operators.mixed.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver<R> r0 = r15.inner
                r1.subscribe(r0)
                goto L22
            L92:
                r0 = 2
                if (r2 != r0) goto L22
                long r2 = r15.emitted
                long r13 = r6.get()
                int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
                if (r0 == 0) goto L22
                R r0 = r15.item
                r15.item = r1
                r10.onNext(r0)
                r0 = 1
                long r2 = r2 + r0
                r15.emitted = r2
                r15.state = r12
                goto L18
            Laf:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscription r0 = r15.upstream
                r0.cancel()
                r8.clear()
                r7.addThrowable(r1)
                java.lang.Throwable r0 = r7.terminate()
                r10.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber.drain():void");
        }

        void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
        }

        void innerSuccess(R r2) {
            this.item = r2;
            this.state = 2;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
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

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t2) {
            if (this.queue.offer(t2)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.add(this.requested, j2);
            drain();
        }
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i2) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i2;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapSingleSubscriber(subscriber, this.mapper, this.prefetch, this.errorMode));
    }
}

package io.reactivex.internal.operators.flowable;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes6.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final int maxConcurrency;

    static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final Subscriber<? super R> downstream;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final int maxConcurrency;
        Subscription upstream;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable set = new CompositeDisposable();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();

        final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapMaybeSubscriber.this.innerComplete(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                FlatMapMaybeSubscriber.this.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r2) {
                FlatMapMaybeSubscriber.this.innerSuccess(this, r2);
            }
        }

        FlatMapMaybeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2, int i2) {
            this.downstream = subscriber;
            this.mapper = function;
            this.delayErrors = z2;
            this.maxConcurrency = i2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        void clear() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        
            if (r2 != r14) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
        
            if (r17.cancelled == false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        
            clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
        
            if (r17.delayErrors != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
        
            if (r17.errors.get() == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        
            r0 = r17.errors.terminate();
            clear();
            r4.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
        
            if (r6.get() != 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
        
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
        
            r0 = r5.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
        
            if (r0 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        
            if (r0.isEmpty() == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
        
            if (r1 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
        
            if (r10 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
        
            r0 = r17.errors.terminate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
        
            if (r0 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
        
            r4.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
        
            r4.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c2, code lost:
        
            r1 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c6, code lost:
        
            if (r2 == 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.produced(r17.requested, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
        
            if (r17.maxConcurrency == Integer.MAX_VALUE) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
        
            r17.upstream.request(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d9, code lost:
        
            r8 = addAndGet(-r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void drainLoop() {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.drainLoop():void");
        }

        SpscLinkedArrayQueue<R> getOrCreateQueue() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.queue.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.queue, null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        void innerComplete(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z2 = this.active.decrementAndGet() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
                    if (z2 && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    drainLoop();
                    return;
                }
            }
            this.active.decrementAndGet();
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            drain();
        }

        void innerError(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber<T, R>.InnerObserver r7, R r8) {
            /*
                r6 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r6.set
                r0.delete(r7)
                int r0 = r6.get()
                if (r0 != 0) goto L7a
                r5 = 0
                r1 = 1
                boolean r0 = r6.compareAndSet(r5, r1)
                if (r0 == 0) goto L7a
                java.util.concurrent.atomic.AtomicInteger r0 = r6.active
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1c
                r5 = r1
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                long r3 = r0.get()
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L53
                org.reactivestreams.Subscriber<? super R> r0 = r6.downstream
                r0.onNext(r8)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r0 = r6.queue
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r0
                if (r5 == 0) goto L5d
                if (r0 == 0) goto L3f
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L5d
            L3f:
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                java.lang.Throwable r1 = r0.terminate()
                if (r1 == 0) goto L4d
                org.reactivestreams.Subscriber<? super R> r0 = r6.downstream
                r0.onError(r1)
            L4c:
                return
            L4d:
                org.reactivestreams.Subscriber<? super R> r0 = r6.downstream
                r0.onComplete()
                goto L4c
            L53:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r6.getOrCreateQueue()
                monitor-enter(r1)
                r1.offer(r8)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
                goto L70
            L5d:
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                r2 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r2)
                int r1 = r6.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r0) goto L70
                org.reactivestreams.Subscription r0 = r6.upstream
                r0.request(r2)
            L70:
                int r0 = r6.decrementAndGet()
                if (r0 != 0) goto L8f
                return
            L77:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
                throw r0
            L7a:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r6.getOrCreateQueue()
                monitor-enter(r1)
                r1.offer(r8)     // Catch: java.lang.Throwable -> L93
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L93
                java.util.concurrent.atomic.AtomicInteger r0 = r6.active
                r0.decrementAndGet()
                int r0 = r6.getAndIncrement()
                if (r0 == 0) goto L8f
                return
            L8f:
                r6.drainLoop()
                return
            L93:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L93
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver, java.lang.Object):void");
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t2) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.add(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                int i2 = this.maxConcurrency;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                BackpressureHelper.add(this.requested, j2);
                drain();
            }
        }
    }

    public FlowableFlatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2, int i2) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i2;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new FlatMapMaybeSubscriber(subscriber, this.mapper, this.delayErrors, this.maxConcurrency));
    }
}

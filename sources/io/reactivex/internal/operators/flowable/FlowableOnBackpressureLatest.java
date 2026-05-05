package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes6.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final Subscriber<? super T> downstream;
        Throwable error;
        Subscription upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        BackpressureLatestSubscriber(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        boolean checkTerminated(boolean z2, boolean z3, Subscriber<?> subscriber, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                atomicReference.lazySet(null);
                subscriber.onError(th);
                return true;
            }
            if (!z3) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        
            if (r1 != r6.get()) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        
            r3 = r14.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r5.get() != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        
            if (checkTerminated(r3, r9, r7, r5) == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        
            if (r1 == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.produced(r6, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
        
            r8 = addAndGet(-r8);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void drain() {
            /*
                r14 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super T> r7 = r14.downstream
                java.util.concurrent.atomic.AtomicLong r6 = r14.requested
                java.util.concurrent.atomic.AtomicReference<T> r5 = r14.current
                r13 = 1
                r8 = r13
            Lf:
                r11 = 0
                r1 = r11
            L12:
                long r3 = r6.get()
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r9 = 0
                if (r0 == 0) goto L30
                boolean r10 = r14.done
                r0 = 0
                java.lang.Object r4 = r5.getAndSet(r0)
                if (r4 != 0) goto L2c
                r3 = r13
            L25:
                boolean r0 = r14.checkTerminated(r10, r3, r7, r5)
                if (r0 == 0) goto L2e
                return
            L2c:
                r3 = r9
                goto L25
            L2e:
                if (r3 == 0) goto L57
            L30:
                long r3 = r6.get()
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 != 0) goto L48
                boolean r3 = r14.done
                java.lang.Object r0 = r5.get()
                if (r0 != 0) goto L41
                r9 = r13
            L41:
                boolean r0 = r14.checkTerminated(r3, r9, r7, r5)
                if (r0 == 0) goto L48
                return
            L48:
                int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r0 == 0) goto L4f
                io.reactivex.internal.util.BackpressureHelper.produced(r6, r1)
            L4f:
                int r0 = -r8
                int r8 = r14.addAndGet(r0)
                if (r8 != 0) goto Lf
                return
            L57:
                r7.onNext(r4)
                r3 = 1
                long r1 = r1 + r3
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest.BackpressureLatestSubscriber.drain():void");
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t2) {
            this.current.lazySet(t2);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
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

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(subscriber));
    }
}

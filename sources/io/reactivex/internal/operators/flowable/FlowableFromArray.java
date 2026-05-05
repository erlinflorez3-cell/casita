package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    final T[] array;

    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super T> downstream;

        ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            for (int i2 = this.index; i2 != length; i2++) {
                if (this.cancelled) {
                    return;
                }
                T t2 = tArr[i2];
                if (t2 == null) {
                    conditionalSubscriber.onError(new NullPointerException("The element at index " + i2 + " is null"));
                    return;
                }
                conditionalSubscriber.tryOnNext(t2);
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        
            r10.index = r5;
            r11 = addAndGet(-r2);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void slowPath(long r11) {
            /*
                r10 = this;
                T[] r7 = r10.array
                int r6 = r7.length
                int r5 = r10.index
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r4 = r10.downstream
                r8 = 0
            L9:
                r2 = r8
            La:
                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r0 == 0) goto L43
                if (r5 == r6) goto L43
                boolean r0 = r10.cancelled
                if (r0 == 0) goto L15
                return
            L15:
                r0 = r7[r5]
                if (r0 != 0) goto L37
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "The element at index "
                r1.<init>(r0)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r0 = " is null"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r4.onError(r2)
                return
            L37:
                boolean r0 = r4.tryOnNext(r0)
                if (r0 == 0) goto L40
                r0 = 1
                long r2 = r2 + r0
            L40:
                int r5 = r5 + 1
                goto La
            L43:
                if (r5 != r6) goto L4d
                boolean r0 = r10.cancelled
                if (r0 != 0) goto L4c
                r4.onComplete()
            L4c:
                return
            L4d:
                long r11 = r10.get()
                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r0 != 0) goto La
                r10.index = r5
                long r0 = -r2
                long r11 = r10.addAndGet(r0)
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromArray.ArrayConditionalSubscription.slowPath(long):void");
        }
    }

    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final Subscriber<? super T> downstream;

        ArraySubscription(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.downstream;
            for (int i2 = this.index; i2 != length; i2++) {
                if (this.cancelled) {
                    return;
                }
                T t2 = tArr[i2];
                if (t2 == null) {
                    subscriber.onError(new NullPointerException("The element at index " + i2 + " is null"));
                    return;
                }
                subscriber.onNext(t2);
            }
            if (this.cancelled) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        
            r10.index = r5;
            r11 = addAndGet(-r2);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void slowPath(long r11) {
            /*
                r10 = this;
                T[] r7 = r10.array
                int r6 = r7.length
                int r5 = r10.index
                org.reactivestreams.Subscriber<? super T> r4 = r10.downstream
                r8 = 0
            L9:
                r2 = r8
            La:
                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r0 == 0) goto L40
                if (r5 == r6) goto L40
                boolean r0 = r10.cancelled
                if (r0 == 0) goto L15
                return
            L15:
                r0 = r7[r5]
                if (r0 != 0) goto L37
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "The element at index "
                r1.<init>(r0)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r0 = " is null"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r4.onError(r2)
                return
            L37:
                r4.onNext(r0)
                r0 = 1
                long r2 = r2 + r0
                int r5 = r5 + 1
                goto La
            L40:
                if (r5 != r6) goto L4a
                boolean r0 = r10.cancelled
                if (r0 != 0) goto L49
                r4.onComplete()
            L49:
                return
            L4a:
                long r11 = r10.get()
                int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r0 != 0) goto La
                r10.index = r5
                long r0 = -r2
                long r11 = r10.addAndGet(r0)
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromArray.ArraySubscription.slowPath(long):void");
        }
    }

    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.array.length;
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            int i2 = this.index;
            T[] tArr = this.array;
            if (i2 == tArr.length) {
                return null;
            }
            this.index = i2 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i2], "array element is null");
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.validate(j2) && BackpressureHelper.add(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i2) {
            return (i2 + 1) - (i2 | 1);
        }

        abstract void slowPath(long j2);
    }

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) subscriber, this.array));
        } else {
            subscriber.onSubscribe(new ArraySubscription(subscriber, this.array));
        }
    }
}

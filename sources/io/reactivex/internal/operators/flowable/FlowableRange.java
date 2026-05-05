package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public final class FlowableRange extends Flowable<Integer> {
    final int end;
    final int start;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        BaseRangeSubscription(int i2, int i3) {
            this.index = i2;
            this.end = i3;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Integer poll() {
            int i2 = this.index;
            if (i2 == this.end) {
                return null;
            }
            this.index = i2 + 1;
            return Integer.valueOf(i2);
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
            return (-1) - (((-1) - i2) | ((-1) - 1));
        }

        abstract void slowPath(long j2);
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Integer> downstream;

        RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i2, int i3) {
            super(i2, i3);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i2 = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            for (int i3 = this.index; i3 != i2; i3++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i3));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            r9.index = r5;
            r10 = addAndGet(-r2);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void slowPath(long r10) {
            /*
                r9 = this;
                int r6 = r9.end
                int r5 = r9.index
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> r4 = r9.downstream
                r7 = 0
            L8:
                r2 = r7
            L9:
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 == 0) goto L24
                if (r5 == r6) goto L24
                boolean r0 = r9.cancelled
                if (r0 == 0) goto L14
                return
            L14:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                boolean r0 = r4.tryOnNext(r0)
                if (r0 == 0) goto L21
                r0 = 1
                long r2 = r2 + r0
            L21:
                int r5 = r5 + 1
                goto L9
            L24:
                if (r5 != r6) goto L2e
                boolean r0 = r9.cancelled
                if (r0 != 0) goto L2d
                r4.onComplete()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 != 0) goto L9
                r9.index = r5
                long r0 = -r2
                long r10 = r9.addAndGet(r0)
                int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r0 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRange.RangeConditionalSubscription.slowPath(long):void");
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final Subscriber<? super Integer> downstream;

        RangeSubscription(Subscriber<? super Integer> subscriber, int i2, int i3) {
            super(i2, i3);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i2 = this.end;
            Subscriber<? super Integer> subscriber = this.downstream;
            for (int i3 = this.index; i3 != i2; i3++) {
                if (this.cancelled) {
                    return;
                }
                subscriber.onNext(Integer.valueOf(i3));
            }
            if (this.cancelled) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r9.index = r5;
            r10 = addAndGet(-r2);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void slowPath(long r10) {
            /*
                r9 = this;
                int r6 = r9.end
                int r5 = r9.index
                org.reactivestreams.Subscriber<? super java.lang.Integer> r4 = r9.downstream
                r7 = 0
            L8:
                r2 = r7
            L9:
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 == 0) goto L21
                if (r5 == r6) goto L21
                boolean r0 = r9.cancelled
                if (r0 == 0) goto L14
                return
            L14:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r4.onNext(r0)
                r0 = 1
                long r2 = r2 + r0
                int r5 = r5 + 1
                goto L9
            L21:
                if (r5 != r6) goto L2b
                boolean r0 = r9.cancelled
                if (r0 != 0) goto L2a
                r4.onComplete()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 != 0) goto L9
                r9.index = r5
                long r0 = -r2
                long r10 = r9.addAndGet(r0)
                int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r0 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRange.RangeSubscription.slowPath(long):void");
        }
    }

    public FlowableRange(int i2, int i3) {
        this.start = i2;
        this.end = i2 + i3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Integer> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) subscriber, this.start, this.end));
        } else {
            subscriber.onSubscribe(new RangeSubscription(subscriber, this.start, this.end));
        }
    }
}

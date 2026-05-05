package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    final Iterable<? extends T> source;

    static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        BaseRangeSubscription(Iterator<? extends T> it) {
            this.it = it;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.it = null;
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.it;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            Iterator<? extends T> it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.it.next(), "Iterator.next() returned a null value");
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

    static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ConditionalSubscriber<? super T> downstream;

        IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void fastPath() {
            Iterator<? extends T> it = this.it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        
            r9 = addAndGet(-r2);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void slowPath(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r5 = r8.it
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r4 = r8.downstream
                r6 = 0
            L6:
                r2 = r6
            L7:
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 == 0) goto L43
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L10
                return
            L10:
                java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L5d
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L19
                return
            L19:
                if (r1 != 0) goto L26
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r0 = "Iterator.next() returned a null value"
                r1.<init>(r0)
                r4.onError(r1)
                return
            L26:
                boolean r1 = r4.tryOnNext(r1)
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L2f
                return
            L2f:
                boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L55
                if (r0 != 0) goto L3d
                boolean r0 = r8.cancelled
                if (r0 != 0) goto L3c
                r4.onComplete()
            L3c:
                return
            L3d:
                if (r1 == 0) goto L7
                r0 = 1
                long r2 = r2 + r0
                goto L7
            L43:
                long r9 = r8.get()
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 != 0) goto L7
                long r0 = -r2
                long r9 = r8.addAndGet(r0)
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r0 != 0) goto L6
                return
            L55:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.onError(r0)
                return
            L5d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorConditionalSubscription.slowPath(long):void");
        }
    }

    static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final Subscriber<? super T> downstream;

        IteratorSubscription(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void fastPath() {
            Iterator<? extends T> it = this.it;
            Subscriber<? super T> subscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        subscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    subscriber.onNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        subscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        
            r9 = addAndGet(-r2);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void slowPath(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r5 = r8.it
                org.reactivestreams.Subscriber<? super T> r4 = r8.downstream
                r6 = 0
            L6:
                r2 = r6
            L7:
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 == 0) goto L40
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L10
                return
            L10:
                java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L5a
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L19
                return
            L19:
                if (r1 != 0) goto L26
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r0 = "Iterator.next() returned a null value"
                r1.<init>(r0)
                r4.onError(r1)
                return
            L26:
                r4.onNext(r1)
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L2e
                return
            L2e:
                boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L52
                if (r0 != 0) goto L3c
                boolean r0 = r8.cancelled
                if (r0 != 0) goto L3b
                r4.onComplete()
            L3b:
                return
            L3c:
                r0 = 1
                long r2 = r2 + r0
                goto L7
            L40:
                long r9 = r8.get()
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 != 0) goto L7
                long r0 = -r2
                long r9 = r8.addAndGet(r0)
                int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r0 != 0) goto L6
                return
            L52:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.onError(r0)
                return
            L5a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorSubscription.slowPath(long):void");
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public static <T> void subscribe(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(subscriber);
            } else if (subscriber instanceof ConditionalSubscriber) {
                subscriber.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) subscriber, it));
            } else {
                subscriber.onSubscribe(new IteratorSubscription(subscriber, it));
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, subscriber);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            subscribe(subscriber, this.source.iterator());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}

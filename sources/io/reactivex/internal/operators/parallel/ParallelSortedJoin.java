package io.reactivex.internal.operators.parallel;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes6.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    final Comparator<? super T> comparator;
    final ParallelFlowable<List<T>> source;

    static final class SortedJoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final SortedJoinSubscription<T> parent;

        SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i2) {
            this.parent = sortedJoinSubscription;
            this.index = i2;
        }

        void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    static final class SortedJoinSubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 3481980673745556697L;
        volatile boolean cancelled;
        final Comparator<? super T> comparator;
        final Subscriber<? super T> downstream;
        final int[] indexes;
        final List<T>[] lists;
        final SortedJoinInnerSubscriber<T>[] subscribers;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger remaining = new AtomicInteger();
        final AtomicReference<Throwable> error = new AtomicReference<>();

        SortedJoinSubscription(Subscriber<? super T> subscriber, int i2, Comparator<? super T> comparator) {
            this.downstream = subscriber;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                sortedJoinInnerSubscriberArr[i3] = new SortedJoinInnerSubscriber<>(this, i3);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i2];
            this.indexes = new int[i2];
            this.remaining.lazySet(i2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.lists, (Object) null);
            }
        }

        void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:117:0x0079, code lost:
        
            if (r3 != r14) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x007d, code lost:
        
            if (r16.cancelled == false) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x007f, code lost:
        
            java.util.Arrays.fill(r7, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0083, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0084, code lost:
        
            r0 = r16.error.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x008d, code lost:
        
            if (r0 == null) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x008f, code lost:
        
            cancelAll();
            java.util.Arrays.fill(r7, (java.lang.Object) null);
            r8.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0098, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0099, code lost:
        
            if (r2 >= r5) goto L157;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x00a3, code lost:
        
            if (r6[r2] == r7[r2].size()) goto L139;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x00a9, code lost:
        
            if (r3 == 0) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x00b2, code lost:
        
            if (r14 == Long.MAX_VALUE) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x00b4, code lost:
        
            r16.requested.addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x00ba, code lost:
        
            r0 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x00be, code lost:
        
            if (r0 != r10) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x00c0, code lost:
        
            r0 = addAndGet(-r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x00c5, code lost:
        
            if (r0 != 0) goto L159;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x00c8, code lost:
        
            r2 = r2 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x00f0, code lost:
        
            java.util.Arrays.fill(r7, (java.lang.Object) null);
            r8.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x00f7, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void drain() {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription.drain():void");
        }

        void innerError(Throwable th) {
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.error, null, th)) {
                drain();
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        void innerNext(List<T> list, int i2) {
            this.lists[i2] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                BackpressureHelper.add(this.requested, j2);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(Subscriber<? super T> subscriber) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(subscriber, this.source.parallelism(), this.comparator);
        subscriber.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }
}

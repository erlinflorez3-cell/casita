package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes6.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z2, boolean z3, Observer<?> observer, boolean z4, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z4) {
            if (!z3) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static <T, U> boolean checkTerminated(boolean z2, boolean z3, Subscriber<?> subscriber, boolean z4, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z4) {
            if (!z3) {
                return false;
            }
            Throwable thError = queueDrain.error();
            if (thError != null) {
                subscriber.onError(thError);
            } else {
                subscriber.onComplete();
            }
            return true;
        }
        Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            subscriber.onError(thError2);
            return true;
        }
        if (!z3) {
            return false;
        }
        subscriber.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i2) {
        return i2 < 0 ? new SpscLinkedArrayQueue(-i2) : new SpscArrayQueue(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002a, code lost:
    
        r2 = r15.leave(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002f, code lost:
    
        if (r2 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> r11, io.reactivex.Observer<? super U> r12, boolean r13, io.reactivex.disposables.Disposable r14, io.reactivex.internal.util.ObservableQueueDrain<T, U> r15) {
        /*
            r3 = 1
            r2 = r3
        L2:
            r10 = r15
            boolean r4 = r10.done()
            r8 = r11
            boolean r5 = r8.isEmpty()
            r9 = r14
            r7 = r13
            r6 = r12
            boolean r0 = checkTerminated(r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L16
            return
        L16:
            boolean r4 = r10.done()
            java.lang.Object r1 = r8.poll()
            if (r1 != 0) goto L36
            r5 = r3
        L21:
            boolean r0 = checkTerminated(r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L28
            return
        L28:
            if (r5 == 0) goto L32
            int r0 = -r2
            int r2 = r10.leave(r0)
            if (r2 != 0) goto L2
            return
        L32:
            r10.accept(r6, r1)
            goto L16
        L36:
            r5 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.Observer, boolean, io.reactivex.disposables.Disposable, io.reactivex.internal.util.ObservableQueueDrain):void");
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, Subscriber<? super U> subscriber, boolean z2, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z3 = tPoll == null;
            if (checkTerminated(zDone, z3, subscriber, z2, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z3) {
                iLeave = queueDrain.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = queueDrain.requested();
                if (jRequested == 0) {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    subscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain.accept(subscriber, tPoll) && jRequested != Long.MAX_VALUE) {
                    queueDrain.produced(1L);
                }
            }
        }
    }

    static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2;
        long j3;
        if (queue.isEmpty()) {
            subscriber.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), subscriber, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j2 = atomicLong.get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j3 = j2 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        if (j2 != 0) {
            postCompleteDrain(j3, subscriber, queue, atomicLong, booleanSupplier);
        }
    }

    static <T> boolean postCompleteDrain(long j2, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j3 = j2 & Long.MIN_VALUE;
        while (true) {
            if (j3 != j2) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    subscriber.onComplete();
                    return true;
                }
                subscriber.onNext(tPoll);
                j3++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    subscriber.onComplete();
                    return true;
                }
                j2 = atomicLong.get();
                if (j2 == j3) {
                    j2 = atomicLong.addAndGet(-((j3 + Long.MAX_VALUE) - (j3 | Long.MAX_VALUE)));
                    if ((Long.MAX_VALUE + j2) - (Long.MAX_VALUE | j2) == 0) {
                        return false;
                    }
                    j3 = j2 & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j2, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j3;
        do {
            j3 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j3, (-1) - (((-1) - BackpressureHelper.addCap(Long.MAX_VALUE & j3, j2)) & ((-1) - (j3 & Long.MIN_VALUE)))));
        if (j3 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain((-1) - (((-1) - j2) & ((-1) - Long.MIN_VALUE)), subscriber, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static void request(Subscription subscription, int i2) {
        subscription.request(i2 < 0 ? Long.MAX_VALUE : i2);
    }
}

package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private ListenableFuture<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    volatile ListenableFuture<? extends O> mOutputFuture;

    ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, ListenableFuture<? extends I> listenableFuture) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.mOutputCreated.await();
            ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            if (timeUnit != TimeUnit.NANOSECONDS) {
                j2 = TimeUnit.NANOSECONDS.convert(j2, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j2, timeUnit);
                j2 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.mOutputCreated.await(j2, timeUnit)) {
                throw new TimeoutException();
            }
            j2 -= Math.max(0L, System.nanoTime() - jNanoTime2);
            ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j2, timeUnit);
            }
        }
        return (O) super.get(j2, timeUnit);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        if (!super.cancel(z2)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z2));
        cancel(this.mInputFuture, z2);
        cancel(this.mOutputFuture, z2);
        return true;
    }

    private void cancel(Future<?> future, boolean z2) {
        if (future != null) {
            future.cancel(z2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    @Override // java.lang.Runnable
    public void run() {
        final ListenableFuture<? extends O> listenableFutureApply;
        ?? r2 = (AsyncFunction<? super I, ? extends O>) null;
        try {
        } catch (UndeclaredThrowableException e2) {
            setException(e2.getCause());
        }
        try {
            try {
                try {
                    listenableFutureApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                    this.mOutputFuture = listenableFutureApply;
                } catch (CancellationException unused) {
                    cancel(false);
                } catch (ExecutionException e3) {
                    setException(e3.getCause());
                }
            } catch (Error e4) {
                setException(e4);
            } catch (Exception e5) {
                setException(e5);
            }
            if (!isCancelled()) {
                listenableFutureApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            try {
                                ChainingListenableFuture.this.set(Futures.getUninterruptibly(listenableFutureApply));
                            } catch (CancellationException unused2) {
                                ChainingListenableFuture.this.cancel(false);
                                ChainingListenableFuture.this.mOutputFuture = null;
                                return;
                            } catch (ExecutionException e6) {
                                ChainingListenableFuture.this.setException(e6.getCause());
                            }
                            ChainingListenableFuture.this.mOutputFuture = null;
                        } catch (Throwable th) {
                            ChainingListenableFuture.this.mOutputFuture = null;
                            throw th;
                        }
                    }
                }, CameraXExecutors.directExecutor());
            } else {
                listenableFutureApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                this.mOutputFuture = null;
            }
        } finally {
            this.mFunction = null;
            this.mInputFuture = null;
            this.mOutputCreated.countDown();
        }
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z2 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e2) {
        boolean z2 = false;
        while (true) {
            try {
                blockingQueue.put(e2);
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }
}

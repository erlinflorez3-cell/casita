package androidx.camera.core.impl.utils.futures;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class Futures {
    private static final Function<?, ?> IDENTITY_FUNCTION = new Function<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }

        AnonymousClass2() {
        }
    };

    public static <V> ListenableFuture<V> immediateFuture(V v2) {
        if (v2 == null) {
            return ImmediateFuture.nullFuture();
        }
        return new ImmediateFuture.ImmediateSuccessfulFuture(v2);
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$1 */
    class AnonymousClass1<I, O> implements AsyncFunction<I, O> {
        AnonymousClass1() {
        }

        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
        public ListenableFuture<O> apply(I i2) {
            return Futures.immediateFuture(function.apply(i2));
        }
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return transformAsync(listenableFuture, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            AnonymousClass1() {
            }

            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public ListenableFuture<O> apply(I i2) {
                return Futures.immediateFuture(function.apply(i2));
            }
        }, executor);
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$2 */
    class AnonymousClass2 implements Function<Object, Object> {
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }

        AnonymousClass2() {
        }
    }

    public static <V> void propagate(ListenableFuture<V> listenableFuture, CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(listenableFuture, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, CallbackToFutureAdapter.Completer<O> completer, Executor executor) {
        propagateTransform(true, listenableFuture, function, completer, executor);
    }

    private static <I, O> void propagateTransform(boolean z2, ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, CallbackToFutureAdapter.Completer<O> completer, Executor executor) {
        Preconditions.checkNotNull(listenableFuture);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(listenableFuture, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            final /* synthetic */ Function val$function;

            AnonymousClass3(Function function2) {
                function = function2;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I i2) {
                try {
                    completer.set(function.apply(i2));
                } catch (Throwable th) {
                    completer.setException(th);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                completer.setException(th);
            }
        }, executor);
        if (z2) {
            completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    listenableFuture.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$3 */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass3<I> implements FutureCallback<I> {
        final /* synthetic */ Function val$function;

        AnonymousClass3(Function function2) {
            function = function2;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(I i2) {
            try {
                completer.set(function.apply(i2));
            } catch (Throwable th) {
                completer.setException(th);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            completer.setException(th);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.Futures$4 */
    class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            listenableFuture.cancel(true);
        }
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(final ListenableFuture<V> listenableFuture) {
        Preconditions.checkNotNull(listenableFuture);
        return listenableFuture.isDone() ? listenableFuture : CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$nonCancellationPropagating$0(listenableFuture, completer);
            }
        });
    }

    static /* synthetic */ Object lambda$nonCancellationPropagating$0(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer) throws Exception {
        propagateTransform(false, listenableFuture, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }

    public static <V> ListenableFuture<List<V>> successfulAsList(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    public static <V> ListenableFuture<List<V>> allAsList(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    private static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e2) {
                e = e2;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e3) {
                e = e3;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e4);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        public String toString() {
            return getClass().getSimpleName() + "," + this.mCallback;
        }
    }

    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        boolean z2 = false;
        V v2 = future;
        while (true) {
            try {
                v2 = (V) ((Future) v2).get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
                v2 = v2;
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
        return v2;
    }

    public static <V> ListenableFuture<V> makeTimeoutFuture(final long j2, final ScheduledExecutorService scheduledExecutorService, final ListenableFuture<V> listenableFuture) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$makeTimeoutFuture$3(listenableFuture, scheduledExecutorService, j2, completer);
            }
        });
    }

    static /* synthetic */ Object lambda$makeTimeoutFuture$3(final ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, final long j2, final CallbackToFutureAdapter.Completer completer) throws Exception {
        propagate(listenableFuture, completer);
        if (!listenableFuture.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(completer.setException(new TimeoutException("Future[" + listenableFuture + "] is not done within " + j2 + " ms.")));
                }
            }, j2, TimeUnit.MILLISECONDS);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + listenableFuture + "]";
    }

    public static <V> ListenableFuture<V> makeTimeoutFuture(final long j2, final ScheduledExecutorService scheduledExecutorService, final V v2, final boolean z2, final ListenableFuture<V> listenableFuture) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$makeTimeoutFuture$6(listenableFuture, scheduledExecutorService, v2, z2, j2, completer);
            }
        });
    }

    static /* synthetic */ Object lambda$makeTimeoutFuture$6(final ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z2, long j2, final CallbackToFutureAdapter.Completer completer) throws Exception {
        propagate(listenableFuture, completer);
        if (!listenableFuture.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    Futures.lambda$makeTimeoutFuture$4(completer, obj, z2, listenableFuture);
                }
            }, j2, TimeUnit.MILLISECONDS);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + listenableFuture + "]";
    }

    static /* synthetic */ void lambda$makeTimeoutFuture$4(CallbackToFutureAdapter.Completer completer, Object obj, boolean z2, ListenableFuture listenableFuture) {
        completer.set(obj);
        if (z2) {
            listenableFuture.cancel(true);
        }
    }

    public static <V> ListenableFuture<Void> transformAsyncOnCompletion(final ListenableFuture<V> listenableFuture) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$transformAsyncOnCompletion$8(listenableFuture, completer);
            }
        });
    }

    static /* synthetic */ Object lambda$transformAsyncOnCompletion$8(ListenableFuture listenableFuture, final CallbackToFutureAdapter.Completer completer) throws Exception {
        listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                completer.set(null);
            }
        }, CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + listenableFuture + "]";
    }

    private Futures() {
    }
}

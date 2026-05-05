package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.CollectionFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.Futures$1 */
    class AnonymousClass1<O> implements Future<O> {
        final /* synthetic */ Function val$function;
        final /* synthetic */ Future val$input;

        AnonymousClass1(final Future val$input, final Function val$function) {
            val$input = val$input;
            val$function = val$function;
        }

        private O applyTransformation(I i2) throws ExecutionException {
            try {
                return (O) val$function.apply(i2);
            } catch (Error | RuntimeException e2) {
                throw new ExecutionException(e2);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            return val$input.cancel(mayInterruptIfRunning);
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException, InterruptedException {
            return applyTransformation(val$input.get());
        }

        @Override // java.util.concurrent.Future
        public O get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
            return applyTransformation(val$input.get(timeout, unit));
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return val$input.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return val$input.isDone();
        }
    }

    private static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> callback;
        final Future<V> future;

        CallbackListener(Future<V> future, FutureCallback<? super V> callback) {
            this.future = future;
            this.callback = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thTryInternalFastPathGetFailure;
            Future<V> future = this.future;
            if ((future instanceof InternalFutureFailureAccess) && (thTryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) future)) != null) {
                this.callback.onFailure(thTryInternalFastPathGetFailure);
                return;
            }
            try {
                this.callback.onSuccess(Futures.getDone(this.future));
            } catch (Error e2) {
                e = e2;
                this.callback.onFailure(e);
            } catch (RuntimeException e3) {
                e = e3;
                this.callback.onFailure(e);
            } catch (ExecutionException e4) {
                this.callback.onFailure(e4.getCause());
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.callback).toString();
        }
    }

    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final ImmutableList<ListenableFuture<? extends V>> futures;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1 */
        class AnonymousClass1 implements Callable<Void> {
            final /* synthetic */ Runnable val$combiner;

            AnonymousClass1(final FutureCombiner this$0, final Runnable val$combiner) {
                val$combiner = val$combiner;
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            public Void call() throws Exception {
                val$combiner.run();
                return null;
            }
        }

        private FutureCombiner(boolean allMustSucceed, ImmutableList<ListenableFuture<? extends V>> futures) {
            this.allMustSucceed = allMustSucceed;
            this.futures = futures;
        }

        /* synthetic */ FutureCombiner(boolean z2, ImmutableList immutableList, AnonymousClass1 anonymousClass1) {
            this(z2, immutableList);
        }

        public <C> ListenableFuture<C> call(Callable<C> combiner, Executor executor) {
            return new CombinedFuture(this.futures, this.allMustSucceed, executor, combiner);
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> combiner, Executor executor) {
            return new CombinedFuture(this.futures, this.allMustSucceed, executor, combiner);
        }

        public ListenableFuture<?> run(final Runnable combiner, Executor executor) {
            return call(new Callable<Void>(this) { // from class: com.google.common.util.concurrent.Futures.FutureCombiner.1
                final /* synthetic */ Runnable val$combiner;

                AnonymousClass1(FutureCombiner this, final Runnable combiner2) {
                    val$combiner = combiner2;
                }

                @Override // java.util.concurrent.Callable
                @CheckForNull
                public Void call() throws Exception {
                    val$combiner.run();
                    return null;
                }
            }, executor);
        }
    }

    private static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {

        @CheckForNull
        private InCompletionOrderState<T> state;

        private InCompletionOrderFuture(InCompletionOrderState<T> state) {
            this.state = state;
        }

        /* synthetic */ InCompletionOrderFuture(InCompletionOrderState inCompletionOrderState, AnonymousClass1 anonymousClass1) {
            this(inCompletionOrderState);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
            this.state = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean interruptIfRunning) {
            InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (!super.cancel(interruptIfRunning)) {
                return false;
            }
            ((InCompletionOrderState) Objects.requireNonNull(inCompletionOrderState)).recordOutputCancellation(interruptIfRunning);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        @CheckForNull
        protected String pendingToString() {
            InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (inCompletionOrderState != null) {
                return "inputCount=[" + ((InCompletionOrderState) inCompletionOrderState).inputFutures.length + "], remaining=[" + ((InCompletionOrderState) inCompletionOrderState).incompleteOutputCount.get() + "]";
            }
            return null;
        }
    }

    static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final AtomicInteger incompleteOutputCount;
        private final ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        private InCompletionOrderState(ListenableFuture<? extends T>[] inputFutures) {
            this.wasCancelled = false;
            this.shouldInterrupt = true;
            this.delegateIndex = 0;
            this.inputFutures = inputFutures;
            this.incompleteOutputCount = new AtomicInteger(inputFutures.length);
        }

        /* synthetic */ InCompletionOrderState(ListenableFuture[] listenableFutureArr, AnonymousClass1 anonymousClass1) {
            this(listenableFutureArr);
        }

        private void recordCompletion() {
            if (this.incompleteOutputCount.decrementAndGet() == 0 && this.wasCancelled) {
                for (ListenableFuture<? extends T> listenableFuture : this.inputFutures) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.shouldInterrupt);
                    }
                }
            }
        }

        public void recordInputCompletion(ImmutableList<AbstractFuture<T>> delegates, int inputFutureIndex) {
            ListenableFuture<? extends T> listenableFuture = (ListenableFuture) Objects.requireNonNull(this.inputFutures[inputFutureIndex]);
            this.inputFutures[inputFutureIndex] = null;
            for (int i2 = this.delegateIndex; i2 < delegates.size(); i2++) {
                if (delegates.get(i2).setFuture(listenableFuture)) {
                    recordCompletion();
                    this.delegateIndex = i2 + 1;
                    return;
                }
            }
            this.delegateIndex = delegates.size();
        }

        public void recordOutputCancellation(boolean interruptIfRunning) {
            this.wasCancelled = true;
            if (!interruptIfRunning) {
                this.shouldInterrupt = false;
            }
            recordCompletion();
        }
    }

    private static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {

        @CheckForNull
        private ListenableFuture<V> delegate;

        NonCancellationPropagatingFuture(final ListenableFuture<V> delegate) {
            this.delegate = delegate;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
            this.delegate = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        @CheckForNull
        protected String pendingToString() {
            ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                return "delegate=[" + listenableFuture + "]";
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(final ListenableFuture<V> future, final FutureCallback<? super V> callback, Executor executor) {
        Preconditions.checkNotNull(callback);
        future.addListener(new CallbackListener(future, callback), executor);
    }

    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> futures) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(futures), true);
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... futures) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(futures), true);
    }

    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> input, Class<X> exceptionType, Function<? super X, ? extends V> fallback, Executor executor) {
        return AbstractCatchingFuture.create(input, exceptionType, fallback, executor);
    }

    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> input, Class<X> exceptionType, AsyncFunction<? super X, ? extends V> fallback, Executor executor) {
        return AbstractCatchingFuture.create(input, exceptionType, fallback, executor);
    }

    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) FuturesGetChecked.getChecked(future, cls);
    }

    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j2, TimeUnit timeUnit) throws Exception {
        return (V) FuturesGetChecked.getChecked(future, cls, j2, timeUnit);
    }

    @ParametricNullness
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.getUninterruptibly(future);
    }

    @ParametricNullness
    public static <V> V getUnchecked(Future<V> future) {
        Preconditions.checkNotNull(future);
        try {
            return (V) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e2) {
            wrapAndThrowUnchecked(e2.getCause());
            throw new AssertionError();
        }
    }

    private static <T> ListenableFuture<? extends T>[] gwtCompatibleToArray(Iterable<? extends ListenableFuture<? extends T>> futures) {
        return (ListenableFuture[]) (futures instanceof Collection ? (Collection) futures : ImmutableList.copyOf(futures)).toArray(new ListenableFuture[0]);
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
        ImmediateFuture.ImmediateCancelledFuture<Object> immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new ImmediateFuture.ImmediateCancelledFuture();
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        return new ImmediateFuture.ImmediateFailedFuture(throwable);
    }

    public static <V> ListenableFuture<V> immediateFuture(@ParametricNullness V v2) {
        return v2 == null ? (ListenableFuture<V>) ImmediateFuture.NULL : new ImmediateFuture(v2);
    }

    public static ListenableFuture<Void> immediateVoidFuture() {
        return ImmediateFuture.NULL;
    }

    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> futures) {
        ListenableFuture[] listenableFutureArrGwtCompatibleToArray = gwtCompatibleToArray(futures);
        final InCompletionOrderState inCompletionOrderState = new InCompletionOrderState(listenableFutureArrGwtCompatibleToArray);
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(listenableFutureArrGwtCompatibleToArray.length);
        for (int i2 = 0; i2 < listenableFutureArrGwtCompatibleToArray.length; i2++) {
            builderBuilderWithExpectedSize.add(new InCompletionOrderFuture(inCompletionOrderState));
        }
        final ImmutableList<ListenableFuture<T>> immutableListBuild = builderBuilderWithExpectedSize.build();
        for (final int i3 = 0; i3 < listenableFutureArrGwtCompatibleToArray.length; i3++) {
            listenableFutureArrGwtCompatibleToArray[i3].addListener(new Runnable() { // from class: com.google.common.util.concurrent.Futures$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    inCompletionOrderState.recordInputCompletion(immutableListBuild, i3);
                }
            }, MoreExecutors.directExecutor());
        }
        return immutableListBuild;
    }

    public static <I, O> Future<O> lazyTransform(final Future<I> input, final Function<? super I, ? extends O> function) {
        Preconditions.checkNotNull(input);
        Preconditions.checkNotNull(function);
        return new Future<O>() { // from class: com.google.common.util.concurrent.Futures.1
            final /* synthetic */ Function val$function;
            final /* synthetic */ Future val$input;

            AnonymousClass1(final Future input2, final Function function2) {
                val$input = input2;
                val$function = function2;
            }

            private O applyTransformation(I i2) throws ExecutionException {
                try {
                    return (O) val$function.apply(i2);
                } catch (Error | RuntimeException e2) {
                    throw new ExecutionException(e2);
                }
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                return val$input.cancel(mayInterruptIfRunning);
            }

            @Override // java.util.concurrent.Future
            public O get() throws ExecutionException, InterruptedException {
                return applyTransformation(val$input.get());
            }

            @Override // java.util.concurrent.Future
            public O get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
                return applyTransformation(val$input.get(timeout, unit));
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return val$input.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return val$input.isDone();
            }
        };
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> future) {
        if (future.isDone()) {
            return future;
        }
        NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new NonCancellationPropagatingFuture(future);
        future.addListener(nonCancellationPropagatingFuture, MoreExecutors.directExecutor());
        return nonCancellationPropagatingFuture;
    }

    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> callable, long delay, TimeUnit timeUnit, ScheduledExecutorService executorService) {
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(callable);
        final ScheduledFuture<?> scheduledFutureSchedule = executorService.schedule(trustedListenableFutureTaskCreate, delay, timeUnit);
        trustedListenableFutureTaskCreate.addListener(new Runnable() { // from class: com.google.common.util.concurrent.Futures$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, MoreExecutors.directExecutor());
        return trustedListenableFutureTaskCreate;
    }

    public static ListenableFuture<Void> submit(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(runnable, null);
        executor.execute(trustedListenableFutureTaskCreate);
        return trustedListenableFutureTaskCreate;
    }

    public static <O> ListenableFuture<O> submit(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(callable);
        executor.execute(trustedListenableFutureTaskCreate);
        return trustedListenableFutureTaskCreate;
    }

    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> callable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(callable);
        executor.execute(trustedListenableFutureTaskCreate);
        return trustedListenableFutureTaskCreate;
    }

    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> futures) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(futures), false);
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... futures) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(futures), false);
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> input, Function<? super I, ? extends O> function, Executor executor) {
        return AbstractTransformFuture.create(input, function, executor);
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> input, AsyncFunction<? super I, ? extends O> function, Executor executor) {
        return AbstractTransformFuture.create(input, function, executor);
    }

    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> futures) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(futures));
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... futures) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(futures));
    }

    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> futures) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(futures));
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... futures) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(futures));
    }

    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return delegate.isDone() ? delegate : TimeoutFuture.create(delegate, time, unit, scheduledExecutor);
    }

    private static void wrapAndThrowUnchecked(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new UncheckedExecutionException(cause);
        }
        throw new ExecutionError((Error) cause);
    }
}

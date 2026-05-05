package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAmb;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableCache;
import io.reactivex.internal.operators.completable.CompletableConcat;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDefer;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableDetach;
import io.reactivex.internal.operators.completable.CompletableDisposeOn;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.internal.operators.completable.CompletableDoOnEvent;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletableError;
import io.reactivex.internal.operators.completable.CompletableErrorSupplier;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.completable.CompletableFromObservable;
import io.reactivex.internal.operators.completable.CompletableFromPublisher;
import io.reactivex.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.internal.operators.completable.CompletableHide;
import io.reactivex.internal.operators.completable.CompletableLift;
import io.reactivex.internal.operators.completable.CompletableMaterialize;
import io.reactivex.internal.operators.completable.CompletableMerge;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray;
import io.reactivex.internal.operators.completable.CompletableMergeDelayErrorIterable;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.internal.operators.completable.CompletableNever;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable;
import io.reactivex.internal.operators.completable.CompletableTimeout;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.completable.CompletableToObservable;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import io.reactivex.internal.operators.completable.CompletableUsing;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.mixed.CompletableAndThenPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Completable implements CompletableSource {
    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable amb(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableAmb(null, iterable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable ambArray(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? complete() : completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableAmb(completableSourceArr, null));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable complete() {
        return RxJavaPlugins.onAssembly(CompletableEmpty.INSTANCE);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable concat(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableConcatIterable(iterable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable concat(Publisher<? extends CompletableSource> publisher) {
        return concat(publisher, 2);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable concat(Publisher<? extends CompletableSource> publisher, int i2) {
        ObjectHelper.requireNonNull(publisher, "sources is null");
        ObjectHelper.verifyPositive(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new CompletableConcat(publisher, i2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable concatArray(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? complete() : completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableConcatArray(completableSourceArr));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable create(CompletableOnSubscribe completableOnSubscribe) {
        ObjectHelper.requireNonNull(completableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new CompletableCreate(completableOnSubscribe));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable defer(Callable<? extends CompletableSource> callable) {
        ObjectHelper.requireNonNull(callable, "completableSupplier");
        return RxJavaPlugins.onAssembly(new CompletableDefer(callable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    private Completable doOnLifecycle(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.requireNonNull(action2, "onTerminate is null");
        ObjectHelper.requireNonNull(action3, "onAfterTerminate is null");
        ObjectHelper.requireNonNull(action4, "onDispose is null");
        return RxJavaPlugins.onAssembly(new CompletablePeek(this, consumer, consumer2, action, action2, action3, action4));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable error(Throwable th) {
        ObjectHelper.requireNonNull(th, "error is null");
        return RxJavaPlugins.onAssembly(new CompletableError(th));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable error(Callable<? extends Throwable> callable) {
        ObjectHelper.requireNonNull(callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableErrorSupplier(callable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable fromAction(Action action) {
        ObjectHelper.requireNonNull(action, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromAction(action));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable fromCallable(Callable<?> callable) {
        ObjectHelper.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromCallable(callable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable fromFuture(Future<?> future) {
        ObjectHelper.requireNonNull(future, "future is null");
        return fromAction(Functions.futureAction(future));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static <T> Completable fromMaybe(MaybeSource<T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElementCompletable(maybeSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static <T> Completable fromObservable(ObservableSource<T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "observable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromObservable(observableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static <T> Completable fromPublisher(Publisher<T> publisher) {
        ObjectHelper.requireNonNull(publisher, "publisher is null");
        return RxJavaPlugins.onAssembly(new CompletableFromPublisher(publisher));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable fromRunnable(Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromRunnable(runnable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static <T> Completable fromSingle(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "single is null");
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(singleSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable merge(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeIterable(iterable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static Completable merge(Publisher<? extends CompletableSource> publisher) {
        return merge0(publisher, Integer.MAX_VALUE, false);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable merge(Publisher<? extends CompletableSource> publisher, int i2) {
        return merge0(publisher, i2, false);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    private static Completable merge0(Publisher<? extends CompletableSource> publisher, int i2, boolean z2) {
        ObjectHelper.requireNonNull(publisher, "sources is null");
        ObjectHelper.verifyPositive(i2, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new CompletableMerge(publisher, i2, z2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable mergeArray(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? complete() : completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableMergeArray(completableSourceArr));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable mergeArrayDelayError(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorArray(completableSourceArr));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable mergeDelayError(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorIterable(iterable));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static Completable mergeDelayError(Publisher<? extends CompletableSource> publisher) {
        return merge0(publisher, Integer.MAX_VALUE, true);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable mergeDelayError(Publisher<? extends CompletableSource> publisher, int i2) {
        return merge0(publisher, i2, true);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable never() {
        return RxJavaPlugins.onAssembly(CompletableNever.INSTANCE);
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    private Completable timeout0(long j2, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimeout(this, j2, timeUnit, scheduler, completableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public static Completable timer(long j2, TimeUnit timeUnit) {
        return timer(j2, timeUnit, Schedulers.computation());
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public static Completable timer(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimer(j2, timeUnit, scheduler));
    }

    private static NullPointerException toNpe(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable unsafeCreate(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "source is null");
        if (completableSource instanceof Completable) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static <R> Completable using(Callable<R> callable, Function<? super R, ? extends CompletableSource> function, Consumer<? super R> consumer) {
        return using(callable, function, consumer, true);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static <R> Completable using(Callable<R> callable, Function<? super R, ? extends CompletableSource> function, Consumer<? super R> consumer, boolean z2) {
        ObjectHelper.requireNonNull(callable, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function, "completableFunction is null");
        ObjectHelper.requireNonNull(consumer, "disposer is null");
        return RxJavaPlugins.onAssembly(new CompletableUsing(callable, function, consumer, z2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public static Completable wrap(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "source is null");
        return completableSource instanceof Completable ? RxJavaPlugins.onAssembly((Completable) completableSource) : RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable ambWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return ambArray(this, completableSource);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable andThen(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T> Flowable<T> andThen(Publisher<T> publisher) {
        ObjectHelper.requireNonNull(publisher, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenPublisher(this, publisher));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Maybe<T> andThen(MaybeSource<T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "next is null");
        return RxJavaPlugins.onAssembly(new MaybeDelayWithCompletable(maybeSource, this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Observable<T> andThen(ObservableSource<T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenObservable(this, observableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Single<T> andThen(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "next is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithCompletable(singleSource, this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <R> R as(CompletableConverter<? extends R> completableConverter) {
        return (R) ((CompletableConverter) ObjectHelper.requireNonNull(completableConverter, "converter is null")).apply(this);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    public final void blockingAwait() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        blockingMultiObserver.blockingGet();
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final boolean blockingAwait(long j2, TimeUnit timeUnit) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingAwait(j2, timeUnit);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Throwable blockingGet() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingGetError();
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Throwable blockingGet(long j2, TimeUnit timeUnit) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingGetError(j2, timeUnit);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable cache() {
        return RxJavaPlugins.onAssembly(new CompletableCache(this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable compose(CompletableTransformer completableTransformer) {
        return wrap(((CompletableTransformer) ObjectHelper.requireNonNull(completableTransformer, "transformer is null")).apply(this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable concatWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public final Completable delay(long j2, TimeUnit timeUnit) {
        return delay(j2, timeUnit, Schedulers.computation(), false);
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable delay(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j2, timeUnit, scheduler, false);
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable delay(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDelay(this, j2, timeUnit, scheduler, z2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public final Completable delaySubscription(long j2, TimeUnit timeUnit) {
        return delaySubscription(j2, timeUnit, Schedulers.computation());
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable delaySubscription(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return timer(j2, timeUnit, scheduler).andThen(this);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doAfterTerminate(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, action, Functions.EMPTY_ACTION);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doFinally(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new CompletableDoFinally(this, action));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doOnComplete(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doOnDispose(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, action);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doOnError(Consumer<? super Throwable> consumer) {
        return doOnLifecycle(Functions.emptyConsumer(), consumer, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doOnEvent(Consumer<? super Throwable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onEvent is null");
        return RxJavaPlugins.onAssembly(new CompletableDoOnEvent(this, consumer));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doOnSubscribe(Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, Functions.emptyConsumer(), Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable doOnTerminate(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action, Functions.EMPTY_ACTION, Functions.EMPTY_ACTION);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable hide() {
        return RxJavaPlugins.onAssembly(new CompletableHide(this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable lift(CompletableOperator completableOperator) {
        ObjectHelper.requireNonNull(completableOperator, "onLift is null");
        return RxJavaPlugins.onAssembly(new CompletableLift(this, completableOperator));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Single<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new CompletableMaterialize(this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable mergeWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return mergeArray(this, completableSource);
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable observeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableObserveOn(this, scheduler));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable onErrorComplete() {
        return onErrorComplete(Functions.alwaysTrue());
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable onErrorComplete(Predicate<? super Throwable> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new CompletableOnErrorComplete(this, predicate));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable onErrorResumeNext(Function<? super Throwable, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "errorMapper is null");
        return RxJavaPlugins.onAssembly(new CompletableResumeNext(this, function));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new CompletableDetach(this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable repeat() {
        return fromPublisher(toFlowable().repeat());
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable repeat(long j2) {
        return fromPublisher(toFlowable().repeat(j2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable repeatUntil(BooleanSupplier booleanSupplier) {
        return fromPublisher(toFlowable().repeatUntil(booleanSupplier));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable repeatWhen(Function<? super Flowable<Object>, ? extends Publisher<?>> function) {
        return fromPublisher(toFlowable().repeatWhen(function));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable retry() {
        return fromPublisher(toFlowable().retry());
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable retry(long j2) {
        return fromPublisher(toFlowable().retry(j2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable retry(long j2, Predicate<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(j2, predicate));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        return fromPublisher(toFlowable().retry(biPredicate));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable retry(Predicate<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(predicate));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable retryWhen(Function<? super Flowable<Throwable>, ? extends Publisher<?>> function) {
        return fromPublisher(toFlowable().retryWhen(function));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable startWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return concatArray(completableSource, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T> Flowable<T> startWith(Publisher<T> publisher) {
        ObjectHelper.requireNonNull(publisher, "other is null");
        return toFlowable().startWith((Publisher) publisher);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Observable<T> startWith(Observable<T> observable) {
        ObjectHelper.requireNonNull(observable, "other is null");
        return observable.concatWith(toObservable());
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    public final Disposable subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Disposable subscribe(Action action) {
        ObjectHelper.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @Override // io.reactivex.CompletableSource
    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    public final void subscribe(CompletableObserver completableObserver) {
        ObjectHelper.requireNonNull(completableObserver, "observer is null");
        try {
            CompletableObserver completableObserverOnSubscribe = RxJavaPlugins.onSubscribe(this, completableObserver);
            ObjectHelper.requireNonNull(completableObserverOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(completableObserverOnSubscribe);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            RxJavaPlugins.onError(th);
            throw toNpe(th);
        }
    }

    protected abstract void subscribeActual(CompletableObserver completableObserver);

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable subscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableSubscribeOn(this, scheduler));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <E extends CompletableObserver> E subscribeWith(E e2) {
        subscribe(e2);
        return e2;
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Completable takeUntil(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableTakeUntilCompletable(this, completableSource));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final TestObserver<Void> test() {
        TestObserver<Void> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final TestObserver<Void> test(boolean z2) {
        TestObserver<Void> testObserver = new TestObserver<>();
        if (z2) {
            testObserver.cancel();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public final Completable timeout(long j2, TimeUnit timeUnit) {
        return timeout0(j2, timeUnit, Schedulers.computation(), null);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public final Completable timeout(long j2, TimeUnit timeUnit, CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return timeout0(j2, timeUnit, Schedulers.computation(), completableSource);
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable timeout(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j2, timeUnit, scheduler, null);
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable timeout(long j2, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return timeout0(j2, timeUnit, scheduler, completableSource);
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <U> U to(Function<? super Completable, U> function) {
        try {
            return (U) ((Function) ObjectHelper.requireNonNull(function, "converter is null")).apply(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T> Flowable<T> toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).fuseToFlowable() : RxJavaPlugins.onAssembly(new CompletableToFlowable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Maybe<T> toMaybe() {
        return this instanceof FuseToMaybe ? ((FuseToMaybe) this).fuseToMaybe() : RxJavaPlugins.onAssembly(new MaybeFromCompletable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Observable<T> toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).fuseToObservable() : RxJavaPlugins.onAssembly(new CompletableToObservable(this));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Single<T> toSingle(Callable<? extends T> callable) {
        ObjectHelper.requireNonNull(callable, "completionValueSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, callable, null));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final <T> Single<T> toSingleDefault(T t2) {
        ObjectHelper.requireNonNull(t2, "completionValue is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, null, t2));
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Completable unsubscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDisposeOn(this, scheduler));
    }
}

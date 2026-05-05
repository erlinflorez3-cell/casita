package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableAutoConnect;
import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservablePublishClassic;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private ConnectableObservable<T> onRefCount() {
        return this instanceof ObservablePublishClassic ? RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublishAlt(((ObservablePublishClassic) this).publishSource())) : this;
    }

    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public Observable<T> autoConnect(int i2) {
        return autoConnect(i2, Functions.emptyConsumer());
    }

    public Observable<T> autoConnect(int i2, Consumer<? super Disposable> consumer) {
        if (i2 > 0) {
            return RxJavaPlugins.onAssembly(new ObservableAutoConnect(this, i2, consumer));
        }
        connect(consumer);
        return RxJavaPlugins.onAssembly((ConnectableObservable) this);
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public abstract void connect(Consumer<? super Disposable> consumer);

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public Observable<T> refCount() {
        return RxJavaPlugins.onAssembly(new ObservableRefCount(onRefCount()));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @CheckReturnValue
    public final Observable<T> refCount(int i2) {
        return refCount(i2, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public final Observable<T> refCount(int i2, long j2, TimeUnit timeUnit) {
        return refCount(i2, j2, timeUnit, Schedulers.computation());
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Observable<T> refCount(int i2, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i2, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableRefCount(onRefCount(), i2, j2, timeUnit, scheduler));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @CheckReturnValue
    public final Observable<T> refCount(long j2, TimeUnit timeUnit) {
        return refCount(1, j2, timeUnit, Schedulers.computation());
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @CheckReturnValue
    public final Observable<T> refCount(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j2, timeUnit, scheduler);
    }
}

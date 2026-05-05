package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableAutoConnect;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import io.reactivex.internal.operators.flowable.FlowablePublishClassic;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConnectableFlowable<T> extends Flowable<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private ConnectableFlowable<T> onRefCount() {
        if (!(this instanceof FlowablePublishClassic)) {
            return this;
        }
        FlowablePublishClassic flowablePublishClassic = (FlowablePublishClassic) this;
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublishAlt(flowablePublishClassic.publishSource(), flowablePublishClassic.publishBufferSize()));
    }

    public Flowable<T> autoConnect() {
        return autoConnect(1);
    }

    public Flowable<T> autoConnect(int i2) {
        return autoConnect(i2, Functions.emptyConsumer());
    }

    public Flowable<T> autoConnect(int i2, Consumer<? super Disposable> consumer) {
        if (i2 > 0) {
            return RxJavaPlugins.onAssembly(new FlowableAutoConnect(this, i2, consumer));
        }
        connect(consumer);
        return RxJavaPlugins.onAssembly((ConnectableFlowable) this);
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public abstract void connect(Consumer<? super Disposable> consumer);

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public Flowable<T> refCount() {
        return RxJavaPlugins.onAssembly(new FlowableRefCount(onRefCount()));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("9;;3")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i2) {
        return refCount(i2, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i2, long j2, TimeUnit timeUnit) {
        return refCount(i2, j2, timeUnit, Schedulers.computation());
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(int i2, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i2, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableRefCount(onRefCount(), i2, j2, timeUnit, scheduler));
    }

    @InterfaceC1492Gx
    @SchedulerSupport("4;z@414F<J:N\u0011;HGKQQ?SIPP")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(long j2, TimeUnit timeUnit) {
        return refCount(1, j2, timeUnit, Schedulers.computation());
    }

    @InterfaceC1492Gx
    @SchedulerSupport(".A@B>=")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> refCount(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j2, timeUnit, scheduler);
    }
}

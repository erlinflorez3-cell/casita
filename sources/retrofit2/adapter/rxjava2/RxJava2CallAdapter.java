package retrofit2.adapter.rxjava2;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes2.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;

    @Nullable
    private final Scheduler scheduler;

    RxJava2CallAdapter(Type type, @Nullable Scheduler scheduler, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.responseType = type;
        this.scheduler = scheduler;
        this.isAsync = z2;
        this.isResult = z3;
        this.isBody = z4;
        this.isFlowable = z5;
        this.isSingle = z6;
        this.isMaybe = z7;
        this.isCompletable = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object adapt(retrofit2.Call<R> r3) {
        /*
            r2 = this;
            boolean r0 = r2.isAsync
            if (r0 == 0) goto L30
            retrofit2.adapter.rxjava2.CallEnqueueObservable r1 = new retrofit2.adapter.rxjava2.CallEnqueueObservable
            r1.<init>(r3)
        L9:
            boolean r0 = r2.isResult
            if (r0 == 0) goto L26
            retrofit2.adapter.rxjava2.ResultObservable r0 = new retrofit2.adapter.rxjava2.ResultObservable
            r0.<init>(r1)
        L12:
            r1 = r0
        L13:
            io.reactivex.Scheduler r0 = r2.scheduler
            if (r0 == 0) goto L1b
            io.reactivex.Observable r1 = r1.subscribeOn(r0)
        L1b:
            boolean r0 = r2.isFlowable
            if (r0 == 0) goto L36
            io.reactivex.BackpressureStrategy r0 = io.reactivex.BackpressureStrategy.MISSING
            io.reactivex.Flowable r0 = r1.toFlowable(r0)
            return r0
        L26:
            boolean r0 = r2.isBody
            if (r0 == 0) goto L13
            retrofit2.adapter.rxjava2.BodyObservable r0 = new retrofit2.adapter.rxjava2.BodyObservable
            r0.<init>(r1)
            goto L12
        L30:
            retrofit2.adapter.rxjava2.CallExecuteObservable r1 = new retrofit2.adapter.rxjava2.CallExecuteObservable
            r1.<init>(r3)
            goto L9
        L36:
            boolean r0 = r2.isSingle
            if (r0 == 0) goto L3f
            io.reactivex.Single r0 = r1.singleOrError()
            return r0
        L3f:
            boolean r0 = r2.isMaybe
            if (r0 == 0) goto L48
            io.reactivex.Maybe r0 = r1.singleElement()
            return r0
        L48:
            boolean r0 = r2.isCompletable
            if (r0 == 0) goto L51
            io.reactivex.Completable r0 = r1.ignoreElements()
            return r0
        L51:
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.RxJava2CallAdapter.adapt(retrofit2.Call):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.responseType;
    }
}

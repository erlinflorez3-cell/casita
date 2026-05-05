package com.incode.welcome_sdk.commons.b;

import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4647d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4648e = 1;

    @SchedulerSupport("none")
    public static <T> ObservableTransformer<T, T> a(ObservableSource<Boolean> observableSource) {
        int i2 = 2 % 2;
        int i3 = f4647d + 39;
        f4648e = i3 % 128;
        int i4 = i3 % 2;
        ObservableTransformer<T, T> observableTransformerC = c(observableSource, Flowable.bufferSize());
        int i5 = f4647d + 89;
        f4648e = i5 % 128;
        int i6 = i5 % 2;
        return observableTransformerC;
    }

    @SchedulerSupport("none")
    private static <T> ObservableTransformer<T, T> c(ObservableSource<Boolean> observableSource, int i2) {
        int i3 = 2 % 2;
        ObjectHelper.requireNonNull(observableSource, "other is null");
        ObjectHelper.verifyPositive(i2, "bufferSize");
        a aVar = new a(null, observableSource, true, i2);
        int i4 = f4648e + 71;
        f4647d = i4 % 128;
        if (i4 % 2 == 0) {
            return aVar;
        }
        throw null;
    }
}

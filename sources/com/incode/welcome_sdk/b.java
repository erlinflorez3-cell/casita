package com.incode.welcome_sdk;

import com.incode.welcome_sdk.results.BaseResult;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4420a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4421b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4422c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static PublishSubject<BaseResult> f4423d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4424e = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f4425j = 1;

    private b() {
    }

    static {
        PublishSubject<BaseResult> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "");
        f4423d = publishSubjectCreate;
        int i2 = f4425j + 1;
        f4422c = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Observable<BaseResult> d() {
        int i2 = 2 % 2;
        int i3 = f4420a + 117;
        f4424e = i3 % 128;
        if (i3 % 2 != 0) {
            Observable<BaseResult> observableHide = f4423d.hide();
            Intrinsics.checkNotNullExpressionValue(observableHide, "");
            return observableHide;
        }
        Observable<BaseResult> observableHide2 = f4423d.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "");
        int i4 = 46 / 0;
        return observableHide2;
    }

    @JvmStatic
    public static final void publish(BaseResult baseResult) {
        int i2 = 2 % 2;
        int i3 = f4420a + 33;
        f4424e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(baseResult, "");
            f4423d.onNext(baseResult);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(baseResult, "");
        f4423d.onNext(baseResult);
        int i4 = f4420a + 91;
        f4424e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void e() {
        int i2 = 2 % 2;
        int i3 = f4420a + 67;
        f4424e = i3 % 128;
        int i4 = i3 % 2;
        PublishSubject<BaseResult> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "");
        f4423d = publishSubjectCreate;
        int i5 = f4420a + 9;
        f4424e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
    }
}

package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.os.SystemClock;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.d;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract;
import dagger.internal.Factory;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseValidationPresenter_Factory implements Factory<BaseValidationPresenter> {

    /* JADX INFO: renamed from: d */
    public static int f11794d = 0;

    /* JADX INFO: renamed from: e */
    public static int f11795e = 0;

    /* JADX INFO: renamed from: i */
    private static int f11796i = 1;

    /* JADX INFO: renamed from: j */
    private static int f11797j = 0;

    /* JADX INFO: renamed from: a */
    private final Provider<Observable<IdCaptureKitAndroid>> f11798a;

    /* JADX INFO: renamed from: b */
    private final Provider<PublishSubject<d>> f11799b;

    /* JADX INFO: renamed from: c */
    private final Provider<IncodeWelcomeRepository> f11800c;

    /* JADX INFO: renamed from: h */
    private final Provider<BaseValidationContract.View> f11801h;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11796i + 81;
        f11797j = i3 % 128;
        if (i3 % 2 != 0) {
            get();
            throw null;
        }
        BaseValidationPresenter baseValidationPresenter = get();
        int i4 = f11796i + 25;
        f11797j = i4 % 128;
        int i5 = i4 % 2;
        return baseValidationPresenter;
    }

    public BaseValidationPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<PublishSubject<d>> provider2, Provider<Observable<IdCaptureKitAndroid>> provider3, Provider<BaseValidationContract.View> provider4) {
        this.f11800c = provider;
        this.f11799b = provider2;
        this.f11798a = provider3;
        this.f11801h = provider4;
    }

    @Override // javax.inject.Provider
    public final BaseValidationPresenter get() {
        int i2 = 2 % 2;
        int i3 = f11796i + 71;
        f11797j = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationPresenter baseValidationPresenterNewInstance = newInstance(this.f11800c.get(), this.f11799b.get(), this.f11798a.get(), this.f11801h.get());
        int i5 = f11796i + 33;
        f11797j = i5 % 128;
        if (i5 % 2 == 0) {
            return baseValidationPresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BaseValidationPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<PublishSubject<d>> provider2, Provider<Observable<IdCaptureKitAndroid>> provider3, Provider<BaseValidationContract.View> provider4) {
        int i2 = 2 % 2;
        BaseValidationPresenter_Factory baseValidationPresenter_Factory = new BaseValidationPresenter_Factory(provider, provider2, provider3, provider4);
        int i3 = f11796i + 43;
        f11797j = i3 % 128;
        int i4 = i3 % 2;
        return baseValidationPresenter_Factory;
    }

    public static BaseValidationPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, PublishSubject<d> publishSubject, Observable<IdCaptureKitAndroid> observable, BaseValidationContract.View view) {
        int i2 = 2 % 2;
        BaseValidationPresenter baseValidationPresenter = new BaseValidationPresenter(incodeWelcomeRepository, publishSubject, observable, view);
        int i3 = f11797j + 67;
        f11796i = i3 % 128;
        if (i3 % 2 != 0) {
            return baseValidationPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int e() {
        int i2 = f11795e;
        int i3 = i2 % 5582550;
        f11795e = i2 + 1;
        if (i3 != 0) {
            return f11794d;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        f11794d = iUptimeMillis;
        return iUptimeMillis;
    }
}

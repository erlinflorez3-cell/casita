package com.incode.welcome_sdk.ui.signature_form.base;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseSignatureFormPresenter_Factory implements Factory<BaseSignatureFormPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17481a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17482d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<BaseSignatureFormContract.View> f17483c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f17484e;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17482d + 25;
        f17481a = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public BaseSignatureFormPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<BaseSignatureFormContract.View> provider2) {
        this.f17484e = provider;
        this.f17483c = provider2;
    }

    @Override // javax.inject.Provider
    public final BaseSignatureFormPresenter get() {
        int i2 = 2 % 2;
        int i3 = f17481a + 11;
        f17482d = i3 % 128;
        int i4 = i3 % 2;
        BaseSignatureFormPresenter baseSignatureFormPresenterNewInstance = newInstance(this.f17484e.get(), this.f17483c.get());
        int i5 = f17481a + 99;
        f17482d = i5 % 128;
        if (i5 % 2 != 0) {
            return baseSignatureFormPresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BaseSignatureFormPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<BaseSignatureFormContract.View> provider2) {
        int i2 = 2 % 2;
        BaseSignatureFormPresenter_Factory baseSignatureFormPresenter_Factory = new BaseSignatureFormPresenter_Factory(provider, provider2);
        int i3 = f17481a + 111;
        f17482d = i3 % 128;
        int i4 = i3 % 2;
        return baseSignatureFormPresenter_Factory;
    }

    public static BaseSignatureFormPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, BaseSignatureFormContract.View view) {
        int i2 = 2 % 2;
        BaseSignatureFormPresenter baseSignatureFormPresenter = new BaseSignatureFormPresenter(incodeWelcomeRepository, view);
        int i3 = f17482d + 43;
        f17481a = i3 % 128;
        int i4 = i3 % 2;
        return baseSignatureFormPresenter;
    }
}

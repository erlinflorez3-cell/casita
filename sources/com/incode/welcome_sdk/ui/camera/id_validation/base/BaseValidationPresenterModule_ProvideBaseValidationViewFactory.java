package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseValidationPresenterModule_ProvideBaseValidationViewFactory implements Factory<BaseValidationContract.View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11791d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11792e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BaseValidationPresenterModule f11793c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11791d + 117;
        f11792e = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseValidationPresenterModule_ProvideBaseValidationViewFactory(BaseValidationPresenterModule baseValidationPresenterModule) {
        this.f11793c = baseValidationPresenterModule;
    }

    @Override // javax.inject.Provider
    public final BaseValidationContract.View get() {
        int i2 = 2 % 2;
        int i3 = f11792e + 79;
        f11791d = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationContract.View viewProvideBaseValidationView = provideBaseValidationView(this.f11793c);
        int i5 = f11791d + 5;
        f11792e = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideBaseValidationView;
    }

    public static BaseValidationPresenterModule_ProvideBaseValidationViewFactory create(BaseValidationPresenterModule baseValidationPresenterModule) {
        int i2 = 2 % 2;
        BaseValidationPresenterModule_ProvideBaseValidationViewFactory baseValidationPresenterModule_ProvideBaseValidationViewFactory = new BaseValidationPresenterModule_ProvideBaseValidationViewFactory(baseValidationPresenterModule);
        int i3 = f11791d + 73;
        f11792e = i3 % 128;
        if (i3 % 2 == 0) {
            return baseValidationPresenterModule_ProvideBaseValidationViewFactory;
        }
        throw null;
    }

    public static BaseValidationContract.View provideBaseValidationView(BaseValidationPresenterModule baseValidationPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f11792e + 83;
        f11791d = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationContract.View view = (BaseValidationContract.View) Preconditions.checkNotNullFromProvides(baseValidationPresenterModule.b());
        if (i4 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

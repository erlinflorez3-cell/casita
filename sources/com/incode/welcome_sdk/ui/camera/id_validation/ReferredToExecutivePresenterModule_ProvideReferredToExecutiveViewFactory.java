package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class ReferredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory implements Factory<ReferredToExecutiveContract.View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11654c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11655e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferredToExecutivePresenterModule f11656b;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11655e + 93;
        f11654c = i3 % 128;
        int i4 = i3 % 2;
        ReferredToExecutiveContract.View view = get();
        int i5 = f11655e + 35;
        f11654c = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public ReferredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory(ReferredToExecutivePresenterModule referredToExecutivePresenterModule) {
        this.f11656b = referredToExecutivePresenterModule;
    }

    @Override // javax.inject.Provider
    public final ReferredToExecutiveContract.View get() {
        int i2 = 2 % 2;
        int i3 = f11655e + 95;
        f11654c = i3 % 128;
        int i4 = i3 % 2;
        ReferredToExecutiveContract.View viewProvideReferredToExecutiveView = provideReferredToExecutiveView(this.f11656b);
        int i5 = f11654c + 17;
        f11655e = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideReferredToExecutiveView;
    }

    public static ReferredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory create(ReferredToExecutivePresenterModule referredToExecutivePresenterModule) {
        int i2 = 2 % 2;
        ReferredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory referredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory = new ReferredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory(referredToExecutivePresenterModule);
        int i3 = f11654c + 91;
        f11655e = i3 % 128;
        if (i3 % 2 == 0) {
            return referredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory;
        }
        throw null;
    }

    public static ReferredToExecutiveContract.View provideReferredToExecutiveView(ReferredToExecutivePresenterModule referredToExecutivePresenterModule) {
        int i2 = 2 % 2;
        int i3 = f11655e + 43;
        f11654c = i3 % 128;
        int i4 = i3 % 2;
        ReferredToExecutiveContract.View view = (ReferredToExecutiveContract.View) Preconditions.checkNotNullFromProvides(referredToExecutivePresenterModule.provideReferredToExecutiveView());
        int i5 = f11654c + 43;
        f11655e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}

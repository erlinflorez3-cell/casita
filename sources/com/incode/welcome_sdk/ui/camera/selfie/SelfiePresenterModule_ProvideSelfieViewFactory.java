package com.incode.welcome_sdk.ui.camera.selfie;

import com.incode.welcome_sdk.ui.camera.selfie.SelfieContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfiePresenterModule_ProvideSelfieViewFactory implements Factory<SelfieContract.View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12062d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12063e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SelfiePresenterModule f12064c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12062d + 11;
        f12063e = i3 % 128;
        int i4 = i3 % 2;
        SelfieContract.View view = get();
        int i5 = f12063e + 99;
        f12062d = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public SelfiePresenterModule_ProvideSelfieViewFactory(SelfiePresenterModule selfiePresenterModule) {
        this.f12064c = selfiePresenterModule;
    }

    @Override // javax.inject.Provider
    public final SelfieContract.View get() {
        int i2 = 2 % 2;
        int i3 = f12062d + 97;
        f12063e = i3 % 128;
        int i4 = i3 % 2;
        SelfieContract.View viewProvideSelfieView = provideSelfieView(this.f12064c);
        int i5 = f12062d + 1;
        f12063e = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideSelfieView;
    }

    public static SelfiePresenterModule_ProvideSelfieViewFactory create(SelfiePresenterModule selfiePresenterModule) {
        int i2 = 2 % 2;
        SelfiePresenterModule_ProvideSelfieViewFactory selfiePresenterModule_ProvideSelfieViewFactory = new SelfiePresenterModule_ProvideSelfieViewFactory(selfiePresenterModule);
        int i3 = f12063e + 109;
        f12062d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return selfiePresenterModule_ProvideSelfieViewFactory;
    }

    public static SelfieContract.View provideSelfieView(SelfiePresenterModule selfiePresenterModule) {
        int i2 = 2 % 2;
        int i3 = f12062d + 37;
        f12063e = i3 % 128;
        int i4 = i3 % 2;
        SelfieContract.View view = (SelfieContract.View) Preconditions.checkNotNullFromProvides(selfiePresenterModule.provideSelfieView());
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        int i6 = f12063e + 33;
        f12062d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return view;
    }
}

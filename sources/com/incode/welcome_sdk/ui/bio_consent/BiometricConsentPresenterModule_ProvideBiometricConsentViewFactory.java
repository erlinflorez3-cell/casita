package com.incode.welcome_sdk.ui.bio_consent;

import com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentPresenterModule_ProvideBiometricConsentViewFactory implements Factory<BiometricConsentContract.View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11158d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11159e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiometricConsentPresenterModule f11160b;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11159e + 65;
        f11158d = i3 % 128;
        int i4 = i3 % 2;
        BiometricConsentContract.View view = get();
        int i5 = f11158d + 35;
        f11159e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public BiometricConsentPresenterModule_ProvideBiometricConsentViewFactory(BiometricConsentPresenterModule biometricConsentPresenterModule) {
        this.f11160b = biometricConsentPresenterModule;
    }

    @Override // javax.inject.Provider
    public final BiometricConsentContract.View get() {
        int i2 = 2 % 2;
        int i3 = f11158d + 89;
        f11159e = i3 % 128;
        int i4 = i3 % 2;
        BiometricConsentContract.View viewProvideBiometricConsentView = provideBiometricConsentView(this.f11160b);
        int i5 = f11159e + 49;
        f11158d = i5 % 128;
        if (i5 % 2 != 0) {
            return viewProvideBiometricConsentView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BiometricConsentPresenterModule_ProvideBiometricConsentViewFactory create(BiometricConsentPresenterModule biometricConsentPresenterModule) {
        int i2 = 2 % 2;
        BiometricConsentPresenterModule_ProvideBiometricConsentViewFactory biometricConsentPresenterModule_ProvideBiometricConsentViewFactory = new BiometricConsentPresenterModule_ProvideBiometricConsentViewFactory(biometricConsentPresenterModule);
        int i3 = f11159e + 21;
        f11158d = i3 % 128;
        int i4 = i3 % 2;
        return biometricConsentPresenterModule_ProvideBiometricConsentViewFactory;
    }

    public static BiometricConsentContract.View provideBiometricConsentView(BiometricConsentPresenterModule biometricConsentPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f11159e + 23;
        f11158d = i3 % 128;
        int i4 = i3 % 2;
        BiometricConsentContract.View view = (BiometricConsentContract.View) Preconditions.checkNotNullFromProvides(biometricConsentPresenterModule.provideBiometricConsentView());
        int i5 = f11159e + 95;
        f11158d = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}

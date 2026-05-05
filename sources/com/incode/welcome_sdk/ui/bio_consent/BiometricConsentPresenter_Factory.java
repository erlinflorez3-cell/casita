package com.incode.welcome_sdk.ui.bio_consent;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentPresenter_Factory implements Factory<BiometricConsentPresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11161c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11162d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<BiometricConsentContract.View> f11163a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f11164e;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11161c + 19;
        f11162d = i3 % 128;
        int i4 = i3 % 2;
        BiometricConsentPresenter biometricConsentPresenter = get();
        int i5 = f11162d + 55;
        f11161c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return biometricConsentPresenter;
    }

    public BiometricConsentPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<BiometricConsentContract.View> provider2) {
        this.f11164e = provider;
        this.f11163a = provider2;
    }

    @Override // javax.inject.Provider
    public final BiometricConsentPresenter get() {
        int i2 = 2 % 2;
        int i3 = f11161c + 111;
        f11162d = i3 % 128;
        int i4 = i3 % 2;
        BiometricConsentPresenter biometricConsentPresenterNewInstance = newInstance(this.f11164e.get(), this.f11163a.get());
        int i5 = f11162d + 31;
        f11161c = i5 % 128;
        int i6 = i5 % 2;
        return biometricConsentPresenterNewInstance;
    }

    public static BiometricConsentPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<BiometricConsentContract.View> provider2) {
        int i2 = 2 % 2;
        BiometricConsentPresenter_Factory biometricConsentPresenter_Factory = new BiometricConsentPresenter_Factory(provider, provider2);
        int i3 = f11161c + 75;
        f11162d = i3 % 128;
        if (i3 % 2 != 0) {
            return biometricConsentPresenter_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BiometricConsentPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, BiometricConsentContract.View view) {
        int i2 = 2 % 2;
        BiometricConsentPresenter biometricConsentPresenter = new BiometricConsentPresenter(incodeWelcomeRepository, view);
        int i3 = f11161c + 57;
        f11162d = i3 % 128;
        int i4 = i3 % 2;
        return biometricConsentPresenter;
    }
}

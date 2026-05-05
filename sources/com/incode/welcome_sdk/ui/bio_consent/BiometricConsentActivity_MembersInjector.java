package com.incode.welcome_sdk.ui.bio_consent;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentActivity_MembersInjector implements MembersInjector<BiometricConsentActivity> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11140c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11141e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<BiometricConsentPresenter> f11142b;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(BiometricConsentActivity biometricConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f11140c + 103;
        f11141e = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        injectMembers2(biometricConsentActivity);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f11140c + 79;
        f11141e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public BiometricConsentActivity_MembersInjector(Provider<BiometricConsentPresenter> provider) {
        this.f11142b = provider;
    }

    public static MembersInjector<BiometricConsentActivity> create(Provider<BiometricConsentPresenter> provider) {
        int i2 = 2 % 2;
        BiometricConsentActivity_MembersInjector biometricConsentActivity_MembersInjector = new BiometricConsentActivity_MembersInjector(provider);
        int i3 = f11141e + 43;
        f11140c = i3 % 128;
        if (i3 % 2 == 0) {
            return biometricConsentActivity_MembersInjector;
        }
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(BiometricConsentActivity biometricConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f11140c + 123;
        f11141e = i3 % 128;
        if (i3 % 2 == 0) {
            injectPresenter(biometricConsentActivity, this.f11142b.get());
            int i4 = 75 / 0;
        } else {
            injectPresenter(biometricConsentActivity, this.f11142b.get());
        }
        int i5 = f11140c + 91;
        f11141e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void injectPresenter(BiometricConsentActivity biometricConsentActivity, BiometricConsentPresenter biometricConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f11141e + 35;
        f11140c = i3 % 128;
        int i4 = i3 % 2;
        biometricConsentActivity.f11132d = biometricConsentPresenter;
        int i5 = f11140c + 57;
        f11141e = i5 % 128;
        int i6 = i5 % 2;
    }
}

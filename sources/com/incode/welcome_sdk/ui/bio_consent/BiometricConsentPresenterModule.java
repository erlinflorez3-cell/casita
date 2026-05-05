package com.incode.welcome_sdk.ui.bio_consent;

import com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class BiometricConsentPresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11155a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11156e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BiometricConsentContract.View f11157d;

    public BiometricConsentPresenterModule(BiometricConsentContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f11157d = view;
    }

    public final BiometricConsentContract.View getView() {
        int i2 = 2 % 2;
        int i3 = f11156e + 117;
        f11155a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11157d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    public final BiometricConsentContract.View provideBiometricConsentView() {
        int i2 = 2 % 2;
        int i3 = f11156e + 81;
        int i4 = i3 % 128;
        f11155a = i4;
        int i5 = i3 % 2;
        BiometricConsentContract.View view = this.f11157d;
        int i6 = i4 + 45;
        f11156e = i6 % 128;
        if (i6 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

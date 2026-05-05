package com.incode.welcome_sdk.ui.ml_consent;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class MachineLearningConsentPresenter_Factory implements Factory<MachineLearningConsentPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16438a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16439b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<MachineLearningConsentContract.View> f16440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f16441d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f16439b + 1;
        f16438a = i3 % 128;
        if (i3 % 2 == 0) {
            get();
            throw null;
        }
        MachineLearningConsentPresenter machineLearningConsentPresenter = get();
        int i4 = f16438a + 93;
        f16439b = i4 % 128;
        if (i4 % 2 == 0) {
            return machineLearningConsentPresenter;
        }
        throw null;
    }

    public MachineLearningConsentPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<MachineLearningConsentContract.View> provider2) {
        this.f16441d = provider;
        this.f16440c = provider2;
    }

    @Override // javax.inject.Provider
    public final MachineLearningConsentPresenter get() {
        int i2 = 2 % 2;
        int i3 = f16438a + 91;
        f16439b = i3 % 128;
        int i4 = i3 % 2;
        MachineLearningConsentPresenter machineLearningConsentPresenterNewInstance = newInstance(this.f16441d.get(), this.f16440c.get());
        int i5 = f16439b + 93;
        f16438a = i5 % 128;
        int i6 = i5 % 2;
        return machineLearningConsentPresenterNewInstance;
    }

    public static MachineLearningConsentPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<MachineLearningConsentContract.View> provider2) {
        int i2 = 2 % 2;
        MachineLearningConsentPresenter_Factory machineLearningConsentPresenter_Factory = new MachineLearningConsentPresenter_Factory(provider, provider2);
        int i3 = f16439b + 101;
        f16438a = i3 % 128;
        int i4 = i3 % 2;
        return machineLearningConsentPresenter_Factory;
    }

    public static MachineLearningConsentPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, MachineLearningConsentContract.View view) {
        int i2 = 2 % 2;
        MachineLearningConsentPresenter machineLearningConsentPresenter = new MachineLearningConsentPresenter(incodeWelcomeRepository, view);
        int i3 = f16439b + 89;
        f16438a = i3 % 128;
        int i4 = i3 % 2;
        return machineLearningConsentPresenter;
    }
}

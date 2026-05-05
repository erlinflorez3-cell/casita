package com.incode.welcome_sdk.ui.government_validation;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class GovernmentValidationPresenter_Factory implements Factory<GovernmentValidationPresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14488c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14489d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<GovernmentValidationContract.View> f14490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f14491b;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f14488c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14489d = i3 % 128;
        int i4 = i3 % 2;
        GovernmentValidationPresenter governmentValidationPresenter = get();
        int i5 = f14489d + 45;
        f14488c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return governmentValidationPresenter;
    }

    public GovernmentValidationPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<GovernmentValidationContract.View> provider2) {
        this.f14491b = provider;
        this.f14490a = provider2;
    }

    @Override // javax.inject.Provider
    public final GovernmentValidationPresenter get() {
        int i2 = 2 % 2;
        int i3 = f14488c + 117;
        f14489d = i3 % 128;
        int i4 = i3 % 2;
        GovernmentValidationPresenter governmentValidationPresenterNewInstance = newInstance(this.f14491b.get(), this.f14490a.get());
        int i5 = f14488c + 59;
        f14489d = i5 % 128;
        if (i5 % 2 == 0) {
            return governmentValidationPresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GovernmentValidationPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<GovernmentValidationContract.View> provider2) {
        int i2 = 2 % 2;
        GovernmentValidationPresenter_Factory governmentValidationPresenter_Factory = new GovernmentValidationPresenter_Factory(provider, provider2);
        int i3 = f14489d + 113;
        f14488c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
        return governmentValidationPresenter_Factory;
    }

    public static GovernmentValidationPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, GovernmentValidationContract.View view) {
        int i2 = 2 % 2;
        GovernmentValidationPresenter governmentValidationPresenter = new GovernmentValidationPresenter(incodeWelcomeRepository, view);
        int i3 = f14488c + 89;
        f14489d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return governmentValidationPresenter;
    }
}

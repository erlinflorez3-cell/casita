package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ReferredToExecutivePresenter_Factory implements Factory<ReferredToExecutivePresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11657c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11658e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<ReferredToExecutiveContract.View> f11659b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f11660d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        ReferredToExecutivePresenter referredToExecutivePresenter;
        int i2 = 2 % 2;
        int i3 = f11658e + 73;
        f11657c = i3 % 128;
        if (i3 % 2 != 0) {
            referredToExecutivePresenter = get();
            int i4 = 15 / 0;
        } else {
            referredToExecutivePresenter = get();
        }
        int i5 = f11658e + 33;
        f11657c = i5 % 128;
        int i6 = i5 % 2;
        return referredToExecutivePresenter;
    }

    public ReferredToExecutivePresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<ReferredToExecutiveContract.View> provider2) {
        this.f11660d = provider;
        this.f11659b = provider2;
    }

    @Override // javax.inject.Provider
    public final ReferredToExecutivePresenter get() {
        int i2 = 2 % 2;
        int i3 = f11657c + 121;
        f11658e = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f11660d.get();
        if (i4 != 0) {
            return newInstance(incodeWelcomeRepository, this.f11659b.get());
        }
        int i5 = 76 / 0;
        return newInstance(incodeWelcomeRepository, this.f11659b.get());
    }

    public static ReferredToExecutivePresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<ReferredToExecutiveContract.View> provider2) {
        int i2 = 2 % 2;
        ReferredToExecutivePresenter_Factory referredToExecutivePresenter_Factory = new ReferredToExecutivePresenter_Factory(provider, provider2);
        int i3 = f11658e + 81;
        f11657c = i3 % 128;
        int i4 = i3 % 2;
        return referredToExecutivePresenter_Factory;
    }

    public static ReferredToExecutivePresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, ReferredToExecutiveContract.View view) {
        int i2 = 2 % 2;
        ReferredToExecutivePresenter referredToExecutivePresenter = new ReferredToExecutivePresenter(incodeWelcomeRepository, view);
        int i3 = f11658e + 15;
        f11657c = i3 % 128;
        if (i3 % 2 == 0) {
            return referredToExecutivePresenter;
        }
        throw null;
    }
}

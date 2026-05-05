package com.incode.welcome_sdk.ui.user_consent;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.user_consent.UserConsentContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class UserConsentPresenter_Factory implements Factory<UserConsentPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18044a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18045b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<UserConsentContract.View> f18046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f18047e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f18044a + 31;
        f18045b = i3 % 128;
        int i4 = i3 % 2;
        UserConsentPresenter userConsentPresenter = get();
        int i5 = f18044a + 109;
        f18045b = i5 % 128;
        if (i5 % 2 != 0) {
            return userConsentPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UserConsentPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<UserConsentContract.View> provider2) {
        this.f18047e = provider;
        this.f18046d = provider2;
    }

    @Override // javax.inject.Provider
    public final UserConsentPresenter get() {
        int i2 = 2 % 2;
        int i3 = f18044a + 3;
        f18045b = i3 % 128;
        int i4 = i3 % 2;
        UserConsentPresenter userConsentPresenterNewInstance = newInstance(this.f18047e.get(), this.f18046d.get());
        int i5 = f18045b + 29;
        f18044a = i5 % 128;
        int i6 = i5 % 2;
        return userConsentPresenterNewInstance;
    }

    public static UserConsentPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<UserConsentContract.View> provider2) {
        int i2 = 2 % 2;
        UserConsentPresenter_Factory userConsentPresenter_Factory = new UserConsentPresenter_Factory(provider, provider2);
        int i3 = f18045b + 71;
        f18044a = i3 % 128;
        int i4 = i3 % 2;
        return userConsentPresenter_Factory;
    }

    public static UserConsentPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, UserConsentContract.View view) {
        int i2 = 2 % 2;
        UserConsentPresenter userConsentPresenter = new UserConsentPresenter(incodeWelcomeRepository, view);
        int i3 = f18045b + 53;
        f18044a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return userConsentPresenter;
    }
}

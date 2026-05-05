package com.incode.welcome_sdk.ui.user_consent;

import com.incode.welcome_sdk.ui.user_consent.UserConsentContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class UserConsentPresenterModule_ProvideUserConsentViewFactory implements Factory<UserConsentContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18041a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18042c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UserConsentPresenterModule f18043d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f18041a + 37;
        f18042c = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public UserConsentPresenterModule_ProvideUserConsentViewFactory(UserConsentPresenterModule userConsentPresenterModule) {
        this.f18043d = userConsentPresenterModule;
    }

    @Override // javax.inject.Provider
    public final UserConsentContract.View get() {
        int i2 = 2 % 2;
        int i3 = f18041a + 109;
        f18042c = i3 % 128;
        int i4 = i3 % 2;
        UserConsentContract.View viewProvideUserConsentView = provideUserConsentView(this.f18043d);
        int i5 = f18042c + 57;
        f18041a = i5 % 128;
        if (i5 % 2 != 0) {
            return viewProvideUserConsentView;
        }
        throw null;
    }

    public static UserConsentPresenterModule_ProvideUserConsentViewFactory create(UserConsentPresenterModule userConsentPresenterModule) {
        int i2 = 2 % 2;
        UserConsentPresenterModule_ProvideUserConsentViewFactory userConsentPresenterModule_ProvideUserConsentViewFactory = new UserConsentPresenterModule_ProvideUserConsentViewFactory(userConsentPresenterModule);
        int i3 = f18042c + 105;
        f18041a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return userConsentPresenterModule_ProvideUserConsentViewFactory;
    }

    public static UserConsentContract.View provideUserConsentView(UserConsentPresenterModule userConsentPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f18041a + 125;
        f18042c = i3 % 128;
        int i4 = i3 % 2;
        UserConsentContract.View view = (UserConsentContract.View) Preconditions.checkNotNullFromProvides(userConsentPresenterModule.c());
        int i5 = f18041a + 7;
        f18042c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return view;
    }
}

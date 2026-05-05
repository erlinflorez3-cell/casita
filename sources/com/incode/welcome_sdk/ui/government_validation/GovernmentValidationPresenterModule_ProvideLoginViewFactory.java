package com.incode.welcome_sdk.ui.government_validation;

import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class GovernmentValidationPresenterModule_ProvideLoginViewFactory implements Factory<GovernmentValidationContract.View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14485d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14486e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GovernmentValidationPresenterModule f14487a;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f14486e + 13;
        f14485d = i3 % 128;
        int i4 = i3 % 2;
        GovernmentValidationContract.View view = get();
        int i5 = f14486e + 11;
        f14485d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return view;
    }

    public GovernmentValidationPresenterModule_ProvideLoginViewFactory(GovernmentValidationPresenterModule governmentValidationPresenterModule) {
        this.f14487a = governmentValidationPresenterModule;
    }

    @Override // javax.inject.Provider
    public final GovernmentValidationContract.View get() {
        int i2 = 2 % 2;
        int i3 = f14486e + 95;
        f14485d = i3 % 128;
        int i4 = i3 % 2;
        GovernmentValidationPresenterModule governmentValidationPresenterModule = this.f14487a;
        if (i4 != 0) {
            return provideLoginView(governmentValidationPresenterModule);
        }
        provideLoginView(governmentValidationPresenterModule);
        throw null;
    }

    public static GovernmentValidationPresenterModule_ProvideLoginViewFactory create(GovernmentValidationPresenterModule governmentValidationPresenterModule) {
        int i2 = 2 % 2;
        GovernmentValidationPresenterModule_ProvideLoginViewFactory governmentValidationPresenterModule_ProvideLoginViewFactory = new GovernmentValidationPresenterModule_ProvideLoginViewFactory(governmentValidationPresenterModule);
        int i3 = f14486e + 91;
        f14485d = i3 % 128;
        if (i3 % 2 != 0) {
            return governmentValidationPresenterModule_ProvideLoginViewFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GovernmentValidationContract.View provideLoginView(GovernmentValidationPresenterModule governmentValidationPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f14485d + 55;
        f14486e = i3 % 128;
        int i4 = i3 % 2;
        GovernmentValidationContract.View view = (GovernmentValidationContract.View) Preconditions.checkNotNullFromProvides(governmentValidationPresenterModule.provideLoginView());
        int i5 = f14486e + 111;
        f14485d = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}

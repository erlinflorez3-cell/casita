package com.incode.welcome_sdk.ui.user_consent;

import com.incode.welcome_sdk.ui.user_consent.UserConsentContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class UserConsentPresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18038a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18039d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UserConsentContract.View f18040b;

    public UserConsentPresenterModule(UserConsentContract.View view) {
        this.f18040b = view;
    }

    @Provides
    UserConsentContract.View c() {
        int i2 = 2 % 2;
        int i3 = f18039d + 71;
        int i4 = i3 % 128;
        f18038a = i4;
        int i5 = i3 % 2;
        UserConsentContract.View view = this.f18040b;
        int i6 = i4 + 7;
        f18039d = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }
}

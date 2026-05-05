package com.incode.welcome_sdk.ui.user_consent;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class UserConsentActivity_MembersInjector implements MembersInjector<UserConsentActivity> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18021c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18022d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<UserConsentPresenter> f18023b;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(UserConsentActivity userConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f18022d + 83;
        f18021c = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(userConsentActivity);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f18022d + 57;
        f18021c = i5 % 128;
        int i6 = i5 % 2;
    }

    public UserConsentActivity_MembersInjector(Provider<UserConsentPresenter> provider) {
        this.f18023b = provider;
    }

    public static MembersInjector<UserConsentActivity> create(Provider<UserConsentPresenter> provider) {
        int i2 = 2 % 2;
        UserConsentActivity_MembersInjector userConsentActivity_MembersInjector = new UserConsentActivity_MembersInjector(provider);
        int i3 = f18021c + 123;
        f18022d = i3 % 128;
        if (i3 % 2 != 0) {
            return userConsentActivity_MembersInjector;
        }
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(UserConsentActivity userConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f18022d + 87;
        f18021c = i3 % 128;
        if (i3 % 2 == 0) {
            injectPresenter(userConsentActivity, this.f18023b.get());
            int i4 = f18021c + 13;
            f18022d = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        injectPresenter(userConsentActivity, this.f18023b.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void injectPresenter(UserConsentActivity userConsentActivity, UserConsentPresenter userConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f18022d + 7;
        f18021c = i3 % 128;
        int i4 = i3 % 2;
        userConsentActivity.f18011b = userConsentPresenter;
        int i5 = f18021c + 63;
        f18022d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

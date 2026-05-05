package com.incode.welcome_sdk.ui.custom_watchlist;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomWatchlistActivity_MembersInjector implements MembersInjector<CustomWatchlistActivity> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13177c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13178e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<CustomWatchlistPresenter> f13179a;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(CustomWatchlistActivity customWatchlistActivity) {
        int i2 = 2 % 2;
        int i3 = f13177c + 85;
        f13178e = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(customWatchlistActivity);
        int i5 = f13178e + 73;
        f13177c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
    }

    public CustomWatchlistActivity_MembersInjector(Provider<CustomWatchlistPresenter> provider) {
        this.f13179a = provider;
    }

    public static MembersInjector<CustomWatchlistActivity> create(Provider<CustomWatchlistPresenter> provider) {
        int i2 = 2 % 2;
        CustomWatchlistActivity_MembersInjector customWatchlistActivity_MembersInjector = new CustomWatchlistActivity_MembersInjector(provider);
        int i3 = f13178e + 29;
        f13177c = i3 % 128;
        if (i3 % 2 == 0) {
            return customWatchlistActivity_MembersInjector;
        }
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(CustomWatchlistActivity customWatchlistActivity) {
        int i2 = 2 % 2;
        int i3 = f13178e + 97;
        f13177c = i3 % 128;
        int i4 = i3 % 2;
        injectPresenter(customWatchlistActivity, this.f13179a.get());
        int i5 = f13177c + 7;
        f13178e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void injectPresenter(CustomWatchlistActivity customWatchlistActivity, CustomWatchlistPresenter customWatchlistPresenter) {
        int i2 = 2 % 2;
        int i3 = f13177c + 109;
        f13178e = i3 % 128;
        if (i3 % 2 != 0) {
            customWatchlistActivity.f13168d = customWatchlistPresenter;
        } else {
            customWatchlistActivity.f13168d = customWatchlistPresenter;
            throw null;
        }
    }
}

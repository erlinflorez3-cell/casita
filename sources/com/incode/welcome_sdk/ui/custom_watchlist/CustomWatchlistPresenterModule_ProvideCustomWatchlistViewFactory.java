package com.incode.welcome_sdk.ui.custom_watchlist;

import com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomWatchlistPresenterModule_ProvideCustomWatchlistViewFactory implements Factory<CustomWatchlistContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13194a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13195e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CustomWatchlistPresenterModule f13196c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f13194a + 13;
        f13195e = i3 % 128;
        int i4 = i3 % 2;
        CustomWatchlistContract.View view = get();
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        return view;
    }

    public CustomWatchlistPresenterModule_ProvideCustomWatchlistViewFactory(CustomWatchlistPresenterModule customWatchlistPresenterModule) {
        this.f13196c = customWatchlistPresenterModule;
    }

    @Override // javax.inject.Provider
    public final CustomWatchlistContract.View get() {
        int i2 = 2 % 2;
        int i3 = f13194a + 29;
        f13195e = i3 % 128;
        int i4 = i3 % 2;
        CustomWatchlistContract.View viewProvideCustomWatchlistView = provideCustomWatchlistView(this.f13196c);
        int i5 = f13194a + 65;
        f13195e = i5 % 128;
        if (i5 % 2 == 0) {
            return viewProvideCustomWatchlistView;
        }
        throw null;
    }

    public static CustomWatchlistPresenterModule_ProvideCustomWatchlistViewFactory create(CustomWatchlistPresenterModule customWatchlistPresenterModule) {
        int i2 = 2 % 2;
        CustomWatchlistPresenterModule_ProvideCustomWatchlistViewFactory customWatchlistPresenterModule_ProvideCustomWatchlistViewFactory = new CustomWatchlistPresenterModule_ProvideCustomWatchlistViewFactory(customWatchlistPresenterModule);
        int i3 = f13194a + 17;
        f13195e = i3 % 128;
        int i4 = i3 % 2;
        return customWatchlistPresenterModule_ProvideCustomWatchlistViewFactory;
    }

    public static CustomWatchlistContract.View provideCustomWatchlistView(CustomWatchlistPresenterModule customWatchlistPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f13194a + 21;
        f13195e = i3 % 128;
        int i4 = i3 % 2;
        CustomWatchlistContract.View view = (CustomWatchlistContract.View) Preconditions.checkNotNullFromProvides(customWatchlistPresenterModule.provideCustomWatchlistView());
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f13194a + 21;
        f13195e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}

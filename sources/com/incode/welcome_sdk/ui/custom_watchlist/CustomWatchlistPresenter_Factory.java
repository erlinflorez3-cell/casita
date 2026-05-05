package com.incode.welcome_sdk.ui.custom_watchlist;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomWatchlistPresenter_Factory implements Factory<CustomWatchlistPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13197a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13198c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<CustomWatchlistContract.View> f13199b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f13200e;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f13197a + 81;
        f13198c = i3 % 128;
        int i4 = i3 % 2;
        CustomWatchlistPresenter customWatchlistPresenter = get();
        int i5 = f13198c + 69;
        f13197a = i5 % 128;
        int i6 = i5 % 2;
        return customWatchlistPresenter;
    }

    public CustomWatchlistPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<CustomWatchlistContract.View> provider2) {
        this.f13200e = provider;
        this.f13199b = provider2;
    }

    @Override // javax.inject.Provider
    public final CustomWatchlistPresenter get() {
        int i2 = 2 % 2;
        int i3 = f13197a + 81;
        f13198c = i3 % 128;
        int i4 = i3 % 2;
        CustomWatchlistPresenter customWatchlistPresenterNewInstance = newInstance(this.f13200e.get(), this.f13199b.get());
        int i5 = f13198c + 3;
        f13197a = i5 % 128;
        if (i5 % 2 == 0) {
            return customWatchlistPresenterNewInstance;
        }
        throw null;
    }

    public static CustomWatchlistPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<CustomWatchlistContract.View> provider2) {
        int i2 = 2 % 2;
        CustomWatchlistPresenter_Factory customWatchlistPresenter_Factory = new CustomWatchlistPresenter_Factory(provider, provider2);
        int i3 = f13197a + 93;
        f13198c = i3 % 128;
        if (i3 % 2 != 0) {
            return customWatchlistPresenter_Factory;
        }
        throw null;
    }

    public static CustomWatchlistPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, CustomWatchlistContract.View view) {
        int i2 = 2 % 2;
        CustomWatchlistPresenter customWatchlistPresenter = new CustomWatchlistPresenter(incodeWelcomeRepository, view);
        int i3 = f13197a + 47;
        f13198c = i3 % 128;
        int i4 = i3 % 2;
        return customWatchlistPresenter;
    }
}

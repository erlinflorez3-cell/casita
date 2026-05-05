package com.incode.welcome_sdk.ui.custom_watchlist;

import com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class CustomWatchlistPresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13191b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13192e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CustomWatchlistContract.View f13193d;

    public CustomWatchlistPresenterModule(CustomWatchlistContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f13193d = view;
    }

    public final CustomWatchlistContract.View getView() {
        int i2 = 2 % 2;
        int i3 = f13192e + 105;
        f13191b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13193d;
        }
        throw null;
    }

    @Provides
    public final CustomWatchlistContract.View provideCustomWatchlistView() {
        int i2 = 2 % 2;
        int i3 = f13192e + 43;
        f13191b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13193d;
        }
        throw null;
    }
}

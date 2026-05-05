package com.incode.welcome_sdk.ui.geolocation;

import com.incode.welcome_sdk.ui.geolocation.GeolocationContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class GeolocationPresenterModule {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14313c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14314e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GeolocationContract.View f14315b;

    public GeolocationPresenterModule(GeolocationContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f14315b = view;
    }

    public final GeolocationContract.View getMView() {
        int i2 = 2 % 2;
        int i3 = f14314e + 121;
        f14313c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14315b;
        }
        throw null;
    }

    @Provides
    public final GeolocationContract.View provideGeolocationView() {
        int i2 = 2 % 2;
        int i3 = f14314e + 45;
        int i4 = i3 % 128;
        f14313c = i4;
        int i5 = i3 % 2;
        GeolocationContract.View view = this.f14315b;
        int i6 = i4 + 57;
        f14314e = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }
}

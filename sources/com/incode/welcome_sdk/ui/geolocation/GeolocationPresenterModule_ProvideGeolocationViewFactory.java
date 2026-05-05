package com.incode.welcome_sdk.ui.geolocation;

import com.incode.welcome_sdk.ui.geolocation.GeolocationContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationPresenterModule_ProvideGeolocationViewFactory implements Factory<GeolocationContract.View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14316c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14317d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GeolocationPresenterModule f14318b;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f14317d + 3;
        f14316c = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GeolocationPresenterModule_ProvideGeolocationViewFactory(GeolocationPresenterModule geolocationPresenterModule) {
        this.f14318b = geolocationPresenterModule;
    }

    @Override // javax.inject.Provider
    public final GeolocationContract.View get() {
        int i2 = 2 % 2;
        int i3 = f14316c + 61;
        f14317d = i3 % 128;
        int i4 = i3 % 2;
        GeolocationContract.View viewProvideGeolocationView = provideGeolocationView(this.f14318b);
        int i5 = f14317d + 71;
        f14316c = i5 % 128;
        if (i5 % 2 == 0) {
            return viewProvideGeolocationView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GeolocationPresenterModule_ProvideGeolocationViewFactory create(GeolocationPresenterModule geolocationPresenterModule) {
        int i2 = 2 % 2;
        GeolocationPresenterModule_ProvideGeolocationViewFactory geolocationPresenterModule_ProvideGeolocationViewFactory = new GeolocationPresenterModule_ProvideGeolocationViewFactory(geolocationPresenterModule);
        int i3 = f14316c + 63;
        f14317d = i3 % 128;
        int i4 = i3 % 2;
        return geolocationPresenterModule_ProvideGeolocationViewFactory;
    }

    public static GeolocationContract.View provideGeolocationView(GeolocationPresenterModule geolocationPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f14317d + 47;
        f14316c = i3 % 128;
        int i4 = i3 % 2;
        GeolocationContract.View view = (GeolocationContract.View) Preconditions.checkNotNullFromProvides(geolocationPresenterModule.provideGeolocationView());
        int i5 = f14316c + 107;
        f14317d = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}

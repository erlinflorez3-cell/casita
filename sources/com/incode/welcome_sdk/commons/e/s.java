package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.ui.geolocation.GeolocationManager;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements Factory<GeolocationManager> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4970b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4971e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f4972a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Application> f4973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<LocationFetcher> f4974d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4971e + 91;
        f4970b = i3 % 128;
        if (i3 % 2 == 0) {
            d();
            throw null;
        }
        GeolocationManager geolocationManagerD = d();
        int i4 = f4971e + 23;
        f4970b = i4 % 128;
        int i5 = i4 % 2;
        return geolocationManagerD;
    }

    private s(l lVar, Provider<Application> provider, Provider<LocationFetcher> provider2) {
        this.f4972a = lVar;
        this.f4973c = provider;
        this.f4974d = provider2;
    }

    private GeolocationManager d() {
        int i2 = 2 % 2;
        int i3 = f4971e + 121;
        f4970b = i3 % 128;
        int i4 = i3 % 2;
        GeolocationManager geolocationManagerE = e(this.f4972a, this.f4973c.get(), this.f4974d.get());
        int i5 = f4971e + 7;
        f4970b = i5 % 128;
        int i6 = i5 % 2;
        return geolocationManagerE;
    }

    public static s c(l lVar, Provider<Application> provider, Provider<LocationFetcher> provider2) {
        int i2 = 2 % 2;
        s sVar = new s(lVar, provider, provider2);
        int i3 = f4971e + 125;
        f4970b = i3 % 128;
        int i4 = i3 % 2;
        return sVar;
    }

    private static GeolocationManager e(l lVar, Application application, LocationFetcher locationFetcher) {
        int i2 = 2 % 2;
        int i3 = f4970b + 47;
        f4971e = i3 % 128;
        int i4 = i3 % 2;
        GeolocationManager geolocationManager = (GeolocationManager) Preconditions.checkNotNullFromProvides(lVar.c(application, locationFetcher));
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
        return geolocationManager;
    }
}

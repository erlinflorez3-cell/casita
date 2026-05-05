package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements Factory<LocationFetcher> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4975a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4976c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f4977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Application> f4978e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        LocationFetcher locationFetcherC;
        int i2 = 2 % 2;
        int i3 = f4975a + 101;
        f4976c = i3 % 128;
        if (i3 % 2 == 0) {
            locationFetcherC = c();
            int i4 = 61 / 0;
        } else {
            locationFetcherC = c();
        }
        int i5 = f4976c + 35;
        f4975a = i5 % 128;
        int i6 = i5 % 2;
        return locationFetcherC;
    }

    private t(l lVar, Provider<Application> provider) {
        this.f4977d = lVar;
        this.f4978e = provider;
    }

    private LocationFetcher c() {
        int i2 = 2 % 2;
        int i3 = f4976c + 5;
        f4975a = i3 % 128;
        int i4 = i3 % 2;
        LocationFetcher locationFetcherE = e(this.f4977d, this.f4978e.get());
        int i5 = f4976c + 29;
        f4975a = i5 % 128;
        int i6 = i5 % 2;
        return locationFetcherE;
    }

    public static t c(l lVar, Provider<Application> provider) {
        int i2 = 2 % 2;
        t tVar = new t(lVar, provider);
        int i3 = f4975a + 117;
        f4976c = i3 % 128;
        int i4 = i3 % 2;
        return tVar;
    }

    private static LocationFetcher e(l lVar, Application application) {
        int i2 = 2 % 2;
        int i3 = f4975a + 11;
        f4976c = i3 % 128;
        if (i3 % 2 != 0) {
            return lVar.d(application);
        }
        lVar.d(application);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

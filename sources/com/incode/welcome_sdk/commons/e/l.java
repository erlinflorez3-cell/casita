package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.ui.geolocation.GeolocationManager;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import com.incode.welcome_sdk.ui.geolocation.impl.GoogleLocationFetcherImpl;
import com.incode.welcome_sdk.ui.geolocation.impl.HuaweiLocationFetcherImpl;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4935a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4936e = 0;

    @Provides
    final GeolocationManager c(Application application, LocationFetcher locationFetcher) {
        int i2 = 2 % 2;
        GeolocationManager geolocationManager = new GeolocationManager(application, locationFetcher);
        int i3 = f4935a + 75;
        f4936e = i3 % 128;
        int i4 = i3 % 2;
        return geolocationManager;
    }

    @Provides
    final LocationFetcher d(Application application) {
        int i2 = 2 % 2;
        int i3 = f4935a + 117;
        f4936e = i3 % 128;
        if (i3 % 2 == 0) {
            if (com.incode.welcome_sdk.commons.utils.q.d(application)) {
                return new GoogleLocationFetcherImpl(application);
            }
            if (com.incode.welcome_sdk.commons.utils.s.c(application)) {
                return new HuaweiLocationFetcherImpl(application);
            }
            int i4 = f4936e + 99;
            f4935a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return null;
        }
        com.incode.welcome_sdk.commons.utils.q.d(application);
        throw null;
    }
}

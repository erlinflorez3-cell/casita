package com.incode.welcome_sdk.ui.geolocation;

import android.os.Process;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationActivity_MembersInjector implements MembersInjector<GeolocationActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f14259a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f14260c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14261d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14262e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<GeolocationPresenter> f14263b;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(GeolocationActivity geolocationActivity) {
        int i2 = 2 % 2;
        int i3 = f14261d + 71;
        f14262e = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(geolocationActivity);
        int i5 = f14262e + 111;
        f14261d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GeolocationActivity_MembersInjector(Provider<GeolocationPresenter> provider) {
        this.f14263b = provider;
    }

    public static MembersInjector<GeolocationActivity> create(Provider<GeolocationPresenter> provider) {
        int i2 = 2 % 2;
        GeolocationActivity_MembersInjector geolocationActivity_MembersInjector = new GeolocationActivity_MembersInjector(provider);
        int i3 = f14261d + 65;
        f14262e = i3 % 128;
        int i4 = i3 % 2;
        return geolocationActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(GeolocationActivity geolocationActivity) {
        int i2 = 2 % 2;
        int i3 = f14261d + 7;
        f14262e = i3 % 128;
        if (i3 % 2 == 0) {
            injectMPresenter(geolocationActivity, this.f14263b.get());
            int i4 = 11 / 0;
        } else {
            injectMPresenter(geolocationActivity, this.f14263b.get());
        }
    }

    public static void injectMPresenter(GeolocationActivity geolocationActivity, GeolocationPresenter geolocationPresenter) {
        int i2 = 2 % 2;
        int i3 = f14261d + 19;
        f14262e = i3 % 128;
        if (i3 % 2 == 0) {
            geolocationActivity.f14249e = geolocationPresenter;
            int i4 = 27 / 0;
        } else {
            geolocationActivity.f14249e = geolocationPresenter;
        }
    }

    public static int a() {
        int i2 = f14259a;
        int i3 = i2 % 6625730;
        f14259a = i2 + 1;
        if (i3 != 0) {
            return f14260c;
        }
        int iMyTid = Process.myTid();
        f14260c = iMyTid;
        return iMyTid;
    }
}

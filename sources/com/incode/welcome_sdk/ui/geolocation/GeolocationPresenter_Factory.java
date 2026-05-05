package com.incode.welcome_sdk.ui.geolocation;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.geolocation.GeolocationContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationPresenter_Factory implements Factory<GeolocationPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14319a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14320c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<GeolocationContract.View> f14321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f14322e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f14320c + 43;
        f14319a = i3 % 128;
        int i4 = i3 % 2;
        GeolocationPresenter geolocationPresenter = get();
        int i5 = f14319a + 65;
        f14320c = i5 % 128;
        if (i5 % 2 == 0) {
            return geolocationPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GeolocationPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<GeolocationContract.View> provider2) {
        this.f14322e = provider;
        this.f14321d = provider2;
    }

    @Override // javax.inject.Provider
    public final GeolocationPresenter get() {
        int i2 = 2 % 2;
        int i3 = f14319a + 115;
        f14320c = i3 % 128;
        int i4 = i3 % 2;
        GeolocationPresenter geolocationPresenterNewInstance = newInstance(this.f14322e.get(), this.f14321d.get());
        int i5 = f14319a + 27;
        f14320c = i5 % 128;
        if (i5 % 2 == 0) {
            return geolocationPresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GeolocationPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<GeolocationContract.View> provider2) {
        int i2 = 2 % 2;
        GeolocationPresenter_Factory geolocationPresenter_Factory = new GeolocationPresenter_Factory(provider, provider2);
        int i3 = f14319a + 109;
        f14320c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 0 / 0;
        }
        return geolocationPresenter_Factory;
    }

    public static GeolocationPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, GeolocationContract.View view) {
        int i2 = 2 % 2;
        GeolocationPresenter geolocationPresenter = new GeolocationPresenter(incodeWelcomeRepository, view);
        int i3 = f14320c + 67;
        f14319a = i3 % 128;
        if (i3 % 2 != 0) {
            return geolocationPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package com.incode.welcome_sdk.ui.geolocation;

import com.incode.welcome_sdk.results.GeolocationResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14264a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14265e = 1;

    public interface Presenter extends BasePresenter {
        void getUserLocation();

        void onContinue();

        void onCreate();

        void onPermissionsGranted();

        void onStart();

        void publishResult(GeolocationResult geolocationResult);
    }

    public interface View extends BaseView {
        boolean checkLocationPermissions();

        void onServerResponse(String str);

        void requestPermissions();

        void showCurrentLocation(String str);

        void showLocationDisabled();

        void showLocationUnavailable();

        void showWaitingForLocation();
    }

    private GeolocationContract() {
    }

    static {
        new GeolocationContract();
        int i2 = f14264a + 3;
        f14265e = i2 % 128;
        int i3 = i2 % 2;
    }
}

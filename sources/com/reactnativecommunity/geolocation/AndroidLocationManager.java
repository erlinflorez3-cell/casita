package com.reactnativecommunity.geolocation;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SystemClock;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reactnativecommunity.geolocation.BaseLocationManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class AndroidLocationManager extends BaseLocationManager {
    private final LocationListener mLocationListener;

    @Nullable
    private String mWatchedProvider;

    private static class SingleUpdateRequest {
        private static final int TWO_MINUTES = 120000;
        private final Callback mError;
        private final Handler mHandler;
        private final LocationListener mLocationListener;
        private final LocationManager mLocationManager;
        private Location mOldLocation;
        private final String mProvider;
        private final Callback mSuccess;
        private final long mTimeout;
        private final Runnable mTimeoutRunnable;
        private boolean mTriggered;

        private SingleUpdateRequest(LocationManager locationManager, String str, long j2, Callback callback, Callback callback2) {
            this.mHandler = new Handler();
            this.mTimeoutRunnable = new Runnable() { // from class: com.reactnativecommunity.geolocation.AndroidLocationManager.SingleUpdateRequest.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (SingleUpdateRequest.this) {
                        if (!SingleUpdateRequest.this.mTriggered) {
                            SingleUpdateRequest.this.mError.invoke(PositionError.buildError(PositionError.TIMEOUT, "Location request timed out"));
                            SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                            FLog.i(ReactConstants.TAG, "LocationModule: Location request timed out");
                            SingleUpdateRequest.this.mTriggered = true;
                        }
                    }
                }
            };
            this.mLocationListener = new LocationListener() { // from class: com.reactnativecommunity.geolocation.AndroidLocationManager.SingleUpdateRequest.2
                @Override // android.location.LocationListener
                public void onLocationChanged(Location location) {
                    synchronized (SingleUpdateRequest.this) {
                        if (!SingleUpdateRequest.this.mTriggered) {
                            SingleUpdateRequest singleUpdateRequest = SingleUpdateRequest.this;
                            if (singleUpdateRequest.isBetterLocation(location, singleUpdateRequest.mOldLocation)) {
                                SingleUpdateRequest.this.mSuccess.invoke(BaseLocationManager.locationToMap(location));
                                SingleUpdateRequest.this.mHandler.removeCallbacks(SingleUpdateRequest.this.mTimeoutRunnable);
                                SingleUpdateRequest.this.mTriggered = true;
                                SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                            }
                        }
                        SingleUpdateRequest.this.mOldLocation = location;
                    }
                }

                @Override // android.location.LocationListener
                public void onProviderDisabled(String str2) {
                }

                @Override // android.location.LocationListener
                public void onProviderEnabled(String str2) {
                }

                @Override // android.location.LocationListener
                public void onStatusChanged(String str2, int i2, Bundle bundle) {
                }
            };
            this.mLocationManager = locationManager;
            this.mProvider = str;
            this.mTimeout = j2;
            this.mSuccess = callback;
            this.mError = callback2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isBetterLocation(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z2 = time > 120000;
            boolean z3 = time < -120000;
            boolean z4 = time > 0;
            if (z2) {
                return true;
            }
            if (z3) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z5 = accuracy > 0;
            boolean z6 = accuracy < 0;
            boolean z7 = accuracy > 200;
            boolean zIsSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
            if (z6) {
                return true;
            }
            if (!z4 || z5) {
                return z4 && !z7 && zIsSameProvider;
            }
            return true;
        }

        private boolean isSameProvider(String str, String str2) {
            return str == null ? str2 == null : str.equals(str2);
        }

        public void invoke(Location location) throws Throwable {
            this.mOldLocation = location;
            this.mLocationManager.requestLocationUpdates(this.mProvider, 100L, 1.0f, this.mLocationListener);
            Handler handler = this.mHandler;
            Runnable runnable = this.mTimeoutRunnable;
            long j2 = this.mTimeout;
            Class<?> cls = Class.forName(Jg.Wd("z(+u\u001e\u0011\u0018!NS\u0019o6>@\u0006jr", (short) (ZN.Xd() ^ 26650), (short) (ZN.Xd() ^ 11572)));
            Class<?>[] clsArr = {Class.forName(ZO.xd("/.\u0010IX!\u0016\u0010q\u000e+=\u001d\t.W,T", (short) (C1633zX.Xd() ^ (-1461)), (short) (C1633zX.Xd() ^ (-16861)))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            short sXd = (short) (C1607wl.Xd() ^ 23578);
            short sXd2 = (short) (C1607wl.Xd() ^ 17613);
            int[] iArr = new int["/C\u0007aMmvCTJc".length()];
            QB qb = new QB("/C\u0007aMmvCTJc");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    protected AndroidLocationManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLocationListener = new LocationListener() { // from class: com.reactnativecommunity.geolocation.AndroidLocationManager.1
            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) AndroidLocationManager.this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", BaseLocationManager.locationToMap(location));
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i2, Bundle bundle) {
                if (i2 == 0) {
                    AndroidLocationManager.this.emitError(PositionError.POSITION_UNAVAILABLE, "Provider " + str + " is out of service.");
                } else if (i2 == 1) {
                    AndroidLocationManager.this.emitError(PositionError.TIMEOUT, "Provider " + str + " is temporarily unavailable.");
                }
            }
        };
    }

    @Nullable
    private String getValidProvider(LocationManager locationManager, boolean z2) throws Throwable {
        String str = z2 ? "gps" : "network";
        if (!locationManager.isProviderEnabled(str)) {
            String str2 = str.equals("gps") ? "network" : "gps";
            if (!locationManager.isProviderEnabled(str2)) {
                return null;
            }
            str = str2;
        }
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(this.mReactContext, "android.permission.ACCESS_FINE_LOCATION");
        int iCheckSelfPermission2 = ContextCompat.checkSelfPermission(this.mReactContext, "android.permission.ACCESS_COARSE_LOCATION");
        if (!str.equals("gps") || iCheckSelfPermission == 0 || iCheckSelfPermission2 == 0) {
            return str;
        }
        return null;
    }

    @Override // com.reactnativecommunity.geolocation.BaseLocationManager
    public void getCurrentLocationData(ReadableMap readableMap, Callback callback, Callback callback2) throws Throwable {
        BaseLocationManager.LocationOptions locationOptionsFromReactMap = BaseLocationManager.LocationOptions.fromReactMap(readableMap);
        LocationManager locationManager = (LocationManager) this.mReactContext.getSystemService(FirebaseAnalytics.Param.LOCATION);
        String validProvider = getValidProvider(locationManager, locationOptionsFromReactMap.highAccuracy);
        if (validProvider == null) {
            callback2.invoke(PositionError.buildError(PositionError.POSITION_UNAVAILABLE, "No location provider available."));
            return;
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
        if (lastKnownLocation == null || SystemClock.currentTimeMillis() - lastKnownLocation.getTime() >= locationOptionsFromReactMap.maximumAge) {
            new SingleUpdateRequest(locationManager, validProvider, locationOptionsFromReactMap.timeout, callback, callback2).invoke(lastKnownLocation);
        } else {
            callback.invoke(locationToMap(lastKnownLocation));
        }
    }

    @Override // com.reactnativecommunity.geolocation.BaseLocationManager
    public void startObserving(ReadableMap readableMap) throws Throwable {
        if ("gps".equals(this.mWatchedProvider)) {
            return;
        }
        BaseLocationManager.LocationOptions locationOptionsFromReactMap = BaseLocationManager.LocationOptions.fromReactMap(readableMap);
        LocationManager locationManager = (LocationManager) this.mReactContext.getSystemService(FirebaseAnalytics.Param.LOCATION);
        String validProvider = getValidProvider(locationManager, locationOptionsFromReactMap.highAccuracy);
        if (validProvider == null) {
            emitError(PositionError.POSITION_UNAVAILABLE, "No location provider available.");
            return;
        }
        if (!validProvider.equals(this.mWatchedProvider)) {
            locationManager.removeUpdates(this.mLocationListener);
            locationManager.requestLocationUpdates(validProvider, 1000L, locationOptionsFromReactMap.distanceFilter, this.mLocationListener);
        }
        this.mWatchedProvider = validProvider;
    }

    @Override // com.reactnativecommunity.geolocation.BaseLocationManager
    public void stopObserving() {
        ((LocationManager) this.mReactContext.getSystemService(FirebaseAnalytics.Param.LOCATION)).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }
}

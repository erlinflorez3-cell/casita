package com.reactnativecommunity.geolocation;

import android.app.Activity;
import android.location.Location;
import android.os.Looper;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.SystemClock;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.reactnativecommunity.geolocation.BaseLocationManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.EO;
import yg.FB;
import yg.Ig;

/* JADX INFO: loaded from: classes5.dex */
public class PlayServicesLocationManager extends BaseLocationManager {
    private FusedLocationProviderClient mFusedLocationClient;
    private LocationCallback mLocationCallback;
    private SettingsClient mLocationServicesSettingsClient;
    private LocationCallback mSingleLocationCallback;

    protected PlayServicesLocationManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mFusedLocationClient = LocationServices.getFusedLocationProviderClient(reactApplicationContext);
        this.mLocationServicesSettingsClient = LocationServices.getSettingsClient(reactApplicationContext);
    }

    private void checkLocationSettings(ReadableMap readableMap, final LocationCallback locationCallback) {
        BaseLocationManager.LocationOptions locationOptionsFromReactMap = BaseLocationManager.LocationOptions.fromReactMap(readableMap);
        final LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setInterval(locationOptionsFromReactMap.interval);
        if (locationOptionsFromReactMap.fastestInterval >= 0) {
            locationRequestCreate.setFastestInterval(locationOptionsFromReactMap.fastestInterval);
        }
        locationRequestCreate.setExpirationDuration((long) locationOptionsFromReactMap.maximumAge);
        if (locationOptionsFromReactMap.distanceFilter >= 0.0f) {
            locationRequestCreate.setSmallestDisplacement(locationOptionsFromReactMap.distanceFilter);
        }
        locationRequestCreate.setPriority(locationOptionsFromReactMap.highAccuracy ? 100 : 104);
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        builder.addLocationRequest(locationRequestCreate);
        this.mLocationServicesSettingsClient.checkLocationSettings(builder.build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.reactnativecommunity.geolocation.PlayServicesLocationManager$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) throws Throwable {
                this.f$0.lambda$checkLocationSettings$1(locationRequestCreate, locationCallback, (LocationSettingsResponse) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.reactnativecommunity.geolocation.PlayServicesLocationManager$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f$0.lambda$checkLocationSettings$2(exc);
            }
        });
    }

    private LocationCallback createSingleLocationCallback(final Callback callback, final Callback callback2) {
        return new LocationCallback() { // from class: com.reactnativecommunity.geolocation.PlayServicesLocationManager.2
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                if (locationAvailability.isLocationAvailable()) {
                    return;
                }
                callback2.invoke(PositionError.buildError(PositionError.POSITION_UNAVAILABLE, "Location not available (FusedLocationProvider/lastLocation)."));
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                if (locationResult == null) {
                    callback2.invoke(PositionError.buildError(PositionError.POSITION_UNAVAILABLE, "No location provided (FusedLocationProvider/lastLocation)."));
                    return;
                }
                callback.invoke(BaseLocationManager.locationToMap(locationResult.getLastLocation()));
                PlayServicesLocationManager.this.mFusedLocationClient.removeLocationUpdates(PlayServicesLocationManager.this.mSingleLocationCallback);
                PlayServicesLocationManager.this.mSingleLocationCallback = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLocationSettings$1(LocationRequest locationRequest, LocationCallback locationCallback, LocationSettingsResponse locationSettingsResponse) throws Throwable {
        requestLocationUpdates(locationRequest, locationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLocationSettings$2(Exception exc) {
        emitError(PositionError.POSITION_UNAVAILABLE, "Location not available (FusedLocationProvider/settings).");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCurrentLocationData$0(BaseLocationManager.LocationOptions locationOptions, Callback callback, Callback callback2, ReadableMap readableMap, Location location) {
        if (location != null && SystemClock.currentTimeMillis() - location.getTime() < locationOptions.maximumAge) {
            callback.invoke(locationToMap(location));
            return;
        }
        LocationCallback locationCallbackCreateSingleLocationCallback = createSingleLocationCallback(callback, callback2);
        this.mSingleLocationCallback = locationCallbackCreateSingleLocationCallback;
        checkLocationSettings(readableMap, locationCallbackCreateSingleLocationCallback);
    }

    private void requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.mFusedLocationClient;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("K)lc?\u0004#t\u000fc\u0018 \u0014\u0012\u000bb6", (short) (FB.Xd() ^ 12958))).getDeclaredMethod(EO.Od("\u0002'*e\u0004h\fsq@A\u0016q", (short) (C1499aX.Xd() ^ (-3891))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, (Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.reactnativecommunity.geolocation.BaseLocationManager
    public void getCurrentLocationData(final ReadableMap readableMap, final Callback callback, final Callback callback2) {
        final BaseLocationManager.LocationOptions locationOptionsFromReactMap = BaseLocationManager.LocationOptions.fromReactMap(readableMap);
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity != null) {
            this.mFusedLocationClient.getLastLocation().addOnSuccessListener(currentActivity, new OnSuccessListener() { // from class: com.reactnativecommunity.geolocation.PlayServicesLocationManager$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.lambda$getCurrentLocationData$0(locationOptionsFromReactMap, callback, callback2, readableMap, (Location) obj);
                }
            });
            return;
        }
        LocationCallback locationCallbackCreateSingleLocationCallback = createSingleLocationCallback(callback, callback2);
        this.mSingleLocationCallback = locationCallbackCreateSingleLocationCallback;
        checkLocationSettings(readableMap, locationCallbackCreateSingleLocationCallback);
    }

    @Override // com.reactnativecommunity.geolocation.BaseLocationManager
    public void startObserving(ReadableMap readableMap) {
        LocationCallback locationCallback = new LocationCallback() { // from class: com.reactnativecommunity.geolocation.PlayServicesLocationManager.1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                if (locationAvailability.isLocationAvailable()) {
                    return;
                }
                PlayServicesLocationManager.this.emitError(PositionError.POSITION_UNAVAILABLE, "Location not available (FusedLocationProvider).");
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                if (locationResult == null) {
                    PlayServicesLocationManager.this.emitError(PositionError.POSITION_UNAVAILABLE, "No location provided (FusedLocationProvider/observer).");
                } else {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) PlayServicesLocationManager.this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", BaseLocationManager.locationToMap(locationResult.getLastLocation()));
                }
            }
        };
        this.mLocationCallback = locationCallback;
        checkLocationSettings(readableMap, locationCallback);
    }

    @Override // com.reactnativecommunity.geolocation.BaseLocationManager
    public void stopObserving() {
        this.mFusedLocationClient.removeLocationUpdates(this.mLocationCallback);
    }
}

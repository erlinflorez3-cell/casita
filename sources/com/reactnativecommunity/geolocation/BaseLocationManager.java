package com.reactnativecommunity.geolocation;

import android.location.Location;
import android.os.Bundle;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.InAppMessageBase;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.sentry.ProfilingTraceData;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseLocationManager {
    protected static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    public ReactApplicationContext mReactContext;

    protected static class LocationOptions {
        protected final float distanceFilter;
        protected final int fastestInterval;
        protected final boolean highAccuracy;
        protected final int interval;
        protected final double maximumAge;
        protected final long timeout;

        private LocationOptions(int i2, int i3, long j2, double d2, boolean z2, float f2) {
            this.interval = i2;
            this.fastestInterval = i3;
            this.timeout = j2;
            this.maximumAge = d2;
            this.highAccuracy = z2;
            this.distanceFilter = f2;
        }

        protected static LocationOptions fromReactMap(ReadableMap readableMap) {
            return new LocationOptions(readableMap.hasKey("interval") ? readableMap.getInt("interval") : 10000, readableMap.hasKey("fastestInterval") ? readableMap.getInt("fastestInterval") : -1, readableMap.hasKey(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT) ? (long) readableMap.getDouble(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT) : 600000L, readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY, readableMap.hasKey("enableHighAccuracy") && readableMap.getBoolean("enableHighAccuracy"), readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : BaseLocationManager.RCT_DEFAULT_LOCATION_ACCURACY);
        }
    }

    protected BaseLocationManager(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    protected static WritableMap locationToMap(Location location) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble(IBrazeLocation.LATITUDE, location.getLatitude());
        writableMapCreateMap2.putDouble(IBrazeLocation.LONGITUDE, location.getLongitude());
        writableMapCreateMap2.putDouble(IBrazeLocation.ALTITUDE, location.getAltitude());
        writableMapCreateMap2.putDouble("accuracy", location.getAccuracy());
        writableMapCreateMap2.putDouble("heading", location.getBearing());
        writableMapCreateMap2.putDouble("speed", location.getSpeed());
        writableMapCreateMap.putMap("coords", writableMapCreateMap2);
        writableMapCreateMap.putDouble("timestamp", location.getTime());
        Bundle extras = location.getExtras();
        if (extras != null) {
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            for (String str : extras.keySet()) {
                putIntoMap(writableMapCreateMap3, str, extras.get(str));
            }
            writableMapCreateMap.putMap(InAppMessageBase.EXTRAS, writableMapCreateMap3);
        }
        writableMapCreateMap.putBoolean("mocked", location.isFromMockProvider());
        return writableMapCreateMap;
    }

    protected static void putIntoMap(WritableMap writableMap, String str, Object obj) {
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableMap.putInt(str, ((Long) obj).intValue());
            return;
        }
        if (obj instanceof Float) {
            writableMap.putDouble(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if ((obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof double[]) || (obj instanceof String[]) || (obj instanceof boolean[])) {
            writableMap.putArray(str, Arguments.fromArray(obj));
        }
    }

    protected void emitError(int i2, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", PositionError.buildError(i2, str));
    }

    public abstract void getCurrentLocationData(ReadableMap readableMap, Callback callback, Callback callback2);

    public abstract void startObserving(ReadableMap readableMap);

    public abstract void stopObserving();
}

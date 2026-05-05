package com.npmdavi.davinotification;

import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.models.outgoing.BrazeProperties;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: loaded from: classes5.dex */
public class MyBrazeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "PushNotificationModule";
    private final ReactApplicationContext reactContext;

    public MyBrazeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void changeUser(String str) {
        Braze.getInstance(this.reactContext).changeUser(str);
        String str2 = "User changed to: " + str;
    }

    @ReactMethod
    public void configureBraze(String str, String str2, String str3, String str4) {
        Braze.configure(this.reactContext, new BrazeConfig.Builder().setApiKey(str).setCustomEndpoint(str2).setAutomaticGeofenceRequestsEnabled(true).setSessionTimeout(60).setHandlePushDeepLinksAutomatically(true).setGreatNetworkDataFlushInterval(10).setIsFirebaseCloudMessagingRegistrationEnabled(false).setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(false).setFirebaseCloudMessagingSenderIdKey(str3).setDefaultNotificationChannelName(str4).setIsLocationCollectionEnabled(true).setGeofencesEnabled(true).build());
        String str5 = "Braze configured with apiKey: " + str + " and endpoint: " + str2;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MyBrazeModule";
    }

    @ReactMethod
    public void logCustomEvent(String str, String str2) {
        BrazeProperties brazeProperties = new BrazeProperties();
        brazeProperties.addProperty("eventProperties", str2);
        Braze.getInstance(this.reactContext).logCustomEvent(str, brazeProperties);
    }

    @ReactMethod
    public void registerPushTokenBraze(String str) {
        Braze.getInstance(this.reactContext).setRegisteredPushToken(str);
    }
}

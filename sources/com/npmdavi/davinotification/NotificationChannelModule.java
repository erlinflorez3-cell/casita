package com.npmdavi.davinotification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationChannelModule extends ReactContextBaseJavaModule {
    private static String CHANNEL_ID = "DaviNotificationChannel";
    private static final String TAG = "PushNotificationModule";
    private static ReactApplicationContext reactContext = null;

    public NotificationChannelModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactContext = reactApplicationContext;
    }

    public static String getChannelId() {
        return CHANNEL_ID;
    }

    @ReactMethod
    public void createNotificationChannel(String str, String str2, String str3, Promise promise) {
        try {
            NotificationManager notificationManager = (NotificationManager) reactContext.getSystemService("notification");
            Uri uri = Uri.parse("android.resource://" + reactContext.getPackageName() + "/raw/" + str3);
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.setSound(uri, audioAttributesBuild);
            notificationManager.createNotificationChannel(notificationChannel);
            CHANNEL_ID = str;
            promise.resolve("Canal de notificación creado: " + str);
        } catch (Exception e2) {
            promise.reject("Error create notification channel: ", e2.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NotificationChannelModule";
    }

    @ReactMethod
    public void getNotificationChannelId(Promise promise) {
        promise.resolve(CHANNEL_ID);
    }
}

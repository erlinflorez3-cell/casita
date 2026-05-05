package com.npmdavi.davinotification;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0004 4&\n*.\"\u001e \u0019\u0016(\u001c!\u001f")
public class DaviNotificationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DaviNotification";

    public DaviNotificationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void multiply(double d2, double d3, Promise promise) {
        promise.resolve(Double.valueOf(d2 * d3));
    }
}

package com.oauthdavisdk;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* JADX INFO: loaded from: classes5.dex */
@ReactModule(name = OauthDaviSdkModule.NAME)
public class OauthDaviSdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "OauthDaviSdk";

    public OauthDaviSdkModule(ReactApplicationContext reactApplicationContext) {
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

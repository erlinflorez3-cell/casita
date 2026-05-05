package com.appsflyer.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: loaded from: classes3.dex */
public class PCAppsFlyerModule extends ReactContextBaseJavaModule {
    public PCAppsFlyerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PCAppsFlyer";
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}

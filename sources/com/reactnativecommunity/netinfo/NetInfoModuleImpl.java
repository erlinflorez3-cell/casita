package com.reactnativecommunity.netinfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller;

/* JADX INFO: loaded from: classes5.dex */
public class NetInfoModuleImpl implements AmazonFireDeviceConnectivityPoller.ConnectivityChangedCallback {
    public static final String NAME = "RNCNetInfo";
    private final AmazonFireDeviceConnectivityPoller mAmazonConnectivityChecker;
    private final ConnectivityReceiver mConnectivityReceiver;
    private int numberOfListeners = 0;

    public NetInfoModuleImpl(ReactApplicationContext reactApplicationContext) {
        this.mConnectivityReceiver = new NetworkCallbackConnectivityReceiver(reactApplicationContext);
        this.mAmazonConnectivityChecker = new AmazonFireDeviceConnectivityPoller(reactApplicationContext, this);
    }

    public void addListener(String str) {
        this.numberOfListeners++;
        this.mConnectivityReceiver.hasListener = true;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.getCurrentState(str, promise);
    }

    public void initialize() {
        this.mConnectivityReceiver.register();
        this.mAmazonConnectivityChecker.register();
    }

    public void invalidate() {
        this.mAmazonConnectivityChecker.unregister();
        this.mConnectivityReceiver.unregister();
        this.mConnectivityReceiver.hasListener = false;
    }

    @Override // com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller.ConnectivityChangedCallback
    public void onAmazonFireDeviceConnectivityChanged(boolean z2) {
        this.mConnectivityReceiver.setIsInternetReachableOverride(z2);
    }

    public void onCatalystInstanceDestroy() {
        invalidate();
    }

    public void removeListeners(double d2) {
        int i2 = (int) (((double) this.numberOfListeners) - d2);
        this.numberOfListeners = i2;
        if (i2 == 0) {
            this.mConnectivityReceiver.hasListener = false;
        }
    }
}

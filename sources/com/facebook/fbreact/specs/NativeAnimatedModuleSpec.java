package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedModule";

    public NativeAnimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addAnimatedEventToView(double d2, String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void connectAnimatedNodeToView(double d2, double d3);

    @ReactMethod
    public abstract void connectAnimatedNodes(double d2, double d3);

    @ReactMethod
    public abstract void createAnimatedNode(double d2, ReadableMap readableMap);

    @ReactMethod
    public abstract void disconnectAnimatedNodeFromView(double d2, double d3);

    @ReactMethod
    public abstract void disconnectAnimatedNodes(double d2, double d3);

    @ReactMethod
    public abstract void dropAnimatedNode(double d2);

    @ReactMethod
    public abstract void extractAnimatedNodeOffset(double d2);

    @ReactMethod
    public abstract void finishOperationBatch();

    @ReactMethod
    public abstract void flattenAnimatedNodeOffset(double d2);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void getValue(double d2, Callback callback);

    @ReactMethod
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @ReactMethod
    public abstract void removeAnimatedEventFromView(double d2, String str, double d3);

    @ReactMethod
    public abstract void removeListeners(double d2);

    @ReactMethod
    public abstract void restoreDefaultValues(double d2);

    @ReactMethod
    public abstract void setAnimatedNodeOffset(double d2, double d3);

    @ReactMethod
    public abstract void setAnimatedNodeValue(double d2, double d3);

    @ReactMethod
    public abstract void startAnimatingNode(double d2, double d3, ReadableMap readableMap, Callback callback);

    @ReactMethod
    public abstract void startListeningToAnimatedNodeValue(double d2);

    @ReactMethod
    public abstract void startOperationBatch();

    @ReactMethod
    public abstract void stopAnimation(double d2);

    @ReactMethod
    public abstract void stopListeningToAnimatedNodeValue(double d2);

    @ReactMethod
    public void updateAnimatedNodeConfig(double d2, ReadableMap readableMap) {
    }
}

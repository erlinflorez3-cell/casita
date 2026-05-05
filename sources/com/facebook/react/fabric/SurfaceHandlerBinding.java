package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.interfaces.fabric.SurfaceHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class SurfaceHandlerBinding implements SurfaceHandler {
    public static final int DISPLAY_MODE_HIDDEN = 2;
    public static final int DISPLAY_MODE_SUSPENDED = 1;
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;
    private final HybridData mHybridData;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayModeTypeDef {
    }

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String str) {
        this.mHybridData = initHybrid(0, str);
    }

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i2, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i2);

    private native void setLayoutConstraintsNative(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3, float f8);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i2);

    private native void startNative();

    private native void stopNative();

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public String getModuleName() {
        return getModuleNameNative();
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public int getSurfaceId() {
        return getSurfaceIdNative();
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public boolean isRunning() {
        return isRunningNative();
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void setLayoutConstraints(int i2, int i3, int i4, int i5, boolean z2, boolean z3, float f2) {
        setLayoutConstraintsNative(LayoutMetricsConversions.getMinSize(i2) / f2, LayoutMetricsConversions.getMaxSize(i2) / f2, LayoutMetricsConversions.getMinSize(i3) / f2, LayoutMetricsConversions.getMaxSize(i3) / f2, i4 / f2, i5 / f2, z2, z3, f2);
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void setMountable(boolean z2) {
        setDisplayModeNative(!z2 ? 1 : 0);
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void setProps(NativeMap nativeMap) {
        setPropsNative(nativeMap);
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void setSurfaceId(int i2) {
        setSurfaceIdNative(i2);
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void start() {
        startNative();
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void stop() {
        stopNative();
    }
}

package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.reactperflogger.NativeModulePerfLogger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class TurboModulePerfLogger {

    @Nullable
    private static NativeModulePerfLogger sNativeModulePerfLogger = null;

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    TurboModulePerfLogger() {
    }

    public static void enableLogging(NativeModulePerfLogger nativeModulePerfLogger) {
        if (nativeModulePerfLogger != null) {
            sNativeModulePerfLogger = nativeModulePerfLogger;
            jniEnableCppLogging(nativeModulePerfLogger);
        }
    }

    private static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    public static void moduleCreateCacheHit(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateCacheHit(str, i2);
        }
    }

    public static void moduleCreateConstructEnd(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateConstructEnd(str, i2);
        }
    }

    public static void moduleCreateConstructStart(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateConstructStart(str, i2);
        }
    }

    public static void moduleCreateEnd(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateEnd(str, i2);
        }
    }

    public static void moduleCreateFail(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateFail(str, i2);
        }
    }

    public static void moduleCreateSetUpEnd(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateSetUpEnd(str, i2);
        }
    }

    public static void moduleCreateSetUpStart(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateSetUpStart(str, i2);
        }
    }

    public static void moduleCreateStart(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateStart(str, i2);
        }
    }

    public static void moduleDataCreateEnd(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleDataCreateEnd(str, i2);
        }
    }

    public static void moduleDataCreateStart(String str, int i2) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleDataCreateStart(str, i2);
        }
    }
}

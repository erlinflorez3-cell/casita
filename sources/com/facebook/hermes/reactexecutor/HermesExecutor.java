package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.soloader.SoLoader;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class HermesExecutor extends JavaScriptExecutor {
    private static String mode_ = null;

    static {
        loadLibrary();
    }

    HermesExecutor(@Nullable RuntimeConfig runtimeConfig, boolean z2, String str) {
        super(runtimeConfig == null ? initHybridDefaultConfig(z2, str) : initHybrid(z2, str, runtimeConfig.getHeapSizeMB()));
    }

    private static native HybridData initHybrid(boolean z2, String str, long j2);

    private static native HybridData initHybridDefaultConfig(boolean z2, String str);

    public static void loadLibrary() throws UnsatisfiedLinkError {
        if (mode_ == null) {
            SoLoader.loadLibrary("hermes");
            SoLoader.loadLibrary("hermes_executor");
            mode_ = ReactBuildConfig.DEBUG ? "Debug" : "Release";
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + mode_;
    }
}

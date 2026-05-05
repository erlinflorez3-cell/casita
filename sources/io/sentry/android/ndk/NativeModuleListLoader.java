package io.sentry.android.ndk;

import io.sentry.protocol.DebugImage;

/* JADX INFO: loaded from: classes6.dex */
final class NativeModuleListLoader {
    NativeModuleListLoader() {
    }

    public static native void nativeClearModuleList();

    public static native DebugImage[] nativeLoadModuleList();

    public void clearModuleList() {
        nativeClearModuleList();
    }

    public DebugImage[] loadModuleList() {
        return nativeLoadModuleList();
    }
}

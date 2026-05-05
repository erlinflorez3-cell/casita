package com.facebook.jni;

import com.facebook.soloader.nativeloader.NativeLoader;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadScopeSupport {
    static {
        NativeLoader.loadLibrary("fbjni");
    }

    private static void runStdFunction(long j2) {
        runStdFunctionImpl(j2);
    }

    private static native void runStdFunctionImpl(long j2);
}

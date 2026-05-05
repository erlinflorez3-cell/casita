package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes5.dex */
public class KeyboardWorkletWrapper {
    private final HybridData mHybridData;

    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i2, int i3);
}

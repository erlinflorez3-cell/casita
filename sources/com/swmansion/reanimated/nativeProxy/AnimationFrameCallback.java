package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;

/* JADX INFO: loaded from: classes5.dex */
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {
    private final HybridData mHybridData;

    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d2);
}

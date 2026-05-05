package com.facebook.react.devsupport.inspector;

import com.facebook.jni.HybridData;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class InspectorNetworkRequestListener {
    private final HybridData mHybridData;

    public InspectorNetworkRequestListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onCompletion();

    public native void onData(String str);

    public native void onError(String str);

    public native void onHeaders(int i2, Map<String, String> map);
}

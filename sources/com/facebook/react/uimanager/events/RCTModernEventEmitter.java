package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i2, int i3, String str, WritableMap writableMap);

    void receiveEvent(int i2, int i3, String str, boolean z2, int i4, WritableMap writableMap, int i5);

    @Deprecated
    void receiveTouches(TouchEvent touchEvent);
}

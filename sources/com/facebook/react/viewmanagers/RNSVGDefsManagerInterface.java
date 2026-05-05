package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGDefsManagerInterface<T extends View> {
    void setClipPath(T t2, String str);

    void setClipRule(T t2, int i2);

    void setDisplay(T t2, String str);

    void setMarkerEnd(T t2, String str);

    void setMarkerMid(T t2, String str);

    void setMarkerStart(T t2, String str);

    void setMask(T t2, String str);

    void setMatrix(T t2, ReadableArray readableArray);

    void setName(T t2, String str);

    void setOpacity(T t2, float f2);

    void setPointerEvents(T t2, String str);

    void setResponsible(T t2, boolean z2);
}

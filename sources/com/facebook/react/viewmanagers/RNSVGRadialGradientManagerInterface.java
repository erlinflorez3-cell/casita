package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGRadialGradientManagerInterface<T extends View> {
    void setClipPath(T t2, String str);

    void setClipRule(T t2, int i2);

    void setCx(T t2, Dynamic dynamic);

    void setCy(T t2, Dynamic dynamic);

    void setDisplay(T t2, String str);

    void setFx(T t2, Dynamic dynamic);

    void setFy(T t2, Dynamic dynamic);

    void setGradient(T t2, ReadableArray readableArray);

    void setGradientTransform(T t2, ReadableArray readableArray);

    void setGradientUnits(T t2, int i2);

    void setMarkerEnd(T t2, String str);

    void setMarkerMid(T t2, String str);

    void setMarkerStart(T t2, String str);

    void setMask(T t2, String str);

    void setMatrix(T t2, ReadableArray readableArray);

    void setName(T t2, String str);

    void setOpacity(T t2, float f2);

    void setPointerEvents(T t2, String str);

    void setResponsible(T t2, boolean z2);

    void setRx(T t2, Dynamic dynamic);

    void setRy(T t2, Dynamic dynamic);
}

package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGForeignObjectManagerInterface<T extends View> {
    void setClipPath(T t2, String str);

    void setClipRule(T t2, int i2);

    void setColor(T t2, Integer num);

    void setDisplay(T t2, String str);

    void setFill(T t2, Dynamic dynamic);

    void setFillOpacity(T t2, float f2);

    void setFillRule(T t2, int i2);

    void setFilter(T t2, String str);

    void setFont(T t2, Dynamic dynamic);

    void setFontSize(T t2, Dynamic dynamic);

    void setFontWeight(T t2, Dynamic dynamic);

    void setHeight(T t2, Dynamic dynamic);

    void setMarkerEnd(T t2, String str);

    void setMarkerMid(T t2, String str);

    void setMarkerStart(T t2, String str);

    void setMask(T t2, String str);

    void setMatrix(T t2, ReadableArray readableArray);

    void setName(T t2, String str);

    void setOpacity(T t2, float f2);

    void setPointerEvents(T t2, String str);

    void setPropList(T t2, ReadableArray readableArray);

    void setResponsible(T t2, boolean z2);

    void setStroke(T t2, Dynamic dynamic);

    void setStrokeDasharray(T t2, Dynamic dynamic);

    void setStrokeDashoffset(T t2, float f2);

    void setStrokeLinecap(T t2, int i2);

    void setStrokeLinejoin(T t2, int i2);

    void setStrokeMiterlimit(T t2, float f2);

    void setStrokeOpacity(T t2, float f2);

    void setStrokeWidth(T t2, Dynamic dynamic);

    void setVectorEffect(T t2, int i2);

    void setWidth(T t2, Dynamic dynamic);

    void setX(T t2, Dynamic dynamic);

    void setY(T t2, Dynamic dynamic);
}

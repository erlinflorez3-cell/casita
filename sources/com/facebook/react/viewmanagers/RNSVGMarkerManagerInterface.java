package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGMarkerManagerInterface<T extends View> {
    void setAlign(T t2, String str);

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

    void setMarkerEnd(T t2, String str);

    void setMarkerHeight(T t2, Dynamic dynamic);

    void setMarkerMid(T t2, String str);

    void setMarkerStart(T t2, String str);

    void setMarkerUnits(T t2, String str);

    void setMarkerWidth(T t2, Dynamic dynamic);

    void setMask(T t2, String str);

    void setMatrix(T t2, ReadableArray readableArray);

    void setMeetOrSlice(T t2, int i2);

    void setMinX(T t2, float f2);

    void setMinY(T t2, float f2);

    void setName(T t2, String str);

    void setOpacity(T t2, float f2);

    void setOrient(T t2, String str);

    void setPointerEvents(T t2, String str);

    void setPropList(T t2, ReadableArray readableArray);

    void setRefX(T t2, Dynamic dynamic);

    void setRefY(T t2, Dynamic dynamic);

    void setResponsible(T t2, boolean z2);

    void setStroke(T t2, Dynamic dynamic);

    void setStrokeDasharray(T t2, Dynamic dynamic);

    void setStrokeDashoffset(T t2, float f2);

    void setStrokeLinecap(T t2, int i2);

    void setStrokeLinejoin(T t2, int i2);

    void setStrokeMiterlimit(T t2, float f2);

    void setStrokeOpacity(T t2, float f2);

    void setStrokeWidth(T t2, Dynamic dynamic);

    void setVbHeight(T t2, float f2);

    void setVbWidth(T t2, float f2);

    void setVectorEffect(T t2, int i2);
}

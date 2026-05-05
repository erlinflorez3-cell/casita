package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFilterManagerInterface<T extends View> {
    void setFilterUnits(T t2, String str);

    void setHeight(T t2, Dynamic dynamic);

    void setName(T t2, String str);

    void setPrimitiveUnits(T t2, String str);

    void setWidth(T t2, Dynamic dynamic);

    void setX(T t2, Dynamic dynamic);

    void setY(T t2, Dynamic dynamic);
}

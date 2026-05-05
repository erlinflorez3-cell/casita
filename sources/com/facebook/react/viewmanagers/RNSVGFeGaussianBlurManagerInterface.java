package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFeGaussianBlurManagerInterface<T extends View> {
    void setEdgeMode(T t2, String str);

    void setHeight(T t2, Dynamic dynamic);

    void setIn1(T t2, String str);

    void setResult(T t2, String str);

    void setStdDeviationX(T t2, float f2);

    void setStdDeviationY(T t2, float f2);

    void setWidth(T t2, Dynamic dynamic);

    void setX(T t2, Dynamic dynamic);

    void setY(T t2, Dynamic dynamic);
}

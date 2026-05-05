package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGFeMergeManagerInterface<T extends View> {
    void setHeight(T t2, Dynamic dynamic);

    void setNodes(T t2, ReadableArray readableArray);

    void setResult(T t2, String str);

    void setWidth(T t2, Dynamic dynamic);

    void setX(T t2, Dynamic dynamic);

    void setY(T t2, Dynamic dynamic);
}

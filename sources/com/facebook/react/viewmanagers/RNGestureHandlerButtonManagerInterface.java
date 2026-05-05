package com.facebook.react.viewmanagers;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface RNGestureHandlerButtonManagerInterface<T extends View> {
    void setBorderColor(T t2, Integer num);

    void setBorderStyle(T t2, String str);

    void setBorderWidth(T t2, float f2);

    void setBorderless(T t2, boolean z2);

    void setEnabled(T t2, boolean z2);

    void setExclusive(T t2, boolean z2);

    void setForeground(T t2, boolean z2);

    void setRippleColor(T t2, Integer num);

    void setRippleRadius(T t2, int i2);

    void setTouchSoundDisabled(T t2, boolean z2);
}

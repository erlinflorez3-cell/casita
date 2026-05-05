package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSVGSvgViewAndroidManagerInterface<T extends View> {
    void setAccessible(T t2, boolean z2);

    void setAlign(T t2, String str);

    void setBackfaceVisibility(T t2, String str);

    void setBbHeight(T t2, Dynamic dynamic);

    void setBbWidth(T t2, Dynamic dynamic);

    void setBorderBlockColor(T t2, Integer num);

    void setBorderBlockEndColor(T t2, Integer num);

    void setBorderBlockStartColor(T t2, Integer num);

    void setBorderBottomColor(T t2, Integer num);

    void setBorderBottomEndRadius(T t2, Dynamic dynamic);

    void setBorderBottomLeftRadius(T t2, Dynamic dynamic);

    void setBorderBottomRightRadius(T t2, Dynamic dynamic);

    void setBorderBottomStartRadius(T t2, Dynamic dynamic);

    void setBorderColor(T t2, Integer num);

    void setBorderEndColor(T t2, Integer num);

    void setBorderEndEndRadius(T t2, Dynamic dynamic);

    void setBorderEndStartRadius(T t2, Dynamic dynamic);

    void setBorderLeftColor(T t2, Integer num);

    void setBorderRadius(T t2, Dynamic dynamic);

    void setBorderRightColor(T t2, Integer num);

    void setBorderStartColor(T t2, Integer num);

    void setBorderStartEndRadius(T t2, Dynamic dynamic);

    void setBorderStartStartRadius(T t2, Dynamic dynamic);

    void setBorderStyle(T t2, String str);

    void setBorderTopColor(T t2, Integer num);

    void setBorderTopEndRadius(T t2, Dynamic dynamic);

    void setBorderTopLeftRadius(T t2, Dynamic dynamic);

    void setBorderTopRightRadius(T t2, Dynamic dynamic);

    void setBorderTopStartRadius(T t2, Dynamic dynamic);

    void setColor(T t2, Integer num);

    void setFocusable(T t2, boolean z2);

    void setHasTVPreferredFocus(T t2, boolean z2);

    void setHitSlop(T t2, Dynamic dynamic);

    void setMeetOrSlice(T t2, int i2);

    void setMinX(T t2, float f2);

    void setMinY(T t2, float f2);

    void setNativeBackgroundAndroid(T t2, ReadableMap readableMap);

    void setNativeForegroundAndroid(T t2, ReadableMap readableMap);

    void setNeedsOffscreenAlphaCompositing(T t2, boolean z2);

    void setNextFocusDown(T t2, int i2);

    void setNextFocusForward(T t2, int i2);

    void setNextFocusLeft(T t2, int i2);

    void setNextFocusRight(T t2, int i2);

    void setNextFocusUp(T t2, int i2);

    void setPointerEvents(T t2, String str);

    void setRemoveClippedSubviews(T t2, boolean z2);

    void setVbHeight(T t2, float f2);

    void setVbWidth(T t2, float f2);
}

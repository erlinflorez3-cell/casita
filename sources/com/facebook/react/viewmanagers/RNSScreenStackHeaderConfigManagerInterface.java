package com.facebook.react.viewmanagers;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSScreenStackHeaderConfigManagerInterface<T extends View> {
    void setBackButtonDisplayMode(T t2, String str);

    void setBackButtonInCustomView(T t2, boolean z2);

    void setBackTitle(T t2, String str);

    void setBackTitleFontFamily(T t2, String str);

    void setBackTitleFontSize(T t2, int i2);

    void setBackTitleVisible(T t2, boolean z2);

    void setBackgroundColor(T t2, Integer num);

    void setBlurEffect(T t2, String str);

    void setColor(T t2, Integer num);

    void setDirection(T t2, String str);

    void setDisableBackButtonMenu(T t2, boolean z2);

    void setHidden(T t2, boolean z2);

    void setHideBackButton(T t2, boolean z2);

    void setHideShadow(T t2, boolean z2);

    void setLargeTitle(T t2, boolean z2);

    void setLargeTitleBackgroundColor(T t2, Integer num);

    void setLargeTitleColor(T t2, Integer num);

    void setLargeTitleFontFamily(T t2, String str);

    void setLargeTitleFontSize(T t2, int i2);

    void setLargeTitleFontWeight(T t2, String str);

    void setLargeTitleHideShadow(T t2, boolean z2);

    void setTitle(T t2, String str);

    void setTitleColor(T t2, Integer num);

    void setTitleFontFamily(T t2, String str);

    void setTitleFontSize(T t2, int i2);

    void setTitleFontWeight(T t2, String str);

    void setTopInsetEnabled(T t2, boolean z2);

    void setTranslucent(T t2, boolean z2);
}

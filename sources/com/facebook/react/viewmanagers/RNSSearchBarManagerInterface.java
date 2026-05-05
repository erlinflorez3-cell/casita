package com.facebook.react.viewmanagers;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSSearchBarManagerInterface<T extends View> {
    void blur(T t2);

    void cancelSearch(T t2);

    void clearText(T t2);

    void focus(T t2);

    void setAutoCapitalize(T t2, String str);

    void setBarTintColor(T t2, Integer num);

    void setCancelButtonText(T t2, String str);

    void setDisableBackButtonOverride(T t2, boolean z2);

    void setHeaderIconColor(T t2, Integer num);

    void setHideNavigationBar(T t2, boolean z2);

    void setHideWhenScrolling(T t2, boolean z2);

    void setHintTextColor(T t2, Integer num);

    void setInputType(T t2, String str);

    void setObscureBackground(T t2, boolean z2);

    void setPlaceholder(T t2, String str);

    void setPlacement(T t2, String str);

    void setShouldShowHintSearchIcon(T t2, boolean z2);

    void setText(T t2, String str);

    void setTextColor(T t2, Integer num);

    void setTintColor(T t2, Integer num);

    void toggleCancelButton(T t2, boolean z2);
}

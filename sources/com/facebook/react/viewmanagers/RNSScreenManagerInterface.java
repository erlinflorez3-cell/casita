package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public interface RNSScreenManagerInterface<T extends View> {
    void setActivityState(T t2, float f2);

    void setCustomAnimationOnSwipe(T t2, boolean z2);

    void setFullScreenSwipeEnabled(T t2, boolean z2);

    void setFullScreenSwipeShadowEnabled(T t2, boolean z2);

    void setGestureEnabled(T t2, boolean z2);

    void setGestureResponseDistance(T t2, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t2, boolean z2);

    void setHomeIndicatorHidden(T t2, boolean z2);

    void setNativeBackButtonDismissalEnabled(T t2, boolean z2);

    void setNavigationBarColor(T t2, Integer num);

    void setNavigationBarHidden(T t2, boolean z2);

    void setNavigationBarTranslucent(T t2, boolean z2);

    void setPreventNativeDismiss(T t2, boolean z2);

    void setReplaceAnimation(T t2, String str);

    void setScreenOrientation(T t2, String str);

    void setSheetAllowedDetents(T t2, ReadableArray readableArray);

    void setSheetCornerRadius(T t2, float f2);

    void setSheetElevation(T t2, int i2);

    void setSheetExpandsWhenScrolledToEdge(T t2, boolean z2);

    void setSheetGrabberVisible(T t2, boolean z2);

    void setSheetInitialDetent(T t2, int i2);

    void setSheetLargestUndimmedDetent(T t2, int i2);

    void setStackAnimation(T t2, String str);

    void setStackPresentation(T t2, String str);

    void setStatusBarAnimation(T t2, String str);

    void setStatusBarColor(T t2, Integer num);

    void setStatusBarHidden(T t2, boolean z2);

    void setStatusBarStyle(T t2, String str);

    void setStatusBarTranslucent(T t2, boolean z2);

    void setSwipeDirection(T t2, String str);

    void setTransitionDuration(T t2, int i2);
}

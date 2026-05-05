package com.facebook.react.views.scroll;

import android.content.Context;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class ReactHorizontalScrollContainerView extends ReactViewGroup {
    private int mLayoutDirection;

    public ReactHorizontalScrollContainerView(Context context) {
        super(context);
        this.mLayoutDirection = I18nUtil.getInstance().isRTL(context) ? 1 : 0;
    }

    @Override // android.view.View, android.view.ViewParent
    public int getLayoutDirection() {
        return ReactNativeFeatureFlags.setAndroidLayoutDirection() ? super.getLayoutDirection() : this.mLayoutDirection;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (getLayoutDirection() == 1) {
            setLeft(0);
            setTop(i3);
            setRight(i4 - i2);
            setBottom(i5);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.uimanager.ReactClippingViewGroup
    public void setRemoveClippedSubviews(boolean z2) {
        if (getLayoutDirection() == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z2);
        }
    }
}

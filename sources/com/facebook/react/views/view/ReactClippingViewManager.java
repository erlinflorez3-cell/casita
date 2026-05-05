package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReactClippingViewManager<T extends ReactViewGroup> extends ViewGroupManager<T> {
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(T t2, View view, int i2) {
        UiThreadUtil.assertOnUiThread();
        if (t2.getRemoveClippedSubviews()) {
            t2.addViewWithSubviewClippingEnabled(view, i2);
        } else {
            t2.addView(view, i2);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(T t2, int i2) {
        return t2.getRemoveClippedSubviews() ? t2.getChildAtWithSubviewClippingEnabled(i2) : t2.getChildAt(i2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(T t2) {
        return t2.getRemoveClippedSubviews() ? t2.getAllChildrenCount() : t2.getChildCount();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(T t2) {
        UiThreadUtil.assertOnUiThread();
        if (t2.getRemoveClippedSubviews()) {
            t2.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t2.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(T t2, int i2) {
        UiThreadUtil.assertOnUiThread();
        if (!t2.getRemoveClippedSubviews()) {
            t2.removeViewAt(i2);
            return;
        }
        View childAt = getChildAt((ReactViewGroup) t2, i2);
        if (childAt != null) {
            if (childAt.getParent() != null) {
                t2.removeView(childAt);
            }
            t2.removeViewWithSubviewClippingEnabled(childAt);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tl\t\u0012-p\u0005_F@\u001beRp?!\u000eQ\u001fZ")
    public void setRemoveClippedSubviews(T t2, boolean z2) {
        UiThreadUtil.assertOnUiThread();
        t2.setRemoveClippedSubviews(z2);
    }
}

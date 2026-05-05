package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, LayoutShadowNode> implements IViewGroupManager<T> {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public ViewGroupManager() {
        super(null);
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i2) {
        mZIndexHash.put(view, Integer.valueOf(i2));
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(T t2, View view, int i2) {
        t2.addView(view, i2);
    }

    public void addViews(T t2, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            addView((ViewGroup) t2, list.get(i2), i2);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public View getChildAt(T t2, int i2) {
        return t2.getChildAt(i2);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(T t2) {
        return t2.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeView(T t2, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i2 = 0; i2 < getChildCount((ViewGroup) t2); i2++) {
            if (getChildAt((ViewGroup) t2, i2) == view) {
                removeViewAt((ViewGroup) t2, i2);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(T t2, int i2) {
        UiThreadUtil.assertOnUiThread();
        t2.removeViewAt(i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t2, Object obj) {
    }
}

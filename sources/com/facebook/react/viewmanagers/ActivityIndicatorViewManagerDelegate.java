package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.ActivityIndicatorViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityIndicatorViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & ActivityIndicatorViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ActivityIndicatorViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "size":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setSize(t2, (String) obj);
                break;
            case "color":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "hidesWhenStopped":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setHidesWhenStopped(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "animating":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setAnimating(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

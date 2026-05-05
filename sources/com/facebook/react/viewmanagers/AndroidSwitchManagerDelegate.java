package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidSwitchManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidSwitchManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidSwitchManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t2, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((AndroidSwitchManagerInterface) this.mViewManager).setNativeValue(t2, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "thumbColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setThumbColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "enabled":
                ((AndroidSwitchManagerInterface) this.mViewManager).setEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackTintColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "on":
                ((AndroidSwitchManagerInterface) this.mViewManager).setOn(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((AndroidSwitchManagerInterface) this.mViewManager).setValue(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((AndroidSwitchManagerInterface) this.mViewManager).setDisabled(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackColorForFalse(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "thumbTintColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setThumbTintColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "trackColorForTrue":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackColorForTrue(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class ModalHostViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & ModalHostViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ModalHostViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "presentationStyle":
                ((ModalHostViewManagerInterface) this.mViewManager).setPresentationStyle(t2, (String) obj);
                break;
            case "supportedOrientations":
                ((ModalHostViewManagerInterface) this.mViewManager).setSupportedOrientations(t2, (ReadableArray) obj);
                break;
            case "transparent":
                ((ModalHostViewManagerInterface) this.mViewManager).setTransparent(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((ModalHostViewManagerInterface) this.mViewManager).setIdentifier(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((ModalHostViewManagerInterface) this.mViewManager).setStatusBarTranslucent(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((ModalHostViewManagerInterface) this.mViewManager).setAnimated(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((ModalHostViewManagerInterface) this.mViewManager).setVisible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((ModalHostViewManagerInterface) this.mViewManager).setHardwareAccelerated(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((ModalHostViewManagerInterface) this.mViewManager).setAnimationType(t2, (String) obj);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

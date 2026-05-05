package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DebuggingOverlayManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DebuggingOverlayManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DebuggingOverlayManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t2, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "clearElementsHighlights":
                ((DebuggingOverlayManagerInterface) this.mViewManager).clearElementsHighlights(t2);
                break;
            case "highlightTraceUpdates":
                ((DebuggingOverlayManagerInterface) this.mViewManager).highlightTraceUpdates(t2, readableArray.getArray(0));
                break;
            case "highlightElements":
                ((DebuggingOverlayManagerInterface) this.mViewManager).highlightElements(t2, readableArray.getArray(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        super.setProperty(t2, str, obj);
    }
}

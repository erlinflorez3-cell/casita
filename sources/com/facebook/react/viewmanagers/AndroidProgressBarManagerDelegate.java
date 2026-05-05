package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidProgressBarManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidProgressBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidProgressBarManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals("progress")) {
                    b2 = 0;
                }
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    b2 = 1;
                }
                break;
            case -676876213:
                if (str.equals(ReactProgressBarViewManager.PROP_ATTR)) {
                    b2 = 2;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b2 = 3;
                }
                break;
            case 633138363:
                if (str.equals(ReactProgressBarViewManager.PROP_INDETERMINATE)) {
                    b2 = 4;
                }
                break;
            case 1118509918:
                if (str.equals(ReactProgressBarViewManager.PROP_ANIMATING)) {
                    b2 = 5;
                }
                break;
            case 1804741442:
                if (str.equals(ReactProgressBarViewManager.PROP_STYLE)) {
                    b2 = 6;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setProgress(t2, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 1:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setTestID(t2, obj == null ? "" : (String) obj);
                break;
            case 2:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setTypeAttr(t2, obj != null ? (String) obj : null);
                break;
            case 3:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 4:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setIndeterminate(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setAnimating(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 6:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setStyleAttr(t2, obj != null ? (String) obj : null);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

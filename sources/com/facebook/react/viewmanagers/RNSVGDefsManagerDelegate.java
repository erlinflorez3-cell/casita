package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGDefsManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGDefsManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGDefsManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b2 = 0;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b2 = 1;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b2 = 2;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b2 = 3;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b2 = 4;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b2 = 5;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b2 = 6;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b2 = 7;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b2 = 8;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b2 = 9;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b2 = 10;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b2 = Ascii.VT;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((BaseViewManager) this.mViewManager).setOpacity(t2, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 1:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setMatrix(t2, (ReadableArray) obj);
                break;
            case 2:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerEnd(t2, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerMid(t2, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setMask(t2, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerStart(t2, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setClipPath(t2, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setClipRule(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 10:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setDisplay(t2, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSVGDefsManagerInterface) ((BaseViewManager) this.mViewManager)).setResponsible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

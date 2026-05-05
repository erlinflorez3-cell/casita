package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGLinearGradientManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGLinearGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGLinearGradientManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1932235233:
                if (str.equals("gradientUnits")) {
                    b2 = 0;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b2 = 1;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b2 = 2;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b2 = 3;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b2 = 4;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b2 = 5;
                }
                break;
            case 3769:
                if (str.equals("x1")) {
                    b2 = 6;
                }
                break;
            case 3770:
                if (str.equals("x2")) {
                    b2 = 7;
                }
                break;
            case 3800:
                if (str.equals("y1")) {
                    b2 = 8;
                }
                break;
            case 3801:
                if (str.equals("y2")) {
                    b2 = 9;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b2 = 10;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b2 = Ascii.VT;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    b2 = Ascii.FF;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b2 = Ascii.CR;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b2 = Ascii.SO;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b2 = Ascii.SI;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b2 = 16;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    b2 = 17;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b2 = Ascii.DC2;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setGradientUnits(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                ((BaseViewManager) this.mViewManager).setOpacity(t2, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 2:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMatrix(t2, (ReadableArray) obj);
                break;
            case 3:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerEnd(t2, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerMid(t2, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setX1(t2, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setX2(t2, new DynamicFromObject(obj));
                break;
            case 8:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setY1(t2, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setY2(t2, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMask(t2, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setGradient(t2, (ReadableArray) obj);
                break;
            case 13:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerStart(t2, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setClipPath(t2, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setClipRule(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 16:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setDisplay(t2, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setGradientTransform(t2, (ReadableArray) obj);
                break;
            case 18:
                ((RNSVGLinearGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setResponsible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

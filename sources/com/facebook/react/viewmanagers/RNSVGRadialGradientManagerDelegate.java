package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGRadialGradientManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGRadialGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGRadialGradientManagerDelegate(BaseViewManager baseViewManager) {
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
            case 3189:
                if (str.equals("cx")) {
                    b2 = 6;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    b2 = 7;
                }
                break;
            case 3282:
                if (str.equals("fx")) {
                    b2 = 8;
                }
                break;
            case 3283:
                if (str.equals("fy")) {
                    b2 = 9;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    b2 = 10;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
                    b2 = Ascii.VT;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b2 = Ascii.FF;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b2 = Ascii.CR;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    b2 = Ascii.SO;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b2 = Ascii.SI;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b2 = 16;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b2 = 17;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    b2 = 19;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b2 = Ascii.DC4;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setGradientUnits(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                ((BaseViewManager) this.mViewManager).setOpacity(t2, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 2:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMatrix(t2, (ReadableArray) obj);
                break;
            case 3:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerEnd(t2, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerMid(t2, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setCx(t2, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setCy(t2, new DynamicFromObject(obj));
                break;
            case 8:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setFx(t2, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setFy(t2, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setRx(t2, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setRy(t2, new DynamicFromObject(obj));
                break;
            case 12:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMask(t2, obj != null ? (String) obj : null);
                break;
            case 13:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setGradient(t2, (ReadableArray) obj);
                break;
            case 15:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerStart(t2, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setClipPath(t2, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setClipRule(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 18:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setDisplay(t2, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setGradientTransform(t2, (ReadableArray) obj);
                break;
            case 20:
                ((RNSVGRadialGradientManagerInterface) ((BaseViewManager) this.mViewManager)).setResponsible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

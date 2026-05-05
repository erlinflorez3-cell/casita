package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGEllipseManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGEllipseManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGEllipseManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
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
            case -993894751:
                if (str.equals("propList")) {
                    b2 = 3;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b2 = 4;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b2 = 5;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b2 = 6;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b2 = 7;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b2 = 8;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b2 = 9;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b2 = 10;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b2 = Ascii.VT;
                }
                break;
            case 3189:
                if (str.equals("cx")) {
                    b2 = Ascii.FF;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    b2 = Ascii.CR;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    b2 = Ascii.SO;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
                    b2 = Ascii.SI;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b2 = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b2 = 17;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b2 = 19;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b2 = Ascii.EM;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b2 = Ascii.ESC;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b2 = Ascii.FS;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b2 = Ascii.GS;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b2 = Ascii.RS;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setFilter(t2, obj != null ? (String) obj : null);
                break;
            case 1:
                ((BaseViewManager) this.mViewManager).setOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setMatrix(t2, (ReadableArray) obj);
                break;
            case 3:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setPropList(t2, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerEnd(t2, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerMid(t2, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStroke(t2, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setFillRule(t2, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 8:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 9:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setFillOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeDashoffset(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 12:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setCx(t2, new DynamicFromObject(obj));
                break;
            case 13:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setCy(t2, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setRx(t2, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setRy(t2, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setFill(t2, new DynamicFromObject(obj));
                break;
            case 17:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setMask(t2, obj != null ? (String) obj : null);
                break;
            case 18:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeMiterlimit(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 21:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setVectorEffect(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 22:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerStart(t2, obj != null ? (String) obj : null);
                break;
            case 23:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeDasharray(t2, new DynamicFromObject(obj));
                break;
            case 24:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setClipPath(t2, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setClipRule(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 26:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeLinecap(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setDisplay(t2, obj != null ? (String) obj : null);
                break;
            case 28:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeLinejoin(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setResponsible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSVGEllipseManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeWidth(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

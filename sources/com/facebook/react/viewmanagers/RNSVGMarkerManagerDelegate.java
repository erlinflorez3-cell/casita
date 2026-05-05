package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGMarkerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGMarkerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGMarkerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b2 = 0;
                }
                break;
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
                    b2 = 1;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b2 = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b2 = 3;
                }
                break;
            case -1008621499:
                if (str.equals("orient")) {
                    b2 = 4;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b2 = 5;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b2 = 6;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b2 = 7;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b2 = 8;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    b2 = 9;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b2 = 10;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b2 = Ascii.VT;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b2 = Ascii.FF;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b2 = Ascii.CR;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b2 = Ascii.SO;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b2 = Ascii.SI;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b2 = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b2 = 17;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b2 = 19;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 3496485:
                if (str.equals("refX")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 3496486:
                if (str.equals("refY")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b2 = Ascii.EM;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b2 = Ascii.ESC;
                }
                break;
            case 218785621:
                if (str.equals("markerUnits")) {
                    b2 = Ascii.FS;
                }
                break;
            case 220478892:
                if (str.equals("markerWidth")) {
                    b2 = Ascii.GS;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b2 = Ascii.RS;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    b2 = Ascii.US;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b2 = 32;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b2 = 33;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b2 = 34;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b2 = 35;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b2 = 36;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b2 = 37;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b2 = 38;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b2 = 39;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b2 = 40;
                }
                break;
            case 2106883585:
                if (str.equals("markerHeight")) {
                    b2 = 41;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setVbHeight(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 1:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFilter(t2, obj != null ? (String) obj : null);
                break;
            case 2:
                ((BaseViewManager) this.mViewManager).setOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMatrix(t2, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setOrient(t2, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setPropList(t2, (ReadableArray) obj);
                break;
            case 6:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerEnd(t2, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerMid(t2, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStroke(t2, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFontWeight(t2, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFillRule(t2, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 11:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 13:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFillOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeDashoffset(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 15:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFill(t2, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFont(t2, new DynamicFromObject(obj));
                break;
            case 17:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMask(t2, obj != null ? (String) obj : null);
                break;
            case 18:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMinX(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 19:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMinY(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setRefX(t2, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setRefY(t2, new DynamicFromObject(obj));
                break;
            case 23:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeMiterlimit(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 24:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setAlign(t2, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 26:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setVectorEffect(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerStart(t2, obj != null ? (String) obj : null);
                break;
            case 28:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerUnits(t2, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerWidth(t2, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setVbWidth(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 31:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setFontSize(t2, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeDasharray(t2, new DynamicFromObject(obj));
                break;
            case 33:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setClipPath(t2, obj != null ? (String) obj : null);
                break;
            case 34:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setClipRule(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeLinecap(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 36:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setDisplay(t2, obj != null ? (String) obj : null);
                break;
            case 37:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeLinejoin(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 38:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setResponsible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 39:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMeetOrSlice(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 40:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeWidth(t2, new DynamicFromObject(obj));
                break;
            case 41:
                ((RNSVGMarkerManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerHeight(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

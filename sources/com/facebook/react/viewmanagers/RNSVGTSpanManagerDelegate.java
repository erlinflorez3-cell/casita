package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGTSpanManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGTSpanManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGTSpanManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1603134955:
                if (str.equals("lengthAdjust")) {
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
            case -1171891896:
                if (str.equals("alignmentBaseline")) {
                    b2 = 3;
                }
                break;
            case -1139902161:
                if (str.equals("verticalAlign")) {
                    b2 = 4;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b2 = 5;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b2 = 6;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b2 = 7;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b2 = 8;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b2 = 9;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b2 = 10;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    b2 = Ascii.VT;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b2 = Ascii.FF;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b2 = Ascii.CR;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b2 = Ascii.SO;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b2 = Ascii.SI;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b2 = 16;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b2 = 17;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 3220:
                if (str.equals("dx")) {
                    b2 = 19;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b2 = Ascii.EM;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b2 = Ascii.ESC;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b2 = Ascii.FS;
                }
                break;
            case 275888445:
                if (str.equals("baselineShift")) {
                    b2 = Ascii.GS;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    b2 = Ascii.RS;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b2 = Ascii.US;
                }
                break;
            case 778043962:
                if (str.equals("inlineSize")) {
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
            case 951530617:
                if (str.equals("content")) {
                    b2 = 35;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b2 = 36;
                }
                break;
            case 1637488243:
                if (str.equals("textLength")) {
                    b2 = 37;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b2 = 38;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b2 = 39;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b2 = 40;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b2 = 41;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setLengthAdjust(t2, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFilter(t2, obj != null ? (String) obj : null);
                break;
            case 2:
                ((BaseViewManager) this.mViewManager).setOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setAlignmentBaseline(t2, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setVerticalAlign(t2, new DynamicFromObject(obj));
                break;
            case 5:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setMatrix(t2, (ReadableArray) obj);
                break;
            case 6:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setPropList(t2, (ReadableArray) obj);
                break;
            case 7:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerEnd(t2, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerMid(t2, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setRotate(t2, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStroke(t2, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFontWeight(t2, new DynamicFromObject(obj));
                break;
            case 12:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFillRule(t2, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 13:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFillOpacity(t2, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 16:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeDashoffset(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 17:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setX(t2, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setY(t2, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setDx(t2, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setDy(t2, new DynamicFromObject(obj));
                break;
            case 21:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFill(t2, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFont(t2, new DynamicFromObject(obj));
                break;
            case 23:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setMask(t2, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeMiterlimit(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 26:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 27:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setVectorEffect(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setMarkerStart(t2, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setBaselineShift(t2, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setFontSize(t2, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeDasharray(t2, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setInlineSize(t2, new DynamicFromObject(obj));
                break;
            case 33:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setClipPath(t2, obj != null ? (String) obj : null);
                break;
            case 34:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setClipRule(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setContent(t2, obj != null ? (String) obj : null);
                break;
            case 36:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeLinecap(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 37:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setTextLength(t2, new DynamicFromObject(obj));
                break;
            case 38:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setDisplay(t2, obj != null ? (String) obj : null);
                break;
            case 39:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeLinejoin(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 40:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setResponsible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 41:
                ((RNSVGTSpanManagerInterface) ((BaseViewManager) this.mViewManager)).setStrokeWidth(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

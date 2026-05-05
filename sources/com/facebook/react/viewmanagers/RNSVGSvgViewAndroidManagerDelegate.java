package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGSvgViewAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGSvgViewAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public RNSVGSvgViewAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    b2 = 0;
                }
                break;
            case -1989576717:
                if (str.equals(ViewProps.BORDER_RIGHT_COLOR)) {
                    b2 = 1;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    b2 = 2;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b2 = 3;
                }
                break;
            case -1470826662:
                if (str.equals(ViewProps.BORDER_TOP_COLOR)) {
                    b2 = 4;
                }
                break;
            case -1308858324:
                if (str.equals(ViewProps.BORDER_BOTTOM_COLOR)) {
                    b2 = 5;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b2 = 6;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    b2 = 7;
                }
                break;
            case -1122140597:
                if (str.equals(ViewProps.BORDER_TOP_START_RADIUS)) {
                    b2 = 8;
                }
                break;
            case -867333731:
                if (str.equals(ViewProps.BORDER_BOTTOM_START_RADIUS)) {
                    b2 = 9;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    b2 = 10;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    b2 = Ascii.VT;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    b2 = Ascii.FF;
                }
                break;
            case -483490364:
                if (str.equals(ViewProps.BORDER_TOP_END_RADIUS)) {
                    b2 = Ascii.CR;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    b2 = Ascii.SO;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b2 = Ascii.SI;
                }
                break;
            case -252105751:
                if (str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
                    b2 = 16;
                }
                break;
            case -242276144:
                if (str.equals(ViewProps.BORDER_LEFT_COLOR)) {
                    b2 = 17;
                }
                break;
            case -223134121:
                if (str.equals(ViewProps.BORDER_START_END_RADIUS)) {
                    b2 = Ascii.DC2;
                }
                break;
            case -148030058:
                if (str.equals(ViewProps.BORDER_BOTTOM_END_RADIUS)) {
                    b2 = 19;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    b2 = Ascii.DC4;
                }
                break;
            case -27894242:
                if (str.equals(ViewProps.BORDER_START_START_RADIUS)) {
                    b2 = Ascii.NAK;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
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
            case 240482938:
                if (str.equals("vbWidth")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 306963138:
                if (str.equals(ViewProps.BORDER_BLOCK_START_COLOR)) {
                    b2 = Ascii.ESC;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b2 = Ascii.FS;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    b2 = Ascii.GS;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b2 = Ascii.RS;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b2 = Ascii.US;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    b2 = 32;
                }
                break;
            case 684610594:
                if (str.equals(ViewProps.BORDER_BLOCK_COLOR)) {
                    b2 = 33;
                }
                break;
            case 722830999:
                if (str.equals(ViewProps.BORDER_COLOR)) {
                    b2 = 34;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b2 = 35;
                }
                break;
            case 762983977:
                if (str.equals(ViewProps.BORDER_BLOCK_END_COLOR)) {
                    b2 = 36;
                }
                break;
            case 910681861:
                if (str.equals(ViewProps.BORDER_END_START_RADIUS)) {
                    b2 = 37;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    b2 = 38;
                }
                break;
            case 1220735892:
                if (str.equals(ViewProps.BORDER_END_COLOR)) {
                    b2 = 39;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b2 = 40;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    b2 = 41;
                }
                break;
            case 1667773924:
                if (str.equals(ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)) {
                    b2 = 42;
                }
                break;
            case 1735382270:
                if (str.equals(ViewProps.BORDER_END_END_RADIUS)) {
                    b2 = 43;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    b2 = 44;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b2 = 45;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    b2 = 46;
                }
                break;
            case 2119889261:
                if (str.equals(ViewProps.BORDER_START_COLOR)) {
                    b2 = 47;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBbHeight(t2, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderRightColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 2:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBackfaceVisibility(t2, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setVbHeight(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 4:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderTopColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 5:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBottomColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 6:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderTopLeftRadius(t2, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setAccessible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderTopStartRadius(t2, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBottomStartRadius(t2, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setHasTVPreferredFocus(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNextFocusDown(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 12:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNextFocusLeft(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 13:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderTopEndRadius(t2, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBbWidth(t2, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setPointerEvents(t2, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setRemoveClippedSubviews(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderLeftColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 18:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderStartEndRadius(t2, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBottomEndRadius(t2, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNativeForegroundAndroid(t2, (ReadableMap) obj);
                break;
            case 21:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderStartStartRadius(t2, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setMinX(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 23:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setMinY(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 24:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setAlign(t2, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 26:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setVbWidth(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 27:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBlockStartColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 28:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderTopRightRadius(t2, new DynamicFromObject(obj));
                break;
            case 29:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNextFocusForward(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBottomLeftRadius(t2, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBottomRightRadius(t2, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNextFocusUp(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBlockColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 34:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 35:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderStyle(t2, obj != null ? (String) obj : null);
                break;
            case 36:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderBlockEndColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 37:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderEndStartRadius(t2, new DynamicFromObject(obj));
                break;
            case 38:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setHitSlop(t2, new DynamicFromObject(obj));
                break;
            case 39:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderEndColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 40:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderRadius(t2, new DynamicFromObject(obj));
                break;
            case 41:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setFocusable(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 42:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNeedsOffscreenAlphaCompositing(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 43:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderEndEndRadius(t2, new DynamicFromObject(obj));
                break;
            case 44:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNativeBackgroundAndroid(t2, (ReadableMap) obj);
                break;
            case 45:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setMeetOrSlice(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 46:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setNextFocusRight(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 47:
                ((RNSVGSvgViewAndroidManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderStartColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

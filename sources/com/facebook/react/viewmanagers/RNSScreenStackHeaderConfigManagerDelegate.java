package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderConfigManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1822687399:
                if (str.equals("translucent")) {
                    b2 = 0;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    b2 = 1;
                }
                break;
            case -1795707688:
                if (str.equals("blurEffect")) {
                    b2 = 2;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    b2 = 3;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    b2 = 4;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    b2 = 5;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    b2 = 6;
                }
                break;
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    b2 = 7;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    b2 = 8;
                }
                break;
            case -1093089076:
                if (str.equals("backButtonDisplayMode")) {
                    b2 = 9;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    b2 = 10;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b2 = Ascii.VT;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    b2 = Ascii.FF;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    b2 = Ascii.CR;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    b2 = Ascii.SO;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b2 = Ascii.SI;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    b2 = 16;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    b2 = 17;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    b2 = 19;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    b2 = Ascii.SYN;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    b2 = Ascii.EM;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    b2 = Ascii.ESC;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTranslucent(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTitleColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 2:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBlurEffect(t2, (String) obj);
                break;
            case 3:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitleColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 4:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTitleFontFamily(t2, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setDisableBackButtonMenu(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTitleFontWeight(t2, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setHidden(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitleFontSize(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 9:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackButtonDisplayMode(t2, (String) obj);
                break;
            case 10:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackTitleVisible(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setDirection(t2, (String) obj);
                break;
            case 12:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitleBackgroundColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 13:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackButtonInCustomView(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 14:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitleFontFamily(t2, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 16:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTitle(t2, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackTitleFontSize(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 18:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackTitleFontFamily(t2, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setHideShadow(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 20:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitleFontWeight(t2, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setHideBackButton(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 22:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackgroundColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 23:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setBackTitle(t2, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTitleFontSize(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 25:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitleHideShadow(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setLargeTitle(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 27:
                ((RNSScreenStackHeaderConfigManagerInterface) ((BaseViewManager) this.mViewManager)).setTopInsetEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

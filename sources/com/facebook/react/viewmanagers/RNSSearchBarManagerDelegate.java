package com.facebook.react.viewmanagers;

import android.view.View;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSSearchBarManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSSearchBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSSearchBarManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t2, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "cancelSearch":
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).cancelSearch(t2);
                break;
            case "clearText":
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).clearText(t2);
                break;
            case "toggleCancelButton":
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).toggleCancelButton(t2, readableArray.getBoolean(0));
                break;
            case "blur":
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).blur(t2);
                break;
            case "focus":
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).focus(t2);
                break;
            case "setText":
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setText(t2, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1619312835:
                if (str.equals("hideNavigationBar")) {
                    b2 = 0;
                }
                break;
            case -1465798051:
                if (str.equals("headerIconColor")) {
                    b2 = 1;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    b2 = 2;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b2 = 3;
                }
                break;
            case -336520619:
                if (str.equals("barTintColor")) {
                    b2 = 4;
                }
                break;
            case -256845969:
                if (str.equals("hintTextColor")) {
                    b2 = 5;
                }
                break;
            case -186579527:
                if (str.equals("hideWhenScrolling")) {
                    b2 = 6;
                }
                break;
            case -146361959:
                if (str.equals("cancelButtonText")) {
                    b2 = 7;
                }
                break;
            case -109380883:
                if (str.equals("disableBackButtonOverride")) {
                    b2 = 8;
                }
                break;
            case -39414888:
                if (str.equals("shouldShowHintSearchIcon")) {
                    b2 = 9;
                }
                break;
            case 598246771:
                if (str.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                    b2 = 10;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    b2 = Ascii.VT;
                }
                break;
            case 1584806451:
                if (str.equals("obscureBackground")) {
                    b2 = Ascii.FF;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    b2 = Ascii.CR;
                }
                break;
            case 1792938725:
                if (str.equals(AdRevenueScheme.PLACEMENT)) {
                    b2 = Ascii.SO;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setHideNavigationBar(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setHeaderIconColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 2:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setAutoCapitalize(t2, (String) obj);
                break;
            case 3:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setTextColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 4:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setBarTintColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 5:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setHintTextColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 6:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setHideWhenScrolling(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setCancelButtonText(t2, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setDisableBackButtonOverride(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setShouldShowHintSearchIcon(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setPlaceholder(t2, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setTintColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 12:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setObscureBackground(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 13:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setInputType(t2, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNSSearchBarManagerInterface) ((BaseViewManager) this.mViewManager)).setPlacement(t2, (String) obj);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

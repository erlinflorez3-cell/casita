package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public RNSScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937389126:
                b2 = !str.equals("homeIndicatorHidden") ? (byte) -1 : (byte) 0;
                break;
            case -1853558344:
                b2 = !str.equals("gestureEnabled") ? (byte) -1 : (byte) 1;
                break;
            case -1734097646:
                b2 = !str.equals("hideKeyboardOnSwipe") ? (byte) -1 : (byte) 2;
                break;
            case -1349152186:
                b2 = !str.equals("sheetCornerRadius") ? (byte) -1 : (byte) 3;
                break;
            case -1322084375:
                b2 = !str.equals("navigationBarHidden") ? (byte) -1 : (byte) 4;
                break;
            case -1156137512:
                b2 = !str.equals("statusBarTranslucent") ? (byte) -1 : (byte) 5;
                break;
            case -1150711358:
                b2 = !str.equals("stackPresentation") ? (byte) -1 : (byte) 6;
                break;
            case -1047235902:
                b2 = !str.equals("activityState") ? (byte) -1 : (byte) 7;
                break;
            case -973702878:
                b2 = !str.equals("statusBarColor") ? (byte) -1 : (byte) 8;
                break;
            case -958765200:
                b2 = !str.equals("statusBarStyle") ? (byte) -1 : (byte) 9;
                break;
            case -952227806:
                b2 = !str.equals("fullScreenSwipeShadowEnabled") ? (byte) -1 : (byte) 10;
                break;
            case -577711652:
                b2 = !str.equals("stackAnimation") ? (byte) -1 : Ascii.VT;
                break;
            case -462720700:
                b2 = !str.equals("navigationBarColor") ? (byte) -1 : Ascii.FF;
                break;
            case -381571779:
                b2 = !str.equals("sheetInitialDetent") ? (byte) -1 : Ascii.CR;
                break;
            case -274098190:
                b2 = !str.equals("sheetAllowedDetents") ? (byte) -1 : Ascii.SO;
                break;
            case -257141968:
                b2 = !str.equals("replaceAnimation") ? (byte) -1 : Ascii.SI;
                break;
            case -166356101:
                b2 = !str.equals("preventNativeDismiss") ? (byte) -1 : (byte) 16;
                break;
            case 17337291:
                b2 = !str.equals("statusBarHidden") ? (byte) -1 : (byte) 17;
                break;
            case 129956386:
                b2 = !str.equals("fullScreenSwipeEnabled") ? (byte) -1 : Ascii.DC2;
                break;
            case 187703999:
                b2 = !str.equals("gestureResponseDistance") ? (byte) -1 : (byte) 19;
                break;
            case 227582404:
                b2 = !str.equals("screenOrientation") ? (byte) -1 : Ascii.DC4;
                break;
            case 241896530:
                b2 = !str.equals("sheetLargestUndimmedDetent") ? (byte) -1 : Ascii.NAK;
                break;
            case 425064969:
                b2 = !str.equals("transitionDuration") ? (byte) -1 : Ascii.SYN;
                break;
            case 1082157413:
                b2 = !str.equals("swipeDirection") ? (byte) -1 : Ascii.ETB;
                break;
            case 1110843912:
                b2 = !str.equals("customAnimationOnSwipe") ? (byte) -1 : (byte) 24;
                break;
            case 1116050554:
                b2 = !str.equals("navigationBarTranslucent") ? (byte) -1 : Ascii.EM;
                break;
            case 1269009342:
                b2 = !str.equals("sheetElevation") ? (byte) -1 : Ascii.SUB;
                break;
            case 1357942638:
                b2 = !str.equals("sheetGrabberVisible") ? (byte) -1 : Ascii.ESC;
                break;
            case 1387359683:
                b2 = !str.equals("statusBarAnimation") ? (byte) -1 : Ascii.FS;
                break;
            case 1729091548:
                b2 = !str.equals("nativeBackButtonDismissalEnabled") ? (byte) -1 : Ascii.GS;
                break;
            case 2097450072:
                b2 = !str.equals("sheetExpandsWhenScrolledToEdge") ? (byte) -1 : Ascii.RS;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setHomeIndicatorHidden(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setGestureEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 2:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setHideKeyboardOnSwipe(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetCornerRadius(t2, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 4:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setNavigationBarHidden(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStatusBarTranslucent(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStackPresentation(t2, (String) obj);
                break;
            case 7:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setActivityState(t2, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 8:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStatusBarColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 9:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStatusBarStyle(t2, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setFullScreenSwipeShadowEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStackAnimation(t2, (String) obj);
                break;
            case 12:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setNavigationBarColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case 13:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetInitialDetent(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 14:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetAllowedDetents(t2, (ReadableArray) obj);
                break;
            case 15:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setReplaceAnimation(t2, (String) obj);
                break;
            case 16:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setPreventNativeDismiss(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStatusBarHidden(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 18:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setFullScreenSwipeEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 19:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setGestureResponseDistance(t2, (ReadableMap) obj);
                break;
            case 20:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setScreenOrientation(t2, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetLargestUndimmedDetent(t2, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 22:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setTransitionDuration(t2, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 23:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSwipeDirection(t2, (String) obj);
                break;
            case 24:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setCustomAnimationOnSwipe(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 25:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setNavigationBarTranslucent(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetElevation(t2, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 27:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetGrabberVisible(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setStatusBarAnimation(t2, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setNativeBackButtonDismissalEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSScreenManagerInterface) ((BaseViewManager) this.mViewManager)).setSheetExpandsWhenScrolledToEdge(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}

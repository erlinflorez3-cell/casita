package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.ReplaceWith;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class PopupWindowCompat {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Method sGetWindowLayoutTypeMethod = null;
    private static boolean sGetWindowLayoutTypeMethodAttempted = false;
    private static Field sOverlapAnchorField = null;
    private static boolean sOverlapAnchorFieldAttempted = false;
    private static Method sSetWindowLayoutTypeMethod = null;
    private static boolean sSetWindowLayoutTypeMethodAttempted = false;

    private PopupWindowCompat() {
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00149'(\u000e.pQGT\u000b)4F?/n~sU\u000b)!TFQ@eV\u0013wjWp\u001ffH6\"cC}\u0005ab\f\u0004s\u001e", imports = {})
    @Deprecated
    public static void showAsDropDown(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        popupWindow.showAsDropDown(view, i2, i3, i4);
    }

    public static void setOverlapAnchor(PopupWindow popupWindow, boolean z2) {
        Api23Impl.setOverlapAnchor(popupWindow, z2);
    }

    public static boolean getOverlapAnchor(PopupWindow popupWindow) {
        return Api23Impl.getOverlapAnchor(popupWindow);
    }

    public static void setWindowLayoutType(PopupWindow popupWindow, int i2) {
        Api23Impl.setWindowLayoutType(popupWindow, i2);
    }

    public static int getWindowLayoutType(PopupWindow popupWindow) {
        return Api23Impl.getWindowLayoutType(popupWindow);
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setOverlapAnchor(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        static boolean getOverlapAnchor(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static void setWindowLayoutType(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }

        static int getWindowLayoutType(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }
    }
}

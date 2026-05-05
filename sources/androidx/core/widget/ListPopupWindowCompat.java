package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return createDragToOpenListener((ListPopupWindow) obj, view);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00103*'mom^H43$TCGl\u000e\u0002aHW-vc?I\")\u0006\u000bmr=.ra>>!*K\n\u0005c\u0015", imports = {})
    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(ListPopupWindow listPopupWindow, View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }
}

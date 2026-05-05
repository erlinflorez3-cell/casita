package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MarginLayoutParamsCompat {
    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d\u001a\u0003tJJJD3$CH11\u001f7%", imports = {})
    @Deprecated
    public static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d\u001a\u0003tJJJD3$5B4fS", imports = {})
    @Deprecated
    public static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d&\u0003tJJJD3$CH11\u001f7iHU/\u001c_1V/,+C", imports = {})
    @Deprecated
    public static void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setMarginStart(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d&\u0003tJJJD3$5B4f\u0018pnNL6w_B\u000b", imports = {})
    @Deprecated
    public static void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setMarginEnd(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d\u001c\u0011M^[?F8\bU@13\u0014\u0006a\u000f\f", imports = {})
    @Deprecated
    public static boolean isMarginRelative(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @Deprecated
    public static int getLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d&\u0003tIJQL?*4=B$\u000e\u0004eVQo\u001fRWQC.z\u0004ziT9h\\Gx", imports = {})
    @Deprecated
    public static void setLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setLayoutDirection(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0010:d%\u0003slUNB\u0016\u0017iCE3nxnLF<\u001c`L\n:\u001b0\n}x5.qR<D%'\u0012?", imports = {})
    @Deprecated
    public static void resolveLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.resolveLayoutDirection(i2);
    }

    private MarginLayoutParamsCompat() {
    }
}

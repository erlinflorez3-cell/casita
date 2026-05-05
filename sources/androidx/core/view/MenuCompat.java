package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ReplaceWith;
import androidx.core.internal.view.SupportMenu;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class MenuCompat {
    @InterfaceC1492Gx
    @ReplaceWith(expression = "\r>\u001c Ksb]+E9-1G\u0011\"\u001fxkU\u000b)\u0016eGQ<~%\u0010u-", imports = {})
    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i2) {
        menuItem.setShowAsAction(i2);
    }

    public static void setGroupDividerEnabled(Menu menu, boolean z2) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z2);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setGroupDividerEnabled(menu, z2);
        }
    }

    private MenuCompat() {
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void setGroupDividerEnabled(Menu menu, boolean z2) {
            menu.setGroupDividerEnabled(z2);
        }
    }
}

package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0005-+\u001c\u0014iqb%>8\u0017W9Bl\u0014\u0003HVZ\u001a\u0014^\"GD#\u001a\u007f0-", imports = {})
    @Deprecated
    public static boolean isLowRamDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}

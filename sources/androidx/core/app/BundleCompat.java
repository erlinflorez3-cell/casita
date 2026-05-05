package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class BundleCompat {
    private BundleCompat() {
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0006?%\u0017\ne+P=Q\f\u001f^851Rza`\f", imports = {})
    @Deprecated
    public static IBinder getBinder(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0006?%\u0017\ne+YMQ\f\u001f^851Rza`\u000fg\u0015ZLF3,_", imports = {})
    @Deprecated
    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

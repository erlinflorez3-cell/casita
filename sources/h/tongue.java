package h;

import android.app.AppOpsManager;
import android.app.Application;
import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue implements superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f19682a;

    public tongue(Application application) {
        this.f19682a = application;
    }

    public final boolean a(List list) {
        int i2;
        AppOpsManager appOpsManager = (AppOpsManager) ContextCompat.getSystemService(this.f19682a, AppOpsManager.class);
        if (appOpsManager == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e0.pair pairVar = (e0.pair) it.next();
            try {
                i2 = Build.VERSION.SDK_INT;
            } catch (SecurityException unused) {
            }
            if (i2 < 29 || i2 >= 36) {
                if (appOpsManager.checkOp("android:mock_location", pairVar.f18468l.f18475b, pairVar.f18457a) == 0) {
                    return true;
                }
            } else if (appOpsManager.unsafeCheckOp("android:mock_location", pairVar.f18468l.f18475b, pairVar.f18457a) == 0) {
                return true;
            }
        }
        return false;
    }
}

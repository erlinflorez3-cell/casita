package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class vg {
    public static final void a(Object obj, Function0 function0) {
        try {
            function0.invoke();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new ug(obj), 4, (Object) null);
        }
    }
}

package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public interface h00 {
    static void a(h00 h00Var, long j2, long j3) {
        tf tfVar = (tf) h00Var;
        if (tfVar.f1843f.w()) {
            tfVar.a(new mn(tfVar.f1843f, tfVar.f1842e.getBaseUrlForRequests(), j2, j3, tfVar.f1839b, 0));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) mf.f1285a, 6, (Object) null);
        }
    }
}

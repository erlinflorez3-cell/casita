package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class df0 {
    public static boolean a(g10 triggerEvent, bh0 action, long j2, long j3) {
        long j4;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(action, "action");
        if (triggerEvent instanceof od0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, cg0.f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ze0.f2389a, 14, (Object) null);
            return true;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        g90 g90Var = action.f281b;
        long j5 = jNowInSeconds + ((long) g90Var.f732d);
        int i2 = g90Var.f735g;
        if (i2 != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, cg0.f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new af0(i2), 14, (Object) null);
            j4 = j2 + ((long) i2);
        } else {
            j4 = j2 + j3;
        }
        if (j5 >= j4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, cg0.f347q, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new bf0(j5, j4), 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, cg0.f347q, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new cf0(j3, j4, j5), 12, (Object) null);
        return false;
    }
}

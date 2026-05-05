package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iq extends uu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(k00 destination, cs dispatchDataProvider) {
        super(destination, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hq(destination), 7, (Object) null);
    }

    @Override // bo.app.uu
    public final void a(long j2) {
    }
}

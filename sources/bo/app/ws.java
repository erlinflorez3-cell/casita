package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ws extends FunctionReferenceImpl implements Function1 {
    public ws(Object obj) {
        super(1, obj, xs.class, "ingestDustMessages", "ingestDustMessages(Lcom/braze/models/dust/IDustMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t00 p02 = (t00) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        xs xsVar = (xs) this.receiver;
        xsVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) xsVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new rs(p02), 7, (Object) null);
        int iA = p02.a();
        if (ps.f1547a[gc0.a(iA)] == 1) {
            ((vw) xsVar.f2239b).b(am.class, new am());
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) xsVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ss(iA), 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}

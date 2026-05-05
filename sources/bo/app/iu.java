package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iu implements c10 {

    /* JADX INFO: renamed from: a */
    public final v00 f931a;

    /* JADX INFO: renamed from: b */
    public final h00 f932b;

    public iu(vw internalEventPublisher, h00 brazeManager) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f931a = internalEventPublisher;
        this.f932b = brazeManager;
        new ArrayList();
    }

    public /* synthetic */ iu(vw vwVar, h00 h00Var, int i2) {
        this(vwVar, h00Var);
    }

    @Override // bo.app.c10
    public final void a(z80 requestInfo, a80 requestDispatchCallback, boolean z2) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        l00 l00Var = requestInfo.f2363a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hu(l00Var), 7, (Object) null);
        s50 s50Var = new s50(l00Var, new w00(201, MapsKt.emptyMap(), 4), this.f932b);
        v00 v00Var = this.f931a;
        l00Var.a(v00Var, v00Var, s50Var);
        l00Var.a(this.f931a);
        requestDispatchCallback.a(s50Var);
        ((vw) this.f931a).b(es.class, new es(l00Var));
    }
}

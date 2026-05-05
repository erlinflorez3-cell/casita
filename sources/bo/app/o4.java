package bo.app;

import com.braze.Braze;
import com.braze.events.InAppMessageEvent;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageEvent f1417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Braze braze, InAppMessageEvent inAppMessageEvent) {
        super(0);
        this.f1416a = braze;
        this.f1417b = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        cg0 cg0Var = ((ci0) this.f1416a.getUdm$android_sdk_base_release()).f404w;
        k10 action = this.f1417b.getTriggerAction();
        cg0Var.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, cg0.f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new nf0(action), 14, (Object) null);
        long j2 = cg0Var.f359l;
        cg0Var.f359l = cg0Var.f360m;
        cg0Var.f360m = j2;
        BrazeLogger.brazelog$default(brazeLogger, (Object) cg0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new kf0(j2), 7, (Object) null);
        cg0Var.f359l = 0L;
        cg0Var.f355h.b(action);
        return Unit.INSTANCE;
    }
}

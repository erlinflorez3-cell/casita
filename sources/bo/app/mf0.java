package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class mf0 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k10 f1286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cg0 f1287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g10 f1288c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f1289d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f1290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(k10 k10Var, cg0 cg0Var, g10 g10Var, long j2, long j3, Continuation continuation) {
        super(1, continuation);
        this.f1286a = k10Var;
        this.f1287b = cg0Var;
        this.f1288c = g10Var;
        this.f1289d = j2;
        this.f1290e = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new mf0(this.f1286a, this.f1287b, this.f1288c, this.f1289d, this.f1290e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((mf0) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, cg0.f347q, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lf0(this.f1290e), 14, (Object) null);
        k10 k10Var = this.f1286a;
        cg0 cg0Var = this.f1287b;
        k10Var.a(cg0Var.f348a, cg0Var.f350c, this.f1288c, this.f1289d);
        return Unit.INSTANCE;
    }
}

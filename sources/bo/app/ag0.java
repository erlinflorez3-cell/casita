package bo.app;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ag0 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k10 f200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cg0 f201b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g10 f202c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(k10 k10Var, cg0 cg0Var, g10 g10Var, long j2, Continuation continuation) {
        super(1, continuation);
        this.f200a = k10Var;
        this.f201b = cg0Var;
        this.f202c = g10Var;
        this.f203d = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ag0(this.f200a, this.f201b, this.f202c, this.f203d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ag0) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        k10 k10Var = this.f200a;
        cg0 cg0Var = this.f201b;
        k10Var.a(cg0Var.f348a, cg0Var.f350c, this.f202c, this.f203d);
        return Unit.INSTANCE;
    }
}

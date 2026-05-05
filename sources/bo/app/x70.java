package bo.app;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class x70 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y70 f2188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z80 f2189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a80 f2190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(y70 y70Var, z80 z80Var, a80 a80Var, Continuation continuation) {
        super(2, continuation);
        this.f2188a = y70Var;
        this.f2189b = z80Var;
        this.f2190c = a80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x70(this.f2188a, this.f2189b, this.f2190c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x70) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f2188a.a(this.f2189b, this.f2190c);
        return Unit.INSTANCE;
    }
}

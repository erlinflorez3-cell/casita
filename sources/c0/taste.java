package c0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: classes4.dex */
public final class taste extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ misplace f2486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0.pair f2487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taste(misplace misplaceVar, k0.pair pairVar, Continuation continuation) {
        super(2, continuation);
        this.f2486b = misplaceVar;
        this.f2487c = pairVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new taste(this.f2486b, this.f2487c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new taste(this.f2486b, this.f2487c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f2485a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            misplace misplaceVar = this.f2486b;
            k0.pair pairVar = this.f2487c;
            this.f2485a = 1;
            misplaceVar.getClass();
            Object objSupervisorScope = SupervisorKt.supervisorScope(new apparatus(misplaceVar, pairVar, null), this);
            if (objSupervisorScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objSupervisorScope = Unit.INSTANCE;
            }
            if (objSupervisorScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f2486b.f2480o = null;
        return Unit.INSTANCE;
    }
}

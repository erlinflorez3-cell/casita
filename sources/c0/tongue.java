package c0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f2488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ misplace f2489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k0.pair f2490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(misplace misplaceVar, k0.pair pairVar, Continuation continuation) {
        super(2, continuation);
        this.f2489b = misplaceVar;
        this.f2490c = pairVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new tongue(this.f2489b, this.f2490c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tongue(this.f2489b, this.f2490c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f2488a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            g.tongue tongueVar = this.f2489b.f2469d;
            if (tongueVar != null) {
                k0.pair pairVar = this.f2490c;
                this.f2488a = 1;
                obj = tongueVar.a(pairVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        i0.tongue tongueVar2 = (i0.tongue) obj;
        if (tongueVar2 != null) {
            misplace misplaceVar = this.f2489b;
            t.misplace misplaceVar2 = misplaceVar.f2478m;
            r0.apparatus apparatusVar = misplaceVar.f2466a;
            String str = tongueVar2.f19708b;
            if (str == null) {
                str = (String) apparatusVar.f28260b.invoke();
            }
            apparatusVar.f28263e = str;
            misplaceVar2.a(new k0.pair(apparatusVar.f28261c, apparatusVar.f28262d, str, apparatusVar.f28264f, apparatusVar.f28259a), tongueVar2);
        }
        return Unit.INSTANCE;
    }
}

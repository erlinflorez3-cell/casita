package v;

import f.misplace;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class pair extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f28345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ civilian f28346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f.civilian f28347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pair(civilian civilianVar, f.civilian civilianVar2, Continuation continuation) {
        super(2, continuation);
        this.f28346b = civilianVar;
        this.f28347c = civilianVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new pair(this.f28346b, this.f28347c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pair(this.f28346b, this.f28347c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f28345a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            misplace misplaceVar = this.f28346b.f28339c;
            f.civilian civilianVar = this.f28347c;
            this.f28345a = 1;
            obj = misplaceVar.a(civilianVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        i0.pair pairVar = (i0.pair) obj;
        if (pairVar != null) {
            civilian civilianVar2 = this.f28346b;
            t.misplace misplaceVar2 = civilianVar2.f28340d;
            r0.apparatus apparatusVar = civilianVar2.f28338b;
            String str = pairVar.f19696b;
            if (str == null) {
                str = (String) apparatusVar.f28260b.invoke();
            }
            apparatusVar.f28263e = str;
            misplaceVar2.a(new k0.pair(apparatusVar.f28261c, apparatusVar.f28262d, str, apparatusVar.f28264f, apparatusVar.f28259a), pairVar);
        }
        return Unit.INSTANCE;
    }
}

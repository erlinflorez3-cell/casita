package a0;

import android.location.Location;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import t.misplace;

/* JADX INFO: loaded from: classes.dex */
public final class tongue extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f85a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ taste f86b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Location f87c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(taste tasteVar, Location location, Continuation continuation) {
        super(2, continuation);
        this.f86b = tasteVar;
        this.f87c = location;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new tongue(this.f86b, this.f87c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tongue(this.f86b, this.f87c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f85a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            l.tongue tongueVar = this.f86b.f80b;
            this.f85a = 1;
            obj = tongueVar.a(false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        n0.pair pairVar = new n0.pair(this.f87c, (f0.tongue) obj);
        taste tasteVar = this.f86b;
        misplace misplaceVar = tasteVar.f81c;
        r0.apparatus apparatusVar = tasteVar.f79a;
        String str = (String) apparatusVar.f28260b.invoke();
        apparatusVar.f28263e = str;
        misplaceVar.a(new k0.pair(apparatusVar.f28261c, apparatusVar.f28262d, str, apparatusVar.f28264f, apparatusVar.f28259a), pairVar);
        return Unit.INSTANCE;
    }
}

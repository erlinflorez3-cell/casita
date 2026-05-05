package z;

import d0.slide;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import r0.apparatus;
import t.misplace;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f28497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tongue f28498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(tongue tongueVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f28498b = tongueVar;
        this.f28499c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new superior(this.f28498b, this.f28499c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new superior(this.f28498b, this.f28499c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f28497a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            l.tongue tongueVar = this.f28498b.f28502c;
            this.f28497a = 1;
            obj = tongueVar.a(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        tongue tongueVar2 = this.f28498b;
        misplace misplaceVar = tongueVar2.f28501b;
        slide slideVar = new slide(this.f28499c, (f0.tongue) obj);
        apparatus apparatusVar = tongueVar2.f28500a;
        String str = (String) apparatusVar.f28260b.invoke();
        apparatusVar.f28263e = str;
        misplaceVar.a(new k0.pair(apparatusVar.f28261c, apparatusVar.f28262d, str, apparatusVar.f28264f, apparatusVar.f28259a), slideVar);
        return Unit.INSTANCE;
    }
}

package b0;

import android.app.Activity;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ taste f153b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f154c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(taste tasteVar, Activity activity, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f153b = tasteVar;
        this.f154c = activity;
        this.f155d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new tongue(this.f153b, this.f154c, this.f155d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tongue) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f152a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f152a = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        taste tasteVar = this.f153b;
        LinkedHashMap linkedHashMap = tasteVar.f148g;
        Activity activity = this.f154c;
        boolean z2 = this.f155d;
        synchronized (linkedHashMap) {
            zA = taste.a(tasteVar, activity, z2);
        }
        if (zA) {
            taste tasteVar2 = this.f153b;
            BuildersKt__Builders_commonKt.launch$default(tasteVar2.f145d, null, null, new civilian(tasteVar2, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}

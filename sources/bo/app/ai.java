package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ai extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci f210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ci ciVar, Continuation continuation) {
        super(2, continuation);
        this.f210b = ciVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ai(this.f210b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ai(this.f210b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f209a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long j2 = ci.f368n;
            this.f209a = 1;
            if (DelayKt.delay(j2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, ci.f367m, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) zh.f2398a, 14, (Object) null);
        Braze.Companion.getInstance(this.f210b.f370a).requestImmediateDataFlush();
        return Unit.INSTANCE;
    }
}

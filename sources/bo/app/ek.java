package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ek extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f580a = brazeUser;
        this.f581b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ek(this.f580a, this.f581b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ek(this.f580a, this.f581b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f580a.userCache;
        String str = this.f581b;
        synchronized (uh0Var) {
            uh0Var.b("last_name", str);
        }
        return Unit.INSTANCE;
    }
}

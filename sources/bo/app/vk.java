package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class vk extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f2052a = brazeUser;
        this.f2053b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vk(this.f2052a, this.f2053b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vk(this.f2052a, this.f2053b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f2052a.userCache;
        String str = this.f2053b;
        synchronized (uh0Var) {
            uh0Var.f1949f = str;
            uh0Var.b("user_id", str);
        }
        return Unit.INSTANCE;
    }
}

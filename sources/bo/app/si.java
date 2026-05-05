package bo.app;

import com.appsflyer.AdRevenueScheme;
import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class si extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f1773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f1773a = brazeUser;
        this.f1774b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new si(this.f1773a, this.f1774b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new si(this.f1773a, this.f1774b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f1773a.userCache;
        String str = this.f1774b;
        synchronized (uh0Var) {
            uh0Var.b(AdRevenueScheme.COUNTRY, str);
        }
        return Unit.INSTANCE;
    }
}

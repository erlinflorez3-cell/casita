package bo.app;

import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class pj extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f1521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f1522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, Continuation continuation) {
        super(2, continuation);
        this.f1521a = brazeUser;
        this.f1522b = notificationSubscriptionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new pj(this.f1521a, this.f1522b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pj(this.f1521a, this.f1522b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f1521a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.f1522b;
        synchronized (uh0Var) {
            uh0Var.b("email_subscribe", notificationSubscriptionType != null ? notificationSubscriptionType.forJsonPut() : null);
        }
        return Unit.INSTANCE;
    }
}

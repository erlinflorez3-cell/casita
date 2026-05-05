package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b20 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(InAppMessageBase inAppMessageBase, Continuation continuation) {
        super(2, continuation);
        this.f236a = inAppMessageBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b20(this.f236a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b20(this.f236a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h00 brazeManager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f236a.clickLogged.get() && (brazeManager = this.f236a.getBrazeManager()) != null) {
            e20 triggerEvent = new e20(this.f236a.getTriggerId());
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            ((vw) ((tf) brazeManager).f1841d).b(xe0.class, new xe0(triggerEvent));
        }
        return Unit.INSTANCE;
    }
}

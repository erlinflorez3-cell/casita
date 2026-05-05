package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a20 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h00 f166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(String str, InAppMessageBase inAppMessageBase, h00 h00Var, Continuation continuation) {
        super(2, continuation);
        this.f164a = str;
        this.f165b = inAppMessageBase;
        this.f166c = h00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a20(this.f164a, this.f165b, this.f166c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a20) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z9 z9Var = ba.f257g;
        String triggerId = this.f164a;
        String messageExtras = this.f165b.getMessageExtras();
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        e00 e00VarA = z9Var.a(new i9(triggerId, messageExtras));
        if (e00VarA != null) {
            ((tf) this.f166c).a(e00VarA);
        }
        return Unit.INSTANCE;
    }
}

package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class w10 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h00 f2095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(String str, h00 h00Var, Continuation continuation) {
        super(2, continuation);
        this.f2094b = str;
        this.f2095c = h00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        w10 w10Var = new w10(this.f2094b, this.f2095c, continuation);
        w10Var.f2093a = obj;
        return w10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w10) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f2093a, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) v10.f1992a, 6, (Object) null);
        z9 z9Var = ba.f257g;
        String triggerId = this.f2094b;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        e00 e00VarA = z9Var.a(new g9(triggerId));
        if (e00VarA != null) {
            ((tf) this.f2095c).a(e00VarA);
        }
        return Unit.INSTANCE;
    }
}

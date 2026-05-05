package bo.app;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class io extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zo f927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(zo zoVar, Intent intent, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.f927b = zoVar;
        this.f928c = intent;
        this.f929d = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        io ioVar = new io(this.f927b, this.f928c, this.f929d, continuation);
        ioVar.f926a = obj;
        return ioVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((io) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f926a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) go.f768a, 6, (Object) null);
        try {
            zo zoVar = this.f927b;
            z40 z40Var = zoVar.f2419j;
            zoVar.f2419j = com.braze.support.c.a(this.f928c, zoVar.f2418i);
            zo zoVar2 = this.f927b;
            z40 z40Var2 = zoVar2.f2419j;
            if (z40Var != z40Var2) {
                ((vw) zoVar2.f2411b).b(a50.class, new a50(z40Var, z40Var2));
            }
            this.f927b.a();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ho.f841a, 4, (Object) null);
            zo zoVar3 = this.f927b;
            v00 v00Var = zoVar3.f2411b;
            zoVar3.getClass();
            try {
                ((vw) v00Var).b(Throwable.class, e2);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) zoVar3, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) oo.f1455a, 4, (Object) null);
            }
        }
        this.f929d.finish();
        return Unit.INSTANCE;
    }
}

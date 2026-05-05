package p;

import android.os.SystemClock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ civilian f28208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(civilian civilianVar, Continuation continuation) {
        super(2, continuation);
        this.f28208a = civilianVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new apparatus(this.f28208a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new apparatus(this.f28208a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        civilian civilianVar = this.f28208a;
        boolean z2 = jElapsedRealtime - civilianVar.f28212d > 500;
        civilianVar.f28212d = jElapsedRealtime;
        j0.pair pairVar = new j0.pair(null, null, null, null, Boxing.boxBoolean(z2 ? civilianVar.f28210b : true), Boxing.boxBoolean(z2 ? this.f28208a.f28211c : false));
        civilian civilianVar2 = this.f28208a;
        civilianVar2.f28210b = false;
        civilianVar2.f28211c = false;
        return pairVar;
    }
}

package c0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class apparatus extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ misplace f2452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0.pair f2453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(misplace misplaceVar, k0.pair pairVar, Continuation continuation) {
        super(2, continuation);
        this.f2452b = misplaceVar;
        this.f2453c = pairVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        apparatus apparatusVar = new apparatus(this.f2452b, this.f2453c, continuation);
        apparatusVar.f2451a = obj;
        return apparatusVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((apparatus) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f2451a;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new superior(this.f2452b, this.f2453c, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new tongue(this.f2452b, this.f2453c, null), 3, null);
    }
}

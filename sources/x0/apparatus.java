package x0;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public abundant f28432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public abundant f28433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ abundant f28435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(abundant abundantVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28435d = abundantVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28434c = obj;
        this.f28436e |= Integer.MIN_VALUE;
        Object objA = this.f28435d.a(this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.m8979boximpl(objA);
    }
}

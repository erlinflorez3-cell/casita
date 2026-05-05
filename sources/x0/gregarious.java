package x0;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class gregarious extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public abundant f28441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0.pair f28442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0.pair f28443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public abundant f28444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ abundant f28446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28447g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gregarious(abundant abundantVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28446f = abundantVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28445e = obj;
        this.f28447g |= Integer.MIN_VALUE;
        Object objA = this.f28446f.a((k0.pair) null, (d0.pair) null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.m8979boximpl(objA);
    }
}

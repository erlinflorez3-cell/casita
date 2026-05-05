package x0;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import y0.absolute;

/* JADX INFO: loaded from: classes2.dex */
public final class taste extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public abundant f28456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0.pair f28457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ abundant f28460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taste(abundant abundantVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28460e = abundantVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28459d = obj;
        int i2 = this.f28461f;
        this.f28461f = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        Object objA = this.f28460e.a((k0.pair) null, (absolute) null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.m8979boximpl(objA);
    }
}

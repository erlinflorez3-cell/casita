package w0;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class pair extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28396b;

    public pair(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28395a = obj;
        int i2 = this.f28396b;
        this.f28396b = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        Object objA = civilian.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.m8979boximpl(objA);
    }
}

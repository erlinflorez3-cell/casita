package w0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class wrap extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public fling f28408a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fling f28410c;

    /* JADX INFO: renamed from: d */
    public int f28411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrap(fling flingVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28410c = flingVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28409b = obj;
        int i2 = this.f28411d;
        this.f28411d = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.f28410c.a((fabricate) null, this);
    }
}

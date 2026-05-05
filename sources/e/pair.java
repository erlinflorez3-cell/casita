package e;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class pair extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public superior f18441a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18442b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ superior f18443c;

    /* JADX INFO: renamed from: d */
    public int f18444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pair(superior superiorVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18443c = superiorVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18442b = obj;
        int i2 = this.f18444d;
        this.f18444d = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.f18443c.a(this);
    }
}

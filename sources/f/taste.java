package f;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class taste extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f18509a;

    /* JADX INFO: renamed from: b */
    public civilian f18510b;

    /* JADX INFO: renamed from: c */
    public boolean f18511c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18512d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ misplace f18513e;

    /* JADX INFO: renamed from: f */
    public int f18514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taste(misplace misplaceVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18513e = misplaceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18512d = obj;
        this.f18514f = (-1) - (((-1) - this.f18514f) & ((-1) - Integer.MIN_VALUE));
        return this.f18513e.a(null, this);
    }
}

package bo.app;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ht extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public fu f851a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fu f853c;

    /* JADX INFO: renamed from: d */
    public int f854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(fu fuVar, Continuation continuation) {
        super(continuation);
        this.f853c = fuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f852b = obj;
        int i2 = this.f854d;
        this.f854d = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return fu.a(this.f853c, this);
    }
}

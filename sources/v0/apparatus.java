package v0;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Mutex f28351a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ civilian f28353c;

    /* JADX INFO: renamed from: d */
    public int f28354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(civilian civilianVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28353c = civilianVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28352b = obj;
        this.f28354d |= Integer.MIN_VALUE;
        return this.f28353c.a(this);
    }
}

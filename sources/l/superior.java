package l;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class superior extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f19848a;

    /* JADX INFO: renamed from: b */
    public Object f19849b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19850c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tongue f19851d;

    /* JADX INFO: renamed from: e */
    public int f19852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(tongue tongueVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19851d = tongueVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19850c = obj;
        this.f19852e |= Integer.MIN_VALUE;
        return this.f19851d.a(false, this);
    }
}

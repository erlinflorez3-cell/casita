package g;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class superior extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f19643a;

    /* JADX INFO: renamed from: b */
    public Object f19644b;

    /* JADX INFO: renamed from: c */
    public String f19645c;

    /* JADX INFO: renamed from: d */
    public String f19646d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19647e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tongue f19648f;

    /* JADX INFO: renamed from: g */
    public int f19649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(tongue tongueVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19648f = tongueVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19647e = obj;
        this.f19649g |= Integer.MIN_VALUE;
        return this.f19648f.a((k0.pair) null, this);
    }
}

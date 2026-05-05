package p;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tongue f28233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(tongue tongueVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28233c = tongueVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28232b = obj;
        this.f28234d |= Integer.MIN_VALUE;
        return this.f28233c.a(this);
    }
}

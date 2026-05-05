package t;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class civilian extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public misplace f28298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f28299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f28300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tongue f28301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f28302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f28303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f28304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d0.pair f28305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public misplace f28306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f28308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ misplace f28309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civilian(misplace misplaceVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28309l = misplaceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28308k = obj;
        int i2 = this.f28310m;
        this.f28310m = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.f28309l.a((HashMap) null, this);
    }
}

package c0;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class civilian extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public misplace f2454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f2457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f2460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ misplace f2464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civilian(misplace misplaceVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2464k = misplaceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2463j = obj;
        int i2 = this.f2465l;
        this.f2465l = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return misplace.a(this.f2464k, null, null, this);
    }
}

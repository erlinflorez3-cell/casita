package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qd0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(int i2, int i3) {
        super(0);
        this.f1596a = i2;
        this.f1597b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "TokenBucketRateLimiter updated with new capacity: " + this.f1596a + " and refill rate: " + this.f1597b;
    }
}

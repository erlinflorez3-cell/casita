package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tg0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(k10 k10Var, long j2) {
        super(0);
        this.f1868a = k10Var;
        this.f1869b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Updating re-eligibility for action Id " + ((bh0) this.f1868a).f280a + " to time " + this.f1869b + '.';
    }
}

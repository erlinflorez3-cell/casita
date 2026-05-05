package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class og0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og0(k10 k10Var) {
        super(0);
        this.f1444a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Triggered action id "), ((bh0) this.f1444a).f280a, " always eligible via configuration. Returning true for eligibility status");
    }
}

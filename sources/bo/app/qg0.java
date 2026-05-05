package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qg0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(k10 k10Var) {
        super(0);
        this.f1603a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Triggered action id "), ((bh0) this.f1603a).f280a, " no longer eligible due to having been triggered in the past and is only eligible once.");
    }
}

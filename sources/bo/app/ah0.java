package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ah0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bh0 f207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g10 f208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah0(bh0 bh0Var, g10 g10Var) {
        super(0);
        this.f207a = bh0Var;
        this.f208b = g10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Triggered action " + this.f207a.f280a + " not eligible to be triggered by " + this.f208b.a() + " event. Current device time outside triggered action time window.";
    }
}

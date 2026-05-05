package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ub0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb0 f1930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(fb0 fb0Var) {
        super(0);
        this.f1930a = fb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Finishing updating server config to " + this.f1930a;
    }
}

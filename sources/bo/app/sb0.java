package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sb0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vb0 f1757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(vb0 vb0Var) {
        super(0);
        this.f1757a = vb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Finishing updating server config to " + this.f1757a.f2036d;
    }
}

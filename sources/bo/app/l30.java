package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class l30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10 f1157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(g10 g10Var) {
        super(0);
        this.f1157a = g10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot perform triggered action for " + this.f1157a + " due to in-app message json being null";
    }
}

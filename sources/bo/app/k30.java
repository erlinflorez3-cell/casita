package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class k30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q30 f1069a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(q30 q30Var) {
        super(0);
        this.f1069a = q30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Attempting to publish in-app message after delay of " + this.f1069a.f281b.f732d + " seconds.";
    }
}

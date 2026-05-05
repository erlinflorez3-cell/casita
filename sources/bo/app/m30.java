package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10 f1250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(g10 g10Var) {
        super(0);
        this.f1250a = g10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot perform triggered action for " + this.f1250a + " due to deserialized in-app message being null";
    }
}

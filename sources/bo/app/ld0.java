package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ld0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ md0 f1189a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(md0 md0Var) {
        super(0);
        this.f1189a = md0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Posting templating request after delay of " + this.f1189a.f281b.f732d + " seconds.";
    }
}

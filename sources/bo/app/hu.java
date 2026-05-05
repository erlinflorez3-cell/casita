package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hu extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l00 f855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(l00 l00Var) {
        super(0);
        this.f855a = l00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Short circuiting execution of network request (" + this.f855a.hashCode() + ") and immediately marking it as succeeded.";
    }
}

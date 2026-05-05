package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ns extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a50 f1395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns(a50 a50Var) {
        super(0);
        this.f1395a = a50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Got network change event: " + this.f1395a;
    }
}

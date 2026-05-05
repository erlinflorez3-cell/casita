package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(dh0 dh0Var) {
        super(0);
        this.f1859a = dh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Retrieving templated triggered action id "), ((bh0) this.f1859a).f280a, " from local storage.");
    }
}

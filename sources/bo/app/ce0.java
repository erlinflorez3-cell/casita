package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ce0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(k10 k10Var) {
        super(0);
        this.f340a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Pre-fetch off for triggered action "), ((bh0) this.f340a).f280a, ". Not pre-fetching assets.");
    }
}

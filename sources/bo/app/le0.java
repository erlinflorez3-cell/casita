package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class le0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1191a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le0(k10 k10Var) {
        super(0);
        this.f1191a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: " + ((bh0) this.f1191a).f280a;
    }
}

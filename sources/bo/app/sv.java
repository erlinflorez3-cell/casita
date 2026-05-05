package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sv extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f1790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(k10 k10Var) {
        super(0);
        this.f1790a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not publish in-app message with trigger action id: " + ((bh0) this.f1790a).f280a;
    }
}

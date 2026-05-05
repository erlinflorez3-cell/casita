package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class po extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zo f1527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(zo zoVar) {
        super(0);
        this.f1527a = zoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "recalculateDispatchState called with session state: " + fc0.a(this.f1527a.f2415f) + " lastNetworkLevel: " + this.f1527a.f2419j;
    }
}

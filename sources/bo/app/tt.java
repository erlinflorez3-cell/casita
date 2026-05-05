package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu f1890a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(fu fuVar) {
        super(0);
        this.f1890a = fuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not restarting stream since " + this.f1890a.f687a + " is still active.";
    }
}

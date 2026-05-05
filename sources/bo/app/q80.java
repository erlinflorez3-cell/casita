package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class q80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(n nVar) {
        super(0);
        this.f1585a = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Shutdown sync got error response: " + this.f1585a;
    }
}

package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rs extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t00 f1704a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(t00 t00Var) {
        super(0);
        this.f1704a = t00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Ingesting DUST message\n" + this.f1704a;
    }
}

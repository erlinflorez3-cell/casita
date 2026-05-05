package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mu extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f1318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(long j2, z80 z80Var) {
        super(0);
        this.f1318a = z80Var;
        this.f1319b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Marking request as framework complete \n" + this.f1318a.a(this.f1319b);
    }
}

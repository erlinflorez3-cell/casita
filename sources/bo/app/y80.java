package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z80 f2288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f2289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(long j2, z80 z80Var) {
        super(0);
        this.f2288a = z80Var;
        this.f2289b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Moving to pending retry.Updated retry count: " + this.f2288a.f2370h + " for: \n" + this.f2288a.a(this.f2289b);
    }
}

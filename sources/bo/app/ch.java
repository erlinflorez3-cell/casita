package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ch extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fb0 f364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(ih ihVar, fb0 fb0Var) {
        super(0);
        this.f363a = ihVar;
        this.f364b = fb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f363a.f910d.a(this.f364b);
        ((vw) this.f363a.f907a).b(gb0.class, new gb0(this.f364b));
        fb0 serverConfig = this.f364b;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        r90 r90Var = new r90(serverConfig.b(), serverConfig.c(), serverConfig.a(), serverConfig.d(), serverConfig.e(), serverConfig.f());
        ((vw) this.f363a.f907a).b(x90.class, new x90(r90Var));
        return Unit.INSTANCE;
    }
}

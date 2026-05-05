package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class co extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z80 f416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(z80 z80Var, long j2, z80 z80Var2) {
        super(0);
        this.f414a = z80Var;
        this.f415b = j2;
        this.f416c = z80Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Batched request " + this.f414a.a(this.f415b) + " and combined into " + this.f416c.a(this.f415b);
    }
}

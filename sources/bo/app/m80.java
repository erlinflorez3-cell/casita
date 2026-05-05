package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z80 f1266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(long j2, z80 z80Var) {
        super(0);
        this.f1265a = j2;
        this.f1266b = z80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Running at " + this.f1265a + " for request " + this.f1266b.a(this.f1265a);
    }
}

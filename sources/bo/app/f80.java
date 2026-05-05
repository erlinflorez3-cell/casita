package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(long j2, z80 z80Var) {
        super(0);
        this.f625a = z80Var;
        this.f626b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Request success received for " + this.f625a.a(this.f626b);
    }
}

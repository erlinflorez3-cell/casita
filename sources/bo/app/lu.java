package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class lu extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f1209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(z80 z80Var, long j2, int i2) {
        super(0);
        this.f1209a = z80Var;
        this.f1210b = j2;
        this.f1211c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Set retry count for " + this.f1209a.a(this.f1210b) + " to " + this.f1211c;
    }
}

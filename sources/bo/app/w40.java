package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w40 extends zb0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(cc0 sessionId, double d2, Double d3, boolean z2) {
        super(sessionId, d2, d3, z2);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    @Override // bo.app.zb0
    public final void a(Double d2) {
        this.f2377c = d2;
    }

    @Override // bo.app.zb0
    public final Double c() {
        return this.f2377c;
    }

    @Override // bo.app.zb0
    public final String toString() {
        return "\nMutableSession(sessionId=" + this.f2375a + ", startTime=" + this.f2376b + ", endTime=" + this.f2377c + ", isSealed=" + this.f2378d + ", duration=" + b() + ')';
    }
}

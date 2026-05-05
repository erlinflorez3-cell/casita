package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y90 extends uu {

    /* JADX INFO: renamed from: l */
    public final boolean f2291l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(cs dispatchDataProvider) {
        super(k00.SDK_DEBUGGER_INIT, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f2291l = true;
    }

    @Override // bo.app.uu
    public final void a(long j2) {
        b(j2);
    }

    @Override // bo.app.uu
    public final void a(long j2, z80 requestInfo, n apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j2, requestInfo, apiResponse);
        requestInfo.a(j2, a90.COMPLETE);
    }

    @Override // bo.app.uu
    public final boolean d() {
        return this.f2291l;
    }
}

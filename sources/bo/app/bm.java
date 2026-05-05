package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bm extends uu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(cs dispatchDataProvider) {
        super(k00.CONTENT_CARD_SYNC, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // bo.app.uu
    public final void a(long j2) {
        b(j2);
    }

    @Override // bo.app.uu
    public final void a(long j2, z80 requestInfo, s50 apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j2, requestInfo, apiResponse);
        Long l2 = apiResponse.f1328b;
        if (l2 != null) {
            requestInfo.f2364b = l2.longValue() + j2;
            requestInfo.a(j2, a90.PENDING_RETRY);
            l00 l00Var = requestInfo.f2363a;
            mn mnVar = l00Var instanceof mn ? (mn) l00Var : null;
            if (mnVar == null) {
                return;
            }
            mnVar.f1306l = requestInfo.f2370h;
        }
    }
}

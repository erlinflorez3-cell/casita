package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tx extends uu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(cs dispatchDataProvider) {
        super(k00.FEATURE_FLAG_SYNC, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // bo.app.uu
    public final void a(long j2) {
        b(j2);
    }
}

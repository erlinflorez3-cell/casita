package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ty implements m00 {
    @Override // bo.app.m00
    public final e00 a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new sy(cardId), 6, (Object) null);
        return null;
    }

    @Override // bo.app.m00
    public final e00 b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        z9 z9Var = ba.f257g;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return z9Var.a(new b9(cardId));
    }

    @Override // bo.app.m00
    public final e00 c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ry(cardId), 6, (Object) null);
        return null;
    }

    @Override // bo.app.m00
    public final e00 d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        z9 z9Var = ba.f257g;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return z9Var.a(new c9(cardId));
    }
}

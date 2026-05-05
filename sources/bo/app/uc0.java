package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uc0 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(String message, Exception innerException) {
        super(message, innerException);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(innerException, "innerException");
    }
}

package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x40 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

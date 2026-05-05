package bo.app;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bc0 {
    public static cc0 a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        UUID uuidFromString = UUID.fromString(sessionId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(sessionId)");
        return new cc0(uuidFromString);
    }
}

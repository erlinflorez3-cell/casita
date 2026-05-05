package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cc0 implements IPutIntoJson {

    /* JADX INFO: renamed from: a */
    public final UUID f334a;

    /* JADX INFO: renamed from: b */
    public final String f335b;

    public cc0(UUID sessionIdUuid) {
        Intrinsics.checkNotNullParameter(sessionIdUuid, "sessionIdUuid");
        this.f334a = sessionIdUuid;
        String string = sessionIdUuid.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sessionIdUuid.toString()");
        this.f335b = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc0) && Intrinsics.areEqual(this.f334a, ((cc0) obj).f334a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f335b;
    }

    public final int hashCode() {
        return this.f334a.hashCode();
    }

    public final String toString() {
        return this.f335b;
    }
}

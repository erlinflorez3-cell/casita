package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2357b;

    public z60(String id, long j2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f2356a = id;
        this.f2357b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z60)) {
            return false;
        }
        z60 z60Var = (z60) obj;
        return Intrinsics.areEqual(this.f2356a, z60Var.f2356a) && this.f2357b == z60Var.f2357b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2357b) + (this.f2356a.hashCode() * 31);
    }

    public final String toString() {
        return "CampaignData(id=" + this.f2356a + ", timestamp=" + this.f2357b + ')';
    }
}

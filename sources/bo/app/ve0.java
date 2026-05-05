package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ve0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e00 f2042b;

    public ve0(String campaignId, e00 pushClickEvent) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pushClickEvent, "pushClickEvent");
        this.f2041a = campaignId;
        this.f2042b = pushClickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve0)) {
            return false;
        }
        ve0 ve0Var = (ve0) obj;
        return Intrinsics.areEqual(this.f2041a, ve0Var.f2041a) && Intrinsics.areEqual(this.f2042b, ve0Var.f2042b);
    }

    public final int hashCode() {
        return this.f2042b.hashCode() + (this.f2041a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f2041a + ", pushClickEvent=" + this.f2042b + ')';
    }
}

package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g10 f365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k10 f366b;

    public ch0(g10 originalTriggerEvent, md0 failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(originalTriggerEvent, "originalTriggerEvent");
        Intrinsics.checkNotNullParameter(failedTriggeredAction, "failedTriggeredAction");
        this.f365a = originalTriggerEvent;
        this.f366b = failedTriggeredAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0)) {
            return false;
        }
        ch0 ch0Var = (ch0) obj;
        return Intrinsics.areEqual(this.f365a, ch0Var.f365a) && Intrinsics.areEqual(this.f366b, ch0Var.f366b);
    }

    public final int hashCode() {
        return this.f366b.hashCode() + (this.f365a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f365a + ", failedTriggeredAction=" + this.f366b + ')';
    }
}

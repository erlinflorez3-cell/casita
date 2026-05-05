package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g10 f2208a;

    public xe0(e20 triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f2208a = triggerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe0) && Intrinsics.areEqual(this.f2208a, ((xe0) obj).f2208a);
    }

    public final int hashCode() {
        return this.f2208a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f2208a + ')';
    }
}

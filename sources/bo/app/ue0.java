package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ue0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f1937a;

    public ue0(l00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f1937a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue0) && Intrinsics.areEqual(this.f1937a, ((ue0) obj).f1937a);
    }

    public final int hashCode() {
        return this.f1937a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f1937a + ')';
    }
}

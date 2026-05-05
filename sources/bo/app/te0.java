package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class te0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f1836a;

    public te0(l00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f1836a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te0) && Intrinsics.areEqual(this.f1836a, ((te0) obj).f1836a);
    }

    public final int hashCode() {
        return this.f1836a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f1836a + ')';
    }
}

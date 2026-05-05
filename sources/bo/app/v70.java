package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f2006a;

    public v70(l00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f2006a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v70) && Intrinsics.areEqual(this.f2006a, ((v70) obj).f2006a);
    }

    public final int hashCode() {
        return this.f2006a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.f2006a + ')';
    }
}

package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f2109a;

    public w70(l00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f2109a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w70) && Intrinsics.areEqual(this.f2109a, ((w70) obj).f2109a);
    }

    public final int hashCode() {
        return this.f2109a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.f2109a + ')';
    }
}

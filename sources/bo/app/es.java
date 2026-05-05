package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class es {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f589a;

    public es(l00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f589a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es) && Intrinsics.areEqual(this.f589a, ((es) obj).f589a);
    }

    public final int hashCode() {
        return this.f589a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.f589a + ')';
    }
}

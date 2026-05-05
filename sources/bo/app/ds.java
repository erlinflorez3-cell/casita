package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f516a;

    public ds(l00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f516a = request;
        request.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds) && Intrinsics.areEqual(this.f516a, ((ds) obj).f516a);
    }

    public final int hashCode() {
        return this.f516a.hashCode();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.f516a + ')';
    }
}

package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jy {

    /* JADX INFO: renamed from: a */
    public final ny f1039a;

    public jy(ny request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f1039a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy) && Intrinsics.areEqual(this.f1039a, ((jy) obj).f1039a);
    }

    public final int hashCode() {
        return this.f1039a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.f1039a + ')';
    }
}

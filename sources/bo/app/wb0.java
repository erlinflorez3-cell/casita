package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10 f2127a;

    public wb0(d10 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        this.f2127a = responseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb0) && Intrinsics.areEqual(this.f2127a, ((wb0) obj).f2127a);
    }

    public final int hashCode() {
        return this.f2127a.hashCode();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f2127a + ')';
    }
}

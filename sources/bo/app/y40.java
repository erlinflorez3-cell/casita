package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y40 implements d10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f2267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w00 f2268b;

    public y40(l00 originalRequest, w00 connectionResult) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f2267a = originalRequest;
        this.f2268b = connectionResult;
    }

    @Override // bo.app.d10
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y40)) {
            return false;
        }
        y40 y40Var = (y40) obj;
        return Intrinsics.areEqual(this.f2267a, y40Var.f2267a) && Intrinsics.areEqual("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && Intrinsics.areEqual(this.f2268b, y40Var.f2268b);
    }

    public final int hashCode() {
        return this.f2268b.hashCode() + (((this.f2267a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.f2267a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.f2268b + ')';
    }
}

package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements d10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l00 f1798b;

    public t(String str, l00 originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f1797a = str;
        this.f1798b = originalRequest;
    }

    @Override // bo.app.d10
    public final String a() {
        return this.f1797a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f1797a, tVar.f1797a) && Intrinsics.areEqual(this.f1798b, tVar.f1798b);
    }

    public final int hashCode() {
        String str = this.f1797a;
        return this.f1798b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.f1797a + ", originalRequest=" + this.f1798b + ')';
    }
}

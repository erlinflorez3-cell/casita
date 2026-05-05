package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x30 implements d10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l00 f2181b;

    public x30(String str, l00 originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f2180a = str;
        this.f2181b = originalRequest;
    }

    @Override // bo.app.d10
    public final String a() {
        return this.f2180a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x30)) {
            return false;
        }
        x30 x30Var = (x30) obj;
        return Intrinsics.areEqual(this.f2180a, x30Var.f2180a) && Intrinsics.areEqual(this.f2181b, x30Var.f2181b);
    }

    public final int hashCode() {
        String str = this.f2180a;
        return this.f2181b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.f2180a + ", originalRequest=" + this.f2181b + ')';
    }
}

package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70 f1747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1748b;

    public s70(t70 pathType, String remoteUrl) {
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.f1747a = pathType;
        this.f1748b = remoteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s70)) {
            return false;
        }
        s70 s70Var = (s70) obj;
        return this.f1747a == s70Var.f1747a && Intrinsics.areEqual(this.f1748b, s70Var.f1748b);
    }

    public final int hashCode() {
        return this.f1748b.hashCode() + (this.f1747a.hashCode() * 31);
    }

    public final String toString() {
        return h1.a(new StringBuilder("RemotePath(pathType=").append(this.f1747a).append(", remoteUrl="), this.f1748b, ')');
    }
}

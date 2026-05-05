package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z40 f172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z40 f173b;

    public a50(z40 oldNetworkLevel, z40 newNetworkLevel) {
        Intrinsics.checkNotNullParameter(oldNetworkLevel, "oldNetworkLevel");
        Intrinsics.checkNotNullParameter(newNetworkLevel, "newNetworkLevel");
        this.f172a = oldNetworkLevel;
        this.f173b = newNetworkLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return this.f172a == a50Var.f172a && this.f173b == a50Var.f173b;
    }

    public final int hashCode() {
        return this.f173b.hashCode() + (this.f172a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f172a + ", newNetworkLevel=" + this.f173b + ')';
    }
}

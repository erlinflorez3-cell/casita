package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2328a;

    public ys(String mite) {
        Intrinsics.checkNotNullParameter(mite, "mite");
        this.f2328a = mite;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys) && Intrinsics.areEqual(this.f2328a, ((ys) obj).f2328a);
    }

    public final int hashCode() {
        return this.f2328a.hashCode();
    }

    public final String toString() {
        return h1.a(new StringBuilder("DustMiteReceivedEvent(mite="), this.f2328a, ')');
    }
}

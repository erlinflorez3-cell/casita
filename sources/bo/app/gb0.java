package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb0 f739a;

    public gb0(fb0 serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        this.f739a = serverConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb0) && Intrinsics.areEqual(this.f739a, ((gb0) obj).f739a);
    }

    public final int hashCode() {
        return this.f739a.hashCode();
    }

    public final String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f739a + ')';
    }
}

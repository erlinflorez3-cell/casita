package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r90 f2196a;

    public x90(r90 debugConfig) {
        Intrinsics.checkNotNullParameter(debugConfig, "debugConfig");
        this.f2196a = debugConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x90) && Intrinsics.areEqual(this.f2196a, ((x90) obj).f2196a);
    }

    public final int hashCode() {
        return this.f2196a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.f2196a + ')';
    }
}

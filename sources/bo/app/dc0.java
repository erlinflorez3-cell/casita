package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb0 f480a;

    public dc0(w40 sealedSession) {
        Intrinsics.checkNotNullParameter(sealedSession, "sealedSession");
        this.f480a = sealedSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc0) && Intrinsics.areEqual(this.f480a, ((dc0) obj).f480a);
    }

    public final int hashCode() {
        return this.f480a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f480a + ')';
    }
}

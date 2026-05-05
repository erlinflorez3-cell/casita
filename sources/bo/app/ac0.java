package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb0 f191a;

    public ac0(w40 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f191a = session;
        if (session.d()) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac0) && Intrinsics.areEqual(this.f191a, ((ac0) obj).f191a);
    }

    public final int hashCode() {
        return this.f191a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.f191a + ')';
    }
}

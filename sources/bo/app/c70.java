package bo.app;

/* JADX INFO: loaded from: classes4.dex */
public final class c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f322a;

    public c70(long j2) {
        this.f322a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c70) && this.f322a == ((c70) obj).f322a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f322a);
    }

    public final String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.f322a + ')';
    }
}

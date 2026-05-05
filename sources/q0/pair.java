package q0;

import y0.lifestyle;

/* JADX INFO: loaded from: classes2.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28244a;

    public pair(lifestyle lifestyleVar) {
        this.f28244a = lifestyleVar.a();
    }

    public pair(boolean z2) {
        this.f28244a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pair) && this.f28244a == ((pair) obj).f28244a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28244a);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.f28244a + ")";
    }
}

package h0;

/* JADX INFO: loaded from: classes4.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f19683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f19684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19685c;

    public pair(double d2, double d3, boolean z2) {
        this.f19683a = d2;
        this.f19684b = d3;
        this.f19685c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Double.compare(this.f19683a, pairVar.f19683a) == 0 && Double.compare(this.f19684b, pairVar.f19684b) == 0 && this.f19685c == pairVar.f19685c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19685c) + ((Double.hashCode(this.f19684b) + (Double.hashCode(this.f19683a) * 31)) * 31);
    }

    public final String toString() {
        return "GeolocationResult(latitude=" + this.f19683a + ", longitude=" + this.f19684b + ", isMock=" + this.f19685c + ")";
    }
}

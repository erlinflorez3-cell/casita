package bo.app;

/* JADX INFO: loaded from: classes4.dex */
public final class ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1663b;

    public ra0(int i2, int i3) {
        this.f1662a = i2;
        this.f1663b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0Var = (ra0) obj;
        return this.f1662a == ra0Var.f1662a && this.f1663b == ra0Var.f1663b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1663b) + (Integer.hashCode(this.f1662a) * 31);
    }

    public final String toString() {
        return "RateLimitEndpointConfig(capacity=" + this.f1662a + ", refillRate=" + this.f1663b + ')';
    }
}

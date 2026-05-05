package o0;

/* JADX INFO: loaded from: classes6.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final superior f27441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tongue f27442b;

    public pair(superior superiorVar, tongue tongueVar) {
        this.f27441a = superiorVar;
        this.f27442b = tongueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return this.f27441a == pairVar.f27441a && this.f27442b == pairVar.f27442b;
    }

    public final int hashCode() {
        return this.f27442b.hashCode() + (this.f27441a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCallResult(onCallStatus=" + this.f27441a + ", onCallType=" + this.f27442b + ")";
    }
}

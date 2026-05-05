package f0;

import c1.proposal;
import kotlin.jvm.internal.Intrinsics;
import y0.clean;
import y0.match;

/* JADX INFO: loaded from: classes5.dex */
public final class superior implements tongue {

    /* JADX INFO: renamed from: a */
    public final o0.pair f18518a;

    /* JADX INFO: renamed from: b */
    public final j0.pair f18519b;

    /* JADX INFO: renamed from: c */
    public final h0.pair f18520c;

    public superior(o0.pair pairVar, j0.pair pairVar2, h0.pair pairVar3) {
        this.f18518a = pairVar;
        this.f18519b = pairVar2;
        this.f18520c = pairVar3;
    }

    @Override // f0.tongue
    public final void a(match matchVar) {
        if (this.f18518a == null && this.f18519b == null && this.f18520c == null) {
            return;
        }
        matchVar.a((clean) proposal.f2504a.a(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof superior)) {
            return false;
        }
        superior superiorVar = (superior) obj;
        return Intrinsics.areEqual(this.f18518a, superiorVar.f18518a) && Intrinsics.areEqual(this.f18519b, superiorVar.f18519b) && Intrinsics.areEqual(this.f18520c, superiorVar.f18520c);
    }

    public final int hashCode() {
        o0.pair pairVar = this.f18518a;
        int iHashCode = (pairVar == null ? 0 : pairVar.hashCode()) * 31;
        j0.pair pairVar2 = this.f18519b;
        int iHashCode2 = (iHashCode + (pairVar2 == null ? 0 : pairVar2.hashCode())) * 31;
        h0.pair pairVar3 = this.f18520c;
        return iHashCode2 + (pairVar3 != null ? pairVar3.hashCode() : 0);
    }

    public final String toString() {
        return "Enabled(onCallResult=" + this.f18518a + ", humanResult=" + this.f18519b + ", geolocationResult=" + this.f18520c + ")";
    }
}

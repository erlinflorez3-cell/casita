package d0;

import c1.stain;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class civilian implements m0.pair {

    /* JADX INFO: renamed from: a */
    public final boolean f18401a;

    /* JADX INFO: renamed from: b */
    public final tongue f18402b;

    /* JADX INFO: renamed from: c */
    public final List f18403c;

    /* JADX INFO: renamed from: d */
    public final List f18404d;

    /* JADX INFO: renamed from: e */
    public final List f18405e;

    /* JADX INFO: renamed from: f */
    public final List f18406f;

    /* JADX INFO: renamed from: g */
    public final List f18407g;

    /* JADX INFO: renamed from: h */
    public final boolean f18408h;

    /* JADX INFO: renamed from: i */
    public final f0.tongue f18409i;

    /* JADX INFO: renamed from: j */
    public final p0.pair f18410j;

    public civilian(boolean z2, tongue tongueVar, List list, List list2, List list3, List list4, List list5, boolean z3, f0.tongue tongueVar2, p0.pair pairVar) {
        this.f18401a = z2;
        this.f18402b = tongueVar;
        this.f18403c = list;
        this.f18404d = list2;
        this.f18405e = list3;
        this.f18406f = list4;
        this.f18407g = list5;
        this.f18408h = z3;
        this.f18409i = tongueVar2;
        this.f18410j = pairVar;
    }

    @Override // m0.pair
    public final List a() {
        return stain.f2514b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof civilian)) {
            return false;
        }
        civilian civilianVar = (civilian) obj;
        return this.f18401a == civilianVar.f18401a && Intrinsics.areEqual(this.f18402b, civilianVar.f18402b) && Intrinsics.areEqual(this.f18403c, civilianVar.f18403c) && Intrinsics.areEqual(this.f18404d, civilianVar.f18404d) && Intrinsics.areEqual(this.f18405e, civilianVar.f18405e) && Intrinsics.areEqual(this.f18406f, civilianVar.f18406f) && Intrinsics.areEqual(this.f18407g, civilianVar.f18407g) && this.f18408h == civilianVar.f18408h && Intrinsics.areEqual(this.f18409i, civilianVar.f18409i) && this.f18410j == civilianVar.f18410j;
    }

    public final int hashCode() {
        int iHashCode = (this.f18402b.hashCode() + (Boolean.hashCode(this.f18401a) * 31)) * 31;
        List list = this.f18403c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f18404d;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f18405e;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f18406f;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f18407g;
        return this.f18410j.hashCode() + ((this.f18409i.hashCode() + ((Boolean.hashCode(this.f18408h) + ((iHashCode5 + (list5 != null ? list5.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LateScanResult(isEmulated=" + this.f18401a + ", deviceInfo=" + this.f18402b + ", mockLocationApps=" + this.f18403c + ", taskInjectionApps=" + this.f18404d + ", overlayApps=" + this.f18405e + ", messageApps=" + this.f18406f + ", nfcApps=" + this.f18407g + ", isMockLocationAllowed=" + this.f18408h + ", deviceContext=" + this.f18409i + ", secureMethod=" + this.f18410j + ")";
    }
}

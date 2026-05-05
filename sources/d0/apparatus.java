package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class apparatus implements m0.superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f18395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abundant f18396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.superior f18398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.pair f18399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0.pair f18400f;

    public apparatus(Boolean bool, abundant abundantVar, boolean z2, g0.superior superiorVar, g0.pair pairVar, e0.pair pairVar2) {
        this.f18395a = bool;
        this.f18396b = abundantVar;
        this.f18397c = z2;
        this.f18398d = superiorVar;
        this.f18399e = pairVar;
        this.f18400f = pairVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apparatus)) {
            return false;
        }
        apparatus apparatusVar = (apparatus) obj;
        return Intrinsics.areEqual(this.f18395a, apparatusVar.f18395a) && Intrinsics.areEqual(this.f18396b, apparatusVar.f18396b) && this.f18397c == apparatusVar.f18397c && Intrinsics.areEqual(this.f18398d, apparatusVar.f18398d) && Intrinsics.areEqual(this.f18399e, apparatusVar.f18399e) && Intrinsics.areEqual(this.f18400f, apparatusVar.f18400f);
    }

    public final int hashCode() {
        Boolean bool = this.f18395a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        abundant abundantVar = this.f18396b;
        int iHashCode2 = (Boolean.hashCode(this.f18397c) + ((iHashCode + (abundantVar == null ? 0 : abundantVar.hashCode())) * 31)) * 31;
        g0.superior superiorVar = this.f18398d;
        int iHashCode3 = (iHashCode2 + (superiorVar == null ? 0 : superiorVar.hashCode())) * 31;
        g0.pair pairVar = this.f18399e;
        int iHashCode4 = (iHashCode3 + (pairVar == null ? 0 : pairVar.hashCode())) * 31;
        e0.pair pairVar2 = this.f18400f;
        return iHashCode4 + (pairVar2 != null ? pairVar2.hashCode() : 0);
    }

    public final String toString() {
        return "EarlyScanResult(isRooted=" + this.f18395a + ", telephony=" + this.f18396b + ", isEmulated=" + this.f18397c + ", basicEmulator=" + this.f18398d + ", advancedEmulator=" + this.f18399e + ", monitoredApp=" + this.f18400f + ")";
    }
}

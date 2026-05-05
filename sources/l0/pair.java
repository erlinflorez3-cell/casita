package l0;

import c1.profile;
import d0.abundant;
import d0.apparatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pair implements m0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f19856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abundant f19857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.pair f19859d;

    public pair(apparatus apparatusVar) {
        Boolean bool = apparatusVar.f18395a;
        abundant abundantVar = apparatusVar.f18396b;
        boolean z2 = apparatusVar.f18397c;
        e0.pair pairVar = apparatusVar.f18400f;
        this.f19856a = bool;
        this.f19857b = abundantVar;
        this.f19858c = z2;
        this.f19859d = pairVar;
    }

    @Override // m0.pair
    public final List a() {
        return profile.f2503b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f19856a, pairVar.f19856a) && Intrinsics.areEqual(this.f19857b, pairVar.f19857b) && this.f19858c == pairVar.f19858c && Intrinsics.areEqual(this.f19859d, pairVar.f19859d);
    }

    public final int hashCode() {
        Boolean bool = this.f19856a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        abundant abundantVar = this.f19857b;
        int iHashCode2 = (Boolean.hashCode(this.f19858c) + ((iHashCode + (abundantVar == null ? 0 : abundantVar.hashCode())) * 31)) * 31;
        e0.pair pairVar = this.f19859d;
        return iHashCode2 + (pairVar != null ? pairVar.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceScanMessageData(isRooted=" + this.f19856a + ", telephony=" + this.f19857b + ", isEmulated=" + this.f19858c + ", monitoredApp=" + this.f19859d + ")";
    }
}

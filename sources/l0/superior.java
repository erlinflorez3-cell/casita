package l0;

import d0.apparatus;
import kotlin.jvm.internal.Intrinsics;
import m0.tongue;

/* JADX INFO: loaded from: classes6.dex */
public final class superior implements tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.superior f19861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.pair f19862c;

    public superior(apparatus apparatusVar) {
        boolean z2 = apparatusVar.f18397c;
        g0.superior superiorVar = apparatusVar.f18398d;
        g0.pair pairVar = apparatusVar.f18399e;
        this.f19860a = z2;
        this.f19861b = superiorVar;
        this.f19862c = pairVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof superior)) {
            return false;
        }
        superior superiorVar = (superior) obj;
        return this.f19860a == superiorVar.f19860a && Intrinsics.areEqual(this.f19861b, superiorVar.f19861b) && Intrinsics.areEqual(this.f19862c, superiorVar.f19862c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19860a) * 31;
        g0.superior superiorVar = this.f19861b;
        int iHashCode2 = (iHashCode + (superiorVar == null ? 0 : superiorVar.hashCode())) * 31;
        g0.pair pairVar = this.f19862c;
        return iHashCode2 + (pairVar != null ? pairVar.hashCode() : 0);
    }

    public final String toString() {
        return "EmulatorMessageData(isEmulated=" + this.f19860a + ", basicEmulator=" + this.f19861b + ", advancedEmulator=" + this.f19862c + ")";
    }
}

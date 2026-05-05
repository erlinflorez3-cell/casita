package t;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0.pair f28318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.apparatus f28319b;

    public superior(k0.pair pairVar, m0.apparatus apparatusVar) {
        this.f28318a = pairVar;
        this.f28319b = apparatusVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof superior)) {
            return false;
        }
        superior superiorVar = (superior) obj;
        return Intrinsics.areEqual(this.f28318a, superiorVar.f28318a) && Intrinsics.areEqual(this.f28319b, superiorVar.f28319b);
    }

    public final int hashCode() {
        return this.f28319b.hashCode() + (this.f28318a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(identifiers=" + this.f28318a + ", data=" + this.f28319b + ")";
    }
}

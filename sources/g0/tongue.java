package g0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final superior f19676b;

    public tongue(boolean z2, superior superiorVar) {
        this.f19675a = z2;
        this.f19676b = superiorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tongue)) {
            return false;
        }
        tongue tongueVar = (tongue) obj;
        return this.f19675a == tongueVar.f19675a && Intrinsics.areEqual(this.f19676b, tongueVar.f19676b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19675a) * 31;
        superior superiorVar = this.f19676b;
        return iHashCode + (superiorVar == null ? 0 : superiorVar.hashCode());
    }

    public final String toString() {
        return "BasicEmulatorResult(isEmulator=" + this.f19675a + ", info=" + this.f19676b + ")";
    }
}

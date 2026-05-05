package g0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final misplace f19669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19670c;

    public superior(ArrayList arrayList, misplace misplaceVar, List list) {
        this.f19668a = arrayList;
        this.f19669b = misplaceVar;
        this.f19670c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof superior)) {
            return false;
        }
        superior superiorVar = (superior) obj;
        return Intrinsics.areEqual(this.f19668a, superiorVar.f19668a) && Intrinsics.areEqual(this.f19669b, superiorVar.f19669b) && Intrinsics.areEqual(this.f19670c, superiorVar.f19670c);
    }

    public final int hashCode() {
        int iHashCode = this.f19668a.hashCode() * 31;
        misplace misplaceVar = this.f19669b;
        return this.f19670c.hashCode() + ((iHashCode + (misplaceVar == null ? 0 : misplaceVar.hashCode())) * 31);
    }

    public final String toString() {
        return "BasicEmulatorInfo(deviceProperties=" + this.f19668a + ", telephony=" + this.f19669b + ", resolveInfos=" + this.f19670c + ")";
    }
}

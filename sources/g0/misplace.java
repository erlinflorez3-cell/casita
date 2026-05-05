package g0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class misplace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19663b;

    public misplace(String str, String str2) {
        this.f19662a = str;
        this.f19663b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof misplace)) {
            return false;
        }
        misplace misplaceVar = (misplace) obj;
        return Intrinsics.areEqual(this.f19662a, misplaceVar.f19662a) && Intrinsics.areEqual(this.f19663b, misplaceVar.f19663b);
    }

    public final int hashCode() {
        String str = this.f19662a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19663b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "EmulatorTelephony(imei=" + this.f19662a + ", imsi=" + this.f19663b + ")";
    }
}

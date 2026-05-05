package j0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f19804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f19805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f19806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f19807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f19808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f19809f;

    public pair(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.f19804a = bool;
        this.f19805b = bool2;
        this.f19806c = bool3;
        this.f19807d = bool4;
        this.f19808e = bool5;
        this.f19809f = bool6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f19804a, pairVar.f19804a) && Intrinsics.areEqual(this.f19805b, pairVar.f19805b) && Intrinsics.areEqual(this.f19806c, pairVar.f19806c) && Intrinsics.areEqual(this.f19807d, pairVar.f19807d) && Intrinsics.areEqual(this.f19808e, pairVar.f19808e) && Intrinsics.areEqual(this.f19809f, pairVar.f19809f);
    }

    public final int hashCode() {
        Boolean bool = this.f19804a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f19805b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f19806c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f19807d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f19808e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f19809f;
        return iHashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        return "HumanResult(hasAccelerationChanged=" + this.f19804a + ", hasRotationChanged=" + this.f19805b + ", isEnvironmentDark=" + this.f19806c + ", isDeviceCloseToSurface=" + this.f19807d + ", hasTouchOccurred=" + this.f19808e + ", isTouchFromUnknownSource=" + this.f19809f + ")";
    }
}

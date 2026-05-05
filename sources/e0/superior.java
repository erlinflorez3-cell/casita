package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18473c;

    public superior(String str, String str2, String str3) {
        this.f18471a = str;
        this.f18472b = str2;
        this.f18473c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof superior)) {
            return false;
        }
        superior superiorVar = (superior) obj;
        return Intrinsics.areEqual(this.f18471a, superiorVar.f18471a) && Intrinsics.areEqual(this.f18472b, superiorVar.f18472b) && Intrinsics.areEqual(this.f18473c, superiorVar.f18473c);
    }

    public final int hashCode() {
        return this.f18473c.hashCode() + d0.superior.a(this.f18472b, this.f18471a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AppActivity(name=" + this.f18471a + ", permission=" + this.f18472b + ", packageName=" + this.f18473c + ")";
    }
}

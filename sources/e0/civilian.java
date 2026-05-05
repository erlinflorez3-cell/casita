package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class civilian {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18455c;

    public civilian(String str, String str2, String str3) {
        this.f18453a = str;
        this.f18454b = str2;
        this.f18455c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof civilian)) {
            return false;
        }
        civilian civilianVar = (civilian) obj;
        return Intrinsics.areEqual(this.f18453a, civilianVar.f18453a) && Intrinsics.areEqual(this.f18454b, civilianVar.f18454b) && Intrinsics.areEqual(this.f18455c, civilianVar.f18455c);
    }

    public final int hashCode() {
        return this.f18455c.hashCode() + d0.superior.a(this.f18454b, this.f18453a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AppService(name=" + this.f18453a + ", permission=" + this.f18454b + ", packageName=" + this.f18455c + ")";
    }
}

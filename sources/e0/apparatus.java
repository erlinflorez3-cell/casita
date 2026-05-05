package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18452b;

    public apparatus(String str, int i2) {
        this.f18451a = str;
        this.f18452b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apparatus)) {
            return false;
        }
        apparatus apparatusVar = (apparatus) obj;
        return Intrinsics.areEqual(this.f18451a, apparatusVar.f18451a) && this.f18452b == apparatusVar.f18452b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18452b) + (this.f18451a.hashCode() * 31);
    }

    public final String toString() {
        return "AppPermission(name=" + this.f18451a + ", flag=" + this.f18452b + ")";
    }
}

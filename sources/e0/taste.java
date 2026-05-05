package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class taste {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18479f;

    public taste(String str, int i2, String str2, String str3, int i3, String str4) {
        this.f18474a = str;
        this.f18475b = i2;
        this.f18476c = str2;
        this.f18477d = str3;
        this.f18478e = i3;
        this.f18479f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taste)) {
            return false;
        }
        taste tasteVar = (taste) obj;
        return Intrinsics.areEqual(this.f18474a, tasteVar.f18474a) && this.f18475b == tasteVar.f18475b && Intrinsics.areEqual(this.f18476c, tasteVar.f18476c) && Intrinsics.areEqual(this.f18477d, tasteVar.f18477d) && this.f18478e == tasteVar.f18478e && Intrinsics.areEqual(this.f18479f, tasteVar.f18479f);
    }

    public final int hashCode() {
        return this.f18479f.hashCode() + ((Integer.hashCode(this.f18478e) + d0.superior.a(this.f18477d, d0.superior.a(this.f18476c, (Integer.hashCode(this.f18475b) + (this.f18474a.hashCode() * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(packageName=" + this.f18474a + ", uid=" + this.f18475b + ", label=" + this.f18476c + ", iconSHA=" + this.f18477d + ", flags=" + this.f18478e + ", sourceDir=" + this.f18479f + ")";
    }
}

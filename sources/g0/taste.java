package g0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class taste {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final apparatus f19672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19674d;

    public taste(String str, apparatus apparatusVar, String str2, boolean z2) {
        this.f19671a = str;
        this.f19672b = apparatusVar;
        this.f19673c = str2;
        this.f19674d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taste)) {
            return false;
        }
        taste tasteVar = (taste) obj;
        return Intrinsics.areEqual(this.f19671a, tasteVar.f19671a) && this.f19672b == tasteVar.f19672b && Intrinsics.areEqual(this.f19673c, tasteVar.f19673c) && this.f19674d == tasteVar.f19674d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19674d) + d0.superior.a(this.f19673c, (this.f19672b.hashCode() + (this.f19671a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "EmulatorProperty(name=" + this.f19671a + ", type=" + this.f19672b + ", toName=" + this.f19673c + ", result=" + this.f19674d + ")";
    }
}

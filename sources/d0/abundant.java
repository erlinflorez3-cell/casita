package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class abundant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18394d;

    public abundant(String str, String str2, String str3, String str4) {
        this.f18391a = str;
        this.f18392b = str2;
        this.f18393c = str3;
        this.f18394d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abundant)) {
            return false;
        }
        abundant abundantVar = (abundant) obj;
        return Intrinsics.areEqual(this.f18391a, abundantVar.f18391a) && Intrinsics.areEqual(this.f18392b, abundantVar.f18392b) && Intrinsics.areEqual(this.f18393c, abundantVar.f18393c) && Intrinsics.areEqual(this.f18394d, abundantVar.f18394d);
    }

    public final int hashCode() {
        return this.f18394d.hashCode() + superior.a(this.f18393c, superior.a(this.f18392b, this.f18391a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TelephonyResult(mac=" + this.f18391a + ", iccid=" + this.f18392b + ", imsi=" + this.f18393c + ", imei=" + this.f18394d + ")";
    }
}

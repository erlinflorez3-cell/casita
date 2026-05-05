package k0;

import d0.superior;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19833e;

    public pair(String str, String str2, String str3, String str4, String str5) {
        this.f19829a = str;
        this.f19830b = str2;
        this.f19831c = str3;
        this.f19832d = str4;
        this.f19833e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f19829a, pairVar.f19829a) && Intrinsics.areEqual(this.f19830b, pairVar.f19830b) && Intrinsics.areEqual(this.f19831c, pairVar.f19831c) && Intrinsics.areEqual(this.f19832d, pairVar.f19832d) && Intrinsics.areEqual(this.f19833e, pairVar.f19833e);
    }

    public final int hashCode() {
        return this.f19833e.hashCode() + superior.a(this.f19832d, superior.a(this.f19831c, superior.a(this.f19830b, this.f19829a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Identifiers(sessionId=" + this.f19829a + ", parentId=" + this.f19830b + ", eventId=" + this.f19831c + ", browserId=" + this.f19832d + ", deviceId=" + this.f19833e + ")";
    }
}

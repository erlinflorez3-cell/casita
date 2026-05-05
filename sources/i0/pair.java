package i0;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pair implements m0.pair {

    /* JADX INFO: renamed from: a */
    public final List f19695a;

    /* JADX INFO: renamed from: b */
    public final String f19696b;

    /* JADX INFO: renamed from: c */
    public final String f19697c;

    /* JADX INFO: renamed from: d */
    public final String f19698d;

    /* JADX INFO: renamed from: e */
    public final int f19699e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f19700f;

    /* JADX INFO: renamed from: g */
    public final String f19701g;

    /* JADX INFO: renamed from: h */
    public final f0.tongue f19702h;

    public pair(List list, String str, String str2, String str3, int i2, LinkedHashMap linkedHashMap, String str4, f0.tongue tongueVar) {
        this.f19695a = list;
        this.f19696b = str;
        this.f19697c = str2;
        this.f19698d = str3;
        this.f19699e = i2;
        this.f19700f = linkedHashMap;
        this.f19701g = str4;
        this.f19702h = tongueVar;
    }

    @Override // m0.pair
    public final List a() {
        return c1.pair.f2502b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f19695a, pairVar.f19695a) && Intrinsics.areEqual(this.f19696b, pairVar.f19696b) && Intrinsics.areEqual(this.f19697c, pairVar.f19697c) && Intrinsics.areEqual(this.f19698d, pairVar.f19698d) && this.f19699e == pairVar.f19699e && Intrinsics.areEqual(this.f19700f, pairVar.f19700f) && Intrinsics.areEqual(this.f19701g, pairVar.f19701g) && Intrinsics.areEqual(this.f19702h, pairVar.f19702h);
    }

    public final int hashCode() {
        return this.f19702h.hashCode() + d0.superior.a(this.f19701g, (this.f19700f.hashCode() + ((Integer.hashCode(this.f19699e) + d0.superior.a(this.f19698d, d0.superior.a(this.f19697c, d0.superior.a(this.f19696b, this.f19695a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ApiIntegrityHttpResult(certs=" + this.f19695a + ", uniqueId=" + taste.a(this.f19696b) + ", requestUri=" + this.f19697c + ", requestUserAgent=" + this.f19698d + ", code=" + this.f19699e + ", headers=" + this.f19700f + ", body=" + this.f19701g + ", deviceContext=" + this.f19702h + ")";
    }
}

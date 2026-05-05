package e0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pair {

    /* JADX INFO: renamed from: a */
    public final String f18457a;

    /* JADX INFO: renamed from: b */
    public final long f18458b;

    /* JADX INFO: renamed from: c */
    public final long f18459c;

    /* JADX INFO: renamed from: d */
    public final String f18460d;

    /* JADX INFO: renamed from: e */
    public final String f18461e;

    /* JADX INFO: renamed from: f */
    public final String f18462f;

    /* JADX INFO: renamed from: g */
    public final List f18463g;

    /* JADX INFO: renamed from: h */
    public final List f18464h;

    /* JADX INFO: renamed from: i */
    public final List f18465i;

    /* JADX INFO: renamed from: j */
    public final List f18466j;

    /* JADX INFO: renamed from: k */
    public final List f18467k;

    /* JADX INFO: renamed from: l */
    public final taste f18468l;

    /* JADX INFO: renamed from: m */
    public final List f18469m;

    /* JADX INFO: renamed from: n */
    public final tongue f18470n;

    public pair(String str, long j2, long j3, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, taste tasteVar, List list6, tongue tongueVar) {
        this.f18457a = str;
        this.f18458b = j2;
        this.f18459c = j3;
        this.f18460d = str2;
        this.f18461e = str3;
        this.f18462f = str4;
        this.f18463g = list;
        this.f18464h = list2;
        this.f18465i = list3;
        this.f18466j = list4;
        this.f18467k = list5;
        this.f18468l = tasteVar;
        this.f18469m = list6;
        this.f18470n = tongueVar;
    }

    public static pair a(pair pairVar, List list, List list2, List list3) {
        String str = pairVar.f18457a;
        long j2 = pairVar.f18458b;
        long j3 = pairVar.f18459c;
        String str2 = pairVar.f18460d;
        String str3 = pairVar.f18461e;
        String str4 = pairVar.f18462f;
        List list4 = pairVar.f18463g;
        List list5 = pairVar.f18464h;
        taste tasteVar = pairVar.f18468l;
        List list6 = pairVar.f18469m;
        tongue tongueVar = pairVar.f18470n;
        pairVar.getClass();
        return new pair(str, j2, j3, str2, str3, str4, list4, list5, list, list2, list3, tasteVar, list6, tongueVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f18457a, pairVar.f18457a) && this.f18458b == pairVar.f18458b && this.f18459c == pairVar.f18459c && Intrinsics.areEqual(this.f18460d, pairVar.f18460d) && Intrinsics.areEqual(this.f18461e, pairVar.f18461e) && Intrinsics.areEqual(this.f18462f, pairVar.f18462f) && Intrinsics.areEqual(this.f18463g, pairVar.f18463g) && Intrinsics.areEqual(this.f18464h, pairVar.f18464h) && Intrinsics.areEqual(this.f18465i, pairVar.f18465i) && Intrinsics.areEqual(this.f18466j, pairVar.f18466j) && Intrinsics.areEqual(this.f18467k, pairVar.f18467k) && Intrinsics.areEqual(this.f18468l, pairVar.f18468l) && Intrinsics.areEqual(this.f18469m, pairVar.f18469m) && this.f18470n == pairVar.f18470n;
    }

    public final int hashCode() {
        return this.f18470n.hashCode() + ((this.f18469m.hashCode() + ((this.f18468l.hashCode() + ((this.f18467k.hashCode() + ((this.f18466j.hashCode() + ((this.f18465i.hashCode() + ((this.f18464h.hashCode() + ((this.f18463g.hashCode() + d0.superior.a(this.f18462f, d0.superior.a(this.f18461e, d0.superior.a(this.f18460d, (Long.hashCode(this.f18459c) + ((Long.hashCode(this.f18458b) + (this.f18457a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "App(packageName=" + this.f18457a + ", lastUpdateTime=" + this.f18458b + ", firstInstallTime=" + this.f18459c + ", internalVersion=" + this.f18460d + ", installerPackageName=" + this.f18461e + ", version=" + this.f18462f + ", taskAffinities=" + this.f18463g + ", permissions=" + this.f18464h + ", activities=" + this.f18465i + ", receivers=" + this.f18466j + ", services=" + this.f18467k + ", applicationInfo=" + this.f18468l + ", signatures=" + this.f18469m + ", installerType=" + this.f18470n + ")";
    }
}

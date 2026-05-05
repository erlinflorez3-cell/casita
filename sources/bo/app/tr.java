package bo.app;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tr {

    /* JADX INFO: renamed from: e */
    public static final rr f1884e = new rr();

    /* JADX INFO: renamed from: a */
    public final int f1885a;

    /* JADX INFO: renamed from: b */
    public final List f1886b;

    /* JADX INFO: renamed from: c */
    public final cc0 f1887c;

    /* JADX INFO: renamed from: d */
    public final l00 f1888d;

    public tr(int i2, List list, cc0 cc0Var, l00 l00Var) {
        this.f1885a = i2;
        this.f1886b = list;
        this.f1887c = cc0Var;
        this.f1888d = l00Var;
    }

    public /* synthetic */ tr(int i2, List list, cc0 cc0Var, tg tgVar, int i3) {
        this(i2, (i3 + 2) - (2 | i3) != 0 ? CollectionsKt.emptyList() : list, (i3 + 4) - (4 | i3) != 0 ? null : cc0Var, (i3 & 8) != 0 ? null : tgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return this.f1885a == trVar.f1885a && Intrinsics.areEqual(this.f1886b, trVar.f1886b) && Intrinsics.areEqual(this.f1887c, trVar.f1887c) && Intrinsics.areEqual(this.f1888d, trVar.f1888d);
    }

    public final int hashCode() {
        int iHashCode = (this.f1886b.hashCode() + (gc0.a(this.f1885a) * 31)) * 31;
        cc0 cc0Var = this.f1887c;
        int iHashCode2 = (iHashCode + (cc0Var == null ? 0 : cc0Var.f334a.hashCode())) * 31;
        l00 l00Var = this.f1888d;
        return iHashCode2 + (l00Var != null ? l00Var.hashCode() : 0);
    }

    public final String toString() {
        return StringsKt.trimIndent("\n            commandType = " + sr.a(this.f1885a) + "\n            brazeEvents = " + this.f1886b + "\n            sessionId = " + this.f1887c + "\n            brazeRequest = " + this.f1888d + "\n        ");
    }
}

package i0;

import c1.sea;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue implements m0.pair {

    /* JADX INFO: renamed from: a */
    public final List f19707a;

    /* JADX INFO: renamed from: b */
    public final String f19708b;

    /* JADX INFO: renamed from: c */
    public final String f19709c;

    /* JADX INFO: renamed from: d */
    public final f0.tongue f19710d;

    public tongue(List list, String str, String str2, f0.tongue tongueVar) {
        this.f19707a = list;
        this.f19708b = str;
        this.f19709c = str2;
        this.f19710d = tongueVar;
    }

    @Override // m0.pair
    public final List a() {
        return sea.f2505b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tongue)) {
            return false;
        }
        tongue tongueVar = (tongue) obj;
        return Intrinsics.areEqual(this.f19707a, tongueVar.f19707a) && Intrinsics.areEqual(this.f19708b, tongueVar.f19708b) && Intrinsics.areEqual(this.f19709c, tongueVar.f19709c) && Intrinsics.areEqual(this.f19710d, tongueVar.f19710d);
    }

    public final int hashCode() {
        return this.f19710d.hashCode() + d0.superior.a(this.f19709c, d0.superior.a(this.f19708b, this.f19707a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CertificateHttpResult(certs=" + this.f19707a + ", uniqueId=" + taste.a(this.f19708b) + ", requestUri=" + this.f19709c + ", deviceContext=" + this.f19710d + ")";
    }
}

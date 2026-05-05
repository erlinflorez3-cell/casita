package bo.app;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class i90 implements d10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f890d;

    public i90(l00 originalRequest, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f887a = originalRequest;
        this.f888b = i2;
        this.f889c = str;
        this.f890d = str2;
    }

    @Override // bo.app.d10
    public final String a() {
        return this.f890d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj;
        return Intrinsics.areEqual(this.f887a, i90Var.f887a) && this.f888b == i90Var.f888b && Intrinsics.areEqual(this.f889c, i90Var.f889c) && Intrinsics.areEqual(this.f890d, i90Var.f890d);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f888b) + (this.f887a.hashCode() * 31)) * 31;
        String str = this.f889c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f890d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.a(new StringBuilder("{code = ").append(this.f888b).append(", reason = ").append(this.f889c).append(", message = "), this.f890d, AbstractJsonLexerKt.END_OBJ);
    }
}

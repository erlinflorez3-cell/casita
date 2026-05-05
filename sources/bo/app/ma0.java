package bo.app;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ma0 implements d10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l00 f1270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1272c;

    public ma0(l00 originalRequest, int i2, String str) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f1270a = originalRequest;
        this.f1271b = i2;
        this.f1272c = str;
    }

    @Override // bo.app.d10
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma0)) {
            return false;
        }
        ma0 ma0Var = (ma0) obj;
        return Intrinsics.areEqual(this.f1270a, ma0Var.f1270a) && this.f1271b == ma0Var.f1271b && Intrinsics.areEqual(this.f1272c, ma0Var.f1272c);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f1271b) + (this.f1270a.hashCode() * 31)) * 31;
        String str = this.f1272c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return h1.a(new StringBuilder("{code = ").append(this.f1271b).append(", reason = "), this.f1272c, AbstractJsonLexerKt.END_OBJ);
    }
}

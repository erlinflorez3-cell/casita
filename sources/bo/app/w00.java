package bo.app;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f2090c;

    public /* synthetic */ w00(int i2, Map map, int i3) {
        this(i2, (i3 & 2) != 0 ? MapsKt.emptyMap() : map, (JSONObject) null);
    }

    public w00(int i2, Map responseHeaders, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        this.f2088a = i2;
        this.f2089b = responseHeaders;
        this.f2090c = jSONObject;
    }

    public final JSONObject a() {
        return this.f2090c;
    }

    public final int b() {
        return this.f2088a;
    }

    public final Map c() {
        return this.f2089b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return this.f2088a == w00Var.f2088a && Intrinsics.areEqual(this.f2089b, w00Var.f2089b) && Intrinsics.areEqual(this.f2090c, w00Var.f2090c);
    }

    public final int hashCode() {
        int iHashCode = (this.f2089b.hashCode() + (Integer.hashCode(this.f2088a) * 31)) * 31;
        JSONObject jSONObject = this.f2090c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.f2088a + ", responseHeaders=" + this.f2089b + ", jsonResponse=" + this.f2090c + ')';
    }
}

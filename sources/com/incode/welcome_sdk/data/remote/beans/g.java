package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.n;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f9664b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9665c = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9666f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9667h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9668i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f9669a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9671e;

    public g(String str, String str2, n nVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        this.f9670d = str;
        this.f9671e = str2;
        this.f9669a = nVar;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9672a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9673e = 0;

        private b() {
        }

        @JvmStatic
        public static g c(JSONObject jSONObject) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String strOptString = jSONObject.optString("alias");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            String strOptString2 = jSONObject.optString("name");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            n.d dVar = n.f9729e;
            String strOptString3 = jSONObject.optString("type");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            g gVar = new g(strOptString, strOptString2, n.d.d(strOptString3));
            int i3 = f9672a + 81;
            f9673e = i3 % 128;
            if (i3 % 2 == 0) {
                return gVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9666f + 85;
        f9667h = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            int i3 = f9668i + 31;
            f9665c = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        g gVar = (g) obj;
        if (Intrinsics.areEqual(this.f9670d, gVar.f9670d)) {
            return Intrinsics.areEqual(this.f9671e, gVar.f9671e) && this.f9669a == gVar.f9669a;
        }
        int i5 = f9668i + 71;
        f9665c = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9665c + 109;
        f9668i = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.f9670d.hashCode();
        return i4 == 0 ? (((iHashCode >> 77) << this.f9671e.hashCode()) % 60) >> this.f9669a.hashCode() : (((iHashCode * 31) + this.f9671e.hashCode()) * 31) + this.f9669a.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9665c + 1;
        f9668i = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "CustomField(alias=" + this.f9670d + ", name=" + this.f9671e + ", type=" + this.f9669a + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "CustomField(alias=" + this.f9670d + ", name=" + this.f9671e + ", type=" + this.f9669a + ")";
        int i4 = f9665c + 19;
        f9668i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return str2;
    }
}

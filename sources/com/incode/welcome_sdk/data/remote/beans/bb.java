package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9383b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9384f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9385h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9386j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9387a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f9389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9390e;

    public bb(boolean z2, e eVar, e eVar2, boolean z3) {
        this.f9388c = z2;
        this.f9387a = eVar;
        this.f9389d = eVar2;
        this.f9390e = z3;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f9386j + 81;
        int i4 = i3 % 128;
        f9383b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9388c;
        int i6 = i4 + 9;
        f9386j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return z2;
    }

    public final e e() {
        e eVar;
        int i2 = 2 % 2;
        int i3 = f9383b;
        int i4 = i3 + 39;
        f9386j = i4 % 128;
        if (i4 % 2 == 0) {
            eVar = this.f9387a;
            int i5 = 14 / 0;
        } else {
            eVar = this.f9387a;
        }
        int i6 = i3 + 121;
        f9386j = i6 % 128;
        if (i6 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    public final e c() {
        int i2 = 2 % 2;
        int i3 = f9383b;
        int i4 = i3 + 117;
        f9386j = i4 % 128;
        int i5 = i4 % 2;
        e eVar = this.f9389d;
        int i6 = i3 + 47;
        f9386j = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9391a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9392b = 1;

        private b() {
        }

        @JvmStatic
        public static bb e(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            boolean zOptBoolean = jSONObject.optBoolean("onlyFront");
            e.d dVar = e.f9652d;
            e eVarA = e.d.a(jSONObject.getJSONObject("addFrontResult"));
            e.d dVar2 = e.f9652d;
            bb bbVar = new bb(zOptBoolean, eVarA, e.d.a(jSONObject.optJSONObject("addBackResult")), jSONObject.optBoolean("isPassport"));
            int i3 = f9392b + 53;
            f9391a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 20 / 0;
            }
            return bbVar;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        new b((byte) 0);
        int i2 = f9385h + 7;
        f9384f = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final bb b(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f9386j + 53;
        f9383b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            b.e(responseBody);
            throw null;
        }
        bb bbVarE = b.e(responseBody);
        int i4 = f9386j + 75;
        f9383b = i4 % 128;
        if (i4 % 2 == 0) {
            return bbVarE;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9383b;
        int i4 = i3 + 37;
        f9386j = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            int i6 = i3 + 37;
            f9386j = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        if (this.f9388c != bbVar.f9388c) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9387a, bbVar.f9387a)) {
            return Intrinsics.areEqual(this.f9389d, bbVar.f9389d) && this.f9390e == bbVar.f9390e;
        }
        int i7 = f9383b + 57;
        f9386j = i7 % 128;
        return i7 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.f9388c) * 31;
        e eVar = this.f9387a;
        int iHashCode3 = 0;
        if (eVar == null) {
            int i3 = f9383b + 65;
            f9386j = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = eVar.hashCode();
        }
        int i5 = (iHashCode2 + iHashCode) * 31;
        e eVar2 = this.f9389d;
        if (eVar2 == null) {
            int i6 = f9383b + 7;
            f9386j = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 3;
            }
        } else {
            iHashCode3 = eVar2.hashCode();
        }
        return ((i5 + iHashCode3) * 31) + Boolean.hashCode(this.f9390e);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9383b + 53;
        f9386j = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseIdSummary(onlyFront=" + this.f9388c + ", addFrontResult=" + this.f9387a + ", addBackResult=" + this.f9389d + ", isPassport=" + this.f9390e + ")";
        int i5 = f9386j + 81;
        f9383b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}

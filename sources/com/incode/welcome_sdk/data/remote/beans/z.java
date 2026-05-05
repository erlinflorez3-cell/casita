package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f10099f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10100g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10101h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f10102i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10107e;

    public z(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.f10105c = str;
        this.f10107e = str2;
        this.f10106d = str3;
        this.f10104b = str4;
        this.f10103a = str5;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f10101h;
        int i4 = i3 + 23;
        f10099f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f10105c;
        int i6 = i3 + 3;
        f10099f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f10099f + 75;
        int i4 = i3 % 128;
        f10101h = i4;
        int i5 = i3 % 2;
        String str = this.f10107e;
        int i6 = i4 + 37;
        f10099f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f10101h;
        int i4 = i3 + 33;
        f10099f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f10106d;
        int i6 = i3 + 27;
        f10099f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10108b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10109d = 0;

        private d() {
        }

        @JvmStatic
        public static z c(ResponseBody responseBody) throws JSONException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObjectOptJSONObject = new JSONObject(responseBody.string()).getJSONArray("consents").optJSONObject(0);
            String strOptString = jSONObjectOptJSONObject.optString("id");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            String strOptString2 = jSONObjectOptJSONObject.optString("title");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            String strOptString3 = jSONObjectOptJSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            String strOptString4 = jSONObjectOptJSONObject.optString("regulationType");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            String strOptString5 = jSONObjectOptJSONObject.optString("consentType");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            z zVar = new z(strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
            int i3 = f10108b + 37;
            f10109d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 39 / 0;
            }
            return zVar;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        new d((byte) 0);
        int i2 = f10100g + 79;
        f10102i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final z c(ResponseBody responseBody) throws JSONException {
        int i2 = 2 % 2;
        int i3 = f10099f + 5;
        f10101h = i3 % 128;
        int i4 = i3 % 2;
        z zVarC = d.c(responseBody);
        int i5 = f10099f + 87;
        f10101h = i5 % 128;
        if (i5 % 2 == 0) {
            return zVarC;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f10101h + 55;
            f10099f = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!Intrinsics.areEqual(this.f10105c, zVar.f10105c)) {
            int i5 = f10101h + 97;
            f10099f = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f10107e, zVar.f10107e)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f10106d, zVar.f10106d)) {
            int i7 = f10099f + 7;
            f10101h = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.f10104b, zVar.f10104b)) {
            return Intrinsics.areEqual(this.f10103a, zVar.f10103a);
        }
        int i8 = f10099f + 101;
        f10101h = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f10099f + 17;
        f10101h = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((this.f10105c.hashCode() * 31) + this.f10107e.hashCode()) * 31) + this.f10106d.hashCode()) * 31) + this.f10104b.hashCode()) * 31) + this.f10103a.hashCode();
        int i5 = f10101h + 73;
        f10099f = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f10099f + 89;
        f10101h = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseConsent(id=" + this.f10105c + ", title=" + this.f10107e + ", text=" + this.f10106d + ", regulationType=" + this.f10104b + ", consentType=" + this.f10103a + ")";
        int i5 = f10101h + 65;
        f10099f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return str;
    }
}

package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bl {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9502g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9503h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9504i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9505j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9510e;

    public bl(boolean z2, String str, String str2, String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f9509d = z2;
        this.f9506a = str;
        this.f9510e = str2;
        this.f9508c = str3;
        this.f9507b = i2;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f9502g + 109;
        int i4 = i3 % 128;
        f9505j = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9509d;
        int i6 = i4 + 53;
        f9502g = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9511b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9512e = 0;

        private b() {
        }

        @JvmStatic
        public static bl e(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            boolean zOptBoolean = jSONObject.optBoolean("validRFC");
            String strOptString = jSONObject.optString("status");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            String strOptString2 = jSONObject.optString("message");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            String strOptString3 = jSONObject.optString("rfcType");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            bl blVar = new bl(zOptBoolean, strOptString, strOptString2, strOptString3, jSONObject.optInt("messageCode"));
            int i3 = f9511b + 53;
            f9512e = i3 % 128;
            int i4 = i3 % 2;
            return blVar;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        new b((byte) 0);
        int i2 = f9503h + 5;
        f9504i = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final bl c(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9502g + 33;
        f9505j = i3 % 128;
        int i4 = i3 % 2;
        bl blVarE = b.e(responseBody);
        int i5 = f9505j + 93;
        f9502g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return blVarE;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9505j;
        int i4 = i3 + 41;
        f9502g = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i3 + 121;
            f9502g = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof bl)) {
            int i6 = i3 + 93;
            f9502g = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        bl blVar = (bl) obj;
        if (this.f9509d != blVar.f9509d) {
            int i8 = i3 + 37;
            f9502g = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.f9506a, blVar.f9506a))) {
            if (!Intrinsics.areEqual(this.f9510e, blVar.f9510e)) {
                int i10 = f9502g + 47;
                f9505j = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.f9508c, blVar.f9508c)) {
                if (this.f9507b == blVar.f9507b) {
                    return true;
                }
                int i12 = f9505j;
                int i13 = i12 + 109;
                f9502g = i13 % 128;
                int i14 = i13 % 2;
                int i15 = i12 + 89;
                f9502g = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            int i17 = f9505j + 71;
            f9502g = i17 % 128;
            int i18 = i17 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9505j + 107;
        f9502g = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.f9509d) * 31) + this.f9506a.hashCode()) * 31) + this.f9510e.hashCode()) * 31) + this.f9508c.hashCode()) * 31) + Integer.hashCode(this.f9507b);
        int i5 = f9505j + 83;
        f9502g = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9505j + 89;
        f9502g = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseValidateRfc(validRFC=" + this.f9509d + ", status=" + this.f9506a + ", message=" + this.f9510e + ", rfcType=" + this.f9508c + ", messageCode=" + this.f9507b + ")";
        int i5 = f9502g + 113;
        f9505j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

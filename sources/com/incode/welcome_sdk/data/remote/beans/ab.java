package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9199b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9200f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9201h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9202j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9203a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9206e;

    public ab(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.f9203a = str;
        this.f9204c = str2;
        this.f9206e = str3;
        this.f9205d = str4;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9199b + 85;
        f9201h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9203a;
        }
        throw null;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9199b + 115;
        f9201h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9204c;
        }
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9199b + 33;
        int i4 = i3 % 128;
        f9201h = i4;
        int i5 = i3 % 2;
        String str = this.f9206e;
        int i6 = i4 + 27;
        f9199b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9199b + 7;
        int i4 = i3 % 128;
        f9201h = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.f9205d;
        int i5 = i4 + 39;
        f9199b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9207b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9208d = 0;

        private e() {
        }

        @JvmStatic
        public static ab e(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String strOptString = jSONObject.optString("videoRecordingId");
            String strOptString2 = jSONObject.optString("sessionId");
            String strOptString3 = jSONObject.optString("token");
            String strOptString4 = jSONObject.optString("apiKey");
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            Intrinsics.checkNotNull(strOptString3);
            Intrinsics.checkNotNull(strOptString4);
            ab abVar = new ab(strOptString, strOptString2, strOptString3, strOptString4);
            int i3 = f9207b + 5;
            f9208d = i3 % 128;
            int i4 = i3 % 2;
            return abVar;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        new e((byte) 0);
        int i2 = f9202j + 29;
        f9200f = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final ab e(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9199b + 99;
        f9201h = i3 % 128;
        int i4 = i3 % 2;
        ab abVarE = e.e(responseBody);
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        return abVarE;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9199b + 43;
        f9201h = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (!Intrinsics.areEqual(this.f9203a, abVar.f9203a) || !Intrinsics.areEqual(this.f9204c, abVar.f9204c) || !Intrinsics.areEqual(this.f9206e, abVar.f9206e)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9205d, abVar.f9205d)) {
            return true;
        }
        int i5 = f9201h + 95;
        f9199b = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9201h + 43;
        f9199b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((this.f9203a.hashCode() * 31) + this.f9204c.hashCode()) * 31) + this.f9206e.hashCode()) * 31) + this.f9205d.hashCode();
        int i5 = f9201h + 29;
        f9199b = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9199b + 27;
        f9201h = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseCreateSession(videoRecordingId=" + this.f9203a + ", sessionId=" + this.f9204c + ", token=" + this.f9206e + ", openTokApiKey=" + this.f9205d + ")";
        int i5 = f9199b + 3;
        f9201h = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

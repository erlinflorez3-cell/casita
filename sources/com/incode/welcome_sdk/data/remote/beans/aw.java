package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class aw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9356b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9357c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9358d = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9359j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9360a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9361e;

    public aw(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f9360a = str;
        this.f9361e = str2;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9358d + 43;
        int i4 = i3 % 128;
        f9356b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f9360a;
        int i5 = i4 + 5;
        f9358d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9356b + 33;
        int i4 = i3 % 128;
        f9358d = i4;
        int i5 = i3 % 2;
        String str = this.f9361e;
        int i6 = i4 + 7;
        f9356b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9362a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9363d = 1;

        private d() {
        }

        @JvmStatic
        public static aw e(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("recordingId");
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            aw awVar = new aw(strOptString, strOptString2);
            int i3 = f9362a + 103;
            f9363d = i3 % 128;
            int i4 = i3 % 2;
            return awVar;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        new d((byte) 0);
        int i2 = f9359j + 13;
        f9357c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final aw b(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9358d + 71;
        f9356b = i3 % 128;
        int i4 = i3 % 2;
        aw awVarE = d.e(responseBody);
        int i5 = f9356b + 7;
        f9358d = i5 % 128;
        int i6 = i5 % 2;
        return awVarE;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9356b + 23;
            f9358d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj instanceof aw) {
            aw awVar = (aw) obj;
            if (Intrinsics.areEqual(this.f9360a, awVar.f9360a)) {
                return Intrinsics.areEqual(this.f9361e, awVar.f9361e);
            }
            int i5 = f9358d + 61;
            f9356b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = f9358d;
        int i8 = i7 + 101;
        f9356b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 5;
        f9356b = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9356b + 63;
        f9358d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f9360a.hashCode() * 31) + this.f9361e.hashCode();
        int i5 = f9356b + 123;
        f9358d = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9358d + 59;
        f9356b = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseGenerateSessionRecordingUrl(url=" + this.f9360a + ", recordingId=" + this.f9361e + ")";
        int i5 = f9356b + 101;
        f9358d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

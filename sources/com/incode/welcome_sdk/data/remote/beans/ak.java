package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9265a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9266d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9267e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9268j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9270c;

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9271b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9272e = 0;

        private c() {
        }

        @JvmStatic
        public static ak c(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String strOptString = jSONObject.optString("template");
            String strOptString2 = jSONObject.optString("templateId");
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            ak akVar = new ak(strOptString, strOptString2);
            int i3 = f9272e + 73;
            f9271b = i3 % 128;
            int i4 = i3 % 2;
            return akVar;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public ak(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f9269b = str;
        this.f9270c = str2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9266d;
        int i4 = i3 + 57;
        f9265a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9270c;
        int i6 = i3 + 51;
        f9265a = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9265a + 121;
        int i4 = i3 % 128;
        f9266d = i4;
        int i5 = i3 % 2;
        String str = this.f9269b;
        int i6 = i4 + 79;
        f9265a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        new c((byte) 0);
        int i2 = f9268j + 59;
        f9267e = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final ak e(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9266d + 101;
        f9265a = i3 % 128;
        int i4 = i3 % 2;
        ak akVarC = c.c(responseBody);
        int i5 = f9265a + 55;
        f9266d = i5 % 128;
        if (i5 % 2 != 0) {
            return akVarC;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9266d;
        int i4 = i3 + 25;
        int i5 = i4 % 128;
        f9265a = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = i3 + 79;
            f9265a = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof ak)) {
            int i9 = i5 + 59;
            f9266d = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        ak akVar = (ak) obj;
        if (!Intrinsics.areEqual(this.f9269b, akVar.f9269b)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9270c, akVar.f9270c)) {
            return true;
        }
        int i11 = f9265a + 61;
        f9266d = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9265a + 97;
        f9266d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f9269b.hashCode() * 31) + this.f9270c.hashCode();
        int i5 = f9265a + 27;
        f9266d = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9266d + 13;
        f9265a = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseFaceTemplate(template=" + this.f9269b + ", templateId=" + this.f9270c + ")";
        int i5 = f9266d + 5;
        f9265a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }
}

package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9297a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9298b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9299d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9300e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9301c;

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9302a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9303c = 1;

        private e() {
        }

        @JvmStatic
        public static am d(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            String strOptString = new JSONObject(responseBody.string()).optString("url");
            Intrinsics.checkNotNull(strOptString);
            am amVar = new am(strOptString);
            int i3 = f9303c + 71;
            f9302a = i3 % 128;
            int i4 = i3 % 2;
            return amVar;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    public am(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9301c = str;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f9300e + 27;
        int i4 = i3 % 128;
        f9299d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f9301c;
        int i5 = i4 + 81;
        f9300e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    static {
        new e((byte) 0);
        int i2 = f9297a + 81;
        f9298b = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final am a(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9299d + 9;
        f9300e = i3 % 128;
        int i4 = i3 % 2;
        am amVarD = e.d(responseBody);
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        int i6 = f9299d + 113;
        f9300e = i6 % 128;
        if (i6 % 2 != 0) {
            return amVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9299d + 121;
            f9300e = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(!(obj instanceof am))) {
            return Intrinsics.areEqual(this.f9301c, ((am) obj).f9301c);
        }
        int i5 = f9299d + 93;
        f9300e = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9299d + 117;
        f9300e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f9301c;
        if (i4 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9300e + 1;
        f9299d = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseExternalScreenGenerateUploadUrl(url=" + this.f9301c + ")";
        int i5 = f9299d + 93;
        f9300e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return str;
    }
}

package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class az {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9370b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9371c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9372d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9373e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9374a;

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9375d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9376e = 1;

        private c() {
        }

        @JvmStatic
        public static az a(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            String strOptString = new JSONObject(responseBody.string()).optString("id");
            Intrinsics.checkNotNull(strOptString);
            az azVar = new az(strOptString);
            int i3 = f9375d + 113;
            f9376e = i3 % 128;
            int i4 = i3 % 2;
            return azVar;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public az(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9374a = str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9373e + 41;
        f9371c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9374a;
        }
        throw null;
    }

    static {
        new c((byte) 0);
        int i2 = f9372d + 67;
        f9370b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final az a(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9373e + 73;
        f9371c = i3 % 128;
        int i4 = i3 % 2;
        az azVarA = c.a(responseBody);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = f9373e + 31;
        f9371c = i6 % 128;
        if (i6 % 2 != 0) {
            return azVarA;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9371c;
        int i4 = i3 + 57;
        f9373e = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            int i6 = i3 + 71;
            f9373e = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f9374a, ((az) obj).f9374a)) {
            return true;
        }
        int i8 = f9371c + 11;
        f9373e = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9373e + 43;
        f9371c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f9374a;
        if (i4 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9371c + 89;
        f9373e = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseInterviewEventsSingle(eventId=" + this.f9374a + ")";
        int i5 = f9371c + 33;
        f9373e = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9373e + 7;
        f9371c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f9374a;
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        return str;
    }
}

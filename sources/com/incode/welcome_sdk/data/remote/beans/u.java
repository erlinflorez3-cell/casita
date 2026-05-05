package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10065a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10066b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10067c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10068e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10069d;

    public u(boolean z2) {
        this.f10069d = z2;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f10067c;
        int i4 = i3 + 81;
        f10066b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10069d;
        int i6 = i3 + 105;
        f10066b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10070c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10071d = 1;

        private a() {
        }

        @JvmStatic
        public static u d(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            u uVar = new u(StringsKt.equals(new JSONObject(responseBody.string()).optString("result"), "PASSED", true));
            int i3 = f10070c + 33;
            f10071d = i3 % 128;
            if (i3 % 2 != 0) {
                return uVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        new a((byte) 0);
        int i2 = f10068e + 121;
        f10065a = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final u d(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f10067c + 89;
        f10066b = i3 % 128;
        int i4 = i3 % 2;
        u uVarD = a.d(responseBody);
        int i5 = f10066b + 11;
        f10067c = i5 % 128;
        if (i5 % 2 == 0) {
            return uVarD;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f10067c;
        int i4 = i3 + 103;
        int i5 = i4 % 128;
        f10066b = i5;
        if (i4 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            int i6 = i5 + 101;
            f10067c = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.f10069d != ((u) obj).f10069d) {
            return false;
        }
        int i8 = i3 + 23;
        f10066b = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f10067c + 51;
        f10066b = i3 % 128;
        if (i3 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.f10069d);
            int i4 = 49 / 0;
        } else {
            iHashCode = Boolean.hashCode(this.f10069d);
        }
        int i5 = f10066b + 67;
        f10067c = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f10066b + 101;
        f10067c = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "ResponseAntifraud(result=" + this.f10069d + ")";
            throw null;
        }
        String str2 = "ResponseAntifraud(result=" + this.f10069d + ")";
        int i4 = f10067c + 17;
        f10066b = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }
}

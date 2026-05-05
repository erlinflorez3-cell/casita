package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: c */
    public static final c f9690c = new c((byte) 0);

    /* JADX INFO: renamed from: g */
    private static int f9691g = 1;

    /* JADX INFO: renamed from: h */
    private static int f9692h = 0;

    /* JADX INFO: renamed from: i */
    private static int f9693i = 1;

    /* JADX INFO: renamed from: j */
    private static int f9694j = 0;

    /* JADX INFO: renamed from: a */
    private final String f9695a;

    /* JADX INFO: renamed from: b */
    private final String f9696b;

    /* JADX INFO: renamed from: d */
    private final String f9697d;

    /* JADX INFO: renamed from: e */
    private final String f9698e;

    public j(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9697d = str;
        this.f9695a = str2;
        this.f9696b = str3;
        this.f9698e = str4;
    }

    public static final class c {

        /* JADX INFO: renamed from: c */
        private static int f9699c = 0;

        /* JADX INFO: renamed from: e */
        private static int f9700e = 1;

        private c() {
        }

        @JvmStatic
        public static j a(JSONObject jSONObject) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String strOptString = jSONObject.optString("key");
            String strOptString2 = jSONObject.optString("status");
            String strOptString3 = jSONObject.optString("sub_label");
            String strOptString4 = jSONObject.optString("message");
            Intrinsics.checkNotNull(strOptString);
            j jVar = new j(strOptString, strOptString2, strOptString3, strOptString4);
            int i3 = f9700e + 37;
            f9699c = i3 % 128;
            if (i3 % 2 == 0) {
                return jVar;
            }
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9693i + 39;
        f9692h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!Intrinsics.areEqual(this.f9697d, jVar.f9697d)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9695a, jVar.f9695a)) {
            int i3 = f9691g + 45;
            f9694j = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f9696b, jVar.f9696b)) {
            return Intrinsics.areEqual(this.f9698e, jVar.f9698e);
        }
        int i5 = f9694j + 107;
        f9691g = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = this.f9697d.hashCode() * 31;
        String str = this.f9695a;
        int iHashCode3 = 0;
        int iHashCode4 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9696b;
        if (str2 == null) {
            int i3 = f9691g + 47;
            f9694j = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int i5 = (iHashCode4 + iHashCode) * 31;
        String str3 = this.f9698e;
        if (str3 == null) {
            int i6 = f9694j + 101;
            f9691g = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = str3.hashCode();
        }
        int i8 = i5 + iHashCode3;
        int i9 = f9694j + 123;
        f9691g = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9694j + 95;
        f9691g = i3 % 128;
        if (i3 % 2 == 0) {
            str = "EKYBResultCheck(key=" + this.f9697d + ", status=" + this.f9695a + ", subLabel=" + this.f9696b + ", message=" + this.f9698e + ")";
            int i4 = 96 / 0;
        } else {
            str = "EKYBResultCheck(key=" + this.f9697d + ", status=" + this.f9695a + ", subLabel=" + this.f9696b + ", message=" + this.f9698e + ")";
        }
        int i5 = f9694j + 95;
        f9691g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

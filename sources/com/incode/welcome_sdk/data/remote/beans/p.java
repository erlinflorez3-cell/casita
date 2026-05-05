package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.q;
import com.incode.welcome_sdk.modules.Modules;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f9750c = new d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9751d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9752e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f9753h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9754j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f9755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9756b;

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9757a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9758c = 1;

        private d() {
        }

        @JvmStatic
        public static p a(JSONObject jSONObject) {
            Modules modules;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String strOptString = jSONObject.optString("key");
            Modules[] modulesArrValues = Modules.values();
            int length = modulesArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    int i4 = f9758c + 111;
                    f9757a = i4 % 128;
                    int i5 = i4 % 2;
                    modules = modulesArrValues[i3];
                    if (Intrinsics.areEqual(modules.name(), strOptString)) {
                        int i6 = f9757a + 77;
                        f9758c = i6 % 128;
                        int i7 = i6 % 2;
                        break;
                    }
                    i3++;
                } else {
                    int i8 = f9757a + 83;
                    f9758c = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 / 5;
                    }
                    modules = null;
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("configuration");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if (modules == null) {
                return null;
            }
            Intrinsics.checkNotNull(strOptString);
            q.b bVar = q.f9760c;
            return new p(strOptString, q.b.e(modules, jSONObjectOptJSONObject));
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public p(String str, q qVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(qVar, "");
        this.f9756b = str;
        this.f9755a = qVar;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f9752e;
        int i4 = i3 + 1;
        f9751d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f9756b;
        int i5 = i3 + 45;
        f9751d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final q e() {
        q qVar;
        int i2 = 2 % 2;
        int i3 = f9751d;
        int i4 = i3 + 29;
        f9752e = i4 % 128;
        if (i4 % 2 == 0) {
            qVar = this.f9755a;
            int i5 = 3 / 0;
        } else {
            qVar = this.f9755a;
        }
        int i6 = i3 + 49;
        f9752e = i6 % 128;
        int i7 = i6 % 2;
        return qVar;
    }

    static {
        int i2 = f9754j + 91;
        f9753h = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9752e + 111;
            f9751d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof p)) {
            int i5 = f9751d + 109;
            f9752e = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        p pVar = (p) obj;
        if (!Intrinsics.areEqual(this.f9756b, pVar.f9756b)) {
            int i7 = f9752e + 15;
            f9751d = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f9755a, pVar.f9755a)) {
            return true;
        }
        int i9 = f9751d;
        int i10 = i9 + 41;
        f9752e = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 87;
        f9752e = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9751d + 55;
        f9752e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.f9756b.hashCode();
        return i4 == 0 ? (iHashCode / 124) - this.f9755a.hashCode() : (iHashCode * 31) + this.f9755a.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9751d + 21;
        f9752e = i3 % 128;
        if (i3 % 2 != 0) {
            return "Module(key=" + this.f9756b + ", configuration=" + this.f9755a + ")";
        }
        int i4 = 32 / 0;
        return "Module(key=" + this.f9756b + ", configuration=" + this.f9755a + ")";
    }
}

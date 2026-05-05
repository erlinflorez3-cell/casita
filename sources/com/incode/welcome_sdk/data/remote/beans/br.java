package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.bv;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.h;
import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class br {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9540g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9541i = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f9542k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f9543o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.incode.welcome_sdk.modules.h f9546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bv f9549f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9550h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bu f9551j;

    public br(String str, int i2, com.incode.welcome_sdk.modules.h hVar, String str2, String str3, String str4, bu buVar, bv bvVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hVar, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(buVar, "");
        this.f9545b = str;
        this.f9548e = i2;
        this.f9546c = hVar;
        this.f9544a = str2;
        this.f9547d = str3;
        this.f9550h = str4;
        this.f9551j = buVar;
        this.f9549f = bvVar;
    }

    public final com.incode.welcome_sdk.modules.h e() {
        int i2 = 2 % 2;
        int i3 = f9540g + 11;
        int i4 = i3 % 128;
        f9541i = i4;
        int i5 = i3 % 2;
        com.incode.welcome_sdk.modules.h hVar = this.f9546c;
        int i6 = i4 + 59;
        f9540g = i6 % 128;
        if (i6 % 2 == 0) {
            return hVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final bu c() {
        int i2 = 2 % 2;
        int i3 = f9540g;
        int i4 = i3 + 77;
        f9541i = i4 % 128;
        int i5 = i4 % 2;
        bu buVar = this.f9551j;
        int i6 = i3 + 35;
        f9541i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 88 / 0;
        }
        return buVar;
    }

    public final bv b() {
        int i2 = 2 % 2;
        int i3 = f9540g + 57;
        f9541i = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9549f;
        }
        throw null;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9552a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9553c = 1;

        private c() {
        }

        @JvmStatic
        public static br d(ResponseBody responseBody) throws JSONException, IOException {
            bv bvVarC;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String strOptString = jSONObject.optString("id");
            int iOptInt = jSONObject.optInt("createdAt");
            h.e eVar = com.incode.welcome_sdk.modules.h.f10702a;
            String strOptString2 = jSONObject.optString("nodeType");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            com.incode.welcome_sdk.modules.h hVarB = h.e.b(strOptString2);
            String strOptString3 = jSONObject.optString("workflowId");
            String strOptString4 = jSONObject.optString("parentNode");
            String strOptString5 = jSONObject.optString("successNode");
            String strOptString6 = jSONObject.optString("moduleKey");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("moduleConfiguration");
            if (jSONObjectOptJSONObject != null) {
                int i3 = f9552a + 65;
                f9553c = i3 % 128;
                int i4 = i3 % 2;
                bv.e eVar2 = bv.f9576b;
                bvVarC = bv.e.c(jSONObjectOptJSONObject);
            } else {
                bvVarC = null;
            }
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString3);
            Intrinsics.checkNotNull(strOptString4);
            Intrinsics.checkNotNull(strOptString5);
            Intrinsics.checkNotNull(strOptString6);
            br brVar = new br(strOptString, iOptInt, hVarB, strOptString3, strOptString4, strOptString5, new bu(strOptString6, Modules.isSupported(strOptString6)), bvVarC);
            int i5 = f9553c + 49;
            f9552a = i5 % 128;
            if (i5 % 2 == 0) {
                return brVar;
            }
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        new c((byte) 0);
        int i2 = f9542k + 41;
        f9543o = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final br e(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9541i + 107;
        f9540g = i3 % 128;
        int i4 = i3 % 2;
        br brVarD = c.d(responseBody);
        int i5 = f9541i + 111;
        f9540g = i5 % 128;
        if (i5 % 2 == 0) {
            return brVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9541i + 117;
        f9540g = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        if (!Intrinsics.areEqual(this.f9545b, brVar.f9545b)) {
            int i4 = f9541i + 33;
            f9540g = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.f9548e != brVar.f9548e) {
            int i5 = f9540g + 17;
            f9541i = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.f9546c != brVar.f9546c) {
            int i7 = f9541i + 53;
            f9540g = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f9544a, brVar.f9544a) || !Intrinsics.areEqual(this.f9547d, brVar.f9547d)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9550h, brVar.f9550h)) {
            return Intrinsics.areEqual(this.f9551j, brVar.f9551j) && Intrinsics.areEqual(this.f9549f, brVar.f9549f);
        }
        int i9 = f9541i + 79;
        f9540g = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int iHashCode2 = ((((((((((((this.f9545b.hashCode() * 31) + Integer.hashCode(this.f9548e)) * 31) + this.f9546c.hashCode()) * 31) + this.f9544a.hashCode()) * 31) + this.f9547d.hashCode()) * 31) + this.f9550h.hashCode()) * 31) + this.f9551j.hashCode()) * 31;
        bv bvVar = this.f9549f;
        if (bvVar == null) {
            int i3 = f9541i + 43;
            f9540g = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bvVar.hashCode();
            int i5 = f9541i + 105;
            f9540g = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = iHashCode2 + iHashCode;
        int i8 = f9541i + 103;
        f9540g = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9540g + 99;
        f9541i = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseWorkflowNode(id=" + this.f9545b + ", createdAt=" + this.f9548e + ", nodeType=" + this.f9546c + ", workflowId=" + this.f9544a + ", parentNode=" + this.f9547d + ", successNode=" + this.f9550h + ", moduleWrapper=" + this.f9551j + ", moduleConfiguration=" + this.f9549f + ")";
        int i5 = f9541i + 29;
        f9540g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

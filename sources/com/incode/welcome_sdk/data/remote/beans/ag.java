package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ag {

    /* JADX INFO: renamed from: a */
    private static int f9237a = 1;

    /* JADX INFO: renamed from: d */
    public static final c f9238d = new c((byte) 0);

    /* JADX INFO: renamed from: e */
    private static int f9239e = 0;

    /* JADX INFO: renamed from: f */
    private static int f9240f = 0;

    /* JADX INFO: renamed from: j */
    private static int f9241j = 1;

    /* JADX INFO: renamed from: b */
    private final String f9242b;

    /* JADX INFO: renamed from: c */
    private final String f9243c;

    public ag(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f9243c = str;
        this.f9242b = str2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9237a + 33;
        f9239e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9243c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class c implements bd<ag> {

        /* JADX INFO: renamed from: a */
        private static int f9244a = 1;

        /* JADX INFO: renamed from: e */
        private static int f9245e = 0;

        private c() {
        }

        @Override // com.incode.welcome_sdk.data.remote.beans.bd
        public final /* synthetic */ ag a(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            int i3 = f9245e + 117;
            f9244a = i3 % 128;
            if (i3 % 2 == 0) {
                b(responseBody);
                throw null;
            }
            ag agVarB = b(responseBody);
            int i4 = f9245e + 65;
            f9244a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
            return agVarB;
        }

        private static ag b(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String strOptString = jSONObject.optString("preSignedUrl");
            String strOptString2 = jSONObject.optString("referenceId");
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            ag agVar = new ag(strOptString, strOptString2);
            int i3 = f9244a + 101;
            f9245e = i3 % 128;
            if (i3 % 2 == 0) {
                return agVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9241j + 71;
        f9240f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9239e + 41;
            f9237a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if (Intrinsics.areEqual(this.f9243c, agVar.f9243c)) {
            return Intrinsics.areEqual(this.f9242b, agVar.f9242b);
        }
        int i5 = f9237a + 5;
        f9239e = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9239e + 5;
        f9237a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f9243c.hashCode() * 31) + this.f9242b.hashCode();
        int i5 = f9237a + 21;
        f9239e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9239e + 115;
        f9237a = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseDocumentUploadUrl(preSignedUrl=" + this.f9243c + ", referenceId=" + this.f9242b + ")";
        int i5 = f9239e + 105;
        f9237a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}

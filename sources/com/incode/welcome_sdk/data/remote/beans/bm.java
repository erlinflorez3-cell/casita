package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bm {

    /* JADX INFO: renamed from: a */
    private static int f9513a = 1;

    /* JADX INFO: renamed from: b */
    private static int f9514b = 0;

    /* JADX INFO: renamed from: c */
    public static final b f9515c = new b((byte) 0);

    /* JADX INFO: renamed from: f */
    private static int f9516f = 0;

    /* JADX INFO: renamed from: g */
    private static int f9517g = 1;

    /* JADX INFO: renamed from: d */
    private final boolean f9518d;

    /* JADX INFO: renamed from: e */
    private final String f9519e;

    public bm(boolean z2, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9518d = z2;
        this.f9519e = str;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9513a + 123;
        int i4 = i3 % 128;
        f9514b = i4;
        int i5 = i3 % 2;
        String str = this.f9519e;
        int i6 = i4 + 15;
        f9513a = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f9514b;
        int i4 = i3 + 13;
        f9513a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9518d;
        int i6 = i3 + 93;
        f9513a = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9513a + 35;
        f9514b = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseSignDocument(success=" + this.f9518d + ")";
        int i5 = f9513a + 87;
        f9514b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class b implements bd<bm> {

        /* JADX INFO: renamed from: d */
        private static int f9520d = 0;

        /* JADX INFO: renamed from: e */
        private static int f9521e = 1;

        private b() {
        }

        @Override // com.incode.welcome_sdk.data.remote.beans.bd
        public final /* synthetic */ bm a(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            int i3 = f9520d + 79;
            f9521e = i3 % 128;
            int i4 = i3 % 2;
            bm bmVarC = c(responseBody);
            int i5 = f9520d + 7;
            f9521e = i5 % 128;
            if (i5 % 2 != 0) {
                return bmVarC;
            }
            throw null;
        }

        private static bm c(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            boolean z2 = jSONObject.getBoolean(FirebaseAnalytics.Param.SUCCESS);
            String strOptString = jSONObject.optString("signedDocumentUrl");
            Intrinsics.checkNotNull(strOptString);
            bm bmVar = new bm(z2, strOptString);
            int i3 = f9521e + 29;
            f9520d = i3 % 128;
            if (i3 % 2 == 0) {
                return bmVar;
            }
            throw null;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9516f + 109;
        f9517g = i2 % 128;
        int i3 = i2 % 2;
    }
}

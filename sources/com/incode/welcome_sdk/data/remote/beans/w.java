package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10083c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10084d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10086b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10087e;

    private w(boolean z2, String str, String str2) {
        this.f10085a = z2;
        this.f10087e = str;
        this.f10086b = str2;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f10084d + 75;
        f10083c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10085a;
        }
        throw null;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f10083c + 33;
        int i4 = i3 % 128;
        f10084d = i4;
        int i5 = i3 % 2;
        String str = this.f10087e;
        int i6 = i4 + 87;
        f10083c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f10083c;
        int i4 = i3 + 37;
        f10084d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f10086b;
        int i6 = i3 + 13;
        f10084d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseApproveCustomer{success=").append(this.f10085a).append("uuid=").append(this.f10087e).append("token=").append(this.f10086b).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f10084d + 95;
        f10083c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return string;
    }

    public static w a(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        w wVar = new w(jSONObject.getBoolean(FirebaseAnalytics.Param.SUCCESS), jSONObject.optString("uuid"), jSONObject.optString("token"));
        int i3 = f10084d + 125;
        f10083c = i3 % 128;
        int i4 = i3 % 2;
        return wVar;
    }
}

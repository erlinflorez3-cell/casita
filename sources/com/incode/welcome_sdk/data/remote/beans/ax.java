package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ax {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9364c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9365e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9366b;

    private ax(String str) {
        this.f9366b = str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9365e + 3;
        int i4 = i3 % 128;
        f9364c = i4;
        int i5 = i3 % 2;
        String str = this.f9366b;
        int i6 = i4 + 59;
        f9365e = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGeolocation{location=").append(this.f9366b).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9365e + 123;
        f9364c = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static ax d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        ax axVar = new ax(new JSONObject(responseBody.string()).getString(FirebaseAnalytics.Param.LOCATION));
        int i3 = f9364c + 41;
        f9365e = i3 % 128;
        if (i3 % 2 != 0) {
            return axVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

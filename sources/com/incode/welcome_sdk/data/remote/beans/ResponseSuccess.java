package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseSuccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9172a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9173d = 1;
    private boolean success;

    public ResponseSuccess(boolean z2) {
        this.success = z2;
    }

    public boolean isSuccess() {
        int i2 = 2 % 2;
        int i3 = f9172a;
        int i4 = i3 + 87;
        f9173d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.success;
        int i6 = i3 + 33;
        f9173d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public void setSuccess(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f9172a;
        int i4 = i3 + 123;
        f9173d = i4 % 128;
        int i5 = i4 % 2;
        this.success = z2;
        int i6 = i3 + 123;
        f9173d = i6 % 128;
        int i7 = i6 % 2;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseSuccess{success=").append(this.success).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9172a + 77;
        f9173d = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static ResponseSuccess parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        ResponseSuccess responseSuccess = new ResponseSuccess(new JSONObject(responseBody.string()).getBoolean(FirebaseAnalytics.Param.SUCCESS));
        int i3 = f9172a + 49;
        f9173d = i3 % 128;
        int i4 = i3 % 2;
        return responseSuccess;
    }
}

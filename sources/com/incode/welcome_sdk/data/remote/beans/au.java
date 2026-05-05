package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class au {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9350b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9351d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9352a;

    private au(int i2) {
        this.f9352a = i2;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f9351d;
        int i4 = i3 + 85;
        f9350b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.f9352a;
        int i6 = i3 + 43;
        f9350b = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGetCustomerQueuePosition{index=").append(this.f9352a).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9350b + 93;
        f9351d = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static au d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        au auVar = new au(new JSONObject(responseBody.string()).getInt(FirebaseAnalytics.Param.INDEX));
        int i3 = f9351d + 101;
        f9350b = i3 % 128;
        int i4 = i3 % 2;
        return auVar;
    }
}

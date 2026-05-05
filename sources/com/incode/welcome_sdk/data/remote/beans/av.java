package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class av {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9353b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9354d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9355a;

    private av(String str) {
        this.f9355a = str;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9353b + 45;
        f9354d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f9355a;
        if (i4 == 0) {
            int i5 = 19 / 0;
        }
        return str;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGenerateVideoSelfieUrl{url=").append(this.f9355a).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9353b + 3;
        f9354d = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static av a(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        av avVar = new av(new JSONObject(responseBody.string()).optString("url"));
        int i3 = f9353b + 87;
        f9354d = i3 % 128;
        int i4 = i3 % 2;
        return avVar;
    }
}

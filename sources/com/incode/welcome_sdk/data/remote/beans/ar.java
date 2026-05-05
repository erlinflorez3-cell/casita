package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9334a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9335b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9336d;

    private ar(String str) {
        this.f9336d = str;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f9334a + 93;
        int i4 = i3 % 128;
        f9335b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f9336d;
        int i5 = i4 + 19;
        f9334a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGenerateInterviewCode{interviewCode=").append(this.f9336d).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9334a + 123;
        f9335b = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static ar e(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        ar arVar = new ar(new JSONObject(responseBody.string()).getString("interviewCode"));
        int i3 = f9335b + 5;
        f9334a = i3 % 128;
        int i4 = i3 % 2;
        return arVar;
    }
}

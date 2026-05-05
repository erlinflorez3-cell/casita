package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ay {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9367b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9368d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9369a;

    private ay(int i2) {
        this.f9369a = i2;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f9368d + 45;
        int i4 = i3 % 128;
        f9367b = i4;
        int i5 = i3 % 2;
        int i6 = this.f9369a;
        int i7 = i4 + 5;
        f9368d = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGovernmentValidation{statusCode=").append(this.f9369a).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9367b + 75;
        f9368d = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ay c(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        ay ayVar = new ay(new JSONObject(responseBody.string()).getInt("statusCode"));
        int i3 = f9367b + 71;
        f9368d = i3 % 128;
        int i4 = i3 % 2;
        return ayVar;
    }
}

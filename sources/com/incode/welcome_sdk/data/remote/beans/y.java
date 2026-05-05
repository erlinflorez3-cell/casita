package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10096b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10097c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10098e;

    private y(int i2) {
        this.f10098e = i2;
    }

    public final int e() {
        int i2 = 2 % 2;
        int i3 = f10097c;
        int i4 = i3 + 53;
        f10096b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f10098e;
        int i7 = i3 + 47;
        f10096b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseAddToQueue{, waitingTimeInSeconds=").append(this.f10098e).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f10096b + 103;
        f10097c = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static y d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        y yVar = new y(new JSONObject(responseBody.string()).getInt("waitingTimeInSeconds"));
        int i3 = f10097c + 3;
        f10096b = i3 % 128;
        int i4 = i3 % 2;
        return yVar;
    }
}

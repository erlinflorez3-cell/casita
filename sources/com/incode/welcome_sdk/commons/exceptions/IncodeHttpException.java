package com.incode.welcome_sdk.commons.exceptions;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeHttpException extends HttpException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5030a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5031d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5033c;

    public IncodeHttpException(Response<?> response) {
        String string;
        ResponseBody responseBodyErrorBody;
        super(response);
        String strString = (response == null || (responseBodyErrorBody = response.errorBody()) == null || (strString = responseBodyErrorBody.string()) == null) ? "" : strString;
        this.f5033c = strString;
        try {
            string = new JSONObject(strString).getString("message");
            Intrinsics.checkNotNull(string);
        } catch (Exception unused) {
            string = "No message available";
        }
        this.f5032b = string;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f5030a;
        int i4 = i3 + 37;
        f5031d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f5033c;
        int i6 = i3 + 115;
        f5031d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f5030a;
        int i4 = i3 + 39;
        f5031d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f5032b;
        int i6 = i3 + 49;
        f5031d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}

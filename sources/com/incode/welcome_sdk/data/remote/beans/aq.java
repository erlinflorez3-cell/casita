package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9331a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9332e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9333c;

    private aq(boolean z2) {
        this.f9333c = z2;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f9331a + 105;
        int i4 = i3 % 128;
        f9332e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9333c;
        int i6 = i4 + 47;
        f9331a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public static aq d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        aq aqVar = new aq(new JSONObject(responseBody.string()).optBoolean("finished"));
        int i3 = f9332e + 41;
        f9331a = i3 % 128;
        if (i3 % 2 != 0) {
            return aqVar;
        }
        throw null;
    }
}

package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class aa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9196c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9197d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9198e;

    private aa(String str) {
        this.f9198e = str;
    }

    public static aa b(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        aa aaVar = new aa(new JSONObject(responseBody.string()).getString("decrypted"));
        int i3 = f9197d + 47;
        f9196c = i3 % 128;
        int i4 = i3 % 2;
        return aaVar;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseDecryptedData{decrypted='").append(this.f9198e).append("'}").toString();
        int i3 = f9197d + 87;
        f9196c = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

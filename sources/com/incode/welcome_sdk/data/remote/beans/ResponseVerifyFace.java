package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseVerifyFace {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9174c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9175d = 1;
    private double confidence;

    public ResponseVerifyFace(double d2) {
        this.confidence = d2;
    }

    public double getConfidence() {
        int i2 = 2 % 2;
        int i3 = f9174c + 67;
        f9175d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.confidence;
        }
        int i4 = 69 / 0;
        return this.confidence;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseVerifyFace{, confidence=").append(this.confidence).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9175d + 57;
        f9174c = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static ResponseVerifyFace parse(ResponseBody responseBody) throws JSONException, IOException {
        double d2;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        if (jSONObject.has("confidence")) {
            int i3 = f9174c + 41;
            f9175d = i3 % 128;
            if (i3 % 2 == 0) {
                d2 = jSONObject.getDouble("confidence");
                int i4 = 63 / 0;
            } else {
                d2 = jSONObject.getDouble("confidence");
            }
        } else {
            int i5 = f9174c + 19;
            f9175d = i5 % 128;
            int i6 = i5 % 2;
            d2 = -1.0d;
        }
        return new ResponseVerifyFace(d2);
    }
}

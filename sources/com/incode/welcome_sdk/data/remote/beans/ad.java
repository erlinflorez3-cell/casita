package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ad {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9217e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9218f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f9222d;

    public ad() {
        this.f9219a = null;
        this.f9221c = false;
        this.f9220b = 0;
        this.f9222d = -1.0d;
    }

    private ad(String str, boolean z2, int i2, double d2) {
        this.f9219a = str;
        this.f9221c = z2;
        this.f9220b = i2;
        this.f9222d = d2;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f9218f;
        int i4 = i3 + 65;
        f9217e = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9221c;
        int i6 = i3 + 107;
        f9217e = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final double d() {
        int i2 = 2 % 2;
        int i3 = f9217e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9218f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9222d;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseCompareId{typeOfId='").append(this.f9219a).append("', idTypeMatched=").append(this.f9221c).append(", issueYear=").append(this.f9220b).append(", faceRecognitionConfidence=").append(this.f9222d).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9218f + 103;
        f9217e = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static ad d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        ad adVar = new ad(jSONObject.optString("typeOfId"), jSONObject.optBoolean("idTypeMatched"), jSONObject.optInt("issueYear"), jSONObject.optDouble("faceRecognitionConfidence"));
        int i3 = f9217e + 55;
        f9218f = i3 % 128;
        int i4 = i3 % 2;
        return adVar;
    }
}

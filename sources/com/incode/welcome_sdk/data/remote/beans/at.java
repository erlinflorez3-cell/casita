package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class at {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9344b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9345g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9346a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9349e;

    private at(String str, String str2, String str3, String str4) {
        this.f9346a = str;
        this.f9349e = str2;
        this.f9347c = str3;
        this.f9348d = str4;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9345g;
        int i4 = i3 + 87;
        f9344b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9346a;
        int i6 = i3 + 39;
        f9344b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9345g;
        int i4 = i3 + 79;
        f9344b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9349e;
        int i6 = i3 + 97;
        f9344b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
        return str;
    }

    public final String b() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9344b;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9345g = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.f9347c;
            int i5 = 78 / 0;
        } else {
            str = this.f9347c;
        }
        int i6 = i3 + 9;
        f9345g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9345g;
        int i4 = i3 + 55;
        f9344b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9348d;
        int i6 = i3 + 85;
        f9344b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 13 / 0;
        }
        return str;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGetInterviewerInfo{interviewerName='").append(this.f9346a).append("', interviewToken='").append(this.f9349e).append("', sessionId='").append(this.f9347c).append("', openTokApiKey='").append(this.f9348d).append("'}").toString();
        int i3 = f9345g + 57;
        f9344b = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static at a(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        at atVar = new at(jSONObject.optString("interviewerName"), jSONObject.getString("interviewToken"), jSONObject.getString("sessionId"), jSONObject.getString("apiKey"));
        int i3 = f9344b + 123;
        f9345g = i3 % 128;
        if (i3 % 2 != 0) {
            return atVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

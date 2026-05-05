package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.util.Pair;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class bj {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9489f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f9490i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IdVerificationResults f9491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Pair<String, ResultsStatus> f9492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FacialRecognitionResults f9493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GovernmentValidationResults f9494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LivenessCheckResults f9495e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f9496h;

    public bj() {
    }

    private bj(Pair<String, ResultsStatus> pair, IdVerificationResults idVerificationResults, LivenessCheckResults livenessCheckResults, FacialRecognitionResults facialRecognitionResults, GovernmentValidationResults governmentValidationResults, Map<String, Object> map) {
        this.f9492b = pair;
        this.f9491a = idVerificationResults;
        this.f9495e = livenessCheckResults;
        this.f9493c = facialRecognitionResults;
        this.f9494d = governmentValidationResults;
        this.f9496h = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return r5.getString(com.incode.welcome_sdk.R.string.onboard_sdk_results_needs_review);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r4.f9492b != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r5.getString(com.incode.welcome_sdk.R.string.onboard_sdk_results_needs_review);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return java.lang.String.format("%s/100", r4.f9492b.first);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r4.f9492b != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r4.f9492b.second != com.incode.welcome_sdk.data.remote.beans.ResultsStatus.MANUAL) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r1 = com.incode.welcome_sdk.data.remote.beans.bj.f9489f + 77;
        com.incode.welcome_sdk.data.remote.beans.bj.f9490i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(android.content.Context r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.remote.beans.bj.f9490i
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.bj.f9489f = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L31
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r1 = r4.f9492b
            r0 = 83
            int r0 = r0 / 0
            if (r1 == 0) goto L4b
        L17:
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r0 = r4.f9492b
            S r1 = r0.second
            com.incode.welcome_sdk.data.remote.beans.ResultsStatus r0 = com.incode.welcome_sdk.data.remote.beans.ResultsStatus.MANUAL
            if (r1 != r0) goto L3c
            int r0 = com.incode.welcome_sdk.data.remote.beans.bj.f9489f
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.bj.f9490i = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L36
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_results_needs_review
            java.lang.String r0 = r5.getString(r0)
            return r0
        L31:
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r0 = r4.f9492b
            if (r0 == 0) goto L4b
            goto L17
        L36:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_results_needs_review
            r5.getString(r0)
            throw r2
        L3c:
            androidx.core.util.Pair<java.lang.String, com.incode.welcome_sdk.data.remote.beans.ResultsStatus> r0 = r4.f9492b
            F r0 = r0.first
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s/100"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.bj.c(android.content.Context):java.lang.String");
    }

    public final ResultsStatus c() {
        int i2 = 2 % 2;
        int i3 = f9490i;
        int i4 = i3 + 17;
        f9489f = i4 % 128;
        int i5 = i4 % 2;
        Pair<String, ResultsStatus> pair = this.f9492b;
        if (pair != null) {
            int i6 = i3 + 31;
            f9489f = i6 % 128;
            int i7 = i6 % 2;
            return pair.second;
        }
        int i8 = i3 + 55;
        f9489f = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public final IdVerificationResults a() {
        int i2 = 2 % 2;
        int i3 = f9490i + 43;
        f9489f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9491a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LivenessCheckResults e() {
        int i2 = 2 % 2;
        int i3 = f9490i + 121;
        f9489f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9495e;
        }
        throw null;
    }

    public final FacialRecognitionResults b() {
        FacialRecognitionResults facialRecognitionResults;
        int i2 = 2 % 2;
        int i3 = f9489f + 115;
        int i4 = i3 % 128;
        f9490i = i4;
        if (i3 % 2 != 0) {
            facialRecognitionResults = this.f9493c;
            int i5 = 89 / 0;
        } else {
            facialRecognitionResults = this.f9493c;
        }
        int i6 = i4 + 69;
        f9489f = i6 % 128;
        int i7 = i6 % 2;
        return facialRecognitionResults;
    }

    public final GovernmentValidationResults d() {
        GovernmentValidationResults governmentValidationResults;
        int i2 = 2 % 2;
        int i3 = f9489f + 121;
        int i4 = i3 % 128;
        f9490i = i4;
        if (i3 % 2 != 0) {
            governmentValidationResults = this.f9494d;
            int i5 = 21 / 0;
        } else {
            governmentValidationResults = this.f9494d;
        }
        int i6 = i4 + 69;
        f9489f = i6 % 128;
        int i7 = i6 % 2;
        return governmentValidationResults;
    }

    public final Map<String, Object> i() {
        Map<String, Object> map;
        int i2 = 2 % 2;
        int i3 = f9489f + 93;
        int i4 = i3 % 128;
        f9490i = i4;
        if (i3 % 2 != 0) {
            map = this.f9496h;
            int i5 = 99 / 0;
        } else {
            map = this.f9496h;
        }
        int i6 = i4 + 51;
        f9489f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return map;
    }

    public static bj c(ResponseBody responseBody) throws JSONException, IOException {
        IdVerificationResults idVerificationResults;
        LivenessCheckResults livenessCheckResults;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("overall");
        GovernmentValidationResults governmentValidationResults = null;
        Pair<String, ResultsStatus> pairE = jSONObjectOptJSONObject != null ? com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("idValidation");
        if (jSONObjectOptJSONObject2 != null) {
            int i3 = f9490i + 17;
            f9489f = i3 % 128;
            int i4 = i3 % 2;
            idVerificationResults = IdVerificationResults.parse(jSONObjectOptJSONObject2);
        } else {
            idVerificationResults = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("liveness");
        if (jSONObjectOptJSONObject3 != null) {
            int i5 = f9489f + 103;
            f9490i = i5 % 128;
            if (i5 % 2 != 0) {
                livenessCheckResults = LivenessCheckResults.parse(jSONObjectOptJSONObject3);
                int i6 = 14 / 0;
            } else {
                livenessCheckResults = LivenessCheckResults.parse(jSONObjectOptJSONObject3);
            }
        } else {
            livenessCheckResults = null;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("faceRecognition");
        FacialRecognitionResults facialRecognitionResults = jSONObjectOptJSONObject4 != null ? FacialRecognitionResults.parse(jSONObjectOptJSONObject4) : null;
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("governmentValidation");
        if (jSONObjectOptJSONObject5 != null) {
            governmentValidationResults = GovernmentValidationResults.parse(jSONObjectOptJSONObject5);
            int i7 = f9489f + 3;
            f9490i = i7 % 128;
            int i8 = i7 % 2;
        }
        bj bjVar = new bj(pairE, idVerificationResults, livenessCheckResults, facialRecognitionResults, governmentValidationResults, com.incode.welcome_sdk.commons.utils.u.c(jSONObject));
        int i9 = f9489f + 59;
        f9490i = i9 % 128;
        int i10 = i9 % 2;
        return bjVar;
    }
}

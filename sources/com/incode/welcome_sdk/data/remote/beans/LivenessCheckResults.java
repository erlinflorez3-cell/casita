package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.util.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class LivenessCheckResults extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9117b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9118c = 0;
    private Pair<String, ResultsStatus> mLivenessScore;
    private String mPhotoQuality;

    private LivenessCheckResults(Pair<String, ResultsStatus> pair, Pair<String, ResultsStatus> pair2, String str) {
        super(pair);
        this.mLivenessScore = pair2;
        this.mPhotoQuality = str;
    }

    public Pair<String, ResultsStatus> getLivenessScore() {
        int i2 = 2 % 2;
        int i3 = f9118c + 13;
        int i4 = i3 % 128;
        f9117b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Pair<String, ResultsStatus> pair = this.mLivenessScore;
        int i5 = i4 + 1;
        f9118c = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    public String getPhotoQuality() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9117b + 45;
        int i4 = i3 % 128;
        f9118c = i4;
        if (i3 % 2 != 0) {
            str = this.mPhotoQuality;
            int i5 = 51 / 0;
        } else {
            str = this.mPhotoQuality;
        }
        int i6 = i4 + 89;
        f9117b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static LivenessCheckResults parse(JSONObject jSONObject) {
        Pair<String, ResultsStatus> pairE;
        int i2 = 2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("overall");
        String strOptString = null;
        Pair<String, ResultsStatus> pairE2 = jSONObjectOptJSONObject != null ? com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("livenessScore");
        if (jSONObjectOptJSONObject2 != null) {
            int i3 = f9117b + 13;
            f9118c = i3 % 128;
            if (i3 % 2 != 0) {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject2);
                int i4 = 95 / 0;
            } else {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject2);
            }
        } else {
            pairE = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("photoQuality");
        if (jSONObjectOptJSONObject3 != null) {
            int i5 = f9117b + 61;
            f9118c = i5 % 128;
            if (i5 % 2 != 0) {
                strOptString = jSONObjectOptJSONObject3.optString("value");
                int i6 = 65 / 0;
            } else {
                strOptString = jSONObjectOptJSONObject3.optString("value");
            }
        }
        return new LivenessCheckResults(pairE2, pairE, strOptString);
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("LivenessCheckResults{mOverallScore=").append(getOverallScore()).append(", mPhotoQuality='").append(this.mPhotoQuality).append("'}").toString();
        int i3 = f9118c + 95;
        f9117b = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}

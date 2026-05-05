package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.util.Pair;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class FacialRecognitionResults extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f9094a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9095b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9096c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f9097d = 0;
    private boolean mExistingUser;

    private FacialRecognitionResults(Pair<String, ResultsStatus> pair, boolean z2) {
        super(pair);
        this.mExistingUser = z2;
    }

    public boolean isExistingUser() {
        int i2 = 2 % 2;
        int i3 = f9095b + 95;
        f9096c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.mExistingUser;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FacialRecognitionResults parse(JSONObject jSONObject) {
        Pair<String, ResultsStatus> pairE;
        int i2 = 2 % 2;
        int i3 = f9096c + 25;
        f9095b = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("overall");
        if (jSONObjectOptJSONObject != null) {
            int i5 = f9096c + 79;
            f9095b = i5 % 128;
            if (i5 % 2 == 0) {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject);
                int i6 = 70 / 0;
            } else {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject);
            }
        } else {
            pairE = null;
        }
        return new FacialRecognitionResults(pairE, jSONObject.optBoolean("existingUser"));
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("FacialRecognitionResults{mExistingUser=").append(this.mExistingUser).append(", mOverallScore=").append(getOverallScore()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9095b + 55;
        f9096c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return string;
    }

    public static int d() {
        int i2 = f9097d;
        int i3 = i2 % 8862183;
        f9097d = i2 + 1;
        if (i3 != 0) {
            return f9094a;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        f9094a = iMaxMemory;
        return iMaxMemory;
    }
}

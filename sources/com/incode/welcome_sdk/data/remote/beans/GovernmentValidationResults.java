package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class GovernmentValidationResults extends b {

    /* JADX INFO: renamed from: b */
    private static int f9113b = 0;

    /* JADX INFO: renamed from: e */
    private static int f9114e = 1;
    private LinkedHashMap<String, Pair<String, ResultsStatus>> mOcrValidationMap;
    private final Pair<String, ResultsStatus> mRecognitionConfidence;
    private final Pair<String, Pair<String, ResultsStatus>> mStatus;

    private GovernmentValidationResults(Pair<String, ResultsStatus> pair, Pair<String, Pair<String, ResultsStatus>> pair2, Pair<String, ResultsStatus> pair3, LinkedHashMap<String, Pair<String, ResultsStatus>> linkedHashMap) {
        super(pair);
        this.mStatus = pair2;
        this.mRecognitionConfidence = pair3;
        this.mOcrValidationMap = linkedHashMap;
        if (linkedHashMap == null) {
            this.mOcrValidationMap = new LinkedHashMap<>();
            return;
        }
        Iterator<Map.Entry<String, Pair<String, ResultsStatus>>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Pair<String, ResultsStatus>> next = it.next();
            if (next.getValue() != null && ResultsStatus.UNKNOWN == next.getValue().second) {
                it.remove();
            }
        }
    }

    public Pair<String, ResultsStatus> getRecognitionConfidence() {
        int i2 = 2 % 2;
        int i3 = f9113b;
        int i4 = i3 + 29;
        f9114e = i4 % 128;
        int i5 = i4 % 2;
        Pair<String, ResultsStatus> pair = this.mRecognitionConfidence;
        int i6 = i3 + 13;
        f9114e = i6 % 128;
        int i7 = i6 % 2;
        return pair;
    }

    public LinkedHashMap<String, Pair<String, ResultsStatus>> getOcrValidationMap() {
        int i2 = 2 % 2;
        int i3 = f9113b + 11;
        f9114e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.mOcrValidationMap;
        }
        throw null;
    }

    public Pair<String, Pair<String, ResultsStatus>> getStatus() {
        int i2 = 2 % 2;
        int i3 = f9114e;
        int i4 = i3 + 39;
        f9113b = i4 % 128;
        int i5 = i4 % 2;
        Pair<String, Pair<String, ResultsStatus>> pair = this.mStatus;
        int i6 = i3 + 111;
        f9113b = i6 % 128;
        int i7 = i6 % 2;
        return pair;
    }

    public static GovernmentValidationResults parse(JSONObject jSONObject) {
        Pair<String, Pair<String, ResultsStatus>> pairA;
        int i2 = 2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("overall");
        Pair<String, ResultsStatus> pairE = null;
        Pair<String, ResultsStatus> pairE2 = jSONObjectOptJSONObject != null ? com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validationStatus");
        if (jSONObjectOptJSONObject2 == null) {
            pairA = null;
        } else {
            int i3 = f9114e + 81;
            f9113b = i3 % 128;
            if (i3 % 2 == 0) {
                pairA = com.incode.welcome_sdk.commons.utils.u.a(jSONObjectOptJSONObject2);
            } else {
                com.incode.welcome_sdk.commons.utils.u.a(jSONObjectOptJSONObject2);
                pairE.hashCode();
                throw null;
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("recognitionConfidence");
        if (jSONObjectOptJSONObject3 != null) {
            int i4 = f9114e + 113;
            f9113b = i4 % 128;
            if (i4 % 2 != 0) {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject3);
                int i5 = 86 / 0;
            } else {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject3);
            }
        }
        return new GovernmentValidationResults(pairE2, pairA, pairE, com.incode.welcome_sdk.commons.utils.u.d(com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "ocrValidation")));
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("GovernmentValidationResults{mStatus=").append(this.mStatus).append(", mRecognitionConfidence=").append(this.mRecognitionConfidence).append(", mOcrValidationMap=").append(this.mOcrValidationMap).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9114e + 57;
        f9113b = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

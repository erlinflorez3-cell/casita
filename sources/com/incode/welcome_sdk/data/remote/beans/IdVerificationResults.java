package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IdVerificationResults extends b {

    /* JADX INFO: renamed from: a */
    private static int f9115a = 0;

    /* JADX INFO: renamed from: c */
    private static int f9116c = 1;
    private LinkedHashMap<String, Pair<String, ResultsStatus>> mIdSpecificMap;
    private LinkedHashMap<String, Pair<String, ResultsStatus>> mPhotoSecurityAndQualityMap;

    private IdVerificationResults(Pair<String, ResultsStatus> pair, LinkedHashMap<String, Pair<String, ResultsStatus>> linkedHashMap, LinkedHashMap<String, Pair<String, ResultsStatus>> linkedHashMap2) {
        super(pair);
        this.mPhotoSecurityAndQualityMap = linkedHashMap;
        if (linkedHashMap == null) {
            this.mPhotoSecurityAndQualityMap = new LinkedHashMap<>();
        } else {
            Iterator<Map.Entry<String, Pair<String, ResultsStatus>>> it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Pair<String, ResultsStatus>> next = it.next();
                if (next.getValue() != null && ResultsStatus.UNKNOWN == next.getValue().second) {
                    it.remove();
                }
            }
        }
        this.mIdSpecificMap = linkedHashMap2;
        if (linkedHashMap2 == null) {
            this.mIdSpecificMap = new LinkedHashMap<>();
        }
    }

    public LinkedHashMap<String, Pair<String, ResultsStatus>> getPhotoSecurityAndQualityMap() {
        int i2 = 2 % 2;
        int i3 = f9115a + 31;
        int i4 = i3 % 128;
        f9116c = i4;
        int i5 = i3 % 2;
        LinkedHashMap<String, Pair<String, ResultsStatus>> linkedHashMap = this.mPhotoSecurityAndQualityMap;
        int i6 = i4 + 3;
        f9115a = i6 % 128;
        if (i6 % 2 == 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LinkedHashMap<String, Pair<String, ResultsStatus>> getIdSpecificMap() {
        int i2 = 2 % 2;
        int i3 = f9115a + 81;
        int i4 = i3 % 128;
        f9116c = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinkedHashMap<String, Pair<String, ResultsStatus>> linkedHashMap = this.mIdSpecificMap;
        int i5 = i4 + 31;
        f9115a = i5 % 128;
        int i6 = i5 % 2;
        return linkedHashMap;
    }

    public static IdVerificationResults parse(JSONObject jSONObject) {
        Pair<String, ResultsStatus> pairE;
        int i2 = 2 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("overall");
        if (jSONObjectOptJSONObject != null) {
            int i3 = f9116c + 91;
            f9115a = i3 % 128;
            if (i3 % 2 != 0) {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject);
                int i4 = 59 / 0;
            } else {
                pairE = com.incode.welcome_sdk.commons.utils.u.e(jSONObjectOptJSONObject);
            }
        } else {
            pairE = null;
        }
        IdVerificationResults idVerificationResults = new IdVerificationResults(pairE, com.incode.welcome_sdk.commons.utils.u.d(com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "photoSecurityAndQuality")), com.incode.welcome_sdk.commons.utils.u.d(com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "idSpecific")));
        int i5 = f9116c + 71;
        f9115a = i5 % 128;
        if (i5 % 2 == 0) {
            return idVerificationResults;
        }
        throw null;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("IdVerificationResults{mOverallScore=").append(getOverallScore()).append(", mPhotoSecurityAndQualityMap=").append(this.mPhotoSecurityAndQualityMap).append(", mIdSpecificMap=").append(this.mIdSpecificMap).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9115a + 71;
        f9116c = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }
}

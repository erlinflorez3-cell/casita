package com.ticnow.sdk.idnowonboarding.services.reintents.reintentsParser;

import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ReintentsServicesReponseParser {
    public static IdNowCommonResponse getEnrollmentReintentNewsResponse(String str) {
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("code")) {
                idNowCommonResponse.setCode("500");
            } else {
                idNowCommonResponse.setCode(jSONObject.getString("code"));
            }
            if (jSONObject.isNull("description")) {
                idNowCommonResponse.setDescription("General Error");
            } else {
                idNowCommonResponse.setDescription(jSONObject.getString("description"));
            }
            return idNowCommonResponse;
        } catch (Throwable unused) {
            idNowCommonResponse.setCode("500");
            idNowCommonResponse.setDescription("General Error");
            return idNowCommonResponse;
        }
    }

    public static IdNowCommonResponse getUpdateEnrollmentReintentNewsResponse(String str) {
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("code")) {
                idNowCommonResponse.setCode("500");
            } else {
                idNowCommonResponse.setCode(jSONObject.getString("code"));
            }
            if (jSONObject.isNull("description")) {
                idNowCommonResponse.setDescription("General Error");
            } else {
                idNowCommonResponse.setDescription(jSONObject.getString("description"));
            }
            return idNowCommonResponse;
        } catch (Throwable unused) {
            idNowCommonResponse.setCode("500");
            idNowCommonResponse.setDescription("General Error");
            return idNowCommonResponse;
        }
    }
}

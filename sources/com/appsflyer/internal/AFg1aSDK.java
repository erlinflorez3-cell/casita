package com.appsflyer.internal;

import androidx.webkit.ProxyConfig;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1aSDK {
    public static String getCurrencyIso4217Code(String str) {
        return str.length() > 20 ? new StringBuilder().append(str.substring(0, 10)).append("...").toString() : str;
    }

    private static String getMediationNetwork(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (i2 == 0 || i2 == str.length() - 1) {
                sb.append(str.charAt(i2));
            } else {
                sb.append(ProxyConfig.MATCH_ALL_SCHEMES);
            }
        }
        return sb.toString();
    }

    public static void getRevenue(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getMediationNetwork(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getCurrencyIso4217Code("tcstring"));
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", getCurrencyIso4217Code("referrer"));
                }
                AFLogger.INSTANCE.i(AFg1cSDK.OTHER, new StringBuilder().append(str).append(jSONObject).toString());
            } catch (JSONException e2) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e2);
            }
        }
    }
}

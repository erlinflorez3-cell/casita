package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getCurrencyIso4217Code(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L46
            r3.<init>()     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "status"
            java.lang.String r0 = "failure"
            r3.put(r1, r0)     // Catch: org.json.JSONException -> L46
            java.lang.String r0 = "data"
            r3.put(r0, r8)     // Catch: org.json.JSONException -> L46
            int r2 = r7.hashCode()     // Catch: org.json.JSONException -> L46
            r0 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r1 = 1
            if (r2 == r0) goto L1d
            goto L28
        L1d:
            java.lang.String r0 = "onAttributionFailure"
            boolean r0 = r7.equals(r0)     // Catch: org.json.JSONException -> L46
            if (r0 == 0) goto L2d
            r0 = r1
            goto L2e
        L28:
            r0 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r2 == r0) goto L37
        L2d:
            r0 = -1
        L2e:
            if (r0 == 0) goto L42
            if (r0 == r1) goto L33
        L32:
            return
        L33:
            r6.onAttributionFailureNative(r3)     // Catch: org.json.JSONException -> L46
            goto L32
        L37:
            java.lang.String r0 = "onInstallConversionFailure"
            boolean r0 = r7.equals(r0)     // Catch: org.json.JSONException -> L46
            if (r0 == 0) goto L2d
            r0 = 0
            goto L2e
        L42:
            r6.onInstallConversionFailureNative(r3)     // Catch: org.json.JSONException -> L46
            return
        L46:
            r3 = move-exception
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.OTHER
            r4 = 0
            r5 = 0
            java.lang.String r2 = "2dx error"
            r0.e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.getCurrencyIso4217Code(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        getCurrencyIso4217Code("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        getCurrencyIso4217Code("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}

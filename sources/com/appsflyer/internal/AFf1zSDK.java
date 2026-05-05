package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.dynatrace.android.callback.Callback;
import com.facebook.common.util.UriUtil;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1zSDK extends AFe1mSDK<Map<String, Object>> {
    private static final int component2 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final AFa1mSDK component1;
    private final AFa1jSDK component3;
    private final Uri component4;
    private final List<String> copy;

    public AFf1zSDK(AFa1mSDK aFa1mSDK, AFa1jSDK aFa1jSDK, Uri uri, List<String> list) {
        super(AFe1pSDK.RESOLVE_ESP, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1mSDK;
        this.component3 = aFa1jSDK;
        this.component4 = uri;
        this.copy = list;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate if link ").append(str).append(" belongs to ESP domains: ").append(this.copy).toString());
        try {
            return this.copy.contains(new URL(str).getHost());
        } catch (MalformedURLException e2) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e2);
            return false;
        }
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            int i2 = component2;
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.6");
            int responseCode = Callback.getResponseCode(httpURLConnection);
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put(UriUtil.LOCAL_RESOURCE_SCHEME, Callback.getHeaderField(httpURLConnection, "Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            map.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return map;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return StatsigLoggerKt.FLUSH_TIMER_MS;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        Integer num = null;
        if (!getMediationNetwork(this.component4.toString())) {
            this.component1.j_(this.component3, this.component4, null);
            return AFe1uSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        String str = null;
        for (int i2 = 0; i2 < 5; i2++) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            string = (String) mapR_.get(UriUtil.LOCAL_RESOURCE_SCHEME);
            num = (Integer) mapR_.get("status");
            str = (String) mapR_.get("error");
            if (string == null || !getMediationNetwork(string)) {
                break;
            }
            if (i2 < 4) {
                arrayList.add(string);
            }
        }
        HashMap map = new HashMap();
        map.put(UriUtil.LOCAL_RESOURCE_SCHEME, string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component3) {
            this.component3.getRevenue("af_deeplink_r", map);
            this.component3.getRevenue("af_deeplink", this.component4.toString());
        }
        this.component1.j_(this.component3, string != null ? Uri.parse(string) : this.component4, this.component4);
        this.areAllFieldsValid = map;
        return AFe1uSDK.SUCCESS;
    }
}

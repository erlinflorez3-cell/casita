package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1gSDK {
    private final int getRevenue;

    public AFd1gSDK(int i2) {
        this.getRevenue = i2;
    }

    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream errorStream;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = Callback.getInputStream((URLConnection) httpURLConnection);
            } catch (Exception e2) {
                errorStream = Callback.getErrorStream(httpURLConnection);
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e2.getMessage() != null ? e2.getMessage() : "", e2, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                bufferedReader = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader.close();
                            return string;
                        }
                        if (!z2) {
                            sb.append('\n');
                        }
                        sb.append(line);
                        z2 = false;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = inputStreamReader2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        throw th;
    }

    public final AFe1wSDK<String> getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) throws IOException {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1bSDK.getRevenue();
            StringBuilder sb = new StringBuilder(new StringBuilder().append(aFd1bSDK.getMonetizationNetwork).append(Global.COLON).append(aFd1bSDK.getMediationNetwork).toString());
            byte[] revenue2 = aFd1bSDK.getRevenue();
            if (aFd1bSDK.getMonetizationNetwork() && revenue2 != null) {
                try {
                    sb.append("\n payload: ").append(aFd1bSDK.getMediationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset()));
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = null;
                    try {
                        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1bSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(th).append("\n took ").append(aFd1aSDK.getMediationNetwork).append("ms").toString()).toString(), th, false, false, false);
                        throw new HttpException(th, aFd1aSDK);
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1bSDK.AFAdRevenueData.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1bSDK.hashCode()).append("] ").append((Object) sb).toString());
            URLConnection uRLConnectionOpenConnection = new URL(aFd1bSDK.getMediationNetwork).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection.setRequestMethod(aFd1bSDK.getMonetizationNetwork);
                if (aFd1bSDK.getCurrencyIso4217Code()) {
                    httpURLConnection.setUseCaches(false);
                }
                if (!aFd1bSDK.component1()) {
                    httpURLConnection.setInstanceFollowRedirects(false);
                }
                try {
                    int i2 = this.getRevenue;
                    int i3 = aFd1bSDK.component4;
                    if (i3 != -1) {
                        i2 = i3;
                    }
                    httpURLConnection.setConnectTimeout(i2);
                    httpURLConnection.setReadTimeout(i2);
                    httpURLConnection.addRequestProperty("Content-Type", aFd1bSDK.getMediationNetwork() ? "application/octet-stream" : Constants.WUP_CONTENT_TYPE);
                    for (Map.Entry<String, String> entry2 : aFd1bSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    boolean z2 = true;
                    if (revenue != null) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestProperty("Content-Length", new StringBuilder().append(revenue.length).toString());
                        try {
                            bufferedOutputStream = new BufferedOutputStream(Callback.getOutputStream((URLConnection) httpURLConnection));
                            try {
                                bufferedOutputStream.write(revenue);
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th = th2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = null;
                        }
                    }
                    if (Callback.getResponseCode(httpURLConnection) / 100 != 2) {
                        z2 = false;
                    }
                    String mediationNetwork = "";
                    if (aFd1bSDK.AFAdRevenueData()) {
                        mediationNetwork = getMediationNetwork(httpURLConnection);
                    }
                    AFd1aSDK aFd1aSDK2 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1bSDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(Callback.getResponseCode(httpURLConnection)).append(Global.BLANK).append(Callback.getResponseMessage(httpURLConnection)).append("\n body:").append(mediationNetwork).append("\n took ").append(aFd1aSDK2.getMediationNetwork).append("ms").toString()).toString());
                    HashMap map = new HashMap(Callback.getHeaderFields(httpURLConnection));
                    map.remove(null);
                    return new AFe1wSDK<>(mediationNetwork, Callback.getResponseCode(httpURLConnection), z2, map, aFd1aSDK2);
                } catch (Throwable th4) {
                    th = th4;
                    AFd1aSDK aFd1aSDK3 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, new StringBuilder("[").append(aFd1bSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(th).append("\n took ").append(aFd1aSDK3.getMediationNetwork).append("ms").toString()).toString(), th, false, false, false);
                    throw new HttpException(th, aFd1aSDK3);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
        }
    }
}

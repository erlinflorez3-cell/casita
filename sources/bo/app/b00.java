package bo.app;

import android.net.TrafficStats;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b00 implements x00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f232b = (int) TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f233a;

    public b00(int i2) {
        this.f233a = i2;
    }

    @Override // bo.app.x00
    public final w00 a(b90 requestTarget, HashMap requestHeaders, JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        URL url = requestTarget.f255c;
        Map mapEmptyMap = MapsKt.emptyMap();
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnectionA = a(url, payload, requestHeaders);
            responseCode = Callback.getResponseCode(httpURLConnectionA);
            Map<String, List<String>> headerFields = Callback.getHeaderFields(httpURLConnectionA);
            Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
            mapEmptyMap = com.braze.support.i.a(headerFields);
            Reader inputStreamReader = new InputStreamReader(zz.a(httpURLConnectionA), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return new w00(responseCode, mapEmptyMap, new JSONObject(text));
            } finally {
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new a00(requestTarget), 4, (Object) null);
            return new w00(responseCode, mapEmptyMap, 4);
        }
    }

    public final HttpURLConnection a(URL url, JSONObject jSONObject, HashMap map) throws Exception {
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "payload.toString()");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        HttpURLConnection httpURLConnectionA = ih0.f914a.a(url);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionA.setConnectTimeout(f232b);
        httpURLConnectionA.setReadTimeout(this.f233a);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setInstanceFollowRedirects(false);
        httpURLConnectionA.setRequestMethod(HttpPost.METHOD_NAME);
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = Callback.getOutputStream((URLConnection) httpURLConnectionA);
        try {
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream, null);
            return httpURLConnectionA;
        } finally {
        }
    }
}

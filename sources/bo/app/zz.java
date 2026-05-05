package bo.app;

import com.dynatrace.android.callback.Callback;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zz {
    public static final FilterInputStream a(HttpURLConnection httpURLConnection) throws Exception {
        int i2 = b00.f232b;
        Callback.connect((URLConnection) httpURLConnection);
        int responseCode = Callback.getResponseCode(httpURLConnection);
        if (responseCode / 100 == 2) {
            return StringsKt.equals("gzip", Callback.getContentEncoding(httpURLConnection), true) ? new GZIPInputStream(Callback.getInputStream((URLConnection) httpURLConnection)) : new BufferedInputStream(Callback.getInputStream((URLConnection) httpURLConnection));
        }
        throw new x40("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + httpURLConnection.getURL());
    }
}

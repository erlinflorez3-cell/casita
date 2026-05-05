package com.google.android.gms.internal.gtm;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.dynatrace.android.callback.Callback;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes8.dex */
final class zzqc implements zzqd {
    private HttpURLConnection zza;
    private InputStream zzb = null;

    zzqc() {
    }

    @Override // com.google.android.gms.internal.gtm.zzqd
    public final InputStream zza(String str) throws Exception {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setReadTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        this.zza = httpURLConnection;
        int responseCode = Callback.getResponseCode(httpURLConnection);
        if (responseCode == 200) {
            InputStream inputStream = Callback.getInputStream(httpURLConnection);
            this.zzb = inputStream;
            return inputStream;
        }
        String str2 = "Bad response: " + responseCode;
        if (responseCode == 404) {
            throw new FileNotFoundException(str2);
        }
        if (responseCode == 503) {
            throw new zzqh(str2);
        }
        throw new IOException(str2);
    }

    @Override // com.google.android.gms.internal.gtm.zzqd
    public final void zzb() {
        HttpURLConnection httpURLConnection = this.zza;
        try {
            InputStream inputStream = this.zzb;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e2) {
            zzho.zzb("HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(String.valueOf(e2.getMessage())), e2);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}

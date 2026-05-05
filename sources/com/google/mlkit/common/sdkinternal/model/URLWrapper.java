package com.google.mlkit.common.sdkinternal.model;

import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class URLWrapper {
    private final URL zza;

    public URLWrapper(String str) throws MalformedURLException {
        this.zza = new URL(str);
    }

    public URLConnection openConnection() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.zza.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        return uRLConnectionOpenConnection;
    }
}

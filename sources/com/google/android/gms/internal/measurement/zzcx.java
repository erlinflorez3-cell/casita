package com.google.android.gms.internal.measurement;

import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes8.dex */
final class zzcx extends zzcy {
    private zzcx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final URLConnection zza(URL url, String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        return uRLConnectionOpenConnection;
    }
}

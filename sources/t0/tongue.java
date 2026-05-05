package t0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue extends civilian {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.civilian f28331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f28332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteArrayInputStream f28333d;

    public tongue(URL url, v.civilian civilianVar, HttpsURLConnection httpsURLConnection) {
        super(url, httpsURLConnection);
        this.f28331b = civilianVar;
        superior.a(this, civilianVar);
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        if (this.f28333d == null) {
            InputStream errorStream = this.f28327a.getErrorStream();
            this.f28333d = errorStream != null ? superior.a(this, errorStream, this.f28331b) : null;
        }
        return this.f28333d;
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        if (this.f28332c == null) {
            InputStream inputStream = this.f28327a.getInputStream();
            this.f28332c = inputStream != null ? superior.a(this, inputStream, this.f28331b) : null;
        }
        return this.f28332c;
    }
}

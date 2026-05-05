package t0;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class pair extends apparatus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.civilian f28328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f28329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteArrayInputStream f28330d;

    public pair(v.civilian civilianVar, URL url, HttpURLConnection httpURLConnection) {
        super(url, httpURLConnection);
        this.f28328b = civilianVar;
        superior.a(this, civilianVar);
    }

    @Override // t0.apparatus, java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        if (this.f28330d == null) {
            InputStream errorStream = super.getErrorStream();
            this.f28330d = errorStream != null ? superior.a(this, errorStream, this.f28328b) : null;
        }
        return this.f28330d;
    }

    @Override // t0.apparatus, java.net.URLConnection
    public final InputStream getInputStream() {
        if (this.f28329c == null) {
            InputStream inputStream = super.getInputStream();
            this.f28329c = inputStream != null ? superior.a(this, inputStream, this.f28328b) : null;
        }
        return this.f28329c;
    }
}

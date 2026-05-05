package cz.msebera.android.httpclient.impl.io;

import cz.msebera.android.httpclient.io.HttpTransportMetrics;

/* JADX INFO: loaded from: classes5.dex */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred = 0;

    @Override // cz.msebera.android.httpclient.io.HttpTransportMetrics
    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void incrementBytesTransferred(long j2) {
        this.bytesTransferred += j2;
    }

    @Override // cz.msebera.android.httpclient.io.HttpTransportMetrics
    public void reset() {
        this.bytesTransferred = 0L;
    }

    public void setBytesTransferred(long j2) {
        this.bytesTransferred = j2;
    }
}

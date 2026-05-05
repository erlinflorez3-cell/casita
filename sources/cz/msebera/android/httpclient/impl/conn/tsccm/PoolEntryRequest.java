package cz.msebera.android.httpclient.impl.conn.tsccm;

import cz.msebera.android.httpclient.conn.ConnectionPoolTimeoutException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface PoolEntryRequest {
    void abortRequest();

    BasicPoolEntry getPoolEntry(long j2, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException;
}

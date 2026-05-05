package c;

import com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue implements DefaultHttpClientFactory {
    @Override // com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory
    public final DefaultHttpClient create(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        return new DefaultHttpClient(clientConnectionManager, httpParams);
    }

    @Override // com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory
    public final DefaultHttpClient create(DefaultHttpClient defaultHttpClient) {
        return defaultHttpClient;
    }
}

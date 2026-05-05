package s0;

import com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory;
import i0.superior;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import v.civilian;

/* JADX INFO: loaded from: classes2.dex */
public final class pair implements DefaultHttpClientFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final civilian f28289a;

    public pair(civilian civilianVar) {
        this.f28289a = civilianVar;
    }

    public final void a(HttpRequest httpRequest, HttpContext httpContext) {
        Object attribute = httpContext.getAttribute("http.connection");
        ManagedClientConnection managedClientConnection = attribute instanceof ManagedClientConnection ? (ManagedClientConnection) attribute : null;
        if (managedClientConnection == null) {
            return;
        }
        SSLSession sSLSession = managedClientConnection.getSSLSession();
        httpContext.setAttribute("request.uri", httpRequest.getRequestLine().getUri());
        if (httpContext.getAttribute("SSL_CERT_DETAILS") == null && sSLSession != null) {
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                ArrayList arrayList = new ArrayList(peerCertificates.length);
                for (Certificate certificate : peerCertificates) {
                    arrayList.add(new superior(certificate));
                }
                httpContext.setAttribute("SSL_CERT_DETAILS", arrayList);
            } catch (Exception unused) {
            }
        }
        for (Map.Entry entry : this.f28289a.a().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2.length() > 0) {
                httpRequest.setHeader(str, str2);
            }
        }
    }

    public final void a(DefaultHttpClient defaultHttpClient) {
        defaultHttpClient.addRequestInterceptor(new HttpRequestInterceptor() { // from class: s0.pair$$ExternalSyntheticLambda0
            @Override // org.apache.http.HttpRequestInterceptor
            public final void process(HttpRequest httpRequest, HttpContext httpContext) {
                this.f$0.a(httpRequest, httpContext);
            }
        });
        final civilian civilianVar = this.f28289a;
        defaultHttpClient.addResponseInterceptor(new HttpResponseInterceptor() { // from class: s0.pair$$ExternalSyntheticLambda1
            @Override // org.apache.http.HttpResponseInterceptor
            public final void process(HttpResponse httpResponse, HttpContext httpContext) {
                civilianVar.a(httpResponse, httpContext);
            }
        });
    }

    @Override // com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory
    public final DefaultHttpClient create(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(clientConnectionManager, httpParams);
        a(defaultHttpClient);
        return defaultHttpClient;
    }

    @Override // com.cleafy.mobile.detection.http.wrappers.DefaultHttpClientFactory
    public final DefaultHttpClient create(DefaultHttpClient defaultHttpClient) {
        a(defaultHttpClient);
        return defaultHttpClient;
    }
}

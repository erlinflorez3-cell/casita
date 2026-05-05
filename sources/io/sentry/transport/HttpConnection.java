package io.sentry.transport;

import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final SentryOptions options;
    private final Proxy proxy;
    private final RateLimiter rateLimiter;
    private final RequestDetails requestDetails;

    HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, AuthenticatorWrapper authenticatorWrapper, RateLimiter rateLimiter) {
        this.requestDetails = requestDetails;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter;
        Proxy proxyResolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = proxyResolveProxy;
        if (proxyResolveProxy == null || sentryOptions.getProxy() == null) {
            return;
        }
        String user = sentryOptions.getProxy().getUser();
        String pass = sentryOptions.getProxy().getPass();
        if (user == null || pass == null) {
            return;
        }
        authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, RateLimiter rateLimiter) {
        this(sentryOptions, requestDetails, AuthenticatorWrapper.getInstance(), rateLimiter);
    }

    private void closeAndDisconnect(HttpURLConnection httpURLConnection) {
        try {
            Callback.getInputStream(httpURLConnection).close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    private HttpURLConnection createConnection() throws Exception {
        HttpURLConnection httpURLConnectionOpen = open();
        for (Map.Entry<String, String> entry : this.requestDetails.getHeaders().entrySet()) {
            httpURLConnectionOpen.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionOpen.setRequestMethod(HttpPost.METHOD_NAME);
        httpURLConnectionOpen.setDoOutput(true);
        httpURLConnectionOpen.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionOpen.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionOpen.setRequestProperty("Accept", Constants.WUP_CONTENT_TYPE);
        httpURLConnectionOpen.setRequestProperty("Connection", "close");
        httpURLConnectionOpen.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        httpURLConnectionOpen.setReadTimeout(this.options.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if ((httpURLConnectionOpen instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionOpen).setSSLSocketFactory(sslSocketFactory);
        }
        Callback.connect(httpURLConnectionOpen);
        return httpURLConnectionOpen;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getErrorMessageFromStream(java.net.HttpURLConnection r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.io.InputStream r4 = com.dynatrace.android.callback.Callback.getErrorStream(r6)     // Catch: java.io.IOException -> L4b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3f
            java.nio.charset.Charset r0 = io.sentry.transport.HttpConnection.UTF_8     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            r0 = 1
        L16:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L28
            if (r0 != 0) goto L23
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch: java.lang.Throwable -> L35
        L23:
            r2.append(r1)     // Catch: java.lang.Throwable -> L35
            r0 = 0
            goto L16
        L28:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L34
            r4.close()     // Catch: java.io.IOException -> L4b
        L34:
            return r0
        L35:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r1     // Catch: java.lang.Throwable -> L3f
        L3f:
            r1 = move-exception
            if (r4 == 0) goto L4a
            r4.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L4b
        L4a:
            throw r1     // Catch: java.io.IOException -> L4b
        L4b:
            java.lang.String r0 = "Failed to obtain error message while analyzing send failure."
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.HttpConnection.getErrorMessageFromStream(java.net.HttpURLConnection):java.lang.String");
    }

    private boolean isSuccessfulResponseCode(int i2) {
        return i2 == 200;
    }

    private TransportResult readAndLog(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = Callback.getResponseCode(httpURLConnection);
                updateRetryAfterLimits(httpURLConnection, responseCode);
                if (isSuccessfulResponseCode(responseCode)) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return TransportResult.success();
                }
                this.options.getLogger().log(SentryLevel.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.options.isDebug()) {
                    this.options.getLogger().log(SentryLevel.ERROR, "%s", getErrorMessageFromStream(httpURLConnection));
                }
                return TransportResult.error(responseCode);
            } catch (IOException e2) {
                this.options.getLogger().log(SentryLevel.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
                closeAndDisconnect(httpURLConnection);
                return TransportResult.error();
            }
        } finally {
            closeAndDisconnect(httpURLConnection);
        }
    }

    private Proxy resolveProxy(SentryOptions.Proxy proxy) {
        if (proxy != null) {
            String port = proxy.getPort();
            String host = proxy.getHost();
            if (port != null && host != null) {
                try {
                    return new Proxy(proxy.getType() != null ? proxy.getType() : Proxy.Type.HTTP, new InetSocketAddress(host, Integer.parseInt(port)));
                } catch (NumberFormatException e2) {
                    this.options.getLogger().log(SentryLevel.ERROR, e2, "Failed to parse Sentry Proxy port: " + proxy.getPort() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    Proxy getProxy() {
        return this.proxy;
    }

    HttpURLConnection open() throws IOException {
        URLConnection uRLConnectionOpenConnection;
        if (this.proxy == null) {
            uRLConnectionOpenConnection = this.requestDetails.getUrl().openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
        } else {
            uRLConnectionOpenConnection = this.requestDetails.getUrl().openConnection(this.proxy);
            Callback.openConnection(uRLConnectionOpenConnection);
        }
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    public TransportResult send(SentryEnvelope sentryEnvelope) throws IOException {
        try {
            OutputStream outputStream = Callback.getOutputStream(createConnection());
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.options.getSerializer().serialize(sentryEnvelope, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
                return readAndLog(r5);
            } finally {
            }
        }
        return readAndLog(r5);
    }

    public void updateRetryAfterLimits(HttpURLConnection httpURLConnection, int i2) throws Exception {
        String headerField = Callback.getHeaderField(httpURLConnection, "Retry-After");
        this.rateLimiter.updateRetryAfterLimits(Callback.getHeaderField(httpURLConnection, "X-Sentry-Rate-Limits"), headerField, i2);
    }
}

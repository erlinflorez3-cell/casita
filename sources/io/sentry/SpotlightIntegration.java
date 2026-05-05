package io.sentry;

import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import io.sentry.SentryOptions;
import io.sentry.util.Platform;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotlightIntegration implements Integration, SentryOptions.BeforeEnvelopeCallback, Closeable {
    private SentryOptions options;
    private ILogger logger = NoOpLogger.getInstance();
    private ISentryExecutorService executorService = NoOpSentryExecutorService.getInstance();

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

    private HttpURLConnection createConnection(String str) throws Exception {
        URLConnection uRLConnectionOpenConnection = URI.create(str).toURL().openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", Constants.WUP_CONTENT_TYPE);
        httpURLConnection.setRequestProperty("Connection", "close");
        Callback.connect(httpURLConnection);
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendEnvelope, reason: merged with bridge method [inline-methods] */
    public void m8887lambda$execute$0$iosentrySpotlightIntegration(SentryEnvelope sentryEnvelope) {
        OutputStream outputStream;
        try {
            if (this.options == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionCreateConnection = createConnection(getSpotlightConnectionUrl());
            try {
                outputStream = Callback.getOutputStream(httpURLConnectionCreateConnection);
            } catch (Throwable th) {
                try {
                    this.logger.log(SentryLevel.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th);
                    this.logger.log(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(Callback.getResponseCode(httpURLConnectionCreateConnection)));
                } catch (Throwable th2) {
                    this.logger.log(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(Callback.getResponseCode(httpURLConnectionCreateConnection)));
                    closeAndDisconnect(httpURLConnectionCreateConnection);
                    throw th2;
                }
            }
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.options.getSerializer().serialize(sentryEnvelope, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    this.logger.log(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(Callback.getResponseCode(httpURLConnectionCreateConnection)));
                    closeAndDisconnect(httpURLConnectionCreateConnection);
                } finally {
                }
            } finally {
            }
        } catch (Exception e2) {
            this.logger.log(SentryLevel.ERROR, "An exception occurred while creating the connection to spotlight.", e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.executorService.close(0L);
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null || sentryOptions.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.options.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.SentryOptions.BeforeEnvelopeCallback
    public void execute(final SentryEnvelope sentryEnvelope, Hint hint) {
        try {
            this.executorService.submit(new Runnable() { // from class: io.sentry.SpotlightIntegration$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8887lambda$execute$0$iosentrySpotlightIntegration(sentryEnvelope);
                }
            });
        } catch (RejectedExecutionException e2) {
            this.logger.log(SentryLevel.WARNING, "Spotlight envelope submission rejected.", e2);
        }
    }

    public String getSpotlightConnectionUrl() {
        SentryOptions sentryOptions = this.options;
        return (sentryOptions == null || sentryOptions.getSpotlightConnectionUrl() == null) ? Platform.isAndroid() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream" : this.options.getSpotlightConnectionUrl();
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        this.options = sentryOptions;
        this.logger = sentryOptions.getLogger();
        if (sentryOptions.getBeforeEnvelopeCallback() != null || !sentryOptions.isEnableSpotlight()) {
            this.logger.log(SentryLevel.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.executorService = new SentryExecutorService();
        sentryOptions.setBeforeEnvelopeCallback(this);
        this.logger.log(SentryLevel.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
    }
}

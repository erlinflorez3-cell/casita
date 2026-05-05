package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {
    static final HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY = new DefaultHttpUrlConnectionFactory();
    private static final int INVALID_STATUS_CODE = -1;
    private static final int MAXIMUM_REDIRECTS = 5;
    private static final String TAG = "HttpUrlFetcher";
    private final HttpUrlConnectionFactory connectionFactory;
    private final GlideUrl glideUrl;
    private volatile boolean isCancelled;
    private InputStream stream;
    private final int timeout;
    private HttpURLConnection urlConnection;

    private static class DefaultHttpUrlConnectionFactory implements HttpUrlConnectionFactory {
        DefaultHttpUrlConnectionFactory() {
        }

        @Override // com.bumptech.glide.load.data.HttpUrlFetcher.HttpUrlConnectionFactory
        public HttpURLConnection build(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
    }

    interface HttpUrlConnectionFactory {
        HttpURLConnection build(URL url) throws IOException;
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i2) {
        this(glideUrl, i2, DEFAULT_CONNECTION_FACTORY);
    }

    HttpUrlFetcher(GlideUrl glideUrl, int i2, HttpUrlConnectionFactory httpUrlConnectionFactory) {
        this.glideUrl = glideUrl;
        this.timeout = i2;
        this.connectionFactory = httpUrlConnectionFactory;
    }

    private InputStream getStreamForSuccessfulRequest(HttpURLConnection httpURLConnection) throws Exception {
        if (TextUtils.isEmpty(Callback.getContentEncoding(httpURLConnection))) {
            this.stream = ContentLengthInputStream.obtain(Callback.getInputStream(httpURLConnection), Callback.getContentLength(httpURLConnection));
        } else {
            if (Log.isLoggable(TAG, 3)) {
                String str = "Got non empty content encoding: " + Callback.getContentEncoding(httpURLConnection);
            }
            this.stream = Callback.getInputStream(httpURLConnection);
        }
        return this.stream;
    }

    private static boolean isHttpOk(int i2) {
        return i2 / 100 == 2;
    }

    private static boolean isHttpRedirect(int i2) {
        return i2 / 100 == 3;
    }

    private InputStream loadDataWithRedirects(URL url, int i2, URL url2, Map<String, String> map) throws Exception {
        if (i2 >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.urlConnection = this.connectionFactory.build(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.urlConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.urlConnection.setConnectTimeout(this.timeout);
        this.urlConnection.setReadTimeout(this.timeout);
        this.urlConnection.setUseCaches(false);
        this.urlConnection.setDoInput(true);
        this.urlConnection.setInstanceFollowRedirects(false);
        Callback.connect(this.urlConnection);
        this.stream = Callback.getInputStream(this.urlConnection);
        if (this.isCancelled) {
            return null;
        }
        int responseCode = Callback.getResponseCode(this.urlConnection);
        if (isHttpOk(responseCode)) {
            return getStreamForSuccessfulRequest(this.urlConnection);
        }
        if (!isHttpRedirect(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(Callback.getResponseMessage(this.urlConnection), responseCode);
        }
        String headerField = Callback.getHeaderField(this.urlConnection, "Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        cleanup();
        return loadDataWithRedirects(url3, i2 + 1, url, map);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.isCancelled = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.urlConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.urlConnection = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(Priority priority, DataFetcher.DataCallback<? super InputStream> dataCallback) {
        StringBuilder sb;
        long logTime = LogTime.getLogTime();
        try {
            try {
                dataCallback.onDataReady(loadDataWithRedirects(this.glideUrl.toURL(), 0, null, this.glideUrl.getHeaders()));
            } catch (IOException e2) {
                if (Log.isLoggable(TAG, 3)) {
                }
                dataCallback.onLoadFailed(e2);
                if (Log.isLoggable(TAG, 2)) {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                }
            }
            if (Log.isLoggable(TAG, 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(LogTime.getElapsedMillis(logTime)).toString();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(TAG, 2)) {
                String str = "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(logTime);
            }
            throw th;
        }
    }
}

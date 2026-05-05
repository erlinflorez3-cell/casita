package t0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class apparatus extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f28326a;

    public apparatus(URL url, HttpURLConnection httpURLConnection) {
        super(url);
        this.f28326a = httpURLConnection;
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f28326a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f28326a.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f28326a.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f28326a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f28326a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f28326a.getContent();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f28326a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f28326a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f28326a.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f28326a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f28326a.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f28326a.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f28326a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f28326a.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f28326a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f28326a.getErrorStream();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f28326a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i2) {
        return this.f28326a.getHeaderField(i2);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f28326a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j2) {
        return this.f28326a.getHeaderFieldDate(str, j2);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i2) {
        return this.f28326a.getHeaderFieldInt(str, i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i2) {
        return this.f28326a.getHeaderFieldKey(i2);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j2) {
        return this.f28326a.getHeaderFieldLong(str, j2);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f28326a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f28326a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f28326a.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f28326a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f28326a.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f28326a.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f28326a.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f28326a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f28326a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f28326a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f28326a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f28326a.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f28326a.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f28326a.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f28326a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z2) {
        this.f28326a.setAllowUserInteraction(z2);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i2) {
        this.f28326a.setChunkedStreamingMode(i2);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i2) {
        this.f28326a.setConnectTimeout(i2);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z2) {
        this.f28326a.setDefaultUseCaches(z2);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z2) {
        this.f28326a.setDoInput(z2);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z2) {
        this.f28326a.setDoOutput(z2);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i2) {
        this.f28326a.setFixedLengthStreamingMode(i2);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j2) {
        this.f28326a.setFixedLengthStreamingMode(j2);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j2) {
        this.f28326a.setIfModifiedSince(j2);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z2) {
        this.f28326a.setInstanceFollowRedirects(z2);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i2) {
        this.f28326a.setReadTimeout(i2);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f28326a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f28326a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z2) {
        this.f28326a.setUseCaches(z2);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f28326a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f28326a.usingProxy();
    }
}

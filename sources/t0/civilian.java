package t0;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class civilian extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpsURLConnection f28327a;

    public civilian(URL url, HttpsURLConnection httpsURLConnection) {
        super(url);
        this.f28327a = httpsURLConnection;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f28327a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.f28327a.connect();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.f28327a.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f28327a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f28327a.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f28327a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f28327a.getContent();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f28327a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.f28327a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.f28327a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        return this.f28327a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.f28327a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.f28327a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f28327a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f28327a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f28327a.getDoOutput();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.f28327a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i2) {
        return this.f28327a.getHeaderField(i2);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.f28327a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j2) {
        return this.f28327a.getHeaderFieldDate(str, j2);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i2) {
        return this.f28327a.getHeaderFieldInt(str, i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i2) {
        return this.f28327a.getHeaderFieldKey(i2);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j2) {
        return this.f28327a.getHeaderFieldLong(str, j2);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        return this.f28327a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f28327a.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f28327a.getIfModifiedSince();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f28327a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.f28327a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f28327a.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f28327a.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f28327a.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f28327a.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f28327a.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f28327a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f28327a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f28327a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f28327a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f28327a.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f28327a.getResponseMessage();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f28327a.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f28327a.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f28327a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f28327a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z2) {
        this.f28327a.setAllowUserInteraction(z2);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i2) {
        this.f28327a.setChunkedStreamingMode(i2);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i2) {
        this.f28327a.setConnectTimeout(i2);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z2) {
        this.f28327a.setDefaultUseCaches(z2);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z2) {
        this.f28327a.setDoInput(z2);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z2) {
        this.f28327a.setDoOutput(z2);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i2) {
        this.f28327a.setFixedLengthStreamingMode(i2);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        this.f28327a.setFixedLengthStreamingMode(j2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f28327a.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j2) {
        this.f28327a.setIfModifiedSince(j2);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z2) {
        this.f28327a.setInstanceFollowRedirects(z2);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i2) {
        this.f28327a.setReadTimeout(i2);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f28327a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.f28327a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f28327a.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z2) {
        this.f28327a.setUseCaches(z2);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f28327a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f28327a.usingProxy();
    }
}

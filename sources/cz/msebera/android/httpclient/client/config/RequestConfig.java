package cz.msebera.android.httpclient.client.config;

import cz.msebera.android.httpclient.HttpHost;
import java.net.InetAddress;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public class RequestConfig implements Cloneable {
    public static final RequestConfig DEFAULT = new Builder().build();
    private final boolean authenticationEnabled;
    private final boolean circularRedirectsAllowed;
    private final int connectTimeout;
    private final int connectionRequestTimeout;
    private final boolean contentCompressionEnabled;
    private final String cookieSpec;
    private final boolean expectContinueEnabled;
    private final InetAddress localAddress;
    private final int maxRedirects;
    private final boolean normalizeUri;
    private final HttpHost proxy;
    private final Collection<String> proxyPreferredAuthSchemes;
    private final boolean redirectsEnabled;
    private final boolean relativeRedirectsAllowed;
    private final int socketTimeout;
    private final boolean staleConnectionCheckEnabled;
    private final Collection<String> targetPreferredAuthSchemes;

    public static class Builder {
        private boolean circularRedirectsAllowed;
        private String cookieSpec;
        private boolean expectContinueEnabled;
        private InetAddress localAddress;
        private HttpHost proxy;
        private Collection<String> proxyPreferredAuthSchemes;
        private Collection<String> targetPreferredAuthSchemes;
        private boolean staleConnectionCheckEnabled = false;
        private boolean redirectsEnabled = true;
        private int maxRedirects = 50;
        private boolean relativeRedirectsAllowed = true;
        private boolean authenticationEnabled = true;
        private int connectionRequestTimeout = -1;
        private int connectTimeout = -1;
        private int socketTimeout = -1;
        private boolean contentCompressionEnabled = true;
        private boolean normalizeUri = true;

        Builder() {
        }

        public RequestConfig build() {
            return new RequestConfig(this.expectContinueEnabled, this.proxy, this.localAddress, this.staleConnectionCheckEnabled, this.cookieSpec, this.redirectsEnabled, this.relativeRedirectsAllowed, this.circularRedirectsAllowed, this.maxRedirects, this.authenticationEnabled, this.targetPreferredAuthSchemes, this.proxyPreferredAuthSchemes, this.connectionRequestTimeout, this.connectTimeout, this.socketTimeout, this.contentCompressionEnabled, this.normalizeUri);
        }

        public Builder setAuthenticationEnabled(boolean z2) {
            this.authenticationEnabled = z2;
            return this;
        }

        public Builder setCircularRedirectsAllowed(boolean z2) {
            this.circularRedirectsAllowed = z2;
            return this;
        }

        public Builder setConnectTimeout(int i2) {
            this.connectTimeout = i2;
            return this;
        }

        public Builder setConnectionRequestTimeout(int i2) {
            this.connectionRequestTimeout = i2;
            return this;
        }

        public Builder setContentCompressionEnabled(boolean z2) {
            this.contentCompressionEnabled = z2;
            return this;
        }

        public Builder setCookieSpec(String str) {
            this.cookieSpec = str;
            return this;
        }

        @Deprecated
        public Builder setDecompressionEnabled(boolean z2) {
            this.contentCompressionEnabled = z2;
            return this;
        }

        public Builder setExpectContinueEnabled(boolean z2) {
            this.expectContinueEnabled = z2;
            return this;
        }

        public Builder setLocalAddress(InetAddress inetAddress) {
            this.localAddress = inetAddress;
            return this;
        }

        public Builder setMaxRedirects(int i2) {
            this.maxRedirects = i2;
            return this;
        }

        public Builder setNormalizeUri(boolean z2) {
            this.normalizeUri = z2;
            return this;
        }

        public Builder setProxy(HttpHost httpHost) {
            this.proxy = httpHost;
            return this;
        }

        public Builder setProxyPreferredAuthSchemes(Collection<String> collection) {
            this.proxyPreferredAuthSchemes = collection;
            return this;
        }

        public Builder setRedirectsEnabled(boolean z2) {
            this.redirectsEnabled = z2;
            return this;
        }

        public Builder setRelativeRedirectsAllowed(boolean z2) {
            this.relativeRedirectsAllowed = z2;
            return this;
        }

        public Builder setSocketTimeout(int i2) {
            this.socketTimeout = i2;
            return this;
        }

        @Deprecated
        public Builder setStaleConnectionCheckEnabled(boolean z2) {
            this.staleConnectionCheckEnabled = z2;
            return this;
        }

        public Builder setTargetPreferredAuthSchemes(Collection<String> collection) {
            this.targetPreferredAuthSchemes = collection;
            return this;
        }
    }

    protected RequestConfig() {
        this(false, null, null, false, null, false, false, false, 0, false, null, null, 0, 0, 0, true, true);
    }

    RequestConfig(boolean z2, HttpHost httpHost, InetAddress inetAddress, boolean z3, String str, boolean z4, boolean z5, boolean z6, int i2, boolean z7, Collection<String> collection, Collection<String> collection2, int i3, int i4, int i5, boolean z8, boolean z9) {
        this.expectContinueEnabled = z2;
        this.proxy = httpHost;
        this.localAddress = inetAddress;
        this.staleConnectionCheckEnabled = z3;
        this.cookieSpec = str;
        this.redirectsEnabled = z4;
        this.relativeRedirectsAllowed = z5;
        this.circularRedirectsAllowed = z6;
        this.maxRedirects = i2;
        this.authenticationEnabled = z7;
        this.targetPreferredAuthSchemes = collection;
        this.proxyPreferredAuthSchemes = collection2;
        this.connectionRequestTimeout = i3;
        this.connectTimeout = i4;
        this.socketTimeout = i5;
        this.contentCompressionEnabled = z8;
        this.normalizeUri = z9;
    }

    public static Builder copy(RequestConfig requestConfig) {
        return new Builder().setExpectContinueEnabled(requestConfig.isExpectContinueEnabled()).setProxy(requestConfig.getProxy()).setLocalAddress(requestConfig.getLocalAddress()).setStaleConnectionCheckEnabled(requestConfig.isStaleConnectionCheckEnabled()).setCookieSpec(requestConfig.getCookieSpec()).setRedirectsEnabled(requestConfig.isRedirectsEnabled()).setRelativeRedirectsAllowed(requestConfig.isRelativeRedirectsAllowed()).setCircularRedirectsAllowed(requestConfig.isCircularRedirectsAllowed()).setMaxRedirects(requestConfig.getMaxRedirects()).setAuthenticationEnabled(requestConfig.isAuthenticationEnabled()).setTargetPreferredAuthSchemes(requestConfig.getTargetPreferredAuthSchemes()).setProxyPreferredAuthSchemes(requestConfig.getProxyPreferredAuthSchemes()).setConnectionRequestTimeout(requestConfig.getConnectionRequestTimeout()).setConnectTimeout(requestConfig.getConnectTimeout()).setSocketTimeout(requestConfig.getSocketTimeout()).setDecompressionEnabled(requestConfig.isDecompressionEnabled()).setContentCompressionEnabled(requestConfig.isContentCompressionEnabled());
    }

    public static Builder custom() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RequestConfig m8779clone() throws CloneNotSupportedException {
        return (RequestConfig) super.clone();
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getConnectionRequestTimeout() {
        return this.connectionRequestTimeout;
    }

    public String getCookieSpec() {
        return this.cookieSpec;
    }

    public InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public int getMaxRedirects() {
        return this.maxRedirects;
    }

    public HttpHost getProxy() {
        return this.proxy;
    }

    public Collection<String> getProxyPreferredAuthSchemes() {
        return this.proxyPreferredAuthSchemes;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public Collection<String> getTargetPreferredAuthSchemes() {
        return this.targetPreferredAuthSchemes;
    }

    public boolean isAuthenticationEnabled() {
        return this.authenticationEnabled;
    }

    public boolean isCircularRedirectsAllowed() {
        return this.circularRedirectsAllowed;
    }

    public boolean isContentCompressionEnabled() {
        return this.contentCompressionEnabled;
    }

    @Deprecated
    public boolean isDecompressionEnabled() {
        return this.contentCompressionEnabled;
    }

    public boolean isExpectContinueEnabled() {
        return this.expectContinueEnabled;
    }

    public boolean isNormalizeUri() {
        return this.normalizeUri;
    }

    public boolean isRedirectsEnabled() {
        return this.redirectsEnabled;
    }

    public boolean isRelativeRedirectsAllowed() {
        return this.relativeRedirectsAllowed;
    }

    @Deprecated
    public boolean isStaleConnectionCheckEnabled() {
        return this.staleConnectionCheckEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[expectContinueEnabled=");
        sb.append(this.expectContinueEnabled);
        sb.append(", proxy=").append(this.proxy);
        sb.append(", localAddress=").append(this.localAddress);
        sb.append(", cookieSpec=").append(this.cookieSpec);
        sb.append(", redirectsEnabled=").append(this.redirectsEnabled);
        sb.append(", relativeRedirectsAllowed=").append(this.relativeRedirectsAllowed);
        sb.append(", maxRedirects=").append(this.maxRedirects);
        sb.append(", circularRedirectsAllowed=").append(this.circularRedirectsAllowed);
        sb.append(", authenticationEnabled=").append(this.authenticationEnabled);
        sb.append(", targetPreferredAuthSchemes=").append(this.targetPreferredAuthSchemes);
        sb.append(", proxyPreferredAuthSchemes=").append(this.proxyPreferredAuthSchemes);
        sb.append(", connectionRequestTimeout=").append(this.connectionRequestTimeout);
        sb.append(", connectTimeout=").append(this.connectTimeout);
        sb.append(", socketTimeout=").append(this.socketTimeout);
        sb.append(", contentCompressionEnabled=").append(this.contentCompressionEnabled);
        sb.append(", normalizeUri=").append(this.normalizeUri);
        sb.append("]");
        return sb.toString();
    }
}

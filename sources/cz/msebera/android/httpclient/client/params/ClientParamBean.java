package cz.msebera.android.httpclient.client.params;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.params.HttpAbstractParamBean;
import cz.msebera.android.httpclient.params.HttpParams;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class ClientParamBean extends HttpAbstractParamBean {
    public ClientParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setAllowCircularRedirects(boolean z2) {
        this.params.setBooleanParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, z2);
    }

    @Deprecated
    public void setConnectionManagerFactoryClassName(String str) {
        this.params.setParameter(ClientPNames.CONNECTION_MANAGER_FACTORY_CLASS_NAME, str);
    }

    public void setConnectionManagerTimeout(long j2) {
        this.params.setLongParameter("http.conn-manager.timeout", j2);
    }

    public void setCookiePolicy(String str) {
        this.params.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public void setDefaultHeaders(Collection<Header> collection) {
        this.params.setParameter(ClientPNames.DEFAULT_HEADERS, collection);
    }

    public void setDefaultHost(HttpHost httpHost) {
        this.params.setParameter(ClientPNames.DEFAULT_HOST, httpHost);
    }

    public void setHandleAuthentication(boolean z2) {
        this.params.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z2);
    }

    public void setHandleRedirects(boolean z2) {
        this.params.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z2);
    }

    public void setMaxRedirects(int i2) {
        this.params.setIntParameter(ClientPNames.MAX_REDIRECTS, i2);
    }

    public void setRejectRelativeRedirect(boolean z2) {
        this.params.setBooleanParameter(ClientPNames.REJECT_RELATIVE_REDIRECT, z2);
    }

    public void setVirtualHost(HttpHost httpHost) {
        this.params.setParameter(ClientPNames.VIRTUAL_HOST, httpHost);
    }
}

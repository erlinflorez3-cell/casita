package cz.msebera.android.httpclient.auth;

import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.message.TokenParser;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.LangUtils;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class AuthScope {
    public static final AuthScope ANY = new AuthScope(null, -1, null, null);
    public static final String ANY_HOST = null;
    public static final int ANY_PORT = -1;
    public static final String ANY_REALM = null;
    public static final String ANY_SCHEME = null;
    private final String host;
    private final HttpHost origin;
    private final int port;
    private final String realm;
    private final String scheme;

    public AuthScope(HttpHost httpHost) {
        this(httpHost, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(HttpHost httpHost, String str, String str2) {
        Args.notNull(httpHost, "Host");
        this.host = httpHost.getHostName().toLowerCase(Locale.ROOT);
        this.port = httpHost.getPort() < 0 ? -1 : httpHost.getPort();
        this.realm = str == null ? ANY_REALM : str;
        this.scheme = str2 == null ? ANY_SCHEME : str2.toUpperCase(Locale.ROOT);
        this.origin = httpHost;
    }

    public AuthScope(AuthScope authScope) {
        Args.notNull(authScope, "Scope");
        this.host = authScope.getHost();
        this.port = authScope.getPort();
        this.realm = authScope.getRealm();
        this.scheme = authScope.getScheme();
        this.origin = authScope.getOrigin();
    }

    public AuthScope(String str, int i2) {
        this(str, i2, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(String str, int i2, String str2) {
        this(str, i2, str2, ANY_SCHEME);
    }

    public AuthScope(String str, int i2, String str2, String str3) {
        this.host = str == null ? ANY_HOST : str.toLowerCase(Locale.ROOT);
        this.port = i2 < 0 ? -1 : i2;
        this.realm = str2 == null ? ANY_REALM : str2;
        this.scheme = str3 == null ? ANY_SCHEME : str3.toUpperCase(Locale.ROOT);
        this.origin = null;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthScope)) {
            return super.equals(obj);
        }
        AuthScope authScope = (AuthScope) obj;
        return LangUtils.equals(this.host, authScope.host) && this.port == authScope.port && LangUtils.equals(this.realm, authScope.realm) && LangUtils.equals(this.scheme, authScope.scheme);
    }

    public String getHost() {
        return this.host;
    }

    public HttpHost getOrigin() {
        return this.origin;
    }

    public int getPort() {
        return this.port;
    }

    public String getRealm() {
        return this.realm;
    }

    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.host), this.port), this.realm), this.scheme);
    }

    public int match(AuthScope authScope) {
        int i2;
        if (LangUtils.equals(this.scheme, authScope.scheme)) {
            i2 = 1;
        } else {
            String str = this.scheme;
            String str2 = ANY_SCHEME;
            if (str != str2 && authScope.scheme != str2) {
                return -1;
            }
            i2 = 0;
        }
        if (LangUtils.equals(this.realm, authScope.realm)) {
            i2 += 2;
        } else {
            String str3 = this.realm;
            String str4 = ANY_REALM;
            if (str3 != str4 && authScope.realm != str4) {
                return -1;
            }
        }
        int i3 = this.port;
        int i4 = authScope.port;
        if (i3 == i4) {
            i2 += 4;
        } else if (i3 != -1 && i4 != -1) {
            return -1;
        }
        if (LangUtils.equals(this.host, authScope.host)) {
            return i2 + 8;
        }
        String str5 = this.host;
        String str6 = ANY_HOST;
        if (str5 == str6 || authScope.host == str6) {
            return i2;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.scheme;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(TokenParser.SP);
        }
        if (this.realm != null) {
            sb.append('\'');
            sb.append(this.realm);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.host != null) {
            sb.append('@');
            sb.append(this.host);
            if (this.port >= 0) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(this.port);
            }
        }
        return sb.toString();
    }
}

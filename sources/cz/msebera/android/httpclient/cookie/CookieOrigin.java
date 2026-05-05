package cz.msebera.android.httpclient.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.TextUtils;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CookieOrigin {
    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public CookieOrigin(String str, int i2, String str2, boolean z2) {
        Args.notBlank(str, "Host");
        Args.notNegative(i2, "Port");
        Args.notNull(str2, "Path");
        this.host = str.toLowerCase(Locale.ROOT);
        this.port = i2;
        if (TextUtils.isBlank(str2)) {
            this.path = RemoteSettings.FORWARD_SLASH_STRING;
        } else {
            this.path = str2;
        }
        this.secure = z2;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.secure) {
            sb.append("(secure)");
        }
        sb.append(this.host);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(Integer.toString(this.port));
        sb.append(this.path);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}

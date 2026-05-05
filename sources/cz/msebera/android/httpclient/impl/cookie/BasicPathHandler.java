package cz.msebera.android.httpclient.impl.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.cookie.CommonCookieAttributeHandler;
import cz.msebera.android.httpclient.cookie.Cookie;
import cz.msebera.android.httpclient.cookie.CookieOrigin;
import cz.msebera.android.httpclient.cookie.MalformedCookieException;
import cz.msebera.android.httpclient.cookie.SetCookie;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class BasicPathHandler implements CommonCookieAttributeHandler {
    static boolean pathMatch(String str, String str2) {
        if (str2 == null) {
            str2 = RemoteSettings.FORWARD_SLASH_STRING;
        }
        if (str2.length() > 1 && str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        return str.startsWith(str2) && (str2.equals(RemoteSettings.FORWARD_SLASH_STRING) || str.length() == str2.length() || str.charAt(str2.length()) == '/');
    }

    @Override // cz.msebera.android.httpclient.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return "path";
    }

    @Override // cz.msebera.android.httpclient.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(cookieOrigin, "Cookie origin");
        return pathMatch(cookieOrigin.getPath(), cookie.getPath());
    }

    @Override // cz.msebera.android.httpclient.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, "Cookie");
        if (TextUtils.isBlank(str)) {
            str = RemoteSettings.FORWARD_SLASH_STRING;
        }
        setCookie.setPath(str);
    }

    @Override // cz.msebera.android.httpclient.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
    }
}

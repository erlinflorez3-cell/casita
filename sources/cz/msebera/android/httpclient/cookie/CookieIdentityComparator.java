package cz.msebera.android.httpclient.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class CookieIdentityComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        int iCompareTo = cookie.getName().compareTo(cookie2.getName());
        if (iCompareTo == 0) {
            String domain = cookie.getDomain();
            if (domain == null) {
                domain = "";
            } else if (domain.indexOf(46) == -1) {
                domain = domain + ".local";
            }
            String domain2 = cookie2.getDomain();
            iCompareTo = domain.compareToIgnoreCase(domain2 != null ? domain2.indexOf(46) == -1 ? domain2 + ".local" : domain2 : "");
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        String path = cookie.getPath();
        String str = RemoteSettings.FORWARD_SLASH_STRING;
        if (path == null) {
            path = RemoteSettings.FORWARD_SLASH_STRING;
        }
        String path2 = cookie2.getPath();
        if (path2 != null) {
            str = path2;
        }
        return path.compareTo(str);
    }
}

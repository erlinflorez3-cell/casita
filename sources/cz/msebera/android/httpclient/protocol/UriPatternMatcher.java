package cz.msebera.android.httpclient.protocol;

import androidx.webkit.ProxyConfig;
import cz.msebera.android.httpclient.util.Args;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class UriPatternMatcher<T> {
    private final Map<String, T> map = new LinkedHashMap();

    public synchronized Set<Map.Entry<String, T>> entrySet() {
        return new HashSet(this.map.entrySet());
    }

    @Deprecated
    public synchronized Map<String, T> getObjects() {
        return this.map;
    }

    public synchronized T lookup(String str) {
        T t2;
        Args.notNull(str, "Request path");
        t2 = this.map.get(str);
        if (t2 == null) {
            String str2 = null;
            for (String str3 : this.map.keySet()) {
                if (matchUriRequestPattern(str3, str) && (str2 == null || str2.length() < str3.length() || (str2.length() == str3.length() && str3.endsWith(ProxyConfig.MATCH_ALL_SCHEMES)))) {
                    t2 = this.map.get(str3);
                    str2 = str3;
                }
            }
        }
        return t2;
    }

    protected boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (str.endsWith(ProxyConfig.MATCH_ALL_SCHEMES) && str2.startsWith(str.substring(0, str.length() - 1))) {
            return true;
        }
        return str.startsWith(ProxyConfig.MATCH_ALL_SCHEMES) && str2.endsWith(str.substring(1, str.length()));
    }

    public synchronized void register(String str, T t2) {
        Args.notNull(str, "URI request pattern");
        this.map.put(str, t2);
    }

    @Deprecated
    public synchronized void setHandlers(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.map.clear();
        this.map.putAll(map);
    }

    @Deprecated
    public synchronized void setObjects(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.map.clear();
        this.map.putAll(map);
    }

    public String toString() {
        return this.map.toString();
    }

    public synchronized void unregister(String str) {
        if (str == null) {
            return;
        }
        this.map.remove(str);
    }
}

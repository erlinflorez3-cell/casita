package io.sentry.util;

import com.dynatrace.android.agent.Global;
import io.sentry.ISpan;
import io.sentry.SpanDataConvention;
import io.sentry.protocol.Request;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class UrlUtils {
    private static final Pattern AUTH_REGEX = Pattern.compile("(.+://)(.*@)(.*)");
    public static final String SENSITIVE_DATA_SUBSTITUTE = "[Filtered]";

    public static final class UrlDetails {
        private final String fragment;
        private final String query;
        private final String url;

        public UrlDetails(String str, String str2, String str3) {
            this.url = str;
            this.query = str2;
            this.fragment = str3;
        }

        public void applyToRequest(Request request) {
            if (request == null) {
                return;
            }
            request.setUrl(this.url);
            request.setQueryString(this.query);
            request.setFragment(this.fragment);
        }

        public void applyToSpan(ISpan iSpan) {
            if (iSpan == null) {
                return;
            }
            String str = this.query;
            if (str != null) {
                iSpan.setData(SpanDataConvention.HTTP_QUERY_KEY, str);
            }
            String str2 = this.fragment;
            if (str2 != null) {
                iSpan.setData(SpanDataConvention.HTTP_FRAGMENT_KEY, str2);
            }
        }

        public String getFragment() {
            return this.fragment;
        }

        public String getQuery() {
            return this.query;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlOrFallback() {
            String str = this.url;
            return str == null ? "unknown" : str;
        }
    }

    private static String baseUrlOnly(String str) {
        int iIndexOf = str.indexOf(Global.QUESTION);
        if (iIndexOf >= 0) {
            return str.substring(0, iIndexOf).trim();
        }
        int iIndexOf2 = str.indexOf("#");
        return iIndexOf2 >= 0 ? str.substring(0, iIndexOf2).trim() : str;
    }

    private static String extractBaseUrl(String str, int i2, int i3) {
        return i2 >= 0 ? str.substring(0, i2).trim() : i3 >= 0 ? str.substring(0, i3).trim() : str;
    }

    private static String extractFragment(String str, int i2) {
        if (i2 > 0) {
            return str.substring(i2 + 1).trim();
        }
        return null;
    }

    private static String extractQuery(String str, int i2, int i3) {
        if (i2 > 0) {
            return (i3 <= 0 || i3 <= i2) ? str.substring(i2 + 1).trim() : str.substring(i2 + 1, i3).trim();
        }
        return null;
    }

    private static boolean isAbsoluteUrl(String str) {
        return str.contains("://");
    }

    public static UrlDetails parse(String str) {
        return isAbsoluteUrl(str) ? splitAbsoluteUrl(str) : splitRelativeUrl(str);
    }

    public static UrlDetails parseNullable(String str) {
        if (str == null) {
            return null;
        }
        return parse(str);
    }

    private static UrlDetails splitAbsoluteUrl(String str) {
        try {
            String strUrlWithAuthRemoved = urlWithAuthRemoved(str);
            URL url = new URL(str);
            String strBaseUrlOnly = baseUrlOnly(strUrlWithAuthRemoved);
            return strBaseUrlOnly.contains("#") ? new UrlDetails(null, null, null) : new UrlDetails(strBaseUrlOnly, url.getQuery(), url.getRef());
        } catch (MalformedURLException unused) {
            return new UrlDetails(null, null, null);
        }
    }

    private static UrlDetails splitRelativeUrl(String str) {
        int iIndexOf = str.indexOf(Global.QUESTION);
        int iIndexOf2 = str.indexOf("#");
        return new UrlDetails(extractBaseUrl(str, iIndexOf, iIndexOf2), extractQuery(str, iIndexOf, iIndexOf2), extractFragment(str, iIndexOf2));
    }

    private static String urlWithAuthRemoved(String str) {
        Matcher matcher = AUTH_REGEX.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 3) {
            return matcher.group(1) + (matcher.group(2).contains(Global.COLON) ? "[Filtered]:[Filtered]@" : "[Filtered]@") + matcher.group(3);
        }
        return str;
    }
}

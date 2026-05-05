package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHttpRequest;

/* JADX INFO: loaded from: classes3.dex */
class CbURIDesc {
    private static final String LOGTAG = Global.LOG_PREFIX + "CbURIDesc";
    String desc;
    String host;
    URI uri;

    CbURIDesc() {
    }

    static CbURIDesc createURIDesc(HttpRequest httpRequest, HttpHost httpHost) {
        CbURIDesc cbURIDesc = new CbURIDesc();
        String string = httpHost == null ? null : httpHost.toString();
        String pathPart = getPathPart(httpRequest);
        if (string != null && pathPart != null) {
            try {
                cbURIDesc.uri = new URI(string + pathPart);
                cbURIDesc.host = httpHost.getHostName();
                cbURIDesc.desc = Utility.truncateWebRequest(cbURIDesc.uri.toString());
                return cbURIDesc;
            } catch (URISyntaxException e2) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, e2.toString(), e2);
                }
            }
        }
        if (string == null) {
            cbURIDesc.host = Global.HYPHEN;
            string = Global.HYPHEN;
        } else {
            cbURIDesc.host = httpHost.getHostName();
        }
        if (pathPart == null) {
            pathPart = Global.HYPHEN;
        }
        cbURIDesc.desc = Utility.truncateWebRequest(string + Global.BLANK + pathPart);
        return cbURIDesc;
    }

    private static String getPathPart(HttpRequest httpRequest) {
        RequestLine requestLine;
        String uri;
        int iIndexOf;
        if (!(httpRequest instanceof HttpUriRequest)) {
            if ((!(httpRequest instanceof HttpEntityEnclosingRequest) && !(httpRequest instanceof BasicHttpRequest)) || (requestLine = httpRequest.getRequestLine()) == null || (uri = requestLine.getUri()) == null) {
                return null;
            }
            if (uri.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                return uri;
            }
            int iIndexOf2 = uri.indexOf("://");
            if (iIndexOf2 >= 0 && (iIndexOf = uri.indexOf(RemoteSettings.FORWARD_SLASH_STRING, iIndexOf2 + 3)) >= 0) {
                return uri.substring(iIndexOf);
            }
            return null;
        }
        URI uri2 = ((HttpUriRequest) httpRequest).getURI();
        if (uri2 == null) {
            return null;
        }
        if (uri2.getRawPath() == null) {
            if (uri2.getHost() != null) {
                return RemoteSettings.FORWARD_SLASH_STRING;
            }
            return null;
        }
        if (!uri2.getRawPath().startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            if (uri2.getRawPath().length() == 0) {
                return RemoteSettings.FORWARD_SLASH_STRING;
            }
            return null;
        }
        String rawPath = uri2.getRawPath();
        if (uri2.getQuery() != null) {
            rawPath = rawPath + Global.QUESTION + uri2.getRawQuery();
        }
        return uri2.getFragment() != null ? rawPath + "#" + uri2.getRawFragment() : rawPath;
    }
}

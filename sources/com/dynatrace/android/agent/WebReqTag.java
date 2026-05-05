package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class WebReqTag {
    private static final String TAG_PREFIX = "MT_3_";
    private String applId;
    private long parentTagId;
    private int seqNumber;
    private int serverId;
    private Session session;
    private long threadId;

    public WebReqTag(int i2, Session session, String str, long j2, long j3, int i3) {
        this.serverId = i2;
        this.session = session;
        this.applId = str;
        this.parentTagId = j2;
        this.threadId = j3;
        this.seqNumber = i3;
    }

    public WebReqTag(long j2, int i2, Session session) {
        this(i2, session, AdkSettings.appIdEncoded, j2, Utility.getCurrentThreadId(), Utility.getEventSeqNum());
    }

    public static String fetchWebReqTag(URLConnection uRLConnection, String str) {
        String requestProperty = null;
        if (uRLConnection == null) {
            return null;
        }
        try {
            requestProperty = uRLConnection.getRequestProperty(str);
            return requestProperty;
        } catch (Exception unused) {
            return requestProperty;
        }
    }

    public static String getTagPrefix() {
        return TAG_PREFIX;
    }

    public static WebReqTag parseTag(String str, Session session) {
        if (str != null && str.length() >= 1) {
            String[] strArrSplit = str.split(Global.UNDERSCORE);
            if (strArrSplit.length != 9) {
                return null;
            }
            try {
                long j2 = Long.parseLong(strArrSplit[3]);
                int iIndexOf = strArrSplit[4].indexOf(45);
                int i2 = Integer.parseInt(strArrSplit[4].substring(0, iIndexOf));
                int i3 = Integer.parseInt(strArrSplit[4].substring(iIndexOf + 1));
                if (session.visitorId == j2 && session.sessionId == i2 && session.sequenceNumber == i3) {
                    return new WebReqTag(Integer.parseInt(strArrSplit[2]), session, strArrSplit[5], Long.parseLong(strArrSplit[6]), Long.parseLong(strArrSplit[7]), Integer.parseInt(strArrSplit[8]));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String tagToString(WebReqTag webReqTag) {
        return webReqTag == null ? "" : webReqTag.toString();
    }

    public long getParentTagId() {
        return this.parentTagId;
    }

    public int getSeqNumber() {
        return this.seqNumber;
    }

    public int getServerId() {
        return this.serverId;
    }

    public Session getSession() {
        return this.session;
    }

    public boolean sameAs(WebReqTag webReqTag) {
        if (webReqTag == null) {
            return false;
        }
        return sameAs(webReqTag.toString());
    }

    public boolean sameAs(String str) {
        if (str == null) {
            return false;
        }
        return toString().equals(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(TAG_PREFIX);
        sb.append(this.serverId).append(Global.UNDERSCORE);
        sb.append(this.session.visitorId).append(Global.UNDERSCORE);
        sb.append(this.session.sessionId);
        sb.append(Global.HYPHEN).append(this.session.sequenceNumber);
        sb.append(Global.UNDERSCORE);
        sb.append(this.applId).append(Global.UNDERSCORE);
        sb.append(this.parentTagId).append(Global.UNDERSCORE);
        sb.append(this.threadId).append(Global.UNDERSCORE);
        sb.append(this.seqNumber);
        return sb.toString();
    }
}

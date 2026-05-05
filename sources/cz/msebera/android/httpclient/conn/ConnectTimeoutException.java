package cz.msebera.android.httpclient.conn;

import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.HttpHost;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectTimeoutException extends InterruptedIOException {
    private static final long serialVersionUID = -4816682903149535989L;
    private final HttpHost host;

    public ConnectTimeoutException() {
        this.host = null;
    }

    public ConnectTimeoutException(IOException iOException, HttpHost httpHost, InetAddress... inetAddressArr) {
        super("Connect to " + (httpHost != null ? httpHost.toHostString() : "remote host") + ((inetAddressArr == null || inetAddressArr.length <= 0) ? "" : Global.BLANK + Arrays.asList(inetAddressArr)) + ((iOException == null || iOException.getMessage() == null) ? " timed out" : " failed: " + iOException.getMessage()));
        this.host = httpHost;
        initCause(iOException);
    }

    public ConnectTimeoutException(String str) {
        super(str);
        this.host = null;
    }

    public HttpHost getHost() {
        return this.host;
    }
}

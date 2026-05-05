package cz.msebera.android.httpclient.conn.socket;

import cz.msebera.android.httpclient.protocol.HttpContext;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes5.dex */
public interface LayeredConnectionSocketFactory extends ConnectionSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i2, HttpContext httpContext) throws IOException;
}

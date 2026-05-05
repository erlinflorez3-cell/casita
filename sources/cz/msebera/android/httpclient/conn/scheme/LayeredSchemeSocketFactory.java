package cz.msebera.android.httpclient.conn.scheme;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface LayeredSchemeSocketFactory extends SchemeSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i2, boolean z2) throws IOException;
}

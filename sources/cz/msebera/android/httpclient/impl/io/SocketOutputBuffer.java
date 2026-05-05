package cz.msebera.android.httpclient.impl.io;

import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.util.Args;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i2, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        i2 = i2 < 0 ? socket.getSendBufferSize() : i2;
        init(socket.getOutputStream(), i2 < 1024 ? 1024 : i2, httpParams);
    }
}

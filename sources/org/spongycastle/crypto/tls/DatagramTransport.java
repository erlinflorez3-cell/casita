package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface DatagramTransport {
    void close() throws IOException;

    int getReceiveLimit() throws IOException;

    int getSendLimit() throws IOException;

    int receive(byte[] bArr, int i2, int i3, int i4) throws IOException;

    void send(byte[] bArr, int i2, int i3) throws IOException;
}

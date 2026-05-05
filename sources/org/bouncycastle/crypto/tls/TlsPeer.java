package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsPeer {
    TlsCipher getCipher() throws IOException;

    TlsCompression getCompression() throws IOException;

    void notifyAlertRaised(short s2, short s3, String str, Throwable th);

    void notifyAlertReceived(short s2, short s3);

    void notifyHandshakeComplete() throws IOException;

    void notifySecureRenegotiation(boolean z2) throws IOException;

    boolean shouldUseGMTUnixTime();
}

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsHandshakeHash extends Digest {
    Digest forkPRFHash();

    byte[] getFinalHash(short s2);

    void init(TlsContext tlsContext);

    TlsHandshakeHash notifyPRFDetermined();

    void sealHashAlgorithms();

    TlsHandshakeHash stopTracking();

    void trackHashAlgorithm(short s2);
}

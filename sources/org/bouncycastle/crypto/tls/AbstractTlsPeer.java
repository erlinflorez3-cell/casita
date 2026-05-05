package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTlsPeer implements TlsPeer {
    @Override // org.bouncycastle.crypto.tls.TlsPeer
    public void notifyAlertRaised(short s2, short s3, String str, Throwable th) {
    }

    @Override // org.bouncycastle.crypto.tls.TlsPeer
    public void notifyAlertReceived(short s2, short s3) {
    }

    @Override // org.bouncycastle.crypto.tls.TlsPeer
    public void notifyHandshakeComplete() throws IOException {
    }

    @Override // org.bouncycastle.crypto.tls.TlsPeer
    public void notifySecureRenegotiation(boolean z2) throws IOException {
        if (!z2) {
            throw new TlsFatalAlert((short) 40);
        }
    }

    @Override // org.bouncycastle.crypto.tls.TlsPeer
    public boolean shouldUseGMTUnixTime() {
        return false;
    }
}

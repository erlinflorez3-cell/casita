package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class AbstractTlsCipherFactory implements TlsCipherFactory {
    @Override // org.bouncycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsContext tlsContext, int i2, int i3) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }
}

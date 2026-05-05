package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsCipherFactory {
    TlsCipher createCipher(TlsContext tlsContext, int i2, int i3) throws IOException;
}

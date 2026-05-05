package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
interface DTLSHandshakeRetransmit {
    void receivedHandshakeRecord(int i2, byte[] bArr, int i3, int i4) throws IOException;
}

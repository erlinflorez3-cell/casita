package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsCipher {
    byte[] decodeCiphertext(long j2, short s2, byte[] bArr, int i2, int i3) throws IOException;

    byte[] encodePlaintext(long j2, short s2, byte[] bArr, int i2, int i3) throws IOException;

    int getPlaintextLimit(int i2);
}

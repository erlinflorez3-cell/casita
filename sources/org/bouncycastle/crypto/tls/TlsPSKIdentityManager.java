package org.bouncycastle.crypto.tls;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}

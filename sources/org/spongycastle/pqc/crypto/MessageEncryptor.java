package org.spongycastle.pqc.crypto;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public interface MessageEncryptor {
    void init(boolean z2, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr) throws Exception;

    byte[] messageEncrypt(byte[] bArr) throws Exception;
}

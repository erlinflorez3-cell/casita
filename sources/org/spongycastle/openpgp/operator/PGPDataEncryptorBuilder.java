package org.spongycastle.openpgp.operator;

import java.security.SecureRandom;
import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPDataEncryptorBuilder {
    PGPDataEncryptor build(byte[] bArr) throws PGPException;

    int getAlgorithm();

    SecureRandom getSecureRandom();
}

package org.spongycastle.openpgp.operator;

import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPDataDecryptorFactory {
    PGPDataDecryptor createDataDecryptor(boolean z2, int i2, byte[] bArr) throws PGPException;
}

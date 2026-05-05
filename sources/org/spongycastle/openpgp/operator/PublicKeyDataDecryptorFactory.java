package org.spongycastle.openpgp.operator;

import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public interface PublicKeyDataDecryptorFactory extends PGPDataDecryptorFactory {
    byte[] recoverSessionData(int i2, byte[][] bArr) throws PGPException;
}

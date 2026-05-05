package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class CMacWithIV extends CMac {
    public CMacWithIV(BlockCipher blockCipher) {
        super(blockCipher);
    }

    public CMacWithIV(BlockCipher blockCipher, int i2) {
        super(blockCipher, i2);
    }

    @Override // org.spongycastle.crypto.macs.CMac
    void validate(CipherParameters cipherParameters) {
    }
}

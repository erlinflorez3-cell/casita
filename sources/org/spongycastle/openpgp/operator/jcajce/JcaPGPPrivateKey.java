package org.spongycastle.openpgp.operator.jcajce;

import java.security.PrivateKey;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPPrivateKey extends PGPPrivateKey {
    private final PrivateKey privateKey;

    public JcaPGPPrivateKey(long j2, PrivateKey privateKey) {
        super(j2, null, null);
        this.privateKey = privateKey;
    }

    public JcaPGPPrivateKey(PGPPublicKey pGPPublicKey, PrivateKey privateKey) {
        super(pGPPublicKey.getKeyID(), pGPPublicKey.getPublicKeyPacket(), null);
        this.privateKey = privateKey;
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }
}

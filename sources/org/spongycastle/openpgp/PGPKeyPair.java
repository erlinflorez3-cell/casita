package org.spongycastle.openpgp;

/* JADX INFO: loaded from: classes2.dex */
public class PGPKeyPair {
    protected PGPPrivateKey priv;
    protected PGPPublicKey pub;

    protected PGPKeyPair() {
    }

    public PGPKeyPair(PGPPublicKey pGPPublicKey, PGPPrivateKey pGPPrivateKey) {
        this.pub = pGPPublicKey;
        this.priv = pGPPrivateKey;
    }

    public long getKeyID() {
        return this.pub.getKeyID();
    }

    public PGPPrivateKey getPrivateKey() {
        return this.priv;
    }

    public PGPPublicKey getPublicKey() {
        return this.pub;
    }
}

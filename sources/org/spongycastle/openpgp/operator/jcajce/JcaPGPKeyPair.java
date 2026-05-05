package org.spongycastle.openpgp.operator.jcajce;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;
import org.spongycastle.openpgp.PGPAlgorithmParameters;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPKeyPair;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPKeyPair extends PGPKeyPair {
    public JcaPGPKeyPair(int i2, KeyPair keyPair, Date date) throws PGPException {
        this.pub = getPublicKey(i2, keyPair.getPublic(), date);
        this.priv = getPrivateKey(this.pub, keyPair.getPrivate());
    }

    public JcaPGPKeyPair(int i2, PGPAlgorithmParameters pGPAlgorithmParameters, KeyPair keyPair, Date date) throws PGPException {
        this.pub = getPublicKey(i2, pGPAlgorithmParameters, keyPair.getPublic(), date);
        this.priv = getPrivateKey(this.pub, keyPair.getPrivate());
    }

    private static PGPPrivateKey getPrivateKey(PGPPublicKey pGPPublicKey, PrivateKey privateKey) throws PGPException {
        return new JcaPGPKeyConverter().getPGPPrivateKey(pGPPublicKey, privateKey);
    }

    private static PGPPublicKey getPublicKey(int i2, PublicKey publicKey, Date date) throws PGPException {
        return new JcaPGPKeyConverter().getPGPPublicKey(i2, publicKey, date);
    }

    private static PGPPublicKey getPublicKey(int i2, PGPAlgorithmParameters pGPAlgorithmParameters, PublicKey publicKey, Date date) throws PGPException {
        return new JcaPGPKeyConverter().getPGPPublicKey(i2, pGPAlgorithmParameters, publicKey, date);
    }
}

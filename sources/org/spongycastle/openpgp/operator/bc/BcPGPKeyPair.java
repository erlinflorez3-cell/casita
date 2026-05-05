package org.spongycastle.openpgp.operator.bc;

import java.util.Date;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.openpgp.PGPAlgorithmParameters;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPKeyPair;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPKeyPair extends PGPKeyPair {
    public BcPGPKeyPair(int i2, AsymmetricCipherKeyPair asymmetricCipherKeyPair, Date date) throws PGPException {
        this.pub = getPublicKey(i2, null, asymmetricCipherKeyPair.getPublic(), date);
        this.priv = getPrivateKey(this.pub, asymmetricCipherKeyPair.getPrivate());
    }

    public BcPGPKeyPair(int i2, PGPAlgorithmParameters pGPAlgorithmParameters, AsymmetricCipherKeyPair asymmetricCipherKeyPair, Date date) throws PGPException {
        this.pub = getPublicKey(i2, pGPAlgorithmParameters, asymmetricCipherKeyPair.getPublic(), date);
        this.priv = getPrivateKey(this.pub, asymmetricCipherKeyPair.getPrivate());
    }

    private static PGPPrivateKey getPrivateKey(PGPPublicKey pGPPublicKey, AsymmetricKeyParameter asymmetricKeyParameter) throws PGPException {
        return new BcPGPKeyConverter().getPGPPrivateKey(pGPPublicKey, asymmetricKeyParameter);
    }

    private static PGPPublicKey getPublicKey(int i2, PGPAlgorithmParameters pGPAlgorithmParameters, AsymmetricKeyParameter asymmetricKeyParameter, Date date) throws PGPException {
        return new BcPGPKeyConverter().getPGPPublicKey(i2, pGPAlgorithmParameters, asymmetricKeyParameter, date);
    }
}

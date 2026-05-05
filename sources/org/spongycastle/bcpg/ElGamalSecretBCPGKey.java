package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalSecretBCPGKey extends BCPGObject implements BCPGKey {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    MPInteger f27853x;

    public ElGamalSecretBCPGKey(BigInteger bigInteger) {
        this.f27853x = new MPInteger(bigInteger);
    }

    public ElGamalSecretBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        this.f27853x = new MPInteger(bCPGInputStream);
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writeObject(this.f27853x);
    }

    @Override // org.spongycastle.bcpg.BCPGObject, org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return super.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // org.spongycastle.bcpg.BCPGKey
    public String getFormat() {
        return "PGP";
    }

    public BigInteger getX() {
        return this.f27853x.getValue();
    }
}

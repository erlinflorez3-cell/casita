package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RSAPublicBCPGKey extends BCPGObject implements BCPGKey {

    /* JADX INFO: renamed from: e */
    MPInteger f27854e;

    /* JADX INFO: renamed from: n */
    MPInteger f27855n;

    public RSAPublicBCPGKey(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f27855n = new MPInteger(bigInteger);
        this.f27854e = new MPInteger(bigInteger2);
    }

    public RSAPublicBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        this.f27855n = new MPInteger(bCPGInputStream);
        this.f27854e = new MPInteger(bCPGInputStream);
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writeObject(this.f27855n);
        bCPGOutputStream.writeObject(this.f27854e);
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

    public BigInteger getModulus() {
        return this.f27855n.getValue();
    }

    public BigInteger getPublicExponent() {
        return this.f27854e.getValue();
    }
}

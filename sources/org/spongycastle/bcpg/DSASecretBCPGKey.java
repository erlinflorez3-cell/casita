package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DSASecretBCPGKey extends BCPGObject implements BCPGKey {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    MPInteger f27848x;

    public DSASecretBCPGKey(BigInteger bigInteger) {
        this.f27848x = new MPInteger(bigInteger);
    }

    public DSASecretBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        this.f27848x = new MPInteger(bCPGInputStream);
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writeObject(this.f27848x);
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
        return this.f27848x.getValue();
    }
}

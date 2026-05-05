package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalPublicBCPGKey extends BCPGObject implements BCPGKey {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MPInteger f27850g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    MPInteger f27851p;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    MPInteger f27852y;

    public ElGamalPublicBCPGKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27851p = new MPInteger(bigInteger);
        this.f27850g = new MPInteger(bigInteger2);
        this.f27852y = new MPInteger(bigInteger3);
    }

    public ElGamalPublicBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        this.f27851p = new MPInteger(bCPGInputStream);
        this.f27850g = new MPInteger(bCPGInputStream);
        this.f27852y = new MPInteger(bCPGInputStream);
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writeObject(this.f27851p);
        bCPGOutputStream.writeObject(this.f27850g);
        bCPGOutputStream.writeObject(this.f27852y);
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

    public BigInteger getG() {
        return this.f27850g.getValue();
    }

    public BigInteger getP() {
        return this.f27851p.getValue();
    }

    public BigInteger getY() {
        return this.f27852y.getValue();
    }
}

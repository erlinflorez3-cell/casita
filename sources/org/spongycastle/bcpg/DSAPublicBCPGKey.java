package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DSAPublicBCPGKey extends BCPGObject implements BCPGKey {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MPInteger f27844g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    MPInteger f27845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    MPInteger f27846q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    MPInteger f27847y;

    public DSAPublicBCPGKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f27845p = new MPInteger(bigInteger);
        this.f27846q = new MPInteger(bigInteger2);
        this.f27844g = new MPInteger(bigInteger3);
        this.f27847y = new MPInteger(bigInteger4);
    }

    public DSAPublicBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        this.f27845p = new MPInteger(bCPGInputStream);
        this.f27846q = new MPInteger(bCPGInputStream);
        this.f27844g = new MPInteger(bCPGInputStream);
        this.f27847y = new MPInteger(bCPGInputStream);
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writeObject(this.f27845p);
        bCPGOutputStream.writeObject(this.f27846q);
        bCPGOutputStream.writeObject(this.f27844g);
        bCPGOutputStream.writeObject(this.f27847y);
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
        return this.f27844g.getValue();
    }

    public BigInteger getP() {
        return this.f27845p.getValue();
    }

    public BigInteger getQ() {
        return this.f27846q.getValue();
    }

    public BigInteger getY() {
        return this.f27847y.getValue();
    }
}

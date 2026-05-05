package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RSASecretBCPGKey extends BCPGObject implements BCPGKey {
    BigInteger crt;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    MPInteger f27856d;
    BigInteger expP;
    BigInteger expQ;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    MPInteger f27857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    MPInteger f27858q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    MPInteger f27859u;

    public RSASecretBCPGKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int iCompareTo = bigInteger2.compareTo(bigInteger3);
        if (iCompareTo >= 0) {
            if (iCompareTo == 0) {
                throw new IllegalArgumentException("p and q cannot be equal");
            }
            bigInteger3 = bigInteger2;
            bigInteger2 = bigInteger3;
        }
        this.f27856d = new MPInteger(bigInteger);
        this.f27857p = new MPInteger(bigInteger2);
        this.f27858q = new MPInteger(bigInteger3);
        this.f27859u = new MPInteger(bigInteger2.modInverse(bigInteger3));
        this.expP = bigInteger.remainder(bigInteger2.subtract(BigInteger.valueOf(1L)));
        this.expQ = bigInteger.remainder(bigInteger3.subtract(BigInteger.valueOf(1L)));
        this.crt = bigInteger3.modInverse(bigInteger2);
    }

    public RSASecretBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        this.f27856d = new MPInteger(bCPGInputStream);
        this.f27857p = new MPInteger(bCPGInputStream);
        this.f27858q = new MPInteger(bCPGInputStream);
        this.f27859u = new MPInteger(bCPGInputStream);
        this.expP = this.f27856d.getValue().remainder(this.f27857p.getValue().subtract(BigInteger.valueOf(1L)));
        this.expQ = this.f27856d.getValue().remainder(this.f27858q.getValue().subtract(BigInteger.valueOf(1L)));
        this.crt = this.f27858q.getValue().modInverse(this.f27857p.getValue());
    }

    @Override // org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writeObject(this.f27856d);
        bCPGOutputStream.writeObject(this.f27857p);
        bCPGOutputStream.writeObject(this.f27858q);
        bCPGOutputStream.writeObject(this.f27859u);
    }

    public BigInteger getCrtCoefficient() {
        return this.crt;
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
        return this.f27857p.getValue().multiply(this.f27858q.getValue());
    }

    public BigInteger getPrimeExponentP() {
        return this.expP;
    }

    public BigInteger getPrimeExponentQ() {
        return this.expQ;
    }

    public BigInteger getPrimeP() {
        return this.f27857p.getValue();
    }

    public BigInteger getPrimeQ() {
        return this.f27858q.getValue();
    }

    public BigInteger getPrivateExponent() {
        return this.f27856d.getValue();
    }
}

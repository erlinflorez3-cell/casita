package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    private BigInteger dP;
    private BigInteger dQ;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BigInteger f27972e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27974q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f27972e = bigInteger2;
        this.f27973p = bigInteger4;
        this.f27974q = bigInteger5;
        this.dP = bigInteger6;
        this.dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getDQ() {
        return this.dQ;
    }

    public BigInteger getP() {
        return this.f27973p;
    }

    public BigInteger getPublicExponent() {
        return this.f27972e;
    }

    public BigInteger getQ() {
        return this.f27974q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}

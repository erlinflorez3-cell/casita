package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27608g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f27609n;

    public NaccacheSternKeyParameters(boolean z2, BigInteger bigInteger, BigInteger bigInteger2, int i2) {
        super(z2);
        this.f27608g = bigInteger;
        this.f27609n = bigInteger2;
        this.lowerSigmaBound = i2;
    }

    public BigInteger getG() {
        return this.f27608g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f27609n;
    }
}

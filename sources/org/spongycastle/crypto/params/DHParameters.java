package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27937g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BigInteger f27938j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27940m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27942q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i2) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i2), i2, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i2, int i3) {
        this(bigInteger, bigInteger2, bigInteger3, i2, i3, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i2, int i3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i3 != 0) {
            if (i3 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i3 < i2) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.f27937g = bigInteger2;
        this.f27941p = bigInteger;
        this.f27942q = bigInteger3;
        this.f27940m = i2;
        this.f27939l = i3;
        this.f27938j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
    }

    private static int getDefaultMParam(int i2) {
        if (i2 != 0 && i2 < 160) {
            return i2;
        }
        return 160;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f27941p) && dHParameters.getG().equals(this.f27937g);
    }

    public BigInteger getG() {
        return this.f27937g;
    }

    public BigInteger getJ() {
        return this.f27938j;
    }

    public int getL() {
        return this.f27939l;
    }

    public int getM() {
        return this.f27940m;
    }

    public BigInteger getP() {
        return this.f27941p;
    }

    public BigInteger getQ() {
        return this.f27942q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }
}

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes6.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27585g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27587q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27585g = bigInteger3;
        this.f27586p = bigInteger;
        this.f27587q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f27585g = bigInteger3;
        this.f27586p = bigInteger;
        this.f27587q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f27586p) && dSAParameters.getQ().equals(this.f27587q) && dSAParameters.getG().equals(this.f27585g);
    }

    public BigInteger getG() {
        return this.f27585g;
    }

    public BigInteger getP() {
        return this.f27586p;
    }

    public BigInteger getQ() {
        return this.f27587q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}

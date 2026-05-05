package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27947g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27949q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27947g = bigInteger3;
        this.f27948p = bigInteger;
        this.f27949q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f27947g = bigInteger3;
        this.f27948p = bigInteger;
        this.f27949q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f27948p) && dSAParameters.getQ().equals(this.f27949q) && dSAParameters.getG().equals(this.f27947g);
    }

    public BigInteger getG() {
        return this.f27947g;
    }

    public BigInteger getP() {
        return this.f27948p;
    }

    public BigInteger getQ() {
        return this.f27949q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}

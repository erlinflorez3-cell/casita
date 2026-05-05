package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes6.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f27598a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27600q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27599p = bigInteger;
        this.f27600q = bigInteger2;
        this.f27598a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f27598a = bigInteger3;
        this.f27599p = bigInteger;
        this.f27600q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f27599p) && gOST3410Parameters.getQ().equals(this.f27600q) && gOST3410Parameters.getA().equals(this.f27598a);
    }

    public BigInteger getA() {
        return this.f27598a;
    }

    public BigInteger getP() {
        return this.f27599p;
    }

    public BigInteger getQ() {
        return this.f27600q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f27599p.hashCode() ^ this.f27600q.hashCode()) ^ this.f27598a.hashCode();
    }
}

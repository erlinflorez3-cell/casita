package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f27960a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27962q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27961p = bigInteger;
        this.f27962q = bigInteger2;
        this.f27960a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f27960a = bigInteger3;
        this.f27961p = bigInteger;
        this.f27962q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f27961p) && gOST3410Parameters.getQ().equals(this.f27962q) && gOST3410Parameters.getA().equals(this.f27960a);
    }

    public BigInteger getA() {
        return this.f27960a;
    }

    public BigInteger getP() {
        return this.f27961p;
    }

    public BigInteger getQ() {
        return this.f27962q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f27961p.hashCode() ^ this.f27962q.hashCode()) ^ this.f27960a.hashCode();
    }
}

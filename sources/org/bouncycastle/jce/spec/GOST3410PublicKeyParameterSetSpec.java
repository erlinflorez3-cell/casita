package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f27666a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27668q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27667p = bigInteger;
        this.f27668q = bigInteger2;
        this.f27666a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PublicKeyParameterSetSpec)) {
            return false;
        }
        GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
        return this.f27666a.equals(gOST3410PublicKeyParameterSetSpec.f27666a) && this.f27667p.equals(gOST3410PublicKeyParameterSetSpec.f27667p) && this.f27668q.equals(gOST3410PublicKeyParameterSetSpec.f27668q);
    }

    public BigInteger getA() {
        return this.f27666a;
    }

    public BigInteger getP() {
        return this.f27667p;
    }

    public BigInteger getQ() {
        return this.f27668q;
    }

    public int hashCode() {
        return (this.f27666a.hashCode() ^ this.f27667p.hashCode()) ^ this.f27668q.hashCode();
    }
}

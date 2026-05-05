package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f28031a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f28032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f28033q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f28032p = bigInteger;
        this.f28033q = bigInteger2;
        this.f28031a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PublicKeyParameterSetSpec)) {
            return false;
        }
        GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
        return this.f28031a.equals(gOST3410PublicKeyParameterSetSpec.f28031a) && this.f28032p.equals(gOST3410PublicKeyParameterSetSpec.f28032p) && this.f28033q.equals(gOST3410PublicKeyParameterSetSpec.f28033q);
    }

    public BigInteger getA() {
        return this.f28031a;
    }

    public BigInteger getP() {
        return this.f28032p;
    }

    public BigInteger getQ() {
        return this.f28033q;
    }

    public int hashCode() {
        return (this.f28031a.hashCode() ^ this.f28032p.hashCode()) ^ this.f28033q.hashCode();
    }
}

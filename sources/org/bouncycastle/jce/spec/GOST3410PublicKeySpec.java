package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f27669a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27671q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f27672y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f27672y = bigInteger;
        this.f27670p = bigInteger2;
        this.f27671q = bigInteger3;
        this.f27669a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f27669a;
    }

    public BigInteger getP() {
        return this.f27670p;
    }

    public BigInteger getQ() {
        return this.f27671q;
    }

    public BigInteger getY() {
        return this.f27672y;
    }
}

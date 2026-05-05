package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f28034a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f28035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f28036q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f28037y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f28037y = bigInteger;
        this.f28035p = bigInteger2;
        this.f28036q = bigInteger3;
        this.f28034a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f28034a;
    }

    public BigInteger getP() {
        return this.f28035p;
    }

    public BigInteger getQ() {
        return this.f28036q;
    }

    public BigInteger getY() {
        return this.f28037y;
    }
}

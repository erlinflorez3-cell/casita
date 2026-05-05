package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f28027a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f28028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f28029q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f28030x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f28030x = bigInteger;
        this.f28028p = bigInteger2;
        this.f28029q = bigInteger3;
        this.f28027a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f28027a;
    }

    public BigInteger getP() {
        return this.f28028p;
    }

    public BigInteger getQ() {
        return this.f28029q;
    }

    public BigInteger getX() {
        return this.f28030x;
    }
}

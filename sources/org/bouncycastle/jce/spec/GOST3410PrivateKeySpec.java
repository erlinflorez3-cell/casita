package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f27662a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f27664q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f27665x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f27665x = bigInteger;
        this.f27663p = bigInteger2;
        this.f27664q = bigInteger3;
        this.f27662a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f27662a;
    }

    public BigInteger getP() {
        return this.f27663p;
    }

    public BigInteger getQ() {
        return this.f27664q;
    }

    public BigInteger getX() {
        return this.f27665x;
    }
}

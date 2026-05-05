package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27658g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27659p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f27659p = bigInteger;
        this.f27658g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f27658g;
    }

    public BigInteger getP() {
        return this.f27659p;
    }
}

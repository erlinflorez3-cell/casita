package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f28023g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f28024p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f28024p = bigInteger;
        this.f28023g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f28023g;
    }

    public BigInteger getP() {
        return this.f28024p;
    }
}

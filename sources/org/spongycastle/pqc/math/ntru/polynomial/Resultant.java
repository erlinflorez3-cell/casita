package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class Resultant {
    public BigInteger res;
    public BigIntPolynomial rho;

    Resultant(BigIntPolynomial bigIntPolynomial, BigInteger bigInteger) {
        this.rho = bigIntPolynomial;
        this.res = bigInteger;
    }
}

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27955g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27956l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27957p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i2) {
        this.f27955g = bigInteger2;
        this.f27957p = bigInteger;
        this.f27956l = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f27957p) && elGamalParameters.getG().equals(this.f27955g) && elGamalParameters.getL() == this.f27956l;
    }

    public BigInteger getG() {
        return this.f27955g;
    }

    public int getL() {
        return this.f27956l;
    }

    public BigInteger getP() {
        return this.f27957p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f27956l;
    }
}

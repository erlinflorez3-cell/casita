package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes6.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f27593g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27594l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f27595p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i2) {
        this.f27593g = bigInteger2;
        this.f27595p = bigInteger;
        this.f27594l = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f27595p) && elGamalParameters.getG().equals(this.f27593g) && elGamalParameters.getL() == this.f27594l;
    }

    public BigInteger getG() {
        return this.f27593g;
    }

    public int getL() {
        return this.f27594l;
    }

    public BigInteger getP() {
        return this.f27595p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f27594l;
    }
}

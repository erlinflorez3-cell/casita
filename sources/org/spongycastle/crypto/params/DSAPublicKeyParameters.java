package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f27951y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.f27951y = bigInteger;
    }

    public BigInteger getY() {
        return this.f27951y;
    }
}

package org.spongycastle.crypto.params;

import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECPublicKeyParameters extends ECKeyParameters {
    ECPoint Q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.Q = eCPoint.normalize();
    }

    public ECPoint getQ() {
        return this.Q;
    }
}

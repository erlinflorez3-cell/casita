package org.spongycastle.bcpg;

import java.io.IOException;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECDSAPublicBCPGKey extends ECPublicBCPGKey {
    public ECDSAPublicBCPGKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, BigInteger bigInteger) throws IOException {
        super(aSN1ObjectIdentifier, bigInteger);
    }

    public ECDSAPublicBCPGKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, ECPoint eCPoint) {
        super(aSN1ObjectIdentifier, eCPoint);
    }

    protected ECDSAPublicBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        super(bCPGInputStream);
    }
}

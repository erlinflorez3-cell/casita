package org.spongycastle.asn1;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DERInteger extends ASN1Integer {
    public DERInteger(long j2) {
        super(j2);
    }

    public DERInteger(BigInteger bigInteger) {
        super(bigInteger);
    }

    public DERInteger(byte[] bArr) {
        super(bArr, true);
    }
}

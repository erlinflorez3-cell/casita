package org.bouncycastle.asn1;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class DERGeneralizedTime extends ASN1GeneralizedTime {
    public DERGeneralizedTime(String str) {
        super(str);
    }

    public DERGeneralizedTime(Date date) {
        super(date);
    }

    DERGeneralizedTime(byte[] bArr) {
        super(bArr);
    }
}

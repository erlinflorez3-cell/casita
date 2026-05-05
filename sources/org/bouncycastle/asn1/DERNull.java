package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class DERNull extends ASN1Null {
    public static final DERNull INSTANCE = new DERNull();
    private static final byte[] zeroBytes = new byte[0];

    @Override // org.bouncycastle.asn1.ASN1Null, org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(5, zeroBytes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength() {
        return 2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean isConstructed() {
        return false;
    }
}

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: c */
    private ECCurve f27492c;
    private final ASN1OctetString encoding;

    /* JADX INFO: renamed from: p */
    private ECPoint f27493p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f27492c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint) {
        this(eCPoint, false);
    }

    public X9ECPoint(ECPoint eCPoint, boolean z2) {
        this.f27493p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z2));
    }

    public synchronized ECPoint getPoint() {
        if (this.f27493p == null) {
            this.f27493p = this.f27492c.decodePoint(this.encoding.getOctets()).normalize();
        }
        return this.f27493p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte[] octets = this.encoding.getOctets();
        if (octets == null || octets.length <= 0) {
            return false;
        }
        byte b2 = octets[0];
        return b2 == 2 || b2 == 3;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }
}

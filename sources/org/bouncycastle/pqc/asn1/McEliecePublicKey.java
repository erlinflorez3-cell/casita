package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McEliecePublicKey extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GF2Matrix f27729g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f27730n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f27731t;

    public McEliecePublicKey(int i2, int i3, GF2Matrix gF2Matrix) {
        this.f27730n = i2;
        this.f27731t = i3;
        this.f27729g = new GF2Matrix(gF2Matrix);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f27730n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue().intValue();
        this.f27731t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f27729g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f27729g);
    }

    public int getN() {
        return this.f27730n;
    }

    public int getT() {
        return this.f27731t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f27730n));
        aSN1EncodableVector.add(new ASN1Integer(this.f27731t));
        aSN1EncodableVector.add(new DEROctetString(this.f27729g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }
}

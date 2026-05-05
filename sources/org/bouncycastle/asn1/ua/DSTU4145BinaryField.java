package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes6.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27469m;

    public DSTU4145BinaryField(int i2, int i3) {
        this(i2, i3, 0, 0);
    }

    public DSTU4145BinaryField(int i2, int i3, int i4, int i5) {
        this.f27469m = i2;
        this.f27467k = i3;
        this.f27466j = i4;
        this.f27468l = i5;
    }

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f27469m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f27467k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue().intValue();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("object parse error");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.f27467k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getPositiveValue().intValue();
            this.f27466j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).getPositiveValue().intValue();
            this.f27468l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getPositiveValue().intValue();
        }
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f27467k;
    }

    public int getK2() {
        return this.f27466j;
    }

    public int getK3() {
        return this.f27468l;
    }

    public int getM() {
        return this.f27469m;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f27469m));
        if (this.f27466j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f27467k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(this.f27467k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f27466j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f27468l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

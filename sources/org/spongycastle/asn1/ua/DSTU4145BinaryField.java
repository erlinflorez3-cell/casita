package org.spongycastle.asn1.ua;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27818m;

    public DSTU4145BinaryField(int i2, int i3) {
        this(i2, i3, 0, 0);
    }

    public DSTU4145BinaryField(int i2, int i3, int i4, int i5) {
        this.f27818m = i2;
        this.f27816k = i3;
        this.f27815j = i4;
        this.f27817l = i5;
    }

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f27818m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f27816k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue().intValue();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("object parse error");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.f27816k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getPositiveValue().intValue();
            this.f27815j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).getPositiveValue().intValue();
            this.f27817l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getPositiveValue().intValue();
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
        return this.f27816k;
    }

    public int getK2() {
        return this.f27815j;
    }

    public int getK3() {
        return this.f27817l;
    }

    public int getM() {
        return this.f27818m;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f27818m));
        if (this.f27815j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f27816k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(this.f27816k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f27815j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f27817l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

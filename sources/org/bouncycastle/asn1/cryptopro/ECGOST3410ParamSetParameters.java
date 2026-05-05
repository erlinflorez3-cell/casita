package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes6.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f27451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f27452b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f27453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f27454q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f27455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f27456y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i2, BigInteger bigInteger5) {
        this.f27451a = new ASN1Integer(bigInteger);
        this.f27452b = new ASN1Integer(bigInteger2);
        this.f27453p = new ASN1Integer(bigInteger3);
        this.f27454q = new ASN1Integer(bigInteger4);
        this.f27455x = new ASN1Integer(i2);
        this.f27456y = new ASN1Integer(bigInteger5);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f27451a = (ASN1Integer) objects.nextElement();
        this.f27452b = (ASN1Integer) objects.nextElement();
        this.f27453p = (ASN1Integer) objects.nextElement();
        this.f27454q = (ASN1Integer) objects.nextElement();
        this.f27455x = (ASN1Integer) objects.nextElement();
        this.f27456y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public BigInteger getA() {
        return this.f27451a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f27453p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f27454q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f27451a);
        aSN1EncodableVector.add(this.f27452b);
        aSN1EncodableVector.add(this.f27453p);
        aSN1EncodableVector.add(this.f27454q);
        aSN1EncodableVector.add(this.f27455x);
        aSN1EncodableVector.add(this.f27456y);
        return new DERSequence(aSN1EncodableVector);
    }
}

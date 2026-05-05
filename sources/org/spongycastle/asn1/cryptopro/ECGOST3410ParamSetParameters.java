package org.spongycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f27800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f27801b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f27802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f27803q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f27804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f27805y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i2, BigInteger bigInteger5) {
        this.f27800a = new ASN1Integer(bigInteger);
        this.f27801b = new ASN1Integer(bigInteger2);
        this.f27802p = new ASN1Integer(bigInteger3);
        this.f27803q = new ASN1Integer(bigInteger4);
        this.f27804x = new ASN1Integer(i2);
        this.f27805y = new ASN1Integer(bigInteger5);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f27800a = (ASN1Integer) objects.nextElement();
        this.f27801b = (ASN1Integer) objects.nextElement();
        this.f27802p = (ASN1Integer) objects.nextElement();
        this.f27803q = (ASN1Integer) objects.nextElement();
        this.f27804x = (ASN1Integer) objects.nextElement();
        this.f27805y = (ASN1Integer) objects.nextElement();
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
        return this.f27800a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f27802p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f27803q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f27800a);
        aSN1EncodableVector.add(this.f27801b);
        aSN1EncodableVector.add(this.f27802p);
        aSN1EncodableVector.add(this.f27803q);
        aSN1EncodableVector.add(this.f27804x);
        aSN1EncodableVector.add(this.f27805y);
        return new DERSequence(aSN1EncodableVector);
    }
}

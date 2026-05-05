package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes6.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f27463g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ASN1Integer f27464l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f27465p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i2) {
        this.f27465p = new ASN1Integer(bigInteger);
        this.f27463g = new ASN1Integer(bigInteger2);
        this.f27464l = i2 != 0 ? new ASN1Integer(i2) : null;
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f27465p = ASN1Integer.getInstance(objects.nextElement());
        this.f27463g = ASN1Integer.getInstance(objects.nextElement());
        this.f27464l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f27463g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f27464l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f27465p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f27465p);
        aSN1EncodableVector.add(this.f27463g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f27464l);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

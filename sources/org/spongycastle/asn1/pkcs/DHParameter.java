package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f27812g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ASN1Integer f27813l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f27814p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i2) {
        this.f27814p = new ASN1Integer(bigInteger);
        this.f27812g = new ASN1Integer(bigInteger2);
        if (i2 != 0) {
            this.f27813l = new ASN1Integer(i2);
        } else {
            this.f27813l = null;
        }
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f27814p = ASN1Integer.getInstance(objects.nextElement());
        this.f27812g = ASN1Integer.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.f27813l = (ASN1Integer) objects.nextElement();
        } else {
            this.f27813l = null;
        }
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
        return this.f27812g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f27813l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f27814p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f27814p);
        aSN1EncodableVector.add(this.f27812g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f27813l);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

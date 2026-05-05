package org.bouncycastle.pqc.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ParSet extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f27732h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f27733k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27734t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f27735w;

    public ParSet(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f27734t = i2;
        this.f27732h = iArr;
        this.f27735w = iArr2;
        this.f27733k = iArr3;
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException("sie of seqOfParams = " + aSN1Sequence.size());
        }
        this.f27734t = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue());
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f27734t || aSN1Sequence3.size() != this.f27734t || aSN1Sequence4.size() != this.f27734t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f27732h = new int[aSN1Sequence2.size()];
        this.f27735w = new int[aSN1Sequence3.size()];
        this.f27733k = new int[aSN1Sequence4.size()];
        for (int i2 = 0; i2 < this.f27734t; i2++) {
            this.f27732h[i2] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence2.getObjectAt(i2)).getValue());
            this.f27735w[i2] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence3.getObjectAt(i2)).getValue());
            this.f27733k[i2] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence4.getObjectAt(i2)).getValue());
        }
    }

    private static int checkBigIntegerInIntRangeAndPositive(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger.compareTo(ZERO) <= 0) {
            throw new IllegalArgumentException("BigInteger not in Range: " + bigInteger.toString());
        }
        return bigInteger.intValue();
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f27732h);
    }

    public int[] getK() {
        return Arrays.clone(this.f27733k);
    }

    public int getT() {
        return this.f27734t;
    }

    public int[] getW() {
        return Arrays.clone(this.f27735w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i2 = 0; i2 < this.f27732h.length; i2++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f27732h[i2]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f27735w[i2]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f27733k[i2]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f27734t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }
}

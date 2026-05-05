package org.bouncycastle.math.ec.custom.sec;

import cz.msebera.android.httpclient.HttpStatus;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SecT409FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected long[] f27719x;

    public SecT409FieldElement() {
        this.f27719x = Nat448.create64();
    }

    public SecT409FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f27719x = SecT409Field.fromBigInteger(bigInteger);
    }

    protected SecT409FieldElement(long[] jArr) {
        this.f27719x = jArr;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.add(this.f27719x, ((SecT409FieldElement) eCFieldElement).f27719x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.addOne(this.f27719x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT409FieldElement) {
            return Nat448.eq64(this.f27719x, ((SecT409FieldElement) obj).f27719x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT409Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return HttpStatus.SC_CONFLICT;
    }

    public int getK1() {
        return 87;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return HttpStatus.SC_CONFLICT;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f27719x, 0, 7) ^ 4090087;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.invert(this.f27719x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat448.isOne64(this.f27719x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat448.isZero64(this.f27719x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.multiply(this.f27719x, ((SecT409FieldElement) eCFieldElement).f27719x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f27719x;
        long[] jArr2 = ((SecT409FieldElement) eCFieldElement).f27719x;
        long[] jArr3 = ((SecT409FieldElement) eCFieldElement2).f27719x;
        long[] jArr4 = ((SecT409FieldElement) eCFieldElement3).f27719x;
        long[] jArrCreate64 = Nat.create64(13);
        SecT409Field.multiplyAddToExt(jArr, jArr2, jArrCreate64);
        SecT409Field.multiplyAddToExt(jArr3, jArr4, jArrCreate64);
        long[] jArrCreate642 = Nat448.create64();
        SecT409Field.reduce(jArrCreate64, jArrCreate642);
        return new SecT409FieldElement(jArrCreate642);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.sqrt(this.f27719x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.square(this.f27719x, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f27719x;
        long[] jArr2 = ((SecT409FieldElement) eCFieldElement).f27719x;
        long[] jArr3 = ((SecT409FieldElement) eCFieldElement2).f27719x;
        long[] jArrCreate64 = Nat.create64(13);
        SecT409Field.squareAddToExt(jArr, jArrCreate64);
        SecT409Field.multiplyAddToExt(jArr2, jArr3, jArrCreate64);
        long[] jArrCreate642 = Nat448.create64();
        SecT409Field.reduce(jArrCreate64, jArrCreate642);
        return new SecT409FieldElement(jArrCreate642);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i2) {
        if (i2 < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat448.create64();
        SecT409Field.squareN(this.f27719x, i2, jArrCreate64);
        return new SecT409FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (-1) - (((-1) - this.f27719x[0]) | ((-1) - 1)) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat448.toBigInteger64(this.f27719x);
    }
}

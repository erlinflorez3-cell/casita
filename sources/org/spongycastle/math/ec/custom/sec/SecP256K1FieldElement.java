package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256K1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP256K1Curve.f28069q;

    /* JADX INFO: renamed from: x */
    protected int[] f28070x;

    public SecP256K1FieldElement() {
        this.f28070x = Nat256.create();
    }

    public SecP256K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f28070x = SecP256K1Field.fromBigInteger(bigInteger);
    }

    protected SecP256K1FieldElement(int[] iArr) {
        this.f28070x = iArr;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.add(this.f28070x, ((SecP256K1FieldElement) eCFieldElement).f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.addOne(this.f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256K1Field.P, ((SecP256K1FieldElement) eCFieldElement).f28070x, iArrCreate);
        SecP256K1Field.multiply(iArrCreate, this.f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256K1FieldElement) {
            return Nat256.eq(this.f28070x, ((SecP256K1FieldElement) obj).f28070x);
        }
        return false;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP256K1Field";
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f28070x, 0, 8);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256K1Field.P, this.f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f28070x);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f28070x);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.multiply(this.f28070x, ((SecP256K1FieldElement) eCFieldElement).f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.negate(this.f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f28070x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(iArr, iArrCreate);
        SecP256K1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        SecP256K1Field.square(iArrCreate, iArrCreate2);
        SecP256K1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate2, 3, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 3, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate3, 11, iArrCreate4);
        SecP256K1Field.multiply(iArrCreate4, iArrCreate3, iArrCreate4);
        SecP256K1Field.squareN(iArrCreate4, 22, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        int[] iArrCreate5 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate3, 44, iArrCreate5);
        SecP256K1Field.multiply(iArrCreate5, iArrCreate3, iArrCreate5);
        int[] iArrCreate6 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate5, 88, iArrCreate6);
        SecP256K1Field.multiply(iArrCreate6, iArrCreate5, iArrCreate6);
        SecP256K1Field.squareN(iArrCreate6, 44, iArrCreate5);
        SecP256K1Field.multiply(iArrCreate5, iArrCreate3, iArrCreate5);
        SecP256K1Field.squareN(iArrCreate5, 3, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 23, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 6, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP256K1Field.square(iArrCreate3, iArrCreate);
        if (Nat256.eq(iArr, iArrCreate)) {
            return new SecP256K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(this.f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.subtract(this.f28070x, ((SecP256K1FieldElement) eCFieldElement).f28070x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f28070x, 0) == 1;
    }

    @Override // org.spongycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f28070x);
    }
}

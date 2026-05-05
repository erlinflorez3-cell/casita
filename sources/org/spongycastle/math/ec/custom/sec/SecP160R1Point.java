package org.spongycastle.math.ec.custom.sec;

import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat160;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160R1Point extends ECPoint.AbstractFp {
    public SecP160R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecP160R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = z2;
    }

    SecP160R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z2) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z2;
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP160R1FieldElement secP160R1FieldElement = (SecP160R1FieldElement) this.f28048x;
        SecP160R1FieldElement secP160R1FieldElement2 = (SecP160R1FieldElement) this.f28049y;
        SecP160R1FieldElement secP160R1FieldElement3 = (SecP160R1FieldElement) eCPoint.getXCoord();
        SecP160R1FieldElement secP160R1FieldElement4 = (SecP160R1FieldElement) eCPoint.getYCoord();
        SecP160R1FieldElement secP160R1FieldElement5 = (SecP160R1FieldElement) this.zs[0];
        SecP160R1FieldElement secP160R1FieldElement6 = (SecP160R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat160.createExt();
        int[] iArrCreate = Nat160.create();
        int[] iArrCreate2 = Nat160.create();
        int[] iArrCreate3 = Nat160.create();
        boolean zIsOne = secP160R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP160R1FieldElement3.f28058x;
            iArr2 = secP160R1FieldElement4.f28058x;
        } else {
            SecP160R1Field.square(secP160R1FieldElement5.f28058x, iArrCreate2);
            SecP160R1Field.multiply(iArrCreate2, secP160R1FieldElement3.f28058x, iArrCreate);
            SecP160R1Field.multiply(iArrCreate2, secP160R1FieldElement5.f28058x, iArrCreate2);
            SecP160R1Field.multiply(iArrCreate2, secP160R1FieldElement4.f28058x, iArrCreate2);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP160R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP160R1FieldElement.f28058x;
            iArr4 = secP160R1FieldElement2.f28058x;
        } else {
            SecP160R1Field.square(secP160R1FieldElement6.f28058x, iArrCreate3);
            SecP160R1Field.multiply(iArrCreate3, secP160R1FieldElement.f28058x, iArrCreateExt);
            SecP160R1Field.multiply(iArrCreate3, secP160R1FieldElement6.f28058x, iArrCreate3);
            SecP160R1Field.multiply(iArrCreate3, secP160R1FieldElement2.f28058x, iArrCreate3);
            iArr3 = iArrCreateExt;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat160.create();
        SecP160R1Field.subtract(iArr3, iArr, iArrCreate4);
        SecP160R1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat160.isZero(iArrCreate4)) {
            return Nat160.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP160R1Field.square(iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat160.create();
        SecP160R1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5);
        SecP160R1Field.multiply(iArrCreate2, iArr3, iArrCreate2);
        SecP160R1Field.negate(iArrCreate5, iArrCreate5);
        Nat160.mul(iArr4, iArrCreate5, iArrCreateExt);
        SecP160R1Field.reduce32(Nat160.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP160R1FieldElement secP160R1FieldElement7 = new SecP160R1FieldElement(iArrCreate3);
        SecP160R1Field.square(iArrCreate, secP160R1FieldElement7.f28058x);
        SecP160R1Field.subtract(secP160R1FieldElement7.f28058x, iArrCreate5, secP160R1FieldElement7.f28058x);
        SecP160R1FieldElement secP160R1FieldElement8 = new SecP160R1FieldElement(iArrCreate5);
        SecP160R1Field.subtract(iArrCreate2, secP160R1FieldElement7.f28058x, secP160R1FieldElement8.f28058x);
        SecP160R1Field.multiplyAddToExt(secP160R1FieldElement8.f28058x, iArrCreate, iArrCreateExt);
        SecP160R1Field.reduce(iArrCreateExt, secP160R1FieldElement8.f28058x);
        SecP160R1FieldElement secP160R1FieldElement9 = new SecP160R1FieldElement(iArrCreate4);
        if (!zIsOne) {
            SecP160R1Field.multiply(secP160R1FieldElement9.f28058x, secP160R1FieldElement5.f28058x, secP160R1FieldElement9.f28058x);
        }
        if (!zIsOne2) {
            SecP160R1Field.multiply(secP160R1FieldElement9.f28058x, secP160R1FieldElement6.f28058x, secP160R1FieldElement9.f28058x);
        }
        return new SecP160R1Point(curve, secP160R1FieldElement7, secP160R1FieldElement8, new ECFieldElement[]{secP160R1FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    protected ECPoint detach() {
        return new SecP160R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP160R1Point(this.curve, this.f28048x, this.f28049y.negate(), this.zs, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f28049y.isZero()) ? this : twice().add(this);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP160R1FieldElement secP160R1FieldElement = (SecP160R1FieldElement) this.f28049y;
        if (secP160R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP160R1FieldElement secP160R1FieldElement2 = (SecP160R1FieldElement) this.f28048x;
        SecP160R1FieldElement secP160R1FieldElement3 = (SecP160R1FieldElement) this.zs[0];
        int[] iArrCreate = Nat160.create();
        int[] iArrCreate2 = Nat160.create();
        int[] iArrCreate3 = Nat160.create();
        SecP160R1Field.square(secP160R1FieldElement.f28058x, iArrCreate3);
        int[] iArrCreate4 = Nat160.create();
        SecP160R1Field.square(iArrCreate3, iArrCreate4);
        boolean zIsOne = secP160R1FieldElement3.isOne();
        int[] iArr = secP160R1FieldElement3.f28058x;
        if (!zIsOne) {
            SecP160R1Field.square(secP160R1FieldElement3.f28058x, iArrCreate2);
            iArr = iArrCreate2;
        }
        SecP160R1Field.subtract(secP160R1FieldElement2.f28058x, iArr, iArrCreate);
        SecP160R1Field.add(secP160R1FieldElement2.f28058x, iArr, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.reduce32(Nat160.addBothTo(iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SecP160R1Field.multiply(iArrCreate3, secP160R1FieldElement2.f28058x, iArrCreate3);
        SecP160R1Field.reduce32(Nat.shiftUpBits(5, iArrCreate3, 2, 0), iArrCreate3);
        SecP160R1Field.reduce32(Nat.shiftUpBits(5, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SecP160R1FieldElement secP160R1FieldElement4 = new SecP160R1FieldElement(iArrCreate4);
        SecP160R1Field.square(iArrCreate2, secP160R1FieldElement4.f28058x);
        SecP160R1Field.subtract(secP160R1FieldElement4.f28058x, iArrCreate3, secP160R1FieldElement4.f28058x);
        SecP160R1Field.subtract(secP160R1FieldElement4.f28058x, iArrCreate3, secP160R1FieldElement4.f28058x);
        SecP160R1FieldElement secP160R1FieldElement5 = new SecP160R1FieldElement(iArrCreate3);
        SecP160R1Field.subtract(iArrCreate3, secP160R1FieldElement4.f28058x, secP160R1FieldElement5.f28058x);
        SecP160R1Field.multiply(secP160R1FieldElement5.f28058x, iArrCreate2, secP160R1FieldElement5.f28058x);
        SecP160R1Field.subtract(secP160R1FieldElement5.f28058x, iArrCreate, secP160R1FieldElement5.f28058x);
        SecP160R1FieldElement secP160R1FieldElement6 = new SecP160R1FieldElement(iArrCreate2);
        SecP160R1Field.twice(secP160R1FieldElement.f28058x, secP160R1FieldElement6.f28058x);
        if (!zIsOne) {
            SecP160R1Field.multiply(secP160R1FieldElement6.f28058x, secP160R1FieldElement3.f28058x, secP160R1FieldElement6.f28058x);
        }
        return new SecP160R1Point(curve, secP160R1FieldElement4, secP160R1FieldElement5, new ECFieldElement[]{secP160R1FieldElement6}, this.withCompression);
    }

    @Override // org.spongycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f28049y.isZero() ? eCPoint : twice().add(eCPoint);
    }
}

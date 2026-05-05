package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163K1Point extends ECPoint.AbstractF2m {
    public SecT163K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecT163K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.withCompression = z2;
    }

    SecT163K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z2) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z2;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        ECFieldElement eCFieldElementMultiply;
        ECFieldElement eCFieldElementMultiply2;
        ECFieldElement eCFieldElementMultiply3;
        ECFieldElement eCFieldElementMultiply4;
        ECFieldElement eCFieldElementMultiply5;
        ECFieldElement eCFieldElementSquarePlusProduct;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElementMultiply6 = this.f27683x;
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        if (eCFieldElementMultiply6.isZero()) {
            return rawXCoord.isZero() ? curve.getInfinity() : eCPoint.add(this);
        }
        ECFieldElement eCFieldElement = this.f27684y;
        ECFieldElement eCFieldElement2 = this.zs[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        boolean zIsOne = eCFieldElement2.isOne();
        if (zIsOne) {
            eCFieldElementMultiply = rawXCoord;
            eCFieldElementMultiply2 = rawYCoord;
        } else {
            eCFieldElementMultiply = rawXCoord.multiply(eCFieldElement2);
            eCFieldElementMultiply2 = rawYCoord.multiply(eCFieldElement2);
        }
        boolean zIsOne2 = zCoord.isOne();
        if (zIsOne2) {
            eCFieldElementMultiply3 = eCFieldElement;
        } else {
            eCFieldElementMultiply6 = eCFieldElementMultiply6.multiply(zCoord);
            eCFieldElementMultiply3 = eCFieldElement.multiply(zCoord);
        }
        ECFieldElement eCFieldElementAdd = eCFieldElementMultiply3.add(eCFieldElementMultiply2);
        ECFieldElement eCFieldElementAdd2 = eCFieldElementMultiply6.add(eCFieldElementMultiply);
        if (eCFieldElementAdd2.isZero()) {
            return eCFieldElementAdd.isZero() ? twice() : curve.getInfinity();
        }
        if (rawXCoord.isZero()) {
            ECPoint eCPointNormalize = normalize();
            ECFieldElement xCoord = eCPointNormalize.getXCoord();
            ECFieldElement yCoord = eCPointNormalize.getYCoord();
            ECFieldElement eCFieldElementDivide = yCoord.add(rawYCoord).divide(xCoord);
            eCFieldElementMultiply4 = eCFieldElementDivide.square().add(eCFieldElementDivide).add(xCoord).addOne();
            if (eCFieldElementMultiply4.isZero()) {
                return new SecT163K1Point(curve, eCFieldElementMultiply4, curve.getB(), this.withCompression);
            }
            eCFieldElementSquarePlusProduct = eCFieldElementDivide.multiply(xCoord.add(eCFieldElementMultiply4)).add(eCFieldElementMultiply4).add(yCoord).divide(eCFieldElementMultiply4).add(eCFieldElementMultiply4);
            eCFieldElementMultiply5 = curve.fromBigInteger(ECConstants.ONE);
        } else {
            ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
            ECFieldElement eCFieldElementMultiply7 = eCFieldElementAdd.multiply(eCFieldElementMultiply6);
            ECFieldElement eCFieldElementMultiply8 = eCFieldElementAdd.multiply(eCFieldElementMultiply);
            eCFieldElementMultiply4 = eCFieldElementMultiply7.multiply(eCFieldElementMultiply8);
            if (eCFieldElementMultiply4.isZero()) {
                return new SecT163K1Point(curve, eCFieldElementMultiply4, curve.getB(), this.withCompression);
            }
            eCFieldElementMultiply5 = eCFieldElementAdd.multiply(eCFieldElementSquare);
            if (!zIsOne2) {
                eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(zCoord);
            }
            eCFieldElementSquarePlusProduct = eCFieldElementMultiply8.add(eCFieldElementSquare).squarePlusProduct(eCFieldElementMultiply5, eCFieldElement.add(eCFieldElement2));
            if (!zIsOne) {
                eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(eCFieldElement2);
            }
        }
        return new SecT163K1Point(curve, eCFieldElementMultiply4, eCFieldElementSquarePlusProduct, new ECFieldElement[]{eCFieldElementMultiply5}, this.withCompression);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    protected ECPoint detach() {
        return new SecT163K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    protected boolean getCompressionYTilde() {
        ECFieldElement rawXCoord = getRawXCoord();
        return (rawXCoord.isZero() || getRawYCoord().testBitZero() == rawXCoord.testBitZero()) ? false : true;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECFieldElement getYCoord() {
        ECFieldElement eCFieldElement = this.f27683x;
        ECFieldElement eCFieldElement2 = this.f27684y;
        if (isInfinity() || eCFieldElement.isZero()) {
            return eCFieldElement2;
        }
        ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
        ECFieldElement eCFieldElement3 = this.zs[0];
        return !eCFieldElement3.isOne() ? eCFieldElementMultiply.divide(eCFieldElement3) : eCFieldElementMultiply;
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        if (isInfinity()) {
            return this;
        }
        ECFieldElement eCFieldElement = this.f27683x;
        if (eCFieldElement.isZero()) {
            return this;
        }
        ECFieldElement eCFieldElement2 = this.f27684y;
        ECFieldElement eCFieldElement3 = this.zs[0];
        return new SecT163K1Point(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.withCompression);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElement = this.f27683x;
        if (eCFieldElement.isZero()) {
            return curve.getInfinity();
        }
        ECFieldElement eCFieldElement2 = this.f27684y;
        ECFieldElement eCFieldElementSquare = this.zs[0];
        boolean zIsOne = eCFieldElementSquare.isOne();
        ECFieldElement eCFieldElementMultiply = zIsOne ? eCFieldElement2 : eCFieldElement2.multiply(eCFieldElementSquare);
        if (!zIsOne) {
            eCFieldElementSquare = eCFieldElementSquare.square();
        }
        ECFieldElement eCFieldElementAdd = eCFieldElement2.square().add(eCFieldElementMultiply).add(eCFieldElementSquare);
        if (eCFieldElementAdd.isZero()) {
            return new SecT163K1Point(curve, eCFieldElementAdd, curve.getB(), this.withCompression);
        }
        ECFieldElement eCFieldElementSquare2 = eCFieldElementAdd.square();
        ECFieldElement eCFieldElementMultiply2 = zIsOne ? eCFieldElementAdd : eCFieldElementAdd.multiply(eCFieldElementSquare);
        ECFieldElement eCFieldElementSquare3 = eCFieldElement2.add(eCFieldElement).square();
        return new SecT163K1Point(curve, eCFieldElementSquare2, eCFieldElementSquare3.add(eCFieldElementAdd).add(eCFieldElementSquare).multiply(eCFieldElementSquare3).add(eCFieldElementSquare2), new ECFieldElement[]{eCFieldElementMultiply2}, this.withCompression);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElement = this.f27683x;
        if (eCFieldElement.isZero()) {
            return eCPoint;
        }
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        if (rawXCoord.isZero() || !zCoord.isOne()) {
            return twice().add(eCPoint);
        }
        ECFieldElement eCFieldElement2 = this.f27684y;
        ECFieldElement eCFieldElement3 = this.zs[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement eCFieldElementSquare = eCFieldElement.square();
        ECFieldElement eCFieldElementSquare2 = eCFieldElement2.square();
        ECFieldElement eCFieldElementSquare3 = eCFieldElement3.square();
        ECFieldElement eCFieldElementAdd = eCFieldElementSquare3.add(eCFieldElementSquare2).add(eCFieldElement2.multiply(eCFieldElement3));
        ECFieldElement eCFieldElementAddOne = rawYCoord.addOne();
        ECFieldElement eCFieldElementMultiplyPlusProduct = rawYCoord.multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).multiplyPlusProduct(eCFieldElementAdd, eCFieldElementSquare, eCFieldElementSquare3);
        ECFieldElement eCFieldElementMultiply = rawXCoord.multiply(eCFieldElementSquare3);
        ECFieldElement eCFieldElementSquare4 = eCFieldElementMultiply.add(eCFieldElementAdd).square();
        if (eCFieldElementSquare4.isZero()) {
            return eCFieldElementMultiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
        }
        if (eCFieldElementMultiplyPlusProduct.isZero()) {
            return new SecT163K1Point(curve, eCFieldElementMultiplyPlusProduct, curve.getB(), this.withCompression);
        }
        ECFieldElement eCFieldElementMultiply2 = eCFieldElementMultiplyPlusProduct.square().multiply(eCFieldElementMultiply);
        ECFieldElement eCFieldElementMultiply3 = eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare4).multiply(eCFieldElementSquare3);
        return new SecT163K1Point(curve, eCFieldElementMultiply2, eCFieldElementMultiplyPlusProduct.add(eCFieldElementSquare4).square().multiplyPlusProduct(eCFieldElementAdd, eCFieldElementAddOne, eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.withCompression);
    }
}

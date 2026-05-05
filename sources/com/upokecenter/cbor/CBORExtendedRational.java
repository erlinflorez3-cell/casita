package com.upokecenter.cbor;

import com.upokecenter.numbers.EContext;
import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
class CBORExtendedRational implements ICBORNumber {
    CBORExtendedRational() {
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Abs(Object obj) {
        return ((ERational) obj).Abs();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public double AsDouble(Object obj) {
        return ((ERational) obj).ToDouble();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EDecimal AsEDecimal(Object obj) {
        return ((ERational) obj).ToEDecimalExactIfPossible(EContext.Decimal128.WithUnlimitedExponents());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EFloat AsEFloat(Object obj) {
        return ((ERational) obj).ToEFloatExactIfPossible(EContext.Binary128.WithUnlimitedExponents());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EInteger AsEInteger(Object obj) {
        return ((ERational) obj).ToEInteger();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public ERational AsERational(Object obj) {
        return (ERational) obj;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int AsInt32(Object obj, int i2, int i3) {
        int iToInt32Checked;
        ERational eRational = (ERational) obj;
        if (eRational.isFinite()) {
            EInteger eIntegerToEInteger = eRational.ToEInteger();
            if (eIntegerToEInteger.CanFitInInt32() && (iToInt32Checked = eIntegerToEInteger.ToInt32Checked()) >= i2 && iToInt32Checked <= i3) {
                return iToInt32Checked;
            }
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public long AsInt64(Object obj) {
        ERational eRational = (ERational) obj;
        if (eRational.isFinite()) {
            EInteger eIntegerToEInteger = eRational.ToEInteger();
            if (eIntegerToEInteger.CanFitInInt64()) {
                return eIntegerToEInteger.ToInt64Checked();
            }
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public float AsSingle(Object obj) {
        return ((ERational) obj).ToSingle();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInDouble(Object obj) {
        ERational eRational = (ERational) obj;
        return !eRational.isFinite() || eRational.compareTo(ERational.FromDouble(eRational.ToDouble())) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInInt32(Object obj) {
        return IsIntegral(obj) && CanTruncatedIntFitInInt32(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInInt64(Object obj) {
        return IsIntegral(obj) && CanTruncatedIntFitInInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInSingle(Object obj) {
        ERational eRational = (ERational) obj;
        return !eRational.isFinite() || eRational.compareTo(ERational.FromSingle(eRational.ToSingle())) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInUInt64(Object obj) {
        return IsIntegral(obj) && CanTruncatedIntFitInUInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt32(Object obj) {
        ERational eRational = (ERational) obj;
        if (eRational.isFinite()) {
            return eRational.ToEInteger().CanFitInInt32();
        }
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt64(Object obj) {
        ERational eRational = (ERational) obj;
        if (eRational.isFinite()) {
            return eRational.ToEInteger().CanFitInInt64();
        }
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInUInt64(Object obj) {
        ERational eRational = (ERational) obj;
        if (!eRational.isFinite()) {
            return false;
        }
        EInteger eIntegerToEInteger = eRational.ToEInteger();
        return eIntegerToEInteger.signum() >= 0 && eIntegerToEInteger.GetUnsignedBitLengthAsInt64() <= 64;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsInfinity(Object obj) {
        return ((ERational) obj).IsInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsIntegral(Object obj) {
        ERational eRational = (ERational) obj;
        if (!eRational.isFinite()) {
            return false;
        }
        if (eRational.getDenominator().equals(EInteger.FromInt32(1))) {
            return true;
        }
        return eRational.getNumerator().Remainder(eRational.getDenominator()).isZero();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNaN(Object obj) {
        return ((ERational) obj).IsNaN();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegative(Object obj) {
        return ((ERational) obj).isNegative();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegativeInfinity(Object obj) {
        return ((ERational) obj).IsNegativeInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNumberZero(Object obj) {
        return ((ERational) obj).isZero();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsPositiveInfinity(Object obj) {
        return ((ERational) obj).IsPositiveInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Negate(Object obj) {
        return ((ERational) obj).Negate();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int Sign(Object obj) {
        return ((ERational) obj).signum();
    }
}

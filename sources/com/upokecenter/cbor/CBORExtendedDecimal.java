package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
class CBORExtendedDecimal implements ICBORNumber {
    CBORExtendedDecimal() {
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Abs(Object obj) {
        return ((EDecimal) obj).Abs();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public double AsDouble(Object obj) {
        return ((EDecimal) obj).ToDouble();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EDecimal AsEDecimal(Object obj) {
        return (EDecimal) obj;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EFloat AsEFloat(Object obj) {
        return ((EDecimal) obj).ToEFloat();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EInteger AsEInteger(Object obj) {
        return ((EDecimal) obj).ToEInteger();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public ERational AsERational(Object obj) {
        return ERational.FromEDecimal((EDecimal) obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int AsInt32(Object obj, int i2, int i3) {
        int iToInt32Checked;
        EDecimal eDecimal = (EDecimal) obj;
        if (!CanTruncatedIntFitInInt32(obj) || (iToInt32Checked = eDecimal.ToEInteger().ToInt32Checked()) < i2 || iToInt32Checked > i3) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return iToInt32Checked;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public long AsInt64(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        if (CanTruncatedIntFitInInt64(obj)) {
            return eDecimal.ToEInteger().ToInt64Checked();
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public float AsSingle(Object obj) {
        return ((EDecimal) obj).ToSingle();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInDouble(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        return !eDecimal.isFinite() || eDecimal.compareTo(EDecimal.FromDouble(eDecimal.ToDouble())) == 0;
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
        EDecimal eDecimal = (EDecimal) obj;
        return !eDecimal.isFinite() || eDecimal.compareTo(EDecimal.FromSingle(eDecimal.ToSingle())) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInUInt64(Object obj) {
        return IsIntegral(obj) && CanTruncatedIntFitInUInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt32(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        if (!eDecimal.isFinite()) {
            return false;
        }
        if (eDecimal.isZero()) {
            return true;
        }
        if (eDecimal.getExponent().compareTo(EInteger.FromInt64(11L)) >= 0) {
            return false;
        }
        return eDecimal.ToEInteger().CanFitInInt32();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt64(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        if (!eDecimal.isFinite()) {
            return false;
        }
        if (eDecimal.isZero()) {
            return true;
        }
        if (eDecimal.getExponent().compareTo(EInteger.FromInt64(21L)) >= 0) {
            return false;
        }
        return eDecimal.ToEInteger().CanFitInInt64();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInUInt64(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        if (!eDecimal.isFinite()) {
            return false;
        }
        if (eDecimal.isZero()) {
            return true;
        }
        if (eDecimal.getExponent().compareTo(EInteger.FromInt64(21L)) >= 0) {
            return false;
        }
        EInteger eIntegerToEInteger = eDecimal.ToEInteger();
        return eIntegerToEInteger.signum() >= 0 && eIntegerToEInteger.GetUnsignedBitLengthAsInt64() <= 64;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsInfinity(Object obj) {
        return ((EDecimal) obj).IsInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsIntegral(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        return eDecimal.isFinite() && (eDecimal.getExponent().signum() >= 0 || eDecimal.compareTo(EDecimal.FromEInteger(eDecimal.ToEInteger())) == 0);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNaN(Object obj) {
        return ((EDecimal) obj).IsNaN();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegative(Object obj) {
        return ((EDecimal) obj).isNegative();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegativeInfinity(Object obj) {
        return ((EDecimal) obj).IsNegativeInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNumberZero(Object obj) {
        return ((EDecimal) obj).isZero();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsPositiveInfinity(Object obj) {
        return ((EDecimal) obj).IsPositiveInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Negate(Object obj) {
        return ((EDecimal) obj).Negate();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int Sign(Object obj) {
        EDecimal eDecimal = (EDecimal) obj;
        if (eDecimal.IsNaN()) {
            return 2;
        }
        return eDecimal.signum();
    }
}

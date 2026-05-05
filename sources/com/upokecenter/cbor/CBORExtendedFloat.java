package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
class CBORExtendedFloat implements ICBORNumber {
    CBORExtendedFloat() {
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Abs(Object obj) {
        return ((EFloat) obj).Abs();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public double AsDouble(Object obj) {
        return ((EFloat) obj).ToDouble();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EDecimal AsEDecimal(Object obj) {
        return ((EFloat) obj).ToEDecimal();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EFloat AsEFloat(Object obj) {
        return (EFloat) obj;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EInteger AsEInteger(Object obj) {
        return ((EFloat) obj).ToEInteger();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public ERational AsERational(Object obj) {
        return ERational.FromEFloat((EFloat) obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int AsInt32(Object obj, int i2, int i3) {
        int iToInt32Checked;
        EFloat eFloat = (EFloat) obj;
        if (!CanTruncatedIntFitInInt32(obj) || (iToInt32Checked = eFloat.ToEInteger().ToInt32Checked()) < i2 || iToInt32Checked > i3) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return iToInt32Checked;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public long AsInt64(Object obj) {
        EFloat eFloat = (EFloat) obj;
        if (CanTruncatedIntFitInInt64(obj)) {
            return eFloat.ToEInteger().ToInt64Checked();
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public float AsSingle(Object obj) {
        return ((EFloat) obj).ToSingle();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInDouble(Object obj) {
        EFloat eFloat = (EFloat) obj;
        return !eFloat.isFinite() || eFloat.compareTo(EFloat.FromDouble(eFloat.ToDouble())) == 0;
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
        EFloat eFloat = (EFloat) obj;
        return !eFloat.isFinite() || eFloat.compareTo(EFloat.FromSingle(eFloat.ToSingle())) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInUInt64(Object obj) {
        return IsIntegral(obj) && CanTruncatedIntFitInUInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt32(Object obj) {
        EFloat eFloat = (EFloat) obj;
        if (!eFloat.isFinite()) {
            return false;
        }
        if (eFloat.isZero()) {
            return true;
        }
        if (eFloat.getExponent().compareTo(EInteger.FromInt64(33L)) >= 0) {
            return false;
        }
        return eFloat.ToEInteger().CanFitInInt32();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt64(Object obj) {
        EFloat eFloat = (EFloat) obj;
        if (!eFloat.isFinite()) {
            return false;
        }
        if (eFloat.isZero()) {
            return true;
        }
        if (eFloat.getExponent().compareTo(EInteger.FromInt64(65L)) >= 0) {
            return false;
        }
        return eFloat.ToEInteger().CanFitInInt64();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInUInt64(Object obj) {
        EFloat eFloat = (EFloat) obj;
        if (!eFloat.isFinite()) {
            return false;
        }
        if (eFloat.isZero()) {
            return true;
        }
        if (eFloat.getExponent().compareTo(EInteger.FromInt64(65L)) >= 0) {
            return false;
        }
        EInteger eIntegerToEInteger = eFloat.ToEInteger();
        return eIntegerToEInteger.signum() >= 0 && eIntegerToEInteger.GetUnsignedBitLengthAsInt64() <= 64;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsInfinity(Object obj) {
        return ((EFloat) obj).IsInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsIntegral(Object obj) {
        EFloat eFloat = (EFloat) obj;
        if (eFloat.isFinite()) {
            return eFloat.getExponent().signum() >= 0 || EFloat.FromEInteger(eFloat.ToEInteger()).compareTo(eFloat) == 0;
        }
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNaN(Object obj) {
        return ((EFloat) obj).IsNaN();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegative(Object obj) {
        return ((EFloat) obj).isNegative();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegativeInfinity(Object obj) {
        return ((EFloat) obj).IsNegativeInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNumberZero(Object obj) {
        return ((EFloat) obj).isZero();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsPositiveInfinity(Object obj) {
        return ((EFloat) obj).IsPositiveInfinity();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Negate(Object obj) {
        return ((EFloat) obj).Negate();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int Sign(Object obj) {
        EFloat eFloat = (EFloat) obj;
        if (eFloat.IsNaN()) {
            return 2;
        }
        return eFloat.signum();
    }
}

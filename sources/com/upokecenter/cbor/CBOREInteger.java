package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
class CBOREInteger implements ICBORNumber {
    CBOREInteger() {
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Abs(Object obj) {
        return ((EInteger) obj).Abs();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public double AsDouble(Object obj) {
        return EFloat.FromEInteger((EInteger) obj).ToDouble();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EDecimal AsEDecimal(Object obj) {
        return EDecimal.FromEInteger((EInteger) obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EFloat AsEFloat(Object obj) {
        return EFloat.FromEInteger((EInteger) obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EInteger AsEInteger(Object obj) {
        return (EInteger) obj;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public ERational AsERational(Object obj) {
        return ERational.FromEInteger((EInteger) obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int AsInt32(Object obj, int i2, int i3) {
        int iToInt32Checked;
        EInteger eInteger = (EInteger) obj;
        if (!eInteger.CanFitInInt32() || (iToInt32Checked = eInteger.ToInt32Checked()) < i2 || iToInt32Checked > i3) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return iToInt32Checked;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public long AsInt64(Object obj) {
        EInteger eInteger = (EInteger) obj;
        if (eInteger.CanFitInInt64()) {
            return eInteger.ToInt64Checked();
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public float AsSingle(Object obj) {
        return EFloat.FromEInteger((EInteger) obj).ToSingle();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInDouble(Object obj) {
        EFloat eFloatFromEInteger = EFloat.FromEInteger((EInteger) obj);
        return eFloatFromEInteger.compareTo(EFloat.FromDouble(eFloatFromEInteger.ToDouble())) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInInt32(Object obj) {
        return ((EInteger) obj).CanFitInInt32();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInInt64(Object obj) {
        return ((EInteger) obj).CanFitInInt64();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInSingle(Object obj) {
        EFloat eFloatFromEInteger = EFloat.FromEInteger((EInteger) obj);
        return eFloatFromEInteger.compareTo(EFloat.FromSingle(eFloatFromEInteger.ToSingle())) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInUInt64(Object obj) {
        EInteger eInteger = (EInteger) obj;
        return eInteger.signum() >= 0 && eInteger.GetUnsignedBitLengthAsInt64() <= 64;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt32(Object obj) {
        return CanFitInInt32(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt64(Object obj) {
        return CanFitInInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInUInt64(Object obj) {
        return CanFitInUInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsInfinity(Object obj) {
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsIntegral(Object obj) {
        return true;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNaN(Object obj) {
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegative(Object obj) {
        return ((EInteger) obj).signum() < 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegativeInfinity(Object obj) {
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNumberZero(Object obj) {
        return ((EInteger) obj).isZero();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsPositiveInfinity(Object obj) {
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Negate(Object obj) {
        return ((EInteger) obj).Negate();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int Sign(Object obj) {
        return ((EInteger) obj).signum();
    }
}

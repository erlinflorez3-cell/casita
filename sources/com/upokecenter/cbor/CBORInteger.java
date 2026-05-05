package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
class CBORInteger implements ICBORNumber {
    CBORInteger() {
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Abs(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        return jLongValue == -2147483648L ? EInteger.FromInt32(1).ShiftLeft(63) : jLongValue < 0 ? Long.valueOf(-jLongValue) : obj;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public double AsDouble(Object obj) {
        return ((Long) obj).doubleValue();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EDecimal AsEDecimal(Object obj) {
        return EDecimal.FromInt64(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EFloat AsEFloat(Object obj) {
        return EFloat.FromInt64(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EInteger AsEInteger(Object obj) {
        return EInteger.FromInt64(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public ERational AsERational(Object obj) {
        return ERational.FromInt64(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int AsInt32(Object obj, int i2, int i3) {
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue < i2 || jLongValue > i3) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return (int) jLongValue;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public long AsInt64(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public float AsSingle(Object obj) {
        return ((Long) obj).floatValue();
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInDouble(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue == Long.MIN_VALUE) {
            return true;
        }
        if (jLongValue < 0) {
            jLongValue = -jLongValue;
        }
        while (jLongValue >= 9007199254740992L && (-1) - (((-1) - 1) | ((-1) - jLongValue)) == 0) {
            jLongValue >>= 1;
        }
        return jLongValue < 9007199254740992L;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInInt32(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        return jLongValue >= -2147483648L && jLongValue <= 2147483647L;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInInt64(Object obj) {
        return true;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInSingle(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue == Long.MIN_VALUE) {
            return true;
        }
        if (jLongValue < 0) {
            jLongValue = -jLongValue;
        }
        while (jLongValue >= 16777216 && (1 & jLongValue) == 0) {
            jLongValue >>= 1;
        }
        return jLongValue < 16777216;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInUInt64(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt32(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        return jLongValue >= -2147483648L && jLongValue <= 2147483647L;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt64(Object obj) {
        return true;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInUInt64(Object obj) {
        return ((Long) obj).longValue() >= 0;
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
        return ((Long) obj).longValue() < 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegativeInfinity(Object obj) {
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNumberZero(Object obj) {
        return ((Long) obj).longValue() == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsPositiveInfinity(Object obj) {
        return false;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Negate(Object obj) {
        Long l2 = (Long) obj;
        return l2.longValue() == Long.MIN_VALUE ? EInteger.FromInt32(1).ShiftLeft(63) : Long.valueOf(-l2.longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int Sign(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue == 0) {
            return 0;
        }
        return jLongValue < 0 ? -1 : 1;
    }
}

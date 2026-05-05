package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
class CBORDoubleBits implements ICBORNumber {
    CBORDoubleBits() {
    }

    private static long DoubleBitsRoundDown(long j2) {
        long j3 = (-1) - (((-1) - Long.MAX_VALUE) | ((-1) - j2));
        if (j3 == 0 || j3 >= 9218868437227405312L) {
            return j2;
        }
        long j4 = j3 >> 52;
        if (j4 >= 1075) {
            return j2;
        }
        if (j4 <= 1022) {
            return (j2 >> 63) != 0 ? Long.MIN_VALUE : 0L;
        }
        int i2 = 52 - (((int) j4) - 1023);
        long j5 = (((4503599627370495L + j2) - (4503599627370495L | j2)) >> i2) << i2;
        long j6 = j2 & (-4503599627370496L);
        return (j6 + j5) - (j6 & j5);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Abs(Object obj) {
        return Long.valueOf(((Long) obj).longValue() & Long.MAX_VALUE);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public double AsDouble(Object obj) {
        return CBORUtilities.Int64BitsToDouble(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EDecimal AsEDecimal(Object obj) {
        return EDecimal.FromDoubleBits(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EFloat AsEFloat(Object obj) {
        return EFloat.FromDoubleBits(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public EInteger AsEInteger(Object obj) {
        return CBORUtilities.EIntegerFromDoubleBits(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public ERational AsERational(Object obj) {
        return ERational.FromDoubleBits(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int AsInt32(Object obj, int i2, int i3) {
        if (IsNaN(obj) || IsInfinity(obj)) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long jDoubleBitsRoundDown = DoubleBitsRoundDown(((Long) obj).longValue());
        boolean z2 = (jDoubleBitsRoundDown >> 63) != 0;
        long j2 = (Long.MAX_VALUE + jDoubleBitsRoundDown) - (Long.MAX_VALUE | jDoubleBitsRoundDown);
        if (j2 == 0) {
            return 0;
        }
        if ((j2 >> 52) >= 1075) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long j3 = (((-1) - (((-1) - jDoubleBitsRoundDown) | ((-1) - 4503599627370495L))) | 4503599627370496L) >> (52 - (((int) r3) - 1023));
        if (z2) {
            j3 = -j3;
        }
        if (j3 < i2 || j3 > i3) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return (int) j3;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public long AsInt64(Object obj) {
        if (IsNaN(obj) || IsInfinity(obj)) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long jDoubleBitsRoundDown = DoubleBitsRoundDown(((Long) obj).longValue());
        boolean z2 = (jDoubleBitsRoundDown >> 63) != 0;
        long j2 = (-1) - (((-1) - Long.MAX_VALUE) | ((-1) - jDoubleBitsRoundDown));
        if (j2 == 0) {
            return 0L;
        }
        if (z2 && j2 == 4890909195324358656L) {
            return Long.MIN_VALUE;
        }
        if ((j2 >> 52) >= 1086) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long j3 = (-1) - (((-1) - ((-1) - (((-1) - jDoubleBitsRoundDown) | ((-1) - 4503599627370495L)))) & ((-1) - 4503599627370496L));
        int i2 = 52 - (((int) r3) - 1023);
        long j4 = i2 < 0 ? j3 << (-i2) : j3 >> i2;
        return z2 ? -j4 : j4;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public float AsSingle(Object obj) {
        return CBORUtilities.Int32BitsToSingle(CBORUtilities.DoubleToRoundedSinglePrecision(((Long) obj).longValue()));
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInDouble(Object obj) {
        return true;
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
        return IsNaN(obj) || CBORUtilities.DoubleRetainsSameValueInSingle(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanFitInUInt64(Object obj) {
        return IsIntegral(obj) && CanTruncatedIntFitInUInt64(obj);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt32(Object obj) {
        if (IsNaN(obj) || IsInfinity(obj)) {
            return false;
        }
        long jDoubleBitsRoundDown = DoubleBitsRoundDown(((Long) obj).longValue());
        long j2 = (-1) - (((-1) - jDoubleBitsRoundDown) | ((-1) - Long.MAX_VALUE));
        return ((((jDoubleBitsRoundDown >> 63) > 0L ? 1 : ((jDoubleBitsRoundDown >> 63) == 0L ? 0 : -1)) != 0) && j2 == 4746794007248502784L) || (j2 >> 52) < 1054;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInInt64(Object obj) {
        if (IsNaN(obj) || IsInfinity(obj)) {
            return false;
        }
        long jDoubleBitsRoundDown = DoubleBitsRoundDown(((Long) obj).longValue());
        boolean z2 = (jDoubleBitsRoundDown >> 63) != 0;
        long j2 = jDoubleBitsRoundDown & Long.MAX_VALUE;
        return (z2 && j2 == 4890909195324358656L) || (j2 >> 52) < 1086;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean CanTruncatedIntFitInUInt64(Object obj) {
        if (IsNaN(obj) || IsInfinity(obj)) {
            return false;
        }
        long jDoubleBitsRoundDown = DoubleBitsRoundDown(((Long) obj).longValue());
        boolean z2 = (jDoubleBitsRoundDown >> 63) != 0;
        long j2 = (-1) - (((-1) - jDoubleBitsRoundDown) | ((-1) - Long.MAX_VALUE));
        return (z2 && j2 == 0) || (!z2 && (j2 >> 52) < 1087);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsInfinity(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        return (jLongValue + Long.MAX_VALUE) - (jLongValue | Long.MAX_VALUE) == 9218868437227405312L;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsIntegral(Object obj) {
        return CBORUtilities.IsIntegerValue(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNaN(Object obj) {
        return CBORUtilities.DoubleBitsNaN(((Long) obj).longValue());
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegative(Object obj) {
        return (((Long) obj).longValue() >> 63) != 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNegativeInfinity(Object obj) {
        return ((Long) obj).longValue() == -4503599627370496L;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsNumberZero(Object obj) {
        return (((Long) obj).longValue() & Long.MAX_VALUE) == 0;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public boolean IsPositiveInfinity(Object obj) {
        return ((Long) obj).longValue() == 9218868437227405312L;
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public Object Negate(Object obj) {
        return Long.valueOf(((Long) obj).longValue() ^ Long.MIN_VALUE);
    }

    @Override // com.upokecenter.cbor.ICBORNumber
    public int Sign(Object obj) {
        if (IsNaN(obj)) {
            return -2;
        }
        return (((Long) obj).longValue() >> 63) != 0 ? -1 : 1;
    }
}

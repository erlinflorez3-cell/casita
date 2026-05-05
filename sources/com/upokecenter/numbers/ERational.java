package com.upokecenter.numbers;

import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class ERational implements Comparable<ERational> {
    public static final ERational NaN = new ERational(FastIntegerFixed.Zero, FastIntegerFixed.One, (byte) 4);
    public static final ERational NegativeInfinity = new ERational(FastIntegerFixed.Zero, FastIntegerFixed.One, (byte) 3);
    public static final ERational NegativeZero = new ERational(FastIntegerFixed.Zero, FastIntegerFixed.One, (byte) 1);
    public static final ERational One = FromEInteger(EInteger.FromInt32(1));
    public static final ERational PositiveInfinity = new ERational(FastIntegerFixed.Zero, FastIntegerFixed.One, (byte) 2);
    public static final ERational SignalingNaN = new ERational(FastIntegerFixed.Zero, FastIntegerFixed.One, (byte) 8);
    public static final ERational Ten = FromEInteger(EInteger.FromInt32(10));
    public static final ERational Zero = FromEInteger(EInteger.FromInt32(0));
    private final FastIntegerFixed denominator;
    private final byte flags;
    private final FastIntegerFixed unsignedNumerator;

    @Deprecated
    public ERational(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("numerator");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("denominator");
        }
        if (eInteger2.isZero()) {
            throw new IllegalArgumentException("denominator is zero");
        }
        boolean z2 = eInteger.signum() < 0;
        boolean z3 = eInteger2.signum() < 0;
        this.flags = (byte) (z2 == z3 ? 0 : 1);
        eInteger = z2 ? eInteger.Negate() : eInteger;
        eInteger2 = z3 ? eInteger2.Negate() : eInteger2;
        this.unsignedNumerator = FastIntegerFixed.FromBig(eInteger);
        this.denominator = FastIntegerFixed.FromBig(eInteger2);
    }

    private ERational(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, byte b2) {
        this.unsignedNumerator = fastIntegerFixed;
        this.denominator = fastIntegerFixed2;
        this.flags = b2;
    }

    private void CheckTrivialOverflow(int i2) {
        if (isZero()) {
            return;
        }
        if (!isFinite()) {
            throw new ArithmeticException("Value out of range");
        }
        if (getUnsignedNumerator().GetUnsignedBitLengthAsEInteger().compareTo(getDenominator().GetUnsignedBitLengthAsEInteger().Add(1).Add(i2)) > 0) {
            throw new ArithmeticException("Value out of range");
        }
    }

    public static ERational Create(int i2, int i3) {
        return Create(EInteger.FromInt32(i2), EInteger.FromInt32(i3));
    }

    public static ERational Create(long j2, long j3) {
        return Create(EInteger.FromInt64(j2), EInteger.FromInt64(j3));
    }

    public static ERational Create(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("numerator");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("denominator");
        }
        if (eInteger2.isZero()) {
            throw new IllegalArgumentException("denominator is zero");
        }
        boolean z2 = eInteger.signum() < 0;
        boolean z3 = eInteger2.signum() < 0;
        byte b2 = (byte) (z2 == z3 ? 0 : 1);
        if (z2) {
            eInteger = eInteger.Negate();
        }
        if (z3) {
            eInteger2 = eInteger2.Negate();
        }
        return new ERational(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.FromBig(eInteger2), b2);
    }

    public static ERational CreateNaN(EInteger eInteger) {
        return CreateNaN(eInteger, false, false);
    }

    public static ERational CreateNaN(EInteger eInteger, boolean z2, boolean z3) {
        if (eInteger == null) {
            throw new NullPointerException("diag");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("Diagnostic information must be 0 or greater,  was: " + eInteger);
        }
        if (!eInteger.isZero() || z3) {
            return new ERational(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.One, (byte) ((-1) - (((-1) - (z2 ? 8 : 4)) & ((-1) - (z3 ? 1 : 0)))));
        }
        return z2 ? SignalingNaN : NaN;
    }

    public static ERational FromBoolean(boolean z2) {
        return FromInt32(z2 ? 1 : 0);
    }

    public static ERational FromByte(byte b2) {
        return FromInt32(b2 & 255);
    }

    public static ERational FromDouble(double d2) {
        return FromEFloat(EFloat.FromDouble(d2));
    }

    public static ERational FromDoubleBits(long j2) {
        return FromEFloat(EFloat.FromDoubleBits(j2));
    }

    public static ERational FromEDecimal(EDecimal eDecimal) {
        if (eDecimal == null) {
            throw new NullPointerException("ef");
        }
        if (!eDecimal.isFinite()) {
            return eDecimal.IsInfinity() ? eDecimal.isNegative() ? NegativeInfinity : PositiveInfinity : CreateNaN(eDecimal.getUnsignedMantissa(), eDecimal.IsSignalingNaN(), eDecimal.isNegative());
        }
        EInteger mantissa = eDecimal.getMantissa();
        EInteger exponent = eDecimal.getExponent();
        if (exponent.isZero()) {
            return mantissa.signum() != 0 ? FromEInteger(mantissa) : eDecimal.isNegative() ? NegativeZero : Zero;
        }
        boolean z2 = mantissa.signum() < 0;
        EInteger eIntegerAbs = mantissa.Abs();
        EInteger eIntegerFromInt32 = EInteger.FromInt32(1);
        if (exponent.signum() < 0) {
            eIntegerFromInt32 = NumberUtility.FindPowerOfTenFromBig(exponent.Negate());
        } else {
            eIntegerAbs = eIntegerAbs.Multiply(NumberUtility.FindPowerOfTenFromBig(exponent));
        }
        if (z2) {
            eIntegerAbs = eIntegerAbs.Negate();
        }
        ERational eRationalCreate = Create(eIntegerAbs, eIntegerFromInt32);
        return (eDecimal.isNegative() && eIntegerAbs.signum() == 0) ? eRationalCreate.Negate() : eRationalCreate;
    }

    public static ERational FromEFloat(EFloat eFloat) {
        if (eFloat == null) {
            throw new NullPointerException("ef");
        }
        if (!eFloat.isFinite()) {
            return eFloat.IsInfinity() ? eFloat.isNegative() ? NegativeInfinity : PositiveInfinity : CreateNaN(eFloat.getUnsignedMantissa(), eFloat.IsSignalingNaN(), eFloat.isNegative());
        }
        EInteger mantissa = eFloat.getMantissa();
        EInteger exponent = eFloat.getExponent();
        if (exponent.isZero()) {
            return mantissa.signum() != 0 ? FromEInteger(mantissa) : eFloat.isNegative() ? NegativeZero : Zero;
        }
        boolean z2 = mantissa.signum() < 0;
        EInteger eIntegerAbs = mantissa.Abs();
        EInteger eIntegerFromInt32 = EInteger.FromInt32(1);
        if (exponent.signum() < 0) {
            eIntegerFromInt32 = eIntegerFromInt32.ShiftLeft(exponent.Negate());
        } else {
            eIntegerAbs = eIntegerAbs.ShiftLeft(exponent);
        }
        if (z2) {
            eIntegerAbs = eIntegerAbs.Negate();
        }
        ERational eRationalCreate = Create(eIntegerAbs, eIntegerFromInt32);
        return (eFloat.isNegative() && eIntegerAbs.signum() == 0) ? eRationalCreate.Negate() : eRationalCreate;
    }

    public static ERational FromEInteger(EInteger eInteger) {
        return Create(eInteger, EInteger.FromInt32(1));
    }

    @Deprecated
    public static ERational FromExtendedDecimal(EDecimal eDecimal) {
        return FromEDecimal(eDecimal);
    }

    @Deprecated
    public static ERational FromExtendedFloat(EFloat eFloat) {
        return FromEFloat(eFloat);
    }

    public static ERational FromInt16(short s2) {
        return FromInt32(s2);
    }

    public static ERational FromInt32(int i2) {
        return FromEInteger(EInteger.FromInt32(i2));
    }

    public static ERational FromInt64(long j2) {
        return FromEInteger(EInteger.FromInt64(j2));
    }

    public static ERational FromInt64AsUnsigned(long j2) {
        return j2 >= 0 ? FromInt64(j2) : FromEInteger(EInteger.FromInt64AsUnsigned(j2));
    }

    public static ERational FromSingle(float f2) {
        return FromEFloat(EFloat.FromSingle(f2));
    }

    public static ERational FromSingleBits(int i2) {
        return FromEFloat(EFloat.FromSingleBits(i2));
    }

    public static ERational FromString(String str) {
        return FromString(str, 0, str == null ? 0 : str.length());
    }

    public static ERational FromString(String str, int i2, int i3) {
        return ERationalTextString.FromString(str, i2, i3, true);
    }

    public static ERational FromString(byte[] bArr) {
        return FromString(bArr, 0, bArr == null ? 0 : bArr.length);
    }

    public static ERational FromString(byte[] bArr, int i2, int i3) {
        return ERationalByteArrayString.FromString(bArr, i2, i3, true);
    }

    public static ERational FromString(char[] cArr) {
        return FromString(cArr, 0, cArr == null ? 0 : cArr.length);
    }

    public static ERational FromString(char[] cArr, int i2, int i3) {
        return ERationalCharArrayString.FromString(cArr, i2, i3, true);
    }

    public static ERational Max(ERational eRational, ERational eRational2) {
        if (eRational == null) {
            throw new NullPointerException("first");
        }
        if (eRational2 == null) {
            throw new NullPointerException("second");
        }
        int iCompareToValue = eRational.CompareToValue(eRational2);
        return iCompareToValue == 0 ? eRational.isNegative() ? (eRational2.isNegative() && eRational.getDenominator().compareTo(eRational2.getDenominator()) > 0) ? eRational : eRational2 : (!eRational2.isNegative() && eRational.getDenominator().compareTo(eRational2.getDenominator()) >= 0) ? eRational2 : eRational : iCompareToValue > 0 ? eRational : eRational2;
    }

    public static ERational MaxMagnitude(ERational eRational, ERational eRational2) {
        if (eRational == null) {
            throw new NullPointerException("first");
        }
        if (eRational2 == null) {
            throw new NullPointerException("second");
        }
        int iCompareToValue = eRational.Abs().CompareToValue(eRational2.Abs());
        return iCompareToValue == 0 ? Max(eRational, eRational2) : iCompareToValue > 0 ? eRational : eRational2;
    }

    public static ERational Min(ERational eRational, ERational eRational2) {
        if (eRational == null) {
            throw new NullPointerException("first");
        }
        if (eRational2 == null) {
            throw new NullPointerException("second");
        }
        int iCompareToValue = eRational.CompareToValue(eRational2);
        return iCompareToValue == 0 ? eRational.isNegative() ? (eRational2.isNegative() && eRational.getDenominator().compareTo(eRational2.getDenominator()) >= 0) ? eRational2 : eRational : (!eRational2.isNegative() && eRational.getDenominator().compareTo(eRational2.getDenominator()) > 0) ? eRational : eRational2 : iCompareToValue < 0 ? eRational : eRational2;
    }

    public static ERational MinMagnitude(ERational eRational, ERational eRational2) {
        if (eRational == null) {
            throw new NullPointerException("first");
        }
        if (eRational2 == null) {
            throw new NullPointerException("second");
        }
        int iCompareToValue = eRational.Abs().CompareToValue(eRational2.Abs());
        return iCompareToValue == 0 ? Min(eRational, eRational2) : iCompareToValue < 0 ? eRational : eRational2;
    }

    public ERational Abs() {
        if (!isNegative()) {
            return this;
        }
        FastIntegerFixed fastIntegerFixed = this.unsignedNumerator;
        FastIntegerFixed fastIntegerFixed2 = this.denominator;
        byte b2 = this.flags;
        return new ERational(fastIntegerFixed, fastIntegerFixed2, (byte) ((b2 - 2) - (b2 | (-2))));
    }

    public ERational Add(int i2) {
        return Add(FromInt32(i2));
    }

    public ERational Add(long j2) {
        return Add(FromInt64(j2));
    }

    public ERational Add(ERational eRational) {
        if (eRational == null) {
            throw new NullPointerException("otherValue");
        }
        if (IsSignalingNaN()) {
            return CreateNaN(getUnsignedNumerator(), false, isNegative());
        }
        if (eRational.IsSignalingNaN()) {
            return CreateNaN(eRational.getUnsignedNumerator(), false, eRational.isNegative());
        }
        if (IsQuietNaN()) {
            return this;
        }
        if (eRational.IsQuietNaN()) {
            return eRational;
        }
        if (IsInfinity()) {
            return (!eRational.IsInfinity() || isNegative() == eRational.isNegative()) ? this : NaN;
        }
        if (eRational.IsInfinity()) {
            return eRational;
        }
        return Create(getNumerator().Multiply(eRational.getDenominator()).Add(getDenominator().Multiply(eRational.getNumerator())), getDenominator().Multiply(eRational.getDenominator()));
    }

    public int CompareToBinary(EFloat eFloat) {
        if (eFloat == null) {
            return 1;
        }
        if (IsNaN()) {
            return !eFloat.IsNaN() ? 1 : 0;
        }
        int iSignum = signum();
        int iSignum2 = eFloat.signum();
        if (iSignum != iSignum2) {
            return iSignum < iSignum2 ? -1 : 1;
        }
        if (iSignum2 == 0 || iSignum == 0) {
            return 0;
        }
        if (IsInfinity()) {
            if (eFloat.IsInfinity()) {
                return 0;
            }
            return isNegative() ? -1 : 1;
        }
        if (eFloat.IsInfinity()) {
            return eFloat.isNegative() ? 1 : -1;
        }
        EInteger exponent = eFloat.getExponent();
        if (exponent.isZero()) {
            return getNumerator().compareTo(getDenominator().Multiply(eFloat.getMantissa()));
        }
        if (exponent.Abs().compareTo(EInteger.FromInt64(1000L)) > 0) {
            EInteger[] eIntegerArrDivRem = getUnsignedNumerator().DivRem(getDenominator());
            EInteger eInteger = eIntegerArrDivRem[0];
            EInteger eInteger2 = eIntegerArrDivRem[1];
            EFloat eFloatAbs = eFloat.Abs();
            EFloat eFloatFromEInteger = EFloat.FromEInteger(eInteger);
            if (eInteger2.isZero()) {
                int iCompareTo2 = eFloatFromEInteger.compareTo(eFloatAbs);
                return isNegative() ? -iCompareTo2 : iCompareTo2;
            }
            if (eFloatFromEInteger.compareTo(eFloatAbs) > 0) {
                return isNegative() ? -1 : 1;
            }
            if (EFloat.FromEInteger(eInteger.Add(EInteger.FromInt32(1))).compareTo(eFloatAbs) < 0) {
                return isNegative() ? 1 : -1;
            }
            if (EFloat.FromEInteger(getUnsignedNumerator()).Divide(EFloat.FromEInteger(getDenominator()), EContext.ForPrecisionAndRounding(256, ERounding.Down)).compareTo(eFloatAbs) > 0) {
                return isNegative() ? -1 : 1;
            }
            if (eFloat.getExponent().signum() > 0 && getUnsignedNumerator().GetSignedBitLengthAsEInteger().Subtract(1).compareTo(eFloat.getExponent()) < 0) {
                return isNegative() ? 1 : -1;
            }
        }
        return CompareToValue(FromEFloat(eFloat));
    }

    public int CompareToDecimal(EDecimal eDecimal) {
        if (eDecimal == null) {
            return 1;
        }
        if (IsNaN()) {
            return !eDecimal.IsNaN() ? 1 : 0;
        }
        int iSignum = signum();
        int iSignum2 = eDecimal.signum();
        if (iSignum != iSignum2) {
            return iSignum < iSignum2 ? -1 : 1;
        }
        if (iSignum2 == 0 || iSignum == 0) {
            return 0;
        }
        if (IsInfinity()) {
            if (eDecimal.IsInfinity()) {
                return 0;
            }
            return isNegative() ? -1 : 1;
        }
        if (eDecimal.IsInfinity()) {
            return eDecimal.isNegative() ? 1 : -1;
        }
        if (eDecimal.getExponent().isZero()) {
            return getNumerator().compareTo(getDenominator().Multiply(eDecimal.getMantissa()));
        }
        if (eDecimal.getExponent().Abs().compareTo(EInteger.FromInt64(50L)) > 0) {
            EInteger[] eIntegerArrDivRem = getUnsignedNumerator().DivRem(getDenominator());
            EInteger eInteger = eIntegerArrDivRem[0];
            EInteger eInteger2 = eIntegerArrDivRem[1];
            EDecimal eDecimalAbs = eDecimal.Abs();
            EDecimal eDecimalFromEInteger = EDecimal.FromEInteger(eInteger);
            if (eInteger2.isZero()) {
                int iCompareTo2 = eDecimalFromEInteger.compareTo(eDecimalAbs);
                return isNegative() ? -iCompareTo2 : iCompareTo2;
            }
            if (eDecimalFromEInteger.compareTo(eDecimalAbs) > 0) {
                return isNegative() ? -1 : 1;
            }
            if (EDecimal.FromEInteger(eInteger.Add(EInteger.FromInt32(1))).compareTo(eDecimalAbs) < 0) {
                return isNegative() ? 1 : -1;
            }
            if (EDecimal.FromEInteger(getUnsignedNumerator()).Divide(EDecimal.FromEInteger(getDenominator()), EContext.ForPrecisionAndRounding(20, ERounding.Down)).compareTo(eDecimalAbs) > 0) {
                return isNegative() ? -1 : 1;
            }
            if (eDecimal.getExponent().signum() > 0 && getUnsignedNumerator().GetDigitCountAsEInteger().Subtract(1).compareTo(eDecimal.getExponent()) < 0) {
                return isNegative() ? 1 : -1;
            }
        }
        return CompareToValue(FromEDecimal(eDecimal));
    }

    public int CompareToTotal(ERational eRational) {
        if (eRational == null) {
            return 1;
        }
        boolean zIsNegative = isNegative();
        if (zIsNegative != eRational.isNegative()) {
            return zIsNegative ? -1 : 1;
        }
        char c2 = 3;
        char c3 = IsSignalingNaN() ? (char) 2 : IsNaN() ? (char) 3 : IsInfinity() ? (char) 1 : (char) 0;
        if (eRational.IsSignalingNaN()) {
            c2 = 2;
        } else if (!eRational.IsNaN()) {
            c2 = eRational.IsInfinity() ? (char) 1 : (char) 0;
        }
        if (c3 > c2) {
            return zIsNegative ? -1 : 1;
        }
        if (c3 < c2) {
            return zIsNegative ? 1 : -1;
        }
        if (c3 >= 2) {
            int iCompareTo = this.unsignedNumerator.compareTo(eRational.unsignedNumerator);
            return zIsNegative ? -iCompareTo : iCompareTo;
        }
        if (c3 == 1) {
            return 0;
        }
        int iCompareTo2 = compareTo(eRational);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = this.denominator.compareTo(eRational.denominator);
        return zIsNegative ? -iCompareTo3 : iCompareTo3;
    }

    public int CompareToTotalMagnitude(ERational eRational) {
        if (eRational == null) {
            return 1;
        }
        char c2 = 3;
        char c3 = IsSignalingNaN() ? (char) 2 : IsNaN() ? (char) 3 : IsInfinity() ? (char) 1 : (char) 0;
        if (eRational.IsSignalingNaN()) {
            c2 = 2;
        } else if (!eRational.IsNaN()) {
            c2 = eRational.IsInfinity() ? (char) 1 : (char) 0;
        }
        if (c3 > c2) {
            return 1;
        }
        if (c3 < c2) {
            return -1;
        }
        if (c3 >= 2) {
            return this.unsignedNumerator.compareTo(eRational.unsignedNumerator);
        }
        if (c3 == 1) {
            return 0;
        }
        int iCompareTo = Abs().compareTo(eRational.Abs());
        return iCompareTo == 0 ? this.denominator.compareTo(eRational.denominator) : iCompareTo;
    }

    public int CompareToValue(int i2) {
        return CompareToValue(FromInt32(i2));
    }

    public int CompareToValue(long j2) {
        return CompareToValue(FromInt64(j2));
    }

    public int CompareToValue(ERational eRational) {
        if (eRational == null) {
            return 1;
        }
        if (this == eRational) {
            return 0;
        }
        if (IsNaN()) {
            return !eRational.IsNaN() ? 1 : 0;
        }
        if (eRational.IsNaN()) {
            return -1;
        }
        int iSignum = signum();
        int iSignum2 = eRational.signum();
        if (iSignum != iSignum2) {
            return iSignum < iSignum2 ? -1 : 1;
        }
        if (iSignum2 == 0 || iSignum == 0) {
            return 0;
        }
        if (IsInfinity()) {
            if (eRational.IsInfinity()) {
                return 0;
            }
            return isNegative() ? -1 : 1;
        }
        if (eRational.IsInfinity()) {
            return eRational.isNegative() ? 1 : -1;
        }
        int iCompareTo = this.denominator.compareTo(eRational.denominator);
        int iCompareTo2 = this.unsignedNumerator.compareTo(eRational.unsignedNumerator);
        if (iSignum < 0) {
            iCompareTo2 = -iCompareTo2;
        }
        if (iCompareTo2 == 0) {
            return iSignum < 0 ? iCompareTo : -iCompareTo;
        }
        if (iCompareTo == 0) {
            return iCompareTo2;
        }
        EInteger numerator = getNumerator();
        EInteger denominator = getDenominator();
        EInteger numerator2 = eRational.getNumerator();
        EInteger denominator2 = eRational.getDenominator();
        int iCompareTo3 = numerator.Abs().compareTo(denominator);
        int iCompareTo4 = numerator2.Abs().compareTo(denominator2);
        if (iCompareTo3 == 0 && iCompareTo4 == 0) {
            return 0;
        }
        if (iCompareTo3 == 0) {
            return iSignum < 0 ? iCompareTo4 : -iCompareTo4;
        }
        if (iCompareTo4 == 0) {
            return iSignum < 0 ? -iCompareTo3 : iCompareTo3;
        }
        if (iCompareTo3 < 0 && iCompareTo4 > 0) {
            return iSignum < 0 ? 1 : -1;
        }
        if (iCompareTo3 > 0 && iCompareTo4 < 0) {
            return iSignum < 0 ? -1 : 1;
        }
        EInteger eIntegerAdd = numerator.GetUnsignedBitLengthAsEInteger().Add(denominator2.GetUnsignedBitLengthAsEInteger());
        EInteger eIntegerAdd2 = denominator.GetUnsignedBitLengthAsEInteger().Add(numerator2.GetUnsignedBitLengthAsEInteger());
        return eIntegerAdd.Subtract(1).compareTo(eIntegerAdd2) > 0 ? iSignum < 0 ? -1 : 1 : eIntegerAdd2.Subtract(1).compareTo(eIntegerAdd) > 0 ? iSignum < 0 ? 1 : -1 : numerator.Multiply(denominator2).compareTo(denominator.Multiply(numerator2));
    }

    public ERational Copy() {
        return new ERational(this.unsignedNumerator, this.denominator, this.flags);
    }

    public ERational CopySign(ERational eRational) {
        if (eRational != null) {
            return isNegative() ? eRational.isNegative() ? this : Negate() : eRational.isNegative() ? Negate() : this;
        }
        throw new NullPointerException("other");
    }

    public ERational Decrement() {
        return Subtract(FromInt32(1));
    }

    public ERational Divide(int i2) {
        return Divide(FromInt32(i2));
    }

    public ERational Divide(long j2) {
        return Divide(FromInt64(j2));
    }

    public ERational Divide(ERational eRational) {
        if (eRational == null) {
            throw new NullPointerException("otherValue");
        }
        if (IsSignalingNaN()) {
            return CreateNaN(getUnsignedNumerator(), false, isNegative());
        }
        if (eRational.IsSignalingNaN()) {
            return CreateNaN(eRational.getUnsignedNumerator(), false, eRational.isNegative());
        }
        if (IsQuietNaN()) {
            return this;
        }
        if (eRational.IsQuietNaN()) {
            return eRational;
        }
        boolean zIsNegative = isNegative() ^ eRational.isNegative();
        return IsInfinity() ? eRational.IsInfinity() ? NaN : zIsNegative ? NegativeInfinity : PositiveInfinity : eRational.IsInfinity() ? zIsNegative ? NegativeZero : Zero : eRational.isZero() ? isZero() ? NaN : zIsNegative ? NegativeInfinity : PositiveInfinity : isZero() ? zIsNegative ? NegativeZero : Zero : Create(getNumerator().Multiply(eRational.getDenominator()), getDenominator().Multiply(eRational.getNumerator()));
    }

    public ERational Increment() {
        return Add(FromInt32(1));
    }

    public boolean IsInfinity() {
        byte b2 = this.flags;
        return (b2 + 2) - (b2 | 2) != 0;
    }

    public boolean IsInteger() {
        if (!isFinite()) {
            return false;
        }
        if (!this.denominator.isEvenNumber() || this.unsignedNumerator.isEvenNumber()) {
            return getNumerator().Remainder(getDenominator()).isZero();
        }
        return false;
    }

    public boolean IsNaN() {
        byte b2 = this.flags;
        return (b2 + Ascii.FF) - (b2 | Ascii.FF) != 0;
    }

    public boolean IsNegativeInfinity() {
        return (-1) - (((-1) - this.flags) | ((-1) - 3)) == 3;
    }

    public boolean IsPositiveInfinity() {
        return (this.flags & 3) == 2;
    }

    public boolean IsQuietNaN() {
        return (this.flags & 4) != 0;
    }

    public boolean IsSignalingNaN() {
        return (this.flags & 8) != 0;
    }

    public ERational Multiply(int i2) {
        return Multiply(FromInt32(i2));
    }

    public ERational Multiply(long j2) {
        return Multiply(FromInt64(j2));
    }

    public ERational Multiply(ERational eRational) {
        if (eRational == null) {
            throw new NullPointerException("otherValue");
        }
        if (IsSignalingNaN()) {
            return CreateNaN(getUnsignedNumerator(), false, isNegative());
        }
        if (eRational.IsSignalingNaN()) {
            return CreateNaN(eRational.getUnsignedNumerator(), false, eRational.isNegative());
        }
        if (IsQuietNaN()) {
            return this;
        }
        if (eRational.IsQuietNaN()) {
            return eRational;
        }
        boolean zIsNegative = isNegative() ^ eRational.isNegative();
        if (IsInfinity()) {
            return eRational.isZero() ? NaN : zIsNegative ? NegativeInfinity : PositiveInfinity;
        }
        if (eRational.IsInfinity()) {
            return isZero() ? NaN : zIsNegative ? NegativeInfinity : PositiveInfinity;
        }
        EInteger eIntegerMultiply = getNumerator().Multiply(eRational.getNumerator());
        return eIntegerMultiply.isZero() ? zIsNegative ? NegativeZero : Zero : Create(eIntegerMultiply, getDenominator().Multiply(eRational.getDenominator()));
    }

    public ERational Negate() {
        return new ERational(this.unsignedNumerator, this.denominator, (byte) (this.flags ^ 1));
    }

    public ERational Remainder(int i2) {
        return Remainder(FromInt32(i2));
    }

    public ERational Remainder(long j2) {
        return Remainder(FromInt64(j2));
    }

    public ERational Remainder(ERational eRational) {
        if (eRational == null) {
            throw new NullPointerException("otherValue");
        }
        if (IsSignalingNaN()) {
            return CreateNaN(getUnsignedNumerator(), false, isNegative());
        }
        if (eRational.IsSignalingNaN()) {
            return CreateNaN(eRational.getUnsignedNumerator(), false, eRational.isNegative());
        }
        if (IsQuietNaN()) {
            return this;
        }
        if (eRational.IsQuietNaN()) {
            return eRational;
        }
        if (IsInfinity()) {
            return NaN;
        }
        if (eRational.IsInfinity()) {
            return this;
        }
        if (eRational.isZero()) {
            return NaN;
        }
        if (isZero()) {
            return this;
        }
        EInteger eIntegerMultiply = getNumerator().Multiply(eRational.getDenominator()).Divide(getDenominator().Multiply(eRational.getNumerator())).Multiply(eRational.getNumerator());
        EInteger denominator = eRational.getDenominator();
        EInteger denominator2 = getDenominator();
        EInteger eIntegerMultiply2 = getNumerator().Multiply(denominator);
        EInteger eIntegerMultiply3 = denominator2.Multiply(eIntegerMultiply);
        return Create(eIntegerMultiply2.Subtract(eIntegerMultiply3), denominator.Multiply(denominator2));
    }

    public ERational Subtract(int i2) {
        return Subtract(FromInt32(i2));
    }

    public ERational Subtract(long j2) {
        return Subtract(FromInt64(j2));
    }

    public ERational Subtract(ERational eRational) {
        if (eRational == null) {
            throw new NullPointerException("otherValue");
        }
        if (IsSignalingNaN()) {
            return CreateNaN(getUnsignedNumerator(), false, isNegative());
        }
        if (eRational.IsSignalingNaN()) {
            return CreateNaN(eRational.getUnsignedNumerator(), false, eRational.isNegative());
        }
        if (IsQuietNaN()) {
            return this;
        }
        if (eRational.IsQuietNaN()) {
            return eRational;
        }
        if (IsInfinity()) {
            return eRational.IsInfinity() ? isNegative() != eRational.isNegative() ? isNegative() ? PositiveInfinity : NegativeInfinity : NaN : isNegative() ? PositiveInfinity : NegativeInfinity;
        }
        if (eRational.IsInfinity()) {
            return eRational.isNegative() ? PositiveInfinity : NegativeInfinity;
        }
        return Create(getNumerator().Multiply(eRational.getDenominator()).Subtract(getDenominator().Multiply(eRational.getNumerator())), getDenominator().Multiply(eRational.getDenominator()));
    }

    public byte ToByteChecked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isNegative() && !isZero() && getUnsignedNumerator().compareTo(getDenominator()) >= 0) {
            throw new ArithmeticException("Value out of range");
        }
        CheckTrivialOverflow(8);
        if (isZero()) {
            return (byte) 0;
        }
        return ToEInteger().ToByteChecked();
    }

    public byte ToByteIfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isNegative() && !isZero() && getUnsignedNumerator().compareTo(getDenominator()) >= 0) {
            throw new ArithmeticException("Value out of range");
        }
        CheckTrivialOverflow(8);
        if (isZero()) {
            return (byte) 0;
        }
        return ToEIntegerIfExact().ToByteChecked();
    }

    public byte ToByteUnchecked() {
        if (isFinite()) {
            return ToEInteger().ToByteUnchecked();
        }
        return (byte) 0;
    }

    public double ToDouble() {
        return !isFinite() ? ToEFloat(EContext.Binary64).ToDouble() : (isNegative() && isZero()) ? EFloat.NegativeZero.ToDouble() : EFloat.FromEInteger(getNumerator()).Divide(EFloat.FromEInteger(getDenominator()), EContext.Binary64).ToDouble();
    }

    public long ToDoubleBits() {
        return !isFinite() ? ToEFloat(EContext.Binary64).ToDoubleBits() : (isNegative() && isZero()) ? EFloat.NegativeZero.ToDoubleBits() : EFloat.FromEInteger(getNumerator()).Divide(EFloat.FromEInteger(getDenominator()), EContext.Binary64).ToDoubleBits();
    }

    public EDecimal ToEDecimal() {
        return ToEDecimal(null);
    }

    public EDecimal ToEDecimal(EContext eContext) {
        if (IsNaN()) {
            return EDecimal.CreateNaN(getUnsignedNumerator(), IsSignalingNaN(), isNegative(), eContext);
        }
        if (IsPositiveInfinity()) {
            return EDecimal.PositiveInfinity.RoundToPrecision(eContext);
        }
        if (IsNegativeInfinity()) {
            return EDecimal.NegativeInfinity.RoundToPrecision(eContext);
        }
        return ((isNegative() && isZero()) ? EDecimal.NegativeZero : EDecimal.FromEInteger(getNumerator())).Divide(EDecimal.FromEInteger(getDenominator()), eContext);
    }

    public EDecimal ToEDecimalExactIfPossible(EContext eContext) {
        if (eContext == null) {
            return ToEDecimal(null);
        }
        if (IsNaN()) {
            return EDecimal.CreateNaN(getUnsignedNumerator(), IsSignalingNaN(), isNegative(), eContext);
        }
        if (IsPositiveInfinity()) {
            return EDecimal.PositiveInfinity.RoundToPrecision(eContext);
        }
        if (IsNegativeInfinity()) {
            return EDecimal.NegativeInfinity.RoundToPrecision(eContext);
        }
        if (isNegative() && isZero()) {
            return EDecimal.NegativeZero;
        }
        EInteger numerator = getNumerator();
        EInteger denominator = getDenominator();
        EDecimal eDecimalFromEInteger = (isNegative() && isZero()) ? EDecimal.NegativeZero : EDecimal.FromEInteger(numerator);
        EDecimal eDecimalFromEInteger2 = EDecimal.FromEInteger(denominator);
        EDecimal eDecimalDivide = eDecimalFromEInteger.Divide(eDecimalFromEInteger2, null);
        return eDecimalDivide.IsNaN() ? eDecimalFromEInteger.Divide(eDecimalFromEInteger2, eContext) : eDecimalDivide;
    }

    public EFloat ToEFloat() {
        return ToEFloat(null);
    }

    public EFloat ToEFloat(EContext eContext) {
        if (IsNaN()) {
            return EFloat.CreateNaN(getUnsignedNumerator(), IsSignalingNaN(), isNegative(), eContext);
        }
        if (IsPositiveInfinity()) {
            return EFloat.PositiveInfinity.RoundToPrecision(eContext);
        }
        if (IsNegativeInfinity()) {
            return EFloat.NegativeInfinity.RoundToPrecision(eContext);
        }
        return ((isNegative() && isZero()) ? EFloat.NegativeZero : EFloat.FromEInteger(getNumerator())).Divide(EFloat.FromEInteger(getDenominator()), eContext);
    }

    public EFloat ToEFloatExactIfPossible(EContext eContext) {
        if (eContext == null) {
            return ToEFloat(null);
        }
        if (IsNaN()) {
            return EFloat.CreateNaN(getUnsignedNumerator(), IsSignalingNaN(), isNegative(), eContext);
        }
        if (IsPositiveInfinity()) {
            return EFloat.PositiveInfinity.RoundToPrecision(eContext);
        }
        if (IsNegativeInfinity()) {
            return EFloat.NegativeInfinity.RoundToPrecision(eContext);
        }
        if (isZero()) {
            return isNegative() ? EFloat.NegativeZero : EFloat.Zero;
        }
        EFloat eFloatFromEInteger = (isNegative() && isZero()) ? EFloat.NegativeZero : EFloat.FromEInteger(getNumerator());
        EFloat eFloatFromEInteger2 = EFloat.FromEInteger(getDenominator());
        EFloat eFloatDivide = eFloatFromEInteger.Divide(eFloatFromEInteger2, null);
        return eFloatDivide.IsNaN() ? eFloatFromEInteger.Divide(eFloatFromEInteger2, eContext) : eFloatDivide;
    }

    public EInteger ToEInteger() {
        if (isFinite()) {
            return getNumerator().Divide(getDenominator());
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    @Deprecated
    public EInteger ToEIntegerExact() {
        return ToEIntegerIfExact();
    }

    public EInteger ToEIntegerIfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (this.denominator.isEvenNumber() && !this.unsignedNumerator.isEvenNumber()) {
            throw new ArithmeticException("Value is not an integer");
        }
        EInteger[] eIntegerArrDivRem = getNumerator().DivRem(getDenominator());
        EInteger eInteger = eIntegerArrDivRem[0];
        if (eIntegerArrDivRem[1].isZero()) {
            return eInteger;
        }
        throw new ArithmeticException("Value is not an integer");
    }

    @Deprecated
    public EDecimal ToExtendedDecimal() {
        return ToEDecimal();
    }

    @Deprecated
    public EDecimal ToExtendedDecimal(EContext eContext) {
        return ToEDecimal(eContext);
    }

    @Deprecated
    public EDecimal ToExtendedDecimalExactIfPossible(EContext eContext) {
        return ToEDecimalExactIfPossible(eContext);
    }

    @Deprecated
    public EFloat ToExtendedFloat() {
        return ToEFloat();
    }

    @Deprecated
    public EFloat ToExtendedFloat(EContext eContext) {
        return ToEFloat(eContext);
    }

    @Deprecated
    public EFloat ToExtendedFloatExactIfPossible(EContext eContext) {
        return ToEFloatExactIfPossible(eContext);
    }

    public short ToInt16Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(15);
        if (isZero()) {
            return (short) 0;
        }
        return ToEInteger().ToInt16Checked();
    }

    public short ToInt16IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(15);
        if (isZero()) {
            return (short) 0;
        }
        return ToEIntegerIfExact().ToInt16Checked();
    }

    public short ToInt16Unchecked() {
        if (isFinite()) {
            return ToEInteger().ToInt16Unchecked();
        }
        return (short) 0;
    }

    public int ToInt32Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(31);
        if (isZero()) {
            return 0;
        }
        return ToEInteger().ToInt32Checked();
    }

    public int ToInt32IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(31);
        if (isZero()) {
            return 0;
        }
        return ToEIntegerIfExact().ToInt32Checked();
    }

    public int ToInt32Unchecked() {
        if (isFinite()) {
            return ToEInteger().ToInt32Unchecked();
        }
        return 0;
    }

    public long ToInt64Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(63);
        if (isZero()) {
            return 0L;
        }
        return ToEInteger().ToInt64Checked();
    }

    public long ToInt64IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(63);
        if (isZero()) {
            return 0L;
        }
        return ToEIntegerIfExact().ToInt64Checked();
    }

    public long ToInt64Unchecked() {
        if (isFinite()) {
            return ToEInteger().ToInt64Unchecked();
        }
        return 0L;
    }

    public ERational ToLowestTerms() {
        if (!isFinite()) {
            return this;
        }
        if (isZero()) {
            return isNegative() ? NegativeZero : Zero;
        }
        EInteger numerator = getNumerator();
        EInteger denominator = getDenominator();
        EInteger eIntegerGcd = numerator.Abs().Gcd(denominator);
        return Create(numerator.Divide(eIntegerGcd), denominator.Divide(eIntegerGcd));
    }

    public float ToSingle() {
        return !isFinite() ? ToEFloat(EContext.Binary32).ToSingle() : (isNegative() && isZero()) ? EFloat.NegativeZero.ToSingle() : EFloat.FromEInteger(getNumerator()).Divide(EFloat.FromEInteger(getDenominator()), EContext.Binary32).ToSingle();
    }

    public int ToSingleBits() {
        return !isFinite() ? ToEFloat(EContext.Binary32).ToSingleBits() : (isNegative() && isZero()) ? EFloat.NegativeZero.ToSingleBits() : EFloat.FromEInteger(getNumerator()).Divide(EFloat.FromEInteger(getDenominator()), EContext.Binary32).ToSingleBits();
    }

    public EInteger ToSizedEInteger(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("maxBitLength (" + i2 + ") is not greater or equal to 0");
        }
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        EInteger unsignedNumerator = getUnsignedNumerator();
        EInteger denominator = getDenominator();
        if (unsignedNumerator.compareTo(denominator) < 0) {
            return EInteger.FromInt32(0);
        }
        if (unsignedNumerator.GetUnsignedBitLengthAsEInteger().Subtract(2).Subtract(denominator.GetUnsignedBitLengthAsEInteger()).compareTo(i2) > 0) {
            throw new ArithmeticException("Value out of range");
        }
        EInteger eIntegerToEInteger = ToEInteger();
        if (eIntegerToEInteger.GetSignedBitLengthAsInt64() <= i2) {
            return eIntegerToEInteger;
        }
        throw new ArithmeticException("Value out of range");
    }

    public EInteger ToSizedEIntegerIfExact(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("maxBitLength (" + i2 + ") is not greater or equal to 0");
        }
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        EInteger unsignedNumerator = getUnsignedNumerator();
        EInteger denominator = getDenominator();
        if (unsignedNumerator.isZero()) {
            return EInteger.FromInt32(0);
        }
        if (unsignedNumerator.compareTo(denominator) < 0) {
            throw new ArithmeticException("Value is not an integer");
        }
        if (unsignedNumerator.GetUnsignedBitLengthAsEInteger().Subtract(2).Subtract(denominator.GetUnsignedBitLengthAsEInteger()).compareTo(i2) > 0) {
            throw new ArithmeticException("Value out of range");
        }
        EInteger eIntegerToEIntegerIfExact = ToEIntegerIfExact();
        if (eIntegerToEIntegerIfExact.GetSignedBitLengthAsInt64() <= i2) {
            return eIntegerToEIntegerIfExact;
        }
        throw new ArithmeticException("Value out of range");
    }

    public int compareTo(int i2) {
        return CompareToValue(FromInt32(i2));
    }

    public int compareTo(long j2) {
        return CompareToValue(FromInt64(j2));
    }

    @Override // java.lang.Comparable
    public int compareTo(ERational eRational) {
        return CompareToValue(eRational);
    }

    public boolean equals(ERational eRational) {
        return equals((Object) eRational);
    }

    public boolean equals(Object obj) {
        FastIntegerFixed fastIntegerFixed;
        FastIntegerFixed fastIntegerFixed2;
        ERational eRational = obj instanceof ERational ? (ERational) obj : null;
        return eRational != null && ((fastIntegerFixed = this.unsignedNumerator) != null ? fastIntegerFixed.equals(eRational.unsignedNumerator) : eRational.unsignedNumerator == null) && ((fastIntegerFixed2 = this.denominator) != null ? fastIntegerFixed2.equals(eRational.denominator) : eRational.denominator == null) && this.flags == eRational.flags;
    }

    public final EInteger getDenominator() {
        return this.denominator.ToEInteger();
    }

    public final EInteger getNumerator() {
        return isNegative() ? this.unsignedNumerator.Negate().ToEInteger() : this.unsignedNumerator.ToEInteger();
    }

    public final EInteger getUnsignedNumerator() {
        return this.unsignedNumerator.ToEInteger();
    }

    public int hashCode() {
        FastIntegerFixed fastIntegerFixed = this.unsignedNumerator;
        int iHashCode = fastIntegerFixed != null ? 1857066527 + (fastIntegerFixed.hashCode() * 1857066539) : 1857066527;
        FastIntegerFixed fastIntegerFixed2 = this.denominator;
        if (fastIntegerFixed2 != null) {
            iHashCode += fastIntegerFixed2.hashCode() * 1857066551;
        }
        return iHashCode + (this.flags * 1857066623);
    }

    public final boolean isFinite() {
        return (IsNaN() || IsInfinity()) ? false : true;
    }

    public final boolean isNegative() {
        return (-1) - (((-1) - this.flags) | ((-1) - 1)) != 0;
    }

    public final boolean isZero() {
        return (-1) - (((-1) - this.flags) | ((-1) - 14)) == 0 && this.unsignedNumerator.isValueZero();
    }

    public final int signum() {
        if ((this.flags & Ascii.SO) != 0) {
            if (isNegative()) {
                return -1;
            }
        } else {
            if (this.unsignedNumerator.isValueZero()) {
                return 0;
            }
            if (isNegative()) {
                return -1;
            }
        }
        return 1;
    }

    public String toString() {
        if (!isFinite()) {
            if (IsSignalingNaN()) {
                return this.unsignedNumerator.isValueZero() ? isNegative() ? "-sNaN" : "sNaN" : isNegative() ? "-sNaN" + this.unsignedNumerator : "sNaN" + this.unsignedNumerator;
            }
            if (IsQuietNaN()) {
                return this.unsignedNumerator.isValueZero() ? isNegative() ? "-NaN" : "NaN" : isNegative() ? "-NaN" + this.unsignedNumerator : "NaN" + this.unsignedNumerator;
            }
            if (IsInfinity()) {
                return isNegative() ? "-Infinity" : "Infinity";
            }
        }
        return ((this.unsignedNumerator.isValueZero() && isNegative()) ? new StringBuilder("-0/") : new StringBuilder().append(getNumerator()).append(RemoteSettings.FORWARD_SLASH_STRING)).append(getDenominator()).toString();
    }
}

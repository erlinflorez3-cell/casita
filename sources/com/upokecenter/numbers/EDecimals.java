package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
public final class EDecimals {
    private static final int DecimalRadix = 10;
    private static final String[] NumberClasses = {"+Normal", "-Normal", "+Subnormal", "-Subnormal", "+Zero", "-Zero", "+Infinity", "-Infinity", "NaN", "sNaN"};

    private EDecimals() {
    }

    public static EDecimal And(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        byte[] bArrFromLogical;
        byte[] bArrFromLogical2 = FromLogical(eDecimal, eContext, 10);
        if (bArrFromLogical2 != null && (bArrFromLogical = FromLogical(eDecimal2, eContext, 10)) != null) {
            byte[] bArr = bArrFromLogical2.length < bArrFromLogical.length ? bArrFromLogical2 : bArrFromLogical;
            if (bArrFromLogical2.length < bArrFromLogical.length) {
                bArrFromLogical2 = bArrFromLogical;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b2 = bArr[i2];
                byte b3 = bArrFromLogical2[i2];
                bArr[i2] = (byte) ((b2 + b3) - (b2 | b3));
            }
            return EDecimal.FromEInteger(ToLogical(bArr, 10)).RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }

    public static EDecimal BooleanToEDecimal(boolean z2, EContext eContext) {
        return EDecimal.FromInt32(z2 ? 1 : 0).RoundToPrecision(eContext);
    }

    public static EDecimal Canonical(EDecimal eDecimal) {
        return Copy(eDecimal);
    }

    public static int CompareTotal(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            return eDecimal2 == null ? 0 : -1;
        }
        if (eDecimal2 == null) {
            return 1;
        }
        return eDecimal.CompareToTotal(eDecimal2, eContext);
    }

    public static int CompareTotalMagnitude(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            return eDecimal2 == null ? 0 : -1;
        }
        if (eDecimal2 == null) {
            return 1;
        }
        return eDecimal.CompareToTotalMagnitude(eDecimal2, eContext);
    }

    public static EDecimal Copy(EDecimal eDecimal) {
        if (eDecimal != null) {
            return eDecimal.Copy();
        }
        throw new NullPointerException("ed");
    }

    public static EDecimal CopyAbs(EDecimal eDecimal) {
        if (eDecimal != null) {
            return Copy(eDecimal.Abs());
        }
        throw new NullPointerException("ed");
    }

    public static EDecimal CopyNegate(EDecimal eDecimal) {
        if (eDecimal != null) {
            return Copy(eDecimal.Negate());
        }
        throw new NullPointerException("ed");
    }

    public static EDecimal CopySign(EDecimal eDecimal, EDecimal eDecimal2) {
        if (eDecimal == null) {
            throw new NullPointerException("ed");
        }
        if (eDecimal2 != null) {
            return eDecimal.isNegative() == eDecimal2.isNegative() ? Copy(eDecimal) : CopyNegate(eDecimal);
        }
        throw new NullPointerException("other");
    }

    static byte[] FromLogical(EDecimal eDecimal, EContext eContext, int i2) {
        if (eDecimal == null) {
            return null;
        }
        if (eContext != null && eContext.isPrecisionInBits() && i2 != 2) {
            eDecimal = eDecimal.RoundToPrecision(eContext);
        }
        if (!eDecimal.isFinite() || eDecimal.isNegative() || eDecimal.getExponent().signum() != 0 || eDecimal.getMantissa().signum() < 0) {
            return null;
        }
        return FromLogical(eDecimal.getUnsignedMantissa(), eContext, i2);
    }

    static byte[] FromLogical(EFloat eFloat, EContext eContext, int i2) {
        if (eFloat != null && eFloat.isFinite() && !eFloat.isNegative() && eFloat.getExponent().signum() == 0 && eFloat.getMantissa().signum() >= 0) {
            return FromLogical(eFloat.getUnsignedMantissa(), eContext, i2);
        }
        return null;
    }

    static byte[] FromLogical(EInteger eInteger, EContext eContext, int i2) {
        if (eInteger == null || eInteger.signum() < 0) {
            return null;
        }
        if (eInteger.signum() == 0) {
            return new byte[]{0};
        }
        EInteger.FromInt32(0);
        EInteger eIntegerGetDigitCountAsEInteger = eInteger.GetDigitCountAsEInteger();
        EInteger precision = (eContext == null || !eContext.getHasMaxPrecision()) ? null : eContext.getPrecision();
        EInteger eIntegerAdd = eIntegerGetDigitCountAsEInteger.ShiftRight(3).Add(1);
        if (eIntegerAdd.compareTo(Integer.MAX_VALUE) > 0) {
            return null;
        }
        byte[] bArr = new byte[eIntegerAdd.ToInt32Checked()];
        EInteger eIntegerFromInt32 = EInteger.FromInt32(i2);
        int i3 = 0;
        while (eInteger.signum() > 0) {
            EInteger[] eIntegerArrDivRem = eInteger.DivRem(eIntegerFromInt32);
            int iToInt32Checked = eIntegerArrDivRem[1].ToInt32Checked();
            eInteger = eIntegerArrDivRem[0];
            if (iToInt32Checked == 1) {
                if (precision == null || precision.compareTo(i3) > 0) {
                    int i4 = i3 >> 3;
                    bArr[i4] = (byte) ((-1) - (((-1) - ((byte) (1 << (7 & i3)))) & ((-1) - bArr[i4])));
                }
            } else if (iToInt32Checked != 0) {
                return null;
            }
            i3++;
        }
        return bArr;
    }

    public static EDecimal Int32ToEDecimal(int i2, EContext eContext) {
        return EDecimal.FromInt32(i2).RoundToPrecision(eContext);
    }

    private static EDecimal InvalidOperation(EContext eContext) {
        return EDecimal.SignalingNaN.Plus(eContext);
    }

    public static EDecimal Invert(EDecimal eDecimal, EContext eContext) {
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return InvalidOperation(eContext);
        }
        byte[] bArrFromLogical = FromLogical(eDecimal, eContext, 10);
        if (bArrFromLogical == null) {
            return InvalidOperation(eContext);
        }
        byte[] bArrToBytes = EInteger.FromInt32(1).ShiftLeft(eContext.getPrecision()).Subtract(1).ToBytes(true);
        for (int i2 = 0; i2 < bArrFromLogical.length; i2++) {
            bArrToBytes[i2] = (byte) (bArrToBytes[i2] ^ bArrFromLogical[i2]);
        }
        return EDecimal.FromEInteger(ToLogical(bArrToBytes, 10)).RoundToPrecision(eContext);
    }

    public static boolean IsCanonical(EDecimal eDecimal) {
        return true;
    }

    public static boolean IsFinite(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.isFinite();
    }

    public static boolean IsInfinite(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.IsInfinity();
    }

    public static boolean IsNaN(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.IsNaN();
    }

    public static boolean IsNormal(EDecimal eDecimal, EContext eContext) {
        return (eDecimal == null || !eDecimal.isFinite() || eDecimal.isZero() || IsSubnormal(eDecimal, eContext)) ? false : true;
    }

    public static boolean IsQuietNaN(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.IsQuietNaN();
    }

    public static boolean IsSignalingNaN(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.IsSignalingNaN();
    }

    public static boolean IsSigned(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.isNegative();
    }

    public static boolean IsSubnormal(EDecimal eDecimal, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("ed");
        }
        if (!eDecimal.isFinite() || eContext == null || eDecimal.isZero() || !eContext.getHasExponentRange()) {
            return false;
        }
        return eContext.getAdjustExponent() ? eDecimal.getExponent().Add(eDecimal.Precision().Subtract(1)).compareTo(eContext.getEMin()) < 0 : eDecimal.getExponent().compareTo(eContext.getEMin()) < 0;
    }

    public static boolean IsZero(EDecimal eDecimal) {
        return eDecimal != null && eDecimal.isZero();
    }

    public static EDecimal LogB(EDecimal eDecimal, EContext eContext) {
        if (eDecimal != null) {
            return eDecimal.IsNaN() ? eDecimal.RoundToPrecision(eContext) : eDecimal.IsInfinity() ? EDecimal.PositiveInfinity : eDecimal.isZero() ? EDecimal.FromInt32(-1).Divide(EDecimal.Zero, eContext) : EDecimal.FromEInteger(eDecimal.getExponent().Add(eDecimal.Precision().Subtract(1))).RoundToPrecision(eContext);
        }
        throw new NullPointerException("ed");
    }

    public static int NumberClass(EDecimal eDecimal, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("ed");
        }
        if (eDecimal.IsQuietNaN()) {
            return 8;
        }
        if (eDecimal.IsNaN()) {
            return 9;
        }
        return eDecimal.IsInfinity() ? eDecimal.isNegative() ? 7 : 6 : eDecimal.isZero() ? eDecimal.isNegative() ? 5 : 4 : IsSubnormal(eDecimal, eContext) ? eDecimal.isNegative() ? 3 : 2 : eDecimal.isNegative() ? 1 : 0;
    }

    public static String NumberClassString(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("nc(" + i2 + ") is not greater or equal to 0");
        }
        if (i2 <= 9) {
            return NumberClasses[i2];
        }
        throw new IllegalArgumentException("nc(" + i2 + ") is not less or equal to 9");
    }

    public static EDecimal Or(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        byte[] bArrFromLogical;
        byte[] bArrFromLogical2 = FromLogical(eDecimal, eContext, 10);
        if (bArrFromLogical2 != null && (bArrFromLogical = FromLogical(eDecimal2, eContext, 10)) != null) {
            byte[] bArr = bArrFromLogical2.length < bArrFromLogical.length ? bArrFromLogical2 : bArrFromLogical;
            if (bArrFromLogical2.length < bArrFromLogical.length) {
                bArrFromLogical2 = bArrFromLogical;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArrFromLogical2[i2] = (byte) (bArrFromLogical2[i2] | bArr[i2]);
            }
            return EDecimal.FromEInteger(ToLogical(bArrFromLogical2, 10)).RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }

    public static EDecimal Radix(EContext eContext) {
        return EDecimal.FromInt32(10).RoundToPrecision(eContext);
    }

    public static EDecimal Rescale(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null || eDecimal2 == null) {
            return InvalidOperation(eContext);
        }
        if (!eDecimal2.isFinite()) {
            return eDecimal.Quantize(eDecimal2, eContext);
        }
        if (eDecimal2.getExponent().isZero()) {
            return eDecimal.Quantize(EDecimal.Create(EInteger.FromInt32(1), eDecimal2.getMantissa()), eContext);
        }
        EContext eContextWithBlankFlags = eContext == null ? null : eContext.WithTraps(0).WithBlankFlags();
        if (eDecimal2.RoundToExponentExact(0, eContextWithBlankFlags).isFinite()) {
            int flags = eContextWithBlankFlags.getFlags();
            if ((flags + 1) - (flags | 1) == 0) {
                return eDecimal.Quantize(EDecimal.Create(EInteger.FromInt32(1), eDecimal2.Quantize(0, eContextWithBlankFlags).getMantissa()), eContext);
            }
        }
        if (eContext != null && eContext.isSimplified()) {
            eDecimal2.RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }

    public static EDecimal Rotate(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return Shift(eDecimal, eDecimal2, eContext);
        }
        if (eDecimal2 == null) {
            throw new NullPointerException("ed2");
        }
        if (eDecimal == null) {
            throw new NullPointerException("ed");
        }
        if (eDecimal.IsNaN() || eDecimal2.IsNaN()) {
            return eDecimal.Add(eDecimal2, eContext);
        }
        if (!eDecimal2.isFinite() || eDecimal2.getExponent().signum() != 0) {
            return InvalidOperation(eContext);
        }
        EInteger mantissa = eDecimal2.getMantissa();
        if (mantissa.Abs().compareTo(eContext.getPrecision()) > 0) {
            return InvalidOperation(eContext);
        }
        if (eDecimal.IsInfinity()) {
            return eDecimal;
        }
        EInteger unsignedMantissa = eDecimal.getUnsignedMantissa();
        EInteger eIntegerPrecision = eDecimal.Precision();
        if (eContext != null && eContext.getHasMaxPrecision() && eIntegerPrecision.compareTo(eContext.getPrecision()) > 0) {
            unsignedMantissa = unsignedMantissa.Remainder(EInteger.FromInt32(10).Pow(eContext.getPrecision()));
            eIntegerPrecision = eContext.getPrecision();
        }
        if (unsignedMantissa.isZero()) {
            return eDecimal.RoundToPrecision(eContext);
        }
        EInteger eIntegerAbs = mantissa.signum() < 0 ? mantissa.Abs() : eContext.getPrecision().Subtract(mantissa);
        EInteger eIntegerSubtract = eContext.getPrecision().Subtract(eIntegerAbs);
        EInteger.FromInt32(0);
        EInteger.FromInt32(0);
        EInteger eIntegerFromInt32 = EInteger.FromInt32(10);
        EInteger eIntegerDivide = eIntegerAbs.compareTo(eIntegerPrecision) < 0 ? unsignedMantissa.Divide(eIntegerFromInt32.Pow(eIntegerAbs)) : EInteger.FromInt32(0);
        if (!eIntegerSubtract.isZero()) {
            unsignedMantissa = eIntegerSubtract.compareTo(eContext.getPrecision()) == 0 ? EInteger.FromInt32(0) : unsignedMantissa.Multiply(eIntegerFromInt32.Pow(eIntegerSubtract)).Remainder(eIntegerFromInt32.Pow(eContext.getPrecision()));
        }
        EDecimal eDecimalCreate = EDecimal.Create(eIntegerDivide.Add(unsignedMantissa), eDecimal.getExponent());
        return eDecimal.isNegative() ? eDecimalCreate.Negate() : eDecimalCreate;
    }

    public static boolean SameQuantum(EDecimal eDecimal, EDecimal eDecimal2) {
        if (eDecimal == null || eDecimal2 == null) {
            return false;
        }
        return (eDecimal.isFinite() && eDecimal2.isFinite()) ? eDecimal.getExponent().equals(eDecimal2.getExponent()) : (eDecimal.IsNaN() && eDecimal2.IsNaN()) || (eDecimal.IsInfinity() && eDecimal2.IsInfinity());
    }

    public static EDecimal ScaleB(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("ed");
        }
        if (eDecimal2 == null) {
            throw new NullPointerException("ed2");
        }
        if (eDecimal.IsNaN() || eDecimal2.IsNaN()) {
            return eDecimal.Add(eDecimal2, eContext);
        }
        if (!eDecimal2.isFinite() || eDecimal2.getExponent().signum() != 0) {
            return InvalidOperation(eContext);
        }
        EInteger mantissa = eDecimal2.getMantissa();
        if (eContext != null && eContext.getHasMaxPrecision() && eContext.getHasExponentRange()) {
            if (mantissa.Abs().compareTo(eContext.getEMax().Add(eContext.getPrecision()).Multiply(2).Abs()) > 0) {
                return InvalidOperation(eContext);
            }
        }
        if (eDecimal.IsInfinity()) {
            return eDecimal;
        }
        if (mantissa.isZero()) {
            return eDecimal.RoundToPrecision(eContext);
        }
        EDecimal eDecimalCreate = EDecimal.Create(eDecimal.getUnsignedMantissa(), eDecimal.getExponent().Add(mantissa));
        if (eDecimal.isNegative()) {
            eDecimalCreate = eDecimalCreate.Negate();
        }
        return eDecimalCreate.RoundToPrecision(eContext);
    }

    public static EDecimal Shift(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("ed");
        }
        if (eDecimal2 == null) {
            throw new NullPointerException("ed2");
        }
        if (eDecimal.IsNaN() || eDecimal2.IsNaN()) {
            return eDecimal.Add(eDecimal2, eContext);
        }
        if (!eDecimal2.isFinite() || eDecimal2.getExponent().signum() != 0) {
            return InvalidOperation(eContext);
        }
        EInteger mantissa = eDecimal2.getMantissa();
        if (eContext != null && mantissa.Abs().compareTo(eContext.getPrecision()) > 0) {
            return InvalidOperation(eContext);
        }
        if (eDecimal.IsInfinity()) {
            return eDecimal;
        }
        EInteger unsignedMantissa = eDecimal.getUnsignedMantissa();
        if (unsignedMantissa.isZero()) {
            return eDecimal.RoundToPrecision(eContext);
        }
        EInteger eIntegerPrecision = eDecimal.Precision();
        EInteger eIntegerFromInt32 = EInteger.FromInt32(10);
        if (mantissa.signum() < 0) {
            EDecimal eDecimalCreate = EDecimal.Create(mantissa.Abs().compareTo(eIntegerPrecision) < 0 ? unsignedMantissa.Divide(eIntegerFromInt32.Pow(mantissa.Abs())) : EInteger.FromInt32(0), eDecimal.getExponent());
            return eDecimal.isNegative() ? eDecimalCreate.Negate() : eDecimalCreate;
        }
        EInteger eIntegerMultiply = unsignedMantissa.Multiply(eIntegerFromInt32.Pow(mantissa));
        if (eContext != null && eContext.getHasMaxPrecision()) {
            eIntegerMultiply = eIntegerMultiply.Remainder(eIntegerFromInt32.Pow(eContext.getPrecision()));
        }
        EDecimal eDecimalCreate2 = EDecimal.Create(eIntegerMultiply, eDecimal.getExponent());
        return eDecimal.isNegative() ? eDecimalCreate2.Negate() : eDecimalCreate2;
    }

    static EInteger ToLogical(byte[] bArr, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        EInteger eIntegerFromInt32 = EInteger.FromInt32(0);
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b2 = bArr[length];
            for (int i3 = 7; i3 >= 0; i3--) {
                eIntegerFromInt32 = (bArr[length] & (1 << i3)) != 0 ? eIntegerFromInt32.Multiply(i2).Add(1) : eIntegerFromInt32.Multiply(i2);
            }
        }
        return eIntegerFromInt32;
    }

    public static EDecimal Trim(EDecimal eDecimal, EContext eContext) {
        if (eDecimal == null) {
            return InvalidOperation(eContext);
        }
        if (eDecimal.IsSignalingNaN()) {
            return EDecimal.CreateNaN(eDecimal.getUnsignedMantissa(), true, eDecimal.isNegative(), eContext);
        }
        if (!eDecimal.isFinite()) {
            return eDecimal.Plus(eContext);
        }
        if (eDecimal.isZero()) {
            return (eDecimal.isNegative() ? EDecimal.NegativeZero : EDecimal.Zero).RoundToPrecision(eContext);
        }
        if (eDecimal.getExponent().signum() > 0) {
            return eDecimal.Reduce(eContext);
        }
        if (eDecimal.getExponent().signum() == 0) {
            return eDecimal.RoundToPrecision(eContext);
        }
        EInteger exponent = eDecimal.getExponent();
        EInteger unsignedMantissa = eDecimal.getUnsignedMantissa();
        boolean zIsNegative = eDecimal.isNegative();
        EInteger eIntegerFromInt32 = EInteger.FromInt32(10);
        boolean z2 = false;
        while (exponent.signum() < 0 && unsignedMantissa.signum() > 0) {
            EInteger[] eIntegerArrDivRem = unsignedMantissa.DivRem(eIntegerFromInt32);
            if (eIntegerArrDivRem[1].ToInt32Checked() != 0) {
                break;
            }
            unsignedMantissa = eIntegerArrDivRem[0];
            exponent = exponent.Add(1);
            z2 = true;
        }
        if (!z2) {
            return eDecimal.RoundToPrecision(eContext);
        }
        EDecimal eDecimalCreate = EDecimal.Create(unsignedMantissa, exponent);
        if (zIsNegative) {
            eDecimalCreate = eDecimalCreate.Negate();
        }
        return eDecimalCreate.RoundToPrecision(eContext);
    }

    public static EDecimal Xor(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        byte[] bArrFromLogical;
        byte[] bArrFromLogical2 = FromLogical(eDecimal, eContext, 10);
        if (bArrFromLogical2 != null && (bArrFromLogical = FromLogical(eDecimal2, eContext, 10)) != null) {
            byte[] bArr = bArrFromLogical2.length < bArrFromLogical.length ? bArrFromLogical2 : bArrFromLogical;
            if (bArrFromLogical2.length < bArrFromLogical.length) {
                bArrFromLogical2 = bArrFromLogical;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArrFromLogical2[i2] = (byte) (bArrFromLogical2[i2] ^ bArr[i2]);
            }
            return EDecimal.FromEInteger(ToLogical(bArrFromLogical2, 10)).RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }
}

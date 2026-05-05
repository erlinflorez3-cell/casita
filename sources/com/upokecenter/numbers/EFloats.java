package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
public final class EFloats {
    private static final int BinaryRadix = 2;

    private EFloats() {
    }

    public static EFloat And(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        byte[] bArrFromLogical;
        byte[] bArrFromLogical2 = EDecimals.FromLogical(eFloat, eContext, 2);
        if (bArrFromLogical2 != null && (bArrFromLogical = EDecimals.FromLogical(eFloat2, eContext, 2)) != null) {
            byte[] bArr = bArrFromLogical2.length < bArrFromLogical.length ? bArrFromLogical2 : bArrFromLogical;
            if (bArrFromLogical2.length < bArrFromLogical.length) {
                bArrFromLogical2 = bArrFromLogical;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = (byte) ((-1) - (((-1) - bArr[i2]) | ((-1) - bArrFromLogical2[i2])));
            }
            return EFloat.FromEInteger(EDecimals.ToLogical(bArr, 2)).RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }

    public static EFloat BooleanToEFloat(boolean z2, EContext eContext) {
        return EFloat.FromInt32(z2 ? 1 : 0).RoundToPrecision(eContext);
    }

    public static EFloat Canonical(EFloat eFloat) {
        return Copy(eFloat);
    }

    public static int CompareTotal(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            return eFloat2 == null ? 0 : -1;
        }
        if (eFloat2 == null) {
            return 1;
        }
        return eFloat.CompareToTotal(eFloat2, eContext);
    }

    public static int CompareTotalMagnitude(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            return eFloat2 == null ? 0 : -1;
        }
        if (eFloat2 == null) {
            return 1;
        }
        return eFloat.CompareToTotalMagnitude(eFloat2, eContext);
    }

    public static EFloat Copy(EFloat eFloat) {
        if (eFloat != null) {
            return eFloat.Copy();
        }
        throw new NullPointerException("ed");
    }

    public static EFloat CopyAbs(EFloat eFloat) {
        if (eFloat != null) {
            return Copy(eFloat.Abs());
        }
        throw new NullPointerException("ed");
    }

    public static EFloat CopyNegate(EFloat eFloat) {
        if (eFloat != null) {
            return Copy(eFloat.Negate());
        }
        throw new NullPointerException("ed");
    }

    public static EFloat CopySign(EFloat eFloat, EFloat eFloat2) {
        if (eFloat == null) {
            throw new NullPointerException("ed");
        }
        if (eFloat2 != null) {
            return eFloat.isNegative() == eFloat2.isNegative() ? Copy(eFloat) : CopyNegate(eFloat);
        }
        throw new NullPointerException("other");
    }

    public static EFloat Int32ToEFloat(int i2, EContext eContext) {
        return EFloat.FromInt32(i2).RoundToPrecision(eContext);
    }

    private static EFloat InvalidOperation(EContext eContext) {
        return EFloat.SignalingNaN.Plus(eContext);
    }

    public static EFloat Invert(EFloat eFloat, EContext eContext) {
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return InvalidOperation(eContext);
        }
        EInteger eIntegerSubtract = EInteger.FromInt32(1).ShiftLeft(eContext.getPrecision()).Subtract(1);
        byte[] bArrFromLogical = EDecimals.FromLogical(eFloat, eContext, 2);
        if (bArrFromLogical == null) {
            return InvalidOperation(eContext);
        }
        byte[] bArrToBytes = eIntegerSubtract.ToBytes(true);
        for (int i2 = 0; i2 < bArrFromLogical.length; i2++) {
            bArrToBytes[i2] = (byte) (bArrToBytes[i2] ^ bArrFromLogical[i2]);
        }
        return EFloat.FromEInteger(EDecimals.ToLogical(bArrToBytes, 2)).RoundToPrecision(eContext);
    }

    public static boolean IsCanonical(EFloat eFloat) {
        return true;
    }

    public static boolean IsFinite(EFloat eFloat) {
        return eFloat != null && eFloat.isFinite();
    }

    public static boolean IsInfinite(EFloat eFloat) {
        return eFloat != null && eFloat.IsInfinity();
    }

    public static boolean IsNaN(EFloat eFloat) {
        return eFloat != null && eFloat.IsNaN();
    }

    public static boolean IsNormal(EFloat eFloat, EContext eContext) {
        return (eFloat == null || !eFloat.isFinite() || eFloat.isZero() || IsSubnormal(eFloat, eContext)) ? false : true;
    }

    public static boolean IsQuietNaN(EFloat eFloat) {
        return eFloat != null && eFloat.IsQuietNaN();
    }

    public static boolean IsSignalingNaN(EFloat eFloat) {
        return eFloat != null && eFloat.IsSignalingNaN();
    }

    public static boolean IsSigned(EFloat eFloat) {
        return eFloat != null && eFloat.isNegative();
    }

    public static boolean IsSubnormal(EFloat eFloat, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("ed");
        }
        if (!eFloat.isFinite() || eContext == null || eFloat.isZero() || !eContext.getHasExponentRange()) {
            return false;
        }
        return eContext.getAdjustExponent() ? eFloat.getExponent().Add(eFloat.Precision().Subtract(1)).compareTo(eContext.getEMin()) < 0 : eFloat.getExponent().compareTo(eContext.getEMin()) < 0;
    }

    public static boolean IsZero(EFloat eFloat) {
        return eFloat != null && eFloat.isZero();
    }

    public static EFloat LogB(EFloat eFloat, EContext eContext) {
        if (eFloat != null) {
            return eFloat.IsNaN() ? eFloat.RoundToPrecision(eContext) : eFloat.IsInfinity() ? EFloat.PositiveInfinity : eFloat.isZero() ? EFloat.FromInt32(-1).Divide(EFloat.Zero, eContext) : EFloat.FromEInteger(eFloat.getExponent().Add(eFloat.Precision().Subtract(1))).RoundToPrecision(eContext);
        }
        throw new NullPointerException("ed");
    }

    public static int NumberClass(EFloat eFloat, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("ed");
        }
        if (eFloat.IsQuietNaN()) {
            return 8;
        }
        if (eFloat.IsNaN()) {
            return 9;
        }
        return eFloat.IsInfinity() ? eFloat.isNegative() ? 7 : 6 : eFloat.isZero() ? eFloat.isNegative() ? 5 : 4 : IsSubnormal(eFloat, eContext) ? eFloat.isNegative() ? 3 : 2 : eFloat.isNegative() ? 1 : 0;
    }

    public static String NumberClassString(int i2) {
        return EDecimals.NumberClassString(i2);
    }

    public static EFloat Or(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        byte[] bArrFromLogical;
        byte[] bArrFromLogical2 = EDecimals.FromLogical(eFloat, eContext, 2);
        if (bArrFromLogical2 != null && (bArrFromLogical = EDecimals.FromLogical(eFloat2, eContext, 2)) != null) {
            byte[] bArr = bArrFromLogical2.length < bArrFromLogical.length ? bArrFromLogical2 : bArrFromLogical;
            if (bArrFromLogical2.length < bArrFromLogical.length) {
                bArrFromLogical2 = bArrFromLogical;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArrFromLogical2[i2] = (byte) ((-1) - (((-1) - bArrFromLogical2[i2]) & ((-1) - bArr[i2])));
            }
            return EFloat.FromEInteger(EDecimals.ToLogical(bArrFromLogical2, 2)).RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }

    public static EFloat Radix(EContext eContext) {
        return EFloat.FromInt32(2).RoundToPrecision(eContext);
    }

    public static EFloat Rescale(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null || eFloat2 == null) {
            return InvalidOperation(eContext);
        }
        if (!eFloat2.isFinite()) {
            return eFloat.Quantize(eFloat2, eContext);
        }
        if (eFloat2.getExponent().isZero()) {
            return eFloat.Quantize(EFloat.Create(EInteger.FromInt32(1), eFloat2.getMantissa()), eContext);
        }
        EContext eContextWithBlankFlags = eContext == null ? null : eContext.WithTraps(0).WithBlankFlags();
        if (eFloat2.RoundToExponentExact(0, eContextWithBlankFlags).isFinite() && (eContextWithBlankFlags.getFlags() & 1) == 0) {
            return eFloat.Quantize(EFloat.Create(EInteger.FromInt32(1), eFloat2.Quantize(0, eContextWithBlankFlags).getMantissa()), eContext);
        }
        if (eContext != null && eContext.isSimplified()) {
            eFloat2.RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }

    public static EFloat Rotate(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return Shift(eFloat, eFloat2, eContext);
        }
        if (eFloat2 == null) {
            throw new NullPointerException("ed2");
        }
        if (eFloat == null) {
            throw new NullPointerException("ed");
        }
        if (eFloat.IsNaN() || eFloat2.IsNaN()) {
            return eFloat.Add(eFloat2, eContext);
        }
        if (!eFloat2.isFinite() || eFloat2.getExponent().signum() != 0) {
            return InvalidOperation(eContext);
        }
        EInteger mantissa = eFloat2.getMantissa();
        if (mantissa.Abs().compareTo(eContext.getPrecision()) > 0) {
            return InvalidOperation(eContext);
        }
        if (eFloat.IsInfinity()) {
            return eFloat;
        }
        EInteger unsignedMantissa = eFloat.getUnsignedMantissa();
        EInteger eIntegerPrecision = eFloat.Precision();
        if (eContext != null && eContext.getHasMaxPrecision() && eIntegerPrecision.compareTo(eContext.getPrecision()) > 0) {
            unsignedMantissa = unsignedMantissa.Remainder(EInteger.FromInt32(1).ShiftLeft(eContext.getPrecision()));
            eIntegerPrecision = eContext.getPrecision();
        }
        if (unsignedMantissa.isZero()) {
            return eFloat.RoundToPrecision(eContext);
        }
        EInteger eIntegerAbs = mantissa.signum() < 0 ? mantissa.Abs() : eContext.getPrecision().Subtract(mantissa);
        EInteger eIntegerSubtract = eContext.getPrecision().Subtract(eIntegerAbs);
        EInteger.FromInt32(0);
        EInteger.FromInt32(0);
        EInteger eIntegerDivide = eIntegerAbs.compareTo(eIntegerPrecision) < 0 ? unsignedMantissa.Divide(EInteger.FromInt32(1).ShiftLeft(eIntegerAbs)) : EInteger.FromInt32(0);
        if (!eIntegerSubtract.isZero()) {
            unsignedMantissa = eIntegerSubtract.compareTo(eContext.getPrecision()) == 0 ? EInteger.FromInt32(0) : unsignedMantissa.Multiply(EInteger.FromInt32(1).ShiftLeft(eIntegerSubtract)).Remainder(EInteger.FromInt32(1).ShiftLeft(eContext.getPrecision()));
        }
        EFloat eFloatCreate = EFloat.Create(eIntegerDivide.Add(unsignedMantissa), eFloat.getExponent());
        return eFloat.isNegative() ? eFloatCreate.Negate() : eFloatCreate;
    }

    public static boolean SameQuantum(EFloat eFloat, EFloat eFloat2) {
        if (eFloat == null || eFloat2 == null) {
            return false;
        }
        return (eFloat.isFinite() && eFloat2.isFinite()) ? eFloat.getExponent().equals(eFloat2.getExponent()) : (eFloat.IsNaN() && eFloat2.IsNaN()) || (eFloat.IsInfinity() && eFloat2.IsInfinity());
    }

    public static EFloat ScaleB(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("ed");
        }
        if (eFloat2 == null) {
            throw new NullPointerException("ed2");
        }
        if (eFloat.IsNaN() || eFloat2.IsNaN()) {
            return eFloat.Add(eFloat2, eContext);
        }
        if (!eFloat2.isFinite() || eFloat2.getExponent().signum() != 0) {
            return InvalidOperation(eContext);
        }
        EInteger mantissa = eFloat2.getMantissa();
        if (eContext != null && eContext.getHasMaxPrecision() && eContext.getHasExponentRange()) {
            if (mantissa.Abs().compareTo(eContext.getEMax().Add(eContext.getPrecision()).Multiply(2).Abs()) > 0) {
                return InvalidOperation(eContext);
            }
        }
        if (eFloat.IsInfinity()) {
            return eFloat;
        }
        if (mantissa.isZero()) {
            return eFloat.RoundToPrecision(eContext);
        }
        EFloat eFloatCreate = EFloat.Create(eFloat.getUnsignedMantissa(), eFloat.getExponent().Add(mantissa));
        if (eFloat.isNegative()) {
            eFloatCreate = eFloatCreate.Negate();
        }
        return eFloatCreate.RoundToPrecision(eContext);
    }

    public static EFloat Shift(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("ed");
        }
        if (eFloat2 == null) {
            throw new NullPointerException("ed2");
        }
        if (eFloat.IsNaN() || eFloat2.IsNaN()) {
            return eFloat.Add(eFloat2, eContext);
        }
        if (!eFloat2.isFinite() || eFloat2.getExponent().signum() != 0) {
            return InvalidOperation(eContext);
        }
        EInteger mantissa = eFloat2.getMantissa();
        if (eContext != null && mantissa.Abs().compareTo(eContext.getPrecision()) > 0) {
            return InvalidOperation(eContext);
        }
        if (eFloat.IsInfinity()) {
            return eFloat;
        }
        EInteger unsignedMantissa = eFloat.getUnsignedMantissa();
        if (unsignedMantissa.isZero()) {
            return eFloat.RoundToPrecision(eContext);
        }
        EInteger eIntegerPrecision = eFloat.Precision();
        if (mantissa.signum() < 0) {
            EFloat eFloatCreate = EFloat.Create(mantissa.Abs().compareTo(eIntegerPrecision) < 0 ? unsignedMantissa.Divide(EInteger.FromInt32(1).ShiftLeft(mantissa.Abs())) : EInteger.FromInt32(0), eFloat.getExponent());
            return eFloat.isNegative() ? eFloatCreate.Negate() : eFloatCreate;
        }
        EInteger eIntegerMultiply = unsignedMantissa.Multiply(EInteger.FromInt32(1).ShiftLeft(mantissa));
        if (eContext != null && eContext.getHasMaxPrecision()) {
            eIntegerMultiply = eIntegerMultiply.Remainder(EInteger.FromInt32(1).ShiftLeft(eContext.getPrecision()));
        }
        EFloat eFloatCreate2 = EFloat.Create(eIntegerMultiply, eFloat.getExponent());
        return eFloat.isNegative() ? eFloatCreate2.Negate() : eFloatCreate2;
    }

    public static EFloat Trim(EFloat eFloat, EContext eContext) {
        if (eFloat == null) {
            return InvalidOperation(eContext);
        }
        if (eFloat.IsSignalingNaN()) {
            return EFloat.CreateNaN(eFloat.getUnsignedMantissa(), true, eFloat.isNegative(), eContext);
        }
        if (!eFloat.isFinite()) {
            return eFloat.Plus(eContext);
        }
        if (eFloat.isZero()) {
            return (eFloat.isNegative() ? EFloat.NegativeZero : EFloat.Zero).RoundToPrecision(eContext);
        }
        if (eFloat.getExponent().signum() > 0) {
            return eFloat.Reduce(eContext);
        }
        if (eFloat.getExponent().signum() == 0) {
            return eFloat.RoundToPrecision(eContext);
        }
        EInteger exponent = eFloat.getExponent();
        EInteger unsignedMantissa = eFloat.getUnsignedMantissa();
        boolean zIsNegative = eFloat.isNegative();
        EInteger eIntegerFromInt32 = EInteger.FromInt32(2);
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
            return eFloat.RoundToPrecision(eContext);
        }
        EFloat eFloatCreate = EFloat.Create(unsignedMantissa, exponent);
        if (zIsNegative) {
            eFloatCreate = eFloatCreate.Negate();
        }
        return eFloatCreate.RoundToPrecision(eContext);
    }

    public static EFloat Xor(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        byte[] bArrFromLogical;
        byte[] bArrFromLogical2 = EDecimals.FromLogical(eFloat, eContext, 2);
        if (bArrFromLogical2 != null && (bArrFromLogical = EDecimals.FromLogical(eFloat2, eContext, 2)) != null) {
            byte[] bArr = bArrFromLogical2.length < bArrFromLogical.length ? bArrFromLogical2 : bArrFromLogical;
            if (bArrFromLogical2.length < bArrFromLogical.length) {
                bArrFromLogical2 = bArrFromLogical;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArrFromLogical2[i2] = (byte) (bArrFromLogical2[i2] ^ bArr[i2]);
            }
            return EFloat.FromEInteger(EDecimals.ToLogical(bArrFromLogical2, 2)).RoundToPrecision(eContext);
        }
        return InvalidOperation(eContext);
    }
}

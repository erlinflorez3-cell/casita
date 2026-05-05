package com.upokecenter.numbers;

import androidx.core.app.NotificationManagerCompat;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.Global;
import com.google.common.base.Ascii;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
public final class EDecimal implements Comparable<EDecimal> {
    private static final int CacheLast = 128;
    private static final IRadixMath<EDecimal> ExtendedMathValue;
    private static final DecimalMathHelper HelperValue;
    private static final IRadixMath<EDecimal> MathValue;
    static final int MaxSafeInt = 214748363;
    private static final int RepeatDivideThreshold = 10000;
    private static final int[] ValueTenPowers;
    private final FastIntegerFixed exponent;
    private final byte flags;
    private final FastIntegerFixed unsignedMantissa;
    public static final EDecimal NaN = CreateWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 4);
    public static final EDecimal NegativeInfinity = CreateWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 3);
    public static final EDecimal NegativeZero = CreateWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 1);
    public static final EDecimal One = new EDecimal(FastIntegerFixed.FromInt32(1), FastIntegerFixed.Zero, (byte) 0);
    public static final EDecimal PositiveInfinity = CreateWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 2);
    public static final EDecimal SignalingNaN = CreateWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 8);
    public static final EDecimal Ten = new EDecimal(FastIntegerFixed.FromInt32(10), FastIntegerFixed.Zero, (byte) 0);
    public static final EDecimal Zero = new EDecimal(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 0);
    private static final int CacheFirst = -24;
    private static final EDecimal[] Cache = EDecimalCache(CacheFirst, 128);

    private static final class DecimalMathHelper implements IRadixMathHelper<EDecimal> {
        private DecimalMathHelper() {
        }

        /* synthetic */ DecimalMathHelper(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EDecimal CreateNewWithFlags(EInteger eInteger, EInteger eInteger2, int i2) {
            return EDecimal.CreateWithFlags(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.FromBig(eInteger2), i2);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EDecimal CreateNewWithFlagsFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, int i2) {
            return EDecimal.CreateWithFlags(fastIntegerFixed, fastIntegerFixed2, i2);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public IShiftAccumulator CreateShiftAccumulatorWithDigits(EInteger eInteger, int i2, int i3) {
            return new DigitShiftAccumulator(eInteger, i2, i3);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public IShiftAccumulator CreateShiftAccumulatorWithDigitsFastInt(FastIntegerFixed fastIntegerFixed, int i2, int i3) {
            return fastIntegerFixed.CanFitInInt32() ? new DigitShiftAccumulator(fastIntegerFixed.ToInt32(), i2, i3) : new DigitShiftAccumulator(fastIntegerFixed.ToEInteger(), i2, i3);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastInteger DivisionShift(EInteger eInteger, EInteger eInteger2) {
            if (eInteger2.isZero() || eInteger2.Gcd(EInteger.FromInt32(10)).compareTo(EInteger.FromInt32(1)) == 0 || eInteger2.isZero()) {
                return null;
            }
            EInteger eIntegerGetLowBitAsEInteger = eInteger2.GetLowBitAsEInteger();
            EInteger eIntegerShiftRight = eInteger2.ShiftRight(eIntegerGetLowBitAsEInteger);
            FastInteger fastInteger = new FastInteger(0);
            while (true) {
                EInteger[] eIntegerArrDivRem = eIntegerShiftRight.DivRem(EInteger.FromInt64(5L));
                EInteger eInteger3 = eIntegerArrDivRem[0];
                if (!eIntegerArrDivRem[1].isZero()) {
                    break;
                }
                fastInteger.Increment();
                eIntegerShiftRight = eInteger3;
            }
            if (eIntegerShiftRight.compareTo(EInteger.FromInt32(1)) != 0) {
                return null;
            }
            FastInteger fastIntegerFromBig = FastInteger.FromBig(eIntegerGetLowBitAsEInteger);
            return fastInteger.compareTo(fastIntegerFromBig) > 0 ? fastInteger : fastIntegerFromBig;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetArithmeticSupport() {
            return 1;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastInteger GetDigitLength(EInteger eInteger) {
            long jGetDigitCountAsInt64 = eInteger.GetDigitCountAsInt64();
            return jGetDigitCountAsInt64 != Long.MAX_VALUE ? FastInteger.FromInt64(jGetDigitCountAsInt64) : FastInteger.FromBig(eInteger.GetDigitCountAsEInteger());
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EInteger GetExponent(EDecimal eDecimal) {
            return eDecimal.exponent.ToEInteger();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastIntegerFixed GetExponentFastInt(EDecimal eDecimal) {
            return eDecimal.exponent;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetFlags(EDecimal eDecimal) {
            return eDecimal.flags & 255;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EInteger GetMantissa(EDecimal eDecimal) {
            return eDecimal.unsignedMantissa.ToEInteger();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastIntegerFixed GetMantissaFastInt(EDecimal eDecimal) {
            return eDecimal.unsignedMantissa;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetRadix() {
            return 10;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetSign(EDecimal eDecimal) {
            return eDecimal.signum();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EInteger MultiplyByRadixPower(EInteger eInteger, FastInteger fastInteger) {
            if (eInteger.isZero()) {
                return eInteger;
            }
            boolean zCanFitInInt32 = fastInteger.CanFitInInt32();
            int iToInt32 = zCanFitInInt32 ? fastInteger.ToInt32() : 0;
            return (zCanFitInInt32 && iToInt32 == 0) ? eInteger : eInteger.compareTo(1) != 0 ? zCanFitInInt32 ? NumberUtility.MultiplyByPowerOfTen(eInteger, iToInt32) : NumberUtility.MultiplyByPowerOfTen(eInteger, fastInteger.ToEInteger()) : zCanFitInInt32 ? NumberUtility.FindPowerOfTen(iToInt32) : NumberUtility.FindPowerOfTenFromBig(fastInteger.ToEInteger());
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastIntegerFixed MultiplyByRadixPowerFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2) {
            if (fastIntegerFixed.isValueZero()) {
                return fastIntegerFixed;
            }
            boolean zCanFitInInt32 = fastIntegerFixed2.CanFitInInt32();
            int iToInt32 = zCanFitInInt32 ? fastIntegerFixed2.ToInt32() : 0;
            if (zCanFitInInt32 && iToInt32 == 0) {
                return fastIntegerFixed;
            }
            EInteger eIntegerToEInteger = fastIntegerFixed.ToEInteger();
            return FastIntegerFixed.FromBig(eIntegerToEInteger.compareTo(1) != 0 ? zCanFitInInt32 ? NumberUtility.MultiplyByPowerOfTen(eIntegerToEInteger, iToInt32) : NumberUtility.MultiplyByPowerOfTen(eIntegerToEInteger, fastIntegerFixed2.ToEInteger()) : zCanFitInInt32 ? NumberUtility.FindPowerOfTen(iToInt32) : NumberUtility.FindPowerOfTenFromBig(fastIntegerFixed2.ToEInteger()));
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EDecimal ValueOf(int i2) {
            return i2 == 0 ? EDecimal.Zero : i2 == 1 ? EDecimal.One : EDecimal.FromInt64(i2);
        }
    }

    static {
        DecimalMathHelper decimalMathHelper = new DecimalMathHelper();
        HelperValue = decimalMathHelper;
        ExtendedMathValue = new RadixMath(decimalMathHelper);
        MathValue = new TrappableRadixMath(new ExtendedOrSimpleRadixMath(decimalMathHelper));
        ValueTenPowers = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    }

    EDecimal(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, byte b2) {
        this.unsignedMantissa = fastIntegerFixed;
        this.exponent = fastIntegerFixed2;
        this.flags = b2;
    }

    private static boolean AppendString(StringBuilder sb, char c2, FastInteger fastInteger) {
        if (fastInteger.CompareToInt(Integer.MAX_VALUE) > 0 || fastInteger.signum() < 0) {
            throw new UnsupportedOperationException();
        }
        int iToInt32 = fastInteger.ToInt32();
        int i2 = 0;
        if (iToInt32 <= 10000) {
            while (i2 < iToInt32) {
                sb.append(c2);
                i2++;
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(10000);
        for (int i3 = 0; i3 < 10000; i3++) {
            sb.append(c2);
        }
        String string = sb2.toString();
        int i4 = iToInt32 / 10000;
        int i5 = iToInt32 % 10000;
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(string);
        }
        while (i2 < i5) {
            sb.append(c2);
            i2++;
        }
        return true;
    }

    static EDecimal ChangeExponent(EDecimal eDecimal, EInteger eInteger) {
        return new EDecimal(eDecimal.unsignedMantissa, FastIntegerFixed.FromBig(eInteger), eDecimal.flags);
    }

    static int CheckOverflowUnderflow(EContext eContext, int i2, EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("exponent");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("doesn't satisfy precision.signum()>= 0");
        }
        if (eContext != null && eContext.getHasExponentRange()) {
            if (eContext.getAdjustExponent()) {
                if (!eContext.isPrecisionInBits()) {
                    EInteger eIntegerSubtract = eInteger.Add(i2).Subtract(1);
                    if (eIntegerSubtract.compareTo(eContext.getEMax()) > 0) {
                        return 1;
                    }
                    if (eContext.getHasMaxPrecision()) {
                        if (eIntegerSubtract.compareTo(eContext.getEMin().Subtract(eContext.getPrecision().Subtract(1)).Subtract(1)) < 0) {
                            return 2;
                        }
                    } else if (eIntegerSubtract.compareTo(eContext.getEMin().Subtract(i2 - 1).Subtract(1)) < 0) {
                        return 3;
                    }
                } else if (eInteger.compareTo(eContext.getEMax()) > 0) {
                    return 1;
                }
            } else {
                if (eInteger.compareTo(eContext.getEMax()) > 0) {
                    return 1;
                }
                if (!eContext.isPrecisionInBits()) {
                    if (eInteger.Add(i2).Subtract(1).compareTo((eContext.getHasMaxPrecision() ? eContext.getEMin().Subtract(eContext.getPrecision().Subtract(1)) : eContext.getEMin().Subtract(i2 - 1)).Subtract(1)) < 0) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    private void CheckTrivialOverflow(int i2) {
        if (isZero()) {
            return;
        }
        if (this.exponent.signum() >= 0) {
            if (this.exponent.CompareToInt(i2) >= 0) {
                throw new ArithmeticException("Value out of range");
            }
            return;
        }
        EInteger exponent = getExponent();
        EInteger unsignedMantissa = getUnsignedMantissa();
        if (NumberUtility.DecimalDigitLengthBoundsAsEI(unsignedMantissa.Abs())[0].Subtract(exponent.Abs()).compareTo(i2) > 0) {
            throw new ArithmeticException("Value out of range");
        }
    }

    private static int CompareEDecimalToEFloat(EDecimal eDecimal, EFloat eFloat) {
        if (eFloat == null) {
            return 1;
        }
        if (eDecimal.IsNaN()) {
            return !eFloat.IsNaN() ? 1 : 0;
        }
        int iSignum = eDecimal.signum();
        int iSignum2 = eFloat.signum();
        if (iSignum != iSignum2) {
            return iSignum < iSignum2 ? -1 : 1;
        }
        if (iSignum2 == 0 || iSignum == 0) {
            return 0;
        }
        if (eDecimal.IsInfinity()) {
            if (eFloat.IsInfinity()) {
                return 0;
            }
            return eDecimal.isNegative() ? -1 : 1;
        }
        if (eFloat.IsInfinity()) {
            return eFloat.isNegative() ? 1 : -1;
        }
        if (eFloat.getExponent().compareTo(EInteger.FromInt64(-1000L)) < 0) {
            if (eFloat.Abs(null).compareTo(EFloat.One) < 0 && eDecimal.Abs(null).compareTo(One) >= 0) {
                return iSignum > 0 ? 1 : -1;
            }
            if (eFloat.getExponent().Abs().compareTo(eFloat.getMantissa().GetUnsignedBitLengthAsEInteger()) > 0) {
                int iCompareEDecimalToEFloat = CompareEDecimalToEFloat(eDecimal, EFloat.Create(eFloat.getMantissa(), EInteger.FromInt32(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED)));
                if (eFloat.signum() < 0 && iCompareEDecimalToEFloat < 0) {
                    return -1;
                }
                if (eFloat.signum() > 0 && iCompareEDecimalToEFloat > 0) {
                    return 1;
                }
            }
            EInteger[] eIntegerArrGetAdjustedExponentDecimalBounds = GetAdjustedExponentDecimalBounds(eDecimal);
            EInteger eIntegerGetAdjustedExponentBinary = GetAdjustedExponentBinary(eFloat);
            if (eIntegerArrGetAdjustedExponentDecimalBounds[0].signum() < 0 && eIntegerArrGetAdjustedExponentDecimalBounds[0].compareTo(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED) >= 0 && eIntegerGetAdjustedExponentBinary.compareTo(-4000) < 0) {
                return iSignum > 0 ? 1 : -1;
            }
            if (eIntegerArrGetAdjustedExponentDecimalBounds[1].signum() < 0 && eIntegerArrGetAdjustedExponentDecimalBounds[1].compareTo(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED) < 0 && eIntegerGetAdjustedExponentBinary.compareTo(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED) < 0) {
                EInteger eIntegerAbs = eIntegerArrGetAdjustedExponentDecimalBounds[0].Add(1).Abs();
                EInteger eIntegerAbs2 = eIntegerArrGetAdjustedExponentDecimalBounds[1].Add(1).Abs();
                EInteger eIntegerAbs3 = eIntegerGetAdjustedExponentBinary.Add(1).Abs();
                if (eIntegerAbs3.Multiply(1000).Divide(EInteger.Min(eIntegerAbs, eIntegerAbs2)).compareTo(3321) < 0) {
                    return iSignum > 0 ? -1 : 1;
                }
                if (eIntegerAbs3.Multiply(1000).Divide(EInteger.Max(eIntegerAbs, eIntegerAbs2)).compareTo(3322) > 0) {
                    return iSignum > 0 ? 1 : -1;
                }
            }
        }
        if (eFloat.getExponent().compareTo(1000) > 0) {
            if (eDecimal.Abs(null).CompareToValue(FromEInteger(EInteger.FromInt32(1).ShiftLeft(999))) <= 0) {
                return iSignum > 0 ? -1 : 1;
            }
            EInteger[] eIntegerArrGetAdjustedExponentDecimalBounds2 = GetAdjustedExponentDecimalBounds(eDecimal);
            EInteger eIntegerGetAdjustedExponentBinary2 = GetAdjustedExponentBinary(eFloat);
            if (eIntegerArrGetAdjustedExponentDecimalBounds2[0].signum() > 0 && eIntegerArrGetAdjustedExponentDecimalBounds2[0].compareTo(eIntegerGetAdjustedExponentBinary2) >= 0) {
                return iSignum > 0 ? 1 : -1;
            }
            if (eIntegerArrGetAdjustedExponentDecimalBounds2[1].signum() > 0 && eIntegerArrGetAdjustedExponentDecimalBounds2[1].compareTo(1000) < 0 && eIntegerGetAdjustedExponentBinary2.compareTo(4000) >= 0) {
                return iSignum > 0 ? -1 : 1;
            }
            if (eIntegerArrGetAdjustedExponentDecimalBounds2[0].signum() > 0 && eIntegerArrGetAdjustedExponentDecimalBounds2[0].compareTo(1000) >= 0 && eIntegerGetAdjustedExponentBinary2.compareTo(1000) >= 0) {
                EInteger eIntegerAdd = eIntegerArrGetAdjustedExponentDecimalBounds2[0].Add(1);
                EInteger eIntegerAdd2 = eIntegerArrGetAdjustedExponentDecimalBounds2[1].Add(1);
                EInteger eIntegerAdd3 = eIntegerGetAdjustedExponentBinary2.Add(1);
                if (eIntegerAdd3.Multiply(1000).Divide(EInteger.Min(eIntegerAdd, eIntegerAdd2)).compareTo(3321) < 0) {
                    return iSignum > 0 ? 1 : -1;
                }
                if (eIntegerAdd3.Multiply(1000).Divide(EInteger.Max(eIntegerAdd, eIntegerAdd2)).compareTo(3322) >= 0) {
                    return iSignum > 0 ? -1 : 1;
                }
            }
        }
        return eDecimal.compareTo(FromEFloat(eFloat));
    }

    public static EDecimal Create(int i2, int i3) {
        return (i3 != 0 || i2 < CacheFirst || i2 > 128) ? i2 < 0 ? i2 == Integer.MIN_VALUE ? new EDecimal(FastIntegerFixed.FromInt64(-2147483648L).Negate(), FastIntegerFixed.FromInt32(i3), (byte) 1) : new EDecimal(FastIntegerFixed.FromInt32(-i2), FastIntegerFixed.FromInt32(i3), (byte) 1) : i2 == 0 ? new EDecimal(FastIntegerFixed.Zero, FastIntegerFixed.FromInt32(i3), (byte) 0) : new EDecimal(FastIntegerFixed.FromInt32(i2), FastIntegerFixed.FromInt32(i3), (byte) 0) : Cache[i2 - CacheFirst];
    }

    public static EDecimal Create(long j2, int i2) {
        return Create(j2, i2);
    }

    public static EDecimal Create(long j2, long j3) {
        if (j2 >= -2147483648L && j2 <= 2147483647L && j3 >= -2147483648L && j3 <= 2147483647L) {
            return Create((int) j2, (int) j3);
        }
        if (j2 == Long.MIN_VALUE) {
            return new EDecimal(FastIntegerFixed.FromInt64(j2).Negate(), FastIntegerFixed.FromInt64(j3), (byte) (j2 >= 0 ? 0 : 1));
        }
        return new EDecimal(FastIntegerFixed.FromInt64(Math.abs(j2)), FastIntegerFixed.FromInt64(j3), (byte) (j2 >= 0 ? 0 : 1));
    }

    public static EDecimal Create(EInteger eInteger, int i2) {
        if (eInteger == null) {
            throw new NullPointerException("mantissa");
        }
        if (eInteger.CanFitInInt32()) {
            return Create(eInteger.ToInt32Checked(), i2);
        }
        FastIntegerFixed fastIntegerFixedFromBig = FastIntegerFixed.FromBig(eInteger);
        int iSignum = fastIntegerFixedFromBig.signum();
        if (iSignum < 0) {
            fastIntegerFixedFromBig = fastIntegerFixedFromBig.Negate();
        }
        return new EDecimal(fastIntegerFixedFromBig, FastIntegerFixed.FromInt32(i2), (byte) (iSignum < 0 ? 1 : 0));
    }

    public static EDecimal Create(EInteger eInteger, long j2) {
        if (eInteger == null) {
            throw new NullPointerException("mantissa");
        }
        if (eInteger.CanFitInInt64()) {
            return Create(eInteger.ToInt64Checked(), j2);
        }
        FastIntegerFixed fastIntegerFixedFromBig = FastIntegerFixed.FromBig(eInteger);
        int iSignum = fastIntegerFixedFromBig.signum();
        if (iSignum < 0) {
            fastIntegerFixedFromBig = fastIntegerFixedFromBig.Negate();
        }
        return new EDecimal(fastIntegerFixedFromBig, FastIntegerFixed.FromInt64(j2), (byte) (iSignum < 0 ? 1 : 0));
    }

    public static EDecimal Create(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("mantissa");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("exponent");
        }
        if (eInteger.CanFitInInt32() && eInteger2.isZero()) {
            return Create(eInteger.ToInt32Checked(), 0);
        }
        FastIntegerFixed fastIntegerFixedFromBig = FastIntegerFixed.FromBig(eInteger);
        int iSignum = fastIntegerFixedFromBig.signum();
        if (iSignum < 0) {
            fastIntegerFixedFromBig = fastIntegerFixedFromBig.Negate();
        }
        return new EDecimal(fastIntegerFixedFromBig, FastIntegerFixed.FromBig(eInteger2), (byte) (iSignum < 0 ? 1 : 0));
    }

    public static EDecimal CreateNaN(EInteger eInteger) {
        return CreateNaN(eInteger, false, false, null);
    }

    public static EDecimal CreateNaN(EInteger eInteger, boolean z2, boolean z3, EContext eContext) {
        if (eInteger == null) {
            throw new NullPointerException("diag");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("Diagnostic information must be 0 or greater,  was: " + eInteger);
        }
        if (eInteger.isZero() && !z3) {
            return z2 ? SignalingNaN : NaN;
        }
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            int i2 = z2 ? 8 : 4;
            return new EDecimal(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.Zero, (byte) (((z3 ? 1 : 0) + i2) - ((z3 ? 1 : 0) & i2)));
        }
        EDecimal eDecimalRoundToPrecision = new EDecimal(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.Zero, (byte) (((z3 ? 1 : 0) + 4) - ((z3 ? 1 : 0) & 4))).RoundToPrecision(eContext);
        return new EDecimal(eDecimalRoundToPrecision.unsignedMantissa, eDecimalRoundToPrecision.exponent, (byte) ((-1) - (((-1) - (eDecimalRoundToPrecision.flags & (-5))) & ((-1) - (z2 ? 8 : 4)))));
    }

    static EDecimal CreateWithFlags(EInteger eInteger, EInteger eInteger2, int i2) {
        if (eInteger == null) {
            throw new NullPointerException("mantissa");
        }
        if (eInteger2 != null) {
            return new EDecimal(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.FromBig(eInteger2), (byte) i2);
        }
        throw new NullPointerException("exponent");
    }

    static EDecimal CreateWithFlags(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, int i2) {
        if (fastIntegerFixed == null) {
            throw new NullPointerException("mantissa");
        }
        if (fastIntegerFixed2 != null) {
            return new EDecimal(fastIntegerFixed, fastIntegerFixed2, (byte) i2);
        }
        throw new NullPointerException("exponent");
    }

    private static EDecimal[] EDecimalCache(int i2, int i3) {
        EDecimal[] eDecimalArr = new EDecimal[(i3 - i2) + 1];
        int i4 = i2;
        while (i4 <= i3) {
            if (i4 == 0) {
                eDecimalArr[i4 - i2] = Zero;
            } else if (i4 == 1) {
                eDecimalArr[i4 - i2] = One;
            } else if (i4 == 10) {
                eDecimalArr[i4 - i2] = Ten;
            } else {
                eDecimalArr[i4 - i2] = new EDecimal(FastIntegerFixed.FromInt32(Math.abs(i4)), FastIntegerFixed.Zero, (byte) (i4 < 0 ? 1 : 0));
            }
            i4++;
        }
        return eDecimalArr;
    }

    private boolean EqualsInternal(EDecimal eDecimal) {
        return eDecimal != null && this.flags == eDecimal.flags && this.unsignedMantissa.equals(eDecimal.unsignedMantissa) && this.exponent.equals(eDecimal.exponent);
    }

    public static EDecimal FromBoolean(boolean z2) {
        return z2 ? One : Zero;
    }

    public static EDecimal FromByte(byte b2) {
        return FromInt32(b2 & 255);
    }

    static EDecimal FromCache(int i2) {
        return Cache[i2 + 24];
    }

    public static EDecimal FromDouble(double d2) {
        return FromDoubleBits(Double.doubleToRawLongBits(d2));
    }

    public static EDecimal FromDoubleBits(long j2) {
        int i2 = (int) ((j2 + 4294967295L) - (j2 | 4294967295L));
        int i3 = (int) ((j2 >> 32) & 4294967295L);
        int[] iArr = {i2, i3};
        int i4 = i3 >> 20;
        int i5 = (i4 + 2047) - (i4 | 2047);
        int i6 = (i3 >> 31) != 0 ? 1 : 0;
        if (i5 == 2047) {
            if ((-1) - (((-1) - i3) | ((-1) - 1048575)) == 0 && i2 == 0) {
                return i6 != 0 ? NegativeInfinity : PositiveInfinity;
            }
            boolean z2 = (-1) - (((-1) - 524288) | ((-1) - i3)) != 0;
            int i7 = i3 & 524287;
            iArr[1] = i7;
            long j3 = ((long) i2) & 4294967295L;
            long j4 = ((long) i7) << 32;
            long j5 = (j4 + j3) - (j4 & j3);
            return (j5 == 0 && i6 == 0) ? z2 ? NaN : SignalingNaN : new EDecimal(FastIntegerFixed.FromInt64(j5), FastIntegerFixed.Zero, (byte) ((z2 ? 4 : 8) | i6));
        }
        int i8 = (i3 + 1048575) - (i3 | 1048575);
        iArr[1] = i8;
        if (i5 == 0) {
            i5++;
        } else {
            iArr[1] = (-1) - (((-1) - i8) & ((-1) - 1048576));
        }
        if ((-1) - (((-1) - iArr[1]) & ((-1) - i2)) == 0) {
            return i6 != 0 ? NegativeZero : Zero;
        }
        int iShiftAwayTrailingZerosTwoElements = (i5 + NumberUtility.ShiftAwayTrailingZerosTwoElements(iArr)) - 1075;
        long j6 = (((long) iArr[1]) << 32) | ((-1) - (((-1) - 4294967295L) | ((-1) - ((long) iArr[0]))));
        if (iShiftAwayTrailingZerosTwoElements == 0) {
            if (i6 != 0) {
                j6 = -j6;
            }
            return FromInt64(j6);
        }
        if (iShiftAwayTrailingZerosTwoElements > 0) {
            EInteger eIntegerShiftLeft = EInteger.FromInt64(j6).ShiftLeft(iShiftAwayTrailingZerosTwoElements);
            if (i6 != 0) {
                eIntegerShiftLeft = eIntegerShiftLeft.Negate();
            }
            return FromEInteger(eIntegerShiftLeft);
        }
        EInteger eIntegerMultiply = EInteger.FromInt64(j6).Multiply(NumberUtility.FindPowerOfFive(-iShiftAwayTrailingZerosTwoElements));
        if (i6 != 0) {
            eIntegerMultiply = eIntegerMultiply.Negate();
        }
        return Create(eIntegerMultiply, EInteger.FromInt32(iShiftAwayTrailingZerosTwoElements));
    }

    public static EDecimal FromEFloat(EFloat eFloat) {
        int i2;
        if (eFloat == null) {
            throw new NullPointerException("bigfloat");
        }
        if (eFloat.IsNaN() || eFloat.IsInfinity()) {
            int i3 = (-1) - (((-1) - ((-1) - (((-1) - (eFloat.isNegative() ? 1 : 0)) & ((-1) - (eFloat.IsInfinity() ? 2 : 0))))) & ((-1) - (eFloat.IsQuietNaN() ? 4 : 0)));
            i2 = eFloat.IsSignalingNaN() ? 8 : 0;
            return CreateWithFlags(eFloat.getUnsignedMantissa(), eFloat.getExponent(), (i3 + i2) - (i3 & i2));
        }
        EInteger exponent = eFloat.getExponent();
        EInteger mantissa = eFloat.getMantissa();
        if (mantissa.isZero()) {
            return eFloat.isNegative() ? NegativeZero : Zero;
        }
        if (exponent.isZero()) {
            return FromEInteger(mantissa);
        }
        if (exponent.signum() <= 0) {
            return Create(mantissa.Multiply(NumberUtility.FindPowerOfFiveFromBig(exponent.Negate())), exponent);
        }
        FastInteger fastIntegerFromBig = FastInteger.FromBig(exponent);
        i2 = mantissa.signum() < 0 ? 1 : 0;
        if (i2 != 0) {
            mantissa = mantissa.Negate();
        }
        while (fastIntegerFromBig.signum() > 0) {
            int iToInt32 = 1000000;
            if (fastIntegerFromBig.CompareToInt(1000000) < 0) {
                iToInt32 = fastIntegerFromBig.ToInt32();
            }
            mantissa = mantissa.ShiftLeft(iToInt32);
            fastIntegerFromBig.AddInt(-iToInt32);
        }
        if (i2 != 0) {
            mantissa = mantissa.Negate();
        }
        return FromEInteger(mantissa);
    }

    public static EDecimal FromEInteger(EInteger eInteger) {
        return Create(eInteger, EInteger.FromInt32(0));
    }

    @Deprecated
    public static EDecimal FromExtendedFloat(EFloat eFloat) {
        return FromEFloat(eFloat);
    }

    public static EDecimal FromInt16(short s2) {
        return FromInt32(s2);
    }

    public static EDecimal FromInt32(int i2) {
        return (i2 < CacheFirst || i2 > 128) ? i2 == Integer.MIN_VALUE ? Create(EInteger.FromInt32(i2), EInteger.FromInt32(0)) : i2 < 0 ? new EDecimal(FastIntegerFixed.FromInt32(i2).Negate(), FastIntegerFixed.Zero, (byte) 1) : new EDecimal(FastIntegerFixed.FromInt32(i2), FastIntegerFixed.Zero, (byte) 0) : Cache[i2 - CacheFirst];
    }

    public static EDecimal FromInt64(long j2) {
        return (j2 < -24 || j2 > 128) ? (j2 <= -2147483648L || j2 > 2147483647L) ? Create(EInteger.FromInt64(j2), EInteger.FromInt32(0)) : j2 < 0 ? new EDecimal(FastIntegerFixed.FromInt32((int) j2).Negate(), FastIntegerFixed.Zero, (byte) 1) : new EDecimal(FastIntegerFixed.FromInt32((int) j2), FastIntegerFixed.Zero, (byte) 0) : Cache[(int) (j2 - (-24))];
    }

    public static EDecimal FromInt64AsUnsigned(long j2) {
        return j2 >= 0 ? FromInt64(j2) : FromEInteger(EInteger.FromInt64AsUnsigned(j2));
    }

    public static EDecimal FromSingle(float f2) {
        return FromSingleBits(Float.floatToRawIntBits(f2));
    }

    public static EDecimal FromSingleBits(int i2) {
        int i3 = (i2 >> 31) != 0 ? 1 : 0;
        int i4 = i2 >> 23;
        int i5 = (i4 + 255) - (i4 | 255);
        int i6 = 8388607 & i2;
        if (i5 == 255) {
            if (i6 == 0) {
                return i3 != 0 ? NegativeInfinity : PositiveInfinity;
            }
            boolean z2 = (4194304 + i2) - (4194304 | i2) != 0;
            int i7 = (i2 + 4194303) - (i2 | 4194303);
            int i8 = z2 ? 4 : 8;
            return (i7 == 0 && i3 == 0) ? z2 ? NaN : SignalingNaN : new EDecimal(FastIntegerFixed.FromInt32(i7), FastIntegerFixed.Zero, (byte) ((i8 + i3) - (i8 & i3)));
        }
        if (i5 == 0) {
            i5++;
        } else {
            i6 = (i6 + 8388608) - (i6 & 8388608);
        }
        if (i6 == 0) {
            return i3 != 0 ? NegativeZero : Zero;
        }
        int i9 = i5 - 150;
        while ((-1) - (((-1) - i6) | ((-1) - 1)) == 0) {
            i9++;
            i6 >>= 1;
        }
        if (i9 == 0) {
            if (i3 != 0) {
                i6 = -i6;
            }
            return FromInt64(i6);
        }
        if (i9 > 0) {
            EInteger eIntegerShiftLeft = EInteger.FromInt32(i6).ShiftLeft(i9);
            if (i3 != 0) {
                eIntegerShiftLeft = eIntegerShiftLeft.Negate();
            }
            return FromEInteger(eIntegerShiftLeft);
        }
        EInteger eIntegerMultiply = EInteger.FromInt32(i6).Multiply(NumberUtility.FindPowerOfFive(-i9));
        if (i3 != 0) {
            eIntegerMultiply = eIntegerMultiply.Negate();
        }
        return Create(eIntegerMultiply, EInteger.FromInt32(i9));
    }

    public static EDecimal FromString(String str) {
        return FromString(str, 0, str == null ? 0 : str.length(), (EContext) null);
    }

    public static EDecimal FromString(String str, int i2, int i3) {
        return FromString(str, i2, i3, (EContext) null);
    }

    public static EDecimal FromString(String str, int i2, int i3, EContext eContext) {
        if (str != null) {
            return EDecimalTextString.FromString(str, i2, i3, eContext, true);
        }
        throw new NullPointerException("str");
    }

    public static EDecimal FromString(String str, EContext eContext) {
        return FromString(str, 0, str == null ? 0 : str.length(), eContext);
    }

    public static EDecimal FromString(byte[] bArr) {
        return FromString(bArr, 0, bArr == null ? 0 : bArr.length, (EContext) null);
    }

    public static EDecimal FromString(byte[] bArr, int i2, int i3) {
        return FromString(bArr, i2, i3, (EContext) null);
    }

    public static EDecimal FromString(byte[] bArr, int i2, int i3, EContext eContext) {
        if (bArr != null) {
            return EDecimalByteArrayString.FromString(bArr, i2, i3, eContext, true);
        }
        throw new NullPointerException("bytes");
    }

    public static EDecimal FromString(byte[] bArr, EContext eContext) {
        return FromString(bArr, 0, bArr == null ? 0 : bArr.length, eContext);
    }

    public static EDecimal FromString(char[] cArr) {
        return FromString(cArr, 0, cArr == null ? 0 : cArr.length, (EContext) null);
    }

    public static EDecimal FromString(char[] cArr, int i2, int i3) {
        return FromString(cArr, i2, i3, (EContext) null);
    }

    public static EDecimal FromString(char[] cArr, int i2, int i3, EContext eContext) {
        if (cArr != null) {
            return EDecimalCharArrayString.FromString(cArr, i2, i3, eContext, true);
        }
        throw new NullPointerException("chars");
    }

    public static EDecimal FromString(char[] cArr, EContext eContext) {
        return FromString(cArr, 0, cArr == null ? 0 : cArr.length, eContext);
    }

    private static EInteger GetAdjustedExponentBinary(EFloat eFloat) {
        if (eFloat.isFinite() && !eFloat.isZero()) {
            return eFloat.getExponent().Add(eFloat.getUnsignedMantissa().GetSignedBitLengthAsEInteger().Subtract(1));
        }
        return EInteger.FromInt32(0);
    }

    private static EInteger[] GetAdjustedExponentDecimalBounds(EDecimal eDecimal) {
        if (!eDecimal.isFinite()) {
            return new EInteger[]{EInteger.FromInt32(0), EInteger.FromInt32(0)};
        }
        if (eDecimal.isZero()) {
            return new EInteger[]{EInteger.FromInt32(0), EInteger.FromInt32(0)};
        }
        EInteger exponent = eDecimal.getExponent();
        EInteger[] eIntegerArrDecimalDigitLengthBoundsAsEI = NumberUtility.DecimalDigitLengthBoundsAsEI(eDecimal.getUnsignedMantissa());
        EInteger eIntegerAdd = exponent.Add(eIntegerArrDecimalDigitLengthBoundsAsEI[0].Subtract(1));
        EInteger eIntegerAdd2 = exponent.Add(eIntegerArrDecimalDigitLengthBoundsAsEI[1].Subtract(1));
        return new EInteger[]{EInteger.Min(eIntegerAdd, eIntegerAdd2), EInteger.Max(eIntegerAdd, eIntegerAdd2)};
    }

    static IRadixMath<EDecimal> GetMathValue(EContext eContext) {
        return (eContext == null || eContext == EContext.UnlimitedHalfEven) ? ExtendedMathValue : (eContext.isSimplified() || eContext.getTraps() != 0) ? MathValue : ExtendedMathValue;
    }

    private static boolean HasTerminatingBinaryExpansion(EInteger eInteger) {
        if (eInteger.isZero()) {
            return false;
        }
        if (!eInteger.GetUnsignedBit(0) || eInteger.compareTo(EInteger.FromInt32(1)) == 0) {
            return eInteger.GetUnsignedBitLengthAsEInteger().equals(eInteger.GetLowBitAsEInteger().Add(1));
        }
        return false;
    }

    private static long IntegerToDoubleBits(long j2, int i2, boolean z2) {
        while (j2 < 4503599627370496L) {
            j2 <<= 1;
            i2--;
        }
        long j3 = j2 & 4503599627370495L;
        long j4 = ((long) (i2 + PhotoshopDirectory.TAG_TIMELINE_INFORMATION)) << 52;
        long j5 = (j3 + j4) - (j3 & j4);
        return z2 ? (-1) - (((-1) - j5) & ((-1) - Long.MIN_VALUE)) : j5;
    }

    private static int IntegerToSingleBits(int i2, int i3, boolean z2) {
        while (i2 < 8388608) {
            i2 <<= 1;
            i3--;
        }
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 8388607)))) & ((-1) - ((i3 + 150) << 23)));
        return z2 ? (i4 - Integer.MIN_VALUE) - (i4 & Integer.MIN_VALUE) : i4;
    }

    private boolean IsIntegerPartZero() {
        if (!isFinite()) {
            return false;
        }
        if (this.unsignedMantissa.isValueZero()) {
            return true;
        }
        if (getExponent().signum() >= 0) {
            return false;
        }
        EInteger[] eIntegerArrDecimalDigitLengthBoundsAsEI = NumberUtility.DecimalDigitLengthBoundsAsEI(getUnsignedMantissa());
        EInteger eInteger = eIntegerArrDecimalDigitLengthBoundsAsEI[1];
        EInteger eInteger2 = eIntegerArrDecimalDigitLengthBoundsAsEI[0];
        EInteger exponent = getExponent();
        return eInteger.compareTo(exponent.Abs()) < 0 || (eInteger2.compareTo(exponent.Abs()) <= 0 && compareTo(-1) > 0 && compareTo(1) < 0);
    }

    public static EDecimal Max(EDecimal eDecimal, EDecimal eDecimal2) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return Max(eDecimal, eDecimal2, null);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal Max(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return GetMathValue(eContext).Max(eDecimal, eDecimal2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal MaxMagnitude(EDecimal eDecimal, EDecimal eDecimal2) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return MaxMagnitude(eDecimal, eDecimal2, null);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal MaxMagnitude(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return GetMathValue(eContext).MaxMagnitude(eDecimal, eDecimal2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal Min(EDecimal eDecimal, EDecimal eDecimal2) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return Min(eDecimal, eDecimal2, null);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal Min(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return GetMathValue(eContext).Min(eDecimal, eDecimal2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal MinMagnitude(EDecimal eDecimal, EDecimal eDecimal2) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return MinMagnitude(eDecimal, eDecimal2, null);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal MinMagnitude(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("first");
        }
        if (eDecimal2 != null) {
            return GetMathValue(eContext).MinMagnitude(eDecimal, eDecimal2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EDecimal PI(EContext eContext) {
        return GetMathValue(eContext).Pi(eContext);
    }

    private static EInteger PowerOfRadixBitsLowerBound(EInteger eInteger) {
        return eInteger.Abs().Multiply(332).Divide(100).Add(1);
    }

    private static EInteger PowerOfRadixBitsUpperBound(EInteger eInteger) {
        return eInteger.Abs().Multiply(333).Divide(100).Add(1);
    }

    private EDecimal RoundToExponentFast(int i2, ERounding eRounding) {
        if (!isFinite() || !this.exponent.CanFitInInt32() || !this.unsignedMantissa.CanFitInInt32()) {
            return null;
        }
        int iToInt32 = this.exponent.ToInt32();
        if (iToInt32 == i2) {
            return this;
        }
        if (iToInt32 < -100 || iToInt32 > 100 || i2 < -100 || i2 > 100) {
            return null;
        }
        if (eRounding == ERounding.Down) {
            int i3 = i2 - iToInt32;
            if (i3 < 1 || i3 > 9) {
                return null;
            }
            return new EDecimal(FastIntegerFixed.FromInt32(this.unsignedMantissa.ToInt32() / ValueTenPowers[i3]), FastIntegerFixed.FromInt32(i2), this.flags);
        }
        if (eRounding != ERounding.HalfEven) {
            return null;
        }
        int i4 = i2 - iToInt32;
        int iToInt322 = this.unsignedMantissa.ToInt32();
        if (i4 < 1 || i4 > 9 || iToInt322 == Integer.MAX_VALUE) {
            return null;
        }
        int i5 = ValueTenPowers[i4 - 1];
        int i6 = iToInt322 / i5;
        int i7 = i6 > 43698 ? i6 / 10 : (i6 * 26215) >> 18;
        int i8 = i6 - (i7 * 10);
        if (i8 > 5 || (i8 == 5 && ((-1) - (((-1) - i7) | ((-1) - 1)) == 1 || iToInt322 - (i6 * i5) != 0))) {
            i7++;
        }
        return new EDecimal(FastIntegerFixed.FromInt32(i7), FastIntegerFixed.FromInt32(i2), this.flags);
    }

    static EDecimal SignalOverflow(EContext eContext, boolean z2, boolean z3) {
        if (!z3) {
            return GetMathValue(eContext).SignalOverflow(eContext, z2);
        }
        EDecimal eDecimalCreate = Create(EInteger.FromInt32(0), eContext.getEMax());
        if (z2) {
            eDecimalCreate = eDecimalCreate.Negate();
        }
        return eDecimalCreate.RoundToPrecision(eContext);
    }

    static EDecimal SignalUnderflow(EContext eContext, boolean z2, boolean z3) {
        EDecimal eDecimalCreate = Create(z3 ? EInteger.FromInt32(0) : EInteger.FromInt32(1), eContext.getEMin().Subtract(eContext.getPrecision().Subtract(1)).Subtract(2));
        if (z2) {
            eDecimalCreate = eDecimalCreate.Negate();
        }
        return eDecimalCreate.RoundToPrecision(eContext);
    }

    private EInteger ToEIntegerInternal(boolean z2) {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        int iSignum = getExponent().signum();
        if (isZero()) {
            return EInteger.FromInt32(0);
        }
        if (iSignum == 0) {
            return getMantissa();
        }
        if (iSignum > 0) {
            if (getExponent().GetUnsignedBitLengthAsEInteger().compareTo(64) <= 0) {
                return getMantissa().Multiply(NumberUtility.FindPowerOfTenFromBig(getExponent()));
            }
            throw new UnsupportedOperationException("Not enough memory to store as EInteger.");
        }
        if (z2 && !this.unsignedMantissa.isEvenNumber()) {
            throw new ArithmeticException("Not an exact integer");
        }
        FastInteger fastIntegerNegate = this.exponent.ToFastInteger().Negate();
        DigitShiftAccumulator digitShiftAccumulator = new DigitShiftAccumulator(this.unsignedMantissa.ToEInteger(), 0, 0);
        if (!z2) {
            digitShiftAccumulator.TruncateRightSimple(fastIntegerNegate);
        } else if (!digitShiftAccumulator.TruncateRightExact(fastIntegerNegate)) {
            throw new ArithmeticException("Not an exact integer");
        }
        EInteger shiftedInt = digitShiftAccumulator.getShiftedInt();
        return isNegative() ? shiftedInt.Negate() : shiftedInt;
    }

    private EInteger ToSizedEInteger(int i2, boolean z2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("maxBitLength (" + i2 + ") is not greater or equal to 0");
        }
        if (!isFinite() || isZero()) {
            return z2 ? ToEIntegerIfExact() : ToEInteger();
        }
        EInteger mantissa = getMantissa();
        EInteger exponent = getExponent();
        if (exponent.signum() > 0) {
            long jGetSignedBitLengthAsInt64 = mantissa.GetSignedBitLengthAsInt64();
            long j2 = i2;
            if (jGetSignedBitLengthAsInt64 >= j2) {
                throw new ArithmeticException("Value out of range");
            }
            if (exponent.compareTo(1048576) < 0 && jGetSignedBitLengthAsInt64 < 1048576) {
                if ((jGetSignedBitLengthAsInt64 - 1) + ((exponent.ToInt64Checked() * 332) / 100) + 1 > j2) {
                    throw new ArithmeticException("Value out of range");
                }
            } else {
                if (exponent.compareTo(i2) > 0) {
                    throw new ArithmeticException("Value out of range");
                }
                if (mantissa.GetSignedBitLengthAsEInteger().Subtract(1).Add(PowerOfRadixBitsLowerBound(exponent)).compareTo(i2) > 0) {
                    throw new ArithmeticException("Value out of range");
                }
            }
            mantissa = z2 ? ToEIntegerIfExact() : ToEInteger();
        } else if (exponent.signum() < 0) {
            EInteger eIntegerAbs = exponent.Abs();
            long jGetSignedBitLengthAsInt642 = mantissa.GetSignedBitLengthAsInt64();
            if (eIntegerAbs.compareTo(1048576) < 0 && jGetSignedBitLengthAsInt642 < 1048576) {
                long jToInt64Checked = ((eIntegerAbs.ToInt64Checked() * 333) / 100) + 1;
                long jToInt64Checked2 = ((eIntegerAbs.ToInt64Checked() * 332) / 100) + 1;
                if ((jGetSignedBitLengthAsInt642 - 1) - jToInt64Checked > i2) {
                    throw new ArithmeticException("Value out of range");
                }
                if (jGetSignedBitLengthAsInt642 + 1 < jToInt64Checked2) {
                    if (z2) {
                        throw new ArithmeticException("Not an exact integer");
                    }
                    return EInteger.FromInt32(0);
                }
            } else {
                if (jGetSignedBitLengthAsInt642 < 1048576 && eIntegerAbs.compareTo(4194304) >= 0) {
                    if (z2) {
                        throw new ArithmeticException("Not an exact integer");
                    }
                    return EInteger.FromInt32(0);
                }
                if (mantissa.GetSignedBitLengthAsEInteger().Subtract(1).Subtract(PowerOfRadixBitsUpperBound(eIntegerAbs)).compareTo(i2) > 0) {
                    throw new ArithmeticException("Value out of range");
                }
            }
            mantissa = z2 ? ToEIntegerIfExact() : ToEInteger();
        }
        if (mantissa.GetSignedBitLengthAsEInteger().compareTo(i2) <= 0) {
            return mantissa;
        }
        throw new ArithmeticException("Value out of range");
    }

    private String ToStringInternal(int i2) {
        int i3;
        StringBuilder sb;
        StringBuilder sb2;
        int i4;
        int iToInt32;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte b2 = this.flags;
        int i10 = (b2 + 1) - (b2 | 1) == 0 ? 0 : 1;
        if (!isFinite()) {
            byte b3 = this.flags;
            if ((2 & b3) != 0) {
                return i10 != 0 ? "-Infinity" : "Infinity";
            }
            if ((-1) - (((-1) - b3) | ((-1) - 8)) != 0) {
                return this.unsignedMantissa.isValueZero() ? i10 != 0 ? "-sNaN" : "sNaN" : i10 != 0 ? "-sNaN" + this.unsignedMantissa : "sNaN" + this.unsignedMantissa;
            }
            if ((b3 + 4) - (b3 | 4) != 0) {
                return this.unsignedMantissa.isValueZero() ? i10 != 0 ? "-NaN" : "NaN" : i10 != 0 ? "-NaN" + this.unsignedMantissa : "NaN" + this.unsignedMantissa;
            }
        }
        int i11 = -this.exponent.signum();
        if (i11 == 0) {
            String string = this.unsignedMantissa.toString();
            return i10 != 0 ? Global.HYPHEN + string : string;
        }
        boolean zIsValueZero = this.unsignedMantissa.isValueZero();
        if (i2 == 2 && zIsValueZero && i11 < 0) {
            String string2 = this.unsignedMantissa.toString();
            return i10 != 0 ? Global.HYPHEN + string2 : string2;
        }
        if (i2 == 0 && this.unsignedMantissa.CanFitInInt32() && this.exponent.CanFitInInt32()) {
            int iToInt322 = this.exponent.ToInt32();
            int iToInt323 = this.unsignedMantissa.ToInt32();
            if (iToInt323 < 1000 && iToInt322 == -2) {
                int i12 = iToInt323 % 10;
                int i13 = iToInt323 / 10;
                int i14 = i13 % 10;
                int i15 = i13 / 10;
                int i16 = i10 + 4;
                char[] cArr = new char[i16];
                if (i10 != 0) {
                    cArr[0] = Soundex.SILENT_MARKER;
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                cArr[i9] = (char) (i15 + 48);
                cArr[i9 + 1] = '.';
                cArr[i9 + 2] = (char) (i14 + 48);
                cArr[i9 + 3] = (char) (i12 + 48);
                return new String(cArr, 0, i16);
            }
            if (iToInt323 < 100 && iToInt322 == -1) {
                int i17 = iToInt323 % 10;
                int i18 = iToInt323 / 10;
                int i19 = i10 + 3;
                char[] cArr2 = new char[i19];
                if (i10 != 0) {
                    cArr2[0] = Soundex.SILENT_MARKER;
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                cArr2[i8] = (char) (i18 + 48);
                cArr2[i8 + 1] = '.';
                cArr2[i8 + 2] = (char) (i17 + 48);
                return new String(cArr2, 0, i19);
            }
        }
        String string3 = this.unsignedMantissa.toString();
        if (i2 == 0 && string3.length() < 100 && this.exponent.CanFitInInt32() && (iToInt32 = this.exponent.ToInt32()) > -100 && iToInt32 < 100) {
            int length = (string3.length() + iToInt32) - 1;
            if (i11 >= 0 && length >= -6 && i11 > 0) {
                int length2 = string3.length();
                int i20 = iToInt32 + length2;
                if (i20 < 0) {
                    int i21 = -i20;
                    int i22 = i21 + 2 + i10 + length2;
                    char[] cArr3 = new char[i22];
                    if (i10 != 0) {
                        cArr3[0] = Soundex.SILENT_MARKER;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    cArr3[i7] = '0';
                    int i23 = i7 + 2;
                    cArr3[i7 + 1] = '.';
                    int i24 = 0;
                    while (i24 < i21) {
                        cArr3[i23] = '0';
                        i24++;
                        i23++;
                    }
                    int i25 = 0;
                    while (i25 < length2) {
                        cArr3[i23] = string3.charAt(i25);
                        i25++;
                        i23++;
                    }
                    return new String(cArr3, 0, i22);
                }
                if (i20 == 0) {
                    int i26 = i10 + 2 + length2;
                    char[] cArr4 = new char[i26];
                    if (i10 != 0) {
                        cArr4[0] = Soundex.SILENT_MARKER;
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    cArr4[i6] = '0';
                    int i27 = i6 + 2;
                    cArr4[i6 + 1] = '.';
                    int i28 = 0;
                    while (i28 < length2) {
                        cArr4[i27] = string3.charAt(i28);
                        i28++;
                        i27++;
                    }
                    return new String(cArr4, 0, i26);
                }
                if (i20 > 0 && i20 <= length2) {
                    int i29 = i10 + 1 + length2;
                    char[] cArr5 = new char[i29];
                    if (i10 != 0) {
                        cArr5[0] = Soundex.SILENT_MARKER;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i30 = 0;
                    while (i30 < i20) {
                        cArr5[i5] = string3.charAt(i30);
                        i30++;
                        i5++;
                    }
                    int i31 = i5 + 1;
                    cArr5[i5] = '.';
                    while (i20 < length2) {
                        cArr5[i31] = string3.charAt(i20);
                        i20++;
                        i31++;
                    }
                    return new String(cArr5, 0, i29);
                }
            }
        }
        FastInteger fastIntegerFromBig = FastInteger.FromBig(getExponent());
        FastInteger fastInteger = new FastInteger(string3.length());
        FastInteger fastIntegerCopy = fastIntegerFromBig.Copy();
        fastIntegerFromBig.Add(fastInteger).Decrement();
        FastInteger fastInteger2 = new FastInteger(1);
        FastInteger fastInteger3 = new FastInteger(-6);
        if (i2 == 1) {
            FastInteger fastIntegerCopy2 = fastIntegerFromBig.Copy();
            boolean z2 = fastIntegerFromBig.signum() < 0;
            int iToInt324 = fastIntegerFromBig.Copy().Abs().Remainder(3).ToInt32();
            if (!zIsValueZero) {
                i3 = 2;
                i4 = 1;
            } else if (fastIntegerFromBig.compareTo(fastInteger3) < 0 || i11 < 0) {
                if (iToInt324 != 1) {
                    i3 = 2;
                    if (iToInt324 == 2) {
                        if (z2) {
                            fastInteger2.AddInt(2);
                            fastIntegerCopy2.AddInt(2);
                        } else {
                            fastInteger2.Increment();
                            fastIntegerCopy2.Increment();
                        }
                    }
                } else if (z2) {
                    fastInteger2.Increment();
                    fastIntegerCopy2.Increment();
                    i3 = 2;
                } else {
                    i3 = 2;
                    fastInteger2.AddInt(2);
                    fastIntegerCopy2.AddInt(2);
                }
                fastInteger3.Increment();
                fastIntegerFromBig = fastIntegerCopy2;
            } else {
                i4 = 1;
                i3 = 2;
            }
            if (iToInt324 == i4) {
                if (z2) {
                    fastInteger2.AddInt(i3);
                    fastIntegerCopy2.AddInt(-2);
                } else {
                    fastInteger2.Increment();
                    fastIntegerCopy2.Decrement();
                }
            } else if (iToInt324 == i3) {
                if (z2) {
                    fastInteger2.Increment();
                    fastIntegerCopy2.Decrement();
                } else {
                    fastInteger2.AddInt(i3);
                    fastIntegerCopy2.AddInt(-2);
                }
            }
            fastIntegerFromBig = fastIntegerCopy2;
        } else {
            i3 = 2;
        }
        if (i2 != i3 && (fastIntegerFromBig.compareTo(fastInteger3) < 0 || i11 < 0)) {
            if (i2 == 1 && zIsValueZero && fastInteger2.CompareToInt(1) > 0) {
                sb2 = new StringBuilder();
                if (i10 != 0) {
                    sb2.append(Soundex.SILENT_MARKER);
                }
                sb2.append(string3);
                sb2.append('.');
                AppendString(sb2, '0', fastInteger2.Copy().Decrement());
            } else {
                FastInteger fastIntegerCopy3 = fastInteger2.Copy();
                int iCompareToInt = fastIntegerCopy3.CompareToInt(string3.length());
                if (iCompareToInt > 0) {
                    fastIntegerCopy3.SubtractInt(string3.length());
                    sb2 = new StringBuilder();
                    if (i10 != 0) {
                        sb2.append(Soundex.SILENT_MARKER);
                    }
                    sb2.append(string3);
                    AppendString(sb2, '0', fastIntegerCopy3);
                } else if (iCompareToInt < 0) {
                    if (!fastIntegerCopy3.CanFitInInt32()) {
                        throw new UnsupportedOperationException();
                    }
                    int iToInt325 = fastIntegerCopy3.ToInt32();
                    if (fastIntegerCopy3.signum() < 0) {
                        iToInt325 = 0;
                    }
                    FastInteger fastIntegerAddInt = new FastInteger(string3.length()).AddInt(6);
                    sb2 = new StringBuilder(fastIntegerAddInt.CompareToInt(Integer.MAX_VALUE) <= 0 ? fastIntegerAddInt.ToInt32() : Integer.MAX_VALUE);
                    if (i10 != 0) {
                        sb2.append(Soundex.SILENT_MARKER);
                    }
                    sb2.append((CharSequence) string3, 0, iToInt325);
                    sb2.append('.');
                    sb2.append((CharSequence) string3, iToInt325, (string3.length() - iToInt325) + iToInt325);
                } else {
                    if (fastIntegerFromBig.signum() == 0 && i10 == 0) {
                        return string3;
                    }
                    if (fastIntegerFromBig.signum() == 0 && i10 != 0) {
                        return Global.HYPHEN + string3;
                    }
                    sb2 = new StringBuilder();
                    if (i10 != 0) {
                        sb2.append(Soundex.SILENT_MARKER);
                    }
                    sb2.append(string3);
                }
            }
            if (fastIntegerFromBig.signum() != 0) {
                sb2.append(fastIntegerFromBig.signum() < 0 ? "E-" : "E+");
                fastIntegerFromBig.Abs();
                sb2.append(fastIntegerFromBig.toString());
            }
            return sb2.toString();
        }
        if (i11 <= 0) {
            if (i2 != 2 || i11 >= 0) {
                return i10 == 0 ? string3 : Global.HYPHEN + string3;
            }
            FastInteger fastIntegerCopy4 = fastIntegerCopy.Copy();
            StringBuilder sb3 = new StringBuilder();
            if (i10 != 0) {
                sb3.append(Soundex.SILENT_MARKER);
            }
            sb3.append(string3);
            AppendString(sb3, '0', fastIntegerCopy4);
            return sb3.toString();
        }
        FastInteger fastIntegerAdd = fastIntegerCopy.Copy().Add(fastInteger);
        int iCompareToInt2 = fastIntegerAdd.CompareToInt(0);
        if (iCompareToInt2 < 0) {
            FastInteger fastIntegerAddInt2 = new FastInteger(string3.length()).AddInt(6);
            sb = new StringBuilder(fastIntegerAddInt2.CompareToInt(Integer.MAX_VALUE) <= 0 ? fastIntegerAddInt2.ToInt32() : Integer.MAX_VALUE);
            if (i10 != 0) {
                sb.append(Soundex.SILENT_MARKER);
            }
            sb.append("0.");
            AppendString(sb, '0', fastIntegerAdd.Copy().Negate());
            sb.append(string3);
        } else if (iCompareToInt2 == 0) {
            FastInteger fastIntegerAddInt3 = new FastInteger(string3.length()).AddInt(6);
            sb = new StringBuilder(fastIntegerAddInt3.CompareToInt(Integer.MAX_VALUE) <= 0 ? fastIntegerAddInt3.ToInt32() : Integer.MAX_VALUE);
            if (i10 != 0) {
                sb.append(Soundex.SILENT_MARKER);
            }
            sb.append("0.");
            sb.append(string3);
        } else if (fastIntegerAdd.CompareToInt(string3.length()) > 0) {
            if (!fastInteger.CanFitInInt32()) {
                throw new UnsupportedOperationException();
            }
            int iToInt326 = fastInteger.ToInt32();
            if (iToInt326 < 0) {
                iToInt326 = 0;
            }
            FastInteger fastIntegerAddInt4 = new FastInteger(string3.length()).AddInt(6);
            sb = new StringBuilder(fastIntegerAddInt4.CompareToInt(Integer.MAX_VALUE) <= 0 ? fastIntegerAddInt4.ToInt32() : Integer.MAX_VALUE);
            if (i10 != 0) {
                sb.append(Soundex.SILENT_MARKER);
            }
            sb.append((CharSequence) string3, 0, iToInt326);
            AppendString(sb, '0', fastIntegerAdd.Copy().SubtractInt(sb.length()));
            sb.append('.');
            sb.append((CharSequence) string3, iToInt326, (string3.length() - iToInt326) + iToInt326);
        } else {
            if (!fastIntegerAdd.CanFitInInt32()) {
                throw new UnsupportedOperationException();
            }
            int iToInt327 = fastIntegerAdd.ToInt32();
            if (iToInt327 < 0) {
                iToInt327 = 0;
            }
            FastInteger fastIntegerAddInt5 = new FastInteger(string3.length()).AddInt(6);
            sb = new StringBuilder(fastIntegerAddInt5.CompareToInt(Integer.MAX_VALUE) <= 0 ? fastIntegerAddInt5.ToInt32() : Integer.MAX_VALUE);
            if (i10 != 0) {
                sb.append(Soundex.SILENT_MARKER);
            }
            sb.append((CharSequence) string3, 0, iToInt327);
            sb.append('.');
            sb.append((CharSequence) string3, iToInt327, (string3.length() - iToInt327) + iToInt327);
        }
        return sb.toString();
    }

    private EFloat WithThisSign(EFloat eFloat) {
        return isNegative() ? eFloat.Negate() : eFloat;
    }

    public EDecimal Abs() {
        return isNegative() ? new EDecimal(this.unsignedMantissa, this.exponent, (byte) (this.flags & (-2))) : this;
    }

    public EDecimal Abs(EContext eContext) {
        return ((eContext == null || eContext == EContext.UnlimitedHalfEven) ? ExtendedMathValue : MathValue).Abs(this, eContext);
    }

    public EDecimal Add(int i2) {
        return Add(FromInt32(i2));
    }

    public EDecimal Add(long j2) {
        return Add(FromInt64(j2));
    }

    public EDecimal Add(EDecimal eDecimal) {
        if (isFinite() && eDecimal != null && eDecimal.isFinite()) {
            byte b2 = this.flags;
            byte b3 = eDecimal.flags;
            if ((((b2 + b3) - (b2 & b3)) & 1) == 0 && this.exponent.compareTo(eDecimal.exponent) == 0) {
                return new EDecimal(FastIntegerFixed.Add(this.unsignedMantissa, eDecimal.unsignedMantissa), this.exponent, (byte) 0);
            }
        }
        return Add(eDecimal, EContext.UnlimitedHalfEven);
    }

    public EDecimal Add(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Add(this, eDecimal, eContext);
    }

    public int CompareToBinary(EFloat eFloat) {
        return CompareEDecimalToEFloat(this, eFloat);
    }

    public EDecimal CompareToSignal(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).CompareToWithContext(this, eDecimal, true, eContext);
    }

    public int CompareToTotal(EDecimal eDecimal) {
        if (eDecimal == null) {
            return -1;
        }
        boolean zIsNegative = isNegative();
        if (zIsNegative != eDecimal.isNegative()) {
            return zIsNegative ? -1 : 1;
        }
        char c2 = 3;
        char c3 = IsSignalingNaN() ? (char) 2 : IsNaN() ? (char) 3 : IsInfinity() ? (char) 1 : (char) 0;
        if (eDecimal.IsSignalingNaN()) {
            c2 = 2;
        } else if (!eDecimal.IsNaN()) {
            c2 = eDecimal.IsInfinity() ? (char) 1 : (char) 0;
        }
        if (c3 > c2) {
            return zIsNegative ? -1 : 1;
        }
        if (c3 < c2) {
            return zIsNegative ? 1 : -1;
        }
        if (c3 >= 2) {
            int iCompareTo = this.unsignedMantissa.compareTo(eDecimal.unsignedMantissa);
            return zIsNegative ? -iCompareTo : iCompareTo;
        }
        if (c3 == 1) {
            return 0;
        }
        int iCompareTo2 = compareTo(eDecimal);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = this.exponent.compareTo(eDecimal.exponent);
        return zIsNegative ? -iCompareTo3 : iCompareTo3;
    }

    public int CompareToTotal(EDecimal eDecimal, EContext eContext) {
        if (eDecimal == null) {
            return 1;
        }
        return (IsSignalingNaN() || eDecimal.IsSignalingNaN()) ? CompareToTotal(eDecimal) : (eContext == null || !eContext.isSimplified()) ? CompareToTotal(eDecimal) : RoundToPrecision(eContext).CompareToTotal(eDecimal.RoundToPrecision(eContext));
    }

    public int CompareToTotalMagnitude(EDecimal eDecimal) {
        if (eDecimal == null) {
            return 1;
        }
        char c2 = 3;
        char c3 = IsSignalingNaN() ? (char) 2 : IsNaN() ? (char) 3 : IsInfinity() ? (char) 1 : (char) 0;
        if (eDecimal.IsSignalingNaN()) {
            c2 = 2;
        } else if (!eDecimal.IsNaN()) {
            c2 = eDecimal.IsInfinity() ? (char) 1 : (char) 0;
        }
        if (c3 > c2) {
            return 1;
        }
        if (c3 < c2) {
            return -1;
        }
        if (c3 >= 2) {
            return this.unsignedMantissa.compareTo(eDecimal.unsignedMantissa);
        }
        if (c3 == 1) {
            return 0;
        }
        int iCompareTo = Abs().compareTo(eDecimal.Abs());
        return iCompareTo == 0 ? this.exponent.compareTo(eDecimal.exponent) : iCompareTo;
    }

    public int CompareToTotalMagnitude(EDecimal eDecimal, EContext eContext) {
        if (eDecimal == null) {
            return 1;
        }
        return (IsSignalingNaN() || eDecimal.IsSignalingNaN()) ? CompareToTotalMagnitude(eDecimal) : (eContext == null || !eContext.isSimplified()) ? CompareToTotalMagnitude(eDecimal) : RoundToPrecision(eContext).CompareToTotalMagnitude(eDecimal.RoundToPrecision(eContext));
    }

    public int CompareToValue(int i2) {
        return CompareToValue(FromInt32(i2));
    }

    public int CompareToValue(long j2) {
        return CompareToValue(FromInt64(j2));
    }

    public int CompareToValue(EDecimal eDecimal) {
        return ExtendedMathValue.compareTo(this, eDecimal);
    }

    public EDecimal CompareToWithContext(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).CompareToWithContext(this, eDecimal, false, eContext);
    }

    public EDecimal Copy() {
        return new EDecimal(this.unsignedMantissa.Copy(), this.exponent.Copy(), this.flags);
    }

    public EDecimal CopySign(EDecimal eDecimal) {
        if (eDecimal != null) {
            return isNegative() ? eDecimal.isNegative() ? this : Negate() : eDecimal.isNegative() ? Negate() : this;
        }
        throw new NullPointerException("other");
    }

    public EDecimal Decrement() {
        return Subtract(1);
    }

    public EDecimal[] DivRemNaturalScale(EDecimal eDecimal) {
        return DivRemNaturalScale(eDecimal, null);
    }

    public EDecimal[] DivRemNaturalScale(EDecimal eDecimal, EContext eContext) {
        EDecimal eDecimalDivideToIntegerNaturalScale = DivideToIntegerNaturalScale(eDecimal, null);
        EDecimal[] eDecimalArr = {eDecimalDivideToIntegerNaturalScale, Subtract(eDecimalDivideToIntegerNaturalScale.Multiply(eDecimal, null), eContext)};
        eDecimalArr[0] = eDecimalArr[0].RoundToPrecision(eContext);
        return eDecimalArr;
    }

    public EDecimal Divide(int i2) {
        return Divide(FromInt32(i2));
    }

    public EDecimal Divide(long j2) {
        return Divide(FromInt64(j2));
    }

    public EDecimal Divide(EDecimal eDecimal) {
        return Divide(eDecimal, EContext.ForRounding(ERounding.None));
    }

    public EDecimal Divide(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Divide(this, eDecimal, eContext);
    }

    @Deprecated
    public EDecimal[] DivideAndRemainderNaturalScale(EDecimal eDecimal) {
        return DivRemNaturalScale(eDecimal, null);
    }

    @Deprecated
    public EDecimal[] DivideAndRemainderNaturalScale(EDecimal eDecimal, EContext eContext) {
        return DivRemNaturalScale(eDecimal, eContext);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, int i2) {
        return DivideToExponent(eDecimal, i2, ERounding.HalfEven);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, int i2, EContext eContext) {
        return DivideToExponent(eDecimal, EInteger.FromInt32(i2), eContext);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, int i2, ERounding eRounding) {
        return DivideToExponent(eDecimal, EInteger.FromInt32(i2), EContext.ForRounding(eRounding));
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, long j2) {
        return DivideToExponent(eDecimal, j2, ERounding.HalfEven);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, long j2, EContext eContext) {
        return DivideToExponent(eDecimal, EInteger.FromInt64(j2), eContext);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, long j2, ERounding eRounding) {
        return DivideToExponent(eDecimal, EInteger.FromInt64(j2), EContext.ForRounding(eRounding));
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, EInteger eInteger) {
        return DivideToExponent(eDecimal, eInteger, ERounding.HalfEven);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, EInteger eInteger, EContext eContext) {
        return GetMathValue(eContext).DivideToExponent(this, eDecimal, eInteger, eContext);
    }

    public EDecimal DivideToExponent(EDecimal eDecimal, EInteger eInteger, ERounding eRounding) {
        return DivideToExponent(eDecimal, eInteger, EContext.ForRounding(eRounding));
    }

    public EDecimal DivideToIntegerNaturalScale(EDecimal eDecimal) {
        return DivideToIntegerNaturalScale(eDecimal, EContext.ForRounding(ERounding.Down));
    }

    public EDecimal DivideToIntegerNaturalScale(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).DivideToIntegerNaturalScale(this, eDecimal, eContext);
    }

    public EDecimal DivideToIntegerZeroScale(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).DivideToIntegerZeroScale(this, eDecimal, eContext);
    }

    public EDecimal DivideToSameExponent(EDecimal eDecimal, ERounding eRounding) {
        return DivideToExponent(eDecimal, this.exponent.ToEInteger(), EContext.ForRounding(eRounding));
    }

    public EDecimal Exp(EContext eContext) {
        return GetMathValue(eContext).Exp(this, eContext);
    }

    public EDecimal ExpM1(EContext eContext) {
        EDecimal eDecimalAdd;
        if (IsNaN()) {
            return Plus(eContext);
        }
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return SignalingNaN.Plus(eContext);
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EDecimal) eContext.TriggerTraps(ExpM1(eContextGetNontrapping), eContextGetNontrapping);
        }
        if (eContext.isSimplified()) {
            EContext eContextWithBlankFlags = eContext.WithSimplified(false).WithBlankFlags();
            EDecimal eDecimalExpM1 = PreRound(eContext).ExpM1(eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                int flags = eContext.getFlags();
                int flags2 = eContextWithBlankFlags.getFlags();
                eContext.setFlags((flags2 + flags) - (flags2 & flags));
            }
            return eDecimalExpM1.RoundToPrecision(eContext);
        }
        if (compareTo(-1) == 0) {
            return NegativeInfinity;
        }
        if (IsPositiveInfinity()) {
            return PositiveInfinity;
        }
        if (IsNegativeInfinity()) {
            return FromInt32(-1).Plus(eContext);
        }
        if (compareTo(0) == 0) {
            return FromInt32(0).Plus(eContext);
        }
        int flags3 = eContext.getFlags();
        EInteger eIntegerAdd = eContext.getPrecision().Add(3);
        EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(eIntegerAdd).WithBlankFlags();
        if (Abs().compareTo(Create(5, -1)) < 0) {
            EDecimal eDecimalAdd2 = Exp(eContextWithBlankFlags2).Add(FromInt32(-1), eContext);
            while (true) {
                eIntegerAdd = eIntegerAdd.Add(eContext.getPrecision()).Add(3);
                eContextWithBlankFlags2 = eContext.WithBigPrecision(eIntegerAdd).WithBlankFlags();
                eDecimalAdd = Exp(eContextWithBlankFlags2).Add(FromInt32(-1), eContext);
                if (eDecimalAdd.compareTo(0) != 0 && eDecimalAdd.compareTo(eDecimalAdd2) == 0) {
                    break;
                }
                eDecimalAdd2 = eDecimalAdd;
            }
        } else {
            eDecimalAdd = Exp(eContextWithBlankFlags2).Add(FromInt32(-1), eContext);
        }
        int flags4 = (-1) - (((-1) - eContextWithBlankFlags2.getFlags()) & ((-1) - flags3));
        if (eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - flags4) & ((-1) - eContext.getFlags())));
        }
        return eDecimalAdd;
    }

    public EDecimal Increment() {
        return Add(1);
    }

    public boolean IsInfinity() {
        byte b2 = this.flags;
        return (b2 + 2) - (b2 | 2) != 0;
    }

    public boolean IsInteger() {
        if (isFinite()) {
            return isZero() || this.exponent.CompareToInt(0) >= 0 || Reduce(null).exponent.CompareToInt(0) >= 0;
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
        byte b2 = this.flags;
        return (b2 + 3) - (b2 | 3) == 2;
    }

    public boolean IsQuietNaN() {
        return (this.flags & 4) != 0;
    }

    public boolean IsSignalingNaN() {
        return (-1) - (((-1) - this.flags) | ((-1) - 8)) != 0;
    }

    public EDecimal Log(EContext eContext) {
        return GetMathValue(eContext).Ln(this, eContext);
    }

    public EDecimal Log10(EContext eContext) {
        return LogN(FromInt32(10), eContext);
    }

    public EDecimal Log1P(EContext eContext) {
        EDecimal eDecimalLog;
        if (IsNaN()) {
            return Plus(eContext);
        }
        if (eContext == null || !eContext.getHasMaxPrecision() || compareTo(-1) < 0) {
            return SignalingNaN.Plus(eContext);
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EDecimal) eContext.TriggerTraps(Log1P(eContextGetNontrapping), eContextGetNontrapping);
        }
        if (eContext.isSimplified()) {
            EContext eContextWithBlankFlags = eContext.WithSimplified(false).WithBlankFlags();
            EDecimal eDecimalLog1P = PreRound(eContext).Log1P(eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                int flags = eContext.getFlags();
                int flags2 = eContextWithBlankFlags.getFlags();
                eContext.setFlags((flags2 + flags) - (flags2 & flags));
            }
            return eDecimalLog1P.RoundToPrecision(eContext);
        }
        if (compareTo(-1) == 0) {
            return NegativeInfinity;
        }
        if (IsPositiveInfinity()) {
            return PositiveInfinity;
        }
        if (compareTo(0) == 0) {
            return FromInt32(0).Plus(eContext);
        }
        int flags3 = eContext.getFlags();
        if (compareTo(Create(5, -1)) < 0) {
            eDecimalLog = Add(FromInt32(1)).Log(eContext);
        } else {
            EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(eContext.getPrecision().Add(3)).WithBlankFlags();
            eDecimalLog = Add(FromInt32(1), eContextWithBlankFlags2).Log(eContext);
            int flags4 = eContextWithBlankFlags2.getFlags();
            flags3 = (flags3 + flags4) - (flags3 & flags4);
        }
        if (eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - flags3) & ((-1) - eContext.getFlags())));
        }
        return eDecimalLog;
    }

    public EDecimal LogN(EDecimal eDecimal, EContext eContext) {
        int flags;
        if (eDecimal == null) {
            throw new NullPointerException("baseValue");
        }
        if (IsNaN()) {
            return Plus(eContext);
        }
        if (eDecimal.IsNaN()) {
            return eDecimal.Plus(eContext);
        }
        if (eContext == null || !eContext.getHasMaxPrecision() || ((isNegative() && !isZero()) || (eDecimal.isNegative() && !eDecimal.isZero()))) {
            return SignalingNaN.Plus(eContext);
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EDecimal) eContext.TriggerTraps(LogN(eDecimal, eContextGetNontrapping), eContextGetNontrapping);
        }
        if (eContext.isSimplified()) {
            EContext eContextWithBlankFlags = eContext.WithSimplified(false).WithBlankFlags();
            EDecimal eDecimalLogN = PreRound(eContext).LogN(eDecimal.PreRound(eContext), eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - eContext.getFlags())));
            }
            return eDecimalLogN.RoundToPrecision(eContext);
        }
        if (isZero()) {
            return eDecimal.compareTo(1) < 0 ? PositiveInfinity : NegativeInfinity;
        }
        if (IsPositiveInfinity()) {
            return eDecimal.compareTo(1) < 0 ? NegativeInfinity : PositiveInfinity;
        }
        if (eDecimal.compareTo(10) == 0) {
            EDecimal eDecimalReduce = Reduce(null);
            if (eDecimalReduce.getUnsignedMantissa().compareTo(1) == 0) {
                return FromEInteger(eDecimalReduce.getExponent()).Plus(eContext);
            }
        } else {
            if (compareTo(1) == 0) {
                return FromInt32(0).Plus(eContext);
            }
            if (compareTo(eDecimal) == 0) {
                return FromInt32(1).Plus(eContext);
            }
        }
        int flags2 = eContext.getFlags();
        EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(eContext.getPrecision().Add(5)).WithBlankFlags();
        EDecimal eDecimalDivide = Log(eContextWithBlankFlags2).Divide(eDecimal.Log(eContextWithBlankFlags2), eContext);
        if (!eDecimalDivide.IsInteger() || eDecimalDivide.isZero()) {
            flags = (-1) - (((-1) - flags2) & ((-1) - eContextWithBlankFlags2.getFlags()));
        } else {
            flags = (flags2 + 3) - (flags2 & 3);
            if (eDecimal.Pow(eDecimalDivide).CompareToValue(this) == 0) {
                EDecimal eDecimalQuantize = eDecimalDivide.Quantize(FromInt32(1), eContext.WithNoFlags());
                if (!eDecimalQuantize.IsNaN()) {
                    flags = (flags - 4) - (flags | (-4));
                    eDecimalDivide = eDecimalQuantize;
                }
            }
        }
        if (eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - flags)));
        }
        return eDecimalDivide;
    }

    public EDecimal MovePointLeft(int i2) {
        return MovePointLeft(EInteger.FromInt32(i2), (EContext) null);
    }

    public EDecimal MovePointLeft(int i2, EContext eContext) {
        return MovePointLeft(EInteger.FromInt32(i2), eContext);
    }

    public EDecimal MovePointLeft(EInteger eInteger) {
        return MovePointLeft(eInteger, (EContext) null);
    }

    public EDecimal MovePointLeft(EInteger eInteger, EContext eContext) {
        return !isFinite() ? RoundToPrecision(eContext) : MovePointRight(eInteger.Negate(), eContext);
    }

    public EDecimal MovePointRight(int i2) {
        return MovePointRight(EInteger.FromInt32(i2), (EContext) null);
    }

    public EDecimal MovePointRight(int i2, EContext eContext) {
        return MovePointRight(EInteger.FromInt32(i2), eContext);
    }

    public EDecimal MovePointRight(EInteger eInteger) {
        return MovePointRight(eInteger, (EContext) null);
    }

    public EDecimal MovePointRight(EInteger eInteger, EContext eContext) {
        if (!isFinite()) {
            return RoundToPrecision(eContext);
        }
        EInteger eIntegerAdd = getExponent().Add(eInteger);
        return eIntegerAdd.signum() > 0 ? CreateWithFlags(this.unsignedMantissa.ToEInteger().Multiply(NumberUtility.FindPowerOfTenFromBig(eIntegerAdd)), EInteger.FromInt32(0), this.flags).RoundToPrecision(eContext) : CreateWithFlags(this.unsignedMantissa, FastIntegerFixed.FromBig(eIntegerAdd), this.flags).RoundToPrecision(eContext);
    }

    public EDecimal Multiply(int i2) {
        return Multiply(FromInt32(i2));
    }

    public EDecimal Multiply(long j2) {
        return Multiply(FromInt64(j2));
    }

    public EDecimal Multiply(EDecimal eDecimal) {
        if (eDecimal == null) {
            throw new NullPointerException("otherValue");
        }
        if (!isFinite() || !eDecimal.isFinite()) {
            return Multiply(eDecimal, EContext.UnlimitedHalfEven);
        }
        int i2 = eDecimal.flags ^ this.flags;
        if (!this.unsignedMantissa.CanFitInInt32() || !eDecimal.unsignedMantissa.CanFitInInt32()) {
            return new EDecimal(FastIntegerFixed.FromBig(this.unsignedMantissa.ToEInteger().Multiply(eDecimal.unsignedMantissa.ToEInteger())), FastIntegerFixed.Add(this.exponent, eDecimal.exponent), (byte) i2);
        }
        long jToInt32 = ((long) this.unsignedMantissa.ToInt32()) * ((long) eDecimal.unsignedMantissa.ToInt32());
        FastIntegerFixed fastIntegerFixedAdd = FastIntegerFixed.Add(this.exponent, eDecimal.exponent);
        return (jToInt32 >> 31) == 0 ? new EDecimal(FastIntegerFixed.FromInt32((int) jToInt32), fastIntegerFixedAdd, (byte) i2) : new EDecimal(FastIntegerFixed.FromBig(EInteger.FromInt64(jToInt32)), fastIntegerFixedAdd, (byte) i2);
    }

    public EDecimal Multiply(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Multiply(this, eDecimal, eContext);
    }

    public EDecimal MultiplyAndAdd(EDecimal eDecimal, EDecimal eDecimal2) {
        return MultiplyAndAdd(eDecimal, eDecimal2, null);
    }

    public EDecimal MultiplyAndAdd(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        return GetMathValue(eContext).MultiplyAndAdd(this, eDecimal, eDecimal2, eContext);
    }

    public EDecimal MultiplyAndSubtract(EDecimal eDecimal, EDecimal eDecimal2, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("op");
        }
        if (eDecimal2 == null) {
            throw new NullPointerException("subtrahend");
        }
        byte b2 = eDecimal2.flags;
        if ((12 & b2) == 0) {
            eDecimal2 = CreateWithFlags(eDecimal2.unsignedMantissa, eDecimal2.exponent, b2 ^ 1);
        }
        return GetMathValue(eContext).MultiplyAndAdd(this, eDecimal, eDecimal2, eContext);
    }

    public EDecimal Negate() {
        return new EDecimal(this.unsignedMantissa, this.exponent, (byte) (this.flags ^ 1));
    }

    public EDecimal Negate(EContext eContext) {
        return ((eContext == null || eContext == EContext.UnlimitedHalfEven) ? ExtendedMathValue : MathValue).Negate(this, eContext);
    }

    public EDecimal NextMinus(EContext eContext) {
        return GetMathValue(eContext).NextMinus(this, eContext);
    }

    public EDecimal NextPlus(EContext eContext) {
        return GetMathValue(eContext).NextPlus(this, eContext);
    }

    public EDecimal NextToward(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).NextToward(this, eDecimal, eContext);
    }

    public EDecimal Plus(EContext eContext) {
        return GetMathValue(eContext).Plus(this, eContext);
    }

    public EDecimal Pow(int i2) {
        return Pow(FromInt64(i2), (EContext) null);
    }

    public EDecimal Pow(int i2, EContext eContext) {
        return Pow(FromInt64(i2), eContext);
    }

    public EDecimal Pow(EDecimal eDecimal) {
        return Pow(eDecimal, (EContext) null);
    }

    public EDecimal Pow(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Power(this, eDecimal, eContext);
    }

    public EDecimal PreRound(EContext eContext) {
        return (EDecimal) NumberUtility.PreRound(this, eContext, GetMathValue(eContext));
    }

    public EInteger Precision() {
        return !isFinite() ? EInteger.FromInt32(0) : isZero() ? EInteger.FromInt32(1) : this.unsignedMantissa.ToEInteger().GetDigitCountAsEInteger();
    }

    public EDecimal Quantize(int i2, EContext eContext) {
        if (eContext == null || (!eContext.getHasExponentRange() && !eContext.getHasFlagsOrTraps() && !eContext.getHasMaxPrecision() && !eContext.isSimplified())) {
            EDecimal eDecimalRoundToExponentFast = RoundToExponentFast(i2, eContext == null ? ERounding.HalfEven : eContext.getRounding());
            if (eDecimalRoundToExponentFast != null) {
                return eDecimalRoundToExponentFast;
            }
        }
        return Quantize(Create(EInteger.FromInt32(1), EInteger.FromInt32(i2)), eContext);
    }

    public EDecimal Quantize(int i2, ERounding eRounding) {
        EDecimal eDecimalRoundToExponentFast = RoundToExponentFast(i2, eRounding);
        return eDecimalRoundToExponentFast != null ? eDecimalRoundToExponentFast : Quantize(Create(EInteger.FromInt32(1), EInteger.FromInt32(i2)), EContext.ForRounding(eRounding));
    }

    public EDecimal Quantize(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Quantize(this, eDecimal, eContext);
    }

    public EDecimal Quantize(EInteger eInteger, EContext eContext) {
        return Quantize(Create(EInteger.FromInt32(1), eInteger), eContext);
    }

    public EDecimal Reduce(EContext eContext) {
        return GetMathValue(eContext).Reduce(this, eContext);
    }

    public EDecimal Remainder(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Remainder(this, eDecimal, eContext, true);
    }

    public EDecimal RemainderNaturalScale(EDecimal eDecimal) {
        return RemainderNaturalScale(eDecimal, null);
    }

    public EDecimal RemainderNaturalScale(EDecimal eDecimal, EContext eContext) {
        return Subtract(DivideToIntegerNaturalScale(eDecimal, null).Multiply(eDecimal, null), eContext);
    }

    public EDecimal RemainderNear(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).RemainderNear(this, eDecimal, eContext);
    }

    public EDecimal RemainderNoRoundAfterDivide(EDecimal eDecimal, EContext eContext) {
        return GetMathValue(eContext).Remainder(this, eDecimal, eContext, false);
    }

    public EDecimal RoundToExponent(int i2) {
        return RoundToExponent(i2, ERounding.HalfEven);
    }

    public EDecimal RoundToExponent(int i2, EContext eContext) {
        if (eContext == null || (!eContext.getHasExponentRange() && !eContext.getHasFlagsOrTraps() && !eContext.getHasMaxPrecision() && !eContext.isSimplified())) {
            EDecimal eDecimalRoundToExponentFast = RoundToExponentFast(i2, eContext == null ? ERounding.HalfEven : eContext.getRounding());
            if (eDecimalRoundToExponentFast != null) {
                return eDecimalRoundToExponentFast;
            }
        }
        return RoundToExponent(EInteger.FromInt32(i2), eContext);
    }

    public EDecimal RoundToExponent(int i2, ERounding eRounding) {
        EDecimal eDecimalRoundToExponentFast = RoundToExponentFast(i2, eRounding);
        return eDecimalRoundToExponentFast != null ? eDecimalRoundToExponentFast : RoundToExponent(i2, EContext.ForRounding(eRounding));
    }

    public EDecimal RoundToExponent(EInteger eInteger) {
        return RoundToExponent(eInteger, EContext.ForRounding(ERounding.HalfEven));
    }

    public EDecimal RoundToExponent(EInteger eInteger, EContext eContext) {
        return GetMathValue(eContext).RoundToExponentSimple(this, eInteger, eContext);
    }

    public EDecimal RoundToExponent(EInteger eInteger, ERounding eRounding) {
        return RoundToExponent(eInteger, EContext.ForRounding(eRounding));
    }

    public EDecimal RoundToExponentExact(int i2, EContext eContext) {
        return RoundToExponentExact(EInteger.FromInt32(i2), eContext);
    }

    public EDecimal RoundToExponentExact(int i2, ERounding eRounding) {
        return RoundToExponentExact(EInteger.FromInt32(i2), EContext.Unlimited.WithRounding(eRounding));
    }

    public EDecimal RoundToExponentExact(EInteger eInteger, EContext eContext) {
        return GetMathValue(eContext).RoundToExponentExact(this, eInteger, eContext);
    }

    public EDecimal RoundToIntegerExact(EContext eContext) {
        return GetMathValue(eContext).RoundToExponentExact(this, EInteger.FromInt32(0), eContext);
    }

    public EDecimal RoundToIntegerNoRoundedFlag(EContext eContext) {
        return GetMathValue(eContext).RoundToExponentNoRoundedFlag(this, EInteger.FromInt32(0), eContext);
    }

    @Deprecated
    public EDecimal RoundToIntegralExact(EContext eContext) {
        return GetMathValue(eContext).RoundToExponentExact(this, EInteger.FromInt32(0), eContext);
    }

    @Deprecated
    public EDecimal RoundToIntegralNoRoundedFlag(EContext eContext) {
        return GetMathValue(eContext).RoundToExponentNoRoundedFlag(this, EInteger.FromInt32(0), eContext);
    }

    public EDecimal RoundToPrecision(EContext eContext) {
        return GetMathValue(eContext).RoundToPrecision(this, eContext);
    }

    public EDecimal ScaleByPowerOfTen(int i2) {
        return ScaleByPowerOfTen(EInteger.FromInt32(i2), (EContext) null);
    }

    public EDecimal ScaleByPowerOfTen(int i2, EContext eContext) {
        return ScaleByPowerOfTen(EInteger.FromInt32(i2), eContext);
    }

    public EDecimal ScaleByPowerOfTen(EInteger eInteger) {
        return ScaleByPowerOfTen(eInteger, (EContext) null);
    }

    public EDecimal ScaleByPowerOfTen(EInteger eInteger, EContext eContext) {
        if (eInteger == null) {
            throw new NullPointerException("bigPlaces");
        }
        if (!eInteger.isZero() && isFinite()) {
            return CreateWithFlags(this.unsignedMantissa, FastIntegerFixed.FromBig(getExponent().Add(eInteger)), this.flags).RoundToPrecision(eContext);
        }
        return RoundToPrecision(eContext);
    }

    public EDecimal Sqrt(EContext eContext) {
        return GetMathValue(eContext).SquareRoot(this, eContext);
    }

    @Deprecated
    public EDecimal SquareRoot(EContext eContext) {
        return GetMathValue(eContext).SquareRoot(this, eContext);
    }

    public EDecimal Subtract(int i2) {
        return i2 == Integer.MIN_VALUE ? Subtract(FromInt32(i2)) : Add(-i2);
    }

    public EDecimal Subtract(long j2) {
        return Subtract(FromInt64(j2));
    }

    public EDecimal Subtract(EDecimal eDecimal) {
        return Subtract(eDecimal, EContext.UnlimitedHalfEven);
    }

    public EDecimal Subtract(EDecimal eDecimal, EContext eContext) {
        if (eDecimal == null) {
            throw new NullPointerException("otherValue");
        }
        byte b2 = eDecimal.flags;
        if ((b2 + Ascii.FF) - (12 | b2) == 0) {
            eDecimal = CreateWithFlags(eDecimal.unsignedMantissa, eDecimal.exponent, b2 ^ 1);
        }
        return Add(eDecimal, eContext);
    }

    public byte ToByteChecked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(3);
        if (IsIntegerPartZero()) {
            return (byte) 0;
        }
        if (isNegative()) {
            throw new ArithmeticException("Value out of range");
        }
        return ToEInteger().ToByteChecked();
    }

    public byte ToByteIfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isNegative() && !isZero()) {
            throw new ArithmeticException("Value out of range");
        }
        CheckTrivialOverflow(3);
        return ToEIntegerIfExact().ToByteChecked();
    }

    public byte ToByteUnchecked() {
        if (!isFinite() || IsIntegerPartZero() || this.exponent.CompareToInt(8) >= 0) {
            return (byte) 0;
        }
        return ToEInteger().ToByteUnchecked();
    }

    public double ToDouble() {
        return Double.longBitsToDouble(ToDoubleBits());
    }

    public long ToDoubleBits() {
        long jToInt64Checked;
        long jToInt64Checked2;
        if (IsPositiveInfinity()) {
            return 9218868437227405312L;
        }
        if (IsNegativeInfinity()) {
            return -4503599627370496L;
        }
        if (isNegative() && isZero()) {
            return Long.MIN_VALUE;
        }
        if (isZero()) {
            return 0L;
        }
        if (isFinite()) {
            if (this.exponent.CompareToInt(0) == 0 && this.unsignedMantissa.CanFitInInt64()) {
                long jToInt64 = this.unsignedMantissa.ToInt64();
                if (jToInt64 < 9007199254740992L) {
                    return IntegerToDoubleBits(jToInt64, 0, isNegative());
                }
            }
            if (this.exponent.CompareToInt(0) < 0 && this.exponent.CompareToInt(-8) >= 0 && this.unsignedMantissa.CanFitInInt32()) {
                int iToInt32 = this.unsignedMantissa.ToInt32();
                int i2 = ValueTenPowers[-this.exponent.ToInt32()];
                if (iToInt32 != Integer.MIN_VALUE) {
                    if (iToInt32 % i2 == 0) {
                        return IntegerToDoubleBits(iToInt32 / i2, 0, isNegative());
                    }
                    for (long jAbs = Math.abs(iToInt32); jAbs < 1048576; jAbs <<= 1) {
                    }
                    int iBitLength = NumberUtility.BitLength(iToInt32);
                    int iBitLength2 = NumberUtility.BitLength(i2);
                    int iMax = iBitLength <= iBitLength2 ? (iBitLength2 - iBitLength) + 54 : Math.max(0, 54 - (iBitLength - iBitLength2));
                    if (iBitLength2 + iMax > 63) {
                        EInteger[] eIntegerArrDivRem = EInteger.FromInt32(iToInt32).ShiftLeft(iMax).DivRem(EInteger.FromInt32(i2));
                        EInteger eInteger = eIntegerArrDivRem[0];
                        EInteger eInteger2 = eIntegerArrDivRem[1];
                        if (eInteger.CanFitInInt64() && eInteger2.CanFitInInt64()) {
                            jToInt64Checked = eInteger.ToInt64Checked();
                            jToInt64Checked2 = eInteger2.ToInt64Checked();
                        } else {
                            jToInt64Checked = -1;
                            jToInt64Checked2 = -1;
                        }
                    } else {
                        long j2 = ((long) iToInt32) << iMax;
                        long j3 = i2;
                        jToInt64Checked = j2 / j3;
                        jToInt64Checked2 = j2 - (j3 * jToInt64Checked);
                    }
                    int i3 = -iMax;
                    if (jToInt64Checked >= 9007199254740992L) {
                        while (jToInt64Checked >= 18014398509481984L) {
                            jToInt64Checked2 |= (-1) - (((-1) - 1) | ((-1) - jToInt64Checked));
                            jToInt64Checked >>= 1;
                            i3++;
                        }
                        long j4 = (!((jToInt64Checked & 3) == 3 && jToInt64Checked2 == 0) && ((jToInt64Checked + 1) - (jToInt64Checked | 1) == 0 || jToInt64Checked2 == 0)) ? jToInt64Checked >> 1 : (jToInt64Checked >> 1) + 1;
                        int i4 = i3 + 1;
                        while (j4 >= 9007199254740992L) {
                            j4 >>= 1;
                            i4++;
                        }
                        long j5 = (j4 & 4503599627370495L) | (((long) (i4 + PhotoshopDirectory.TAG_TIMELINE_INFORMATION)) << 52);
                        return isNegative() ? j5 | Long.MIN_VALUE : j5;
                    }
                }
            }
            if (this.exponent.CompareToInt(309) > 0) {
                return isNegative() ? -4503599627370496L : 9218868437227405312L;
            }
        }
        return ToEFloat(EContext.Binary64).ToDoubleBits();
    }

    public EFloat ToEFloat() {
        return ToEFloat(EContext.UnlimitedHalfEven);
    }

    public EFloat ToEFloat(EContext eContext) {
        EInteger exponent = getExponent();
        EInteger unsignedMantissa = getUnsignedMantissa();
        if (IsNaN()) {
            return EFloat.CreateNaN(getUnsignedMantissa(), IsSignalingNaN(), isNegative(), eContext);
        }
        if (IsPositiveInfinity()) {
            return EFloat.PositiveInfinity.RoundToPrecision(eContext);
        }
        if (IsNegativeInfinity()) {
            return EFloat.NegativeInfinity.RoundToPrecision(eContext);
        }
        if (unsignedMantissa.isZero()) {
            return isNegative() ? EFloat.NegativeZero.RoundToPrecision(eContext) : EFloat.Zero.RoundToPrecision(eContext);
        }
        if (exponent.isZero()) {
            return WithThisSign(EFloat.FromEInteger(unsignedMantissa)).RoundToPrecision(eContext);
        }
        EContext eContext2 = EContext.Binary64;
        if (eContext != null && eContext.getHasMaxPrecision() && eContext.getHasExponentRange() && !eContext.isSimplified() && eContext.getEMax().compareTo(eContext2.getEMax()) <= 0 && eContext.getEMin().compareTo(eContext2.getEMin()) >= 0 && eContext.getPrecision().compareTo(eContext2.getPrecision()) <= 0) {
            EInteger[] eIntegerArrDecimalDigitLengthBoundsAsEI = NumberUtility.DecimalDigitLengthBoundsAsEI(unsignedMantissa);
            if (exponent.Add(eIntegerArrDecimalDigitLengthBoundsAsEI[1].Subtract(1)).compareTo(-326) < 0) {
                return EFloat.Create(EInteger.FromInt32(isNegative() ? -1 : 1), eContext.getEMin().Subtract(eContext.getPrecision().Subtract(1)).Subtract(2)).RoundToPrecision(eContext);
            }
            if (exponent.compareTo(309) > 0) {
                return EFloat.GetMathValue().SignalOverflow(eContext, isNegative());
            }
            EInteger eInteger = eIntegerArrDecimalDigitLengthBoundsAsEI[0];
            if (exponent.signum() >= 0) {
                if (eInteger.Subtract(2).compareTo(309) > 0) {
                    return EFloat.GetMathValue().SignalOverflow(eContext, isNegative());
                }
            }
            if (eInteger.Add(exponent).Subtract(2).compareTo(309) > 0) {
                return EFloat.GetMathValue().SignalOverflow(eContext, isNegative());
            }
        }
        if (exponent.signum() > 0) {
            if (eContext == EContext.Binary32) {
                if (exponent.compareTo(39) > 0) {
                    return isNegative() ? EFloat.NegativeInfinity : EFloat.PositiveInfinity;
                }
            } else if (eContext == EContext.Binary64 && exponent.compareTo(309) > 0) {
                return isNegative() ? EFloat.NegativeInfinity : EFloat.PositiveInfinity;
            }
            return WithThisSign(EFloat.FromEInteger(unsignedMantissa.Multiply(NumberUtility.FindPowerOfTenFromBig(exponent)))).RoundToPrecision(eContext);
        }
        EInteger eIntegerFindPowerOfTenFromBig = NumberUtility.FindPowerOfTenFromBig(exponent.Negate());
        if (eContext == null) {
            eContext = EContext.UnlimitedHalfEven;
        }
        if (eContext.getHasMaxPrecision()) {
            EFloat eFloatFromEInteger = EFloat.FromEInteger(unsignedMantissa);
            if (signum() < 0) {
                eFloatFromEInteger = eFloatFromEInteger.Negate();
            }
            return eFloatFromEInteger.Divide(EFloat.FromEInteger(eIntegerFindPowerOfTenFromBig), eContext);
        }
        if (!eContext.getHasFlagsOrTraps()) {
            EFloat eFloatFromEInteger2 = EFloat.FromEInteger(unsignedMantissa);
            if (signum() < 0) {
                eFloatFromEInteger2 = eFloatFromEInteger2.Negate();
            }
            EFloat eFloatFromEInteger3 = EFloat.FromEInteger(eIntegerFindPowerOfTenFromBig);
            EFloat eFloatDivide = eFloatFromEInteger2.Divide(eFloatFromEInteger3, eContext);
            return !eFloatDivide.IsNaN() ? eFloatDivide : eFloatFromEInteger2.Divide(eFloatFromEInteger3, eContext.WithBigPrecision(EInteger.Max(unsignedMantissa.GetUnsignedBitLengthAsEInteger(), EInteger.FromInt32(53))));
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EFloat) eContext.TriggerTraps(ToEFloat(eContextGetNontrapping), eContextGetNontrapping);
        }
        EContext eContextWithBlankFlags = eContext.WithBlankFlags();
        EFloat eFloatFromEInteger4 = EFloat.FromEInteger(unsignedMantissa);
        if (signum() < 0) {
            eFloatFromEInteger4 = eFloatFromEInteger4.Negate();
        }
        EFloat eFloatFromEInteger5 = EFloat.FromEInteger(eIntegerFindPowerOfTenFromBig);
        EFloat eFloatDivide2 = eFloatFromEInteger4.Divide(eFloatFromEInteger5, eContextWithBlankFlags);
        if (!eFloatDivide2.IsNaN()) {
            int flags = eContext.getFlags();
            int flags2 = eContextWithBlankFlags.getFlags();
            eContext.setFlags((flags + flags2) - (flags & flags2));
            return eFloatDivide2;
        }
        EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(EInteger.Max(unsignedMantissa.GetUnsignedBitLengthAsEInteger(), EInteger.FromInt32(53))).WithBlankFlags();
        EFloat eFloatDivide3 = eFloatFromEInteger4.Divide(eFloatFromEInteger5, eContextWithBlankFlags2);
        int flags3 = eContext.getFlags();
        int flags4 = eContextWithBlankFlags2.getFlags();
        eContext.setFlags((flags4 + flags3) - (flags4 & flags3));
        return eFloatDivide3;
    }

    public EInteger ToEInteger() {
        return ToEIntegerInternal(false);
    }

    @Deprecated
    public EInteger ToEIntegerExact() {
        return ToEIntegerInternal(true);
    }

    public EInteger ToEIntegerIfExact() {
        return ToEIntegerInternal(true);
    }

    public String ToEngineeringString() {
        return ToStringInternal(1);
    }

    @Deprecated
    public EFloat ToExtendedFloat() {
        return ToEFloat(EContext.UnlimitedHalfEven);
    }

    public short ToInt16Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(5);
        if (IsIntegerPartZero()) {
            return (short) 0;
        }
        return ToEInteger().ToInt16Checked();
    }

    public short ToInt16IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(5);
        return ToEIntegerIfExact().ToInt16Checked();
    }

    public short ToInt16Unchecked() {
        if (!isFinite() || IsIntegerPartZero() || this.exponent.CompareToInt(16) >= 0) {
            return (short) 0;
        }
        return ToEInteger().ToInt16Unchecked();
    }

    public int ToInt32Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(10);
        if (IsIntegerPartZero()) {
            return 0;
        }
        return ToEInteger().ToInt32Checked();
    }

    public int ToInt32IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isZero()) {
            return 0;
        }
        CheckTrivialOverflow(10);
        return ToEIntegerIfExact().ToInt32Checked();
    }

    public int ToInt32Unchecked() {
        if (!isFinite() || IsIntegerPartZero() || this.exponent.CompareToInt(32) >= 0) {
            return 0;
        }
        return ToEInteger().ToInt32Unchecked();
    }

    public long ToInt64Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        CheckTrivialOverflow(19);
        if (IsIntegerPartZero()) {
            return 0L;
        }
        return ToEInteger().ToInt64Checked();
    }

    public long ToInt64IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isZero()) {
            return 0L;
        }
        CheckTrivialOverflow(19);
        return ToEIntegerIfExact().ToInt64Checked();
    }

    public long ToInt64Unchecked() {
        if (!isFinite() || IsIntegerPartZero() || this.exponent.CompareToInt(64) >= 0) {
            return 0L;
        }
        return ToEInteger().ToInt64Unchecked();
    }

    public String ToPlainString() {
        return ToStringInternal(2);
    }

    public float ToSingle() {
        return Float.intBitsToFloat(ToSingleBits());
    }

    public int ToSingleBits() {
        long jToInt64Checked;
        long jToInt64Checked2;
        int iToInt32;
        if (IsPositiveInfinity()) {
            return 2139095040;
        }
        if (IsNegativeInfinity()) {
            return -8388608;
        }
        if (isNegative() && isZero()) {
            return Integer.MIN_VALUE;
        }
        if (isZero()) {
            return 0;
        }
        if (isFinite()) {
            if (this.exponent.CompareToInt(0) == 0 && this.unsignedMantissa.CanFitInInt32() && (iToInt32 = this.unsignedMantissa.ToInt32()) < 16777216) {
                return IntegerToSingleBits(iToInt32, 0, isNegative());
            }
            if (this.exponent.CompareToInt(0) < 0 && this.exponent.CompareToInt(-6) >= 0 && this.unsignedMantissa.CanFitInInt32()) {
                int iToInt322 = this.unsignedMantissa.ToInt32();
                int i2 = ValueTenPowers[-this.exponent.ToInt32()];
                if (iToInt322 >= -8388608 && iToInt322 < 8388608) {
                    if (iToInt322 % i2 == 0) {
                        return IntegerToSingleBits(iToInt322 / i2, 0, isNegative());
                    }
                    for (long jAbs = Math.abs(iToInt322); jAbs < 8388608; jAbs <<= 1) {
                    }
                    int iBitLength = NumberUtility.BitLength(iToInt322);
                    int iBitLength2 = NumberUtility.BitLength(i2);
                    int iMax = iBitLength <= iBitLength2 ? (iBitLength2 - iBitLength) + 25 : Math.max(0, 25 - (iBitLength - iBitLength2));
                    if (iBitLength2 + iMax > 63) {
                        EInteger[] eIntegerArrDivRem = EInteger.FromInt32(iToInt322).ShiftLeft(iMax).DivRem(EInteger.FromInt32(i2));
                        EInteger eInteger = eIntegerArrDivRem[0];
                        EInteger eInteger2 = eIntegerArrDivRem[1];
                        if (eInteger.CanFitInInt64() && eInteger2.CanFitInInt64()) {
                            jToInt64Checked = eInteger.ToInt64Checked();
                            jToInt64Checked2 = eInteger2.ToInt64Checked();
                        } else {
                            jToInt64Checked = -1;
                            jToInt64Checked2 = -1;
                        }
                    } else {
                        long j2 = ((long) iToInt322) << iMax;
                        long j3 = i2;
                        jToInt64Checked = j2 / j3;
                        jToInt64Checked2 = j2 - (j3 * jToInt64Checked);
                    }
                    int i3 = -iMax;
                    if (jToInt64Checked >= 16777216) {
                        while (jToInt64Checked >= 33554432) {
                            long j4 = (jToInt64Checked + 1) - (jToInt64Checked | 1);
                            jToInt64Checked2 = (jToInt64Checked2 + j4) - (jToInt64Checked2 & j4);
                            jToInt64Checked >>= 1;
                            i3++;
                        }
                        long j5 = (!((jToInt64Checked + 3) - (jToInt64Checked | 3) == 3 && jToInt64Checked2 == 0) && ((jToInt64Checked & 1) == 0 || jToInt64Checked2 == 0)) ? jToInt64Checked >> 1 : (jToInt64Checked >> 1) + 1;
                        int i4 = i3 + 1;
                        while (j5 >= 16777216) {
                            j5 >>= 1;
                            i4++;
                        }
                        int i5 = (int) ((-1) - (((-1) - j5) | ((-1) - 8388607)));
                        int i6 = (i4 + 150) << 23;
                        int i7 = (i6 + i5) - (i6 & i5);
                        return isNegative() ? (-1) - (((-1) - i7) & ((-1) - Integer.MIN_VALUE)) : i7;
                    }
                }
            }
            if (this.exponent.CompareToInt(39) > 0) {
                return isNegative() ? -8388608 : 2139095040;
            }
        }
        return ToEFloat(EContext.Binary32).ToSingleBits();
    }

    public EInteger ToSizedEInteger(int i2) {
        return ToSizedEInteger(i2, false);
    }

    public EInteger ToSizedEIntegerIfExact(int i2) {
        return ToSizedEInteger(i2, true);
    }

    public EDecimal Ulp() {
        return !isFinite() ? One : Create(EInteger.FromInt32(1), getExponent());
    }

    public int compareTo(int i2) {
        return CompareToValue(FromInt32(i2));
    }

    public int compareTo(long j2) {
        return CompareToValue(FromInt64(j2));
    }

    @Override // java.lang.Comparable
    public int compareTo(EDecimal eDecimal) {
        return CompareToValue(eDecimal);
    }

    public boolean equals(EDecimal eDecimal) {
        return EqualsInternal(eDecimal);
    }

    public boolean equals(Object obj) {
        return EqualsInternal(obj instanceof EDecimal ? (EDecimal) obj : null);
    }

    public final EInteger getExponent() {
        return this.exponent.ToEInteger();
    }

    public final EInteger getMantissa() {
        return isNegative() ? this.unsignedMantissa.ToEInteger().Negate() : this.unsignedMantissa.ToEInteger();
    }

    public final EInteger getUnsignedMantissa() {
        return this.unsignedMantissa.ToEInteger();
    }

    public int hashCode() {
        return (this.exponent.hashCode() * 964453723) + 964453631 + (this.unsignedMantissa.hashCode() * 964453939) + (this.flags * 964453967);
    }

    public final boolean isFinite() {
        return (this.flags & Ascii.SO) == 0;
    }

    public final boolean isNegative() {
        byte b2 = this.flags;
        return (b2 + 1) - (b2 | 1) != 0;
    }

    public final boolean isZero() {
        return (this.flags & Ascii.SO) == 0 && this.unsignedMantissa.isValueZero();
    }

    public final int signum() {
        if ((-1) - (((-1) - this.flags) | ((-1) - 14)) == 0 && this.unsignedMantissa.isValueZero()) {
            return 0;
        }
        byte b2 = this.flags;
        return (b2 + 1) - (b2 | 1) != 0 ? -1 : 1;
    }

    public String toString() {
        return ToStringInternal(0);
    }
}

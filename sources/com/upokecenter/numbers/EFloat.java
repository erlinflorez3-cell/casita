package com.upokecenter.numbers;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes5.dex */
public final class EFloat implements Comparable<EFloat> {
    private static final int CacheLast = 128;
    private final FastIntegerFixed exponent;
    private final byte flags;
    private final FastIntegerFixed unsignedMantissa;
    public static final EFloat NaN = new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 4);
    public static final EFloat NegativeInfinity = new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 3);
    public static final EFloat NegativeZero = new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 1);
    public static final EFloat One = new EFloat(FastIntegerFixed.One, FastIntegerFixed.Zero, (byte) 0);
    public static final EFloat PositiveInfinity = new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 2);
    public static final EFloat SignalingNaN = new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 8);
    public static final EFloat Ten = new EFloat(FastIntegerFixed.FromInt32(10), FastIntegerFixed.Zero, (byte) 0);
    public static final EFloat Zero = new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) 0);
    private static final int CacheFirst = -24;
    private static final EFloat[] Cache = EFloatCache(CacheFirst, 128);
    private static final IRadixMath<EFloat> MathValue = new TrappableRadixMath(new ExtendedOrSimpleRadixMath(new BinaryMathHelper()));

    private static final class BinaryMathHelper implements IRadixMathHelper<EFloat> {
        private BinaryMathHelper() {
        }

        /* synthetic */ BinaryMathHelper(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EFloat CreateNewWithFlags(EInteger eInteger, EInteger eInteger2, int i2) {
            return new EFloat(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.FromBig(eInteger2), (byte) i2);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EFloat CreateNewWithFlagsFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, int i2) {
            return new EFloat(fastIntegerFixed, fastIntegerFixed2, (byte) i2);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public IShiftAccumulator CreateShiftAccumulatorWithDigits(EInteger eInteger, int i2, int i3) {
            return new BitShiftAccumulator(eInteger, i2, i3);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public IShiftAccumulator CreateShiftAccumulatorWithDigitsFastInt(FastIntegerFixed fastIntegerFixed, int i2, int i3) {
            return fastIntegerFixed.CanFitInInt32() ? new BitShiftAccumulator(fastIntegerFixed.ToInt32(), i2, i3) : new BitShiftAccumulator(fastIntegerFixed.ToEInteger(), i2, i3);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastInteger DivisionShift(EInteger eInteger, EInteger eInteger2) {
            if (eInteger2.isZero()) {
                return null;
            }
            if (eInteger2.GetUnsignedBit(0) && eInteger2.compareTo(EInteger.FromInt32(1)) != 0) {
                return null;
            }
            EInteger eIntegerGetLowBitAsEInteger = eInteger2.GetLowBitAsEInteger();
            if (eInteger2.GetUnsignedBitLengthAsEInteger().equals(eIntegerGetLowBitAsEInteger.Add(1))) {
                return FastInteger.FromBig(eIntegerGetLowBitAsEInteger);
            }
            return null;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetArithmeticSupport() {
            return 1;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastInteger GetDigitLength(EInteger eInteger) {
            return FastInteger.FromBig(eInteger.GetUnsignedBitLengthAsEInteger());
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EInteger GetExponent(EFloat eFloat) {
            return eFloat.exponent.ToEInteger();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastIntegerFixed GetExponentFastInt(EFloat eFloat) {
            return eFloat.exponent;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetFlags(EFloat eFloat) {
            return eFloat.flags;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EInteger GetMantissa(EFloat eFloat) {
            return eFloat.unsignedMantissa.ToEInteger();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastIntegerFixed GetMantissaFastInt(EFloat eFloat) {
            return eFloat.unsignedMantissa;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetRadix() {
            return 2;
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public int GetSign(EFloat eFloat) {
            return eFloat.signum();
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EInteger MultiplyByRadixPower(EInteger eInteger, FastInteger fastInteger) {
            return fastInteger.signum() <= 0 ? eInteger : eInteger.signum() < 0 ? fastInteger.ShiftEIntegerLeftByThis(eInteger.Negate()).Negate() : fastInteger.ShiftEIntegerLeftByThis(eInteger);
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public FastIntegerFixed MultiplyByRadixPowerFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2) {
            return fastIntegerFixed2.signum() <= 0 ? fastIntegerFixed : FastIntegerFixed.FromBig(MultiplyByRadixPower(fastIntegerFixed.ToEInteger(), FastInteger.FromBig(fastIntegerFixed2.ToEInteger())));
        }

        @Override // com.upokecenter.numbers.IRadixMathHelper
        public EFloat ValueOf(int i2) {
            return EFloat.FromInt32(i2);
        }
    }

    private EFloat(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, byte b2) {
        this.unsignedMantissa = fastIntegerFixed;
        this.exponent = fastIntegerFixed2;
        this.flags = b2;
    }

    /* synthetic */ EFloat(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, byte b2, AnonymousClass1 anonymousClass1) {
        this(fastIntegerFixed, fastIntegerFixed2, b2);
    }

    public static EFloat Create(int i2, int i3) {
        return (i3 != 0 || i2 < CacheFirst || i2 > 128) ? i2 < 0 ? i2 == Integer.MIN_VALUE ? new EFloat(FastIntegerFixed.FromInt64(-2147483648L).Negate(), FastIntegerFixed.FromInt32(i3), (byte) 1) : new EFloat(FastIntegerFixed.FromInt32(-i2), FastIntegerFixed.FromInt32(i3), (byte) 1) : i2 == 0 ? new EFloat(FastIntegerFixed.Zero, FastIntegerFixed.FromInt32(i3), (byte) 0) : new EFloat(FastIntegerFixed.FromInt32(i2), FastIntegerFixed.FromInt32(i3), (byte) 0) : Cache[i2 - CacheFirst];
    }

    public static EFloat Create(long j2, int i2) {
        return Create(j2, i2);
    }

    public static EFloat Create(long j2, long j3) {
        if (j2 >= -2147483648L && j2 <= 2147483647L && j3 >= -2147483648L && j3 <= 2147483647L) {
            return Create((int) j2, (int) j3);
        }
        if (j2 == Long.MIN_VALUE) {
            return new EFloat(FastIntegerFixed.FromInt64(j2).Negate(), FastIntegerFixed.FromInt64(j3), (byte) (j2 >= 0 ? 0 : 1));
        }
        return new EFloat(FastIntegerFixed.FromInt64(Math.abs(j2)), FastIntegerFixed.FromInt64(j3), (byte) (j2 >= 0 ? 0 : 1));
    }

    public static EFloat Create(EInteger eInteger, int i2) {
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
        return new EFloat(fastIntegerFixedFromBig, FastIntegerFixed.FromInt32(i2), (byte) (iSignum < 0 ? 1 : 0));
    }

    public static EFloat Create(EInteger eInteger, long j2) {
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
        return new EFloat(fastIntegerFixedFromBig, FastIntegerFixed.FromInt64(j2), (byte) (iSignum < 0 ? 1 : 0));
    }

    public static EFloat Create(EInteger eInteger, EInteger eInteger2) {
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
        return new EFloat(fastIntegerFixedFromBig, FastIntegerFixed.FromBig(eInteger2), (byte) (iSignum < 0 ? 1 : 0));
    }

    public static EFloat CreateNaN(EInteger eInteger) {
        return CreateNaN(eInteger, false, false, null);
    }

    public static EFloat CreateNaN(EInteger eInteger, boolean z2, boolean z3, EContext eContext) {
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
            return new EFloat(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.Zero, (byte) ((-1) - (((-1) - (z3 ? 1 : 0)) & ((-1) - (z2 ? 8 : 4)))));
        }
        EFloat eFloatRoundToPrecision = new EFloat(FastIntegerFixed.FromBig(eInteger), FastIntegerFixed.Zero, (byte) (((z3 ? 1 : 0) + 4) - ((z3 ? 1 : 0) & 4))).RoundToPrecision(eContext);
        return new EFloat(eFloatRoundToPrecision.unsignedMantissa, eFloatRoundToPrecision.exponent, (byte) ((-1) - (((-1) - ((-1) - (((-1) - eFloatRoundToPrecision.flags) | ((-1) - (-5))))) & ((-1) - (z2 ? 8 : 4)))));
    }

    static EFloat CreateWithFlags(long j2, EInteger eInteger, int i2) {
        if (eInteger != null) {
            return new EFloat(FastIntegerFixed.FromInt64(j2).Abs(), FastIntegerFixed.FromBig(eInteger), (byte) i2);
        }
        throw new NullPointerException("exponent");
    }

    static EFloat CreateWithFlags(EInteger eInteger, EInteger eInteger2, int i2) {
        if (eInteger == null) {
            throw new NullPointerException("mantissa");
        }
        if (eInteger2 != null) {
            return new EFloat(FastIntegerFixed.FromBig(eInteger).Abs(), FastIntegerFixed.FromBig(eInteger2), (byte) i2);
        }
        throw new NullPointerException("exponent");
    }

    private static EFloat[] EFloatCache(int i2, int i3) {
        EFloat[] eFloatArr = new EFloat[(i3 - i2) + 1];
        int i4 = i2;
        while (i4 <= i3) {
            if (i4 == 0) {
                eFloatArr[i4 - i2] = Zero;
            } else if (i4 == 1) {
                eFloatArr[i4 - i2] = One;
            } else if (i4 == 10) {
                eFloatArr[i4 - i2] = Ten;
            } else {
                eFloatArr[i4 - i2] = new EFloat(FastIntegerFixed.FromInt32(Math.abs(i4)), FastIntegerFixed.Zero, (byte) (i4 < 0 ? 1 : 0));
            }
            i4++;
        }
        return eFloatArr;
    }

    public static EFloat FromBoolean(boolean z2) {
        return z2 ? One : Zero;
    }

    public static EFloat FromByte(byte b2) {
        return FromInt32((b2 + 255) - (b2 | 255));
    }

    public static EFloat FromDouble(double d2) {
        return FromDoubleBits(Double.doubleToRawLongBits(d2));
    }

    public static EFloat FromDoubleBits(long j2) {
        long j3 = j2 >> 52;
        int i2 = (int) ((j3 + 2047) - (j3 | 2047));
        int i3 = (j2 >> 63) != 0 ? 1 : 0;
        if (i2 == 2047) {
            if ((j2 + 4503599627370495L) - (j2 | 4503599627370495L) == 0) {
                return i3 != 0 ? NegativeInfinity : PositiveInfinity;
            }
            boolean z2 = (-1) - (((-1) - (j2 >> 32)) | ((-1) - 524288)) != 0;
            long j4 = j2 & 2251799813685247L;
            if (j4 == 0 && i3 == 0) {
                return z2 ? NaN : SignalingNaN;
            }
            return CreateWithFlags(EInteger.FromInt64(j4), EInteger.FromInt32(0), (z2 ? 4 : 8) | i3);
        }
        long j5 = j2 & 4503599627370495L;
        if (i2 == 0) {
            i2++;
        } else {
            j5 = (j5 + 4503599627370496L) - (j5 & 4503599627370496L);
        }
        if (j5 == 0) {
            return i3 != 0 ? NegativeZero : Zero;
        }
        while ((1 & j5) == 0) {
            j5 >>= 1;
            i2++;
        }
        return CreateWithFlags(EInteger.FromInt64(j5), EInteger.FromInt64(i2 - 1075), i3);
    }

    public static EFloat FromEInteger(EInteger eInteger) {
        return Create(eInteger, 0);
    }

    public static EFloat FromInt16(short s2) {
        return FromInt32(s2);
    }

    public static EFloat FromInt32(int i2) {
        if (i2 >= CacheFirst && i2 <= 128) {
            return Cache[i2 - CacheFirst];
        }
        if (i2 == Integer.MIN_VALUE) {
            return FromEInteger(EInteger.FromInt32(i2));
        }
        return new EFloat(FastIntegerFixed.FromInt32(Math.abs(i2)), FastIntegerFixed.Zero, (byte) (i2 < 0 ? 1 : 0));
    }

    public static EFloat FromInt64(long j2) {
        if (j2 >= -24 && j2 <= 128) {
            return Cache[((int) j2) + 24];
        }
        if (j2 == Long.MIN_VALUE) {
            return FromEInteger(EInteger.FromInt64(j2));
        }
        return new EFloat(FastIntegerFixed.FromInt64(Math.abs(j2)), FastIntegerFixed.Zero, (byte) (j2 < 0 ? 1 : 0));
    }

    public static EFloat FromInt64AsUnsigned(long j2) {
        return j2 >= 0 ? FromInt64(j2) : FromEInteger(EInteger.FromInt64AsUnsigned(j2));
    }

    public static EFloat FromSingle(float f2) {
        return FromSingleBits(Float.floatToRawIntBits(f2));
    }

    public static EFloat FromSingleBits(int i2) {
        int i3 = (i2 >> 31) != 0 ? 1 : 0;
        int i4 = (-1) - (((-1) - (i2 >> 23)) | ((-1) - 255));
        int i5 = 8388607 & i2;
        if (i4 == 255) {
            if (i5 == 0) {
                return i3 != 0 ? NegativeInfinity : PositiveInfinity;
            }
            boolean z2 = (-1) - (((-1) - 4194304) | ((-1) - i2)) != 0;
            EInteger eIntegerFromInt32 = EInteger.FromInt32((i2 + 4194303) - (i2 | 4194303));
            int i6 = z2 ? 4 : 8;
            return (eIntegerFromInt32.isZero() && i3 == 0) ? z2 ? NaN : SignalingNaN : CreateWithFlags(eIntegerFromInt32, EInteger.FromInt32(0), (i6 + i3) - (i6 & i3));
        }
        if (i4 == 0) {
            i4++;
        } else {
            i5 = (-1) - (((-1) - i5) & ((-1) - 8388608));
        }
        if (i5 == 0) {
            return i3 != 0 ? NegativeZero : Zero;
        }
        while ((-1) - (((-1) - i5) | ((-1) - 1)) == 0) {
            i4++;
            i5 >>= 1;
        }
        if (i3 != 0) {
            i5 = -i5;
        }
        return Create(EInteger.FromInt32(i5), EInteger.FromInt64(i4 - 150));
    }

    public static EFloat FromString(String str) {
        return FromString(str, 0, str == null ? 0 : str.length(), (EContext) null);
    }

    public static EFloat FromString(String str, int i2, int i3) {
        return FromString(str, i2, i3, (EContext) null);
    }

    public static EFloat FromString(String str, int i2, int i3, EContext eContext) {
        return EFloatTextString.FromString(str, i2, i3, eContext, true);
    }

    public static EFloat FromString(String str, EContext eContext) {
        return FromString(str, 0, str == null ? 0 : str.length(), eContext);
    }

    public static EFloat FromString(byte[] bArr) {
        return FromString(bArr, 0, bArr == null ? 0 : bArr.length, (EContext) null);
    }

    public static EFloat FromString(byte[] bArr, int i2, int i3) {
        return FromString(bArr, i2, i3, (EContext) null);
    }

    public static EFloat FromString(byte[] bArr, int i2, int i3, EContext eContext) {
        return EFloatByteArrayString.FromString(bArr, i2, i3, eContext, true);
    }

    public static EFloat FromString(byte[] bArr, EContext eContext) {
        return FromString(bArr, 0, bArr == null ? 0 : bArr.length, eContext);
    }

    public static EFloat FromString(char[] cArr) {
        return FromString(cArr, 0, cArr == null ? 0 : cArr.length, (EContext) null);
    }

    public static EFloat FromString(char[] cArr, int i2, int i3) {
        return FromString(cArr, i2, i3, (EContext) null);
    }

    public static EFloat FromString(char[] cArr, int i2, int i3, EContext eContext) {
        return EFloatCharArrayString.FromString(cArr, i2, i3, eContext, true);
    }

    public static EFloat FromString(char[] cArr, EContext eContext) {
        return FromString(cArr, 0, cArr == null ? 0 : cArr.length, eContext);
    }

    static IRadixMath<EFloat> GetMathValue() {
        return MathValue;
    }

    public static EFloat Max(EFloat eFloat, EFloat eFloat2) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return Max(eFloat, eFloat2, null);
        }
        throw new NullPointerException("second");
    }

    public static EFloat Max(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return MathValue.Max(eFloat, eFloat2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EFloat MaxMagnitude(EFloat eFloat, EFloat eFloat2) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return MaxMagnitude(eFloat, eFloat2, null);
        }
        throw new NullPointerException("second");
    }

    public static EFloat MaxMagnitude(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return MathValue.MaxMagnitude(eFloat, eFloat2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EFloat Min(EFloat eFloat, EFloat eFloat2) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return Min(eFloat, eFloat2, null);
        }
        throw new NullPointerException("second");
    }

    public static EFloat Min(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return MathValue.Min(eFloat, eFloat2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EFloat MinMagnitude(EFloat eFloat, EFloat eFloat2) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return MinMagnitude(eFloat, eFloat2, null);
        }
        throw new NullPointerException("second");
    }

    public static EFloat MinMagnitude(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("first");
        }
        if (eFloat2 != null) {
            return MathValue.MinMagnitude(eFloat, eFloat2, eContext);
        }
        throw new NullPointerException("second");
    }

    public static EFloat PI(EContext eContext) {
        return MathValue.Pi(eContext);
    }

    private static EInteger PowerOfRadixBitsLowerBound(EInteger eInteger) {
        return eInteger.Abs();
    }

    private static EInteger PowerOfRadixBitsUpperBound(EInteger eInteger) {
        return eInteger.Abs().Add(1);
    }

    static EFloat SignalOverflow(EContext eContext, boolean z2, boolean z3) {
        if (!z3) {
            return MathValue.SignalOverflow(eContext, z2);
        }
        EFloat eFloatCreate = Create(EInteger.FromInt32(0), eContext.getEMax());
        if (z2) {
            eFloatCreate = eFloatCreate.Negate();
        }
        return eFloatCreate.RoundToPrecision(eContext);
    }

    static EFloat SignalUnderflow(EContext eContext, boolean z2, boolean z3) {
        EFloat eFloatCreate = Create(z3 ? EInteger.FromInt32(0) : EInteger.FromInt32(1), eContext.getEMin().Subtract(eContext.getPrecision().Subtract(1)).Subtract(2));
        if (z2) {
            eFloatCreate = eFloatCreate.Negate();
        }
        return eFloatCreate.RoundToPrecision(eContext);
    }

    private String ToDebugString() {
        return "[" + getMantissa().ToRadixString(2) + "," + getMantissa().GetUnsignedBitLengthAsEInteger() + "," + getExponent() + "]";
    }

    private EInteger ToEIntegerInternal(boolean z2) {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isZero()) {
            return EInteger.FromInt32(0);
        }
        int iSignum = getExponent().signum();
        if (iSignum == 0) {
            return getMantissa();
        }
        if (iSignum > 0) {
            EInteger exponent = getExponent();
            EInteger mantissa = getMantissa();
            if (mantissa.isZero()) {
                return mantissa;
            }
            boolean z3 = mantissa.signum() < 0;
            if (z3) {
                mantissa = mantissa.Negate();
            }
            EInteger eIntegerShiftLeft = mantissa.ShiftLeft(exponent);
            return z3 ? eIntegerShiftLeft.Negate() : eIntegerShiftLeft;
        }
        if (z2 && !this.unsignedMantissa.isEvenNumber()) {
            throw new ArithmeticException("Not an exact integer");
        }
        FastInteger fastIntegerNegate = FastInteger.FromBig(getExponent()).Negate();
        BitShiftAccumulator bitShiftAccumulator = new BitShiftAccumulator(getUnsignedMantissa(), 0, 0);
        bitShiftAccumulator.ShiftRight(fastIntegerNegate);
        if (z2 && (bitShiftAccumulator.getLastDiscardedDigit() != 0 || bitShiftAccumulator.getOlderDiscardedDigits() != 0)) {
            throw new ArithmeticException("Not an exact integer");
        }
        EInteger shiftedInt = bitShiftAccumulator.getShiftedInt();
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
                if ((jGetSignedBitLengthAsInt64 - 1) + exponent.ToInt64Checked() > j2) {
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
                long jToInt64Checked = eIntegerAbs.ToInt64Checked() + 1;
                long jToInt64Checked2 = eIntegerAbs.ToInt64Checked();
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
                if (jGetSignedBitLengthAsInt642 < 1048576 && eIntegerAbs.compareTo(2097152) >= 0) {
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

    public EFloat Abs() {
        return isNegative() ? new EFloat(this.unsignedMantissa, this.exponent, (byte) (this.flags & (-2))) : this;
    }

    public EFloat Abs(EContext eContext) {
        return MathValue.Abs(this, eContext);
    }

    public EFloat Add(int i2) {
        return Add(FromInt32(i2));
    }

    public EFloat Add(long j2) {
        return Add(FromInt64(j2));
    }

    public EFloat Add(EFloat eFloat) {
        return Add(eFloat, EContext.UnlimitedHalfEven);
    }

    public EFloat Add(EFloat eFloat, EContext eContext) {
        return MathValue.Add(this, eFloat, eContext);
    }

    public EFloat CompareToSignal(EFloat eFloat, EContext eContext) {
        return MathValue.CompareToWithContext(this, eFloat, true, eContext);
    }

    public int CompareToTotal(EFloat eFloat) {
        if (eFloat == null) {
            return 1;
        }
        boolean zIsNegative = isNegative();
        if (zIsNegative != eFloat.isNegative()) {
            return zIsNegative ? -1 : 1;
        }
        char c2 = 3;
        char c3 = IsSignalingNaN() ? (char) 2 : IsNaN() ? (char) 3 : IsInfinity() ? (char) 1 : (char) 0;
        if (eFloat.IsSignalingNaN()) {
            c2 = 2;
        } else if (!eFloat.IsNaN()) {
            c2 = eFloat.IsInfinity() ? (char) 1 : (char) 0;
        }
        if (c3 > c2) {
            return zIsNegative ? -1 : 1;
        }
        if (c3 < c2) {
            return zIsNegative ? 1 : -1;
        }
        if (c3 >= 2) {
            int iCompareTo = this.unsignedMantissa.compareTo(eFloat.unsignedMantissa);
            return zIsNegative ? -iCompareTo : iCompareTo;
        }
        if (c3 == 1) {
            return 0;
        }
        int iCompareTo2 = compareTo(eFloat);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = this.exponent.compareTo(eFloat.exponent);
        return zIsNegative ? -iCompareTo3 : iCompareTo3;
    }

    public int CompareToTotal(EFloat eFloat, EContext eContext) {
        if (eFloat == null) {
            return 1;
        }
        return (IsSignalingNaN() || eFloat.IsSignalingNaN()) ? CompareToTotal(eFloat) : (eContext == null || !eContext.isSimplified()) ? CompareToTotal(eFloat) : RoundToPrecision(eContext).CompareToTotal(eFloat.RoundToPrecision(eContext));
    }

    public int CompareToTotalMagnitude(EFloat eFloat) {
        if (eFloat == null) {
            return 1;
        }
        char c2 = 3;
        char c3 = IsSignalingNaN() ? (char) 2 : IsNaN() ? (char) 3 : IsInfinity() ? (char) 1 : (char) 0;
        if (eFloat.IsSignalingNaN()) {
            c2 = 2;
        } else if (!eFloat.IsNaN()) {
            c2 = eFloat.IsInfinity() ? (char) 1 : (char) 0;
        }
        if (c3 > c2) {
            return 1;
        }
        if (c3 < c2) {
            return -1;
        }
        if (c3 >= 2) {
            return this.unsignedMantissa.compareTo(eFloat.unsignedMantissa);
        }
        if (c3 == 1) {
            return 0;
        }
        int iCompareTo = Abs().compareTo(eFloat.Abs());
        return iCompareTo == 0 ? this.exponent.compareTo(eFloat.exponent) : iCompareTo;
    }

    public int CompareToTotalMagnitude(EFloat eFloat, EContext eContext) {
        if (eFloat == null) {
            return 1;
        }
        return (IsSignalingNaN() || eFloat.IsSignalingNaN()) ? CompareToTotalMagnitude(eFloat) : (eContext == null || !eContext.isSimplified()) ? CompareToTotalMagnitude(eFloat) : RoundToPrecision(eContext).CompareToTotalMagnitude(eFloat.RoundToPrecision(eContext));
    }

    public int CompareToValue(int i2) {
        return CompareToValue(FromInt32(i2));
    }

    public int CompareToValue(long j2) {
        return CompareToValue(FromInt64(j2));
    }

    public int CompareToValue(EFloat eFloat) {
        return MathValue.compareTo(this, eFloat);
    }

    public EFloat CompareToWithContext(EFloat eFloat, EContext eContext) {
        return MathValue.CompareToWithContext(this, eFloat, false, eContext);
    }

    public EFloat Copy() {
        return new EFloat(this.unsignedMantissa, this.exponent, this.flags);
    }

    public EFloat CopySign(EFloat eFloat) {
        if (eFloat != null) {
            return isNegative() ? eFloat.isNegative() ? this : Negate() : eFloat.isNegative() ? Negate() : this;
        }
        throw new NullPointerException("other");
    }

    public EFloat Decrement() {
        return Subtract(1);
    }

    public EFloat[] DivRemNaturalScale(EFloat eFloat) {
        return DivRemNaturalScale(eFloat, null);
    }

    public EFloat[] DivRemNaturalScale(EFloat eFloat, EContext eContext) {
        EFloat eFloatDivideToIntegerNaturalScale = DivideToIntegerNaturalScale(eFloat, null);
        EFloat[] eFloatArr = {eFloatDivideToIntegerNaturalScale, Subtract(eFloatDivideToIntegerNaturalScale.Multiply(eFloat, null), eContext)};
        eFloatArr[0] = eFloatArr[0].RoundToPrecision(eContext);
        return eFloatArr;
    }

    public EFloat Divide(int i2) {
        return Divide(FromInt32(i2));
    }

    public EFloat Divide(long j2) {
        return Divide(FromInt64(j2));
    }

    public EFloat Divide(EFloat eFloat) {
        return Divide(eFloat, EContext.ForRounding(ERounding.None));
    }

    public EFloat Divide(EFloat eFloat, EContext eContext) {
        return MathValue.Divide(this, eFloat, eContext);
    }

    @Deprecated
    public EFloat[] DivideAndRemainderNaturalScale(EFloat eFloat) {
        return DivRemNaturalScale(eFloat, null);
    }

    @Deprecated
    public EFloat[] DivideAndRemainderNaturalScale(EFloat eFloat, EContext eContext) {
        return DivRemNaturalScale(eFloat, eContext);
    }

    public EFloat DivideToExponent(EFloat eFloat, long j2, EContext eContext) {
        return DivideToExponent(eFloat, EInteger.FromInt64(j2), eContext);
    }

    public EFloat DivideToExponent(EFloat eFloat, long j2, ERounding eRounding) {
        return DivideToExponent(eFloat, EInteger.FromInt64(j2), EContext.ForRounding(eRounding));
    }

    public EFloat DivideToExponent(EFloat eFloat, EInteger eInteger, EContext eContext) {
        return MathValue.DivideToExponent(this, eFloat, eInteger, eContext);
    }

    public EFloat DivideToExponent(EFloat eFloat, EInteger eInteger, ERounding eRounding) {
        return DivideToExponent(eFloat, eInteger, EContext.ForRounding(eRounding));
    }

    public EFloat DivideToIntegerNaturalScale(EFloat eFloat) {
        return DivideToIntegerNaturalScale(eFloat, EContext.ForRounding(ERounding.Down));
    }

    public EFloat DivideToIntegerNaturalScale(EFloat eFloat, EContext eContext) {
        return MathValue.DivideToIntegerNaturalScale(this, eFloat, eContext);
    }

    public EFloat DivideToIntegerZeroScale(EFloat eFloat, EContext eContext) {
        return MathValue.DivideToIntegerZeroScale(this, eFloat, eContext);
    }

    public EFloat DivideToSameExponent(EFloat eFloat, ERounding eRounding) {
        return DivideToExponent(eFloat, this.exponent.ToEInteger(), EContext.ForRounding(eRounding));
    }

    public boolean EqualsInternal(EFloat eFloat) {
        return eFloat != null && this.exponent.equals(eFloat.exponent) && this.unsignedMantissa.equals(eFloat.unsignedMantissa) && this.flags == eFloat.flags;
    }

    public EFloat Exp(EContext eContext) {
        return MathValue.Exp(this, eContext);
    }

    public EFloat ExpM1(EContext eContext) {
        EFloat eFloatAdd;
        if (IsNaN()) {
            return Plus(eContext);
        }
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return SignalingNaN.Plus(eContext);
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EFloat) eContext.TriggerTraps(ExpM1(eContextGetNontrapping), eContextGetNontrapping);
        }
        if (eContext.isSimplified()) {
            EContext eContextWithBlankFlags = eContext.WithSimplified(false).WithBlankFlags();
            EFloat eFloatExpM1 = PreRound(eContext).ExpM1(eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - eContext.getFlags())));
            }
            return eFloatExpM1.RoundToPrecision(eContext);
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
        int flags = eContext.getFlags();
        EInteger eIntegerAdd = eContext.getPrecision().Add(3);
        EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(eIntegerAdd).WithBlankFlags();
        if (Abs().compareTo(Create(1, -1)) < 0) {
            EFloat eFloatAdd2 = Exp(eContextWithBlankFlags2).Add(FromInt32(-1), eContext);
            while (true) {
                eIntegerAdd = eIntegerAdd.Add(eContext.getPrecision()).Add(3);
                eContextWithBlankFlags2 = eContext.WithBigPrecision(eIntegerAdd).WithBlankFlags();
                eFloatAdd = Exp(eContextWithBlankFlags2).Add(FromInt32(-1), eContext);
                if (eFloatAdd.compareTo(0) != 0 && eFloatAdd.compareTo(eFloatAdd2) == 0) {
                    break;
                }
                eFloatAdd2 = eFloatAdd;
            }
        } else {
            eFloatAdd = Exp(eContextWithBlankFlags2).Add(FromInt32(-1), eContext);
        }
        int flags2 = eContextWithBlankFlags2.getFlags() | flags;
        if (eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - flags2) & ((-1) - eContext.getFlags())));
        }
        return eFloatAdd;
    }

    public EFloat Increment() {
        return Add(1);
    }

    public boolean IsInfinity() {
        return (this.flags & 2) != 0;
    }

    public boolean IsInteger() {
        if (!isFinite()) {
            return false;
        }
        if (isZero() || getExponent().compareTo(0) >= 0) {
            return true;
        }
        return getUnsignedMantissa().GetLowBitAsEInteger().compareTo(getExponent().Abs()) >= 0;
    }

    public boolean IsNaN() {
        return (this.flags & Ascii.FF) != 0;
    }

    public boolean IsNegativeInfinity() {
        byte b2 = this.flags;
        return (b2 + 3) - (b2 | 3) == 3;
    }

    public boolean IsPositiveInfinity() {
        return (this.flags & 3) == 2;
    }

    public boolean IsQuietNaN() {
        return (-1) - (((-1) - this.flags) | ((-1) - 4)) != 0;
    }

    public boolean IsSignalingNaN() {
        return (-1) - (((-1) - this.flags) | ((-1) - 8)) != 0;
    }

    public EFloat Log(EContext eContext) {
        return MathValue.Ln(this, eContext);
    }

    public EFloat Log10(EContext eContext) {
        return LogN(FromInt32(10), eContext);
    }

    public EFloat Log1P(EContext eContext) {
        EFloat eFloatLog;
        if (IsNaN()) {
            return Plus(eContext);
        }
        if (eContext == null || !eContext.getHasMaxPrecision() || compareTo(-1) < 0) {
            return SignalingNaN.Plus(eContext);
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EFloat) eContext.TriggerTraps(Log1P(eContextGetNontrapping), eContextGetNontrapping);
        }
        if (eContext.isSimplified()) {
            EContext eContextWithBlankFlags = eContext.WithSimplified(false).WithBlankFlags();
            EFloat eFloatLog1P = PreRound(eContext).Log1P(eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags(eContextWithBlankFlags.getFlags() | eContext.getFlags());
            }
            return eFloatLog1P.RoundToPrecision(eContext);
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
        int flags = eContext.getFlags();
        if (compareTo(Create(1, -1)) < 0) {
            eFloatLog = Add(FromInt32(1)).Log(eContext);
        } else {
            EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(eContext.getPrecision().Add(3)).WithBlankFlags();
            eFloatLog = Add(FromInt32(1), eContextWithBlankFlags2).Log(eContext);
            flags = (-1) - (((-1) - flags) & ((-1) - eContextWithBlankFlags2.getFlags()));
        }
        if (eContext.getHasFlags()) {
            eContext.setFlags(flags | eContext.getFlags());
        }
        return eFloatLog;
    }

    public EFloat LogN(EFloat eFloat, EContext eContext) {
        int flags;
        if (eFloat == null) {
            throw new NullPointerException("baseValue");
        }
        if (IsNaN()) {
            return Plus(eContext);
        }
        if (eFloat.IsNaN()) {
            return eFloat.Plus(eContext);
        }
        if (eContext == null || !eContext.getHasMaxPrecision() || ((isNegative() && !isZero()) || (eFloat.isNegative() && !eFloat.isZero()))) {
            return SignalingNaN.Plus(eContext);
        }
        if (eContext.getTraps() != 0) {
            EContext eContextGetNontrapping = eContext.GetNontrapping();
            return (EFloat) eContext.TriggerTraps(LogN(eFloat, eContextGetNontrapping), eContextGetNontrapping);
        }
        if (eContext.isSimplified()) {
            EContext eContextWithBlankFlags = eContext.WithSimplified(false).WithBlankFlags();
            EFloat eFloatLogN = PreRound(eContext).LogN(eFloat.PreRound(eContext), eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags(eContextWithBlankFlags.getFlags() | eContext.getFlags());
            }
            return eFloatLogN.RoundToPrecision(eContext);
        }
        if (isZero()) {
            return eFloat.compareTo(1) < 0 ? PositiveInfinity : NegativeInfinity;
        }
        if (IsPositiveInfinity()) {
            return eFloat.compareTo(1) < 0 ? NegativeInfinity : PositiveInfinity;
        }
        if (eFloat.compareTo(2) == 0) {
            EFloat eFloatReduce = Reduce(null);
            if (eFloatReduce.getUnsignedMantissa().compareTo(1) == 0) {
                return FromEInteger(eFloatReduce.getExponent()).Plus(eContext);
            }
        } else {
            if (compareTo(1) == 0) {
                return FromInt32(0).Plus(eContext);
            }
            if (compareTo(eFloat) == 0) {
                return FromInt32(1).Plus(eContext);
            }
        }
        int flags2 = eContext.getFlags();
        EContext eContextWithBlankFlags2 = eContext.WithBigPrecision(eContext.getPrecision().Add(3)).WithBlankFlags();
        EFloat eFloatDivide = Log(eContextWithBlankFlags2).Divide(eFloat.Log(eContextWithBlankFlags2), eContext);
        if (!eFloatDivide.IsInteger() || eFloatDivide.isZero()) {
            flags = flags2 | eContextWithBlankFlags2.getFlags();
        } else {
            flags = (flags2 + 3) - (flags2 & 3);
            if (eFloat.Pow(eFloatDivide).CompareToValue(this) == 0) {
                EFloat eFloatQuantize = eFloatDivide.Quantize(FromInt32(1), eContext.WithNoFlags());
                if (!eFloatQuantize.IsNaN()) {
                    flags = (flags - 4) - (flags | (-4));
                    eFloatDivide = eFloatQuantize;
                }
            }
        }
        if (eContext.getHasFlags()) {
            int flags3 = eContext.getFlags();
            eContext.setFlags((flags3 + flags) - (flags3 & flags));
        }
        return eFloatDivide;
    }

    public EFloat MovePointLeft(int i2) {
        return MovePointLeft(EInteger.FromInt32(i2), (EContext) null);
    }

    public EFloat MovePointLeft(int i2, EContext eContext) {
        return MovePointLeft(EInteger.FromInt32(i2), eContext);
    }

    public EFloat MovePointLeft(EInteger eInteger) {
        return MovePointLeft(eInteger, (EContext) null);
    }

    public EFloat MovePointLeft(EInteger eInteger, EContext eContext) {
        return !isFinite() ? RoundToPrecision(eContext) : MovePointRight(eInteger.Negate(), eContext);
    }

    public EFloat MovePointRight(int i2) {
        return MovePointRight(EInteger.FromInt32(i2), (EContext) null);
    }

    public EFloat MovePointRight(int i2, EContext eContext) {
        return MovePointRight(EInteger.FromInt32(i2), eContext);
    }

    public EFloat MovePointRight(EInteger eInteger) {
        return MovePointRight(eInteger, (EContext) null);
    }

    public EFloat MovePointRight(EInteger eInteger, EContext eContext) {
        if (!isFinite()) {
            return RoundToPrecision(eContext);
        }
        EInteger eIntegerAdd = getExponent().Add(eInteger);
        return eIntegerAdd.signum() > 0 ? CreateWithFlags(getUnsignedMantissa().ShiftLeft(eIntegerAdd), EInteger.FromInt32(0), this.flags).RoundToPrecision(eContext) : CreateWithFlags(getUnsignedMantissa(), eIntegerAdd, this.flags).RoundToPrecision(eContext);
    }

    public EFloat Multiply(int i2) {
        return Multiply(FromInt32(i2));
    }

    public EFloat Multiply(long j2) {
        return Multiply(FromInt64(j2));
    }

    public EFloat Multiply(EFloat eFloat) {
        if (eFloat == null) {
            throw new NullPointerException("otherValue");
        }
        if (!isFinite() || !eFloat.isFinite()) {
            return Multiply(eFloat, EContext.UnlimitedHalfEven);
        }
        EInteger eIntegerAdd = getExponent().Add(eFloat.getExponent());
        int i2 = eFloat.flags ^ this.flags;
        if (!this.unsignedMantissa.CanFitInInt32() || !eFloat.unsignedMantissa.CanFitInInt32()) {
            return CreateWithFlags(getUnsignedMantissa().Multiply(eFloat.getUnsignedMantissa()), eIntegerAdd, i2);
        }
        return CreateWithFlags(((long) this.unsignedMantissa.ToInt32()) * ((long) eFloat.unsignedMantissa.ToInt32()), eIntegerAdd, i2);
    }

    public EFloat Multiply(EFloat eFloat, EContext eContext) {
        return MathValue.Multiply(this, eFloat, eContext);
    }

    public EFloat MultiplyAndAdd(EFloat eFloat, EFloat eFloat2) {
        return MultiplyAndAdd(eFloat, eFloat2, null);
    }

    public EFloat MultiplyAndAdd(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        return MathValue.MultiplyAndAdd(this, eFloat, eFloat2, eContext);
    }

    public EFloat MultiplyAndSubtract(EFloat eFloat, EFloat eFloat2, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("op");
        }
        if (eFloat2 == null) {
            throw new NullPointerException("subtrahend");
        }
        byte b2 = eFloat2.flags;
        if ((-1) - (((-1) - b2) | ((-1) - 12)) == 0) {
            eFloat2 = new EFloat(eFloat2.unsignedMantissa, eFloat2.exponent, (byte) (b2 ^ 1));
        }
        return MathValue.MultiplyAndAdd(this, eFloat, eFloat2, eContext);
    }

    public EFloat Negate() {
        return new EFloat(this.unsignedMantissa, this.exponent, (byte) (this.flags ^ 1));
    }

    public EFloat Negate(EContext eContext) {
        return MathValue.Negate(this, eContext);
    }

    public EFloat NextMinus(EContext eContext) {
        return MathValue.NextMinus(this, eContext);
    }

    public EFloat NextPlus(EContext eContext) {
        return MathValue.NextPlus(this, eContext);
    }

    public EFloat NextToward(EFloat eFloat, EContext eContext) {
        return MathValue.NextToward(this, eFloat, eContext);
    }

    public EFloat Plus(EContext eContext) {
        return MathValue.Plus(this, eContext);
    }

    public EFloat Pow(int i2) {
        return Pow(FromInt64(i2), (EContext) null);
    }

    public EFloat Pow(int i2, EContext eContext) {
        return Pow(FromInt64(i2), eContext);
    }

    public EFloat Pow(EFloat eFloat) {
        return Pow(eFloat, (EContext) null);
    }

    public EFloat Pow(EFloat eFloat, EContext eContext) {
        return MathValue.Power(this, eFloat, eContext);
    }

    public EFloat PreRound(EContext eContext) {
        return (EFloat) NumberUtility.PreRound(this, eContext, MathValue);
    }

    public EInteger Precision() {
        return !isFinite() ? EInteger.FromInt32(0) : isZero() ? EInteger.FromInt32(1) : getUnsignedMantissa().GetSignedBitLengthAsEInteger();
    }

    public EFloat Quantize(int i2, EContext eContext) {
        return Quantize(Create(1, i2), eContext);
    }

    public EFloat Quantize(EFloat eFloat, EContext eContext) {
        return MathValue.Quantize(this, eFloat, eContext);
    }

    public EFloat Quantize(EInteger eInteger, EContext eContext) {
        return Quantize(Create(EInteger.FromInt32(1), eInteger), eContext);
    }

    public EFloat Reduce(EContext eContext) {
        return MathValue.Reduce(this, eContext);
    }

    public EFloat Remainder(EFloat eFloat, EContext eContext) {
        return MathValue.Remainder(this, eFloat, eContext, true);
    }

    public EFloat RemainderNaturalScale(EFloat eFloat) {
        return RemainderNaturalScale(eFloat, null);
    }

    public EFloat RemainderNaturalScale(EFloat eFloat, EContext eContext) {
        return Subtract(DivideToIntegerNaturalScale(eFloat, null).Multiply(eFloat, null), eContext);
    }

    public EFloat RemainderNear(EFloat eFloat, EContext eContext) {
        return MathValue.RemainderNear(this, eFloat, eContext);
    }

    public EFloat RemainderNoRoundAfterDivide(EFloat eFloat, EContext eContext) {
        return MathValue.Remainder(this, eFloat, eContext, false);
    }

    public EFloat RoundToExponent(int i2, EContext eContext) {
        return RoundToExponent(EInteger.FromInt32(i2), eContext);
    }

    public EFloat RoundToExponent(EInteger eInteger, EContext eContext) {
        return MathValue.RoundToExponentSimple(this, eInteger, eContext);
    }

    public EFloat RoundToExponentExact(int i2, EContext eContext) {
        return RoundToExponentExact(EInteger.FromInt32(i2), eContext);
    }

    public EFloat RoundToExponentExact(EInteger eInteger, EContext eContext) {
        return MathValue.RoundToExponentExact(this, eInteger, eContext);
    }

    public EFloat RoundToExponentExact(EInteger eInteger, ERounding eRounding) {
        return MathValue.RoundToExponentExact(this, eInteger, EContext.Unlimited.WithRounding(eRounding));
    }

    public EFloat RoundToIntegerExact(EContext eContext) {
        return MathValue.RoundToExponentExact(this, EInteger.FromInt32(0), eContext);
    }

    public EFloat RoundToIntegerNoRoundedFlag(EContext eContext) {
        return MathValue.RoundToExponentNoRoundedFlag(this, EInteger.FromInt32(0), eContext);
    }

    @Deprecated
    public EFloat RoundToIntegralExact(EContext eContext) {
        return MathValue.RoundToExponentExact(this, EInteger.FromInt32(0), eContext);
    }

    @Deprecated
    public EFloat RoundToIntegralNoRoundedFlag(EContext eContext) {
        return MathValue.RoundToExponentNoRoundedFlag(this, EInteger.FromInt32(0), eContext);
    }

    public EFloat RoundToPrecision(EContext eContext) {
        return MathValue.RoundToPrecision(this, eContext);
    }

    public EFloat ScaleByPowerOfTwo(int i2) {
        return ScaleByPowerOfTwo(EInteger.FromInt32(i2), (EContext) null);
    }

    public EFloat ScaleByPowerOfTwo(int i2, EContext eContext) {
        return ScaleByPowerOfTwo(EInteger.FromInt32(i2), eContext);
    }

    public EFloat ScaleByPowerOfTwo(EInteger eInteger) {
        return ScaleByPowerOfTwo(eInteger, (EContext) null);
    }

    public EFloat ScaleByPowerOfTwo(EInteger eInteger, EContext eContext) {
        if (eInteger == null) {
            throw new NullPointerException("bigPlaces");
        }
        if (!eInteger.isZero() && isFinite()) {
            return new EFloat(this.unsignedMantissa, FastIntegerFixed.FromBig(getExponent().Add(eInteger)), this.flags).RoundToPrecision(eContext);
        }
        return RoundToPrecision(eContext);
    }

    public EFloat Sqrt(EContext eContext) {
        return MathValue.SquareRoot(this, eContext);
    }

    @Deprecated
    public EFloat SquareRoot(EContext eContext) {
        return MathValue.SquareRoot(this, eContext);
    }

    public EFloat Subtract(int i2) {
        return i2 == Integer.MIN_VALUE ? Subtract(FromInt32(i2)) : Add(-i2);
    }

    public EFloat Subtract(long j2) {
        return Subtract(FromInt64(j2));
    }

    public EFloat Subtract(EFloat eFloat) {
        return Subtract(eFloat, null);
    }

    public EFloat Subtract(EFloat eFloat, EContext eContext) {
        if (eFloat == null) {
            throw new NullPointerException("otherValue");
        }
        byte b2 = eFloat.flags;
        if ((b2 + Ascii.FF) - (12 | b2) == 0) {
            eFloat = new EFloat(eFloat.unsignedMantissa, eFloat.exponent, (byte) (b2 ^ 1));
        }
        return Add(eFloat, eContext);
    }

    public byte ToByteChecked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isZero()) {
            return (byte) 0;
        }
        return ToEInteger().ToByteChecked();
    }

    public byte ToByteIfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
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
        return Double.longBitsToDouble(ToDoubleBits());
    }

    public long ToDoubleBits() {
        if (IsPositiveInfinity()) {
            return 9218868437227405312L;
        }
        if (IsNegativeInfinity()) {
            return -4503599627370496L;
        }
        boolean z2 = false;
        if (IsNaN()) {
            int[] iArr = {0, 2146435072};
            if (isNegative()) {
                int i2 = iArr[1];
                iArr[1] = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            }
            if (IsQuietNaN()) {
                iArr[1] = iArr[1] | 524288;
            } else if (getUnsignedMantissa().isZero()) {
                iArr[1] = (-1) - (((-1) - iArr[1]) & ((-1) - 262144));
            }
            if (!getUnsignedMantissa().isZero()) {
                int[] iArrGetLastWords = FastInteger.GetLastWords(getUnsignedMantissa(), 2);
                iArr[0] = iArrGetLastWords[0];
                int i3 = iArr[1];
                int i4 = iArrGetLastWords[1];
                int i5 = (i4 + 524287) - (i4 | 524287);
                iArr[1] = (i3 + i5) - (i3 & i5);
                int i6 = iArrGetLastWords[0];
                int i7 = iArrGetLastWords[1];
                int i8 = (i7 + 524287) - (i7 | 524287);
                if ((i8 + i6) - (i8 & i6) == 0 && !IsQuietNaN()) {
                    int i9 = iArr[1];
                    iArr[1] = (i9 + 262144) - (i9 & 262144);
                }
            }
            long j2 = iArr[0];
            return ((j2 + 4294967295L) - (j2 | 4294967295L)) | (((long) iArr[1]) << 32);
        }
        EFloat eFloatRoundToPrecision = (!isFinite() || this.unsignedMantissa.CompareToInt64(4503599627370496L) >= 0 || this.exponent.CompareToInt(-900) < 0 || this.exponent.CompareToInt(900) > 0) ? RoundToPrecision(EContext.Binary64) : this;
        if (!eFloatRoundToPrecision.isFinite()) {
            return eFloatRoundToPrecision.ToDoubleBits();
        }
        long jToInt64 = eFloatRoundToPrecision.unsignedMantissa.ToInt64();
        if (eFloatRoundToPrecision.isNegative() && jToInt64 == 0) {
            return Long.MIN_VALUE;
        }
        if (jToInt64 == 0) {
            return 0L;
        }
        long jBitLength = NumberUtility.BitLength(jToInt64);
        int iToInt32 = eFloatRoundToPrecision.exponent.ToInt32();
        if (jBitLength < 53) {
            int i10 = 53 - ((int) jBitLength);
            iToInt32 -= i10;
            if (iToInt32 < -1074) {
                i10 -= (-1074) - iToInt32;
                z2 = true;
                iToInt32 = -1074;
            }
            jToInt64 <<= i10;
        }
        long j3 = (jToInt64 + 4503599627370495L) - (jToInt64 | 4503599627370495L);
        if (!z2) {
            long j4 = ((long) (iToInt32 + PhotoshopDirectory.TAG_TIMELINE_INFORMATION)) << 52;
            j3 = (j3 + j4) - (j3 & j4);
        }
        return eFloatRoundToPrecision.isNegative() ? (j3 - Long.MIN_VALUE) - (j3 & Long.MIN_VALUE) : j3;
    }

    public EDecimal ToEDecimal() {
        return EDecimal.FromEFloat(this);
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
        return ToEDecimal().ToEngineeringString();
    }

    @Deprecated
    public EDecimal ToExtendedDecimal() {
        return EDecimal.FromEFloat(this);
    }

    public short ToInt16Checked() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (isZero()) {
            return (short) 0;
        }
        return ToEInteger().ToInt16Checked();
    }

    public short ToInt16IfExact() {
        if (!isFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
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
        if (isZero()) {
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
        if (isZero()) {
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
        return ToEIntegerIfExact().ToInt64Checked();
    }

    public long ToInt64Unchecked() {
        if (isFinite()) {
            return ToEInteger().ToInt64Unchecked();
        }
        return 0L;
    }

    public String ToPlainString() {
        return ToEDecimal().ToPlainString();
    }

    public String ToShortestString(EContext eContext) {
        EDecimal eDecimalRoundToPrecision;
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return toString();
        }
        if (IsNaN()) {
            return CreateNaN(getUnsignedMantissa(), IsSignalingNaN(), isNegative(), eContext).toString();
        }
        if (IsInfinity()) {
            return RoundToPrecision(eContext).toString();
        }
        EContext eContextWithNoFlags = eContext.WithNoFlags();
        EFloat eFloatRoundToPrecision = RoundToPrecision(eContext);
        if (eFloatRoundToPrecision.IsInfinity()) {
            return eFloatRoundToPrecision.toString();
        }
        if (isZero()) {
            return RoundToPrecision(eContext).toString();
        }
        EDecimal eDecimalToEDecimal = ToEDecimal();
        if (eContext.getPrecision().compareTo(10) >= 0) {
            EInteger eIntegerAdd = eContext.getPrecision().ShiftRight(1).Add(EInteger.FromInt32(3));
            EInteger unsignedMantissa = eDecimalToEDecimal.getUnsignedMantissa();
            EInteger exponent = eDecimalToEDecimal.getExponent();
            boolean zIsNegative = eDecimalToEDecimal.isNegative();
            DigitShiftAccumulator digitShiftAccumulator = new DigitShiftAccumulator(unsignedMantissa, 0, 0);
            digitShiftAccumulator.ShiftToDigits(FastInteger.FromBig(eIntegerAdd), null, false);
            EInteger shiftedInt = digitShiftAccumulator.getShiftedInt();
            EInteger eIntegerAdd2 = exponent.Add(digitShiftAccumulator.getDiscardedDigitCount().ToEInteger());
            if ((digitShiftAccumulator.getLastDiscardedDigit() != 0 || digitShiftAccumulator.getOlderDiscardedDigits() != 0) && shiftedInt.Remainder(10).ToInt32Checked() != 9) {
                shiftedInt = shiftedInt.Add(1);
            }
            eDecimalToEDecimal = EDecimal.Create(shiftedInt, eIntegerAdd2);
            if (zIsNegative) {
                eDecimalToEDecimal = eDecimalToEDecimal.Negate();
            }
        }
        boolean zIsPowerOfTwo = getUnsignedMantissa().isPowerOfTwo();
        EInteger eIntegerFromInt32 = EInteger.FromInt32(0);
        while (true) {
            EInteger eIntegerAdd3 = eIntegerFromInt32.Add(EInteger.FromInt32(1));
            eDecimalRoundToPrecision = eDecimalToEDecimal.RoundToPrecision(eContextWithNoFlags.WithBigPrecision(eIntegerAdd3));
            if (eDecimalRoundToPrecision.ToEFloat(eContextWithNoFlags).compareTo(eFloatRoundToPrecision) == 0) {
                break;
            }
            eIntegerFromInt32 = eIntegerAdd3;
        }
        if (zIsPowerOfTwo && eIntegerFromInt32.signum() > 0) {
            EContext eContextWithBigPrecision = eContextWithNoFlags.WithBigPrecision(eIntegerFromInt32);
            EDecimal eDecimalNextPlus = eDecimalToEDecimal.RoundToPrecision(eContextWithBigPrecision).NextPlus(eContextWithBigPrecision);
            if (eDecimalNextPlus.ToEFloat(eContextWithNoFlags).compareTo(eFloatRoundToPrecision) == 0) {
                eDecimalRoundToPrecision = eDecimalNextPlus;
            }
        }
        return (eDecimalRoundToPrecision.getExponent().signum() <= 0 || eDecimalRoundToPrecision.Abs().compareTo(EDecimal.FromInt32(10000000)) >= 0) ? eDecimalRoundToPrecision.toString() : eDecimalRoundToPrecision.ToPlainString();
    }

    public float ToSingle() {
        return Float.intBitsToFloat(ToSingleBits());
    }

    public int ToSingleBits() {
        if (IsPositiveInfinity()) {
            return 2139095040;
        }
        if (IsNegativeInfinity()) {
            return -8388608;
        }
        if (IsNaN()) {
            int i2 = isNegative() ? -8388608 : 2139095040;
            if (IsQuietNaN()) {
                i2 |= 4194304;
            } else if (getUnsignedMantissa().isZero()) {
                i2 = (-1) - (((-1) - i2) & ((-1) - 2097152));
            }
            if (getUnsignedMantissa().isZero()) {
                return i2;
            }
            int iToInt32Checked = getUnsignedMantissa().Remainder(EInteger.FromInt64(4194304L)).ToInt32Checked();
            int i3 = (-1) - (((-1) - i2) & ((-1) - iToInt32Checked));
            return (iToInt32Checked != 0 || IsQuietNaN()) ? i3 : (-1) - (((-1) - i3) & ((-1) - 2097152));
        }
        EFloat eFloatRoundToPrecision = (!isFinite() || this.unsignedMantissa.CompareToInt(16777216) >= 0 || this.exponent.CompareToInt(-95) < 0 || this.exponent.CompareToInt(95) > 0) ? RoundToPrecision(EContext.Binary32) : this;
        if (!eFloatRoundToPrecision.isFinite()) {
            return eFloatRoundToPrecision.ToSingleBits();
        }
        int iToInt32 = eFloatRoundToPrecision.unsignedMantissa.ToInt32();
        if (eFloatRoundToPrecision.isNegative() && iToInt32 == 0) {
            return Integer.MIN_VALUE;
        }
        boolean z2 = false;
        if (iToInt32 == 0) {
            return 0;
        }
        int iBitLength = NumberUtility.BitLength(iToInt32);
        int iToInt322 = eFloatRoundToPrecision.exponent.ToInt32();
        if (iBitLength < 24) {
            int i4 = 24 - iBitLength;
            iToInt322 -= i4;
            if (iToInt322 < -149) {
                i4 -= (-149) - iToInt322;
                z2 = true;
                iToInt322 = -149;
            }
            iToInt32 <<= i4;
        }
        int i5 = (iToInt32 + 8388607) - (iToInt32 | 8388607);
        if (!z2) {
            int i6 = (iToInt322 + 150) << 23;
            i5 = (i5 + i6) - (i5 & i6);
        }
        return isNegative() ? (-1) - (((-1) - i5) & ((-1) - Integer.MIN_VALUE)) : i5;
    }

    public EInteger ToSizedEInteger(int i2) {
        return ToSizedEInteger(i2, false);
    }

    public EInteger ToSizedEIntegerIfExact(int i2) {
        return ToSizedEInteger(i2, true);
    }

    public EFloat Ulp() {
        return !isFinite() ? One : Create(EInteger.FromInt32(1), getExponent());
    }

    public int compareTo(int i2) {
        return CompareToValue(FromInt32(i2));
    }

    public int compareTo(long j2) {
        return CompareToValue(FromInt64(j2));
    }

    @Override // java.lang.Comparable
    public int compareTo(EFloat eFloat) {
        return MathValue.compareTo(this, eFloat);
    }

    public boolean equals(EFloat eFloat) {
        return EqualsInternal(eFloat);
    }

    public boolean equals(Object obj) {
        return EqualsInternal(obj instanceof EFloat ? (EFloat) obj : null);
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
        return (this.exponent.hashCode() * 403797019) + 403796923 + (this.unsignedMantissa.hashCode() * 403797059) + (this.flags * 403797127);
    }

    public final boolean isFinite() {
        return (-1) - (((-1) - this.flags) | ((-1) - 14)) == 0;
    }

    public final boolean isNegative() {
        return (this.flags & 1) != 0;
    }

    public final boolean isZero() {
        byte b2 = this.flags;
        return (b2 + Ascii.SO) - (b2 | Ascii.SO) == 0 && this.unsignedMantissa.isValueZero();
    }

    public final int signum() {
        if ((-1) - (((-1) - this.flags) | ((-1) - 14)) == 0 && this.unsignedMantissa.isValueZero()) {
            return 0;
        }
        return (this.flags & 1) != 0 ? -1 : 1;
    }

    public String toString() {
        return EDecimal.FromEFloat(this).toString();
    }
}

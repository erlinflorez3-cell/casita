package com.upokecenter.numbers;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class EContext {
    public static final int FlagClamped = 32;
    public static final int FlagDivideByZero = 128;
    public static final int FlagInexact = 1;
    public static final int FlagInvalid = 64;
    public static final int FlagLostDigits = 256;
    public static final int FlagOverflow = 16;
    public static final int FlagRounded = 2;
    public static final int FlagSubnormal = 4;
    public static final int FlagUnderflow = 8;
    private final boolean adjustExponent;
    private final EInteger bigintPrecision;
    private final boolean clampNormalExponents;
    private final EInteger exponentMax;
    private final EInteger exponentMin;
    private int flags;
    private final boolean hasExponentRange;
    private final boolean hasFlags;
    private final boolean precisionInBits;
    private final ERounding rounding;
    private final boolean simplified;
    private final int traps;
    public static final EContext Basic = ForPrecisionAndRounding(9, ERounding.HalfUp);
    public static final EContext BigDecimalJava = new EContext(0, ERounding.HalfUp, 0, 0, true).WithExponentClamp(true).WithAdjustExponent(false).WithBigExponentRange(EInteger.FromInt32(0).Subtract(EInteger.FromInt64(2147483647L)), EInteger.FromInt32(1).Add(EInteger.FromInt64(2147483647L)));
    public static final EContext Binary128 = ForPrecisionAndRounding(113, ERounding.HalfEven).WithExponentClamp(true).WithExponentRange(-16382, 16383);
    public static final EContext Binary16 = ForPrecisionAndRounding(11, ERounding.HalfEven).WithExponentClamp(true).WithExponentRange(-14, 15);
    public static final EContext Binary32 = ForPrecisionAndRounding(24, ERounding.HalfEven).WithExponentClamp(true).WithExponentRange(-126, 127);
    public static final EContext Binary64 = ForPrecisionAndRounding(53, ERounding.HalfEven).WithExponentClamp(true).WithExponentRange(-1022, 1023);
    public static final EContext CliDecimal = new EContext(96, ERounding.HalfEven, 0, 28, true).WithPrecisionInBits(true);
    public static final EContext Decimal128 = new EContext(34, ERounding.HalfEven, -6143, 6144, true);
    public static final EContext Decimal32 = new EContext(7, ERounding.HalfEven, -95, 96, true);
    public static final EContext Decimal64 = new EContext(16, ERounding.HalfEven, -383, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, true);
    public static final EContext Unlimited = ForPrecision(0);
    public static final EContext UnlimitedHalfEven = ForPrecision(0).WithRounding(ERounding.HalfEven);
    private static final EContext ForRoundingHalfEven = new EContext(0, ERounding.HalfEven, 0, 0, false).WithUnlimitedExponents();
    private static final EContext ForRoundingDown = new EContext(0, ERounding.Down, 0, 0, false).WithUnlimitedExponents();

    public EContext(int i2, ERounding eRounding, int i3, int i4, boolean z2) {
        this(true, EInteger.FromInt32(i2), z2, EInteger.FromInt32(i4), EInteger.FromInt32(i3), 0, true, false, false, eRounding, false, 0);
    }

    public EContext(EInteger eInteger, ERounding eRounding, EInteger eInteger2, EInteger eInteger3, boolean z2) {
        this(true, eInteger, z2, eInteger3, eInteger2, 0, true, false, false, eRounding, false, 0);
    }

    private EContext(boolean z2, EInteger eInteger, boolean z3, EInteger eInteger2, EInteger eInteger3, int i2, boolean z4, boolean z5, boolean z6, ERounding eRounding, boolean z7, int i3) {
        if (eInteger == null) {
            throw new NullPointerException("bigintPrecision");
        }
        if (eInteger3 == null) {
            throw new NullPointerException("exponentMin");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("exponentMax");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("precision(" + eInteger + ") is less than 0");
        }
        if (eInteger3.compareTo(eInteger2) > 0) {
            throw new IllegalArgumentException("exponentMinSmall(" + eInteger3 + ") is more than " + eInteger2);
        }
        this.adjustExponent = z2;
        this.bigintPrecision = eInteger;
        this.clampNormalExponents = z3;
        this.exponentMax = eInteger2;
        this.exponentMin = eInteger3;
        this.flags = i2;
        this.hasExponentRange = z4;
        this.hasFlags = z5;
        this.precisionInBits = z6;
        this.rounding = eRounding;
        this.simplified = z7;
        this.traps = i3;
    }

    public static EContext ForPrecision(int i2) {
        return new EContext(i2, ERounding.HalfUp, 0, 0, false).WithUnlimitedExponents();
    }

    public static EContext ForPrecisionAndRounding(int i2, ERounding eRounding) {
        return new EContext(i2, eRounding, 0, 0, false).WithUnlimitedExponents();
    }

    public static EContext ForRounding(ERounding eRounding) {
        return eRounding == ERounding.HalfEven ? ForRoundingHalfEven : eRounding == ERounding.Down ? ForRoundingDown : new EContext(0, eRounding, 0, 0, false).WithUnlimitedExponents();
    }

    public EContext Copy() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public boolean ExponentWithinRange(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("exponent");
        }
        if (!getHasExponentRange()) {
            return true;
        }
        if (this.bigintPrecision.isZero()) {
            return eInteger.compareTo(getEMax()) <= 0;
        }
        return (this.adjustExponent ? eInteger.Add(this.bigintPrecision).Subtract(1) : eInteger).compareTo(getEMin()) >= 0 && eInteger.compareTo(getEMax()) <= 0;
    }

    public EContext GetNontrapping() {
        return getTraps() == 0 ? this : WithTraps(0).WithBlankFlags();
    }

    public <T> T TriggerTraps(T t2, EContext eContext) {
        if (eContext == null || eContext.getFlags() == 0) {
            return t2;
        }
        if (getHasFlags()) {
            this.flags = (-1) - (((-1) - this.flags) & ((-1) - eContext.getFlags()));
        }
        int flags = (-1) - (((-1) - eContext.getFlags()) | ((-1) - getTraps()));
        if (flags == 0) {
            return t2;
        }
        int i2 = (flags - 40) - ((-40) | flags);
        if (i2 != 0) {
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = (1 << i3) & i2;
                if (i4 != 0) {
                    throw new ETrapException(flags, i4, this, t2);
                }
            }
        }
        int i5 = (-1) - (((-1) - flags) | ((-1) - 4));
        if (i5 != 0) {
            throw new ETrapException(flags, i5, this, t2);
        }
        int i6 = (-1) - (((-1) - flags) | ((-1) - 1));
        if (i6 != 0) {
            throw new ETrapException(flags, i6, this, t2);
        }
        int i7 = flags & 2;
        if (i7 != 0) {
            throw new ETrapException(flags, i7, this, t2);
        }
        int i8 = (flags + 32) - (32 | flags);
        if (i8 == 0) {
            return t2;
        }
        throw new ETrapException(flags, i8, this, t2);
    }

    public EContext WithAdjustExponent(boolean z2) {
        return new EContext(z2, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithBigExponentRange(EInteger eInteger, EInteger eInteger2) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, eInteger2, eInteger, this.flags, true, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithBigPrecision(EInteger eInteger) {
        return new EContext(this.adjustExponent, eInteger, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithBlankFlags() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, 0, this.hasExponentRange, true, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithExponentClamp(boolean z2) {
        return new EContext(this.adjustExponent, this.bigintPrecision, z2, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithExponentRange(int i2, int i3) {
        return WithBigExponentRange(EInteger.FromInt32(i2), EInteger.FromInt32(i3));
    }

    public EContext WithNoFlags() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, 0, this.hasExponentRange, false, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public EContext WithNoFlagsOrTraps() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, 0, this.hasExponentRange, false, this.precisionInBits, this.rounding, this.simplified, 0);
    }

    public EContext WithPrecision(int i2) {
        return WithBigPrecision(EInteger.FromInt32(i2));
    }

    public EContext WithPrecisionInBits(boolean z2) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, z2, this.rounding, this.simplified, this.traps);
    }

    public EContext WithRounding(ERounding eRounding) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, eRounding, this.simplified, this.traps);
    }

    public EContext WithSimplified(boolean z2) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, this.hasFlags, this.precisionInBits, this.rounding, z2, this.traps);
    }

    public EContext WithTraps(int i2) {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, this.hasExponentRange, true, this.precisionInBits, this.rounding, this.simplified, i2);
    }

    public EContext WithUnlimitedExponents() {
        return new EContext(this.adjustExponent, this.bigintPrecision, this.clampNormalExponents, this.exponentMax, this.exponentMin, this.flags, false, this.hasFlags, this.precisionInBits, this.rounding, this.simplified, this.traps);
    }

    public final boolean getAdjustExponent() {
        return this.adjustExponent;
    }

    public final boolean getClampNormalExponents() {
        return this.hasExponentRange && this.clampNormalExponents;
    }

    public final EInteger getEMax() {
        return this.hasExponentRange ? this.exponentMax : EInteger.FromInt32(0);
    }

    public final EInteger getEMin() {
        return this.hasExponentRange ? this.exponentMin : EInteger.FromInt32(0);
    }

    public final int getFlags() {
        return this.flags;
    }

    public final boolean getHasExponentRange() {
        return this.hasExponentRange;
    }

    public final boolean getHasFlags() {
        return this.hasFlags;
    }

    public final boolean getHasFlagsOrTraps() {
        return getHasFlags() || getTraps() != 0;
    }

    public final boolean getHasMaxPrecision() {
        return !this.bigintPrecision.isZero();
    }

    public final EInteger getPrecision() {
        return this.bigintPrecision;
    }

    public final ERounding getRounding() {
        return this.rounding;
    }

    public final int getTraps() {
        return this.traps;
    }

    public final boolean isPrecisionInBits() {
        return this.precisionInBits;
    }

    public final boolean isSimplified() {
        return this.simplified;
    }

    public final void setFlags(int i2) {
        if (!getHasFlags()) {
            throw new IllegalStateException("Can't set flags");
        }
        this.flags = i2;
    }

    public String toString() {
        return "[PrecisionContext ExponentMax=" + this.exponentMax + ", Traps=" + this.traps + ", ExponentMin=" + this.exponentMin + ", HasExponentRange=" + this.hasExponentRange + ", BigintPrecision=" + this.bigintPrecision + ", Rounding=" + this.rounding + ", ClampNormalExponents=" + this.clampNormalExponents + ", AdjustExponent=" + this.adjustExponent + ", Flags=" + this.flags + ", HasFlags=" + this.hasFlags + ", IsSimplified=" + this.simplified + "]";
    }
}

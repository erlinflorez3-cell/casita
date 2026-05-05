package com.upokecenter.numbers;

import androidx.compose.animation.core.AnimationKt;

/* JADX INFO: loaded from: classes5.dex */
final class BitShiftAccumulator implements IShiftAccumulator {
    private static final int SmallBitLength = 32;
    private int bitLeftmost;
    private int bitsAfterLeftmost;
    private FastInteger discardedBitCount;
    private boolean isSmall;
    private FastInteger knownBitLength;
    private EInteger shiftedBigInt;
    private int shiftedSmall;

    public BitShiftAccumulator(int i2, int i3, int i4) {
        this.shiftedSmall = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException("shiftedSmall(" + this.shiftedSmall + ") is less than 0");
        }
        this.isSmall = true;
        this.discardedBitCount = new FastInteger(0);
        this.bitsAfterLeftmost = i4 != 0 ? 1 : 0;
        this.bitLeftmost = i3 == 0 ? 0 : 1;
    }

    public BitShiftAccumulator(EInteger eInteger, int i2, int i3) {
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("bigint's sign(" + eInteger.signum() + ") is less than 0");
        }
        if (eInteger.CanFitInInt32()) {
            this.isSmall = true;
            this.shiftedSmall = eInteger.ToInt32Checked();
        } else {
            this.shiftedBigInt = eInteger;
        }
        this.discardedBitCount = new FastInteger(0);
        this.bitsAfterLeftmost = i3 != 0 ? 1 : 0;
        this.bitLeftmost = i2 == 0 ? 0 : 1;
    }

    private FastInteger CalcKnownBitLength() {
        if (!this.isSmall) {
            if (this.shiftedBigInt.isZero()) {
                return new FastInteger(1);
            }
            long jGetSignedBitLengthAsInt64 = this.shiftedBigInt.GetSignedBitLengthAsInt64();
            return jGetSignedBitLengthAsInt64 < 2147483647L ? new FastInteger((int) jGetSignedBitLengthAsInt64) : FastInteger.FromBig(this.shiftedBigInt.GetSignedBitLengthAsEInteger());
        }
        int i2 = 32;
        for (int i3 = 31; i3 >= 0 && (this.shiftedSmall & (1 << i3)) == 0; i3--) {
            i2--;
        }
        if (i2 == 0) {
            i2++;
        }
        return new FastInteger(i2);
    }

    public static BitShiftAccumulator FromInt32(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("smallNumber(" + i2 + ") is less than 0");
        }
        BitShiftAccumulator bitShiftAccumulator = new BitShiftAccumulator(EInteger.FromInt32(0), 0, 0);
        bitShiftAccumulator.shiftedSmall = i2;
        bitShiftAccumulator.discardedBitCount = new FastInteger(0);
        bitShiftAccumulator.isSmall = true;
        return bitShiftAccumulator;
    }

    private void ShiftBigToBits(int i2) {
        int iToInt32;
        FastInteger fastInteger = this.knownBitLength;
        if (fastInteger == null || fastInteger.CompareToInt(i2) > 0) {
            FastInteger fastIntegerCalcKnownBitLength = this.knownBitLength;
            if (fastIntegerCalcKnownBitLength == null) {
                fastIntegerCalcKnownBitLength = CalcKnownBitLength();
            }
            this.knownBitLength = fastIntegerCalcKnownBitLength;
            if (fastIntegerCalcKnownBitLength.CompareToInt(i2) > 0 && this.knownBitLength.CompareToInt(i2) > 0) {
                if (this.knownBitLength.CanFitInInt32()) {
                    iToInt32 = this.knownBitLength.ToInt32() - i2;
                } else {
                    FastInteger fastIntegerSubtractInt = this.knownBitLength.Copy().SubtractInt(i2);
                    if (!fastIntegerSubtractInt.CanFitInInt32()) {
                        ShiftRight(fastIntegerSubtractInt);
                        return;
                    }
                    iToInt32 = fastIntegerSubtractInt.ToInt32();
                }
                this.knownBitLength.SetInt(i2);
                this.discardedBitCount.AddInt(iToInt32);
                if (iToInt32 == 1) {
                    int i3 = !this.shiftedBigInt.isEven() ? 1 : 0;
                    this.shiftedBigInt = this.shiftedBigInt.ShiftRight(1);
                    this.bitsAfterLeftmost |= this.bitLeftmost;
                    this.bitLeftmost = i3;
                } else {
                    int i4 = this.bitsAfterLeftmost;
                    int i5 = this.bitLeftmost;
                    this.bitsAfterLeftmost = (i4 + i5) - (i4 & i5);
                    long jGetLowBitAsInt64 = this.shiftedBigInt.GetLowBitAsInt64();
                    if (jGetLowBitAsInt64 == Long.MAX_VALUE) {
                        EInteger eIntegerGetLowBitAsEInteger = this.shiftedBigInt.GetLowBitAsEInteger();
                        int i6 = iToInt32 - 1;
                        if (eIntegerGetLowBitAsEInteger.compareTo(i6) < 0) {
                            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - 1));
                            this.bitLeftmost = this.shiftedBigInt.GetSignedBit(i6) ? 1 : 0;
                        } else if (eIntegerGetLowBitAsEInteger.compareTo(i6) > 0) {
                            this.bitLeftmost = 0;
                        } else {
                            this.bitLeftmost = 1;
                        }
                    } else {
                        int i7 = iToInt32 - 1;
                        long j2 = i7;
                        if (jGetLowBitAsInt64 < j2) {
                            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - 1));
                            this.bitLeftmost = this.shiftedBigInt.GetSignedBit(i7) ? 1 : 0;
                        } else if (jGetLowBitAsInt64 > j2) {
                            this.bitLeftmost = 0;
                        } else {
                            this.bitLeftmost = 1;
                        }
                    }
                    this.shiftedBigInt = this.shiftedBigInt.ShiftRight(iToInt32);
                }
                if (i2 < 32) {
                    this.isSmall = true;
                    this.shiftedSmall = this.shiftedBigInt.ToInt32Checked();
                }
                this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
            }
        }
    }

    private void ShiftRightBig(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (this.shiftedBigInt.isZero()) {
            this.discardedBitCount.AddInt(i2);
            int i3 = this.bitsAfterLeftmost;
            int i4 = this.bitLeftmost;
            this.bitsAfterLeftmost = (i3 + i4) - (i3 & i4);
            this.bitLeftmost = 0;
            this.isSmall = true;
            this.shiftedSmall = 0;
            this.knownBitLength = new FastInteger(1);
            return;
        }
        FastInteger fastIntegerCalcKnownBitLength = this.knownBitLength;
        if (fastIntegerCalcKnownBitLength == null) {
            fastIntegerCalcKnownBitLength = CalcKnownBitLength();
        }
        this.knownBitLength = fastIntegerCalcKnownBitLength;
        this.discardedBitCount.AddInt(i2);
        if (this.knownBitLength.CompareToInt(i2) < 0) {
            int i5 = this.bitsAfterLeftmost;
            int i6 = this.bitLeftmost;
            int i7 = (i5 + i6) - (i5 & i6);
            this.bitsAfterLeftmost = i7;
            this.bitsAfterLeftmost = i7 | (!this.shiftedBigInt.isZero() ? 1 : 0);
            this.bitLeftmost = 0;
            this.isSmall = true;
            this.shiftedSmall = 0;
            this.knownBitLength = new FastInteger(1);
            return;
        }
        this.knownBitLength.SubtractInt(i2);
        if (i2 == 1) {
            int i8 = !this.shiftedBigInt.isEven() ? 1 : 0;
            this.shiftedBigInt = this.shiftedBigInt.ShiftRight(1);
            this.bitsAfterLeftmost |= this.bitLeftmost;
            this.bitLeftmost = i8;
        } else {
            int i9 = this.bitsAfterLeftmost;
            int i10 = this.bitLeftmost;
            this.bitsAfterLeftmost = (i9 + i10) - (i9 & i10);
            long jGetLowBitAsInt64 = this.shiftedBigInt.GetLowBitAsInt64();
            if (jGetLowBitAsInt64 == Long.MAX_VALUE) {
                EInteger eIntegerGetLowBitAsEInteger = this.shiftedBigInt.GetLowBitAsEInteger();
                int i11 = i2 - 1;
                if (eIntegerGetLowBitAsEInteger.compareTo(i11) < 0) {
                    this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - 1));
                    this.bitLeftmost = this.shiftedBigInt.GetSignedBit(i11) ? 1 : 0;
                } else if (eIntegerGetLowBitAsEInteger.compareTo(i11) > 0) {
                    this.bitLeftmost = 0;
                } else {
                    this.bitLeftmost = 1;
                }
            } else {
                int i12 = i2 - 1;
                long j2 = i12;
                if (jGetLowBitAsInt64 < j2) {
                    this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - 1));
                    this.bitLeftmost = this.shiftedBigInt.GetSignedBit(i12) ? 1 : 0;
                } else if (jGetLowBitAsInt64 > j2) {
                    this.bitLeftmost = 0;
                } else {
                    this.bitLeftmost = 1;
                }
            }
            this.shiftedBigInt = this.shiftedBigInt.ShiftRight(i2);
        }
        if (this.knownBitLength.CompareToInt(32) < 0) {
            this.isSmall = true;
            this.shiftedSmall = this.shiftedBigInt.ToInt32Checked();
        }
        this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
    }

    private void ShiftRightSmall(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (this.shiftedSmall == 0) {
            this.discardedBitCount.AddInt(i2);
            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitLeftmost = 0;
            this.knownBitLength = new FastInteger(1);
            return;
        }
        int i3 = 32;
        for (int i4 = 31; i4 >= 0; i4--) {
            int i5 = this.shiftedSmall;
            int i6 = 1 << i4;
            if ((i5 + i6) - (i5 | i6) != 0) {
                break;
            }
            i3--;
        }
        int iMin = Math.min(i3, i2);
        boolean z2 = i2 > i3;
        this.knownBitLength = new FastInteger(i3 - iMin);
        this.discardedBitCount.AddInt(i2);
        int i7 = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
        this.bitsAfterLeftmost = i7;
        int i8 = (iMin <= 1 || (this.shiftedSmall << (33 - iMin)) == 0) ? 0 : 1;
        int i9 = (i7 + i8) - (i7 & i8);
        this.bitsAfterLeftmost = i9;
        int i10 = this.shiftedSmall;
        int i11 = (-1) - (((-1) - (i10 >> (iMin - 1))) | ((-1) - 1));
        this.bitLeftmost = i11;
        this.shiftedSmall = i10 >> iMin;
        if (z2) {
            this.bitsAfterLeftmost = (i9 + i11) - (i9 & i11);
            this.bitLeftmost = 0;
        }
        this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
    }

    private void ShiftSmallToBits(int i2) {
        FastInteger fastInteger = this.knownBitLength;
        if (fastInteger == null || fastInteger.CompareToInt(i2) > 0) {
            FastInteger fastIntegerCalcKnownBitLength = this.knownBitLength;
            if (fastIntegerCalcKnownBitLength == null) {
                fastIntegerCalcKnownBitLength = CalcKnownBitLength();
            }
            this.knownBitLength = fastIntegerCalcKnownBitLength;
            if (fastIntegerCalcKnownBitLength.CompareToInt(i2) <= 0) {
                return;
            }
            int iToInt32 = this.knownBitLength.ToInt32();
            if (iToInt32 <= i2) {
                this.knownBitLength = new FastInteger(iToInt32);
                return;
            }
            int i3 = iToInt32 - i2;
            this.knownBitLength = new FastInteger(i2);
            this.discardedBitCount.AddInt(i3);
            int i4 = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitsAfterLeftmost = i4;
            int i5 = (-1) - (((-1) - i4) & ((-1) - ((i3 <= 1 || (this.shiftedSmall << (33 - i3)) == 0) ? 0 : 1)));
            this.bitsAfterLeftmost = i5;
            int i6 = this.shiftedSmall;
            this.bitLeftmost = (i6 >> (i3 - 1)) & 1;
            this.bitsAfterLeftmost = i5 != 0 ? 1 : 0;
            this.shiftedSmall = i6 >> i3;
        }
    }

    private static void VerifyKnownLength() {
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public FastInteger GetDigitLength() {
        FastInteger fastIntegerCalcKnownBitLength = this.knownBitLength;
        if (fastIntegerCalcKnownBitLength == null) {
            fastIntegerCalcKnownBitLength = CalcKnownBitLength();
        }
        this.knownBitLength = fastIntegerCalcKnownBitLength;
        return FastInteger.CopyFrozen(fastIntegerCalcKnownBitLength);
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public FastInteger OverestimateDigitLength() {
        return GetDigitLength();
    }

    public void ShiftRight(FastInteger fastInteger) {
        if (fastInteger.signum() <= 0) {
            return;
        }
        if (fastInteger.CanFitInInt32()) {
            ShiftRightInt(fastInteger.ToInt32());
            return;
        }
        EInteger eIntegerToEInteger = fastInteger.ToEInteger();
        while (eIntegerToEInteger.signum() > 0) {
            int iToInt32Checked = eIntegerToEInteger.compareTo(EInteger.FromInt64(AnimationKt.MillisToNanos)) < 0 ? eIntegerToEInteger.ToInt32Checked() : 1000000;
            ShiftRightInt(iToInt32Checked);
            eIntegerToEInteger = eIntegerToEInteger.Subtract(EInteger.FromInt32(iToInt32Checked));
            if (this.isSmall) {
                if (this.shiftedSmall == 0) {
                    return;
                }
            } else if (this.shiftedBigInt.isZero()) {
                return;
            }
        }
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public void ShiftRightInt(int i2) {
        if (this.isSmall) {
            ShiftRightSmall(i2);
        } else {
            ShiftRightBig(i2);
        }
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public void ShiftToDigits(FastInteger fastInteger, FastInteger fastInteger2, boolean z2) {
        if (fastInteger.signum() < 0) {
            throw new IllegalArgumentException("bits's sign(" + fastInteger.signum() + ") is less than 0");
        }
        if (fastInteger2 == null || fastInteger2.signum() <= 0) {
            if (fastInteger.CanFitInInt32()) {
                ShiftToDigitsInt(fastInteger.ToInt32());
                VerifyKnownLength();
                return;
            }
            FastInteger fastIntegerCalcKnownBitLength = this.knownBitLength;
            if (fastIntegerCalcKnownBitLength == null) {
                fastIntegerCalcKnownBitLength = CalcKnownBitLength();
            }
            this.knownBitLength = fastIntegerCalcKnownBitLength;
            EInteger eIntegerSubtract = fastIntegerCalcKnownBitLength.ToEInteger().Subtract(fastInteger.ToEInteger());
            if (eIntegerSubtract.signum() > 0) {
                ShiftRight(FastInteger.FromBig(eIntegerSubtract));
            }
            VerifyKnownLength();
            return;
        }
        FastInteger fastIntegerCalcKnownBitLength2 = this.knownBitLength;
        if (fastIntegerCalcKnownBitLength2 == null) {
            fastIntegerCalcKnownBitLength2 = CalcKnownBitLength();
        }
        this.knownBitLength = fastIntegerCalcKnownBitLength2;
        if (fastIntegerCalcKnownBitLength2.compareTo(fastInteger) <= 0) {
            ShiftRight(fastInteger2);
            VerifyKnownLength();
            return;
        }
        FastInteger fastIntegerSubtract = this.knownBitLength.Copy().Subtract(fastInteger);
        if (fastIntegerSubtract.compareTo(fastInteger2) <= 0) {
            ShiftRight(fastInteger2);
            VerifyKnownLength();
        } else {
            ShiftRight(fastIntegerSubtract);
            VerifyKnownLength();
        }
    }

    public void ShiftToDigitsInt(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bits(" + i2 + ") is less than 0");
        }
        if (this.isSmall) {
            ShiftSmallToBits(i2);
        } else {
            ShiftBigToBits(i2);
        }
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public int ShiftedIntMod(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("mod (" + i2 + ") is not greater or equal to 1");
        }
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return this.isSmall ? this.shiftedSmall % i2 : this.shiftedBigInt.Mod(i2).ToInt32Checked();
        }
        if (!this.isSmall) {
            return this.shiftedBigInt.isEven() ? 0 : 1;
        }
        int i3 = this.shiftedSmall;
        return (1 + i3) - (1 | i3);
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public void TruncateOrShiftRight(FastInteger fastInteger, boolean z2) {
        ShiftRight(fastInteger);
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public final FastInteger getDiscardedDigitCount() {
        return this.discardedBitCount;
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public final int getLastDiscardedDigit() {
        return this.bitLeftmost;
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public final int getOlderDiscardedDigits() {
        return this.bitsAfterLeftmost;
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public final EInteger getShiftedInt() {
        return this.isSmall ? EInteger.FromInt32(this.shiftedSmall) : this.shiftedBigInt;
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public final FastInteger getShiftedIntFast() {
        return this.isSmall ? new FastInteger(this.shiftedSmall) : FastInteger.FromBig(this.shiftedBigInt);
    }
}

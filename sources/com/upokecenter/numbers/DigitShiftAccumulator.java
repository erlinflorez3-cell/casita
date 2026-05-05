package com.upokecenter.numbers;

import androidx.compose.animation.core.AnimationKt;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.squareup.wire.internal.MathMethodsKt;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes5.dex */
final class DigitShiftAccumulator implements IShiftAccumulator {
    private static final long[] TenPowersLong = {1, 10, 100, 1000, 10000, 100000, AnimationKt.MillisToNanos, 10000000, 100000000, MathMethodsKt.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER};
    private static final EInteger ValueTen = EInteger.FromInt32(10);
    private static final int[] ValueTenPowers = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
    private int bitLeftmost;
    private int bitsAfterLeftmost;
    private FastInteger discardedDigitCount;
    private boolean isSmall;
    private FastInteger knownDigitLength;
    private EInteger shiftedBigInt;
    private int shiftedSmall;

    public DigitShiftAccumulator(int i2, int i3, int i4) {
        this.shiftedSmall = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException("shiftedSmall(" + this.shiftedSmall + ") is less than 0");
        }
        this.isSmall = true;
        this.bitsAfterLeftmost = i4 == 0 ? 0 : 1;
        this.bitLeftmost = i3;
    }

    public DigitShiftAccumulator(EInteger eInteger, int i2, int i3) {
        if (eInteger.CanFitInInt32()) {
            int iToInt32Checked = eInteger.ToInt32Checked();
            this.shiftedSmall = iToInt32Checked;
            if (iToInt32Checked < 0) {
                throw new IllegalArgumentException("shiftedSmall(" + this.shiftedSmall + ") is less than 0");
            }
            this.isSmall = true;
        } else {
            this.shiftedBigInt = eInteger;
            this.isSmall = false;
        }
        this.bitsAfterLeftmost = i3 == 0 ? 0 : 1;
        this.bitLeftmost = i2;
    }

    private FastInteger CalcKnownDigitLength() {
        if (this.isSmall) {
            return new FastInteger(NumberUtility.DecimalDigitLength(this.shiftedSmall));
        }
        long jGetDigitCountAsInt64 = this.shiftedBigInt.GetDigitCountAsInt64();
        return jGetDigitCountAsInt64 == Long.MAX_VALUE ? FastInteger.FromBig(this.shiftedBigInt.GetDigitCountAsEInteger()) : jGetDigitCountAsInt64 < 2147483647L ? new FastInteger((int) jGetDigitCountAsInt64) : FastInteger.FromBig(EInteger.FromInt64(jGetDigitCountAsInt64));
    }

    private static EInteger DivideByPowerOfTen(EInteger eInteger, int i2) {
        return eInteger.Divide(NumberUtility.FindPowerOfTen(i2));
    }

    private static int FastParseLong(String str, int i2, int i3) {
        if (i3 > 9) {
            throw new IllegalArgumentException("length(" + i3 + ") is more than 9 ");
        }
        int iCharAt = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iCharAt = (iCharAt * 10) + (str.charAt(i2 + i4) - '0');
        }
        return iCharAt;
    }

    private void ShiftRightBig(int i2, boolean z2, boolean z3) {
        EInteger eIntegerDivide;
        if (i2 <= 0) {
            return;
        }
        if (this.shiftedBigInt.isZero()) {
            FastInteger fastInteger = this.discardedDigitCount;
            if (fastInteger == null) {
                fastInteger = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger;
            fastInteger.AddInt(i2);
            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitLeftmost = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        if (z2) {
            EInteger eIntegerGetUnsignedBitLengthAsEInteger = this.shiftedBigInt.GetUnsignedBitLengthAsEInteger();
            if (i2 <= 50 || eIntegerGetUnsignedBitLengthAsEInteger.compareTo(100) <= 0 || eIntegerGetUnsignedBitLengthAsEInteger.Add(5).compareTo(i2) >= 0) {
                int iToInt32Checked = eIntegerGetUnsignedBitLengthAsEInteger.CanFitInInt32() ? eIntegerGetUnsignedBitLengthAsEInteger.ToInt32Checked() : Integer.MAX_VALUE;
                if ((i2 <= 50 || iToInt32Checked >= 160) && ((i2 <= 100 || iToInt32Checked >= 326) && OverestimateDigitLength().Copy().SubtractInt(i2).CompareToInt(-2) >= 0)) {
                    if (!z3 || (ShiftedIntMod(2) == 0 && this.bitLeftmost == 0)) {
                        EInteger[] eIntegerArrDivRem = this.shiftedBigInt.DivRem(NumberUtility.FindPowerOfTen(i2));
                        eIntegerDivide = eIntegerArrDivRem[0];
                        int i3 = this.bitLeftmost;
                        int i4 = !eIntegerArrDivRem[1].isZero() ? 1 : 0;
                        this.bitLeftmost = (i4 + i3) - (i4 & i3);
                    } else {
                        this.bitLeftmost = 1;
                        eIntegerDivide = this.shiftedBigInt.Divide(NumberUtility.FindPowerOfTen(i2));
                    }
                    int i5 = this.bitsAfterLeftmost;
                    int i6 = this.bitLeftmost;
                    this.bitsAfterLeftmost = (i5 + i6) - (i5 & i6);
                    FastInteger fastInteger2 = this.discardedDigitCount;
                    this.discardedDigitCount = fastInteger2 == null ? new FastInteger(i2) : fastInteger2.AddInt(i2);
                    if (eIntegerDivide.isZero()) {
                        this.isSmall = true;
                        this.shiftedBigInt = null;
                        this.shiftedSmall = 0;
                        this.knownDigitLength = new FastInteger(1);
                        return;
                    }
                    if (!eIntegerDivide.CanFitInInt32()) {
                        this.isSmall = false;
                        this.shiftedBigInt = eIntegerDivide;
                        UpdateKnownLengthInt(i2);
                        return;
                    } else {
                        this.isSmall = true;
                        this.shiftedSmall = eIntegerDivide.ToInt32Unchecked();
                        this.shiftedBigInt = null;
                        UpdateKnownLengthInt(i2);
                        return;
                    }
                }
            }
            FastInteger fastInteger3 = this.discardedDigitCount;
            if (fastInteger3 == null) {
                fastInteger3 = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger3;
            fastInteger3.AddInt(i2);
            int i7 = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitsAfterLeftmost = i7;
            this.bitsAfterLeftmost = (-1) - (((-1) - i7) & ((-1) - (!this.shiftedBigInt.isZero() ? 1 : 0)));
            this.bitLeftmost = 0;
            this.knownDigitLength = new FastInteger(1);
            this.isSmall = true;
            this.shiftedSmall = 0;
            return;
        }
        if (i2 == 1) {
            EInteger[] eIntegerArrDivRem2 = this.shiftedBigInt.DivRem(EInteger.FromInt32(10));
            EInteger eInteger = eIntegerArrDivRem2[0];
            EInteger eInteger2 = eIntegerArrDivRem2[1];
            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitLeftmost = eInteger2.ToInt32Checked();
            this.shiftedBigInt = eInteger;
            FastInteger fastInteger4 = this.discardedDigitCount;
            if (fastInteger4 == null) {
                fastInteger4 = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger4;
            fastInteger4.AddInt(i2);
            UpdateKnownLengthInt(i2);
            return;
        }
        if (i2 >= 2 && i2 <= 8) {
            EInteger[] eIntegerArrDivRem3 = this.shiftedBigInt.DivRem(NumberUtility.FindPowerOfTen(i2));
            EInteger eInteger3 = eIntegerArrDivRem3[0];
            int iToInt32Checked2 = eIntegerArrDivRem3[1].ToInt32Checked();
            int i8 = ValueTenPowers[i2 - 1];
            int i9 = iToInt32Checked2 / i8;
            this.bitsAfterLeftmost = (-1) - (((-1) - ((-1) - (((-1) - (iToInt32Checked2 - (i8 * i9))) & ((-1) - this.bitLeftmost)))) & ((-1) - this.bitsAfterLeftmost));
            this.bitLeftmost = i9;
            this.shiftedBigInt = eInteger3;
            FastInteger fastInteger5 = this.discardedDigitCount;
            this.discardedDigitCount = fastInteger5 != null ? fastInteger5.AddInt(i2) : new FastInteger(i2);
            UpdateKnownLengthInt(i2);
            this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
            if (this.shiftedBigInt.CanFitInInt32()) {
                this.isSmall = true;
                this.shiftedSmall = this.shiftedBigInt.ToInt32Unchecked();
                this.shiftedBigInt = null;
                return;
            }
            return;
        }
        FastInteger fastIntegerCalcKnownDigitLength = this.knownDigitLength;
        if (fastIntegerCalcKnownDigitLength == null) {
            fastIntegerCalcKnownDigitLength = CalcKnownDigitLength();
        }
        this.knownDigitLength = fastIntegerCalcKnownDigitLength;
        if (new FastInteger(i2).Decrement().compareTo(this.knownDigitLength) >= 0) {
            this.bitsAfterLeftmost |= !this.shiftedBigInt.isZero() ? 1 : 0;
            this.isSmall = true;
            this.shiftedSmall = 0;
            this.knownDigitLength = new FastInteger(1);
            FastInteger fastInteger6 = this.discardedDigitCount;
            if (fastInteger6 == null) {
                fastInteger6 = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger6;
            fastInteger6.AddInt(i2);
            this.bitsAfterLeftmost |= this.bitLeftmost;
            this.bitLeftmost = 0;
            return;
        }
        if (this.shiftedBigInt.CanFitInInt32()) {
            this.isSmall = true;
            this.shiftedSmall = this.shiftedBigInt.ToInt32Checked();
            ShiftRightSmall(i2);
            return;
        }
        if (this.shiftedBigInt.CanFitInInt64()) {
            ShiftRightLong(this.shiftedBigInt.ToInt64Unchecked(), i2);
            return;
        }
        EInteger[] eIntegerArrDivRem4 = this.shiftedBigInt.DivRem(NumberUtility.FindPowerOfTen(i2 - 1));
        EInteger[] eIntegerArrDivRem5 = eIntegerArrDivRem4[0].DivRem(10);
        int i10 = this.bitsAfterLeftmost;
        int i11 = this.bitLeftmost;
        int i12 = (i10 + i11) - (i10 & i11);
        this.bitsAfterLeftmost = i12;
        this.bitsAfterLeftmost = (!eIntegerArrDivRem4[1].isZero() ? 1 : 0) | i12;
        this.bitLeftmost = eIntegerArrDivRem5[1].ToInt32Checked();
        FastInteger fastInteger7 = this.discardedDigitCount;
        this.discardedDigitCount = fastInteger7 != null ? fastInteger7.AddInt(i2) : new FastInteger(i2);
        UpdateKnownLengthInt(i2);
        if (eIntegerArrDivRem5[0].CanFitInInt32()) {
            this.isSmall = true;
            this.shiftedSmall = eIntegerArrDivRem5[0].ToInt32Checked();
        } else {
            this.isSmall = false;
            this.shiftedBigInt = eIntegerArrDivRem5[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ShiftRightLong(long j2, int i2) {
        int i3;
        long j3;
        long j4;
        int i4 = i2;
        long j5 = j2;
        if (i4 <= 0) {
            return;
        }
        if (j5 == 0) {
            this.shiftedSmall = 0;
            this.isSmall = true;
            FastInteger fastInteger = this.discardedDigitCount;
            if (fastInteger == null) {
                fastInteger = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger;
            fastInteger.AddInt(i4);
            int i5 = this.bitsAfterLeftmost;
            int i6 = this.bitLeftmost;
            this.bitsAfterLeftmost = (i5 + i6) - (i5 & i6);
            this.bitLeftmost = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        if (i4 < 2 || i4 > 8) {
            this.knownDigitLength = new FastInteger(NumberUtility.DecimalDigitLength(j5));
            FastInteger fastInteger2 = this.discardedDigitCount;
            if (fastInteger2 != null) {
                fastInteger2.AddInt(i4);
            } else {
                this.discardedDigitCount = new FastInteger(i4);
            }
            int i7 = 0;
            while (true) {
                if (i4 <= 0) {
                    i3 = 0;
                    break;
                }
                if (j5 == 0) {
                    int i8 = this.bitsAfterLeftmost;
                    int i9 = this.bitLeftmost;
                    this.bitsAfterLeftmost = (i8 + i9) - (i8 & i9);
                    i3 = 0;
                    this.bitLeftmost = 0;
                    break;
                }
                if (j5 < 43698) {
                    j4 = (26215 * j5) >> 18;
                    j3 = 10;
                } else {
                    j3 = 10;
                    j4 = j5 / 10;
                }
                int i10 = (int) (j5 - (j4 * j3));
                int i11 = this.bitsAfterLeftmost;
                int i12 = this.bitLeftmost;
                this.bitsAfterLeftmost = (i11 + i12) - (i11 & i12);
                this.bitLeftmost = i10;
                i4--;
                i7++;
                j5 = j4;
            }
            boolean z2 = j5 <= 2147483647L ? 1 : i3;
            this.isSmall = z2;
            if (z2 != 0) {
                this.shiftedSmall = (int) j5;
            } else {
                this.shiftedBigInt = EInteger.FromInt64(j5);
            }
            UpdateKnownLengthInt(i7);
            this.bitsAfterLeftmost = this.bitsAfterLeftmost == 0 ? i3 : 1;
            return;
        }
        int[] iArr = ValueTenPowers;
        int i13 = iArr[i4];
        if (j5 >= i13) {
            long j6 = i13;
            long j7 = iArr[i4 - 1];
            FastInteger fastInteger3 = this.discardedDigitCount;
            if (fastInteger3 == null) {
                fastInteger3 = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger3;
            fastInteger3.AddInt(i4);
            long j8 = j5 / j6;
            long j9 = j5 - (j6 * j8);
            long j10 = j9 / j7;
            this.bitLeftmost = (int) j10;
            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - (j9 - (j10 * j7) == 0 ? 0 : 1)));
            boolean z3 = j8 <= 2147483647L;
            this.isSmall = z3;
            if (z3) {
                this.shiftedSmall = (int) j8;
                this.knownDigitLength = j8 < 10 ? new FastInteger(1) : new FastInteger(NumberUtility.DecimalDigitLength(j8));
                return;
            } else {
                this.shiftedBigInt = EInteger.FromInt64(j8);
                this.knownDigitLength = j8 < 10 ? new FastInteger(1) : CalcKnownDigitLength();
                return;
            }
        }
        int i14 = this.shiftedSmall;
        int i15 = iArr[i4 - 1];
        if (i14 < i15) {
            FastInteger fastInteger4 = this.discardedDigitCount;
            if (fastInteger4 != null) {
                fastInteger4.AddInt(i4);
            } else {
                this.discardedDigitCount = new FastInteger(i4);
            }
            this.bitLeftmost = 0;
            this.bitsAfterLeftmost |= j5 == 0 ? 0 : 1;
            this.isSmall = true;
            this.shiftedSmall = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        FastInteger fastInteger5 = this.discardedDigitCount;
        if (fastInteger5 != null) {
            fastInteger5.AddInt(i4);
        } else {
            this.discardedDigitCount = new FastInteger(i4);
        }
        long j11 = i15;
        long j12 = j5 / j11;
        this.bitLeftmost = (int) j12;
        this.bitsAfterLeftmost |= j5 - (j12 * j11) == 0 ? 0 : 1;
        this.isSmall = true;
        this.shiftedSmall = 0;
        this.knownDigitLength = new FastInteger(1);
    }

    private void ShiftRightSmall(int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = this.shiftedSmall;
        if (i3 == 0) {
            FastInteger fastInteger = this.discardedDigitCount;
            if (fastInteger == null) {
                fastInteger = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger;
            fastInteger.AddInt(i2);
            int i4 = this.bitsAfterLeftmost;
            int i5 = this.bitLeftmost;
            this.bitsAfterLeftmost = (i4 + i5) - (i4 & i5);
            this.bitLeftmost = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        int i6 = 8;
        if (i2 < 2 || i2 > 8) {
            if (i3 >= 1000000000) {
                i6 = 10;
            } else if (i3 >= 100000000) {
                i6 = 9;
            } else if (i3 < 10000000) {
                i6 = i3 >= 1000000 ? 7 : i3 >= 100000 ? 6 : i3 >= 10000 ? 5 : i3 >= 1000 ? 4 : i3 >= 100 ? 3 : i3 >= 10 ? 2 : 1;
            }
            this.knownDigitLength = new FastInteger(i6);
            FastInteger fastInteger2 = this.discardedDigitCount;
            if (fastInteger2 != null) {
                fastInteger2.AddInt(i2);
            } else {
                this.discardedDigitCount = new FastInteger(i2);
            }
            int i7 = 0;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                int i8 = this.shiftedSmall;
                if (i8 == 0) {
                    this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
                    this.bitLeftmost = 0;
                    this.knownDigitLength = new FastInteger(1);
                    break;
                } else {
                    this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
                    this.bitLeftmost = i8 % 10;
                    i2--;
                    i7++;
                    this.shiftedSmall = i8 / 10;
                }
            }
            UpdateKnownLengthInt(i7);
            this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
            return;
        }
        int[] iArr = ValueTenPowers;
        int i9 = iArr[i2];
        if (i3 >= i9) {
            int i10 = iArr[i2 - 1];
            FastInteger fastInteger3 = this.discardedDigitCount;
            if (fastInteger3 == null) {
                fastInteger3 = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger3;
            fastInteger3.AddInt(i2);
            int i11 = this.shiftedSmall;
            int i12 = i11 / i9;
            int i13 = i11 - (i9 * i12);
            int i14 = i13 / i10;
            this.bitLeftmost = i14;
            this.bitsAfterLeftmost = (i13 - (i14 * i10)) | this.bitsAfterLeftmost;
            this.shiftedSmall = i12;
            this.knownDigitLength = i12 < 10 ? new FastInteger(1) : CalcKnownDigitLength();
            return;
        }
        int i15 = iArr[i2 - 1];
        if (i3 < i15) {
            FastInteger fastInteger4 = this.discardedDigitCount;
            if (fastInteger4 != null) {
                fastInteger4.AddInt(i2);
            } else {
                this.discardedDigitCount = new FastInteger(i2);
            }
            int i16 = this.shiftedSmall;
            this.bitLeftmost = 0;
            this.bitsAfterLeftmost = (-1) - (((-1) - i16) & ((-1) - this.bitsAfterLeftmost));
            this.shiftedSmall = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        FastInteger fastInteger5 = this.discardedDigitCount;
        if (fastInteger5 != null) {
            fastInteger5.AddInt(i2);
        } else {
            this.discardedDigitCount = new FastInteger(i2);
        }
        int i17 = this.shiftedSmall;
        int i18 = i17 / i15;
        this.bitLeftmost = i18;
        this.bitsAfterLeftmost = (-1) - (((-1) - (i17 - (i18 * i15))) & ((-1) - this.bitsAfterLeftmost));
        this.shiftedSmall = 0;
        this.knownDigitLength = new FastInteger(1);
    }

    private void ShiftToDigitsBig(int i2, boolean z2) {
        EInteger eIntegerDivide;
        FastInteger fastInteger = this.knownDigitLength;
        if (fastInteger == null || fastInteger.CompareToInt(i2) > 0) {
            FastInteger fastIntegerUnderestimateDigitLength = UnderestimateDigitLength();
            boolean z3 = this.knownDigitLength != null;
            if (fastIntegerUnderestimateDigitLength.CompareToInt(i2) <= 0) {
                if (z3) {
                    return;
                }
                GetDigitLength();
                ShiftToDigitsBig(i2, z2);
                return;
            }
            FastInteger fastIntegerSubtractInt = fastIntegerUnderestimateDigitLength.Copy().SubtractInt(i2);
            if (z2 && fastIntegerSubtractInt.CanFitInInt32()) {
                TruncateOrShiftRight(fastIntegerSubtractInt, z2);
                if (z3) {
                    return;
                }
                GetDigitLength();
                ShiftToDigitsBig(i2, z2);
                return;
            }
            if (fastIntegerSubtractInt.CompareToInt(1) == 0) {
                EInteger[] eIntegerArrDivRem = this.shiftedBigInt.DivRem(ValueTen);
                EInteger eInteger = eIntegerArrDivRem[0];
                EInteger eInteger2 = eIntegerArrDivRem[1];
                this.bitsAfterLeftmost |= this.bitLeftmost;
                this.bitLeftmost = eInteger2.ToInt32Checked();
                this.shiftedBigInt = eInteger;
                FastInteger fastInteger2 = this.discardedDigitCount;
                if (fastInteger2 == null) {
                    fastInteger2 = new FastInteger(0);
                }
                this.discardedDigitCount = fastInteger2;
                fastInteger2.Add(fastIntegerSubtractInt);
                this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
                if (z3) {
                    UpdateKnownLength(fastIntegerSubtractInt);
                    return;
                } else {
                    GetDigitLength();
                    ShiftToDigitsBig(i2, z2);
                    return;
                }
            }
            if (fastIntegerSubtractInt.CompareToInt(9) <= 0) {
                int iToInt32 = fastIntegerSubtractInt.ToInt32();
                EInteger[] eIntegerArrDivRem2 = this.shiftedBigInt.DivRem(NumberUtility.FindPowerOfTen(iToInt32));
                EInteger eInteger3 = eIntegerArrDivRem2[0];
                int iToInt32Checked = eIntegerArrDivRem2[1].ToInt32Checked();
                this.bitsAfterLeftmost |= this.bitLeftmost;
                for (int i3 = 0; i3 < iToInt32; i3++) {
                    if (i3 == iToInt32 - 1) {
                        this.bitLeftmost = iToInt32Checked % 10;
                    } else {
                        int i4 = iToInt32Checked < 43698 ? (iToInt32Checked * 26215) >> 18 : iToInt32Checked / 10;
                        this.bitsAfterLeftmost = (-1) - (((-1) - (iToInt32Checked - (i4 * 10))) & ((-1) - this.bitsAfterLeftmost));
                        iToInt32Checked = i4;
                    }
                }
                this.shiftedBigInt = eInteger3;
                FastInteger fastInteger3 = this.discardedDigitCount;
                if (fastInteger3 == null) {
                    fastInteger3 = new FastInteger(0);
                }
                this.discardedDigitCount = fastInteger3;
                fastInteger3.Add(fastIntegerSubtractInt);
                this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
                if (z3) {
                    UpdateKnownLength(fastIntegerSubtractInt);
                    return;
                } else {
                    GetDigitLength();
                    ShiftToDigitsBig(i2, z2);
                    return;
                }
            }
            if (fastIntegerSubtractInt.CanFitInInt32()) {
                int iToInt322 = fastIntegerSubtractInt.ToInt32() - 1;
                if (this.shiftedBigInt.isEven() && this.bitsAfterLeftmost == 0) {
                    EInteger[] eIntegerArrDivRem3 = this.shiftedBigInt.DivRem(NumberUtility.FindPowerOfTen(iToInt322));
                    eIntegerDivide = eIntegerArrDivRem3[0];
                    EInteger eInteger4 = eIntegerArrDivRem3[1];
                    int i5 = this.bitsAfterLeftmost;
                    int i6 = this.bitLeftmost;
                    this.bitsAfterLeftmost = (i5 + i6) - (i5 & i6);
                    if (!eInteger4.isZero()) {
                        this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - 1));
                    }
                } else {
                    EInteger eInteger5 = this.shiftedBigInt;
                    this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - 1));
                    eIntegerDivide = eInteger5.Divide(NumberUtility.FindPowerOfTen(iToInt322));
                }
                EInteger[] eIntegerArrDivRem4 = eIntegerDivide.DivRem(ValueTen);
                EInteger eInteger6 = eIntegerArrDivRem4[0];
                this.bitLeftmost = eIntegerArrDivRem4[1].ToInt32Checked();
                this.shiftedBigInt = eInteger6;
                FastInteger fastInteger4 = this.discardedDigitCount;
                if (fastInteger4 == null) {
                    fastInteger4 = new FastInteger(0);
                }
                this.discardedDigitCount = fastInteger4;
                fastInteger4.Add(fastIntegerSubtractInt);
                this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
                if (z3) {
                    UpdateKnownLength(fastIntegerSubtractInt);
                    return;
                } else {
                    GetDigitLength();
                    ShiftToDigitsBig(i2, z2);
                    return;
                }
            }
            String string = this.shiftedBigInt.toString();
            int length = string.length();
            this.knownDigitLength = new FastInteger(length);
            if (length > i2) {
                int i7 = length - i2;
                UpdateKnownLengthInt(i7);
                int i8 = length - i7;
                FastInteger fastInteger5 = this.discardedDigitCount;
                if (fastInteger5 == null) {
                    fastInteger5 = new FastInteger(0);
                }
                this.discardedDigitCount = fastInteger5;
                if (i7 <= Integer.MAX_VALUE) {
                    fastInteger5.AddInt(i7);
                } else {
                    fastInteger5.AddBig(EInteger.FromInt32(i7));
                }
                for (int length2 = string.length() - 1; length2 >= 0; length2--) {
                    int i9 = this.bitsAfterLeftmost;
                    int i10 = this.bitLeftmost;
                    this.bitsAfterLeftmost = (i9 + i10) - (i9 & i10);
                    this.bitLeftmost = string.charAt(length2) - '0';
                    i7--;
                    if (i7 <= 0) {
                        break;
                    }
                }
                if (i8 <= 9) {
                    this.isSmall = true;
                    this.shiftedSmall = FastParseLong(string, 0, i8);
                } else {
                    this.shiftedBigInt = EInteger.FromSubstring(string, 0, i8);
                }
                this.bitsAfterLeftmost = this.bitsAfterLeftmost != 0 ? 1 : 0;
            }
        }
    }

    private void ShiftToDigitsSmall(int i2) {
        int i3 = this.shiftedSmall;
        int i4 = i3 >= 1000000000 ? 10 : i3 >= 100000000 ? 9 : i3 >= 10000000 ? 8 : i3 >= 1000000 ? 7 : i3 >= 100000 ? 6 : i3 >= 10000 ? 5 : i3 >= 1000 ? 4 : i3 >= 100 ? 3 : i3 >= 10 ? 2 : 1;
        this.knownDigitLength = new FastInteger(i4);
        if (i4 > i2) {
            int i5 = i4 - i2;
            UpdateKnownLengthInt(i5);
            FastInteger fastInteger = this.discardedDigitCount;
            this.discardedDigitCount = fastInteger != null ? fastInteger.AddInt(i5) : new FastInteger(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = this.shiftedSmall;
                this.shiftedSmall = i7 / 10;
                int i8 = this.bitsAfterLeftmost;
                int i9 = this.bitLeftmost;
                this.bitsAfterLeftmost = (i8 + i9) - (i8 & i9);
                this.bitLeftmost = i7 % 10;
            }
            this.bitsAfterLeftmost = this.bitsAfterLeftmost == 0 ? 0 : 1;
        }
    }

    private void TruncateRightLong(long j2, int i2) {
        if (i2 <= 0) {
            return;
        }
        if (j2 == 0 || i2 >= 21) {
            FastInteger fastInteger = this.discardedDigitCount;
            if (fastInteger == null) {
                fastInteger = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger;
            fastInteger.AddInt(i2);
            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitLeftmost = j2 == 0 ? 0 : 1;
            this.shiftedSmall = 0;
            this.isSmall = true;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        if (i2 >= 1) {
            long[] jArr = TenPowersLong;
            if (i2 <= jArr.length - 1) {
                long j3 = jArr[i2];
                if (j2 < j3) {
                    FastInteger fastInteger2 = this.discardedDigitCount;
                    if (fastInteger2 != null) {
                        fastInteger2.AddInt(i2);
                    } else {
                        this.discardedDigitCount = new FastInteger(i2);
                    }
                    this.bitsAfterLeftmost |= this.bitLeftmost;
                    this.bitLeftmost = j2 != 0 ? 1 : 0;
                    this.isSmall = true;
                    this.shiftedSmall = (int) 0;
                    UpdateKnownLengthInt(i2);
                    return;
                }
                FastInteger fastInteger3 = this.discardedDigitCount;
                if (fastInteger3 != null) {
                    fastInteger3.AddInt(i2);
                } else {
                    this.discardedDigitCount = new FastInteger(i2);
                }
                long j4 = j2 / j3;
                this.bitsAfterLeftmost |= this.bitLeftmost;
                this.bitLeftmost = ((j2 & 1) != 1 && j2 - (j3 * j4) == 0) ? 0 : 1;
                boolean z2 = j4 <= 2147483647L;
                this.isSmall = z2;
                if (z2) {
                    this.shiftedSmall = (int) j4;
                } else {
                    this.shiftedBigInt = EInteger.FromInt64(j4);
                }
                UpdateKnownLengthInt(i2);
                return;
            }
        }
        ShiftRightInt(i2);
    }

    private void TruncateRightSmall(int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = this.shiftedSmall;
        if (i3 == 0 || i2 >= 11) {
            FastInteger fastInteger = this.discardedDigitCount;
            if (fastInteger == null) {
                fastInteger = new FastInteger(0);
            }
            this.discardedDigitCount = fastInteger;
            fastInteger.AddInt(i2);
            this.bitsAfterLeftmost |= this.bitLeftmost;
            this.bitLeftmost = this.shiftedSmall == 0 ? 0 : 1;
            this.shiftedSmall = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        if (i2 < 1 || i2 > 8) {
            ShiftRightSmall(i2);
            return;
        }
        int i4 = ValueTenPowers[i2];
        if (i3 < i4) {
            FastInteger fastInteger2 = this.discardedDigitCount;
            if (fastInteger2 != null) {
                fastInteger2.AddInt(i2);
            } else {
                this.discardedDigitCount = new FastInteger(i2);
            }
            this.bitsAfterLeftmost = (-1) - (((-1) - this.bitsAfterLeftmost) & ((-1) - this.bitLeftmost));
            this.bitLeftmost = this.shiftedSmall == 0 ? 0 : 1;
            this.shiftedSmall = 0;
            this.knownDigitLength = new FastInteger(1);
            return;
        }
        FastInteger fastInteger3 = this.discardedDigitCount;
        if (fastInteger3 != null) {
            fastInteger3.AddInt(i2);
        } else {
            this.discardedDigitCount = new FastInteger(i2);
        }
        int i5 = this.bitsAfterLeftmost;
        int i6 = this.bitLeftmost;
        this.bitsAfterLeftmost = i5 | i6;
        int i7 = this.shiftedSmall;
        if ((i7 + 1) - (1 | i7) == 1) {
            this.bitLeftmost = 1;
            this.shiftedSmall = i7 / i4;
        } else {
            int i8 = i7 / i4;
            int i9 = i7 - (i4 * i8);
            this.shiftedSmall = i8;
            this.bitLeftmost = i6 | (i9 != 0 ? 1 : 0);
        }
        UpdateKnownLengthInt(i2);
    }

    private FastInteger UnderestimateDigitLength() {
        FastInteger fastInteger = this.knownDigitLength;
        return fastInteger != null ? fastInteger : this.isSmall ? GetDigitLength() : NumberUtility.DecimalDigitLengthBounds(this.shiftedBigInt)[0];
    }

    private void UpdateKnownLength(FastInteger fastInteger) {
        FastInteger fastInteger2 = this.knownDigitLength;
        if (fastInteger2 != null) {
            fastInteger2.Subtract(fastInteger);
            if (this.knownDigitLength.CompareToInt(1) < 0) {
                this.knownDigitLength.SetInt(1);
            }
        }
    }

    private void UpdateKnownLengthInt(int i2) {
        FastInteger fastInteger = this.knownDigitLength;
        if (fastInteger != null) {
            fastInteger.SubtractInt(i2);
            if (this.knownDigitLength.CompareToInt(1) < 0) {
                this.knownDigitLength.SetInt(1);
            }
        }
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public FastInteger GetDigitLength() {
        FastInteger fastIntegerCalcKnownDigitLength = this.knownDigitLength;
        if (fastIntegerCalcKnownDigitLength == null) {
            fastIntegerCalcKnownDigitLength = CalcKnownDigitLength();
        }
        this.knownDigitLength = fastIntegerCalcKnownDigitLength;
        return fastIntegerCalcKnownDigitLength;
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public FastInteger OverestimateDigitLength() {
        FastInteger fastInteger = this.knownDigitLength;
        return fastInteger != null ? fastInteger : this.isSmall ? GetDigitLength() : NumberUtility.DecimalDigitLengthBounds(this.shiftedBigInt)[1];
    }

    public void ShiftRight(FastInteger fastInteger) {
        if (fastInteger == null) {
            throw new NullPointerException("fastint");
        }
        if (fastInteger.CanFitInInt32()) {
            int iToInt32 = fastInteger.ToInt32();
            if (iToInt32 < 0) {
                return;
            }
            ShiftRightInt(iToInt32);
            return;
        }
        if (fastInteger.signum() <= 0) {
            return;
        }
        EInteger eIntegerToEInteger = fastInteger.ToEInteger();
        while (eIntegerToEInteger.signum() > 0) {
            if (eIntegerToEInteger.compareTo(1000000) >= 0 && (this.isSmall || this.shiftedBigInt.GetUnsignedBitLengthAsEInteger().compareTo(eIntegerToEInteger) < 0)) {
                FastInteger fastInteger2 = this.discardedDigitCount;
                if (fastInteger2 == null) {
                    fastInteger2 = new FastInteger(0);
                }
                this.discardedDigitCount = fastInteger2;
                fastInteger2.AddBig(eIntegerToEInteger);
                int i2 = this.bitsAfterLeftmost | this.bitLeftmost;
                this.bitsAfterLeftmost = i2;
                int i3 = (!this.isSmall ? this.shiftedBigInt.isZero() : this.shiftedSmall == 0) ? 1 : 0;
                this.bitsAfterLeftmost = (i2 + i3) - (i2 & i3);
                this.bitLeftmost = 0;
                this.knownDigitLength = new FastInteger(1);
                this.isSmall = true;
                this.shiftedSmall = 0;
                return;
            }
            int iToInt32Checked = eIntegerToEInteger.compareTo(1000000) < 0 ? eIntegerToEInteger.ToInt32Checked() : 1000000;
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
            ShiftRightBig(i2, false, false);
        }
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public void ShiftToDigits(FastInteger fastInteger, FastInteger fastInteger2, boolean z2) {
        if (fastInteger2 != null && fastInteger2.signum() > 0) {
            FastInteger fastIntegerCalcKnownDigitLength = this.knownDigitLength;
            if (fastIntegerCalcKnownDigitLength == null) {
                fastIntegerCalcKnownDigitLength = CalcKnownDigitLength();
            }
            this.knownDigitLength = fastIntegerCalcKnownDigitLength;
            if (fastIntegerCalcKnownDigitLength.compareTo(fastInteger) <= 0) {
                TruncateOrShiftRight(fastInteger2, z2);
                return;
            }
            FastInteger fastIntegerSubtract = fastIntegerCalcKnownDigitLength.Copy().Subtract(fastInteger);
            if (fastIntegerSubtract.compareTo(fastInteger2) <= 0) {
                TruncateOrShiftRight(fastInteger2, z2);
                return;
            } else {
                TruncateOrShiftRight(fastIntegerSubtract, z2);
                return;
            }
        }
        if (fastInteger.CanFitInInt32()) {
            int iToInt32 = fastInteger.ToInt32();
            if (iToInt32 < 0) {
                throw new IllegalArgumentException("intval(" + iToInt32 + ") is less than 0");
            }
            if (this.isSmall) {
                ShiftToDigitsSmall(iToInt32);
                return;
            } else {
                ShiftToDigitsBig(iToInt32, z2);
                return;
            }
        }
        FastInteger fastIntegerCalcKnownDigitLength2 = this.knownDigitLength;
        if (fastIntegerCalcKnownDigitLength2 == null) {
            fastIntegerCalcKnownDigitLength2 = CalcKnownDigitLength();
        }
        this.knownDigitLength = fastIntegerCalcKnownDigitLength2;
        EInteger eIntegerSubtract = fastIntegerCalcKnownDigitLength2.ToEInteger().Subtract(fastInteger.ToEInteger());
        if (eIntegerSubtract.signum() > 0) {
            ShiftRight(FastInteger.FromBig(eIntegerSubtract));
        }
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public int ShiftedIntMod(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? this.isSmall ? this.shiftedSmall % i2 : this.shiftedBigInt.Mod(i2).ToInt32Checked() : this.isSmall ? this.shiftedSmall & 1 : this.shiftedBigInt.isEven() ? 0 : 1;
        }
        return 0;
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public void TruncateOrShiftRight(FastInteger fastInteger, boolean z2) {
        if (fastInteger == null) {
            throw new NullPointerException("fastint");
        }
        if (!z2 || !fastInteger.CanFitInInt32()) {
            ShiftRight(fastInteger);
            return;
        }
        int iToInt32 = fastInteger.ToInt32();
        if (iToInt32 < 0) {
            return;
        }
        if (this.isSmall) {
            TruncateRightSmall(iToInt32);
        } else if (this.shiftedBigInt.CanFitInInt64()) {
            TruncateRightLong(this.shiftedBigInt.ToInt64Checked(), iToInt32);
        } else {
            ShiftRightBig(iToInt32, true, false);
        }
    }

    public boolean TruncateRightExact(FastInteger fastInteger) {
        if (fastInteger == null) {
            throw new NullPointerException("fastint");
        }
        if (fastInteger.CanFitInInt32()) {
            if (fastInteger.signum() < 0) {
                return (-1) - (((-1) - this.bitLeftmost) & ((-1) - this.bitsAfterLeftmost)) == 0;
            }
            if (!this.isSmall && !this.shiftedBigInt.CanFitInInt64()) {
                int iToInt32 = fastInteger.ToInt32();
                if (iToInt32 > 10) {
                    ShiftRightBig(10, true, true);
                    int i2 = this.bitLeftmost;
                    int i3 = this.bitsAfterLeftmost;
                    if ((i2 + i3) - (i2 & i3) != 0) {
                        return false;
                    }
                    if (this.isSmall) {
                        ShiftRightInt(iToInt32 - 10);
                    } else {
                        ShiftRightBig(iToInt32 - 10, true, true);
                    }
                } else {
                    ShiftRightBig(iToInt32, true, true);
                }
                int i4 = this.bitLeftmost;
                int i5 = this.bitsAfterLeftmost;
                return (i4 + i5) - (i4 & i5) == 0;
            }
        }
        TruncateOrShiftRight(fastInteger, true);
        return (this.bitLeftmost | this.bitsAfterLeftmost) == 0;
    }

    public void TruncateRightSimple(FastInteger fastInteger) {
        if (fastInteger == null) {
            throw new NullPointerException("fastint");
        }
        if (fastInteger.CanFitInInt32()) {
            if (fastInteger.signum() < 0) {
                return;
            }
            if (!this.isSmall && !this.shiftedBigInt.CanFitInInt64()) {
                ShiftRightBig(fastInteger.ToInt32(), true, true);
                return;
            }
        }
        TruncateOrShiftRight(fastInteger, true);
    }

    @Override // com.upokecenter.numbers.IShiftAccumulator
    public final FastInteger getDiscardedDigitCount() {
        FastInteger fastInteger = this.discardedDigitCount;
        if (fastInteger == null) {
            fastInteger = new FastInteger(0);
        }
        this.discardedDigitCount = fastInteger;
        return fastInteger;
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

    public String toString() {
        return "[this.bitLeftmost=" + this.bitLeftmost + ", this.bitsAfterLeftmost=" + this.bitsAfterLeftmost + ", this.discardedDigitCount=" + this.discardedDigitCount + ", this.isSmall=" + this.isSmall + ", this.knownDigitLength=" + this.knownDigitLength + ", this.shiftedBigInt=" + this.shiftedBigInt + ", this.shiftedSmall=" + this.shiftedSmall + "]";
    }
}

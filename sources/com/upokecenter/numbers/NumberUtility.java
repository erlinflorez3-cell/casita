package com.upokecenter.numbers;

import androidx.compose.animation.core.AnimationKt;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.squareup.wire.internal.MathMethodsKt;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes5.dex */
final class NumberUtility {
    private static final EInteger[] ValueBigIntPowersOfTen = {EInteger.FromInt32(1), EInteger.FromInt32(10), EInteger.FromInt64(100), EInteger.FromInt64(1000), EInteger.FromInt64(10000), EInteger.FromInt64(100000), EInteger.FromInt64(AnimationKt.MillisToNanos), EInteger.FromInt64(10000000), EInteger.FromInt64(100000000), EInteger.FromInt64(MathMethodsKt.NANOS_PER_SECOND), EInteger.FromInt64(RealConnection.IDLE_CONNECTION_HEALTHY_NS), EInteger.FromInt64(100000000000L), EInteger.FromInt64(1000000000000L), EInteger.FromInt64(10000000000000L), EInteger.FromInt64(100000000000000L), EInteger.FromInt64(1000000000000000L), EInteger.FromInt64(10000000000000000L), EInteger.FromInt64(100000000000000000L), EInteger.FromInt64(EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER)};
    private static final EInteger[] ValueBigIntPowersOfFive = {EInteger.FromInt32(1), EInteger.FromInt64(5), EInteger.FromInt64(25), EInteger.FromInt64(125), EInteger.FromInt64(625), EInteger.FromInt64(3125), EInteger.FromInt64(15625), EInteger.FromInt64(78125), EInteger.FromInt64(390625), EInteger.FromInt64(1953125), EInteger.FromInt64(9765625), EInteger.FromInt64(48828125), EInteger.FromInt64(244140625), EInteger.FromInt64(1220703125), EInteger.FromInt64(6103515625L), EInteger.FromInt64(30517578125L), EInteger.FromInt64(152587890625L), EInteger.FromInt64(762939453125L), EInteger.FromInt64(3814697265625L), EInteger.FromInt64(19073486328125L), EInteger.FromInt64(95367431640625L), EInteger.FromInt64(476837158203125L), EInteger.FromInt64(2384185791015625L), EInteger.FromInt64(11920928955078125L), EInteger.FromInt64(59604644775390625L), EInteger.FromInt64(298023223876953125L), EInteger.FromInt64(1490116119384765625L), EInteger.FromInt64(7450580596923828125L)};
    private static final PowerCache ValuePowerOfFiveCache = new PowerCache();
    private static final PowerCache ValuePowerOfTenCache = new PowerCache();
    private static final EInteger ValueFivePower40 = EInteger.FromInt64(95367431640625L).Multiply(EInteger.FromInt64(95367431640625L));

    private static final class PowerCache {
        private static final int MaxSize = 128;
        private int size;
        private final EInteger[] outputs = new EInteger[128];
        private final EInteger[] inputs = new EInteger[128];
        private final int[] inputsInts = new int[128];

        public void AddPower(int i2, EInteger eInteger) {
            AddPower(EInteger.FromInt32(i2), eInteger);
        }

        public void AddPower(EInteger eInteger, EInteger eInteger2) {
            synchronized (this.outputs) {
                int i2 = this.size;
                if (i2 < 128) {
                    while (i2 > 0) {
                        EInteger[] eIntegerArr = this.inputs;
                        int i3 = i2 - 1;
                        eIntegerArr[i2] = eIntegerArr[i3];
                        int[] iArr = this.inputsInts;
                        iArr[i2] = iArr[i3];
                        EInteger[] eIntegerArr2 = this.outputs;
                        eIntegerArr2[i2] = eIntegerArr2[i3];
                        i2--;
                    }
                    this.inputs[0] = eInteger;
                    this.inputsInts[0] = eInteger.CanFitInInt32() ? eInteger.ToInt32Checked() : -1;
                    this.outputs[0] = eInteger2;
                    this.size++;
                } else {
                    for (int i4 = 127; i4 > 0; i4--) {
                        EInteger[] eIntegerArr3 = this.inputs;
                        int i5 = i4 - 1;
                        eIntegerArr3[i4] = eIntegerArr3[i5];
                        int[] iArr2 = this.inputsInts;
                        iArr2[i4] = iArr2[i5];
                        EInteger[] eIntegerArr4 = this.outputs;
                        eIntegerArr4[i4] = eIntegerArr4[i5];
                    }
                    this.inputs[0] = eInteger;
                    this.inputsInts[0] = eInteger.CanFitInInt32() ? eInteger.ToInt32Checked() : -1;
                    this.outputs[0] = eInteger2;
                }
            }
        }

        public EInteger[] FindCachedPowerIntOrSmaller(int i2) {
            EInteger[] eIntegerArr;
            synchronized (this.outputs) {
                eIntegerArr = null;
                int i3 = -1;
                for (int i4 = 0; i4 < this.size; i4++) {
                    int i5 = this.inputsInts[i4];
                    if (i5 >= 0 && i5 <= i2 && (i3 == -1 || i5 >= i3)) {
                        eIntegerArr = new EInteger[]{this.inputs[i4], this.outputs[i4]};
                        i3 = i5;
                    }
                }
            }
            return eIntegerArr;
        }

        public EInteger[] FindCachedPowerOrSmaller(EInteger eInteger) {
            EInteger[] eIntegerArr;
            if (eInteger.CanFitInInt32()) {
                return FindCachedPowerIntOrSmaller(eInteger.ToInt32Checked());
            }
            synchronized (this.outputs) {
                eIntegerArr = null;
                EInteger eInteger2 = null;
                for (int i2 = 0; i2 < this.size; i2++) {
                    if (this.inputs[i2].compareTo(eInteger) <= 0 && (eInteger2 == null || this.inputs[i2].compareTo(eInteger2) >= 0)) {
                        EInteger[] eIntegerArr2 = this.inputs;
                        eIntegerArr = new EInteger[]{eIntegerArr2[i2], this.outputs[i2]};
                        eInteger2 = eIntegerArr2[i2];
                    }
                }
            }
            return eIntegerArr;
        }

        public EInteger GetCachedPower(EInteger eInteger) {
            if (eInteger.CanFitInInt32()) {
                return GetCachedPowerInt(eInteger.ToInt32Checked());
            }
            synchronized (this.outputs) {
                for (int i2 = 0; i2 < this.size; i2++) {
                    if (eInteger.equals(this.inputs[i2])) {
                        if (i2 != 0) {
                            EInteger[] eIntegerArr = this.inputs;
                            EInteger eInteger2 = eIntegerArr[i2];
                            eIntegerArr[i2] = eIntegerArr[0];
                            eIntegerArr[0] = eInteger2;
                            int[] iArr = this.inputsInts;
                            int i3 = iArr[i2];
                            iArr[i2] = iArr[0];
                            iArr[0] = i3;
                            EInteger[] eIntegerArr2 = this.outputs;
                            EInteger eInteger3 = eIntegerArr2[i2];
                            eIntegerArr2[i2] = eIntegerArr2[0];
                            eIntegerArr2[0] = eInteger3;
                            if (i2 != 1) {
                                EInteger eInteger4 = eIntegerArr[i2];
                                eIntegerArr[i2] = eIntegerArr[1];
                                eIntegerArr[1] = eInteger4;
                                int i4 = iArr[i2];
                                iArr[i2] = iArr[1];
                                iArr[1] = i4;
                                EInteger eInteger5 = eIntegerArr2[i2];
                                eIntegerArr2[i2] = eIntegerArr2[1];
                                eIntegerArr2[1] = eInteger5;
                            }
                        }
                        return this.outputs[0];
                    }
                }
                return null;
            }
        }

        public EInteger GetCachedPowerInt(int i2) {
            synchronized (this.outputs) {
                if (i2 > 0) {
                    if (this.size < 64) {
                        for (int i3 = 0; i3 < this.size; i3++) {
                            if (this.inputsInts[i3] == i2) {
                                return this.outputs[i3];
                            }
                        }
                        return null;
                    }
                }
                for (int i4 = 0; i4 < this.size; i4++) {
                    int[] iArr = this.inputsInts;
                    int i5 = iArr[i4];
                    if (i5 >= 0 && i5 == i2) {
                        if (i4 != 0) {
                            EInteger[] eIntegerArr = this.inputs;
                            EInteger eInteger = eIntegerArr[i4];
                            eIntegerArr[i4] = eIntegerArr[0];
                            eIntegerArr[0] = eInteger;
                            iArr[i4] = iArr[0];
                            iArr[0] = i5;
                            EInteger[] eIntegerArr2 = this.outputs;
                            EInteger eInteger2 = eIntegerArr2[i4];
                            eIntegerArr2[i4] = eIntegerArr2[0];
                            eIntegerArr2[0] = eInteger2;
                            if (i4 != 1) {
                                EInteger eInteger3 = eIntegerArr[i4];
                                eIntegerArr[i4] = eIntegerArr[1];
                                eIntegerArr[1] = eInteger3;
                                int i6 = iArr[i4];
                                iArr[i4] = iArr[1];
                                iArr[1] = i6;
                                EInteger eInteger4 = eIntegerArr2[i4];
                                eIntegerArr2[i4] = eIntegerArr2[1];
                                eIntegerArr2[1] = eInteger4;
                            }
                        }
                        return this.outputs[0];
                    }
                }
                return null;
            }
        }
    }

    private NumberUtility() {
    }

    static int BitLength(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if ((i2 >> 16) == 0) {
            i2 <<= 16;
            i3 = 16;
        } else {
            i3 = 32;
        }
        if ((i2 >> 24) == 0) {
            i2 <<= 8;
            i3 -= 8;
        }
        if ((i2 >> 28) == 0) {
            i2 <<= 4;
            i3 -= 4;
        }
        if ((i2 >> 30) == 0) {
            i2 <<= 2;
            i3 -= 2;
        }
        return (i2 >> 31) == 0 ? i3 - 1 : i3;
    }

    public static int BitLength(long j2) {
        if (j2 == 0) {
            return 1;
        }
        int i2 = 32;
        if ((j2 >> 32) == 0) {
            j2 <<= 32;
        } else {
            i2 = 64;
        }
        if ((j2 >> 48) == 0) {
            j2 <<= 16;
            i2 -= 16;
        }
        if ((j2 >> 56) == 0) {
            j2 <<= 8;
            i2 -= 8;
        }
        if ((j2 >> 60) == 0) {
            j2 <<= 4;
            i2 -= 4;
        }
        if ((j2 >> 62) == 0) {
            j2 <<= 2;
            i2 -= 2;
        }
        return (j2 >> 63) == 0 ? i2 - 1 : i2;
    }

    private static int CountTrailingZeros(int i2) {
        int i3;
        if (i2 == 0) {
            return 32;
        }
        if ((i2 << 16) == 0) {
            i2 >>= 16;
            i3 = 16;
        } else {
            i3 = 0;
        }
        if ((i2 << 24) == 0) {
            i2 >>= 8;
            i3 += 8;
        }
        if ((i2 << 28) == 0) {
            i2 >>= 4;
            i3 += 4;
        }
        if ((i2 << 30) == 0) {
            i2 >>= 2;
            i3 += 2;
        }
        return (i2 << 31) == 0 ? i3 + 1 : i3;
    }

    public static int DecimalDigitLength(int i2) {
        if (i2 < 100000) {
            if (i2 >= 10000) {
                return 5;
            }
            if (i2 >= 1000) {
                return 4;
            }
            if (i2 >= 100) {
                return 3;
            }
            return i2 >= 10 ? 2 : 1;
        }
        if (i2 >= 1000000000) {
            return 10;
        }
        if (i2 >= 100000000) {
            return 9;
        }
        if (i2 >= 10000000) {
            return 8;
        }
        return i2 >= 1000000 ? 7 : 6;
    }

    public static int DecimalDigitLength(long j2) {
        if (j2 < MathMethodsKt.NANOS_PER_SECOND) {
            int i2 = (int) j2;
            if (i2 >= 100000000) {
                return 9;
            }
            if (i2 >= 10000000) {
                return 8;
            }
            if (i2 >= 1000000) {
                return 7;
            }
            if (i2 >= 100000) {
                return 6;
            }
            if (i2 >= 10000) {
                return 5;
            }
            if (i2 >= 1000) {
                return 4;
            }
            if (i2 >= 100) {
                return 3;
            }
            return i2 >= 10 ? 2 : 1;
        }
        if (j2 >= EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER) {
            return 19;
        }
        if (j2 >= 100000000000000000L) {
            return 18;
        }
        if (j2 >= 10000000000000000L) {
            return 17;
        }
        if (j2 >= 1000000000000000L) {
            return 16;
        }
        if (j2 >= 100000000000000L) {
            return 15;
        }
        if (j2 >= 10000000000000L) {
            return 14;
        }
        if (j2 >= 1000000000000L) {
            return 13;
        }
        if (j2 >= 100000000000L) {
            return 12;
        }
        if (j2 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            return 11;
        }
        return j2 >= MathMethodsKt.NANOS_PER_SECOND ? 10 : 9;
    }

    public static FastInteger[] DecimalDigitLengthBounds(EInteger eInteger) {
        long jGetUnsignedBitLengthAsInt64 = eInteger.GetUnsignedBitLengthAsInt64();
        if (jGetUnsignedBitLengthAsInt64 < 33) {
            FastInteger fastInteger = new FastInteger((int) eInteger.GetDigitCountAsInt64());
            return new FastInteger[]{fastInteger, fastInteger};
        }
        if (jGetUnsignedBitLengthAsInt64 <= 2135) {
            int i2 = (int) jGetUnsignedBitLengthAsInt64;
            int i3 = (((i2 - 1) * 631305) >> 21) + 1;
            int i4 = ((i2 * 631305) >> 21) + 1;
            if (i3 != i4) {
                return new FastInteger[]{new FastInteger(i3), new FastInteger(i4)};
            }
            FastInteger fastInteger2 = new FastInteger(i3);
            return new FastInteger[]{fastInteger2, fastInteger2};
        }
        if (jGetUnsignedBitLengthAsInt64 > 6432162) {
            EInteger eIntegerGetUnsignedBitLengthAsEInteger = eInteger.GetUnsignedBitLengthAsEInteger();
            return new FastInteger[]{FastInteger.FromBig(eIntegerGetUnsignedBitLengthAsEInteger.Multiply(100).Divide(335)), FastInteger.FromBig(eIntegerGetUnsignedBitLengthAsEInteger.Divide(3))};
        }
        int i5 = (int) jGetUnsignedBitLengthAsInt64;
        int i6 = ((int) ((((long) (i5 - 1)) * 661971961083L) >> 41)) + 1;
        int i7 = ((int) ((((long) i5) * 661971961083L) >> 41)) + 1;
        if (i6 != i7) {
            return new FastInteger[]{new FastInteger(i6), new FastInteger(i7)};
        }
        FastInteger fastInteger3 = new FastInteger(i6);
        return new FastInteger[]{fastInteger3, fastInteger3};
    }

    public static EInteger[] DecimalDigitLengthBoundsAsEI(EInteger eInteger) {
        long jGetUnsignedBitLengthAsInt64 = eInteger.GetUnsignedBitLengthAsInt64();
        if (jGetUnsignedBitLengthAsInt64 < 33) {
            EInteger eIntegerFromInt32 = EInteger.FromInt32((int) eInteger.GetDigitCountAsInt64());
            return new EInteger[]{eIntegerFromInt32, eIntegerFromInt32};
        }
        if (jGetUnsignedBitLengthAsInt64 <= 2135) {
            int i2 = (int) jGetUnsignedBitLengthAsInt64;
            int i3 = (((i2 - 1) * 631305) >> 21) + 1;
            int i4 = ((i2 * 631305) >> 21) + 1;
            if (i3 != i4) {
                return new EInteger[]{EInteger.FromInt32(i3), EInteger.FromInt32(i4)};
            }
            EInteger eIntegerFromInt322 = EInteger.FromInt32(i3);
            return new EInteger[]{eIntegerFromInt322, eIntegerFromInt322};
        }
        if (jGetUnsignedBitLengthAsInt64 > 6432162) {
            FastInteger[] fastIntegerArrDecimalDigitLengthBounds = DecimalDigitLengthBounds(eInteger);
            return new EInteger[]{fastIntegerArrDecimalDigitLengthBounds[0].ToEInteger(), fastIntegerArrDecimalDigitLengthBounds[1].ToEInteger()};
        }
        int i5 = (int) jGetUnsignedBitLengthAsInt64;
        int i6 = ((int) ((((long) (i5 - 1)) * 661971961083L) >> 41)) + 1;
        int i7 = ((int) ((((long) i5) * 661971961083L) >> 41)) + 1;
        if (i6 != i7) {
            return new EInteger[]{EInteger.FromInt32(i6), EInteger.FromInt32(i7)};
        }
        EInteger eIntegerFromInt323 = EInteger.FromInt32(i6);
        return new EInteger[]{eIntegerFromInt323, eIntegerFromInt323};
    }

    public static <THelper> FastInteger[] DigitLengthBounds(IRadixMathHelper<THelper> iRadixMathHelper, EInteger eInteger) {
        int iGetRadix = iRadixMathHelper.GetRadix();
        if (iGetRadix == 2) {
            FastInteger fastIntegerFromBig = FastInteger.FromBig(eInteger.GetUnsignedBitLengthAsEInteger());
            return new FastInteger[]{fastIntegerFromBig, fastIntegerFromBig};
        }
        if (iGetRadix == 10) {
            return DecimalDigitLengthBounds(eInteger);
        }
        FastInteger fastIntegerGetDigitLength = iRadixMathHelper.GetDigitLength(eInteger);
        return new FastInteger[]{fastIntegerGetDigitLength, fastIntegerGetDigitLength};
    }

    public static <THelper> FastIntegerFixed[] DigitLengthBoundsFixed(IRadixMathHelper<THelper> iRadixMathHelper, FastIntegerFixed fastIntegerFixed) {
        int iGetRadix = iRadixMathHelper.GetRadix();
        FastIntegerFixed fastIntegerFixedFastPathDigitLength = FastPathDigitLength(fastIntegerFixed, iGetRadix);
        if (fastIntegerFixedFastPathDigitLength != null) {
            return new FastIntegerFixed[]{fastIntegerFixedFastPathDigitLength, fastIntegerFixedFastPathDigitLength};
        }
        if (iGetRadix == 10) {
            EInteger[] eIntegerArrDecimalDigitLengthBoundsAsEI = DecimalDigitLengthBoundsAsEI(fastIntegerFixed.ToEInteger());
            return new FastIntegerFixed[]{FastIntegerFixed.FromBig(eIntegerArrDecimalDigitLengthBoundsAsEI[0]), FastIntegerFixed.FromBig(eIntegerArrDecimalDigitLengthBoundsAsEI[1])};
        }
        FastIntegerFixed fastIntegerFixedFromFastInteger = FastIntegerFixed.FromFastInteger(iRadixMathHelper.GetDigitLength(fastIntegerFixed.ToEInteger()));
        return new FastIntegerFixed[]{fastIntegerFixedFromFastInteger, fastIntegerFixedFromFastInteger};
    }

    public static <THelper> FastIntegerFixed DigitLengthFixed(IRadixMathHelper<THelper> iRadixMathHelper, FastIntegerFixed fastIntegerFixed) {
        FastIntegerFixed fastIntegerFixedFastPathDigitLength = FastPathDigitLength(fastIntegerFixed, iRadixMathHelper.GetRadix());
        return fastIntegerFixedFastPathDigitLength != null ? fastIntegerFixedFastPathDigitLength : FastIntegerFixed.FromFastInteger(iRadixMathHelper.GetDigitLength(fastIntegerFixed.ToEInteger()));
    }

    public static <THelper> FastInteger DigitLengthUpperBound(IRadixMathHelper<THelper> iRadixMathHelper, EInteger eInteger) {
        return DigitLengthBounds(iRadixMathHelper, eInteger)[1];
    }

    private static FastIntegerFixed FastPathDigitLength(FastIntegerFixed fastIntegerFixed, int i2) {
        if (fastIntegerFixed.CanFitInInt32()) {
            int iToInt32 = fastIntegerFixed.ToInt32();
            if (iToInt32 == Integer.MIN_VALUE) {
                return null;
            }
            if (i2 == 2) {
                return FastIntegerFixed.FromInt32(BitLength(Math.abs(iToInt32)));
            }
            if (i2 == 10) {
                return FastIntegerFixed.FromInt32(DecimalDigitLength(Math.abs(iToInt32)));
            }
            return null;
        }
        if (i2 == 2) {
            long jGetUnsignedBitLengthAsInt64 = fastIntegerFixed.ToEInteger().GetUnsignedBitLengthAsInt64();
            if (jGetUnsignedBitLengthAsInt64 != Long.MAX_VALUE) {
                return FastIntegerFixed.FromInt64(jGetUnsignedBitLengthAsInt64);
            }
            return null;
        }
        if (i2 != 10) {
            return null;
        }
        EInteger eIntegerToEInteger = fastIntegerFixed.ToEInteger();
        long jGetUnsignedBitLengthAsInt642 = eIntegerToEInteger.GetUnsignedBitLengthAsInt64();
        if (jGetUnsignedBitLengthAsInt642 < 33) {
            return FastIntegerFixed.FromInt32((int) eIntegerToEInteger.GetDigitCountAsInt64());
        }
        if (jGetUnsignedBitLengthAsInt642 <= 2135) {
            int i3 = (int) jGetUnsignedBitLengthAsInt642;
            int i4 = (((i3 - 1) * 631305) >> 21) + 1;
            if (i4 == ((i3 * 631305) >> 21) + 1) {
                return FastIntegerFixed.FromInt32(i4);
            }
            return null;
        }
        if (jGetUnsignedBitLengthAsInt642 > 6432162) {
            return null;
        }
        int i5 = (int) jGetUnsignedBitLengthAsInt642;
        int i6 = ((int) ((((long) (i5 - 1)) * 661971961083L) >> 41)) + 1;
        if (i6 == ((int) ((((long) i5) * 661971961083L) >> 41)) + 1) {
            return FastIntegerFixed.FromInt32(i6);
        }
        return null;
    }

    static EInteger FindPowerOfFive(int i2) {
        if (i2 < 0) {
            return EInteger.FromInt32(0);
        }
        if (i2 <= 27) {
            return ValueBigIntPowersOfFive[i2];
        }
        if (i2 == 40) {
            return ValueFivePower40;
        }
        PowerCache powerCache = ValuePowerOfFiveCache;
        EInteger eIntegerGetCachedPowerInt = powerCache.GetCachedPowerInt(i2);
        if (eIntegerGetCachedPowerInt != null) {
            return eIntegerGetCachedPowerInt;
        }
        EInteger eIntegerFromInt32 = EInteger.FromInt32(i2);
        if (i2 <= 54) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0) {
                EInteger eInteger = ValueBigIntPowersOfFive[i2 >> 1];
                EInteger eIntegerMultiply = eInteger.Multiply(eInteger);
                powerCache.AddPower(eIntegerFromInt32, eIntegerMultiply);
                return eIntegerMultiply;
            }
            EInteger[] eIntegerArr = ValueBigIntPowersOfFive;
            EInteger eIntegerMultiply2 = eIntegerArr[27].Multiply(eIntegerArr[i2 - 27]);
            powerCache.AddPower(eIntegerFromInt32, eIntegerMultiply2);
            return eIntegerMultiply2;
        }
        if (i2 <= 94) {
            EInteger eIntegerMultiply3 = ValueFivePower40.Multiply(FindPowerOfFive(i2 - 40));
            powerCache.AddPower(eIntegerFromInt32, eIntegerMultiply3);
            return eIntegerMultiply3;
        }
        EInteger eIntegerFindPowerOfFive = FindPowerOfFive((i2 + 63) - (63 | i2));
        int i3 = 64;
        for (int i4 = i2 >> 6; i4 > 0; i4 >>= 1) {
            if ((-1) - (((-1) - i4) | ((-1) - 1)) == 1) {
                PowerCache powerCache2 = ValuePowerOfFiveCache;
                EInteger eIntegerGetCachedPowerInt2 = powerCache2.GetCachedPowerInt(i3);
                if (eIntegerGetCachedPowerInt2 == null) {
                    EInteger eIntegerFindPowerOfFive2 = FindPowerOfFive(i3 >> 1);
                    eIntegerGetCachedPowerInt2 = eIntegerFindPowerOfFive2.Multiply(eIntegerFindPowerOfFive2);
                    powerCache2.AddPower(i3, eIntegerGetCachedPowerInt2);
                }
                eIntegerFindPowerOfFive = eIntegerFindPowerOfFive.Multiply(eIntegerGetCachedPowerInt2);
            }
            i3 <<= 1;
        }
        return eIntegerFindPowerOfFive;
    }

    static EInteger FindPowerOfFiveFromBig(EInteger eInteger) {
        int iSignum = eInteger.signum();
        if (iSignum < 0) {
            return EInteger.FromInt32(0);
        }
        if (iSignum == 0) {
            return EInteger.FromInt32(1);
        }
        if (eInteger.CanFitInInt32()) {
            return FindPowerOfFive(eInteger.ToInt32Checked());
        }
        EInteger eIntegerFromInt32 = EInteger.FromInt32(1);
        EInteger eIntegerFromInt322 = EInteger.FromInt32(1);
        while (eInteger.signum() > 0) {
            if (!eInteger.isEven()) {
                PowerCache powerCache = ValuePowerOfFiveCache;
                EInteger eIntegerGetCachedPower = powerCache.GetCachedPower(eIntegerFromInt32);
                if (eIntegerGetCachedPower == null) {
                    EInteger eIntegerFindPowerOfFiveFromBig = FindPowerOfFiveFromBig(eIntegerFromInt32.ShiftRight(1));
                    eIntegerGetCachedPower = eIntegerFindPowerOfFiveFromBig.Multiply(eIntegerFindPowerOfFiveFromBig);
                    powerCache.AddPower(eIntegerFromInt32, eIntegerGetCachedPower);
                }
                eIntegerFromInt322 = eIntegerFromInt322.Multiply(eIntegerGetCachedPower);
            }
            eIntegerFromInt32 = eIntegerFromInt32.ShiftLeft(1);
            eInteger = eInteger.ShiftRight(1);
        }
        return eIntegerFromInt322;
    }

    static EInteger FindPowerOfTen(int i2) {
        if (i2 < 0) {
            return EInteger.FromInt32(0);
        }
        if (i2 <= 18) {
            return ValueBigIntPowersOfTen[i2];
        }
        PowerCache powerCache = ValuePowerOfTenCache;
        EInteger eIntegerGetCachedPowerInt = powerCache.GetCachedPowerInt(i2);
        if (eIntegerGetCachedPowerInt != null) {
            return eIntegerGetCachedPowerInt;
        }
        if (i2 <= 27) {
            EInteger eIntegerShiftLeft = ValueBigIntPowersOfFive[i2].ShiftLeft(i2);
            powerCache.AddPower(i2, eIntegerShiftLeft);
            return eIntegerShiftLeft;
        }
        if (i2 > 36) {
            return FindPowerOfFive(i2).ShiftLeft(i2);
        }
        if ((1 & i2) == 0) {
            EInteger eInteger = ValueBigIntPowersOfTen[i2 >> 1];
            EInteger eIntegerMultiply = eInteger.Multiply(eInteger);
            powerCache.AddPower(i2, eIntegerMultiply);
            return eIntegerMultiply;
        }
        EInteger[] eIntegerArr = ValueBigIntPowersOfTen;
        EInteger eIntegerMultiply2 = eIntegerArr[18].Multiply(eIntegerArr[i2 - 18]);
        powerCache.AddPower(i2, eIntegerMultiply2);
        return eIntegerMultiply2;
    }

    public static EInteger FindPowerOfTen(long j2) {
        return j2 < 0 ? EInteger.FromInt32(0) : j2 == 0 ? EInteger.FromInt32(1) : j2 <= 2147483647L ? FindPowerOfTen((int) j2) : FindPowerOfTenFromBig(EInteger.FromInt64(j2));
    }

    static EInteger FindPowerOfTenFromBig(EInteger eInteger) {
        int iSignum = eInteger.signum();
        return iSignum < 0 ? EInteger.FromInt32(0) : iSignum == 0 ? EInteger.FromInt32(1) : eInteger.CanFitInInt32() ? FindPowerOfTen(eInteger.ToInt32Checked()) : FindPowerOfFiveFromBig(eInteger).ShiftLeft(eInteger);
    }

    static boolean HasBitSet(int[] iArr, int i2) {
        int i3 = i2 >> 5;
        return i3 < iArr.length && (-1) - (((-1) - iArr[i3]) | ((-1) - (1 << ((i2 + 31) - (i2 | 31))))) != 0;
    }

    public static <THelper> EInteger IntegerDigitLengthUpperBound(IRadixMathHelper<THelper> iRadixMathHelper, THelper thelper) {
        if ((-1) - (((-1) - iRadixMathHelper.GetFlags(thelper)) | ((-1) - 14)) != 0) {
            throw new UnsupportedOperationException();
        }
        EInteger eIntegerGetExponent = iRadixMathHelper.GetExponent(thelper);
        EInteger eIntegerAbs = iRadixMathHelper.GetMantissa(thelper).Abs();
        return eIntegerGetExponent.signum() <= 0 ? DigitLengthUpperBound(iRadixMathHelper, eIntegerAbs).ToEInteger() : DigitLengthUpperBound(iRadixMathHelper, eIntegerAbs).ToEInteger().Add(eIntegerGetExponent);
    }

    static EInteger MultiplyByPowerOfFive(EInteger eInteger, int i2) {
        if (i2 < 0 || eInteger.isZero()) {
            return EInteger.FromInt32(0);
        }
        if (i2 <= 94) {
            return eInteger.Multiply(FindPowerOfFive(i2));
        }
        EInteger eIntegerGetCachedPowerInt = ValuePowerOfFiveCache.GetCachedPowerInt(i2);
        if (eIntegerGetCachedPowerInt != null) {
            return eInteger.Multiply(eIntegerGetCachedPowerInt);
        }
        EInteger eIntegerMultiply = eInteger.Multiply(FindPowerOfFive(63 & i2));
        int i3 = 64;
        for (int i4 = i2 >> 6; i4 > 0; i4 >>= 1) {
            if ((i4 & 1) == 1) {
                PowerCache powerCache = ValuePowerOfFiveCache;
                EInteger eIntegerGetCachedPowerInt2 = powerCache.GetCachedPowerInt(i3);
                if (eIntegerGetCachedPowerInt2 == null) {
                    EInteger eIntegerFindPowerOfFive = FindPowerOfFive(i3 >> 1);
                    eIntegerGetCachedPowerInt2 = eIntegerFindPowerOfFive.Multiply(eIntegerFindPowerOfFive);
                    powerCache.AddPower(i3, eIntegerGetCachedPowerInt2);
                }
                eIntegerMultiply = eIntegerMultiply.Multiply(eIntegerGetCachedPowerInt2);
            }
            i3 <<= 1;
        }
        return eIntegerMultiply;
    }

    static EInteger MultiplyByPowerOfFive(EInteger eInteger, EInteger eInteger2) {
        return eInteger2.CanFitInInt32() ? MultiplyByPowerOfFive(eInteger, eInteger2.ToInt32Checked()) : eInteger.Multiply(FindPowerOfFiveFromBig(eInteger2));
    }

    static EInteger MultiplyByPowerOfTen(EInteger eInteger, int i2) {
        if (i2 < 0 || eInteger.isZero()) {
            return EInteger.FromInt32(0);
        }
        EInteger[] eIntegerArr = ValueBigIntPowersOfTen;
        return i2 < eIntegerArr.length ? eInteger.Multiply(eIntegerArr[i2]) : i2 <= 94 ? eInteger.Multiply(FindPowerOfFive(i2)).ShiftLeft(i2) : MultiplyByPowerOfFive(eInteger, i2).ShiftLeft(i2);
    }

    static EInteger MultiplyByPowerOfTen(EInteger eInteger, EInteger eInteger2) {
        return (eInteger2.signum() < 0 || eInteger.isZero()) ? EInteger.FromInt32(0) : MultiplyByPowerOfFive(eInteger, eInteger2).ShiftLeft(eInteger2);
    }

    public static <THelper> THelper PreRound(THelper thelper, EContext eContext, IRadixMath<THelper> iRadixMath) {
        EContext eContextWithTraps;
        if (eContext != null && eContext.getHasMaxPrecision()) {
            IRadixMathHelper<THelper> iRadixMathHelperGetHelper = iRadixMath.GetHelper();
            int iGetFlags = iRadixMathHelperGetHelper.GetFlags(thelper);
            if ((iGetFlags + 14) - (iGetFlags | 14) != 0) {
                return thelper;
            }
            FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getPrecision());
            EInteger eIntegerAbs = iRadixMathHelperGetHelper.GetMantissa(thelper).Abs();
            FastInteger[] fastIntegerArrDigitLengthBounds = DigitLengthBounds(iRadixMathHelperGetHelper, eIntegerAbs);
            if (fastIntegerArrDigitLengthBounds[1].compareTo(fastIntegerFromBig) <= 0) {
                return thelper;
            }
            if (fastIntegerArrDigitLengthBounds[0].compareTo(fastIntegerFromBig) <= 0) {
                FastInteger fastIntegerGetDigitLength = iRadixMathHelperGetHelper.GetDigitLength(eIntegerAbs);
                eContextWithTraps = eContext.WithBlankFlags().WithTraps(0);
                if (fastIntegerGetDigitLength.compareTo(fastIntegerFromBig) <= 0) {
                    return thelper;
                }
            } else {
                eContextWithTraps = eContext;
            }
            thelper = iRadixMath.RoundToPrecision(thelper, eContextWithTraps);
            int flags = eContextWithTraps.getFlags();
            if ((flags + 1) - (flags | 1) != 0 && eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | 259);
            }
            int flags2 = eContextWithTraps.getFlags();
            if ((flags2 + 2) - (flags2 | 2) != 0 && eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | 2);
            }
            if ((eContextWithTraps.getFlags() & 16) != 0 && eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | 256);
                eContext.setFlags(eContext.getFlags() | 19);
            }
        }
        return thelper;
    }

    public static EInteger ReduceTrailingZeros(EInteger eInteger, FastInteger fastInteger, int i2, FastInteger fastInteger2, FastInteger fastInteger3, FastInteger fastInteger4) {
        if (eInteger.isZero()) {
            fastInteger.SetInt(0);
            return eInteger;
        }
        if (i2 == 2) {
            if (!eInteger.isEven()) {
                return eInteger;
            }
            long jGetLowBitAsInt64 = eInteger.GetLowBitAsInt64();
            if (jGetLowBitAsInt64 != Long.MAX_VALUE) {
                if (fastInteger3 != null && fastInteger2.compareTo(fastInteger3) >= 0) {
                    EInteger eIntegerSubtract = fastInteger2.ToEInteger().Subtract(fastInteger3.ToEInteger());
                    if (eIntegerSubtract.compareTo(EInteger.FromInt64(jGetLowBitAsInt64)) < 0) {
                        jGetLowBitAsInt64 = eIntegerSubtract.ToInt64Checked();
                    }
                }
                if (fastInteger4 != null && fastInteger.compareTo(fastInteger4) <= 0) {
                    EInteger eIntegerSubtract2 = fastInteger4.ToEInteger().Subtract(fastInteger.ToEInteger());
                    if (eIntegerSubtract2.compareTo(EInteger.FromInt64(jGetLowBitAsInt64)) < 0) {
                        jGetLowBitAsInt64 = eIntegerSubtract2.ToInt64Checked();
                    }
                }
                EInteger eIntegerShiftRight = jGetLowBitAsInt64 <= 2147483647L ? eInteger.ShiftRight((int) jGetLowBitAsInt64) : eInteger.ShiftRight(EInteger.FromInt64(jGetLowBitAsInt64));
                if (fastInteger2 != null) {
                    fastInteger2.SubtractInt64(jGetLowBitAsInt64);
                }
                if (fastInteger != null) {
                    fastInteger.AddInt64(jGetLowBitAsInt64);
                }
                return eIntegerShiftRight;
            }
        }
        EInteger eIntegerFromInt32 = EInteger.FromInt32(i2);
        new FastInteger(0);
        while (!eInteger.isZero() && ((fastInteger3 == null || fastInteger2.compareTo(fastInteger3) != 0) && (fastInteger4 == null || fastInteger.compareTo(fastInteger4) != 0))) {
            EInteger[] eIntegerArrDivRem = eInteger.DivRem(eIntegerFromInt32);
            EInteger eInteger2 = eIntegerArrDivRem[0];
            if (!eIntegerArrDivRem[1].isZero()) {
                break;
            }
            fastInteger.Increment();
            if (fastInteger2 != null) {
                fastInteger2.Decrement();
            }
            eInteger = eInteger2;
        }
        return eInteger;
    }

    static int ShiftAwayTrailingZerosTwoElements(int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int iCountTrailingZeros = CountTrailingZeros(i2);
        if (iCountTrailingZeros == 0) {
            return 0;
        }
        if (iCountTrailingZeros < 32) {
            int i4 = i3 << (32 - iCountTrailingZeros);
            int i5 = i2 >> iCountTrailingZeros;
            int i6 = Integer.MAX_VALUE >> (iCountTrailingZeros - 1);
            int i7 = (i5 + i6) - (i5 | i6);
            iArr[0] = (i7 + i4) - (i7 & i4);
            iArr[1] = (-1) - (((-1) - (i3 >> iCountTrailingZeros)) | ((-1) - i6));
            return iCountTrailingZeros;
        }
        int iCountTrailingZeros2 = CountTrailingZeros(i3);
        if (iCountTrailingZeros2 == 32) {
            iArr[0] = 0;
        } else if (iCountTrailingZeros2 > 0) {
            iArr[0] = (i3 >> iCountTrailingZeros2) & (Integer.MAX_VALUE >> (iCountTrailingZeros2 - 1));
        } else {
            iArr[0] = i3;
        }
        iArr[1] = 0;
        return iCountTrailingZeros2 + 32;
    }

    static int ShiftLeftOne(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            iArr[i3] = (-1) - (((-1) - i2) & ((-1) - (i4 << 1)));
            i2 = (i4 >> 31) != 0 ? 1 : 0;
        }
        return i2;
    }
}

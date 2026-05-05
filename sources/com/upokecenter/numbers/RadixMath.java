package com.upokecenter.numbers;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.ViewCompat;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.squareup.wire.internal.MathMethodsKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.ws.WebSocketProtocol;
import yg.C1521gK;

/* JADX INFO: loaded from: classes5.dex */
class RadixMath<T> implements IRadixMath<T> {
    private static final int IntegerModeFixedScale = 1;
    private static final int IntegerModeRegular = 0;
    private static final int SafeMax32 = 1073741822;
    private static final long SafeMax64 = 4611686018427387902L;
    private static final int SafeMin32 = -1073741822;
    private static final long SafeMin64 = -4611686018427387902L;
    private final IRadixMathHelper<T> helper;
    private final int support;
    private final int thisRadix;
    private static final int[] BitMasks = {Integer.MAX_VALUE, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, 536870911, 268435455, 134217727, 67108863, 33554431, ViewCompat.MEASURED_SIZE_MASK, 8388607, 4194303, 2097151, 1048575, 524287, 262143, 131071, 65535, LayoutKt.LargeDimension, 16383, 8191, 4095, 2047, 1023, FrameMetricsAggregator.EVERY_DURATION, 255, 127, 63, 31, 15, 7, 3, 1};
    private static final long[] BitMasks64 = {Long.MAX_VALUE, DurationKt.MAX_MILLIS, 2305843009213693951L, 1152921504606846975L, 576460752303423487L, 288230376151711743L, 144115188075855871L, 72057594037927935L, 36028797018963967L, 18014398509481983L, C1521gK.Yd, 4503599627370495L, 2251799813685247L, 1125899906842623L, 562949953421311L, 281474976710655L, 140737488355327L, 70368744177663L, 35184372088831L, 17592186044415L, 8796093022207L, 4398046511103L, 2199023255551L, 1099511627775L, 549755813887L, 274877906943L, 137438953471L, 68719476735L, 34359738367L, 17179869183L, 8589934591L, 4294967295L, 2147483647L, LockFreeTaskQueueCore.HEAD_MASK, 536870911, 268435455, 134217727, 67108863, 33554431, 16777215, 8388607, 4194303, 2097151, 1048575, 524287, 262143, 131071, WebSocketProtocol.PAYLOAD_SHORT_MAX, 32767, 16383, 8191, 4095, 2047, 1023, 511, 255, 127, 63, 31, 15, 7, 3, 1};
    private static final int[] OverflowMaxes = {Integer.MAX_VALUE, 214748364, 21474836, 2147483, 214748, 21474, 2147, Mp4VideoDirectory.TAG_FRAME_RATE, 21, 2};
    private static final EInteger ValueMinusOne = EInteger.FromInt32(0).Subtract(EInteger.FromInt64(1));
    private static final int[] ValueTenPowers = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static final long[] OverflowMaxes64 = {Long.MAX_VALUE, 922337203685477580L, 92233720368547758L, 9223372036854775L, 922337203685477L, 92233720368547L, 9223372036854L, 922337203685L, 92233720368L, 9223372036L, 922337203, 92233720, 9223372, 922337, 92233, 9223, 922, 92, 9};
    private static final long[] ValueTenPowers64 = {1, 10, 100, 1000, 10000, 100000, AnimationKt.MillisToNanos, 10000000, 100000000, MathMethodsKt.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER};
    private static EInteger valueMaxDigits = EInteger.FromInt64(5726623058L);
    private static final int[] BitsPerDigit = {0, 0, 100, 158, 200, 232, 258, 280, 300, 316, 332};
    private static final EContext DefaultUnlimited = EContext.UnlimitedHalfEven.WithRounding(ERounding.HalfEven);

    public RadixMath(IRadixMathHelper<T> iRadixMathHelper) {
        this.helper = iRadixMathHelper;
        this.support = iRadixMathHelper.GetArithmeticSupport();
        this.thisRadix = iRadixMathHelper.GetRadix();
    }

    private T AbsRaw(T t2) {
        return EnsureSign(t2, false);
    }

    private T AddCore(EInteger eInteger, EInteger eInteger2, EInteger eInteger3, int i2, int i3, EContext eContext) {
        EInteger eIntegerAdd;
        int i4;
        int i5 = 1;
        int i6 = (i2 + 1) - (i2 | 1) != 0 ? 1 : 0;
        int i7 = (i3 + 1) - (i3 | 1) != 0 ? 1 : 0;
        if (i6 != i7) {
            eIntegerAdd = eInteger.Subtract(eInteger2);
            int iSignum = eIntegerAdd.signum();
            i4 = (iSignum == 0 ? i7 : iSignum < 0 ? 1 : 0) ^ i6;
            if (iSignum < 0) {
                eIntegerAdd = eIntegerAdd.Negate();
            }
        } else {
            eIntegerAdd = eInteger.Add(eInteger2);
            i4 = i6;
        }
        if (i4 != 0 && eIntegerAdd.isZero()) {
            if ((i6 == 0 || i7 == 0) && ((i6 ^ i7) == 0 || eContext == null || eContext.getRounding() != ERounding.Floor)) {
                i5 = 0;
            }
            i4 = (i4 + i5) - (i4 | i5);
        }
        return this.helper.CreateNewWithFlags(eIntegerAdd, eInteger3, i4);
    }

    private T AddCore(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, FastIntegerFixed fastIntegerFixed3, int i2, int i3, EContext eContext) {
        FastIntegerFixed fastIntegerFixedAdd;
        int i4;
        int i5 = 1;
        int i6 = (i2 & 1) != 0 ? 1 : 0;
        int i7 = (i3 & 1) != 0 ? 1 : 0;
        if (i6 != i7) {
            fastIntegerFixedAdd = fastIntegerFixed.Subtract(fastIntegerFixed2);
            int iSignum = fastIntegerFixedAdd.signum();
            i4 = (iSignum == 0 ? i7 : iSignum < 0 ? 1 : 0) ^ i6;
            if (iSignum < 0) {
                fastIntegerFixedAdd = fastIntegerFixedAdd.Negate();
            }
        } else {
            fastIntegerFixedAdd = fastIntegerFixed.Add(fastIntegerFixed2);
            i4 = i6;
        }
        if (i4 != 0 && fastIntegerFixedAdd.isValueZero()) {
            if ((i6 == 0 || i7 == 0) && ((i6 ^ i7) == 0 || eContext == null || eContext.getRounding() != ERounding.Floor)) {
                i5 = 0;
            }
            i4 &= i5;
        }
        return this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedAdd, fastIntegerFixed3, i4);
    }

    private T AddCore2(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, FastIntegerFixed fastIntegerFixed3, int i2, int i3, EContext eContext) {
        FastIntegerFixed fastIntegerFixedAdd;
        int i4;
        int i5 = 1;
        int i6 = (i2 & 1) != 0 ? 1 : 0;
        int i7 = (i3 + 1) - (i3 | 1) != 0 ? 1 : 0;
        if (i6 != i7) {
            fastIntegerFixedAdd = FastIntegerFixed.Subtract(fastIntegerFixed, fastIntegerFixed2);
            int iSignum = fastIntegerFixedAdd.signum();
            if (iSignum < 0) {
                i4 = i6 ^ 1;
                fastIntegerFixedAdd = fastIntegerFixedAdd.Negate();
            } else if (iSignum == 0) {
                i4 = i6 ^ i7;
                if (i4 != 0) {
                    if ((i6 == 0 || i7 == 0) && (i4 == 0 || eContext == null || eContext.getRounding() != ERounding.Floor)) {
                        i5 = 0;
                    }
                    i4 = (-1) - (((-1) - i4) | ((-1) - i5));
                }
            }
            i6 = i4;
        } else {
            fastIntegerFixedAdd = FastIntegerFixed.Add(fastIntegerFixed, fastIntegerFixed2);
            if (i6 != 0 && fastIntegerFixedAdd.isValueZero()) {
                if ((i6 == 0 || i7 == 0) && ((i6 ^ i7) == 0 || eContext == null || eContext.getRounding() != ERounding.Floor)) {
                    i5 = 0;
                }
                i6 = (-1) - (((-1) - i6) | ((-1) - i5));
            }
        }
        return this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedAdd, fastIntegerFixed3, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x024b A[PHI: r8
  0x024b: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v6 int) binds: [B:141:0x0205, B:143:0x0209, B:149:0x0221, B:151:0x0225, B:153:0x0228, B:164:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T AddEx32Bit(int r19, com.upokecenter.numbers.FastIntegerFixed r20, com.upokecenter.numbers.FastIntegerFixed r21, com.upokecenter.numbers.FastIntegerFixed r22, com.upokecenter.numbers.FastIntegerFixed r23, com.upokecenter.numbers.FastIntegerFixed r24, int r25, int r26, com.upokecenter.numbers.EContext r27) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.AddEx32Bit(int, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, int, int, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T AddEx64Bit(long r34, com.upokecenter.numbers.FastIntegerFixed r36, com.upokecenter.numbers.FastIntegerFixed r37, com.upokecenter.numbers.FastIntegerFixed r38, com.upokecenter.numbers.FastIntegerFixed r39, com.upokecenter.numbers.FastIntegerFixed r40, int r41, int r42, com.upokecenter.numbers.EContext r43) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.AddEx64Bit(long, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, com.upokecenter.numbers.FastIntegerFixed, int, int, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    private T AddExDiffExp(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, FastIntegerFixed fastIntegerFixed3, FastIntegerFixed fastIntegerFixed4, int i2, int i3, EContext eContext, int i4, boolean z2) {
        T tAddCore;
        FastIntegerFixed fastIntegerFixedRescaleByExponentDiff = fastIntegerFixed4;
        FastIntegerFixed fastIntegerFixedRescaleByExponentDiff2 = fastIntegerFixed2;
        FastIntegerFixed fastIntegerFixed5 = i4 < 0 ? fastIntegerFixed : fastIntegerFixed3;
        if (eContext != null && eContext.getHasMaxPrecision() && eContext.getPrecision().signum() > 0) {
            FastIntegerFixed fastIntegerFixedAbs = fastIntegerFixed.Subtract(fastIntegerFixed3).Abs();
            boolean zIsValueZero = fastIntegerFixedRescaleByExponentDiff.isValueZero();
            boolean zIsValueZero2 = fastIntegerFixedRescaleByExponentDiff2.isValueZero();
            byte b2 = zIsValueZero2 ? (byte) 0 : (i2 & 1) != 0 ? (byte) -1 : (byte) 1;
            byte b3 = zIsValueZero ? (byte) 0 : (i3 + 1) - (i3 | 1) != 0 ? (byte) -1 : (byte) 1;
            if (fastIntegerFixedAbs.compareTo(eContext.getPrecision()) > 0) {
                int iCompareTo = fastIntegerFixed.compareTo(fastIntegerFixed3);
                if (iCompareTo < 0) {
                    if (!zIsValueZero) {
                        FastIntegerFixed fastIntegerFixed6 = NumberUtility.DigitLengthBoundsFixed(this.helper, fastIntegerFixedRescaleByExponentDiff2)[1];
                        if (fastIntegerFixed.Add(fastIntegerFixed6).Add(2).compareTo(fastIntegerFixed3) < 0 && fastIntegerFixed3.Subtract(4).Subtract(fastIntegerFixed6).Subtract(eContext.getPrecision()).Subtract(fastIntegerFixed3).Abs().compareTo(fastIntegerFixedAbs) < 0) {
                            int i5 = b2 == b3 ? 1 : 0;
                            FastIntegerFixed fastIntegerFixedDigitLengthFixed = NumberUtility.DigitLengthFixed(this.helper, fastIntegerFixedRescaleByExponentDiff);
                            if (fastIntegerFixedDigitLengthFixed.compareTo(eContext.getPrecision()) >= 0) {
                                if (!zIsValueZero2 && i5 == 0) {
                                    FastIntegerFixed fastIntegerFixedTryMultiplyByRadixPowerFastInt = TryMultiplyByRadixPowerFastInt(fastIntegerFixedRescaleByExponentDiff, FastIntegerFixed.FromInt32(2));
                                    if (fastIntegerFixedTryMultiplyByRadixPowerFastInt == null) {
                                        return SignalInvalidWithMessage(eContext, "Result requires too much memory");
                                    }
                                    return RoundToPrecisionInternal(this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedTryMultiplyByRadixPowerFastInt.Subtract(1), fastIntegerFixed3.Subtract(2), i3), 0, 0, ToFastInteger(fastIntegerFixedDigitLengthFixed.Subtract(eContext.getPrecision())), false, eContext);
                                }
                                FastIntegerFixed fastIntegerFixedSubtract = fastIntegerFixedDigitLengthFixed.Subtract(eContext.getPrecision());
                                if (i5 == 0 && eContext != null && eContext.getHasFlags()) {
                                    eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 2)));
                                }
                                return RoundToPrecisionInternal(this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedRescaleByExponentDiff, fastIntegerFixed3, i3), 0, i5, ToFastInteger(fastIntegerFixedSubtract), false, eContext);
                            }
                            FastIntegerFixed fastIntegerFixedSubtract2 = FastIntegerFixed.FromBig(eContext.getPrecision()).Subtract(fastIntegerFixedDigitLengthFixed);
                            if (!zIsValueZero2 && i5 == 0) {
                                fastIntegerFixedSubtract2 = fastIntegerFixedSubtract2.Add(2);
                            }
                            FastIntegerFixed fastIntegerFixedTryMultiplyByRadixPowerFastInt2 = TryMultiplyByRadixPowerFastInt(fastIntegerFixedRescaleByExponentDiff, fastIntegerFixedSubtract2);
                            if (fastIntegerFixedTryMultiplyByRadixPowerFastInt2 == null) {
                                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
                            }
                            FastIntegerFixed fastIntegerFixedSubtract3 = fastIntegerFixed3.Subtract(fastIntegerFixedSubtract2);
                            if (!zIsValueZero2 && i5 == 0) {
                                fastIntegerFixedTryMultiplyByRadixPowerFastInt2 = fastIntegerFixedTryMultiplyByRadixPowerFastInt2.Subtract(1);
                            }
                            T tCreateNewWithFlagsFastInt = this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedTryMultiplyByRadixPowerFastInt2, fastIntegerFixedSubtract3, i3);
                            FastIntegerFixed fastIntegerFixedSubtract4 = fastIntegerFixedDigitLengthFixed.Subtract(eContext.getPrecision());
                            if (zIsValueZero2 && eContext != null && eContext.getHasFlags()) {
                                eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 2)));
                            }
                            return RoundToPrecisionInternal(tCreateNewWithFlagsFastInt, (zIsValueZero2 || i5 != 0) ? 0 : 1, (zIsValueZero2 && i5 == 0) ? 0 : 1, ToFastInteger(fastIntegerFixedSubtract4), false, eContext);
                        }
                    }
                } else if (iCompareTo > 0 && !zIsValueZero2) {
                    FastIntegerFixed fastIntegerFixed7 = NumberUtility.DigitLengthBoundsFixed(this.helper, fastIntegerFixedRescaleByExponentDiff)[1];
                    if (fastIntegerFixed3.Add(fastIntegerFixed7).Add(2).compareTo(fastIntegerFixed) < 0 && fastIntegerFixed.Subtract(4).Subtract(fastIntegerFixed7).Subtract(eContext.getPrecision()).Subtract(fastIntegerFixed).Abs().compareTo(fastIntegerFixedAbs) < 0) {
                        int i6 = b2 == b3 ? 1 : 0;
                        FastIntegerFixed fastIntegerFixedDigitLengthFixed2 = NumberUtility.DigitLengthFixed(this.helper, fastIntegerFixedRescaleByExponentDiff2);
                        if (fastIntegerFixedDigitLengthFixed2.compareTo(eContext.getPrecision()) >= 0) {
                            if (!zIsValueZero && i6 == 0) {
                                FastIntegerFixed fastIntegerFixedTryMultiplyByRadixPowerFastInt3 = TryMultiplyByRadixPowerFastInt(fastIntegerFixedRescaleByExponentDiff2, FastIntegerFixed.FromInt32(2));
                                if (fastIntegerFixedTryMultiplyByRadixPowerFastInt3 == null) {
                                    return SignalInvalidWithMessage(eContext, "Result requires too much memory");
                                }
                                return RoundToPrecisionInternal(this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedTryMultiplyByRadixPowerFastInt3.Subtract(1), fastIntegerFixed.Subtract(2), i2), 0, 0, ToFastInteger(fastIntegerFixedDigitLengthFixed2.Subtract(eContext.getPrecision())), false, eContext);
                            }
                            FastIntegerFixed fastIntegerFixedSubtract5 = fastIntegerFixedDigitLengthFixed2.Subtract(eContext.getPrecision());
                            if (i6 == 0 && eContext != null && eContext.getHasFlags()) {
                                int flags = eContext.getFlags();
                                eContext.setFlags((flags + 2) - (flags & 2));
                            }
                            return RoundToPrecisionInternal(this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedRescaleByExponentDiff2, fastIntegerFixed, i2), 0, i6, ToFastInteger(fastIntegerFixedSubtract5), false, eContext);
                        }
                        FastIntegerFixed fastIntegerFixedSubtract6 = FastIntegerFixed.FromBig(eContext.getPrecision()).Subtract(fastIntegerFixedDigitLengthFixed2);
                        if (!zIsValueZero && i6 == 0) {
                            fastIntegerFixedSubtract6 = fastIntegerFixedSubtract6.Add(2);
                        }
                        FastIntegerFixed fastIntegerFixedTryMultiplyByRadixPowerFastInt4 = TryMultiplyByRadixPowerFastInt(fastIntegerFixedRescaleByExponentDiff2, fastIntegerFixedSubtract6);
                        if (fastIntegerFixedTryMultiplyByRadixPowerFastInt4 == null) {
                            return SignalInvalidWithMessage(eContext, "Result requires too much memory");
                        }
                        FastIntegerFixed fastIntegerFixedSubtract7 = fastIntegerFixed.Subtract(fastIntegerFixedSubtract6);
                        if (!zIsValueZero && i6 == 0) {
                            fastIntegerFixedTryMultiplyByRadixPowerFastInt4 = fastIntegerFixedTryMultiplyByRadixPowerFastInt4.Subtract(1);
                        }
                        T tCreateNewWithFlagsFastInt2 = this.helper.CreateNewWithFlagsFastInt(fastIntegerFixedTryMultiplyByRadixPowerFastInt4, fastIntegerFixedSubtract7, i2);
                        FastIntegerFixed fastIntegerFixedSubtract8 = fastIntegerFixedDigitLengthFixed2.Subtract(eContext.getPrecision());
                        if (zIsValueZero && eContext != null && eContext.getHasFlags()) {
                            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 2)));
                        }
                        return RoundToPrecisionInternal(tCreateNewWithFlagsFastInt2, (zIsValueZero || i6 != 0) ? 0 : 1, (zIsValueZero && i6 == 0) ? 0 : 1, ToFastInteger(fastIntegerFixedSubtract8), false, eContext);
                    }
                }
                i4 = fastIntegerFixed.compareTo(fastIntegerFixed3);
                fastIntegerFixed5 = i4 < 0 ? fastIntegerFixed : fastIntegerFixed3;
            }
        }
        if (i4 > 0) {
            fastIntegerFixedRescaleByExponentDiff2 = RescaleByExponentDiff(fastIntegerFixedRescaleByExponentDiff2, fastIntegerFixed, fastIntegerFixed3, this.helper);
            if (fastIntegerFixedRescaleByExponentDiff2 == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            tAddCore = AddCore(fastIntegerFixedRescaleByExponentDiff2, fastIntegerFixedRescaleByExponentDiff, fastIntegerFixed5, i2, i3, eContext);
        } else {
            fastIntegerFixedRescaleByExponentDiff = RescaleByExponentDiff(fastIntegerFixedRescaleByExponentDiff, fastIntegerFixed, fastIntegerFixed3, this.helper);
            if (fastIntegerFixedRescaleByExponentDiff == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            tAddCore = AddCore(fastIntegerFixedRescaleByExponentDiff2, fastIntegerFixedRescaleByExponentDiff, fastIntegerFixed5, i2, i3, eContext);
        }
        if (!z2 || eContext == null || !eContext.getHasMaxPrecision()) {
            return IsNullOrSimpleContext(eContext) ? tAddCore : RoundToPrecision(tAddCore, eContext);
        }
        FastInteger fastIntegerGetDigitLength = this.helper.GetDigitLength(fastIntegerFixedRescaleByExponentDiff2.ToEInteger());
        FastInteger fastIntegerGetDigitLength2 = this.helper.GetDigitLength(fastIntegerFixedRescaleByExponentDiff.ToEInteger());
        if (fastIntegerGetDigitLength.compareTo(fastIntegerGetDigitLength2) <= 0) {
            fastIntegerGetDigitLength = fastIntegerGetDigitLength2;
        }
        fastIntegerGetDigitLength.SubtractBig(eContext.getPrecision());
        return fastIntegerGetDigitLength.signum() > 0 ? RoundToPrecisionInternal(tAddCore, 0, 0, fastIntegerGetDigitLength, false, eContext) : RoundToPrecision(tAddCore, eContext);
    }

    private static String Chop(String str) {
        return str.length() < 100 ? str : str.substring(0, 100) + "...";
    }

    private static int CompareToFast(int i2, int i3, int i4, int i5, FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, int i6) {
        if (i2 >= SafeMin32 && i2 <= SafeMax32 && i3 >= SafeMin32 && i3 <= SafeMax32) {
            int i7 = i2 > i3 ? i2 - i3 : i3 - i2;
            if (i7 <= 9 && i6 == 10) {
                int i8 = ValueTenPowers[i7];
                int i9 = OverflowMaxes[i7];
                if (i4 > 0) {
                    int iToInt32 = fastIntegerFixed.ToInt32();
                    int iToInt322 = fastIntegerFixed2.ToInt32();
                    if (iToInt32 <= i9) {
                        int i10 = iToInt32 * i8;
                        if (i10 == iToInt322) {
                            return 0;
                        }
                        return i10 < iToInt322 ? -i5 : i5;
                    }
                } else {
                    int iToInt323 = fastIntegerFixed.ToInt32();
                    int iToInt324 = fastIntegerFixed2.ToInt32();
                    if (iToInt324 <= i9) {
                        int i11 = iToInt324 * i8;
                        if (iToInt323 == i11) {
                            return 0;
                        }
                        return iToInt323 < i11 ? -i5 : i5;
                    }
                }
            } else if (i7 <= 30 && i6 == 2) {
                int i12 = BitMasks[i7];
                if (i4 > 0) {
                    int iToInt325 = fastIntegerFixed.ToInt32();
                    int iToInt326 = fastIntegerFixed2.ToInt32();
                    if ((-1) - (((-1) - i12) | ((-1) - iToInt325)) == iToInt325) {
                        int i13 = iToInt325 << i7;
                        if (i13 == iToInt326) {
                            return 0;
                        }
                        return i13 < iToInt326 ? -i5 : i5;
                    }
                } else {
                    int iToInt327 = fastIntegerFixed.ToInt32();
                    int iToInt328 = fastIntegerFixed2.ToInt32();
                    if ((-1) - (((-1) - i12) | ((-1) - iToInt328)) == iToInt328) {
                        int i14 = iToInt328 << i7;
                        if (iToInt327 == i14) {
                            return 0;
                        }
                        return iToInt327 < i14 ? -i5 : i5;
                    }
                }
            }
        }
        return 2;
    }

    private static int CompareToFast64(int i2, int i3, int i4, int i5, FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, int i6) {
        if (i2 >= SafeMin32 && i2 <= SafeMax32 && i3 >= SafeMin32 && i3 <= SafeMax32) {
            long j2 = i2 > i3 ? i2 - i3 : i3 - i2;
            if (j2 <= 18 && i6 == 10) {
                int i7 = (int) j2;
                long j3 = ValueTenPowers64[i7];
                long j4 = OverflowMaxes64[i7];
                if (i4 > 0) {
                    long jToInt64 = fastIntegerFixed.ToInt64();
                    long jToInt642 = fastIntegerFixed2.ToInt64();
                    if (jToInt64 <= j4) {
                        long j5 = jToInt64 * j3;
                        if (j5 == jToInt642) {
                            return 0;
                        }
                        return j5 < jToInt642 ? -i5 : i5;
                    }
                } else {
                    long jToInt643 = fastIntegerFixed.ToInt64();
                    long jToInt644 = fastIntegerFixed2.ToInt64();
                    if (jToInt644 <= j4) {
                        long j6 = jToInt644 * j3;
                        if (jToInt643 == j6) {
                            return 0;
                        }
                        return jToInt643 < j6 ? -i5 : i5;
                    }
                }
            } else if (j2 <= 62 && i6 == 2) {
                int i8 = (int) j2;
                long j7 = BitMasks64[i8];
                if (i4 > 0) {
                    long jToInt645 = fastIntegerFixed.ToInt64();
                    long jToInt646 = fastIntegerFixed2.ToInt64();
                    if ((-1) - (((-1) - j7) | ((-1) - jToInt645)) == jToInt645) {
                        long j8 = jToInt645 << i8;
                        if (j8 == jToInt646) {
                            return 0;
                        }
                        return j8 < jToInt646 ? -i5 : i5;
                    }
                } else {
                    long jToInt647 = fastIntegerFixed.ToInt64();
                    long jToInt648 = fastIntegerFixed2.ToInt64();
                    if ((-1) - (((-1) - j7) | ((-1) - jToInt648)) == jToInt648) {
                        long j9 = jToInt648 << i8;
                        if (jToInt647 == j9) {
                            return 0;
                        }
                        return jToInt647 < j9 ? -i5 : i5;
                    }
                }
            }
        }
        return 2;
    }

    private static int CompareToHalf(EInteger eInteger, EInteger eInteger2) {
        long jGetUnsignedBitLengthAsInt64 = eInteger.GetUnsignedBitLengthAsInt64();
        long jGetUnsignedBitLengthAsInt642 = eInteger2.GetUnsignedBitLengthAsInt64();
        if (jGetUnsignedBitLengthAsInt64 != Long.MAX_VALUE && jGetUnsignedBitLengthAsInt642 != Long.MAX_VALUE) {
            if (jGetUnsignedBitLengthAsInt642 - 1 > jGetUnsignedBitLengthAsInt64) {
                return -1;
            }
            if (jGetUnsignedBitLengthAsInt64 - 1 > jGetUnsignedBitLengthAsInt642) {
                return 1;
            }
        }
        int iCompareTo = eInteger.compareTo(eInteger2.ShiftRight(1));
        if (iCompareTo != 0 || eInteger2.isEven()) {
            return iCompareTo;
        }
        return -1;
    }

    private T CompareToHandleSpecial(T t2, T t3, boolean z2, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if (((iGetFlags | iGetFlags2) & 14) != 0) {
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 8)) != 0) {
                return SignalingNaNInvalid(t2, eContext);
            }
            if ((-1) - (((-1) - iGetFlags2) | ((-1) - 8)) != 0) {
                return SignalingNaNInvalid(t3, eContext);
            }
            if (z2) {
                if ((-1) - (((-1) - iGetFlags) | ((-1) - 4)) != 0) {
                    return SignalingNaNInvalid(t2, eContext);
                }
                if ((-1) - (((-1) - iGetFlags2) | ((-1) - 4)) != 0) {
                    return SignalingNaNInvalid(t3, eContext);
                }
            } else {
                if ((iGetFlags + 4) - (4 | iGetFlags) != 0) {
                    return ReturnQuietNaN(t2, eContext);
                }
                if ((-1) - (((-1) - iGetFlags2) | ((-1) - 4)) != 0) {
                    return ReturnQuietNaN(t3, eContext);
                }
            }
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0) {
                return (-1) - (((-1) - iGetFlags) | ((-1) - 3)) == (-1) - (((-1) - iGetFlags2) | ((-1) - 3)) ? ValueOf(0, null) : (iGetFlags & 1) == 0 ? ValueOf(1, null) : ValueOf(-1, null);
            }
            if ((-1) - (((-1) - iGetFlags2) | ((-1) - 2)) != 0) {
                return (iGetFlags & 3) == (-1) - (((-1) - iGetFlags2) | ((-1) - 3)) ? ValueOf(0, null) : (iGetFlags2 & 1) == 0 ? ValueOf(-1, null) : ValueOf(1, null);
            }
        }
        return null;
    }

    private static int CompareToHandleSpecial2(int i2, int i3) {
        if ((12 & i2) != 0) {
            return (i3 + 12) - (i3 | 12) != 0 ? 0 : 1;
        }
        if ((i3 + 12) - (12 | i3) != 0) {
            return -1;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            if ((i2 & 3) == (i3 + 3) - (i3 | 3)) {
                return 0;
            }
            return (-1) - (((-1) - i2) | ((-1) - 1)) == 0 ? 1 : -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) == 0) {
            return 2;
        }
        if ((i2 & 3) == (-1) - (((-1) - i3) | ((-1) - 3))) {
            return 0;
        }
        return (-1) - (((-1) - i3) | ((-1) - 1)) == 0 ? -1 : 1;
    }

    private static <TMath> int CompareToInternal(TMath tmath, TMath tmath2, boolean z2, IRadixMathHelper<TMath> iRadixMathHelper) {
        int iCompareToFast64;
        int iGetSign = iRadixMathHelper.GetSign(tmath);
        int iGetSign2 = iRadixMathHelper.GetSign(tmath2);
        if (iGetSign != iGetSign2) {
            return iGetSign < iGetSign2 ? -1 : 1;
        }
        if (iGetSign2 == 0 || iGetSign == 0) {
            return 0;
        }
        FastIntegerFixed fastIntegerFixedGetExponentFastInt = iRadixMathHelper.GetExponentFastInt(tmath);
        FastIntegerFixed fastIntegerFixedGetExponentFastInt2 = iRadixMathHelper.GetExponentFastInt(tmath2);
        FastIntegerFixed fastIntegerFixedGetMantissaFastInt = iRadixMathHelper.GetMantissaFastInt(tmath);
        FastIntegerFixed fastIntegerFixedGetMantissaFastInt2 = iRadixMathHelper.GetMantissaFastInt(tmath2);
        int iCompareTo = fastIntegerFixedGetExponentFastInt.compareTo(fastIntegerFixedGetExponentFastInt2);
        int iCompareTo2 = fastIntegerFixedGetMantissaFastInt.compareTo(fastIntegerFixedGetMantissaFastInt2);
        if (iCompareTo2 == 0) {
            return iGetSign < 0 ? -iCompareTo : iCompareTo;
        }
        if (iCompareTo == 0) {
            return iGetSign < 0 ? -iCompareTo2 : iCompareTo2;
        }
        if (fastIntegerFixedGetExponentFastInt.CanFitInInt32() && fastIntegerFixedGetExponentFastInt2.CanFitInInt32()) {
            if (fastIntegerFixedGetMantissaFastInt.CanFitInInt32() && fastIntegerFixedGetMantissaFastInt2.CanFitInInt32()) {
                int iCompareToFast = CompareToFast(fastIntegerFixedGetExponentFastInt.ToInt32(), fastIntegerFixedGetExponentFastInt2.ToInt32(), iCompareTo, iGetSign, fastIntegerFixedGetMantissaFastInt, fastIntegerFixedGetMantissaFastInt2, iRadixMathHelper.GetRadix());
                if (iCompareToFast <= 1) {
                    return iCompareToFast;
                }
            } else if (fastIntegerFixedGetMantissaFastInt.CanFitInInt64() && fastIntegerFixedGetMantissaFastInt2.CanFitInInt64() && (iCompareToFast64 = CompareToFast64(fastIntegerFixedGetExponentFastInt.ToInt32(), fastIntegerFixedGetExponentFastInt2.ToInt32(), iCompareTo, iGetSign, fastIntegerFixedGetMantissaFastInt, fastIntegerFixedGetMantissaFastInt2, iRadixMathHelper.GetRadix())) <= 1) {
                return iCompareToFast64;
            }
        }
        return CompareToSlow(fastIntegerFixedGetExponentFastInt.ToEInteger(), fastIntegerFixedGetExponentFastInt2.ToEInteger(), iCompareTo, iGetSign, fastIntegerFixedGetMantissaFastInt.ToEInteger(), fastIntegerFixedGetMantissaFastInt2.ToEInteger(), iRadixMathHelper, z2);
    }

    private static <TMath> int CompareToSlow(EInteger eInteger, EInteger eInteger2, int i2, int i3, EInteger eInteger3, EInteger eInteger4, IRadixMathHelper<TMath> iRadixMathHelper, boolean z2) {
        long jGetUnsignedBitLengthAsInt64 = eInteger.GetUnsignedBitLengthAsInt64();
        long jGetUnsignedBitLengthAsInt642 = eInteger2.GetUnsignedBitLengthAsInt64();
        boolean z3 = false;
        if (jGetUnsignedBitLengthAsInt64 < Long.MAX_VALUE && jGetUnsignedBitLengthAsInt642 < Long.MAX_VALUE && iRadixMathHelper.GetRadix() <= 10 && eInteger.signum() == eInteger2.signum() && ((jGetUnsignedBitLengthAsInt642 > jGetUnsignedBitLengthAsInt64 && jGetUnsignedBitLengthAsInt642 - jGetUnsignedBitLengthAsInt64 > 128) || (jGetUnsignedBitLengthAsInt64 > jGetUnsignedBitLengthAsInt642 && jGetUnsignedBitLengthAsInt64 - jGetUnsignedBitLengthAsInt642 > 128))) {
            if (eInteger.signum() >= 0 ? jGetUnsignedBitLengthAsInt642 > jGetUnsignedBitLengthAsInt64 : jGetUnsignedBitLengthAsInt642 < jGetUnsignedBitLengthAsInt64) {
                z3 = true;
            }
            return z3 ? i3 < 0 ? 1 : -1 : i3 < 0 ? -1 : 1;
        }
        FastInteger fastIntegerFromBig = FastInteger.FromBig(eInteger);
        FastInteger fastIntegerFromBig2 = FastInteger.FromBig(eInteger2);
        FastInteger fastIntegerAbs = fastIntegerFromBig.Copy().Subtract(fastIntegerFromBig2).Abs();
        if (fastIntegerAbs.CompareToInt(200) >= 0) {
            FastInteger[] fastIntegerArrDigitLengthBounds = NumberUtility.DigitLengthBounds(iRadixMathHelper, eInteger3);
            FastInteger[] fastIntegerArrDigitLengthBounds2 = NumberUtility.DigitLengthBounds(iRadixMathHelper, eInteger4);
            if (fastIntegerFromBig2.Copy().Add(fastIntegerArrDigitLengthBounds2[1]).compareTo(fastIntegerFromBig.Copy().Add(fastIntegerArrDigitLengthBounds[0])) < 0) {
                return i3 < 0 ? -1 : 1;
            }
            if (fastIntegerFromBig.Copy().Add(fastIntegerArrDigitLengthBounds[1]).compareTo(fastIntegerFromBig2.Copy().Add(fastIntegerArrDigitLengthBounds2[0])) < 0) {
                return i3 < 0 ? 1 : -1;
            }
            FastInteger fastIntegerGetDigitLength = fastIntegerArrDigitLengthBounds[0].compareTo(fastIntegerArrDigitLengthBounds[1]) == 0 ? fastIntegerArrDigitLengthBounds[0] : iRadixMathHelper.GetDigitLength(eInteger3);
            FastInteger fastIntegerGetDigitLength2 = fastIntegerArrDigitLengthBounds2[0].compareTo(fastIntegerArrDigitLengthBounds2[1]) == 0 ? fastIntegerArrDigitLengthBounds2[0] : iRadixMathHelper.GetDigitLength(eInteger4);
            int iCompareTo = fastIntegerFromBig.Copy().Add(fastIntegerGetDigitLength).Decrement().compareTo(fastIntegerFromBig2.Copy().Add(fastIntegerGetDigitLength2).Decrement());
            if (iCompareTo != 0) {
                return i3 < 0 ? -iCompareTo : iCompareTo;
            }
            if (fastIntegerGetDigitLength.compareTo(fastIntegerGetDigitLength2) <= 0) {
                fastIntegerGetDigitLength = fastIntegerGetDigitLength2;
            }
            if (fastIntegerAbs.Copy().compareTo(fastIntegerGetDigitLength) > 0) {
                int iCompareTo2 = fastIntegerFromBig.compareTo(fastIntegerFromBig2);
                if (iCompareTo2 < 0) {
                    if (!eInteger4.isZero()) {
                        FastInteger fastIntegerGetDigitLength3 = iRadixMathHelper.GetDigitLength(eInteger3);
                        if (fastIntegerFromBig.Copy().Add(fastIntegerGetDigitLength3).AddInt(2).compareTo(fastIntegerFromBig2) < 0 && fastIntegerFromBig2.Copy().SubtractInt(8).Subtract(fastIntegerGetDigitLength3).Subtract(fastIntegerGetDigitLength).Copy().Subtract(fastIntegerFromBig2).Abs().compareTo(fastIntegerAbs) < 0) {
                            return i3 < 0 ? 1 : -1;
                        }
                    }
                } else if (iCompareTo2 > 0 && !eInteger3.isZero()) {
                    FastInteger fastIntegerGetDigitLength4 = iRadixMathHelper.GetDigitLength(eInteger4);
                    if (fastIntegerFromBig2.Copy().Add(fastIntegerGetDigitLength4).AddInt(2).compareTo(fastIntegerFromBig) < 0 && fastIntegerFromBig.Copy().SubtractInt(8).Subtract(fastIntegerGetDigitLength4).Subtract(fastIntegerGetDigitLength).Copy().Subtract(fastIntegerFromBig).Abs().compareTo(fastIntegerAbs) < 0) {
                        return i3 < 0 ? -1 : 1;
                    }
                }
                i2 = eInteger.compareTo(eInteger2);
            }
        }
        if (i2 > 0) {
            EInteger eIntegerRescaleByExponentDiff = RescaleByExponentDiff(eInteger3, eInteger, eInteger2, iRadixMathHelper);
            if (eIntegerRescaleByExponentDiff != null) {
                int iCompareTo3 = eIntegerRescaleByExponentDiff.compareTo(eInteger4);
                return i3 < 0 ? -iCompareTo3 : iCompareTo3;
            }
            if (z2) {
                throw new OutOfMemoryError("Result requires too much memory");
            }
            return -2;
        }
        EInteger eIntegerRescaleByExponentDiff2 = RescaleByExponentDiff(eInteger4, eInteger, eInteger2, iRadixMathHelper);
        if (eIntegerRescaleByExponentDiff2 != null) {
            int iCompareTo4 = eInteger3.compareTo(eIntegerRescaleByExponentDiff2);
            return i3 < 0 ? -iCompareTo4 : iCompareTo4;
        }
        if (z2) {
            throw new OutOfMemoryError("Result requires too much memory");
        }
        return -2;
    }

    private FastInteger DigitLengthUpperBoundForBitPrecision(FastInteger fastInteger) {
        int i2 = this.thisRadix;
        return i2 == 2 ? fastInteger : (i2 != 10 || fastInteger.CompareToInt(2135) > 0) ? (this.thisRadix != 10 || fastInteger.CompareToInt(6432162) > 0) ? this.helper.GetDigitLength(EInteger.FromInt32(1).ShiftLeft(fastInteger.ToEInteger()).Subtract(1)) : new FastInteger(((int) ((((long) fastInteger.ToInt32()) * 661971961083L) >> 41)) + 1) : new FastInteger(((fastInteger.ToInt32() * 631305) >> 21) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T DivideInternal(T t2, T t3, EContext eContext, int i2, EInteger eInteger) {
        EInteger eIntegerFromInt32;
        int i3;
        FastInteger fastIntegerFromBig;
        int i4;
        EInteger eInteger2;
        FastInteger fastIntegerSubtract;
        EInteger eInteger3;
        char c2;
        int iMax;
        T tDivisionHandleSpecial = DivisionHandleSpecial(t2, t3, eContext);
        if (tDivisionHandleSpecial != null) {
            return tDivisionHandleSpecial;
        }
        int iGetSign = this.helper.GetSign(t2);
        int i5 = 1;
        if (this.helper.GetSign(t3) == 0) {
            if (iGetSign == 0) {
                return SignalInvalid(eContext);
            }
            int iGetFlags = this.helper.GetFlags(t2);
            return SignalDivideByZero(eContext, ((iGetFlags + 1) - (iGetFlags | 1) != 0) ^ ((-1) - (((-1) - this.helper.GetFlags(t3)) | ((-1) - 1)) != 0));
        }
        int i6 = this.thisRadix;
        if (iGetSign == 0) {
            if (i2 != 1) {
                return RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), this.helper.GetExponent(t2).Subtract(this.helper.GetExponent(t3)), ((-1) - (((-1) - this.helper.GetFlags(t2)) | ((-1) - 1))) ^ (this.helper.GetFlags(t3) & 1)), eContext);
            }
            int iGetFlags2 = this.helper.GetFlags(t2);
            return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), eInteger, ((iGetFlags2 + 1) - (iGetFlags2 | 1)) ^ (this.helper.GetFlags(t3) & 1));
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        EInteger eIntegerGetMantissa2 = this.helper.GetMantissa(t3);
        FastIntegerFixed fastIntegerFixedGetExponentFastInt = this.helper.GetExponentFastInt(t2);
        FastIntegerFixed fastIntegerFixedGetExponentFastInt2 = this.helper.GetExponentFastInt(t3);
        int iGetFlags3 = (-1) - (((-1) - this.helper.GetFlags(t2)) | ((-1) - 1));
        int iGetFlags4 = this.helper.GetFlags(t3);
        int i7 = iGetFlags3 != (iGetFlags4 + 1) - (iGetFlags4 | 1) ? 1 : 0;
        FastInteger fastIntegerToFastInteger = FastIntegerFixed.Subtract(fastIntegerFixedGetExponentFastInt, fastIntegerFixedGetExponentFastInt2).ToFastInteger();
        EInteger eIntegerFromInt322 = (eContext == null || !eContext.getHasMaxPrecision()) ? EInteger.FromInt32(0) : eContext.getPrecision();
        if (i2 == 1) {
            FastInteger fastIntegerFromBig2 = FastInteger.FromBig(eInteger);
            if (eContext != null && eContext.getHasFlags() && fastIntegerFromBig2.compareTo(fastIntegerToFastInteger) > 0) {
                eContext.setFlags((-1) - (((-1) - 2) & ((-1) - eContext.getFlags())));
            }
            if (fastIntegerToFastInteger.compareTo(fastIntegerFromBig2) <= 0) {
                FastInteger fastIntegerSubtract2 = fastIntegerFromBig2.Copy().Subtract(fastIntegerToFastInteger);
                EInteger[] eIntegerArrDivRem = eIntegerGetMantissa.DivRem(eIntegerGetMantissa2);
                return RoundToScale(eIntegerArrDivRem[0], eIntegerArrDivRem[1], eIntegerGetMantissa2, eInteger, fastIntegerSubtract2, i7, eContext);
            }
            if (eContext != null && eContext.getPrecision().signum() != 0 && fastIntegerToFastInteger.Copy().SubtractInt(8).compareTo(eIntegerFromInt322) > 0) {
                return SignalInvalidWithMessage(eContext, "Result can't fit the precision");
            }
            EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(eIntegerGetMantissa, fastIntegerToFastInteger.Copy().Subtract(fastIntegerFromBig2));
            if (eIntegerTryMultiplyByRadixPower == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            EInteger[] eIntegerArrDivRem2 = eIntegerTryMultiplyByRadixPower.DivRem(eIntegerGetMantissa2);
            return RoundToScale(eIntegerArrDivRem2[0], eIntegerArrDivRem2[1], eIntegerGetMantissa2, eInteger, new FastInteger(0), i7, eContext);
        }
        if (i2 == 0) {
            if (this.thisRadix == 2 && fastIntegerFixedGetExponentFastInt2.CompareToInt(0) == 0 && fastIntegerFixedGetExponentFastInt.CompareToInt(0) == 0 && eContext != null && eContext.getHasMaxPrecision() && eContext.getPrecision().compareTo(53) <= 0 && eIntegerGetMantissa.CanFitInInt64() && eIntegerGetMantissa2.CanFitInInt64()) {
                z = true;
            }
            if (z) {
                EInteger eIntegerAbs = eIntegerGetMantissa.Abs();
                EInteger eIntegerAbs2 = eIntegerGetMantissa2.Abs();
                int iToInt32Checked = eContext.getPrecision().ToInt32Checked();
                int iGetUnsignedBitLengthAsInt64 = (int) eIntegerAbs.GetUnsignedBitLengthAsInt64();
                int iGetUnsignedBitLengthAsInt642 = (int) eIntegerGetMantissa2.GetUnsignedBitLengthAsInt64();
                if (iGetUnsignedBitLengthAsInt64 <= iGetUnsignedBitLengthAsInt642) {
                    iMax = (iGetUnsignedBitLengthAsInt642 - iGetUnsignedBitLengthAsInt64) + iToInt32Checked + 1;
                    c2 = 0;
                } else {
                    c2 = 0;
                    iMax = Math.max(0, (iToInt32Checked + 1) - (iGetUnsignedBitLengthAsInt64 - iGetUnsignedBitLengthAsInt642));
                }
                int i8 = iMax;
                EInteger[] eIntegerArrDivRem3 = eIntegerAbs.ShiftLeft(i8).DivRem(eIntegerAbs2);
                eInteger3 = eIntegerArrDivRem3[c2];
                eInteger2 = eIntegerArrDivRem3[1];
                if (eContext == EContext.Binary64 && eInteger3.CanFitInInt64() && eInteger2.CanFitInInt64()) {
                    long jToInt64Checked = eInteger3.ToInt64Checked();
                    long jToInt64Checked2 = eInteger2.ToInt64Checked();
                    int i9 = -i8;
                    if (jToInt64Checked >= 9007199254740992L) {
                        while (jToInt64Checked >= 18014398509481984L) {
                            jToInt64Checked2 = (-1) - (((-1) - jToInt64Checked2) & ((-1) - ((jToInt64Checked + 1) - (jToInt64Checked | 1))));
                            jToInt64Checked >>= 1;
                            i9++;
                        }
                        long j2 = (!((jToInt64Checked & 3) == 3 && jToInt64Checked2 == 0) && ((jToInt64Checked & 1) == 0 || jToInt64Checked2 == 0)) ? jToInt64Checked >> 1 : (jToInt64Checked >> 1) + 1;
                        int i10 = i9 + 1;
                        while (j2 >= 9007199254740992L) {
                            j2 >>= 1;
                            i10++;
                        }
                        return this.helper.CreateNewWithFlags(EInteger.FromInt64(j2), EInteger.FromInt64(i10), i7);
                    }
                }
                if (eContext == EContext.Binary32 && eInteger3.CanFitInInt64() && eInteger2.CanFitInInt64()) {
                    long jToInt64Checked3 = eInteger3.ToInt64Checked();
                    long jToInt64Checked4 = eInteger2.ToInt64Checked();
                    int i11 = -i8;
                    if (jToInt64Checked3 >= 16777216) {
                        while (jToInt64Checked3 >= 33554432) {
                            jToInt64Checked4 = (-1) - (((-1) - jToInt64Checked4) & ((-1) - (jToInt64Checked3 & 1)));
                            jToInt64Checked3 >>= 1;
                            i11++;
                        }
                        long j3 = (!((jToInt64Checked3 & 3) == 3 && jToInt64Checked4 == 0) && ((-1) - (((-1) - jToInt64Checked3) | ((-1) - 1)) == 0 || jToInt64Checked4 == 0)) ? jToInt64Checked3 >> 1 : (jToInt64Checked3 >> 1) + 1;
                        int i12 = i11 + 1;
                        while (j3 >= 16777216) {
                            j3 >>= 1;
                            i12++;
                        }
                        return this.helper.CreateNewWithFlags(EInteger.FromInt64(j3), EInteger.FromInt64(i12), i7);
                    }
                }
                fastIntegerSubtract = new FastInteger(-i8);
            } else {
                eInteger2 = null;
                fastIntegerSubtract = null;
                eInteger3 = null;
            }
            if (!z) {
                EInteger[] eIntegerArrDivRem4 = eIntegerGetMantissa.DivRem(eIntegerGetMantissa2);
                eInteger3 = eIntegerArrDivRem4[0];
                eInteger2 = eIntegerArrDivRem4[1];
                if (eInteger2.isZero()) {
                    return RoundToPrecision(this.helper.CreateNewWithFlagsFastInt(FastIntegerFixed.FromBig(eInteger3.Abs()), FastIntegerFixed.FromFastInteger(fastIntegerToFastInteger), i7), eContext);
                }
            }
            if (eContext != null && eContext.getHasMaxPrecision()) {
                if (!z) {
                    FastInteger fastIntegerFromBig3 = FastInteger.FromBig(eContext.getPrecision());
                    FastInteger[] fastIntegerArrDigitLengthBounds = NumberUtility.DigitLengthBounds(this.helper, eIntegerGetMantissa);
                    FastInteger[] fastIntegerArrDigitLengthBounds2 = NumberUtility.DigitLengthBounds(this.helper, eIntegerGetMantissa2);
                    if (fastIntegerArrDigitLengthBounds[0].Copy().Subtract(fastIntegerArrDigitLengthBounds2[1]).compareTo(fastIntegerFromBig3) > 0) {
                        fastIntegerFromBig3.SetInt(0);
                    } else {
                        FastInteger fastIntegerAdd = fastIntegerArrDigitLengthBounds2[0].Copy().Subtract(fastIntegerArrDigitLengthBounds[1]).AddInt(2).Add(fastIntegerFromBig3);
                        if (fastIntegerAdd.CompareToInt(0) <= 0) {
                            fastIntegerFromBig3.SetInt(0);
                        } else {
                            eIntegerGetMantissa = TryMultiplyByRadixPower(eIntegerGetMantissa, fastIntegerAdd);
                            if (eIntegerGetMantissa == null) {
                                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
                            }
                            fastIntegerFromBig3 = fastIntegerAdd;
                        }
                    }
                    if (fastIntegerFromBig3.signum() != 0 || eInteger3 == null) {
                        EInteger[] eIntegerArrDivRem5 = eIntegerGetMantissa.DivRem(eIntegerGetMantissa2);
                        eInteger3 = eIntegerArrDivRem5[0];
                        eInteger2 = eIntegerArrDivRem5[1];
                    }
                    fastIntegerSubtract = fastIntegerToFastInteger.Copy().Subtract(fastIntegerFromBig3);
                }
                int[] iArrRoundToScaleStatus = RoundToScaleStatus(eInteger2, eIntegerGetMantissa2, eContext);
                if (iArrRoundToScaleStatus == null) {
                    return SignalInvalidWithMessage(eContext, "Rounding was required");
                }
                T tCreateNewWithFlags = this.helper.CreateNewWithFlags(eInteger3, fastIntegerSubtract.ToEInteger(), i7);
                if (eContext == null || !eContext.getHasFlagsOrTraps()) {
                    int i13 = iArrRoundToScaleStatus[0];
                    int i14 = iArrRoundToScaleStatus[1];
                    if ((-1) - (((-1) - i13) & ((-1) - i14)) != 0) {
                        return RoundToPrecisionInternal(tCreateNewWithFlags, i13, i14, null, false, eContext);
                    }
                }
                EContext eContextWithBlankFlags = eContext.WithBlankFlags();
                T tRoundToPrecisionInternal = RoundToPrecisionInternal(tCreateNewWithFlags, iArrRoundToScaleStatus[0], iArrRoundToScaleStatus[1], null, false, eContextWithBlankFlags);
                if ((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 1)) != 0) {
                    if (eContext.getHasFlags()) {
                        eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - eContextWithBlankFlags.getFlags())));
                    }
                    return tRoundToPrecisionInternal;
                }
                if (eContext.getHasFlags()) {
                    int flags = eContext.getFlags();
                    int flags2 = eContextWithBlankFlags.getFlags();
                    eContext.setFlags((-1) - (((-1) - flags) & ((-1) - ((flags2 - 3) - (flags2 | (-3))))));
                }
                return ReduceToPrecisionAndIdealExponent(tRoundToPrecisionInternal, eContext, eInteger2.isZero() ? null : FastInteger.FromBig(eIntegerFromInt322), fastIntegerToFastInteger);
            }
        }
        FastInteger fastInteger = new FastInteger(0);
        new FastInteger(0);
        if (eIntegerGetMantissa.compareTo(eIntegerGetMantissa2) == 0) {
            fastIntegerFromBig = new FastInteger(1);
            eIntegerFromInt32 = EInteger.FromInt32(0);
            i3 = 0;
        } else {
            EInteger eIntegerGcd = eIntegerGetMantissa.Gcd(eIntegerGetMantissa2);
            if (eIntegerGcd.compareTo(EInteger.FromInt32(1)) != 0) {
                eIntegerGetMantissa = eIntegerGetMantissa.Divide(eIntegerGcd);
                eIntegerGetMantissa2 = eIntegerGetMantissa2.Divide(eIntegerGcd);
            }
            FastInteger fastIntegerDivisionShift = this.helper.DivisionShift(eIntegerGetMantissa, eIntegerGetMantissa2);
            if (fastIntegerDivisionShift == null) {
                return SignalInvalidWithMessage(eContext, "Result would have a nonterminating expansion");
            }
            EInteger eIntegerMultiplyByRadixPower = this.helper.MultiplyByRadixPower(eIntegerGetMantissa, fastIntegerDivisionShift);
            fastInteger = fastIntegerDivisionShift.Copy();
            EInteger[] eIntegerArrDivRem6 = eIntegerMultiplyByRadixPower.DivRem(eIntegerGetMantissa2);
            eIntegerFromInt32 = eIntegerArrDivRem6[1];
            i3 = 0;
            fastIntegerFromBig = FastInteger.FromBig(eIntegerArrDivRem6[0]);
        }
        FastInteger fastIntegerSubtract3 = fastIntegerToFastInteger.Copy().Subtract(fastInteger);
        ERounding rounding = eContext == null ? ERounding.HalfEven : eContext.getRounding();
        if (eIntegerFromInt32.isZero()) {
            i5 = i3;
        } else if (rounding == ERounding.HalfDown || rounding == ERounding.HalfEven || rounding == ERounding.HalfUp) {
            int iCompareToHalf = CompareToHalf(eIntegerFromInt32, eIntegerGetMantissa2);
            if (iCompareToHalf == 0) {
                i4 = i6 / 2;
                i5 = i3;
            } else {
                i4 = iCompareToHalf > 0 ? i6 / 2 : i3;
            }
            i3 = i4;
        } else {
            if (rounding == ERounding.None) {
                return SignalInvalidWithMessage(eContext, "Rounding was required");
            }
            i3 = 1;
        }
        EInteger eIntegerToEInteger = fastIntegerFromBig.ToEInteger();
        if (eContext != null && eContext.getHasFlags() && fastIntegerSubtract3.compareTo(fastIntegerToFastInteger) > 0) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 2)));
        }
        return RoundToPrecisionInternal(this.helper.CreateNewWithFlags(eIntegerToEInteger, fastIntegerSubtract3.ToEInteger(), i7), i3, i5, null, false, eContext);
    }

    private T DivisionHandleSpecial(T t2, T t3, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((-1) - (((-1) - ((-1) - (((-1) - iGetFlags) & ((-1) - iGetFlags2)))) | ((-1) - 14)) == 0) {
            return null;
        }
        T tHandleNotANumber = HandleNotANumber(t2, t3, eContext);
        if (tHandleNotANumber != null) {
            return tHandleNotANumber;
        }
        int i2 = iGetFlags & 2;
        if (i2 != 0 && (iGetFlags2 + 2) - (2 | iGetFlags2) != 0) {
            return SignalInvalid(eContext);
        }
        if (i2 != 0) {
            int i3 = iGetFlags ^ iGetFlags2;
            return EnsureSign(t2, (i3 + 1) - (i3 | 1) != 0);
        }
        if ((2 & iGetFlags2) == 0) {
            return null;
        }
        if (eContext == null || !eContext.getHasExponentRange() || eContext.getPrecision().signum() <= 0) {
            return RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), (-1) - (((-1) - (iGetFlags ^ iGetFlags2)) | ((-1) - 1))), eContext);
        }
        if (eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 32)));
        }
        EInteger eMin = eContext.getEMin();
        EInteger precision = eContext.getPrecision();
        if (eContext.getAdjustExponent()) {
            eMin = eMin.Subtract(precision).Add(EInteger.FromInt32(1));
        }
        return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), eMin, (-1) - (((-1) - (iGetFlags ^ iGetFlags2)) | ((-1) - 1)));
    }

    private T EnsureSign(T t2, boolean z2) {
        if (t2 == null) {
            return t2;
        }
        int iGetFlags = this.helper.GetFlags(t2);
        if (!(z2 && (1 & iGetFlags) == 0) && (z2 || (1 & iGetFlags) == 0)) {
            return t2;
        }
        int i2 = (z2 ? 1 : 0) | ((-1) - (((-1) - iGetFlags) | ((-1) - (-2))));
        IRadixMathHelper<T> iRadixMathHelper = this.helper;
        return iRadixMathHelper.CreateNewWithFlags(iRadixMathHelper.GetMantissa(t2), this.helper.GetExponent(t2), i2);
    }

    private T Exp(T t2, EContext eContext, EInteger eInteger) {
        T tQuantize;
        T tPowerIntegral;
        int i2;
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        int iGetFlags = this.helper.GetFlags(t2);
        if ((8 & iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((iGetFlags + 4) - (4 | iGetFlags) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        EContext eContextWithBlankFlags = eContext.WithBlankFlags();
        boolean z2 = true;
        if ((iGetFlags + 2) - (2 | iGetFlags) != 0) {
            if ((iGetFlags & 1) != 0) {
                t2 = RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), eContextWithBlankFlags);
                if (eContext.getHasFlags()) {
                    int flags = eContext.getFlags();
                    int flags2 = eContextWithBlankFlags.getFlags();
                    eContext.setFlags((flags + flags2) - (flags & flags2));
                }
            }
            return t2;
        }
        int iGetSign = this.helper.GetSign(t2);
        T tValueOf = this.helper.ValueOf(1);
        EInteger eIntegerAdd = this.thisRadix == 2 ? eInteger.Add(10) : EInteger.FromInt32(10);
        EContext eContextWithBlankFlags2 = SetPrecisionIfLimited(eContext, eInteger.Add(eIntegerAdd)).WithRounding(ERounding.HalfEven).WithBlankFlags();
        if (iGetSign == 0) {
            tPowerIntegral = RoundToPrecision(tValueOf, eContextWithBlankFlags);
        } else if (iGetSign > 0 && compareTo(t2, tValueOf) <= 0) {
            T tDivide = Divide(this.helper.ValueOf(1), this.helper.ValueOf(2048), null);
            if (IsFinite(tDivide) && compareTo(t2, tDivide) <= 0) {
                T tExpInternalVeryCloseToZero = ExpInternalVeryCloseToZero(t2, eContextWithBlankFlags2.getPrecision(), eContextWithBlankFlags);
                if (eContext.getHasFlags()) {
                    eContext.setFlags(eContext.getFlags() | ((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 3))));
                }
                return tExpInternalVeryCloseToZero;
            }
            tPowerIntegral = ExpInternal(t2, eContextWithBlankFlags2.getPrecision(), eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 3)));
            }
        } else if (iGetSign < 0) {
            T tDivide2 = Divide(this.helper.ValueOf(-1), this.helper.ValueOf(2048), null);
            if (IsFinite(tDivide2) && compareTo(t2, tDivide2) >= 0) {
                T tExpInternalVeryCloseToZero2 = ExpInternalVeryCloseToZero(t2, eContextWithBlankFlags2.getPrecision(), eContextWithBlankFlags);
                if (eContext.getHasFlags()) {
                    int flags3 = eContext.getFlags();
                    int flags4 = eContextWithBlankFlags.getFlags() | 3;
                    eContext.setFlags((flags3 + flags4) - (flags3 & flags4));
                }
                return tExpInternalVeryCloseToZero2;
            }
            T tExp = Exp(NegateRaw(t2), eContextWithBlankFlags2);
            if ((eContextWithBlankFlags2.getFlags() & 16) != 0 || !IsFinite(tExp)) {
                eContextWithBlankFlags2.setFlags(0);
                EInteger eMax = eContext.getEMax();
                EContext eContextWithBigExponentRange = eContextWithBlankFlags2.WithBigExponentRange(eContextWithBlankFlags2.getEMin(), eMax.Add(eMax.Subtract(eContext.getEMin())));
                tExp = Exp(NegateRaw(t2), eContextWithBigExponentRange);
                if ((eContextWithBigExponentRange.getFlags() & 16) != 0) {
                    return SignalUnderflow(eContext, false, false);
                }
            }
            tPowerIntegral = Divide(tValueOf, tExp, eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                int flags5 = eContext.getFlags();
                eContext.setFlags((flags5 + 3) - (flags5 & 3));
            }
        } else {
            if (eContext.getHasExponentRange() && (i2 = this.thisRadix) >= 2 && i2 <= 12 && compareTo(t2, this.helper.ValueOf(10)) > 0) {
                if (compareTo(t2, this.helper.CreateNewWithFlags(EInteger.Max(EInteger.FromInt32(10), eContext.getEMax().Add(eContext.getPrecision()).Multiply(new int[]{1, 1, 71, 111, 140, 162, 181, 196, Mp4VideoDirectory.TAG_DEPTH, 221, 232, 241, 250}[this.thisRadix]).Divide(100).Add(2)), EInteger.FromInt32(0), 0)) > 0) {
                    return SignalOverflow(eContext, false);
                }
            }
            if (!eContext.getHasExponentRange() || compareTo(t2, this.helper.ValueOf(50000)) <= 0) {
                z2 = false;
                tQuantize = null;
            } else {
                PowerIntegral(this.helper.ValueOf(2), EInteger.FromInt64(50000L), eContextWithBlankFlags);
                int flags6 = eContextWithBlankFlags.getFlags();
                if ((flags6 + 16) - (flags6 | 16) != 0) {
                    return SignalOverflow(eContext, false);
                }
                tQuantize = Quantize(t2, tValueOf, EContext.ForRounding(ERounding.Down));
                if (!GetHelper().GetExponent(tQuantize).isZero()) {
                    throw new IllegalArgumentException("integer part not zero, as expected");
                }
                eContextWithBlankFlags.setFlags(0);
                PowerIntegral(this.helper.ValueOf(2), this.helper.GetMantissa(tQuantize), eContextWithBlankFlags);
                if ((eContextWithBlankFlags.getFlags() & 16) != 0) {
                    return SignalOverflow(eContext, false);
                }
                eContextWithBlankFlags.setFlags(0);
            }
            if (!z2) {
                tQuantize = Quantize(t2, tValueOf, EContext.ForRounding(ERounding.Down));
                if (!GetHelper().GetExponent(tQuantize).isZero()) {
                    throw new IllegalArgumentException("integer part not zero, as expected");
                }
            }
            T tAdd = Add(t2, NegateRaw(tQuantize), null);
            EContext eContextWithBlankFlags3 = SetPrecisionIfLimited(eContextWithBlankFlags2, eContextWithBlankFlags2.getPrecision().Add(eIntegerAdd)).WithBlankFlags();
            T tAdd2 = Add(tValueOf, Divide(tAdd, tQuantize, eContextWithBlankFlags3), null);
            eContextWithBlankFlags3.setFlags(0);
            T tExpInternal = ExpInternal(tAdd2, eContextWithBlankFlags3.getPrecision().Add(WorkingDigits(EInteger.FromInt32(40))), eContextWithBlankFlags3);
            if ((eContextWithBlankFlags3.getFlags() & 8) != 0 && eContext.getHasFlags()) {
                int flags7 = eContext.getFlags();
                int flags8 = eContextWithBlankFlags3.getFlags();
                eContext.setFlags((flags8 + flags7) - (flags8 & flags7));
            }
            if (eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | 3);
            }
            tPowerIntegral = PowerIntegral(tExpInternal, this.helper.GetMantissa(tQuantize), eContextWithBlankFlags);
        }
        if (eContext.getHasFlags()) {
            int flags9 = eContext.getFlags();
            int flags10 = eContextWithBlankFlags.getFlags();
            eContext.setFlags((flags9 + flags10) - (flags9 & flags10));
        }
        return tPowerIntegral;
    }

    private T ExpInternal(T t2, EInteger eInteger, EContext eContext) {
        if (compareTo(t2, this.helper.ValueOf(0)) == 0) {
            throw new IllegalStateException();
        }
        T tValueOf = this.helper.ValueOf(1);
        EContext eContextWithRounding = SetPrecisionIfLimited(eContext, eInteger.Add(EInteger.FromInt32(this.thisRadix == 2 ? 18 : 12))).WithRounding(ERounding.HalfEven);
        EInteger eIntegerFromInt64 = EInteger.FromInt64(2L);
        EInteger eIntegerFromInt32 = EInteger.FromInt32(1);
        T tAdd = Add(tValueOf, t2, eContextWithRounding);
        T tMultiply = t2;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (true) {
            tMultiply = Multiply(tMultiply, t2, eContextWithRounding);
            eIntegerFromInt32 = eIntegerFromInt32.Multiply(eIntegerFromInt64);
            T tDivide = Divide(tMultiply, this.helper.CreateNewWithFlags(eIntegerFromInt32, EInteger.FromInt32(0), 0), eContextWithRounding);
            T tAdd2 = Add(tAdd, tDivide, eContextWithRounding);
            int iCompareTo = compareTo(tAdd, tAdd2);
            if (iCompareTo == 0) {
                i4 = 0;
            } else if ((iCompareTo > 0 && i2 < 0) || (i2 > 0 && iCompareTo < 0)) {
                i3++;
                int i5 = (i3 <= 3 || iCompareTo <= 0) ? 1 : 0;
                i4 = (i4 + i5) - (i4 | i5);
            }
            if (i4 == 0) {
                return Add(tAdd, tDivide, eContext);
            }
            eIntegerFromInt64 = eIntegerFromInt64.Add(EInteger.FromInt32(1));
            tAdd = tAdd2;
            i2 = iCompareTo;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r14 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T ExpInternalVeryCloseToZero(T r19, com.upokecenter.numbers.EInteger r20, com.upokecenter.numbers.EContext r21) {
        /*
            r18 = this;
            r11 = r18
            com.upokecenter.numbers.IRadixMathHelper<T> r0 = r11.helper
            r10 = 0
            java.lang.Object r0 = r0.ValueOf(r10)
            r13 = r19
            int r17 = r11.compareTo(r13, r0)
            if (r17 == 0) goto L9f
            com.upokecenter.numbers.IRadixMathHelper<T> r0 = r11.helper
            r9 = 1
            java.lang.Object r8 = r0.ValueOf(r9)
            int r1 = r11.thisRadix
            r0 = 2
            if (r1 != r0) goto L97
            r0 = 18
        L1f:
            com.upokecenter.numbers.EInteger r0 = com.upokecenter.numbers.EInteger.FromInt32(r0)
            r1 = r20
            com.upokecenter.numbers.EInteger r0 = r1.Add(r0)
            r12 = r21
            com.upokecenter.numbers.EContext r1 = SetPrecisionIfLimited(r12, r0)
            com.upokecenter.numbers.ERounding r0 = com.upokecenter.numbers.ERounding.HalfEven
            com.upokecenter.numbers.EContext r7 = r1.WithRounding(r0)
            r0 = 2
            com.upokecenter.numbers.EInteger r6 = com.upokecenter.numbers.EInteger.FromInt64(r0)
            com.upokecenter.numbers.EInteger r5 = com.upokecenter.numbers.EInteger.FromInt32(r9)
            if (r17 >= 0) goto L95
            r4 = 10
        L43:
            r14 = r13
            r3 = r14
            r16 = r10
            r2 = r16
        L49:
            java.lang.Object r3 = r11.Multiply(r3, r13, r7)
            com.upokecenter.numbers.EInteger r5 = r5.Multiply(r6)
            com.upokecenter.numbers.IRadixMathHelper<T> r1 = r11.helper
            com.upokecenter.numbers.EInteger r0 = com.upokecenter.numbers.EInteger.FromInt32(r10)
            java.lang.Object r0 = r1.CreateNewWithFlags(r5, r0, r10)
            java.lang.Object r0 = r11.Divide(r3, r0, r7)
            java.lang.Object r1 = r11.Add(r14, r0, r7)
            int r15 = r11.compareTo(r14, r1)
            if (r15 != 0) goto L79
            r9 = r10
        L6a:
            if (r9 == 0) goto L9a
            r0 = 1
            com.upokecenter.numbers.EInteger r0 = com.upokecenter.numbers.EInteger.FromInt32(r0)
            com.upokecenter.numbers.EInteger r6 = r6.Add(r0)
            r16 = r15
            r14 = r1
            goto L49
        L79:
            if (r15 <= 0) goto L7d
            if (r16 < 0) goto L81
        L7d:
            if (r16 <= 0) goto L6a
            if (r15 >= 0) goto L6a
        L81:
            int r2 = r2 + 1
            if (r2 <= r4) goto L89
            if (r17 >= 0) goto L90
            if (r15 < 0) goto L93
        L89:
            r14 = 1
        L8a:
            int r0 = r9 + r14
            r9 = r9 | r14
            int r0 = r0 - r9
            r9 = r0
            goto L6a
        L90:
            if (r15 > 0) goto L93
            goto L89
        L93:
            r14 = r10
            goto L8a
        L95:
            r4 = 3
            goto L43
        L97:
            r0 = 12
            goto L1f
        L9a:
            java.lang.Object r0 = r11.Add(r8, r1, r12)
            return r0
        L9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.ExpInternalVeryCloseToZero(java.lang.Object, com.upokecenter.numbers.EInteger, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    private T ExtendPrecision(T t2, EContext eContext) {
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return RoundToPrecision(t2, eContext);
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        FastInteger fastIntegerGetDigitLength = this.helper.GetDigitLength(eIntegerGetMantissa);
        FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getPrecision());
        EInteger eIntegerGetExponent = this.helper.GetExponent(t2);
        if (fastIntegerGetDigitLength.compareTo(fastIntegerFromBig) < 0) {
            fastIntegerFromBig.Subtract(fastIntegerGetDigitLength);
            eIntegerGetMantissa = TryMultiplyByRadixPower(eIntegerGetMantissa, fastIntegerFromBig);
            if (eIntegerGetMantissa == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            eIntegerGetExponent = eIntegerGetExponent.Subtract(fastIntegerFromBig.ToEInteger());
        }
        if (eContext != null && eContext.getHasFlags()) {
            int flags = eContext.getFlags();
            eContext.setFlags((flags + 2) - (flags & 2));
            int flags2 = eContext.getFlags();
            eContext.setFlags((flags2 + 1) - (flags2 & 1));
        }
        return RoundToPrecision(this.helper.CreateNewWithFlags(eIntegerGetMantissa, eIntegerGetExponent, 0), eContext);
    }

    public static EFloat FastLn(EFloat eFloat, EContext eContext) {
        if (eFloat.compareTo(EFloat.Create(32, -6)) >= 0 && eFloat.compareTo(EFloat.Create(36, -6)) < 0) {
            return EFloat.Create(-7918475170148451L, -47).MultiplyAndAdd(eFloat, EFloat.Create(5842854079153127L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-7855987447712801L, -43), eContext).MultiplyAndAdd(eFloat, EFloat.Create(3178826684731201L, -41), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-3446209805793071L, -41), eContext).MultiplyAndAdd(eFloat, EFloat.Create(5269250416501899L, -42), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-1456756048094669L, -41), eContext).MultiplyAndAdd(eFloat, EFloat.Create(589048828844673L, -41), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-5626160540257247L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(5306429958415307L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-8023390364436687L, -51), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(36, -6)) >= 0 && eFloat.compareTo(EFloat.Create(40, -6)) < 0) {
            return EFloat.Create(-649418159759275L, -45).MultiplyAndAdd(eFloat, EFloat.Create(8569695812135613L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-3219836323271541L, -43), eContext).MultiplyAndAdd(eFloat, EFloat.Create(1456356315564023L, -41), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-7059686721514865L, -43), eContext).MultiplyAndAdd(eFloat, EFloat.Create(6033379619755303L, -43), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-7458850461699891L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(6743646686636803L, -45), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-281293242157611L, -42), eContext).MultiplyAndAdd(eFloat, EFloat.Create(4746007495118267L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-7772015102064253L, -51), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(40, -6)) >= 0 && eFloat.compareTo(EFloat.Create(44, -6)) < 0) {
            return EFloat.Create(5559026033201687L, -50).MultiplyAndAdd(eFloat, EFloat.Create(-4617856151292203L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(54117074379353L, -39), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-6186785536082459L, -45), eContext).MultiplyAndAdd(eFloat, EFloat.Create(7306510509645715L, -45), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-2995764726321697L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(6986795845479189L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-5891564005530805L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(15091899246223L, -40), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-7320823715054069L, -51), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(44, -6)) >= 0 && eFloat.compareTo(EFloat.Create(48, -6)) < 0) {
            return EFloat.Create(612197579983455L, -48).MultiplyAndAdd(eFloat, EFloat.Create(-1114006258063177L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(457577809503393L, -43), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-1790557502154387L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(4632494137994963L, -45), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-4161053891636247L, -45), eContext).MultiplyAndAdd(eFloat, EFloat.Create(2657563185521199L, -45), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-4909589327505907L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(7053693369648581L, -49), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-3557744849045649L, -50), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(48, -6)) >= 0 && eFloat.compareTo(EFloat.Create(52, -6)) < 0) {
            return EFloat.Create(577499201531193L, -49).MultiplyAndAdd(eFloat, EFloat.Create(-1142306702241897L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(8160604872283537L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-4339153427527017L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(6101799781923291L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-5958127120148891L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(8273521206806363L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-4154027270256105L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(3244106922381301L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-13529886537447L, -42), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(52, -6)) >= 0 && eFloat.compareTo(EFloat.Create(56, -6)) < 0) {
            return EFloat.Create(1154075304800921L, -51).MultiplyAndAdd(eFloat, EFloat.Create(-2465640916317121L, -49), eContext).MultiplyAndAdd(eFloat, EFloat.Create(74318910129327L, -42), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-85366471369779L, -41), eContext).MultiplyAndAdd(eFloat, EFloat.Create(259329022146413L, -42), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-4376322035869763L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(3282099616186431L, -46), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-3560066267427385L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(1501608713011209L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-26381046771207L, -43), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(56, -6)) >= 0 && eFloat.compareTo(EFloat.Create(60, -6)) < 0) {
            return EFloat.Create(37824989738239L, -47).MultiplyAndAdd(eFloat, EFloat.Create(-43408559199581L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(2878790570900291L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-7105058961533699L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(5797162642745407L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-6569041813188869L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(661617942907567L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-6168232135736261L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(43675806283161L, -42), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-6591942829339363L, -51), eContext);
        }
        if (eFloat.compareTo(EFloat.Create(60, -6)) < 0 || eFloat.compareTo(EFloat.Create(63, -6)) >= 0) {
            return null;
        }
        return EFloat.Create(-6156921697102261L, -55).MultiplyAndAdd(eFloat, EFloat.Create(211488681190339L, -47), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-6644421976470021L, -50), eContext).MultiplyAndAdd(eFloat, EFloat.Create(7668093965389463L, -49), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-5761162710156971L, -48), eContext).MultiplyAndAdd(eFloat, EFloat.Create(369347589996043L, -44), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-8524061902531777L, -49), eContext).MultiplyAndAdd(eFloat, EFloat.Create(4683735041389899L, -49), eContext).MultiplyAndAdd(eFloat, EFloat.Create(-6208425595264589L, -51), eContext);
    }

    private T HandleNotANumber(T t2, T t3, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 8)) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 8)) != 0) {
            return SignalingNaNInvalid(t3, eContext);
        }
        if ((iGetFlags + 4) - (iGetFlags | 4) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        if ((iGetFlags2 + 4) - (iGetFlags2 | 4) != 0) {
            return ReturnQuietNaN(t3, eContext);
        }
        return null;
    }

    private boolean IsFinite(T t2) {
        return (this.helper.GetFlags(t2) & 14) == 0;
    }

    private boolean IsNegative(T t2) {
        return (-1) - (((-1) - this.helper.GetFlags(t2)) | ((-1) - 1)) != 0;
    }

    private boolean IsNullOrInt32FriendlyContext(EContext eContext) {
        return eContext == null || (!eContext.getHasFlags() && eContext.getTraps() == 0 && ((!eContext.getHasExponentRange() || (eContext.getEMin().compareTo(-10) < 0 && eContext.getEMax().signum() >= 0)) && eContext.getRounding() != ERounding.Floor && (!eContext.getHasMaxPrecision() || ((this.thisRadix >= 10 && !eContext.isPrecisionInBits() && eContext.getPrecision().compareTo(10) >= 0) || ((this.thisRadix >= 2 || eContext.isPrecisionInBits()) && eContext.getPrecision().compareTo(32) >= 0)))));
    }

    private static boolean IsNullOrSimpleContext(EContext eContext) {
        return eContext == null || eContext == EContext.UnlimitedHalfEven || !(eContext.getHasExponentRange() || eContext.getHasMaxPrecision() || eContext.getTraps() != 0 || eContext.getHasFlags());
    }

    private static boolean IsSimpleContext(EContext eContext) {
        return eContext != null && (eContext == EContext.UnlimitedHalfEven || !(eContext.getHasExponentRange() || eContext.getHasMaxPrecision() || eContext.getTraps() != 0 || eContext.getHasFlags()));
    }

    private boolean IsSubnormal(T t2, EContext eContext) {
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return false;
        }
        FastInteger fastIntegerFromBig = FastInteger.FromBig(this.helper.GetExponent(t2));
        FastInteger fastIntegerFromBig2 = FastInteger.FromBig(eContext.getEMin());
        if (eContext.getAdjustExponent()) {
            IRadixMathHelper<T> iRadixMathHelper = this.helper;
            fastIntegerFromBig.Add(iRadixMathHelper.GetDigitLength(iRadixMathHelper.GetMantissa(t2))).SubtractInt(1);
        }
        return fastIntegerFromBig.compareTo(fastIntegerFromBig2) < 0;
    }

    private boolean IsWithinExponentRangeForPow(T t2, EContext eContext) {
        if (eContext == null || !eContext.getHasExponentRange()) {
            return true;
        }
        IRadixMathHelper<T> iRadixMathHelper = this.helper;
        FastInteger fastIntegerGetDigitLength = iRadixMathHelper.GetDigitLength(iRadixMathHelper.GetMantissa(t2));
        FastInteger fastIntegerFromBig = FastInteger.FromBig(this.helper.GetExponent(t2));
        if (eContext.getAdjustExponent()) {
            fastIntegerFromBig.Add(fastIntegerGetDigitLength);
            fastIntegerFromBig.Decrement();
        }
        if (fastIntegerFromBig.signum() < 0) {
            fastIntegerFromBig.Negate().Divide(2).Negate();
        }
        EInteger eIntegerToEInteger = fastIntegerFromBig.ToEInteger();
        return eIntegerToEInteger.compareTo(eContext.getEMin()) >= 0 && eIntegerToEInteger.compareTo(eContext.getEMax()) <= 0;
    }

    private T LnInternal(T t2, EInteger eInteger, EContext eContext) {
        EContext eContextWithRounding = SetPrecisionIfLimited(eContext, eInteger.Add(EInteger.FromInt64(6L))).WithRounding(ERounding.HalfEven);
        T tAdd = Add(NegateRaw(t2), this.helper.ValueOf(1), null);
        T tMultiply = Multiply(tAdd, tAdd, eContextWithRounding);
        T tNegateRaw = NegateRaw(tAdd);
        EInteger eIntegerFromInt64 = EInteger.FromInt64(2L);
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i2 != 0) {
            T tAdd2 = Add(tNegateRaw, NegateRaw(Divide(tMultiply, this.helper.CreateNewWithFlags(eIntegerFromInt64, EInteger.FromInt32(0), 0), eContextWithRounding)), eContextWithRounding);
            int iCompareTo = compareTo(tNegateRaw, tAdd2);
            if (iCompareTo == 0) {
                i2 = 0;
            } else if ((iCompareTo > 0 && i3 < 0) || (i3 > 0 && iCompareTo < 0)) {
                i4++;
                i2 = (-1) - (((-1) - i2) | ((-1) - ((i4 <= 3 || iCompareTo <= 0) ? 1 : 0)));
            }
            if (i2 != 0) {
                tMultiply = Multiply(tMultiply, tAdd, eContextWithRounding);
                eIntegerFromInt64 = eIntegerFromInt64.Add(EInteger.FromInt32(1));
            }
            i3 = iCompareTo;
            tNegateRaw = tAdd2;
        }
        return RoundToPrecision(tNegateRaw, eContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T LnInternalCloseToOne2(T r19, com.upokecenter.numbers.EInteger r20, com.upokecenter.numbers.EContext r21) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.LnInternalCloseToOne2(java.lang.Object, com.upokecenter.numbers.EInteger, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    private T MinMaxHandleSpecial(T t2, T t3, EContext eContext, boolean z2, boolean z3) {
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if (((iGetFlags | iGetFlags2) & 14) == 0) {
            return null;
        }
        if ((8 & iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 8)) != 0) {
            return SignalingNaNInvalid(t3, eContext);
        }
        if ((iGetFlags + 4) - (4 | iGetFlags) != 0) {
            return (iGetFlags2 + 4) - (iGetFlags2 | 4) != 0 ? ReturnQuietNaN(t2, eContext) : RoundToPrecision(t3, eContext);
        }
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 4)) != 0) {
            return RoundToPrecision(t2, eContext);
        }
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0) {
            return (z3 && (iGetFlags2 + 2) - (iGetFlags2 | 2) == 0) ? z2 ? RoundToPrecision(t3, eContext) : t2 : z2 ? (iGetFlags + 1) - (iGetFlags | 1) != 0 ? t2 : RoundToPrecision(t3, eContext) : (iGetFlags & 1) == 0 ? t2 : RoundToPrecision(t3, eContext);
        }
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 2)) != 0) {
            return z3 ? z2 ? RoundToPrecision(t2, eContext) : t3 : z2 ? (-1) - (((-1) - iGetFlags2) | ((-1) - 1)) == 0 ? RoundToPrecision(t2, eContext) : t3 : (-1) - (((-1) - iGetFlags2) | ((-1) - 1)) != 0 ? RoundToPrecision(t2, eContext) : t3;
        }
        return null;
    }

    private T MultiplyAddHandleSpecial(T t2, T t3, T t4, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 8)) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 8)) != 0) {
            return SignalingNaNInvalid(t3, eContext);
        }
        int iGetFlags3 = this.helper.GetFlags(t4);
        if ((4 & iGetFlags) != 0) {
            return (iGetFlags3 & 8) != 0 ? SignalingNaNInvalid(t4, eContext) : ReturnQuietNaN(t2, eContext);
        }
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 4)) != 0) {
            return (iGetFlags3 + 8) - (iGetFlags3 | 8) != 0 ? SignalingNaNInvalid(t4, eContext) : ReturnQuietNaN(t3, eContext);
        }
        if ((iGetFlags + 2) - (2 | iGetFlags) != 0 && (-1) - (((-1) - iGetFlags2) | ((-1) - 14)) == 0 && this.helper.GetMantissa(t3).isZero()) {
            return SignalInvalid(eContext);
        }
        if ((iGetFlags2 + 2) - (iGetFlags2 | 2) != 0 && (-1) - (((-1) - iGetFlags) | ((-1) - 14)) == 0 && this.helper.GetMantissa(t2).isZero()) {
            return SignalInvalid(eContext);
        }
        if ((iGetFlags3 + 8) - (8 | iGetFlags3) != 0) {
            return SignalingNaNInvalid(t4, eContext);
        }
        if ((iGetFlags3 + 4) - (iGetFlags3 | 4) != 0) {
            return ReturnQuietNaN(t4, eContext);
        }
        return null;
    }

    private T NegateRaw(T t2) {
        if (t2 == null) {
            return t2;
        }
        int iGetFlags = this.helper.GetFlags(t2);
        int i2 = (iGetFlags + 1) - (iGetFlags | 1);
        IRadixMathHelper<T> iRadixMathHelper = this.helper;
        return iRadixMathHelper.CreateNewWithFlags(iRadixMathHelper.GetMantissa(t2), this.helper.GetExponent(t2), i2 != 0 ? 0 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.upokecenter.numbers.RadixMath, com.upokecenter.numbers.RadixMath<T>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    private T PowerIntegral(T t2, EInteger eInteger, EContext eContext) {
        int iSignum = eInteger.signum();
        Object objValueOf = this.helper.ValueOf(1);
        if (iSignum == 0) {
            return (T) RoundToPrecision(objValueOf, eContext);
        }
        if (eInteger.equals(EInteger.FromInt32(1))) {
            return (T) RoundToPrecision(t2, eContext);
        }
        if (eInteger.compareTo(2) == 0) {
            return (T) Multiply(t2, t2, eContext);
        }
        if (eInteger.compareTo(3) == 0) {
            return (T) Multiply(t2, Multiply(t2, t2, null), eContext);
        }
        boolean z2 = IsNegative(t2) && !eInteger.isEven();
        FastInteger fastIntegerCopy = this.helper.GetDigitLength(eInteger.Abs()).Copy();
        fastIntegerCopy.AddInt(18);
        EContext eContextWithBlankFlags = eContext == null ? eContext : SetPrecisionIfLimited(eContext, eContext.getPrecision().Add(fastIntegerCopy.ToEInteger())).WithRounding(ERounding.HalfEven).WithBlankFlags();
        if (iSignum < 0) {
            t2 = (T) Divide(objValueOf, t2, eContextWithBlankFlags);
            int flags = eContextWithBlankFlags.getFlags();
            if ((flags + 16) - (flags | 16) != 0) {
                return (T) SignalOverflow(eContext, z2);
            }
            eInteger = eInteger.Negate();
        }
        while (!eInteger.isZero()) {
            if (!eInteger.isEven()) {
                objValueOf = Multiply(objValueOf, t2, eContextWithBlankFlags);
                if (eContextWithBlankFlags != null && (-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 16)) != 0) {
                    return (T) SignalOverflow(eContext, z2);
                }
            }
            eInteger = eInteger.ShiftRight(1);
            if (!eInteger.isZero()) {
                if (eContextWithBlankFlags != null) {
                    eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - (-17))));
                }
                t2 = Multiply(t2, t2, eContextWithBlankFlags);
                if (eContextWithBlankFlags != null && (eContextWithBlankFlags.getFlags() & 16) != 0) {
                    return (T) SignalOverflow(eContext, z2);
                }
            }
        }
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags(eContext.getFlags() | ((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 47))));
        }
        return (T) RoundToPrecision(objValueOf, eContext);
    }

    private static EInteger PowerOfTwo(FastInteger fastInteger) {
        return fastInteger.signum() <= 0 ? EInteger.FromInt32(1) : fastInteger.CanFitInInt32() ? EInteger.FromInt32(1).ShiftLeft(fastInteger.ToInt32()) : EInteger.FromInt32(1).ShiftLeft(fastInteger.ToEInteger());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private T ReduceToPrecisionAndIdealExponent(T t2, EContext eContext, FastInteger fastInteger, FastInteger fastInteger2) {
        T tRoundToPrecision = RoundToPrecision(t2, eContext);
        if (tRoundToPrecision == null) {
            return tRoundToPrecision;
        }
        int iGetFlags = this.helper.GetFlags(tRoundToPrecision);
        if ((iGetFlags + 14) - (iGetFlags | 14) != 0) {
            return tRoundToPrecision;
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(tRoundToPrecision);
        FastInteger fastIntegerFromBig = FastInteger.FromBig(this.helper.GetExponent(tRoundToPrecision));
        int i2 = this.thisRadix;
        if (eIntegerGetMantissa.isZero()) {
            fastIntegerFromBig = new FastInteger(0);
        } else {
            eIntegerGetMantissa = NumberUtility.ReduceTrailingZeros(eIntegerGetMantissa, fastIntegerFromBig, i2, fastInteger == null ? null : this.helper.GetDigitLength(eIntegerGetMantissa), fastInteger, fastInteger2);
        }
        int iGetFlags2 = this.helper.GetFlags(t2);
        T tCreateNewWithFlags = this.helper.CreateNewWithFlags(eIntegerGetMantissa, fastIntegerFromBig.ToEInteger(), iGetFlags2);
        if (eContext != null && eContext.getClampNormalExponents()) {
            EContext eContextWithBlankFlags = eContext.WithBlankFlags();
            tCreateNewWithFlags = RoundToPrecision(tCreateNewWithFlags, eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags(((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - (-33)))) | eContext.getFlags());
            }
        }
        return EnsureSign(tCreateNewWithFlags, (-1) - (((-1) - iGetFlags2) | ((-1) - 1)) != 0);
    }

    private T RemainderHandleSpecial(T t2, T t3, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((((-1) - (((-1) - iGetFlags) & ((-1) - iGetFlags2))) & 14) != 0) {
            T tHandleNotANumber = HandleNotANumber(t2, t3, eContext);
            if (tHandleNotANumber != null) {
                return tHandleNotANumber;
            }
            if ((iGetFlags + 2) - (iGetFlags | 2) != 0) {
                return SignalInvalid(eContext);
            }
            if ((-1) - (((-1) - iGetFlags2) | ((-1) - 2)) != 0) {
                return RoundToPrecision(t2, eContext);
            }
        }
        if (this.helper.GetMantissa(t3).isZero()) {
            return SignalInvalid(eContext);
        }
        return null;
    }

    private static <TMath> EInteger RescaleByExponentDiff(EInteger eInteger, EInteger eInteger2, EInteger eInteger3, IRadixMathHelper<TMath> iRadixMathHelper) {
        if (eInteger.signum() == 0) {
            return EInteger.FromInt32(0);
        }
        FastInteger fastIntegerAbs = FastInteger.FromBig(eInteger2).SubtractBig(eInteger3).Abs();
        EInteger eIntegerGetUnsignedBitLengthAsEInteger = eInteger.GetUnsignedBitLengthAsEInteger();
        EInteger eIntegerToEInteger = fastIntegerAbs.ToEInteger();
        if (iRadixMathHelper.GetRadix() <= 10) {
            if (eIntegerGetUnsignedBitLengthAsEInteger.Add(eIntegerToEInteger.Multiply(BitsPerDigit[iRadixMathHelper.GetRadix()]).Divide(100)).compareTo(Integer.MAX_VALUE) > 0) {
                return null;
            }
        }
        return iRadixMathHelper.MultiplyByRadixPower(eInteger, fastIntegerAbs);
    }

    private static <TMath> FastIntegerFixed RescaleByExponentDiff(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, FastIntegerFixed fastIntegerFixed3, IRadixMathHelper<TMath> iRadixMathHelper) {
        if (fastIntegerFixed.signum() == 0) {
            return FastIntegerFixed.FromInt32(0);
        }
        FastIntegerFixed fastIntegerFixedAbs = fastIntegerFixed2.Subtract(fastIntegerFixed3).Abs();
        EInteger eIntegerGetUnsignedBitLengthAsEInteger = fastIntegerFixed.ToEInteger().GetUnsignedBitLengthAsEInteger();
        EInteger eIntegerToEInteger = fastIntegerFixedAbs.ToEInteger();
        if (iRadixMathHelper.GetRadix() <= 10) {
            if (eIntegerGetUnsignedBitLengthAsEInteger.Add(eIntegerToEInteger.Multiply(BitsPerDigit[iRadixMathHelper.GetRadix()]).Divide(100)).compareTo(Integer.MAX_VALUE) > 0) {
                return null;
            }
        }
        return iRadixMathHelper.MultiplyByRadixPowerFastInt(fastIntegerFixed, fastIntegerFixedAbs);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T ReturnQuietNaN(T r7, com.upokecenter.numbers.EContext r8) {
        /*
            r6 = this;
            com.upokecenter.numbers.IRadixMathHelper<T> r0 = r6.helper
            com.upokecenter.numbers.EInteger r3 = r0.GetMantissa(r7)
            boolean r0 = r3.isZero()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L3b
            if (r8 == 0) goto L3b
            boolean r0 = r8.getHasMaxPrecision()
            if (r0 == 0) goto L3b
            com.upokecenter.numbers.EInteger r0 = r8.getPrecision()
            com.upokecenter.numbers.FastInteger r1 = com.upokecenter.numbers.FastInteger.FromBig(r0)
            com.upokecenter.numbers.IRadixMathHelper<T> r0 = r6.helper
            com.upokecenter.numbers.FastInteger r0 = r0.GetDigitLength(r3)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L3b
            com.upokecenter.numbers.EInteger r0 = com.upokecenter.numbers.EInteger.FromInt32(r5)
            com.upokecenter.numbers.EInteger r1 = r6.TryMultiplyByRadixPower(r0, r1)
            if (r1 != 0) goto L3d
            java.lang.String r0 = "Result requires too much memory"
            java.lang.Object r0 = r6.SignalInvalidWithMessage(r8, r0)
            return r0
        L3b:
            r5 = r4
            goto L47
        L3d:
            int r0 = r3.compareTo(r1)
            if (r0 < 0) goto L3b
            com.upokecenter.numbers.EInteger r3 = r3.Remainder(r1)
        L47:
            com.upokecenter.numbers.IRadixMathHelper<T> r0 = r6.helper
            int r2 = r0.GetFlags(r7)
            if (r5 != 0) goto L54
            r0 = 4
            r0 = r0 & r2
            if (r0 == 0) goto L54
            return r7
        L54:
            r0 = 1
            int r1 = r2 + r0
            r2 = r2 | r0
            int r1 = r1 - r2
            r0 = 4
            int r2 = r1 + r0
            r1 = r1 & r0
            int r2 = r2 - r1
            com.upokecenter.numbers.IRadixMathHelper<T> r1 = r6.helper
            com.upokecenter.numbers.EInteger r0 = com.upokecenter.numbers.EInteger.FromInt32(r4)
            java.lang.Object r0 = r1.CreateNewWithFlags(r3, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.ReturnQuietNaN(java.lang.Object, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private T Root(T t2, int i2, EContext eContext) {
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        T tSquareRootHandleSpecial = SquareRootHandleSpecial(t2, eContext);
        if (tSquareRootHandleSpecial != null) {
            return tSquareRootHandleSpecial;
        }
        EContext eContextWithBlankFlags = eContext.WithBlankFlags();
        EInteger eIntegerGetExponent = this.helper.GetExponent(t2);
        EInteger eIntegerDivide = eIntegerGetExponent.Divide(EInteger.FromInt64(i2));
        if (eIntegerGetExponent.signum() < 0 && !eIntegerGetExponent.isEven()) {
            eIntegerDivide = eIntegerDivide.Subtract(EInteger.FromInt32(1));
        }
        if (this.helper.GetSign(t2) == 0) {
            T tRoundToPrecision = RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), eIntegerDivide, this.helper.GetFlags(t2)), eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | eContextWithBlankFlags.getFlags());
            }
            return tRoundToPrecision;
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        FastInteger fastIntegerGetDigitLength = this.helper.GetDigitLength(eIntegerGetMantissa);
        FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getPrecision());
        FastInteger fastIntegerAddInt = fastIntegerFromBig.Copy().Multiply(i2).AddInt(2);
        if (fastIntegerGetDigitLength.compareTo(fastIntegerAddInt) < 0) {
            FastInteger fastIntegerSubtract = fastIntegerAddInt.Copy().Subtract(fastIntegerGetDigitLength);
            if ((!fastIntegerSubtract.isEvenNumber()) ^ (!eIntegerGetExponent.isEven())) {
                fastIntegerSubtract.Increment();
            }
            eIntegerGetExponent = eIntegerGetExponent.Subtract(fastIntegerSubtract.ToEInteger());
            eIntegerGetMantissa = TryMultiplyByRadixPower(eIntegerGetMantissa, fastIntegerSubtract);
            if (eIntegerGetMantissa == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
        }
        EInteger[] eIntegerArrRootRem = eIntegerGetMantissa.RootRem(i2);
        this.helper.GetDigitLength(eIntegerArrRootRem[0]);
        EInteger eInteger = eIntegerArrRootRem[1];
        EInteger eInteger2 = eIntegerArrRootRem[0];
        boolean zIsZero = eInteger.isZero();
        int i3 = !zIsZero ? 1 : 0;
        int i4 = !zIsZero ? 1 : 0;
        EInteger eIntegerShiftRight = eIntegerGetExponent.ShiftRight(1);
        if (eIntegerGetExponent.signum() < 0 && !eIntegerGetExponent.isEven()) {
            eIntegerShiftRight = eIntegerShiftRight.Subtract(EInteger.FromInt32(1));
        }
        T tRoundToPrecisionInternal = RoundToPrecisionInternal(this.helper.CreateNewWithFlags(eInteger2, eIntegerShiftRight, 0), 0, i4, null, false, eContextWithBlankFlags);
        EInteger eIntegerGetExponent2 = this.helper.GetExponent(tRoundToPrecisionInternal);
        if ((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 8)) == 0 && (eIntegerGetExponent2.compareTo(eIntegerDivide) <= 0 || !IsFinite(tRoundToPrecisionInternal))) {
            EContext eContext2 = eContext.getHasExponentRange() ? eContextWithBlankFlags : null;
            if (zIsZero) {
                fastIntegerFromBig = null;
            }
            tRoundToPrecisionInternal = ReduceToPrecisionAndIdealExponent(tRoundToPrecisionInternal, eContext2, fastIntegerFromBig, FastInteger.FromBig(eIntegerDivide));
        }
        if (eContext.getHasFlags()) {
            if (eContext.getClampNormalExponents() && !this.helper.GetExponent(tRoundToPrecisionInternal).equals(eIntegerDivide) && (-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 1)) == 0) {
                eContext.setFlags(eContext.getFlags() | 32);
            }
            int i5 = i3 | ((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 16)) != 0 ? 1 : 0);
            EInteger eIntegerGetExponent3 = this.helper.GetExponent(tRoundToPrecisionInternal);
            if (i5 != 0) {
                int flags = eContextWithBlankFlags.getFlags();
                eContextWithBlankFlags.setFlags((flags + 2) - (flags & 2));
            } else if (eIntegerGetExponent3.compareTo(eIntegerDivide) > 0) {
                eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 2)));
            } else {
                eContextWithBlankFlags.setFlags(eContextWithBlankFlags.getFlags() & (-3));
            }
            if (!zIsZero) {
                eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 2)));
                eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 1)));
            }
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - eContextWithBlankFlags.getFlags())));
        }
        return tRoundToPrecisionInternal;
    }

    private boolean RoundGivenAccum(IShiftAccumulator iShiftAccumulator, ERounding eRounding, boolean z2) {
        int iShiftedIntMod;
        int i2 = this.thisRadix;
        int lastDiscardedDigit = iShiftAccumulator.getLastDiscardedDigit();
        int olderDiscardedDigits = iShiftAccumulator.getOlderDiscardedDigits();
        if (eRounding == ERounding.HalfUp) {
            if (lastDiscardedDigit >= i2 / 2) {
                return true;
            }
        } else if (eRounding == ERounding.HalfEven) {
            int i3 = i2 / 2;
            if (lastDiscardedDigit >= i3 && (lastDiscardedDigit > i3 || olderDiscardedDigits != 0 || iShiftAccumulator.ShiftedIntMod(2) == 1)) {
                return true;
            }
        } else if (eRounding == ERounding.HalfDown) {
            int i4 = i2 / 2;
            if (lastDiscardedDigit > i4) {
                return true;
            }
            if (lastDiscardedDigit == i4 && olderDiscardedDigits != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Ceiling) {
            if (!z2 && (-1) - (((-1) - lastDiscardedDigit) & ((-1) - olderDiscardedDigits)) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Floor) {
            if (z2 && (lastDiscardedDigit | olderDiscardedDigits) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Up) {
            if ((lastDiscardedDigit + olderDiscardedDigits) - (lastDiscardedDigit & olderDiscardedDigits) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Odd || (eRounding == ERounding.OddOrZeroFiveUp && i2 == 2)) {
            if ((lastDiscardedDigit + olderDiscardedDigits) - (lastDiscardedDigit & olderDiscardedDigits) != 0 && iShiftAccumulator.ShiftedIntMod(2) == 0) {
                return true;
            }
        } else if ((eRounding == ERounding.ZeroFiveUp || (eRounding == ERounding.OddOrZeroFiveUp && i2 != 2)) && (-1) - (((-1) - lastDiscardedDigit) & ((-1) - olderDiscardedDigits)) != 0 && (i2 == 2 || (iShiftedIntMod = iShiftAccumulator.ShiftedIntMod(i2)) == 0 || iShiftedIntMod == i2 / 2)) {
            return true;
        }
        return false;
    }

    private boolean RoundGivenDigits(int i2, int i3, ERounding eRounding, boolean z2, long j2) {
        int i4;
        int i5 = this.thisRadix;
        if (eRounding == ERounding.HalfUp) {
            if (i2 >= i5 / 2) {
                return true;
            }
        } else if (eRounding == ERounding.HalfEven) {
            int i6 = i5 / 2;
            if (i2 >= i6 && (i2 > i6 || i3 != 0 || (j2 & 1) != 0)) {
                return true;
            }
        } else if (eRounding == ERounding.HalfDown) {
            int i7 = i5 / 2;
            if (i2 > i7) {
                return true;
            }
            if (i2 == i7 && i3 != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Ceiling) {
            if (!z2 && (-1) - (((-1) - i2) & ((-1) - i3)) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Floor) {
            if (z2 && (i2 | i3) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Up) {
            if ((i2 + i3) - (i2 & i3) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Odd || (eRounding == ERounding.OddOrZeroFiveUp && i5 == 2)) {
            if ((-1) - (((-1) - i2) & ((-1) - i3)) != 0 && (j2 + 1) - (j2 | 1) == 0) {
                return true;
            }
        } else if ((eRounding == ERounding.ZeroFiveUp || (eRounding == ERounding.OddOrZeroFiveUp && i5 != 2)) && (i2 | i3) != 0 && (i5 == 2 || (i4 = (int) (j2 % ((long) i5))) == 0 || i4 == i5 / 2)) {
            return true;
        }
        return false;
    }

    private boolean RoundGivenDigits(int i2, int i3, ERounding eRounding, boolean z2, FastInteger fastInteger) {
        int iMod;
        int i4 = this.thisRadix;
        if (eRounding == ERounding.HalfUp) {
            if (i2 >= i4 / 2) {
                return true;
            }
        } else if (eRounding == ERounding.HalfEven) {
            int i5 = i4 / 2;
            if (i2 >= i5) {
                if (i2 > i5 || i3 != 0) {
                    return true;
                }
                return true ^ fastInteger.isEvenNumber();
            }
        } else if (eRounding == ERounding.HalfDown) {
            int i6 = i4 / 2;
            if (i2 > i6) {
                return true;
            }
            if (i2 == i6 && i3 != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Ceiling) {
            if (!z2 && (-1) - (((-1) - i2) & ((-1) - i3)) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Floor) {
            if (z2 && (-1) - (((-1) - i2) & ((-1) - i3)) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Up) {
            if ((i2 | i3) != 0) {
                return true;
            }
        } else if (eRounding == ERounding.Odd || (eRounding == ERounding.OddOrZeroFiveUp && i4 == 2)) {
            if ((i2 | i3) != 0 && fastInteger.isEvenNumber()) {
                return true;
            }
        } else if ((eRounding == ERounding.ZeroFiveUp || (eRounding == ERounding.OddOrZeroFiveUp && i4 != 2)) && (-1) - (((-1) - i2) & ((-1) - i3)) != 0 && (i4 == 2 || (iMod = FastIntegerFixed.FromFastInteger(fastInteger).Mod(i4)) == 0 || iMod == i4 / 2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09b3 A[PHI: r16
  0x09b3: PHI (r16v7 int) = (r16v2 int), (r16v10 int) binds: [B:599:0x0929, B:612:0x0960] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0a15 A[PHI: r8
  0x0a15: PHI (r8v5 com.upokecenter.numbers.IShiftAccumulator) = 
  (r8v3 com.upokecenter.numbers.IShiftAccumulator)
  (r8v6 com.upokecenter.numbers.IShiftAccumulator)
  (r8v6 com.upokecenter.numbers.IShiftAccumulator)
  (r8v3 com.upokecenter.numbers.IShiftAccumulator)
  (r8v3 com.upokecenter.numbers.IShiftAccumulator)
 binds: [B:614:0x0967, B:633:0x09bd, B:625:0x0991, B:621:0x097e, B:618:0x0972] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0a86  */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T RoundToPrecisionInternal(T r36, int r37, int r38, com.upokecenter.numbers.FastInteger r39, boolean r40, com.upokecenter.numbers.EContext r41) {
        /*
            Method dump skipped, instruction units count: 2815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.RoundToPrecisionInternal(java.lang.Object, int, int, com.upokecenter.numbers.FastInteger, boolean, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb A[PHI: r2
  0x00bb: PHI (r2v6 int) = (r2v4 int), (r2v0 int) binds: [B:53:0x00b0, B:40:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T RoundToScale(com.upokecenter.numbers.EInteger r19, com.upokecenter.numbers.EInteger r20, com.upokecenter.numbers.EInteger r21, com.upokecenter.numbers.EInteger r22, com.upokecenter.numbers.FastInteger r23, boolean r24, com.upokecenter.numbers.EContext r25) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.RadixMath.RoundToScale(com.upokecenter.numbers.EInteger, com.upokecenter.numbers.EInteger, com.upokecenter.numbers.EInteger, com.upokecenter.numbers.EInteger, com.upokecenter.numbers.FastInteger, boolean, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    private int[] RoundToScaleStatus(EInteger eInteger, EInteger eInteger2, EContext eContext) {
        int i2;
        int i3;
        ERounding rounding = eContext == null ? ERounding.HalfEven : eContext.getRounding();
        int i4 = 0;
        if (eInteger.isZero()) {
            i2 = 0;
        } else {
            i2 = 1;
            if (rounding == ERounding.HalfDown || rounding == ERounding.HalfUp || rounding == ERounding.HalfEven) {
                int iCompareToHalf = CompareToHalf(eInteger, eInteger2);
                if (iCompareToHalf == 0) {
                    i3 = this.thisRadix / 2;
                    i2 = 0;
                } else if (iCompareToHalf > 0) {
                    i3 = this.thisRadix / 2;
                }
                i4 = i3;
            } else {
                if (rounding == ERounding.None) {
                    return null;
                }
                i4 = 1;
            }
        }
        return new int[]{i4, i2};
    }

    private static EContext SetPrecisionIfLimited(EContext eContext, EInteger eInteger) {
        return (eContext == null || !eContext.getHasMaxPrecision()) ? eContext : eContext.WithBigPrecision(eInteger);
    }

    private T SignalDivideByZero(EContext eContext, boolean z2) {
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 128)));
        }
        if (this.support == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), ((z2 ? 1 : 0) + 2) - ((z2 ? 1 : 0) & 2));
    }

    private T SignalInvalid(EContext eContext) {
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags(eContext.getFlags() | 64);
        }
        if (this.support != 0) {
            return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 4);
        }
        throw new ArithmeticException("Invalid operation");
    }

    private T SignalInvalidWithMessage(EContext eContext, String str) {
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 64)));
        }
        if (this.support != 0) {
            return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 4);
        }
        throw new ArithmeticException(str);
    }

    private T SignalUnderflow(EContext eContext, boolean z2, boolean z3) {
        return RoundToPrecision(this.helper.CreateNewWithFlags(z3 ? EInteger.FromInt32(0) : EInteger.FromInt32(1), eContext.getEMin().Subtract(eContext.getPrecision().Subtract(1)).Subtract(2), z2 ? 1 : 0), eContext);
    }

    private T SignalingNaNInvalid(T t2, EContext eContext) {
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags(eContext.getFlags() | 64);
        }
        return ReturnQuietNaN(t2, eContext);
    }

    private T SquareRootHandleSpecial(T t2, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        if ((iGetFlags + 14) - (14 | iGetFlags) != 0) {
            if ((iGetFlags + 8) - (8 | iGetFlags) != 0) {
                return SignalingNaNInvalid(t2, eContext);
            }
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 4)) != 0) {
                return ReturnQuietNaN(t2, eContext);
            }
            if ((2 & iGetFlags) != 0) {
                return (-1) - (((-1) - iGetFlags) | ((-1) - 1)) != 0 ? SignalInvalid(eContext) : t2;
            }
        }
        if (this.helper.GetSign(t2) < 0) {
            return SignalInvalid(eContext);
        }
        return null;
    }

    private static FastInteger ToFastInteger(FastIntegerFixed fastIntegerFixed) {
        return fastIntegerFixed.CanFitInInt32() ? new FastInteger(fastIntegerFixed.ToInt32()) : FastInteger.FromBig(fastIntegerFixed.ToEInteger());
    }

    private static void TransferFlags(EContext eContext, EContext eContext2) {
        if (eContext == null || !eContext.getHasFlags()) {
            return;
        }
        if ((-1) - (((-1) - eContext2.getFlags()) | ((-1) - 192)) != 0) {
            int flags = eContext.getFlags();
            int flags2 = (-1) - (((-1) - eContext2.getFlags()) | ((-1) - 192));
            eContext.setFlags((flags2 + flags) - (flags2 & flags));
        } else {
            int flags3 = eContext.getFlags();
            int flags4 = eContext2.getFlags();
            eContext.setFlags((flags4 + flags3) - (flags4 & flags3));
        }
    }

    private EInteger TryMultiplyByRadixPower(EInteger eInteger, int i2) {
        return (eInteger.isZero() || i2 == 0) ? eInteger : this.helper.MultiplyByRadixPower(eInteger, new FastInteger(i2));
    }

    private EInteger TryMultiplyByRadixPower(EInteger eInteger, FastInteger fastInteger) {
        if (eInteger.isZero()) {
            return eInteger;
        }
        if (!fastInteger.CanFitInInt32()) {
            FastInteger fastIntegerFromBig = FastInteger.FromBig(valueMaxDigits);
            if (this.thisRadix != 10 || fastInteger.compareTo(fastIntegerFromBig) > 0) {
                return null;
            }
        }
        return this.helper.MultiplyByRadixPower(eInteger, fastInteger);
    }

    private FastIntegerFixed TryMultiplyByRadixPowerFastInt(FastIntegerFixed fastIntegerFixed, FastInteger fastInteger) {
        if (fastIntegerFixed.isValueZero()) {
            return fastIntegerFixed;
        }
        if (!fastInteger.CanFitInInt32()) {
            FastInteger fastIntegerFromBig = FastInteger.FromBig(valueMaxDigits);
            if (this.thisRadix != 10 || fastInteger.compareTo(fastIntegerFromBig) > 0) {
                return null;
            }
        }
        return FastIntegerFixed.FromBig(this.helper.MultiplyByRadixPower(fastIntegerFixed.ToEInteger(), fastInteger));
    }

    private FastIntegerFixed TryMultiplyByRadixPowerFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2) {
        if (fastIntegerFixed.isValueZero()) {
            return fastIntegerFixed;
        }
        if (fastIntegerFixed2.CanFitInInt32()) {
            return FastIntegerFixed.FromBig(this.helper.MultiplyByRadixPower(fastIntegerFixed.ToEInteger(), new FastInteger(fastIntegerFixed2.ToInt32())));
        }
        FastIntegerFixed fastIntegerFixedFromBig = FastIntegerFixed.FromBig(valueMaxDigits);
        if (this.thisRadix != 10 || fastIntegerFixed2.compareTo(fastIntegerFixedFromBig) > 0) {
            return null;
        }
        return FastIntegerFixed.FromBig(this.helper.MultiplyByRadixPower(fastIntegerFixed.ToEInteger(), FastInteger.FromBig(fastIntegerFixed2.ToEInteger())));
    }

    private T ValueOf(int i2, EContext eContext) {
        return (eContext == null || !eContext.getHasExponentRange() || eContext.ExponentWithinRange(EInteger.FromInt32(0))) ? this.helper.ValueOf(i2) : RoundToPrecision(this.helper.ValueOf(i2), eContext);
    }

    private EInteger WorkingDigits(EInteger eInteger) {
        int i2 = this.thisRadix;
        return i2 <= 2 ? eInteger : eInteger.Divide(NumberUtility.BitLength(i2) - 1).Add(1);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Abs(T t2, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 8)) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((iGetFlags + 4) - (4 | iGetFlags) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        if ((1 & iGetFlags) != 0) {
            IRadixMathHelper<T> iRadixMathHelper = this.helper;
            t2 = iRadixMathHelper.CreateNewWithFlags(iRadixMathHelper.GetMantissa(t2), this.helper.GetExponent(t2), (-1) - (((-1) - iGetFlags) | ((-1) - (-2))));
        }
        return RoundToPrecision(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Add(T t2, T t3, EContext eContext) {
        if (t2 == null) {
            throw new NullPointerException("thisValue");
        }
        if (t3 != null) {
            return AddEx(t2, t3, eContext, false);
        }
        throw new NullPointerException("other");
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T AddEx(T t2, T t3, EContext eContext, boolean z2) {
        int i2;
        FastIntegerFixed fastIntegerFixed;
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((((-1) - (((-1) - iGetFlags) & ((-1) - iGetFlags2))) & 14) != 0) {
            T tHandleNotANumber = HandleNotANumber(t2, t3, eContext);
            if (tHandleNotANumber != null) {
                return tHandleNotANumber;
            }
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0) {
                return ((2 & iGetFlags2) == 0 || (-1) - (((-1) - iGetFlags) | ((-1) - 1)) == (iGetFlags2 & 1)) ? t2 : SignalInvalid(eContext);
            }
            if ((2 & iGetFlags2) != 0) {
                return t3;
            }
        }
        FastIntegerFixed fastIntegerFixedGetExponentFastInt = this.helper.GetExponentFastInt(t2);
        FastIntegerFixed fastIntegerFixedGetExponentFastInt2 = this.helper.GetExponentFastInt(t3);
        FastIntegerFixed fastIntegerFixedGetMantissaFastInt = this.helper.GetMantissaFastInt(t2);
        FastIntegerFixed fastIntegerFixedGetMantissaFastInt2 = this.helper.GetMantissaFastInt(t3);
        int iCompareTo = fastIntegerFixedGetExponentFastInt.compareTo(fastIntegerFixedGetExponentFastInt2);
        FastIntegerFixed fastIntegerFixed2 = iCompareTo < 0 ? fastIntegerFixedGetExponentFastInt : fastIntegerFixedGetExponentFastInt2;
        if ((iGetFlags + 1) - (1 | iGetFlags) == 0 && (-1) - (((-1) - iGetFlags2) | ((-1) - 1)) == 0) {
            if (iCompareTo < 0 && fastIntegerFixedGetMantissaFastInt2.isValueZero()) {
                return IsNullOrSimpleContext(eContext) ? t2 : RoundToPrecision(t2, eContext);
            }
            if (iCompareTo >= 0 && fastIntegerFixedGetMantissaFastInt.isValueZero()) {
                return IsNullOrSimpleContext(eContext) ? t3 : RoundToPrecision(t3, eContext);
            }
        }
        if (z2) {
            i2 = iCompareTo;
            fastIntegerFixed = fastIntegerFixedGetExponentFastInt2;
        } else {
            i2 = iCompareTo;
            T tAddEx32Bit = AddEx32Bit(iCompareTo, fastIntegerFixedGetExponentFastInt, fastIntegerFixedGetMantissaFastInt, fastIntegerFixedGetExponentFastInt2, fastIntegerFixedGetMantissaFastInt2, fastIntegerFixed2, iGetFlags, iGetFlags2, eContext);
            if (tAddEx32Bit != null) {
                return tAddEx32Bit;
            }
            fastIntegerFixed = fastIntegerFixedGetExponentFastInt2;
            T tAddEx64Bit = AddEx64Bit(i2, fastIntegerFixedGetExponentFastInt, fastIntegerFixedGetMantissaFastInt, fastIntegerFixed, fastIntegerFixedGetMantissaFastInt2, fastIntegerFixed2, iGetFlags, iGetFlags2, eContext);
            if (tAddEx64Bit != null) {
                return tAddEx64Bit;
            }
        }
        if (i2 != 0) {
            return AddExDiffExp(fastIntegerFixedGetExponentFastInt, fastIntegerFixedGetMantissaFastInt, fastIntegerFixed, fastIntegerFixedGetMantissaFastInt2, iGetFlags, iGetFlags2, eContext, i2, z2);
        }
        T tAddCore2 = AddCore2(fastIntegerFixedGetMantissaFastInt, fastIntegerFixedGetMantissaFastInt2, fastIntegerFixedGetExponentFastInt, iGetFlags, iGetFlags2, eContext);
        return !IsNullOrSimpleContext(eContext) ? RoundToPrecision(tAddCore2, eContext) : tAddCore2;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T CompareToWithContext(T t2, T t3, boolean z2, EContext eContext) {
        if (t3 == null) {
            return SignalInvalid(eContext);
        }
        T tCompareToHandleSpecial = CompareToHandleSpecial(t2, t3, z2, eContext);
        return tCompareToHandleSpecial != null ? tCompareToHandleSpecial : CompareToInternal(t2, t3, false, this.helper) == -2 ? SignalInvalidWithMessage(eContext, "Out of memory ") : ValueOf(compareTo(t2, t3), null);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Divide(T t2, T t3, EContext eContext) {
        return DivideInternal(t2, t3, eContext, 0, EInteger.FromInt32(0));
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToExponent(T t2, T t3, EInteger eInteger, EContext eContext) {
        if (eContext != null && !eContext.ExponentWithinRange(eInteger)) {
            return SignalInvalidWithMessage(eContext, "Exponent not within exponent range: " + eInteger);
        }
        EContext eContextForRounding = eContext == null ? EContext.ForRounding(ERounding.HalfDown) : eContext.WithUnlimitedExponents().WithPrecision(0);
        T tDivideInternal = DivideInternal(t2, t3, eContextForRounding, 1, eInteger);
        if (!eContextForRounding.getHasMaxPrecision() && IsFinite(tDivideInternal)) {
            tDivideInternal = Quantize(tDivideInternal, tDivideInternal, eContextForRounding);
            int flags = eContextForRounding.getFlags();
            if ((flags + 64) - (flags | 64) != 0) {
                eContextForRounding.setFlags(64);
            }
        }
        if (eContext != null && eContext.getHasFlags()) {
            int flags2 = eContext.getFlags();
            int flags3 = eContextForRounding.getFlags();
            eContext.setFlags((flags2 + flags3) - (flags2 & flags3));
        }
        return tDivideInternal;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerNaturalScale(T t2, T t3, EContext eContext) {
        T tRoundToPrecision;
        FastInteger fastIntegerSubtractBig = FastInteger.FromBig(this.helper.GetExponent(t2)).SubtractBig(this.helper.GetExponent(t3));
        EContext eContextWithBlankFlags = EContext.ForRounding(ERounding.Down).WithBigPrecision(eContext == null ? EInteger.FromInt32(0) : eContext.getPrecision()).WithBlankFlags();
        T tDivideInternal = DivideInternal(t2, t3, eContextWithBlankFlags, 1, EInteger.FromInt32(0));
        if ((eContextWithBlankFlags.getFlags() & 192) != 0) {
            if (eContext != null && eContext.getHasFlags()) {
                eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 192)));
            }
            return tDivideInternal;
        }
        boolean z2 = (this.helper.GetSign(t2) < 0) ^ (this.helper.GetSign(t3) < 0);
        if (this.helper.GetMantissa(tDivideInternal).isZero()) {
            tRoundToPrecision = this.helper.CreateNewWithFlags(EInteger.FromInt32(0), this.helper.GetExponent(t2).Subtract(this.helper.GetExponent(t3)), this.helper.GetFlags(tDivideInternal));
        } else if (fastIntegerSubtractBig.signum() < 0) {
            fastIntegerSubtractBig.Negate();
            EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(this.helper.GetMantissa(tDivideInternal), fastIntegerSubtractBig);
            if (eIntegerTryMultiplyByRadixPower == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            EInteger eIntegerGetExponent = this.helper.GetExponent(t3);
            IRadixMathHelper<T> iRadixMathHelper = this.helper;
            tRoundToPrecision = iRadixMathHelper.CreateNewWithFlags(eIntegerTryMultiplyByRadixPower, iRadixMathHelper.GetExponent(t2).Subtract(eIntegerGetExponent), this.helper.GetFlags(tDivideInternal));
        } else {
            tRoundToPrecision = tDivideInternal;
            if (fastIntegerSubtractBig.signum() > 0) {
                EInteger eIntegerGetMantissa = this.helper.GetMantissa(tDivideInternal);
                FastInteger fastIntegerFromBig = FastInteger.FromBig(this.helper.GetExponent(tDivideInternal));
                EInteger eIntegerFromInt32 = EInteger.FromInt32(this.thisRadix);
                while (fastIntegerSubtractBig.compareTo(fastIntegerFromBig) != 0) {
                    EInteger[] eIntegerArrDivRem = eIntegerGetMantissa.DivRem(eIntegerFromInt32);
                    EInteger eInteger = eIntegerArrDivRem[0];
                    if (!eIntegerArrDivRem[1].isZero()) {
                        break;
                    }
                    fastIntegerFromBig.Increment();
                    eIntegerGetMantissa = eInteger;
                }
                tRoundToPrecision = this.helper.CreateNewWithFlags(eIntegerGetMantissa, fastIntegerFromBig.ToEInteger(), this.helper.GetFlags(tDivideInternal));
            }
        }
        if (eContext != null) {
            tRoundToPrecision = RoundToPrecision(tRoundToPrecision, eContext);
        }
        return EnsureSign(tRoundToPrecision, z2);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerZeroScale(T t2, T t3, EContext eContext) {
        EContext eContextWithBlankFlags = EContext.ForRounding(ERounding.Down).WithBigPrecision(eContext == null ? EInteger.FromInt32(0) : eContext.getPrecision()).WithBlankFlags();
        T tDivideInternal = DivideInternal(t2, t3, eContextWithBlankFlags, 1, EInteger.FromInt32(0));
        int flags = eContextWithBlankFlags.getFlags();
        if ((flags + 192) - (flags | 192) != 0) {
            if (eContext.getHasFlags()) {
                int flags2 = eContext.getFlags();
                int flags3 = eContextWithBlankFlags.getFlags();
                int i2 = (flags3 + 192) - (flags3 | 192);
                eContext.setFlags((flags2 + i2) - (flags2 & i2));
            }
            return tDivideInternal;
        }
        if (eContext == null) {
            return tDivideInternal;
        }
        EContext eContextWithUnlimitedExponents = eContext.WithBlankFlags().WithUnlimitedExponents();
        T tRoundToPrecision = RoundToPrecision(tDivideInternal, eContextWithUnlimitedExponents);
        int flags4 = eContextWithUnlimitedExponents.getFlags();
        return (flags4 + 2) - (flags4 | 2) != 0 ? SignalInvalid(eContext) : tRoundToPrecision;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Exp(T t2, EContext eContext) {
        return Exp(t2, eContext, eContext == null ? null : eContext.getPrecision());
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public IRadixMathHelper<T> GetHelper() {
        return this.helper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.upokecenter.numbers.RadixMath, com.upokecenter.numbers.RadixMath<T>] */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    @Override // com.upokecenter.numbers.IRadixMath
    public T Ln(T t2, EContext eContext) {
        Object objNegateRaw;
        T tCreateNewWithFlags;
        EInteger eIntegerAdd;
        boolean z2;
        if (eContext == null) {
            return (T) SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return (T) SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        int iGetFlags = this.helper.GetFlags(t2);
        if ((iGetFlags + 8) - (8 | iGetFlags) != 0) {
            return (T) SignalingNaNInvalid(t2, eContext);
        }
        if ((4 & iGetFlags) != 0) {
            return (T) ReturnQuietNaN(t2, eContext);
        }
        int iGetSign = this.helper.GetSign(t2);
        if (iGetSign < 0) {
            return (T) SignalInvalid(eContext);
        }
        if ((iGetFlags & 2) != 0) {
            return t2;
        }
        EContext eContextWithBlankFlags = eContext.WithBlankFlags();
        T tValueOf = this.helper.ValueOf(1);
        ERounding eRounding = ERounding.HalfEven;
        if (iGetSign == 0) {
            return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 3);
        }
        int iCompareTo = compareTo(t2, tValueOf);
        if (iCompareTo == 0) {
            objNegateRaw = (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), eContextWithBlankFlags);
        } else if (iCompareTo < 0) {
            if (compareTo(t2, Divide(tValueOf, this.helper.ValueOf(2), eContextWithBlankFlags)) >= 0 && this.helper.GetRadix() == 2 && eContext.getPrecision().compareTo(53) <= 0 && ((z2 = t2 instanceof EFloat))) {
                EFloat eFloatFastLn = FastLn(z2 ? (EFloat) t2 : null, eContextWithBlankFlags);
                if (eFloatFastLn != null) {
                    T tCreateNewWithFlags2 = this.helper.CreateNewWithFlags(eFloatFastLn.getUnsignedMantissa(), eFloatFastLn.getExponent(), 1);
                    if (eContext.getHasFlags()) {
                        eContext.setFlags(eContext.getFlags() | 1);
                        eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 2)));
                    }
                    return tCreateNewWithFlags2;
                }
            }
            Object objDivide = Divide(tValueOf, this.helper.ValueOf(4), eContextWithBlankFlags);
            EContext eContextWithBlankFlags2 = SetPrecisionIfLimited(eContext, eContext.getPrecision().Add((compareTo(t2, objDivide) < 0 ? new FastInteger(20) : new FastInteger(10)).ToEInteger())).WithRounding(eRounding).WithBlankFlags();
            Object objMultiply = Multiply(objDivide, this.helper.ValueOf(3), null);
            if (compareTo(t2, objMultiply) <= 0) {
                FastInteger fastInteger = new FastInteger(0);
                ?? r14 = t2;
                while (compareTo(r14, objMultiply) < 0) {
                    boolean z3 = (T) SquareRoot(r14, eContextWithBlankFlags2.WithUnlimitedExponents());
                    fastInteger.Increment();
                    r14 = z3;
                }
                int i2 = 0;
                ?? r142 = r14;
                while (i2 < 6) {
                    Object objSquareRoot = SquareRoot(r142, eContextWithBlankFlags2.WithUnlimitedExponents());
                    fastInteger.Increment();
                    i2++;
                    r142 = objSquareRoot;
                }
                objNegateRaw = (T) Multiply(LnInternal(r142, eContextWithBlankFlags2.getPrecision(), eContextWithBlankFlags2), this.helper.CreateNewWithFlags(PowerOfTwo(fastInteger), EInteger.FromInt32(0), 0), eContextWithBlankFlags);
            } else if (compareTo(t2, Add(tValueOf, NegateRaw(Divide(tValueOf, this.helper.ValueOf(16), eContextWithBlankFlags2)), null)) >= 0) {
                IRadixMathHelper<T> iRadixMathHelper = this.helper;
                FastInteger fastIntegerCopy = iRadixMathHelper.GetDigitLength(iRadixMathHelper.GetMantissa(t2)).Copy();
                fastIntegerCopy.AddInt(6);
                fastIntegerCopy.AddBig(eContext.getPrecision());
                fastIntegerCopy.ToEInteger();
                objNegateRaw = LnInternalCloseToOne2(t2, fastIntegerCopy.ToEInteger(), eContextWithBlankFlags);
            } else {
                objNegateRaw = LnInternal(t2, eContextWithBlankFlags2.getPrecision(), eContextWithBlankFlags);
            }
            if (eContext.getHasFlags()) {
                eContextWithBlankFlags.setFlags(eContextWithBlankFlags.getFlags() | 1);
                int flags = eContextWithBlankFlags.getFlags();
                eContextWithBlankFlags.setFlags((flags + 2) - (flags & 2));
            }
        } else {
            T tValueOf2 = this.helper.ValueOf(2);
            if (compareTo(t2, tValueOf2) > 0 && this.helper.GetRadix() == 2) {
                Divide(this.helper.ValueOf(1), this.helper.ValueOf(2), EContext.Unlimited);
                FastIntegerFixed fastIntegerFixedGetMantissaFastInt = this.helper.GetMantissaFastInt(t2);
                EInteger eIntegerToEInteger = this.helper.GetExponentFastInt(t2).ToEInteger();
                EInteger eIntegerGetUnsignedBitLengthAsEInteger = fastIntegerFixedGetMantissaFastInt.ToEInteger().GetUnsignedBitLengthAsEInteger();
                EInteger.FromInt32(1);
                EInteger eIntegerNegate = eIntegerGetUnsignedBitLengthAsEInteger.Negate();
                EInteger.FromInt32(0);
                if (eIntegerToEInteger.signum() > 0) {
                    tCreateNewWithFlags = this.helper.CreateNewWithFlags(fastIntegerFixedGetMantissaFastInt.ToEInteger(), eIntegerNegate, 0);
                    eIntegerAdd = eIntegerToEInteger.Add(eIntegerGetUnsignedBitLengthAsEInteger);
                } else {
                    tCreateNewWithFlags = this.helper.CreateNewWithFlags(fastIntegerFixedGetMantissaFastInt.ToEInteger(), eIntegerNegate, 0);
                    eIntegerAdd = eIntegerToEInteger.Add(eIntegerGetUnsignedBitLengthAsEInteger);
                }
                T tCreateNewWithFlags3 = eIntegerAdd.signum() < 0 ? this.helper.CreateNewWithFlags(eIntegerAdd.Abs(), EInteger.FromInt32(0), 1) : this.helper.CreateNewWithFlags(eIntegerAdd.Abs(), EInteger.FromInt32(0), 0);
                EContext eContextWithBlankFlags3 = SetPrecisionIfLimited(eContext, eContext.getPrecision().Add(10)).WithRounding(eRounding).WithBlankFlags();
                objNegateRaw = (T) MultiplyAndAdd(Ln(tValueOf2, eContextWithBlankFlags3), tCreateNewWithFlags3, Ln(tCreateNewWithFlags, eContextWithBlankFlags3), eContextWithBlankFlags);
            } else if (compareTo(t2, tValueOf2) >= 0) {
                FastInteger fastInteger2 = new FastInteger(0);
                FastIntegerFixed[] fastIntegerFixedArrDigitLengthBoundsFixed = NumberUtility.DigitLengthBoundsFixed(this.helper, this.helper.GetMantissaFastInt(t2));
                FastInteger fastInteger3 = new FastInteger(10);
                if (compareTo(t2, this.helper.ValueOf(10000000)) >= 0) {
                    if (this.helper.GetRadix() == 2) {
                        new FastInteger(32);
                    }
                    fastInteger3 = new FastInteger(16);
                }
                EInteger eIntegerAdd2 = EInteger.Max(fastIntegerFixedArrDigitLengthBoundsFixed[1].ToEInteger(), eContext.getPrecision()).Add(fastInteger3.ToEInteger());
                EContext eContextWithBlankFlags4 = SetPrecisionIfLimited(eContext, eIntegerAdd2).WithRounding(eRounding).WithBlankFlags();
                ?? r143 = t2;
                while (compareTo(r143, tValueOf2) >= 0) {
                    boolean z4 = (T) SquareRoot(r143, eContextWithBlankFlags4.WithUnlimitedExponents());
                    fastInteger2.Increment();
                    r143 = z4;
                }
                int i3 = 36;
                if ((this.helper.GetRadix() != 2 || eIntegerAdd2.compareTo(300) <= 0) && (this.helper.GetRadix() <= 2 || eIntegerAdd2.compareTo(100) <= 0)) {
                    i3 = 8;
                }
                int i4 = 0;
                ?? r144 = r143;
                while (i4 < i3) {
                    Object objSquareRoot2 = SquareRoot(r144, eContextWithBlankFlags4.WithUnlimitedExponents());
                    fastInteger2.Increment();
                    i4++;
                    r144 = objSquareRoot2;
                }
                objNegateRaw = Multiply(NegateRaw(LnInternalCloseToOne2(Divide(tValueOf, r144, eContextWithBlankFlags4), eContextWithBlankFlags4.getPrecision(), eContextWithBlankFlags4)), this.helper.CreateNewWithFlags(PowerOfTwo(fastInteger2), EInteger.FromInt32(0), 0), eContextWithBlankFlags);
            } else {
                EContext eContextWithBlankFlags5 = SetPrecisionIfLimited(eContext, eContext.getPrecision().Add(new FastInteger(10).ToEInteger())).WithRounding(eRounding).WithBlankFlags();
                if (compareTo(t2, Add(tValueOf, Divide(tValueOf, this.helper.ValueOf(16), eContextWithBlankFlags5), null)) < 0) {
                    IRadixMathHelper<T> iRadixMathHelper2 = this.helper;
                    FastInteger fastIntegerCopy2 = iRadixMathHelper2.GetDigitLength(iRadixMathHelper2.GetMantissa(t2)).Copy();
                    fastIntegerCopy2.AddInt(6);
                    fastIntegerCopy2.AddBig(eContext.getPrecision());
                    fastIntegerCopy2.ToEInteger();
                    objNegateRaw = LnInternalCloseToOne2(t2, fastIntegerCopy2.ToEInteger(), eContextWithBlankFlags);
                } else {
                    objNegateRaw = NegateRaw(Ln(Divide(tValueOf, t2, eContextWithBlankFlags5), eContextWithBlankFlags));
                }
            }
            if (eContext.getHasFlags()) {
                eContextWithBlankFlags.setFlags(eContextWithBlankFlags.getFlags() | 1);
                eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 2)));
            }
        }
        if (eContext.getHasFlags()) {
            int flags2 = eContext.getFlags();
            int flags3 = eContextWithBlankFlags.getFlags();
            eContext.setFlags((flags3 + flags2) - (flags3 & flags2));
        }
        return (T) objNegateRaw;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Max(T t2, T t3, EContext eContext) {
        if (t2 == null) {
            throw new NullPointerException("a");
        }
        if (t3 == null) {
            throw new NullPointerException("b");
        }
        T tMinMaxHandleSpecial = MinMaxHandleSpecial(t2, t3, eContext, false, false);
        if (tMinMaxHandleSpecial != null) {
            return tMinMaxHandleSpecial;
        }
        int iCompareTo = compareTo(t2, t3);
        if (iCompareTo != 0) {
            return iCompareTo < 0 ? RoundToPrecision(t3, eContext) : RoundToPrecision(t2, eContext);
        }
        int iGetFlags = this.helper.GetFlags(t2);
        int i2 = (iGetFlags + 1) - (iGetFlags | 1);
        int iGetFlags2 = this.helper.GetFlags(t3);
        return i2 != (iGetFlags2 + 1) - (iGetFlags2 | 1) ? i2 != 0 ? RoundToPrecision(t3, eContext) : RoundToPrecision(t2, eContext) : i2 == 0 ? this.helper.GetExponent(t2).compareTo(this.helper.GetExponent(t3)) > 0 ? RoundToPrecision(t2, eContext) : RoundToPrecision(t3, eContext) : this.helper.GetExponent(t2).compareTo(this.helper.GetExponent(t3)) > 0 ? RoundToPrecision(t3, eContext) : RoundToPrecision(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MaxMagnitude(T t2, T t3, EContext eContext) {
        if (t2 == null) {
            throw new NullPointerException("a");
        }
        if (t3 == null) {
            throw new NullPointerException("b");
        }
        T tMinMaxHandleSpecial = MinMaxHandleSpecial(t2, t3, eContext, false, true);
        if (tMinMaxHandleSpecial != null) {
            return tMinMaxHandleSpecial;
        }
        int iCompareTo = compareTo(AbsRaw(t2), AbsRaw(t3));
        return iCompareTo == 0 ? Max(t2, t3, eContext) : iCompareTo > 0 ? RoundToPrecision(t2, eContext) : RoundToPrecision(t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Min(T t2, T t3, EContext eContext) {
        if (t2 == null) {
            throw new NullPointerException("a");
        }
        if (t3 == null) {
            throw new NullPointerException("b");
        }
        T tMinMaxHandleSpecial = MinMaxHandleSpecial(t2, t3, eContext, true, false);
        if (tMinMaxHandleSpecial != null) {
            return tMinMaxHandleSpecial;
        }
        int iCompareTo = compareTo(t2, t3);
        if (iCompareTo != 0) {
            return iCompareTo > 0 ? RoundToPrecision(t3, eContext) : RoundToPrecision(t2, eContext);
        }
        int iGetFlags = this.helper.GetFlags(t2);
        int i2 = (iGetFlags + 1) - (iGetFlags | 1);
        return i2 != (-1) - (((-1) - this.helper.GetFlags(t3)) | ((-1) - 1)) ? i2 != 0 ? RoundToPrecision(t2, eContext) : RoundToPrecision(t3, eContext) : i2 == 0 ? this.helper.GetExponent(t2).compareTo(this.helper.GetExponent(t3)) > 0 ? RoundToPrecision(t3, eContext) : RoundToPrecision(t2, eContext) : this.helper.GetExponent(t2).compareTo(this.helper.GetExponent(t3)) > 0 ? RoundToPrecision(t2, eContext) : RoundToPrecision(t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MinMagnitude(T t2, T t3, EContext eContext) {
        if (t2 == null) {
            throw new NullPointerException("a");
        }
        if (t3 == null) {
            throw new NullPointerException("b");
        }
        T tMinMaxHandleSpecial = MinMaxHandleSpecial(t2, t3, eContext, true, true);
        if (tMinMaxHandleSpecial != null) {
            return tMinMaxHandleSpecial;
        }
        int iCompareTo = compareTo(AbsRaw(t2), AbsRaw(t3));
        return iCompareTo == 0 ? Min(t2, t3, eContext) : iCompareTo < 0 ? RoundToPrecision(t2, eContext) : RoundToPrecision(t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Multiply(T t2, T t3, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((-1) - (((-1) - (iGetFlags | iGetFlags2)) | ((-1) - 14)) != 0) {
            T tHandleNotANumber = HandleNotANumber(t2, t3, eContext);
            if (tHandleNotANumber != null) {
                return tHandleNotANumber;
            }
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0) {
                return ((-1) - (((-1) - iGetFlags2) | ((-1) - 14)) == 0 && this.helper.GetMantissa(t3).isZero()) ? SignalInvalid(eContext) : EnsureSign(t2, ((iGetFlags + 1) - (iGetFlags | 1) != 0) ^ ((1 & iGetFlags2) != 0));
            }
            if ((2 & iGetFlags2) != 0) {
                return ((iGetFlags + 14) - (iGetFlags | 14) == 0 && this.helper.GetMantissa(t2).isZero()) ? SignalInvalid(eContext) : EnsureSign(t3, ((iGetFlags + 1) - (1 | iGetFlags) != 0) ^ ((-1) - (((-1) - iGetFlags2) | ((-1) - 1)) != 0));
            }
        }
        EInteger eIntegerAdd = this.helper.GetExponent(t2).Add(this.helper.GetExponent(t3));
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t3);
        IRadixMathHelper<T> iRadixMathHelper = this.helper;
        T tCreateNewWithFlags = iRadixMathHelper.CreateNewWithFlags(iRadixMathHelper.GetMantissa(t2).Multiply(eIntegerGetMantissa), eIntegerAdd, ((-1) - (((-1) - iGetFlags) | ((-1) - 1))) ^ ((iGetFlags2 + 1) - (iGetFlags2 | 1)));
        return (eContext == null || eContext == EContext.UnlimitedHalfEven) ? tCreateNewWithFlags : RoundToPrecision(tCreateNewWithFlags, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MultiplyAndAdd(T t2, T t3, T t4, EContext eContext) {
        if (t3 == null) {
            throw new NullPointerException("multiplicand");
        }
        if (t4 == null) {
            throw new NullPointerException("augend");
        }
        EContext eContextWithBlankFlags = EContext.UnlimitedHalfEven.WithBlankFlags();
        T tMultiplyAddHandleSpecial = MultiplyAddHandleSpecial(t2, t3, t4, eContext);
        if (tMultiplyAddHandleSpecial != null) {
            return tMultiplyAddHandleSpecial;
        }
        T tAdd = Add(Multiply(t2, t3, eContextWithBlankFlags), t4, eContext);
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - eContextWithBlankFlags.getFlags())));
        }
        return tAdd;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Negate(T t2, EContext eContext) {
        T tCreateNewWithFlags;
        int iGetFlags = this.helper.GetFlags(t2);
        if ((8 & iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((4 & iGetFlags) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0 || !eIntegerGetMantissa.isZero()) {
            IRadixMathHelper<T> iRadixMathHelper = this.helper;
            return RoundToPrecision(iRadixMathHelper.CreateNewWithFlags(eIntegerGetMantissa, iRadixMathHelper.GetExponent(t2), iGetFlags ^ 1), eContext);
        }
        boolean z2 = (iGetFlags + 1) - (1 | iGetFlags) == 0;
        if (eContext != null && eContext.getRounding() == ERounding.Floor && z2) {
            IRadixMathHelper<T> iRadixMathHelper2 = this.helper;
            tCreateNewWithFlags = iRadixMathHelper2.CreateNewWithFlags(eIntegerGetMantissa, iRadixMathHelper2.GetExponent(t2), (iGetFlags + 1) - (iGetFlags & 1));
        } else {
            IRadixMathHelper<T> iRadixMathHelper3 = this.helper;
            tCreateNewWithFlags = iRadixMathHelper3.CreateNewWithFlags(eIntegerGetMantissa, iRadixMathHelper3.GetExponent(t2), iGetFlags & (-2));
        }
        return RoundToPrecision(tCreateNewWithFlags, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextMinus(T t2, EContext eContext) {
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        if (!eContext.getHasExponentRange()) {
            return SignalInvalidWithMessage(eContext, "doesn't satisfy ctx.getHasExponentRange()");
        }
        int iGetFlags = this.helper.GetFlags(t2);
        if ((8 & iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((4 & iGetFlags) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        if ((iGetFlags + 2) - (2 | iGetFlags) == 0) {
            FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getEMin());
            if (eContext.getAdjustExponent()) {
                fastIntegerFromBig.SubtractBig(eContext.getPrecision()).Increment();
            }
            FastInteger fastIntegerFromBig2 = FastInteger.FromBig(this.helper.GetExponent(t2));
            if (fastIntegerFromBig2.compareTo(fastIntegerFromBig) <= 0) {
                fastIntegerFromBig = fastIntegerFromBig2.Copy().SubtractInt(2);
            }
            return Add(t2, this.helper.CreateNewWithFlags(EInteger.FromInt32(1), fastIntegerFromBig.ToEInteger(), 1), eContext.WithRounding(ERounding.Floor));
        }
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 1)) != 0) {
            return t2;
        }
        EInteger eMax = eContext.getEMax();
        EInteger precision = eContext.getPrecision();
        if (eContext.getAdjustExponent()) {
            eMax = eMax.Add(EInteger.FromInt32(1)).Subtract(precision);
        }
        EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(EInteger.FromInt32(1), FastInteger.FromBig(eContext.getPrecision()));
        if (eIntegerTryMultiplyByRadixPower == null) {
            return SignalInvalidWithMessage(eContext, "Result requires too much memory");
        }
        return this.helper.CreateNewWithFlags(eIntegerTryMultiplyByRadixPower.Subtract(EInteger.FromInt32(1)), eMax, 0);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextPlus(T t2, EContext eContext) {
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        if (!eContext.getHasExponentRange()) {
            return SignalInvalidWithMessage(eContext, "doesn't satisfy ctx.getHasExponentRange()");
        }
        int iGetFlags = this.helper.GetFlags(t2);
        if ((8 & iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 4)) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        if ((iGetFlags + 2) - (2 | iGetFlags) == 0) {
            FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getEMin());
            if (eContext.getAdjustExponent()) {
                fastIntegerFromBig.SubtractBig(eContext.getPrecision()).Increment();
            }
            FastInteger fastIntegerFromBig2 = FastInteger.FromBig(this.helper.GetExponent(t2));
            if (fastIntegerFromBig2.compareTo(fastIntegerFromBig) <= 0) {
                fastIntegerFromBig = fastIntegerFromBig2.Copy().SubtractInt(2);
            }
            return Add(t2, this.helper.CreateNewWithFlags(EInteger.FromInt32(1), fastIntegerFromBig.ToEInteger(), 0), eContext.WithRounding(ERounding.Ceiling));
        }
        if ((iGetFlags + 1) - (iGetFlags | 1) == 0) {
            return t2;
        }
        EInteger eMax = eContext.getEMax();
        EInteger precision = eContext.getPrecision();
        if (eContext.getAdjustExponent()) {
            eMax = eMax.Add(EInteger.FromInt32(1)).Subtract(precision);
        }
        EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(EInteger.FromInt32(1), FastInteger.FromBig(eContext.getPrecision()));
        if (eIntegerTryMultiplyByRadixPower == null) {
            return SignalInvalidWithMessage(eContext, "Result requires too much memory");
        }
        return this.helper.CreateNewWithFlags(eIntegerTryMultiplyByRadixPower.Subtract(EInteger.FromInt32(1)), eMax, 1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.upokecenter.numbers.IRadixMath
    public T NextToward(T t2, T t3, EContext eContext) {
        T tHandleNotANumber;
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        if (!eContext.getHasExponentRange()) {
            return SignalInvalidWithMessage(eContext, "doesn't satisfy ctx.getHasExponentRange()");
        }
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        int i2 = (-1) - (((-1) - iGetFlags) & ((-1) - iGetFlags2));
        if ((i2 + 14) - (i2 | 14) != 0 && (tHandleNotANumber = HandleNotANumber(t2, t3, eContext)) != null) {
            return tHandleNotANumber;
        }
        int iCompareTo = compareTo(t2, t3);
        if (iCompareTo == 0) {
            return RoundToPrecision(EnsureSign(t2, (iGetFlags2 & 1) != 0), eContext.WithNoFlags());
        }
        if ((iGetFlags + 2) - (2 | iGetFlags) != 0) {
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 3)) == (-1) - (((-1) - iGetFlags2) | ((-1) - 3))) {
                return t2;
            }
            EInteger eMax = eContext.getEMax();
            EInteger precision = eContext.getPrecision();
            if (eContext.getAdjustExponent()) {
                eMax = eMax.Add(EInteger.FromInt32(1)).Subtract(precision);
            }
            EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(EInteger.FromInt32(1), FastInteger.FromBig(eContext.getPrecision()));
            return eIntegerTryMultiplyByRadixPower == null ? SignalInvalidWithMessage(eContext, "Result requires too much memory") : this.helper.CreateNewWithFlags(eIntegerTryMultiplyByRadixPower.Subtract(EInteger.FromInt32(1)), eMax, (-1) - (((-1) - iGetFlags) | ((-1) - 1)));
        }
        FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getEMin());
        if (eContext.getAdjustExponent()) {
            fastIntegerFromBig.SubtractBig(eContext.getPrecision()).Increment();
        }
        FastInteger fastIntegerFromBig2 = FastInteger.FromBig(this.helper.GetExponent(t2));
        if (fastIntegerFromBig2.compareTo(fastIntegerFromBig) < 0) {
            fastIntegerFromBig = fastIntegerFromBig2.Copy().SubtractInt(2);
        } else {
            fastIntegerFromBig.SubtractInt(2);
        }
        T tCreateNewWithFlags = this.helper.CreateNewWithFlags(EInteger.FromInt32(1), fastIntegerFromBig.ToEInteger(), iCompareTo > 0 ? 1 : 0);
        EContext eContextWithBlankFlags = eContext.WithRounding(iCompareTo > 0 ? ERounding.Floor : ERounding.Ceiling).WithBlankFlags();
        T tAdd = Add(t2, tCreateNewWithFlags, eContextWithBlankFlags);
        int flags = eContextWithBlankFlags.getFlags();
        if ((flags + 24) - (flags | 24) == 0) {
            eContextWithBlankFlags.setFlags(0);
        }
        int flags2 = eContextWithBlankFlags.getFlags();
        if ((flags2 + 8) - (flags2 | 8) != 0) {
            EInteger eIntegerGetMantissa = this.helper.GetMantissa(tAdd);
            EInteger eIntegerTryMultiplyByRadixPower2 = TryMultiplyByRadixPower(EInteger.FromInt32(1), FastInteger.FromBig(eContext.getPrecision()).Decrement());
            if (eIntegerTryMultiplyByRadixPower2 == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            if (eIntegerGetMantissa.compareTo(eIntegerTryMultiplyByRadixPower2) >= 0 || eContext.getPrecision().compareTo(EInteger.FromInt32(1)) == 0) {
                eContextWithBlankFlags.setFlags(0);
            }
        }
        if (eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - eContext.getFlags())));
        }
        return tAdd;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Pi(EContext eContext) {
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        int i2 = 1;
        T tValueOf = this.helper.ValueOf(1);
        EContext eContextWithRounding = SetPrecisionIfLimited(eContext, eContext.getPrecision().Add(EInteger.FromInt32(10))).WithRounding(ERounding.HalfEven);
        T tValueOf2 = this.helper.ValueOf(2);
        T tDivide = Divide(tValueOf, SquareRoot(tValueOf2, eContextWithRounding), eContextWithRounding);
        T tValueOf3 = this.helper.ValueOf(4);
        int i3 = 0;
        T tCreateNewWithFlags = (1 & this.thisRadix) == 0 ? this.helper.CreateNewWithFlags(EInteger.FromInt64(r1 / 2), ValueMinusOne, 0) : null;
        T tDivide2 = Divide(tValueOf, tValueOf3, eContextWithRounding);
        EInteger eIntegerFromInt32 = EInteger.FromInt32(1);
        int i4 = 0;
        T t2 = null;
        while (i2 != 0) {
            T tAdd = Add(tValueOf, tDivide, null);
            T tDivide3 = tCreateNewWithFlags == null ? Divide(tAdd, tValueOf2, eContextWithRounding) : Multiply(tAdd, tCreateNewWithFlags, null);
            T tAdd2 = Add(tValueOf, NegateRaw(tDivide3), null);
            if (!tValueOf.equals(tDivide)) {
                tDivide = SquareRoot(Multiply(tValueOf, tDivide, eContextWithRounding), eContextWithRounding);
            }
            T tDivide4 = Divide(Multiply(tAdd, tAdd, null), Multiply(tDivide2, tValueOf3, null), eContextWithRounding);
            if (t2 != null) {
                int iCompareTo = compareTo(t2, tDivide4);
                if (iCompareTo == 0) {
                    i2 = 0;
                } else if ((iCompareTo > 0 && i3 < 0) || (i3 > 0 && iCompareTo < 0)) {
                    i4++;
                    int i5 = i4 <= 3 ? 1 : 0;
                    i2 = (i2 + i5) - (i2 | i5);
                }
                i3 = iCompareTo;
            }
            if (i2 != 0) {
                tDivide2 = Add(tDivide2, NegateRaw(Multiply(Multiply(tAdd2, tAdd2, null), this.helper.CreateNewWithFlags(eIntegerFromInt32, EInteger.FromInt32(0), 0), null)), eContextWithRounding);
                eIntegerFromInt32 = eIntegerFromInt32.ShiftLeft(1);
            }
            tValueOf = tDivide3;
            t2 = tDivide4;
        }
        return RoundToPrecision(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Plus(T t2, EContext eContext) {
        return RoundToPrecisionInternal(t2, 0, 0, null, true, eContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.upokecenter.numbers.IRadixMath
    public T Power(T t2, T t3, EContext eContext) {
        Object objQuantize;
        boolean z2;
        T t4 = (T) HandleNotANumber(t2, t3, eContext);
        if (t4 != null) {
            return t4;
        }
        int iGetSign = this.helper.GetSign(t2);
        int iGetSign2 = this.helper.GetSign(t3);
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if (iGetSign == 0 && iGetSign2 == 0) {
            return (T) SignalInvalid(eContext);
        }
        if (iGetSign < 0 && (iGetFlags2 + 2) - (2 | iGetFlags2) != 0) {
            return (T) SignalInvalid(eContext);
        }
        if (iGetSign > 0 && (iGetFlags + 2) - (2 | iGetFlags) == 0 && (iGetFlags2 + 2) - (2 | iGetFlags2) != 0) {
            int iCompareTo = compareTo(t2, this.helper.ValueOf(1));
            return iCompareTo < 0 ? iGetSign2 < 0 ? this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 2) : (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), eContext) : iCompareTo == 0 ? (T) ExtendPrecision(this.helper.ValueOf(1), eContext) : iGetSign2 > 0 ? t3 : (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), eContext);
        }
        EInteger eIntegerGetExponent = this.helper.GetExponent(t3);
        boolean z3 = eIntegerGetExponent.signum() > 0;
        if (z3) {
            objQuantize = null;
            if (eIntegerGetExponent.equals(EInteger.FromInt32(0))) {
                z2 = !this.helper.GetMantissa(null).isEven();
            } else if (this.thisRadix % 2 == 0) {
                z2 = false;
            } else {
                objQuantize = Quantize(t3, this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), EContext.ForRounding(ERounding.Down));
                z2 = !this.helper.GetMantissa((T) objQuantize).isEven();
            }
        } else {
            objQuantize = Quantize(t3, this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), EContext.ForRounding(ERounding.Down));
            z3 = compareTo(objQuantize, t3) == 0;
            z2 = !this.helper.GetMantissa((T) objQuantize).isEven();
        }
        int i2 = ((1 & iGetFlags) != 0 && (iGetFlags2 + 2) - (iGetFlags2 | 2) == 0 && z3 && z2) ? 1 : 0;
        if (iGetSign == 0 && iGetSign2 != 0) {
            int i3 = iGetSign2 < 0 ? 2 : 0;
            if (i2 != 0) {
                i3 = (i3 + 1) - (i3 & 1);
            }
            T tCreateNewWithFlags = this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), i3);
            return (i3 & 2) == 0 ? (T) RoundToPrecision(tCreateNewWithFlags, eContext) : tCreateNewWithFlags;
        }
        if ((!z3 || iGetSign2 < 0) && (eContext == null || !eContext.getHasMaxPrecision())) {
            return (T) SignalInvalidWithMessage(eContext, "ctx is null or has unlimited precision, and pow's exponent is not an integer or is negative");
        }
        if (iGetSign < 0 && !z3) {
            return (T) SignalInvalid(eContext);
        }
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0) {
            return iGetSign2 > 0 ? (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), i2 | 2), eContext) : iGetSign2 < 0 ? (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), i2), eContext) : (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(1), EInteger.FromInt32(0), 0), eContext);
        }
        if (iGetSign2 == 0) {
            return (T) RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(1), EInteger.FromInt32(0), 0), eContext);
        }
        if (z3) {
            if (compareTo(t2, this.helper.ValueOf(1)) == 0 && z3) {
                if (this.helper.GetExponent(t2).signum() == 0) {
                    return !IsWithinExponentRangeForPow(t3, eContext) ? (T) SignalInvalid(eContext) : this.helper.ValueOf(1);
                }
                if (eIntegerGetExponent.signum() == 0) {
                    if (!IsWithinExponentRangeForPow(t3, eContext)) {
                        return (T) SignalInvalid(eContext);
                    }
                    EInteger eIntegerAbs = this.helper.GetMantissa((T) objQuantize).Abs();
                    return iGetSign2 < 0 ? (T) PowerIntegral(this.helper.ValueOf(1), eIntegerAbs, eContext) : (T) PowerIntegral(t2, eIntegerAbs, eContext);
                }
            }
            if (eIntegerGetExponent.compareTo(10) > 0) {
                if (compareTo(t3, this.helper.ValueOf(99999999)) > 0) {
                    EContext eContextWithTraps = eContext.WithBlankFlags().WithTraps(0);
                    T t5 = (T) Power(t2, this.helper.ValueOf(z2 ? 99999999 : 99999998), eContextWithTraps);
                    if ((eContextWithTraps.getFlags() & 16) != 0) {
                        if (eContext.getHasFlags()) {
                            eContext.setFlags(eContext.getFlags() | eContextWithTraps.getFlags());
                        }
                        return t5;
                    }
                }
            }
            if (objQuantize == null) {
                objQuantize = Quantize(t3, this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 0), EContext.ForRounding(ERounding.Down));
            }
            EInteger eIntegerGetMantissa = this.helper.GetMantissa((T) objQuantize);
            if (iGetSign2 < 0) {
                eIntegerGetMantissa = eIntegerGetMantissa.Negate();
            }
            return (T) PowerIntegral(t2, eIntegerGetMantissa, eContext);
        }
        if (compareTo(t2, this.helper.ValueOf(1)) == 0) {
            return !IsWithinExponentRangeForPow(t3, eContext) ? (T) SignalInvalid(eContext) : (T) ExtendPrecision(this.helper.ValueOf(1), eContext);
        }
        int i4 = this.thisRadix;
        if (i4 == 10 || i4 == 2) {
            if (compareTo(t3, i4 == 10 ? this.helper.CreateNewWithFlags(EInteger.FromInt64(5L), ValueMinusOne, 0) : this.helper.CreateNewWithFlags(EInteger.FromInt32(1), ValueMinusOne, 0)) == 0 && IsWithinExponentRangeForPow(t3, eContext) && IsWithinExponentRangeForPow(t2, eContext)) {
                EContext eContextWithBlankFlags = eContext.WithBlankFlags();
                Object objSquareRoot = SquareRoot(t2, eContextWithBlankFlags);
                eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 1)));
                eContextWithBlankFlags.setFlags(eContextWithBlankFlags.getFlags() | 2);
                int flags = eContextWithBlankFlags.getFlags();
                if ((flags + 4) - (flags | 4) != 0) {
                    int flags2 = eContextWithBlankFlags.getFlags();
                    eContextWithBlankFlags.setFlags((flags2 + 8) - (flags2 & 8));
                }
                T t6 = (T) ExtendPrecision(objSquareRoot, eContextWithBlankFlags);
                if (eContext.getHasFlags()) {
                    int flags3 = eContext.getFlags();
                    int flags4 = eContextWithBlankFlags.getFlags();
                    eContext.setFlags((flags4 + flags3) - (flags4 & flags3));
                }
                return t6;
            }
        }
        EContext eContextSetPrecisionIfLimited = SetPrecisionIfLimited(eContext, eContext.getPrecision().Add(WorkingDigits(EInteger.FromInt32(15)).Add(EInteger.Min(EInteger.FromInt32(50), NumberUtility.IntegerDigitLengthUpperBound(this.helper, objQuantize)))));
        EContext eContextWithBlankFlags2 = (eContext.getRounding() == ERounding.Ceiling || eContext.getRounding() == ERounding.Floor) ? eContextSetPrecisionIfLimited.WithRounding(ERounding.Up).WithBlankFlags() : eContextSetPrecisionIfLimited.WithRounding(eContext.getRounding()).WithBlankFlags();
        Object objMultiply = Multiply(Ln(t2, eContextWithBlankFlags2), t3, eContextWithBlankFlags2);
        eContextWithBlankFlags2.getPrecision();
        EContext eContextWithBlankFlags3 = eContext.WithBlankFlags();
        T t7 = (T) Exp(objMultiply, eContextWithBlankFlags3);
        int flags5 = eContextWithBlankFlags3.getFlags();
        if ((flags5 + 48) - (flags5 | 48) == 0 || (IsWithinExponentRangeForPow(t2, eContext) && IsWithinExponentRangeForPow(t3, eContext))) {
            if (eContext.getHasFlags()) {
                int flags6 = eContext.getFlags();
                int flags7 = eContextWithBlankFlags3.getFlags();
                eContext.setFlags((flags6 + flags7) - (flags6 & flags7));
            }
            return t7;
        }
        return (T) SignalInvalid(eContext);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.upokecenter.numbers.IRadixMath
    public T Quantize(T t2, T t3, EContext eContext) {
        T tRoundToPrecisionInternal;
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        if ((-1) - (((-1) - (iGetFlags | iGetFlags2)) | ((-1) - 14)) != 0) {
            T tHandleNotANumber = HandleNotANumber(t2, t3, eContext);
            return tHandleNotANumber != null ? tHandleNotANumber : ((iGetFlags & iGetFlags2) & 2) != 0 ? RoundToPrecision(t2, eContext) : SignalInvalid(eContext);
        }
        EInteger eIntegerGetExponent = this.helper.GetExponent(t3);
        if (eContext != null && !eContext.ExponentWithinRange(eIntegerGetExponent)) {
            return SignalInvalidWithMessage(eContext, "Exponent not within exponent range: " + eIntegerGetExponent);
        }
        EContext eContextWithBlankFlags = (eContext == null ? EContext.ForRounding(ERounding.HalfEven) : eContext.Copy()).WithBlankFlags();
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        EInteger eIntegerGetExponent2 = this.helper.GetExponent(t2);
        int iCompareTo = eIntegerGetExponent2.compareTo(eIntegerGetExponent);
        int iGetFlags3 = this.helper.GetFlags(t2) & 1;
        if (iCompareTo == 0) {
            tRoundToPrecisionInternal = RoundToPrecision(t2, eContextWithBlankFlags);
        } else if (eIntegerGetMantissa.isZero()) {
            tRoundToPrecisionInternal = RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), eIntegerGetExponent, iGetFlags3), eContextWithBlankFlags);
        } else if (iCompareTo > 0) {
            FastInteger fastIntegerSubtractBig = FastInteger.FromBig(eIntegerGetExponent2).SubtractBig(eIntegerGetExponent);
            if (eContextWithBlankFlags.getPrecision().signum() > 0 && fastIntegerSubtractBig.compareTo(FastInteger.FromBig(eContextWithBlankFlags.getPrecision()).AddInt(10)) > 0) {
                return SignalInvalidWithMessage(eContext, "Result too high for current precision");
            }
            EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(eIntegerGetMantissa, fastIntegerSubtractBig);
            if (eIntegerTryMultiplyByRadixPower == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
            tRoundToPrecisionInternal = RoundToPrecision(this.helper.CreateNewWithFlags(eIntegerTryMultiplyByRadixPower, eIntegerGetExponent, iGetFlags3), eContextWithBlankFlags);
        } else {
            tRoundToPrecisionInternal = RoundToPrecisionInternal(t2, 0, 0, FastInteger.FromBig(eIntegerGetExponent).SubtractBig(eIntegerGetExponent2), false, eContextWithBlankFlags);
        }
        if ((-1) - (((-1) - eContextWithBlankFlags.getFlags()) | ((-1) - 16)) != 0) {
            return SignalInvalid(eContext);
        }
        if (tRoundToPrecisionInternal == null || !this.helper.GetExponent(tRoundToPrecisionInternal).equals(eIntegerGetExponent)) {
            return SignalInvalid(eContext);
        }
        T tEnsureSign = EnsureSign(tRoundToPrecisionInternal, iGetFlags3 != 0);
        if (eContext != null && eContext.getHasFlags()) {
            int flags = eContextWithBlankFlags.getFlags() & (-9);
            if (iCompareTo < 0 && !this.helper.GetMantissa(tEnsureSign).isZero() && IsSubnormal(tEnsureSign, eContext)) {
                flags |= 4;
            }
            eContext.setFlags((-1) - (((-1) - flags) & ((-1) - eContext.getFlags())));
        }
        return tEnsureSign;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Reduce(T t2, EContext eContext) {
        return ReduceToPrecisionAndIdealExponent(t2, eContext, null, null);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Remainder(T t2, T t3, EContext eContext, boolean z2) {
        EContext eContextWithBlankFlags = eContext == null ? null : eContext.WithBlankFlags();
        T tRemainderHandleSpecial = RemainderHandleSpecial(t2, t3, eContextWithBlankFlags);
        if (tRemainderHandleSpecial != null) {
            TransferFlags(eContext, eContextWithBlankFlags);
            return tRemainderHandleSpecial;
        }
        T tDivideToIntegerZeroScale = DivideToIntegerZeroScale(t2, t3, z2 ? eContextWithBlankFlags : null);
        int flags = eContextWithBlankFlags.getFlags();
        if ((flags + 64) - (flags | 64) != 0) {
            return SignalInvalid(eContext);
        }
        T tEnsureSign = EnsureSign(Add(t2, NegateRaw(Multiply(tDivideToIntegerZeroScale, t3, null)), eContextWithBlankFlags), (-1) - (((-1) - this.helper.GetFlags(t2)) | ((-1) - 1)) != 0);
        TransferFlags(eContext, eContextWithBlankFlags);
        return tEnsureSign;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.upokecenter.numbers.IRadixMath
    public T RemainderNear(T t2, T t3, EContext eContext) {
        EContext eContextWithBlankFlags = eContext == null ? EContext.ForRounding(ERounding.HalfEven).WithBlankFlags() : eContext.WithRounding(ERounding.HalfEven).WithBlankFlags();
        T tRemainderHandleSpecial = RemainderHandleSpecial(t2, t3, eContextWithBlankFlags);
        if (tRemainderHandleSpecial != null) {
            TransferFlags(eContext, eContextWithBlankFlags);
            return tRemainderHandleSpecial;
        }
        T tDivideInternal = DivideInternal(t2, t3, eContextWithBlankFlags, 1, EInteger.FromInt32(0));
        if ((eContextWithBlankFlags.getFlags() & 64) != 0) {
            return SignalInvalid(eContext);
        }
        EContext eContextWithBlankFlags2 = eContextWithBlankFlags.WithBlankFlags();
        T tRoundToPrecision = RoundToPrecision(tDivideInternal, eContextWithBlankFlags2);
        if ((eContextWithBlankFlags2.getFlags() & 66) != 0) {
            return SignalInvalid(eContext);
        }
        EContext eContextWithBlankFlags3 = eContext == null ? EContext.UnlimitedHalfEven.WithBlankFlags() : eContext.WithBlankFlags();
        T tAdd = Add(t2, NegateRaw(Multiply(tRoundToPrecision, t3, null)), eContextWithBlankFlags3);
        int flags = eContextWithBlankFlags3.getFlags();
        if ((flags + 64) - (flags | 64) != 0) {
            return SignalInvalid(eContext);
        }
        if (this.helper.GetFlags(tAdd) == 0 && this.helper.GetMantissa(tAdd).isZero()) {
            tAdd = EnsureSign(tAdd, (-1) - (((-1) - this.helper.GetFlags(t2)) | ((-1) - 1)) != 0);
        }
        TransferFlags(eContext, eContextWithBlankFlags3);
        return tAdd;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundAfterConversion(T t2, EContext eContext) {
        return RoundToPrecision(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentExact(T t2, EInteger eInteger, EContext eContext) {
        if (this.helper.GetExponent(t2).compareTo(eInteger) >= 0) {
            return RoundToPrecision(t2, eContext);
        }
        EContext eContextWithBlankFlags = eContext == null ? null : eContext.WithPrecision(0).WithBlankFlags();
        T tQuantize = Quantize(t2, this.helper.CreateNewWithFlags(EInteger.FromInt32(1), eInteger, 0), eContextWithBlankFlags);
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - eContextWithBlankFlags.getFlags())));
        }
        return tQuantize;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentNoRoundedFlag(T t2, EInteger eInteger, EContext eContext) {
        EContext eContextWithBlankFlags = eContext == null ? null : eContext.WithBlankFlags();
        T tRoundToExponentExact = RoundToExponentExact(t2, eInteger, eContextWithBlankFlags);
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags(eContext.getFlags() | (eContextWithBlankFlags.getFlags() & (-4)));
        }
        return tRoundToExponentExact;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentSimple(T t2, EInteger eInteger, EContext eContext) {
        int iGetFlags = this.helper.GetFlags(t2);
        if ((iGetFlags + 14) - (14 | iGetFlags) != 0) {
            T tHandleNotANumber = HandleNotANumber(t2, t2, eContext);
            if (tHandleNotANumber != null) {
                return tHandleNotANumber;
            }
            if ((-1) - (((-1) - iGetFlags) | ((-1) - 2)) != 0) {
                return t2;
            }
        }
        if (this.helper.GetExponent(t2).compareTo(eInteger) >= 0) {
            return RoundToPrecision(t2, eContext);
        }
        if (eContext != null && !eContext.ExponentWithinRange(eInteger)) {
            return SignalInvalidWithMessage(eContext, "Exponent not within exponent range: " + eInteger);
        }
        FastInteger fastIntegerSubtractBig = FastInteger.FromBig(eInteger).SubtractBig(this.helper.GetExponent(t2));
        if (fastIntegerSubtractBig.signum() == 0 && IsSimpleContext(eContext)) {
            return t2;
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        if (IsSimpleContext(eContext) && eContext.getRounding() == ERounding.Down) {
            return this.helper.CreateNewWithFlags(fastIntegerSubtractBig.CanFitInInt32() ? eIntegerGetMantissa.ShiftRight(fastIntegerSubtractBig.ToInt32()) : eIntegerGetMantissa.ShiftRight(fastIntegerSubtractBig.ToEInteger()), eInteger, iGetFlags);
        }
        IShiftAccumulator iShiftAccumulatorCreateShiftAccumulatorWithDigits = this.helper.CreateShiftAccumulatorWithDigits(eIntegerGetMantissa, 0, 0);
        iShiftAccumulatorCreateShiftAccumulatorWithDigits.TruncateOrShiftRight(fastIntegerSubtractBig, false);
        return RoundToPrecisionInternal(this.helper.CreateNewWithFlags(iShiftAccumulatorCreateShiftAccumulatorWithDigits.getShiftedInt(), eInteger, iGetFlags), iShiftAccumulatorCreateShiftAccumulatorWithDigits.getLastDiscardedDigit(), iShiftAccumulatorCreateShiftAccumulatorWithDigits.getOlderDiscardedDigits(), null, false, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToPrecision(T t2, EContext eContext) {
        return RoundToPrecisionInternal(t2, 0, 0, null, false, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SignalOverflow(EContext eContext, boolean z2) {
        if (eContext != null) {
            ERounding rounding = eContext.getRounding();
            if (eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | 19);
            }
            if (rounding == ERounding.None) {
                return SignalInvalidWithMessage(eContext, "Rounding was required");
            }
            if (eContext.getHasMaxPrecision() && eContext.getHasExponentRange() && (rounding == ERounding.Down || rounding == ERounding.ZeroFiveUp || rounding == ERounding.OddOrZeroFiveUp || rounding == ERounding.Odd || ((rounding == ERounding.Ceiling && z2) || (rounding == ERounding.Floor && !z2)))) {
                EInteger.FromInt32(0);
                FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getPrecision());
                EInteger eIntegerTryMultiplyByRadixPower = TryMultiplyByRadixPower(EInteger.FromInt32(1), fastIntegerFromBig);
                if (eIntegerTryMultiplyByRadixPower == null) {
                    return SignalInvalidWithMessage(eContext, "Result requires too much memory");
                }
                EInteger eIntegerSubtract = eIntegerTryMultiplyByRadixPower.Subtract(EInteger.FromInt32(1));
                FastInteger fastIntegerFromBig2 = FastInteger.FromBig(eContext.getEMax());
                if (eContext.getAdjustExponent()) {
                    fastIntegerFromBig2.Increment().Subtract(fastIntegerFromBig);
                }
                return this.helper.CreateNewWithFlags(eIntegerSubtract, fastIntegerFromBig2.ToEInteger(), z2 ? 1 : 0);
            }
        }
        if (this.support == 0) {
            return null;
        }
        return this.helper.CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), (z2 ? 1 : 0) | 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.upokecenter.numbers.IRadixMath
    public T SquareRoot(T t2, EContext eContext) {
        if (eContext == null) {
            return SignalInvalidWithMessage(eContext, "ctx is null");
        }
        if (!eContext.getHasMaxPrecision()) {
            return SignalInvalidWithMessage(eContext, "ctx has unlimited precision");
        }
        T tSquareRootHandleSpecial = SquareRootHandleSpecial(t2, eContext);
        if (tSquareRootHandleSpecial != null) {
            return tSquareRootHandleSpecial;
        }
        EContext eContextWithBlankFlags = eContext.WithBlankFlags();
        EInteger eIntegerGetExponent = this.helper.GetExponent(t2);
        EInteger eIntegerDivide = eIntegerGetExponent.Divide(EInteger.FromInt64(2L));
        if (eIntegerGetExponent.signum() < 0 && !eIntegerGetExponent.isEven()) {
            eIntegerDivide = eIntegerDivide.Subtract(EInteger.FromInt32(1));
        }
        if (this.helper.GetSign(t2) == 0) {
            T tRoundToPrecision = RoundToPrecision(this.helper.CreateNewWithFlags(EInteger.FromInt32(0), eIntegerDivide, this.helper.GetFlags(t2)), eContextWithBlankFlags);
            if (eContext.getHasFlags()) {
                eContext.setFlags(eContext.getFlags() | eContextWithBlankFlags.getFlags());
            }
            return tRoundToPrecision;
        }
        EInteger eIntegerGetMantissa = this.helper.GetMantissa(t2);
        FastInteger fastIntegerGetDigitLength = this.helper.GetDigitLength(eIntegerGetMantissa);
        FastInteger fastIntegerFromBig = FastInteger.FromBig(eContext.getPrecision());
        FastInteger fastIntegerAddInt = fastIntegerFromBig.Copy().Multiply(2).AddInt(2);
        if (fastIntegerGetDigitLength.compareTo(fastIntegerAddInt) < 0) {
            FastInteger fastIntegerSubtract = fastIntegerAddInt.Copy().Subtract(fastIntegerGetDigitLength);
            if ((!fastIntegerSubtract.isEvenNumber()) ^ (!eIntegerGetExponent.isEven())) {
                fastIntegerSubtract.Increment();
            }
            eIntegerGetExponent = eIntegerGetExponent.Subtract(fastIntegerSubtract.ToEInteger());
            eIntegerGetMantissa = TryMultiplyByRadixPower(eIntegerGetMantissa, fastIntegerSubtract);
            if (eIntegerGetMantissa == null) {
                return SignalInvalidWithMessage(eContext, "Result requires too much memory");
            }
        }
        EInteger[] eIntegerArrSqrtRem = eIntegerGetMantissa.SqrtRem();
        this.helper.GetDigitLength(eIntegerArrSqrtRem[0]);
        EInteger eInteger = eIntegerArrSqrtRem[1];
        EInteger eInteger2 = eIntegerArrSqrtRem[0];
        boolean zIsZero = eInteger.isZero();
        int i2 = !zIsZero ? 1 : 0;
        int i3 = !zIsZero ? 1 : 0;
        EInteger eIntegerShiftRight = eIntegerGetExponent.ShiftRight(1);
        if (eIntegerGetExponent.signum() < 0 && !eIntegerGetExponent.isEven()) {
            eIntegerShiftRight = eIntegerShiftRight.Subtract(EInteger.FromInt32(1));
        }
        T tRoundToPrecisionInternal = RoundToPrecisionInternal(this.helper.CreateNewWithFlags(eInteger2, eIntegerShiftRight, 0), 0, i3, null, false, eContextWithBlankFlags);
        EInteger eIntegerGetExponent2 = this.helper.GetExponent(tRoundToPrecisionInternal);
        int flags = eContextWithBlankFlags.getFlags();
        if ((flags + 8) - (flags | 8) == 0 && (eIntegerGetExponent2.compareTo(eIntegerDivide) <= 0 || !IsFinite(tRoundToPrecisionInternal))) {
            EContext eContext2 = eContext.getHasExponentRange() ? eContextWithBlankFlags : null;
            if (zIsZero) {
                fastIntegerFromBig = null;
            }
            tRoundToPrecisionInternal = ReduceToPrecisionAndIdealExponent(tRoundToPrecisionInternal, eContext2, fastIntegerFromBig, FastInteger.FromBig(eIntegerDivide));
        }
        if (eContext.getHasFlags()) {
            if (eContext.getClampNormalExponents() && !this.helper.GetExponent(tRoundToPrecisionInternal).equals(eIntegerDivide) && (eContextWithBlankFlags.getFlags() & 1) == 0) {
                eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 32)));
            }
            int flags2 = eContextWithBlankFlags.getFlags();
            int i4 = (flags2 + 16) - (flags2 | 16) != 0 ? 1 : 0;
            int i5 = (i2 + i4) - (i2 & i4);
            EInteger eIntegerGetExponent3 = this.helper.GetExponent(tRoundToPrecisionInternal);
            if (i5 != 0) {
                int flags3 = eContextWithBlankFlags.getFlags();
                eContextWithBlankFlags.setFlags((flags3 + 2) - (flags3 & 2));
            } else if (eIntegerGetExponent3.compareTo(eIntegerDivide) > 0) {
                int flags4 = eContextWithBlankFlags.getFlags();
                eContextWithBlankFlags.setFlags((flags4 + 2) - (flags4 & 2));
            } else {
                eContextWithBlankFlags.setFlags(eContextWithBlankFlags.getFlags() & (-3));
            }
            if (!zIsZero) {
                eContextWithBlankFlags.setFlags(eContextWithBlankFlags.getFlags() | 2);
                eContextWithBlankFlags.setFlags((-1) - (((-1) - eContextWithBlankFlags.getFlags()) & ((-1) - 1)));
            }
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - eContextWithBlankFlags.getFlags())));
        }
        return tRoundToPrecisionInternal;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public int compareTo(T t2, T t3) {
        if (t3 == null) {
            return 1;
        }
        int iGetFlags = this.helper.GetFlags(t2);
        int iGetFlags2 = this.helper.GetFlags(t3);
        return (-1) - (((-1) - ((-1) - (((-1) - iGetFlags) & ((-1) - iGetFlags2)))) | ((-1) - 14)) != 0 ? CompareToHandleSpecial2(iGetFlags, iGetFlags2) : CompareToInternal(t2, t3, true, this.helper);
    }
}

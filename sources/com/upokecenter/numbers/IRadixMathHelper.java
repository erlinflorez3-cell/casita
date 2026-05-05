package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
interface IRadixMathHelper<T> {
    T CreateNewWithFlags(EInteger eInteger, EInteger eInteger2, int i2);

    T CreateNewWithFlagsFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2, int i2);

    IShiftAccumulator CreateShiftAccumulatorWithDigits(EInteger eInteger, int i2, int i3);

    IShiftAccumulator CreateShiftAccumulatorWithDigitsFastInt(FastIntegerFixed fastIntegerFixed, int i2, int i3);

    FastInteger DivisionShift(EInteger eInteger, EInteger eInteger2);

    int GetArithmeticSupport();

    FastInteger GetDigitLength(EInteger eInteger);

    EInteger GetExponent(T t2);

    FastIntegerFixed GetExponentFastInt(T t2);

    int GetFlags(T t2);

    EInteger GetMantissa(T t2);

    FastIntegerFixed GetMantissaFastInt(T t2);

    int GetRadix();

    int GetSign(T t2);

    EInteger MultiplyByRadixPower(EInteger eInteger, FastInteger fastInteger);

    FastIntegerFixed MultiplyByRadixPowerFastInt(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2);

    T ValueOf(int i2);
}

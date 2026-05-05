package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
interface IRadixMath<T> {
    T Abs(T t2, EContext eContext);

    T Add(T t2, T t3, EContext eContext);

    T AddEx(T t2, T t3, EContext eContext, boolean z2);

    T CompareToWithContext(T t2, T t3, boolean z2, EContext eContext);

    T Divide(T t2, T t3, EContext eContext);

    T DivideToExponent(T t2, T t3, EInteger eInteger, EContext eContext);

    T DivideToIntegerNaturalScale(T t2, T t3, EContext eContext);

    T DivideToIntegerZeroScale(T t2, T t3, EContext eContext);

    T Exp(T t2, EContext eContext);

    IRadixMathHelper<T> GetHelper();

    T Ln(T t2, EContext eContext);

    T Max(T t2, T t3, EContext eContext);

    T MaxMagnitude(T t2, T t3, EContext eContext);

    T Min(T t2, T t3, EContext eContext);

    T MinMagnitude(T t2, T t3, EContext eContext);

    T Multiply(T t2, T t3, EContext eContext);

    T MultiplyAndAdd(T t2, T t3, T t4, EContext eContext);

    T Negate(T t2, EContext eContext);

    T NextMinus(T t2, EContext eContext);

    T NextPlus(T t2, EContext eContext);

    T NextToward(T t2, T t3, EContext eContext);

    T Pi(EContext eContext);

    T Plus(T t2, EContext eContext);

    T Power(T t2, T t3, EContext eContext);

    T Quantize(T t2, T t3, EContext eContext);

    T Reduce(T t2, EContext eContext);

    T Remainder(T t2, T t3, EContext eContext, boolean z2);

    T RemainderNear(T t2, T t3, EContext eContext);

    T RoundAfterConversion(T t2, EContext eContext);

    T RoundToExponentExact(T t2, EInteger eInteger, EContext eContext);

    T RoundToExponentNoRoundedFlag(T t2, EInteger eInteger, EContext eContext);

    T RoundToExponentSimple(T t2, EInteger eInteger, EContext eContext);

    T RoundToPrecision(T t2, EContext eContext);

    T SignalOverflow(EContext eContext, boolean z2);

    T SquareRoot(T t2, EContext eContext);

    int compareTo(T t2, T t3);
}

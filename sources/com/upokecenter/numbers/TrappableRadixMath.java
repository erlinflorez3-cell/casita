package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
class TrappableRadixMath<T> implements IRadixMath<T> {
    private final IRadixMath<T> math;

    public TrappableRadixMath(IRadixMath<T> iRadixMath) {
        this.math = iRadixMath;
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Abs(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tAbs = this.math.Abs(t2, eContextGetNontrapping);
        return eContext == null ? tAbs : (T) eContext.TriggerTraps(tAbs, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Add(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tAdd = this.math.Add(t2, t3, eContextGetNontrapping);
        return eContext == null ? tAdd : (T) eContext.TriggerTraps(tAdd, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T AddEx(T t2, T t3, EContext eContext, boolean z2) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tAddEx = this.math.AddEx(t2, t3, eContext, z2);
        return eContext == null ? tAddEx : (T) eContext.TriggerTraps(tAddEx, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T CompareToWithContext(T t2, T t3, boolean z2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tCompareToWithContext = this.math.CompareToWithContext(t2, t3, z2, eContextGetNontrapping);
        return eContext == null ? tCompareToWithContext : (T) eContext.TriggerTraps(tCompareToWithContext, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Divide(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tDivide = this.math.Divide(t2, t3, eContextGetNontrapping);
        return eContext == null ? tDivide : (T) eContext.TriggerTraps(tDivide, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToExponent(T t2, T t3, EInteger eInteger, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tDivideToExponent = this.math.DivideToExponent(t2, t3, eInteger, eContextGetNontrapping);
        return eContext == null ? tDivideToExponent : (T) eContext.TriggerTraps(tDivideToExponent, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerNaturalScale(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tDivideToIntegerNaturalScale = this.math.DivideToIntegerNaturalScale(t2, t3, eContextGetNontrapping);
        return eContext == null ? tDivideToIntegerNaturalScale : (T) eContext.TriggerTraps(tDivideToIntegerNaturalScale, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerZeroScale(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tDivideToIntegerZeroScale = this.math.DivideToIntegerZeroScale(t2, t3, eContextGetNontrapping);
        return eContext == null ? tDivideToIntegerZeroScale : (T) eContext.TriggerTraps(tDivideToIntegerZeroScale, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Exp(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tExp = this.math.Exp(t2, eContextGetNontrapping);
        return eContext == null ? tExp : (T) eContext.TriggerTraps(tExp, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public IRadixMathHelper<T> GetHelper() {
        return this.math.GetHelper();
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Ln(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tLn = this.math.Ln(t2, eContextGetNontrapping);
        return eContext == null ? tLn : (T) eContext.TriggerTraps(tLn, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Max(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tMax = this.math.Max(t2, t3, eContextGetNontrapping);
        return eContext == null ? tMax : (T) eContext.TriggerTraps(tMax, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MaxMagnitude(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tMaxMagnitude = this.math.MaxMagnitude(t2, t3, eContextGetNontrapping);
        return eContext == null ? tMaxMagnitude : (T) eContext.TriggerTraps(tMaxMagnitude, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Min(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tMin = this.math.Min(t2, t3, eContextGetNontrapping);
        return eContext == null ? tMin : (T) eContext.TriggerTraps(tMin, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MinMagnitude(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tMinMagnitude = this.math.MinMagnitude(t2, t3, eContextGetNontrapping);
        return eContext == null ? tMinMagnitude : (T) eContext.TriggerTraps(tMinMagnitude, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Multiply(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tMultiply = this.math.Multiply(t2, t3, eContextGetNontrapping);
        return eContext == null ? tMultiply : (T) eContext.TriggerTraps(tMultiply, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MultiplyAndAdd(T t2, T t3, T t4, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tMultiplyAndAdd = this.math.MultiplyAndAdd(t2, t3, t4, eContextGetNontrapping);
        return eContext == null ? tMultiplyAndAdd : (T) eContext.TriggerTraps(tMultiplyAndAdd, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Negate(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tNegate = this.math.Negate(t2, eContextGetNontrapping);
        return eContext == null ? tNegate : (T) eContext.TriggerTraps(tNegate, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextMinus(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tNextMinus = this.math.NextMinus(t2, eContextGetNontrapping);
        return eContext == null ? tNextMinus : (T) eContext.TriggerTraps(tNextMinus, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextPlus(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tNextPlus = this.math.NextPlus(t2, eContextGetNontrapping);
        return eContext == null ? tNextPlus : (T) eContext.TriggerTraps(tNextPlus, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextToward(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tNextToward = this.math.NextToward(t2, t3, eContextGetNontrapping);
        return eContext == null ? tNextToward : (T) eContext.TriggerTraps(tNextToward, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Pi(EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tPi = this.math.Pi(eContextGetNontrapping);
        return eContext == null ? tPi : (T) eContext.TriggerTraps(tPi, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Plus(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tPlus = this.math.Plus(t2, eContextGetNontrapping);
        return eContext == null ? tPlus : (T) eContext.TriggerTraps(tPlus, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Power(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tPower = this.math.Power(t2, t3, eContextGetNontrapping);
        return eContext == null ? tPower : (T) eContext.TriggerTraps(tPower, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Quantize(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tQuantize = this.math.Quantize(t2, t3, eContextGetNontrapping);
        return eContext == null ? tQuantize : (T) eContext.TriggerTraps(tQuantize, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Reduce(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tReduce = this.math.Reduce(t2, eContext);
        return eContext == null ? tReduce : (T) eContext.TriggerTraps(tReduce, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Remainder(T t2, T t3, EContext eContext, boolean z2) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRemainder = this.math.Remainder(t2, t3, eContextGetNontrapping, z2);
        return eContext == null ? tRemainder : (T) eContext.TriggerTraps(tRemainder, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RemainderNear(T t2, T t3, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRemainderNear = this.math.RemainderNear(t2, t3, eContextGetNontrapping);
        return eContext == null ? tRemainderNear : (T) eContext.TriggerTraps(tRemainderNear, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundAfterConversion(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRoundAfterConversion = this.math.RoundAfterConversion(t2, eContextGetNontrapping);
        return eContext == null ? tRoundAfterConversion : (T) eContext.TriggerTraps(tRoundAfterConversion, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentExact(T t2, EInteger eInteger, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRoundToExponentExact = this.math.RoundToExponentExact(t2, eInteger, eContextGetNontrapping);
        return eContext == null ? tRoundToExponentExact : (T) eContext.TriggerTraps(tRoundToExponentExact, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentNoRoundedFlag(T t2, EInteger eInteger, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRoundToExponentNoRoundedFlag = this.math.RoundToExponentNoRoundedFlag(t2, eInteger, eContext);
        return eContext == null ? tRoundToExponentNoRoundedFlag : (T) eContext.TriggerTraps(tRoundToExponentNoRoundedFlag, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentSimple(T t2, EInteger eInteger, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRoundToExponentSimple = this.math.RoundToExponentSimple(t2, eInteger, eContext);
        return eContext == null ? tRoundToExponentSimple : (T) eContext.TriggerTraps(tRoundToExponentSimple, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToPrecision(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tRoundToPrecision = this.math.RoundToPrecision(t2, eContextGetNontrapping);
        return eContext == null ? tRoundToPrecision : (T) eContext.TriggerTraps(tRoundToPrecision, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SignalOverflow(EContext eContext, boolean z2) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tSignalOverflow = this.math.SignalOverflow(eContextGetNontrapping, z2);
        return eContext == null ? tSignalOverflow : (T) eContext.TriggerTraps(tSignalOverflow, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SquareRoot(T t2, EContext eContext) {
        EContext eContextGetNontrapping = eContext == null ? eContext : eContext.GetNontrapping();
        T tSquareRoot = this.math.SquareRoot(t2, eContextGetNontrapping);
        return eContext == null ? tSquareRoot : (T) eContext.TriggerTraps(tSquareRoot, eContextGetNontrapping);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public int compareTo(T t2, T t3) {
        return this.math.compareTo(t2, t3);
    }
}

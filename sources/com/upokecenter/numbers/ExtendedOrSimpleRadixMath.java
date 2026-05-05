package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
class ExtendedOrSimpleRadixMath<T> implements IRadixMath<T> {
    private final RadixMath<T> ext;
    private final SimpleRadixMath<T> simp;

    public ExtendedOrSimpleRadixMath(IRadixMathHelper<T> iRadixMathHelper) {
        RadixMath<T> radixMath = new RadixMath<>(iRadixMathHelper);
        this.ext = radixMath;
        this.simp = new SimpleRadixMath<>(radixMath);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Abs(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Abs(t2, eContext) : this.simp.Abs(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Add(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Add(t2, t3, eContext) : this.simp.Add(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T AddEx(T t2, T t3, EContext eContext, boolean z2) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.AddEx(t2, t3, eContext, z2) : this.simp.AddEx(t2, t3, eContext, z2);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T CompareToWithContext(T t2, T t3, boolean z2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.CompareToWithContext(t2, t3, z2, eContext) : this.simp.CompareToWithContext(t2, t3, z2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Divide(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Divide(t2, t3, eContext) : this.simp.Divide(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToExponent(T t2, T t3, EInteger eInteger, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.DivideToExponent(t2, t3, eInteger, eContext) : this.simp.DivideToExponent(t2, t3, eInteger, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerNaturalScale(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.DivideToIntegerNaturalScale(t2, t3, eContext) : this.simp.DivideToIntegerNaturalScale(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerZeroScale(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.DivideToIntegerZeroScale(t2, t3, eContext) : this.simp.DivideToIntegerZeroScale(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Exp(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Exp(t2, eContext) : this.simp.Exp(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public IRadixMathHelper<T> GetHelper() {
        return this.ext.GetHelper();
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Ln(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Ln(t2, eContext) : this.simp.Ln(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Max(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Max(t2, t3, eContext) : this.simp.Max(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MaxMagnitude(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.MaxMagnitude(t2, t3, eContext) : this.simp.MaxMagnitude(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Min(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Min(t2, t3, eContext) : this.simp.Min(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MinMagnitude(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.MinMagnitude(t2, t3, eContext) : this.simp.MinMagnitude(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Multiply(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Multiply(t2, t3, eContext) : this.simp.Multiply(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MultiplyAndAdd(T t2, T t3, T t4, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.MultiplyAndAdd(t2, t3, t4, eContext) : this.simp.MultiplyAndAdd(t2, t3, t4, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Negate(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Negate(t2, eContext) : this.simp.Negate(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextMinus(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.NextMinus(t2, eContext) : this.simp.NextMinus(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextPlus(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.NextPlus(t2, eContext) : this.simp.NextPlus(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextToward(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.NextToward(t2, t3, eContext) : this.simp.NextToward(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Pi(EContext eContext) {
        return !eContext.isSimplified() ? this.ext.Pi(eContext) : this.simp.Pi(eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Plus(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Plus(t2, eContext) : this.simp.Plus(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Power(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Power(t2, t3, eContext) : this.simp.Power(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Quantize(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Quantize(t2, t3, eContext) : this.simp.Quantize(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Reduce(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Reduce(t2, eContext) : this.simp.Reduce(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Remainder(T t2, T t3, EContext eContext, boolean z2) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.Remainder(t2, t3, eContext, z2) : this.simp.Remainder(t2, t3, eContext, z2);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RemainderNear(T t2, T t3, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.RemainderNear(t2, t3, eContext) : this.simp.RemainderNear(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundAfterConversion(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.RoundAfterConversion(t2, eContext) : this.simp.RoundAfterConversion(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentExact(T t2, EInteger eInteger, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.RoundToExponentExact(t2, eInteger, eContext) : this.simp.RoundToExponentExact(t2, eInteger, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentNoRoundedFlag(T t2, EInteger eInteger, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.RoundToExponentNoRoundedFlag(t2, eInteger, eContext) : this.simp.RoundToExponentNoRoundedFlag(t2, eInteger, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentSimple(T t2, EInteger eInteger, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.RoundToExponentSimple(t2, eInteger, eContext) : this.simp.RoundToExponentSimple(t2, eInteger, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToPrecision(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.RoundToPrecision(t2, eContext) : this.simp.RoundToPrecision(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SignalOverflow(EContext eContext, boolean z2) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.SignalOverflow(eContext, z2) : this.simp.SignalOverflow(eContext, z2);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SquareRoot(T t2, EContext eContext) {
        return (eContext == null || !eContext.isSimplified()) ? this.ext.SquareRoot(t2, eContext) : this.simp.SquareRoot(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public int compareTo(T t2, T t3) {
        return this.ext.compareTo(t2, t3);
    }
}

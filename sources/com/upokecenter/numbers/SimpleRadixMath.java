package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class SimpleRadixMath<T> implements IRadixMath<T> {
    private final IRadixMath<T> wrapper;

    public SimpleRadixMath(IRadixMath<T> iRadixMath) {
        this.wrapper = iRadixMath;
    }

    private T CheckNotANumber1(T t2, EContext eContext) {
        return HandleNotANumber(t2, t2, eContext);
    }

    private T CheckNotANumber2(T t2, T t3, EContext eContext) {
        return HandleNotANumber(t2, t3, eContext);
    }

    private T CheckNotANumber3(T t2, T t3, T t4, EContext eContext) {
        int iGetFlags = GetHelper().GetFlags(t2);
        int iGetFlags2 = GetHelper().GetFlags(t3);
        int iGetFlags3 = GetHelper().GetFlags(t4);
        if ((iGetFlags + 8) - (8 | iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((-1) - (((-1) - iGetFlags2) | ((-1) - 8)) == 0 && (-1) - (((-1) - iGetFlags3) | ((-1) - 8)) == 0) {
            if ((iGetFlags + 4) - (iGetFlags | 4) != 0) {
                return ReturnQuietNaN(t2, eContext);
            }
            if ((iGetFlags2 & 4) == 0 && (-1) - (((-1) - iGetFlags3) | ((-1) - 4)) == 0) {
                return null;
            }
            return ReturnQuietNaN(t3, eContext);
        }
        return SignalingNaNInvalid(t3, eContext);
    }

    private static EContext GetContextWithFlags(EContext eContext) {
        return eContext == null ? eContext : eContext.WithBlankFlags();
    }

    private T HandleNotANumber(T t2, T t3, EContext eContext) {
        int iGetFlags = GetHelper().GetFlags(t2);
        int iGetFlags2 = GetHelper().GetFlags(t3);
        if ((iGetFlags + 8) - (8 | iGetFlags) != 0) {
            return SignalingNaNInvalid(t2, eContext);
        }
        if ((8 & iGetFlags2) != 0) {
            return SignalingNaNInvalid(t3, eContext);
        }
        if ((iGetFlags & 4) != 0) {
            return ReturnQuietNaN(t2, eContext);
        }
        if ((iGetFlags2 & 4) != 0) {
            return ReturnQuietNaN(t3, eContext);
        }
        return null;
    }

    private T PostProcess(T t2, EContext eContext, EContext eContext2) {
        return PostProcessEx(t2, eContext, eContext2, false, false);
    }

    private T PostProcessAfterDivision(T t2, EContext eContext, EContext eContext2) {
        return PostProcessEx(t2, eContext, eContext2, true, false);
    }

    private T PostProcessAfterQuantize(T t2, EContext eContext, EContext eContext2) {
        return PostProcessEx(t2, eContext, eContext2, false, true);
    }

    private T PostProcessEx(T t2, EContext eContext, EContext eContext2, boolean z2, boolean z3) {
        int iGetFlags = GetHelper().GetFlags(t2);
        if (eContext != null && eContext2 != null && eContext.getHasFlags()) {
            if (!eContext2.getClampNormalExponents()) {
                eContext2.setFlags((-1) - (((-1) - eContext2.getFlags()) | ((-1) - (-33))));
            }
            eContext.setFlags(eContext.getFlags() | eContext2.getFlags());
            int flags = eContext2.getFlags();
            if ((flags + 4) - (flags | 4) != 0) {
                int flags2 = eContext.getFlags();
                eContext.setFlags((flags2 + 15) - (flags2 & 15));
            }
        }
        if ((-1) - (((-1) - iGetFlags) | ((-1) - 14)) != 0) {
            return eContext.getFlags() == 0 ? SignalInvalid(eContext) : t2;
        }
        EInteger eIntegerAbs = GetHelper().GetMantissa(t2).Abs();
        if (eIntegerAbs.isZero()) {
            return z3 ? GetHelper().CreateNewWithFlags(eIntegerAbs, GetHelper().GetExponent(t2), 0) : this.wrapper.RoundToPrecision(GetHelper().ValueOf(0), eContext);
        }
        if (z3) {
            return t2;
        }
        EInteger eIntegerGetExponent = GetHelper().GetExponent(t2);
        if (eIntegerGetExponent.signum() <= 0) {
            if (!z2 || eIntegerGetExponent.signum() >= 0) {
                return t2;
            }
            FastInteger fastIntegerFromBig = FastInteger.FromBig(eIntegerGetExponent);
            return GetHelper().CreateNewWithFlags(NumberUtility.ReduceTrailingZeros(eIntegerAbs, fastIntegerFromBig, GetHelper().GetRadix(), null, null, new FastInteger(0)), fastIntegerFromBig.ToEInteger(), iGetFlags);
        }
        FastInteger fastIntegerFromBig2 = FastInteger.FromBig(eIntegerGetExponent);
        if (eContext == null || !eContext.getHasMaxPrecision()) {
            return GetHelper().CreateNewWithFlags(GetHelper().MultiplyByRadixPower(eIntegerAbs, fastIntegerFromBig2), EInteger.FromInt32(0), iGetFlags);
        }
        if (!eContext.ExponentWithinRange(eIntegerGetExponent)) {
            return t2;
        }
        FastInteger fastIntegerFromBig3 = FastInteger.FromBig(eContext.getPrecision());
        fastIntegerFromBig3.Subtract(GetHelper().GetDigitLength(eIntegerAbs));
        if (fastIntegerFromBig3.signum() > 0 && fastIntegerFromBig3.compareTo(fastIntegerFromBig2) >= 0) {
            return GetHelper().CreateNewWithFlags(GetHelper().MultiplyByRadixPower(eIntegerAbs, fastIntegerFromBig2), EInteger.FromInt32(0), iGetFlags);
        }
        if (z2) {
            return GetHelper().CreateNewWithFlags(NumberUtility.ReduceTrailingZeros(eIntegerAbs, fastIntegerFromBig2, GetHelper().GetRadix(), null, null, null), fastIntegerFromBig2.ToEInteger(), iGetFlags);
        }
        return t2;
    }

    private T PreRound(T t2, EContext eContext) {
        return (T) NumberUtility.PreRound(t2, eContext, this.wrapper);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private T ReturnQuietNaN(T r7, com.upokecenter.numbers.EContext r8) {
        /*
            r6 = this;
            com.upokecenter.numbers.IRadixMathHelper r0 = r6.GetHelper()
            com.upokecenter.numbers.EInteger r0 = r0.GetMantissa(r7)
            com.upokecenter.numbers.EInteger r3 = r0.Abs()
            boolean r0 = r3.isZero()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L49
            if (r8 == 0) goto L49
            boolean r0 = r8.getHasMaxPrecision()
            if (r0 == 0) goto L49
            com.upokecenter.numbers.IRadixMathHelper r2 = r6.GetHelper()
            com.upokecenter.numbers.EInteger r1 = com.upokecenter.numbers.EInteger.FromInt32(r5)
            com.upokecenter.numbers.EInteger r0 = r8.getPrecision()
            com.upokecenter.numbers.FastInteger r0 = com.upokecenter.numbers.FastInteger.FromBig(r0)
            com.upokecenter.numbers.EInteger r1 = r2.MultiplyByRadixPower(r1, r0)
            int r0 = r3.compareTo(r1)
            if (r0 < 0) goto L49
            com.upokecenter.numbers.EInteger r3 = r3.Remainder(r1)
        L3a:
            com.upokecenter.numbers.IRadixMathHelper r0 = r6.GetHelper()
            int r1 = r0.GetFlags(r7)
            if (r5 != 0) goto L4b
            r0 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L4b
            return r7
        L49:
            r5 = r4
            goto L3a
        L4b:
            r0 = 1
            r1 = r1 & r0
            r0 = 4
            int r2 = r1 + r0
            r1 = r1 & r0
            int r2 = r2 - r1
            com.upokecenter.numbers.IRadixMathHelper r1 = r6.GetHelper()
            com.upokecenter.numbers.EInteger r0 = com.upokecenter.numbers.EInteger.FromInt32(r4)
            java.lang.Object r0 = r1.CreateNewWithFlags(r3, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.SimpleRadixMath.ReturnQuietNaN(java.lang.Object, com.upokecenter.numbers.EContext):java.lang.Object");
    }

    private T SignalInvalid(EContext eContext) {
        if (GetHelper().GetArithmeticSupport() == 0) {
            throw new ArithmeticException("Invalid operation");
        }
        if (eContext != null && eContext.getHasFlags()) {
            eContext.setFlags((-1) - (((-1) - eContext.getFlags()) & ((-1) - 64)));
        }
        return GetHelper().CreateNewWithFlags(EInteger.FromInt32(0), EInteger.FromInt32(0), 4);
    }

    private T SignalingNaNInvalid(T t2, EContext eContext) {
        if (eContext != null && eContext.getHasFlags()) {
            int flags = eContext.getFlags();
            eContext.setFlags((flags + 64) - (flags & 64));
        }
        return ReturnQuietNaN(t2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Abs(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.Abs(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Add(T t2, T t3, EContext eContext) {
        T tAddEx;
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        T tPreRound = PreRound(t2, eContextGetContextWithFlags);
        T tPreRound2 = PreRound(t3, eContextGetContextWithFlags);
        boolean z2 = GetHelper().GetSign(tPreRound) == 0;
        boolean z3 = GetHelper().GetSign(tPreRound2) == 0;
        if (z2) {
            if (z3) {
                tPreRound2 = this.wrapper.RoundToPrecision(GetHelper().ValueOf(0), eContextGetContextWithFlags);
            }
            tAddEx = RoundToPrecision(tPreRound2, eContextGetContextWithFlags);
        } else {
            tAddEx = !z3 ? this.wrapper.AddEx(tPreRound, tPreRound2, eContextGetContextWithFlags, true) : RoundToPrecision(tPreRound, eContextGetContextWithFlags);
        }
        return PostProcess(tAddEx, eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T AddEx(T t2, T t3, EContext eContext, boolean z2) {
        return Add(t2, t3, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T CompareToWithContext(T t2, T t3, boolean z2, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        return this.wrapper.CompareToWithContext(PreRound(t2, eContext), PreRound(t3, eContext), z2, eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Divide(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterDivision(this.wrapper.Divide(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToExponent(T t2, T t3, EInteger eInteger, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterDivision(this.wrapper.DivideToExponent(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eInteger, eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerNaturalScale(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterDivision(this.wrapper.DivideToIntegerNaturalScale(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T DivideToIntegerZeroScale(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterDivision(this.wrapper.DivideToIntegerZeroScale(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Exp(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.Exp(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public IRadixMathHelper<T> GetHelper() {
        return this.wrapper.GetHelper();
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Ln(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.Ln(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Max(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        T tPreRound = PreRound(t2, eContextGetContextWithFlags);
        T tPreRound2 = PreRound(t3, eContextGetContextWithFlags);
        if (compareTo(tPreRound, tPreRound2) < 0) {
            tPreRound = tPreRound2;
        }
        return PostProcess(tPreRound, eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MaxMagnitude(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.MaxMagnitude(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Min(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        T tPreRound = PreRound(t2, eContextGetContextWithFlags);
        T tPreRound2 = PreRound(t3, eContextGetContextWithFlags);
        if (compareTo(tPreRound, tPreRound2) > 0) {
            tPreRound = tPreRound2;
        }
        return PostProcess(tPreRound, eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MinMagnitude(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.MinMagnitude(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Multiply(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.Multiply(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T MultiplyAndAdd(T t2, T t3, T t4, EContext eContext) {
        T tMultiplyAndAdd;
        T tCheckNotANumber3 = CheckNotANumber3(t2, t3, t4, eContext);
        if (tCheckNotANumber3 != null) {
            return tCheckNotANumber3;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        T tPreRound = PreRound(t2, eContextGetContextWithFlags);
        T tPreRound2 = PreRound(t3, eContextGetContextWithFlags);
        T tPreRound3 = PreRound(t4, eContextGetContextWithFlags);
        boolean z2 = GetHelper().GetSign(tPreRound) == 0 || GetHelper().GetSign(tPreRound2) == 0;
        boolean z3 = GetHelper().GetSign(tPreRound3) == 0;
        if (z2) {
            if (z3) {
                tPreRound3 = this.wrapper.RoundToPrecision(GetHelper().ValueOf(0), eContextGetContextWithFlags);
            }
            tMultiplyAndAdd = RoundToPrecision(tPreRound3, eContextGetContextWithFlags);
        } else {
            tMultiplyAndAdd = !z3 ? this.wrapper.MultiplyAndAdd(tPreRound, tPreRound2, tPreRound3, eContextGetContextWithFlags) : this.wrapper.Multiply(tPreRound, tPreRound2, eContextGetContextWithFlags);
        }
        return PostProcess(tMultiplyAndAdd, eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Negate(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.Negate(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextMinus(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.NextMinus(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextPlus(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.NextPlus(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T NextToward(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.NextToward(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Pi(EContext eContext) {
        return this.wrapper.Pi(eContext);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Plus(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.Plus(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Power(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        T tPreRound = PreRound(t2, eContextGetContextWithFlags);
        T tPreRound2 = PreRound(t3, eContextGetContextWithFlags);
        return PostProcessAfterDivision((GetHelper().GetSign(tPreRound2) == 0 && GetHelper().GetSign(tPreRound) == 0) ? this.wrapper.RoundToPrecision(GetHelper().ValueOf(1), eContextGetContextWithFlags) : this.wrapper.Power(tPreRound, tPreRound2, eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Quantize(T t2, T t3, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        T tPreRound = PreRound(t2, eContextGetContextWithFlags);
        T tPreRound2 = PreRound(t3, eContextGetContextWithFlags);
        EContext eContextWithBlankFlags = eContextGetContextWithFlags == null ? null : eContextGetContextWithFlags.WithBlankFlags();
        this.wrapper.RoundToPrecision(tPreRound2, eContextWithBlankFlags);
        if (eContextWithBlankFlags != null) {
            int flags = eContextWithBlankFlags.getFlags();
            if ((flags + 4) - (flags | 4) != 0) {
                return SignalInvalid(eContext);
            }
        }
        return PostProcessAfterQuantize(this.wrapper.Quantize(tPreRound, tPreRound2, eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T Reduce(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterQuantize(this.wrapper.Reduce(PreRound(t2, eContextGetContextWithFlags), eContext), eContext, eContextGetContextWithFlags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.upokecenter.numbers.IRadixMath
    public T Remainder(T t2, T t3, EContext eContext, boolean z2) {
        T t4 = (T) CheckNotANumber2(t2, t3, eContext);
        if (t4 != null) {
            return t4;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return (T) PostProcess(this.wrapper.Remainder((T) PreRound(t2, eContextGetContextWithFlags), (T) PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags, z2), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RemainderNear(T t2, T t3, EContext eContext) {
        T tCheckNotANumber2 = CheckNotANumber2(t2, t3, eContext);
        if (tCheckNotANumber2 != null) {
            return tCheckNotANumber2;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.RemainderNear(PreRound(t2, eContextGetContextWithFlags), PreRound(t3, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundAfterConversion(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        if (GetHelper().GetSign(t2) == 0) {
            return this.wrapper.RoundToPrecision(GetHelper().ValueOf(0), eContext);
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterQuantize(this.wrapper.RoundToPrecision(t2, eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentExact(T t2, EInteger eInteger, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterQuantize(this.wrapper.RoundToExponentExact(PreRound(t2, eContextGetContextWithFlags), eInteger, eContext), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentNoRoundedFlag(T t2, EInteger eInteger, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterQuantize(this.wrapper.RoundToExponentNoRoundedFlag(PreRound(t2, eContextGetContextWithFlags), eInteger, eContext), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToExponentSimple(T t2, EInteger eInteger, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcessAfterQuantize(this.wrapper.RoundToExponentSimple(PreRound(t2, eContextGetContextWithFlags), eInteger, eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T RoundToPrecision(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.RoundToPrecision(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SignalOverflow(EContext eContext, boolean z2) {
        return PostProcessAfterQuantize(this.wrapper.SignalOverflow(eContext, z2), eContext, GetContextWithFlags(eContext));
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public T SquareRoot(T t2, EContext eContext) {
        T tCheckNotANumber1 = CheckNotANumber1(t2, eContext);
        if (tCheckNotANumber1 != null) {
            return tCheckNotANumber1;
        }
        EContext eContextGetContextWithFlags = GetContextWithFlags(eContext);
        return PostProcess(this.wrapper.SquareRoot(PreRound(t2, eContextGetContextWithFlags), eContextGetContextWithFlags), eContext, eContextGetContextWithFlags);
    }

    @Override // com.upokecenter.numbers.IRadixMath
    public int compareTo(T t2, T t3) {
        return this.wrapper.compareTo(t2, t3);
    }
}

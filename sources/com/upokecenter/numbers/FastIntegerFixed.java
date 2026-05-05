package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class FastIntegerFixed implements Comparable<FastIntegerFixed> {
    private static final int CacheLast = 128;
    private final IntegerMode integerMode;
    private final EInteger largeValue;
    private final int smallValue;
    public static final FastIntegerFixed Zero = new FastIntegerFixed(IntegerMode.SmallValue, 0, null);
    public static final FastIntegerFixed One = new FastIntegerFixed(IntegerMode.SmallValue, 1, null);
    private static final int CacheFirst = -24;
    private static final FastIntegerFixed[] Cache = FastIntegerFixedCache(CacheFirst, 128);

    /* JADX INFO: renamed from: com.upokecenter.numbers.FastIntegerFixed$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode;

        static {
            int[] iArr = new int[IntegerMode.values().length];
            $SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode = iArr;
            try {
                iArr[IntegerMode.SmallValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[IntegerMode.LargeValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum IntegerMode {
        SmallValue(0),
        LargeValue(2);


        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f18286v;

        IntegerMode(int i2) {
            this.f18286v = i2;
        }
    }

    private FastIntegerFixed(IntegerMode integerMode, int i2, EInteger eInteger) {
        this.integerMode = integerMode;
        this.smallValue = i2;
        this.largeValue = eInteger;
    }

    public static FastIntegerFixed Add(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2) {
        if (fastIntegerFixed.integerMode == IntegerMode.SmallValue && fastIntegerFixed2.integerMode == IntegerMode.SmallValue) {
            int i2 = fastIntegerFixed.smallValue;
            if (i2 == 0) {
                return fastIntegerFixed2;
            }
            int i3 = fastIntegerFixed2.smallValue;
            if (i3 == 0) {
                return fastIntegerFixed;
            }
            if ((((-1) - (((-1) - i2) & ((-1) - i3))) >> 30) == 0) {
                return FromInt32(i2 + i3);
            }
            if ((i2 < 0 && i3 >= Integer.MIN_VALUE - i2) || (i2 > 0 && i3 <= Integer.MAX_VALUE - i2)) {
                return FromInt32(i2 + i3);
            }
        }
        return FromBig(fastIntegerFixed.ToEInteger().Add(fastIntegerFixed2.ToEInteger()));
    }

    private static FastIntegerFixed[] FastIntegerFixedCache(int i2, int i3) {
        FastIntegerFixed[] fastIntegerFixedArr = new FastIntegerFixed[(i3 - i2) + 1];
        for (int i4 = i2; i4 <= i3; i4++) {
            if (i4 == 0) {
                fastIntegerFixedArr[i4 - i2] = Zero;
            } else if (i4 == 1) {
                fastIntegerFixedArr[i4 - i2] = One;
            } else {
                fastIntegerFixedArr[i4 - i2] = new FastIntegerFixed(IntegerMode.SmallValue, i4, null);
            }
        }
        return fastIntegerFixedArr;
    }

    static FastIntegerFixed FromBig(EInteger eInteger) {
        return eInteger.CanFitInInt32() ? FromInt32(eInteger.ToInt32Unchecked()) : new FastIntegerFixed(IntegerMode.LargeValue, 0, eInteger);
    }

    public static FastIntegerFixed FromFastInteger(FastInteger fastInteger) {
        return fastInteger.CanFitInInt32() ? FromInt32(fastInteger.ToInt32()) : FromBig(fastInteger.ToEInteger());
    }

    static FastIntegerFixed FromInt32(int i2) {
        return (i2 < CacheFirst || i2 > 128) ? new FastIntegerFixed(IntegerMode.SmallValue, i2, null) : Cache[i2 - CacheFirst];
    }

    static FastIntegerFixed FromInt64(long j2) {
        return (j2 < -2147483648L || j2 > 2147483647L) ? new FastIntegerFixed(IntegerMode.LargeValue, 0, EInteger.FromInt64(j2)) : FromInt32((int) j2);
    }

    public static FastIntegerFixed Subtract(FastIntegerFixed fastIntegerFixed, FastIntegerFixed fastIntegerFixed2) {
        if (fastIntegerFixed.integerMode == IntegerMode.SmallValue && fastIntegerFixed2.integerMode == IntegerMode.SmallValue) {
            int i2 = fastIntegerFixed2.smallValue;
            if (i2 == 0) {
                return fastIntegerFixed;
            }
            if ((i2 < 0 && Integer.MAX_VALUE + i2 >= fastIntegerFixed.smallValue) || (i2 > 0 && Integer.MIN_VALUE + i2 <= fastIntegerFixed.smallValue)) {
                return FromInt32(fastIntegerFixed.smallValue - i2);
            }
        }
        return FromBig(fastIntegerFixed.ToEInteger().Subtract(fastIntegerFixed2.ToEInteger()));
    }

    public FastIntegerFixed Abs() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            int i3 = this.smallValue;
            return i3 == Integer.MIN_VALUE ? FromInt32(Integer.MAX_VALUE).Increment() : i3 < 0 ? FromInt32(-i3) : this;
        }
        if (i2 == 2) {
            return this.largeValue.signum() < 0 ? new FastIntegerFixed(IntegerMode.LargeValue, 0, this.largeValue.Abs()) : this;
        }
        throw new IllegalStateException();
    }

    public FastIntegerFixed Add(int i2) {
        if (this.integerMode == IntegerMode.SmallValue) {
            if (i2 == 0) {
                return this;
            }
            int i3 = this.smallValue;
            if (i3 == 0) {
                return FromInt32(i2);
            }
            if ((((-1) - (((-1) - i3) & ((-1) - i2))) >> 30) == 0) {
                return FromInt32(i3 + i2);
            }
            if ((i3 < 0 && i2 >= Integer.MIN_VALUE - i3) || (i3 > 0 && i2 <= Integer.MAX_VALUE - i3)) {
                return FromInt32(i3 + i2);
            }
        }
        return FromBig(ToEInteger().Add(i2));
    }

    public FastIntegerFixed Add(EInteger eInteger) {
        return (this.integerMode == IntegerMode.SmallValue && eInteger.CanFitInInt32()) ? Add(eInteger.ToInt32Unchecked()) : FromBig(ToEInteger().Add(eInteger));
    }

    public FastIntegerFixed Add(FastIntegerFixed fastIntegerFixed) {
        return Add(this, fastIntegerFixed);
    }

    boolean CanFitInInt32() {
        return this.integerMode == IntegerMode.SmallValue || this.largeValue.CanFitInInt32();
    }

    boolean CanFitInInt64() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return this.largeValue.CanFitInInt64();
        }
        throw new IllegalStateException();
    }

    int CompareToInt(int i2) {
        int i3 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return 0;
            }
            return this.largeValue.compareTo(EInteger.FromInt32(i2));
        }
        int i4 = this.smallValue;
        if (i2 == i4) {
            return 0;
        }
        return i4 < i2 ? -1 : 1;
    }

    int CompareToInt64(long j2) {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            return this.largeValue.compareTo(j2);
        }
        int i3 = this.smallValue;
        if (j2 == i3) {
            return 0;
        }
        return ((long) i3) < j2 ? -1 : 1;
    }

    FastIntegerFixed Copy() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return FromInt32(this.smallValue);
        }
        if (i2 == 2) {
            return FromBig(this.largeValue);
        }
        throw new IllegalStateException();
    }

    public FastIntegerFixed Increment() {
        int i2;
        return (this.integerMode != IntegerMode.SmallValue || (i2 = this.smallValue) == Integer.MAX_VALUE) ? Add(this, One) : FromInt32(i2 + 1);
    }

    public int Mod(int i2) {
        int i3;
        if (i2 >= 0) {
            return (this.integerMode != IntegerMode.SmallValue || (i3 = this.smallValue) < 0) ? ToEInteger().Remainder(EInteger.FromInt32(i2)).ToInt32Checked() : i3 % i2;
        }
        throw new UnsupportedOperationException();
    }

    public FastIntegerFixed Negate() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            int i3 = this.smallValue;
            return i3 == Integer.MIN_VALUE ? FromInt32(Integer.MAX_VALUE).Increment() : FromInt32(-i3);
        }
        if (i2 == 2) {
            return new FastIntegerFixed(IntegerMode.LargeValue, 0, this.largeValue.Negate());
        }
        throw new IllegalStateException();
    }

    public FastIntegerFixed Subtract(int i2) {
        return i2 == 0 ? this : (this.integerMode != IntegerMode.SmallValue || ((i2 >= 0 || Integer.MAX_VALUE + i2 < this.smallValue) && (i2 <= 0 || Integer.MIN_VALUE + i2 > this.smallValue))) ? FromBig(ToEInteger().Subtract(i2)) : FromInt32(this.smallValue - i2);
    }

    public FastIntegerFixed Subtract(EInteger eInteger) {
        return (this.integerMode == IntegerMode.SmallValue && eInteger.CanFitInInt32()) ? Subtract(eInteger.ToInt32Unchecked()) : FromBig(ToEInteger().Subtract(eInteger));
    }

    public FastIntegerFixed Subtract(FastIntegerFixed fastIntegerFixed) {
        return Subtract(this, fastIntegerFixed);
    }

    EInteger ToEInteger() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return EInteger.FromInt32(this.smallValue);
        }
        if (i2 == 2) {
            return this.largeValue;
        }
        throw new IllegalStateException();
    }

    public FastInteger ToFastInteger() {
        return this.integerMode == IntegerMode.SmallValue ? new FastInteger(this.smallValue) : FastInteger.FromBig(this.largeValue);
    }

    int ToInt32() {
        return this.integerMode == IntegerMode.SmallValue ? this.smallValue : this.largeValue.ToInt32Unchecked();
    }

    long ToInt64() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return this.smallValue;
        }
        if (i2 == 2) {
            return this.largeValue.ToInt64Unchecked();
        }
        throw new IllegalStateException();
    }

    public int compareTo(EInteger eInteger) {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return -eInteger.compareTo(this.smallValue);
        }
        if (i2 == 2) {
            return this.largeValue.compareTo(eInteger);
        }
        throw new IllegalStateException();
    }

    public int compareTo(FastInteger fastInteger) {
        int iCompareToInt;
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            iCompareToInt = fastInteger.CompareToInt(this.smallValue);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            iCompareToInt = fastInteger.compareTo(this.largeValue);
        }
        return -iCompareToInt;
    }

    @Override // java.lang.Comparable
    public int compareTo(FastIntegerFixed fastIntegerFixed) {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            int i3 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[fastIntegerFixed.integerMode.ordinal()];
            if (i3 == 1) {
                int i4 = fastIntegerFixed.smallValue;
                int i5 = this.smallValue;
                if (i5 == i4) {
                    return 0;
                }
                return i5 < i4 ? -1 : 1;
            }
            if (i3 == 2) {
                return -fastIntegerFixed.largeValue.compareTo(this.smallValue);
            }
        } else if (i2 == 2) {
            return this.largeValue.compareTo(fastIntegerFixed.ToEInteger());
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        FastIntegerFixed fastIntegerFixed = obj instanceof FastIntegerFixed ? (FastIntegerFixed) obj : null;
        if (fastIntegerFixed == null || this.integerMode != fastIntegerFixed.integerMode) {
            return false;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return this.smallValue == fastIntegerFixed.smallValue;
        }
        if (i2 != 2) {
            return true;
        }
        return this.largeValue.equals(fastIntegerFixed.largeValue);
    }

    public int hashCode() {
        int i2;
        int iHashCode;
        int iHashCode2 = this.integerMode.hashCode();
        int i3 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i3 == 1) {
            i2 = iHashCode2 * 31;
            iHashCode = this.smallValue;
        } else {
            if (i3 != 2) {
                return iHashCode2;
            }
            i2 = iHashCode2 * 31;
            iHashCode = this.largeValue.hashCode();
        }
        return i2 + iHashCode;
    }

    final boolean isEvenNumber() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            int i3 = this.smallValue;
            return (i3 + 1) - (i3 | 1) == 0;
        }
        if (i2 == 2) {
            return this.largeValue.isEven();
        }
        throw new IllegalStateException();
    }

    final boolean isValueZero() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 == 1) {
            return this.smallValue == 0;
        }
        if (i2 != 2) {
            return false;
        }
        return this.largeValue.isZero();
    }

    final int signum() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            return this.largeValue.signum();
        }
        int i3 = this.smallValue;
        if (i3 == 0) {
            return 0;
        }
        return i3 < 0 ? -1 : 1;
    }

    public String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$numbers$FastIntegerFixed$IntegerMode[this.integerMode.ordinal()];
        return i2 != 1 ? i2 != 2 ? "" : this.largeValue.toString() : FastInteger.IntToString(this.smallValue);
    }
}

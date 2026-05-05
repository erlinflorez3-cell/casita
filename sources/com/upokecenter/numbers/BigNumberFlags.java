package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class BigNumberFlags {
    static final int FiniteAndNonFinite = 1;
    static final int FiniteOnly = 0;
    static final int FlagInfinity = 2;
    static final int FlagNaN = 12;
    static final int FlagNegative = 1;
    static final int FlagQuietNaN = 4;
    static final int FlagSignalingNaN = 8;
    static final int FlagSpecial = 14;
    static final int LostDigitsFlags = 259;

    private BigNumberFlags() {
    }
}

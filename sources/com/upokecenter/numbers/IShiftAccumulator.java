package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
interface IShiftAccumulator {
    FastInteger GetDigitLength();

    FastInteger OverestimateDigitLength();

    void ShiftRightInt(int i2);

    void ShiftToDigits(FastInteger fastInteger, FastInteger fastInteger2, boolean z2);

    int ShiftedIntMod(int i2);

    void TruncateOrShiftRight(FastInteger fastInteger, boolean z2);

    FastInteger getDiscardedDigitCount();

    int getLastDiscardedDigit();

    int getOlderDiscardedDigits();

    EInteger getShiftedInt();

    FastInteger getShiftedIntFast();
}

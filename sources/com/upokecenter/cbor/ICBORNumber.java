package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
interface ICBORNumber {
    Object Abs(Object obj);

    double AsDouble(Object obj);

    EDecimal AsEDecimal(Object obj);

    EFloat AsEFloat(Object obj);

    EInteger AsEInteger(Object obj);

    ERational AsERational(Object obj);

    int AsInt32(Object obj, int i2, int i3);

    long AsInt64(Object obj);

    float AsSingle(Object obj);

    boolean CanFitInDouble(Object obj);

    boolean CanFitInInt32(Object obj);

    boolean CanFitInInt64(Object obj);

    boolean CanFitInSingle(Object obj);

    boolean CanFitInUInt64(Object obj);

    boolean CanTruncatedIntFitInInt32(Object obj);

    boolean CanTruncatedIntFitInInt64(Object obj);

    boolean CanTruncatedIntFitInUInt64(Object obj);

    boolean IsInfinity(Object obj);

    boolean IsIntegral(Object obj);

    boolean IsNaN(Object obj);

    boolean IsNegative(Object obj);

    boolean IsNegativeInfinity(Object obj);

    boolean IsNumberZero(Object obj);

    boolean IsPositiveInfinity(Object obj);

    Object Negate(Object obj);

    int Sign(Object obj);
}

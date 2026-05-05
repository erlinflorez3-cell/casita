package com.upokecenter.cbor;

import com.upokecenter.numbers.EContext;
import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;

/* JADX INFO: loaded from: classes5.dex */
public final class CBORNumber implements Comparable<CBORNumber> {
    private static final ICBORNumber[] NumberInterfaces = {new CBORInteger(), new CBORDoubleBits(), new CBOREInteger(), new CBORExtendedDecimal(), new CBORExtendedFloat(), new CBORExtendedRational()};
    private final NumberKind kind;
    private final Object value;

    public enum NumberKind {
        Integer,
        Double,
        EInteger,
        EDecimal,
        EFloat,
        ERational
    }

    CBORNumber(NumberKind numberKind, Object obj) {
        this.kind = numberKind;
        this.value = obj;
    }

    private static CBORNumber BigFracToNumber(CBORObject cBORObject, int i2) {
        if (cBORObject.getType() != CBORType.Array) {
            return null;
        }
        if (i2 == 268 || i2 == 269) {
            if (cBORObject.size() != 3 || !IsUntaggedInteger(cBORObject.get(2))) {
                return null;
            }
        } else if (cBORObject.size() != 2) {
            return null;
        }
        if (i2 == 4 || i2 == 5) {
            if (!IsUntaggedInteger(cBORObject.get(0))) {
                return null;
            }
        } else if (!IsUntaggedIntegerOrBignum(cBORObject.get(0))) {
            return null;
        }
        if (!IsUntaggedIntegerOrBignum(cBORObject.get(1))) {
            return null;
        }
        EInteger eIntegerIntegerOrBignum = IntegerOrBignum(cBORObject.get(0));
        EInteger eIntegerIntegerOrBignum2 = IntegerOrBignum(cBORObject.get(1));
        boolean z2 = i2 == 4 || i2 == 264 || i2 == 268;
        EDecimal eDecimalCreate = z2 ? EDecimal.Create(eIntegerIntegerOrBignum2, eIntegerIntegerOrBignum) : null;
        EFloat eFloatCreate = !z2 ? EFloat.Create(eIntegerIntegerOrBignum2, eIntegerIntegerOrBignum) : null;
        if (i2 == 268 || i2 == 269) {
            if (eIntegerIntegerOrBignum2.signum() < 0 || !cBORObject.get(2).CanValueFitInInt32()) {
                return null;
            }
            int iAsInt32Value = cBORObject.get(2).AsInt32Value();
            switch (iAsInt32Value) {
                case 0:
                    break;
                case 1:
                    if (!z2) {
                        eFloatCreate = eFloatCreate.Negate();
                    } else {
                        eDecimalCreate = eDecimalCreate.Negate();
                    }
                    break;
                case 2:
                    if (!eIntegerIntegerOrBignum.isZero() || !eIntegerIntegerOrBignum2.isZero()) {
                        return null;
                    }
                    if (!z2) {
                        eFloatCreate = EFloat.PositiveInfinity;
                    } else {
                        eDecimalCreate = EDecimal.PositiveInfinity;
                    }
                    break;
                    break;
                case 3:
                    if (!eIntegerIntegerOrBignum.isZero() || !eIntegerIntegerOrBignum2.isZero()) {
                        return null;
                    }
                    if (!z2) {
                        eFloatCreate = EFloat.NegativeInfinity;
                    } else {
                        eDecimalCreate = EDecimal.NegativeInfinity;
                    }
                    break;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    if (!eIntegerIntegerOrBignum.isZero()) {
                        return null;
                    }
                    if (!z2) {
                        eFloatCreate = EFloat.CreateNaN(eIntegerIntegerOrBignum2, iAsInt32Value >= 6, iAsInt32Value == 5 || iAsInt32Value == 7, null);
                    } else {
                        eDecimalCreate = EDecimal.CreateNaN(eIntegerIntegerOrBignum2, iAsInt32Value >= 6, iAsInt32Value == 5 || iAsInt32Value == 7, null);
                    }
                    break;
                    break;
                default:
                    return null;
            }
        }
        return z2 ? FromObject(eDecimalCreate) : FromObject(eFloatCreate);
    }

    private static CBORNumber BignumToNumber(CBORObject cBORObject) {
        EInteger eIntegerFromBytes;
        if (cBORObject.getType() != CBORType.ByteString) {
            return null;
        }
        boolean zHasMostInnerTag = cBORObject.HasMostInnerTag(3);
        byte[] bArrGetByteString = cBORObject.GetByteString();
        if (bArrGetByteString.length <= 7) {
            long j2 = 0;
            for (byte b2 : bArrGetByteString) {
                j2 = (j2 << 8) | (((long) b2) & 255);
            }
            if (zHasMostInnerTag) {
                j2 = (-j2) - 1;
            }
            return new CBORNumber(NumberKind.Integer, Long.valueOf(j2));
        }
        int length = bArrGetByteString.length;
        boolean z2 = true;
        if (((bArrGetByteString[0] >> 7) & 1) != 0) {
            length++;
        } else {
            z2 = false;
        }
        if (z2 || zHasMostInnerTag) {
            byte[] bArr = new byte[length];
            System.arraycopy(bArrGetByteString, 0, bArr, length - bArrGetByteString.length, bArrGetByteString.length);
            if (zHasMostInnerTag) {
                for (int length2 = length - bArrGetByteString.length; length2 < length; length2++) {
                    bArr[length2] = (byte) (~bArr[length2]);
                }
            }
            if (z2) {
                bArr[0] = zHasMostInnerTag ? (byte) -1 : (byte) 0;
            }
            eIntegerFromBytes = EInteger.FromBytes(bArr, false);
        } else {
            eIntegerFromBytes = EInteger.FromBytes(bArrGetByteString, false);
        }
        return eIntegerFromBytes.CanFitInInt64() ? new CBORNumber(NumberKind.Integer, Long.valueOf(eIntegerFromBytes.ToInt64Checked())) : new CBORNumber(NumberKind.EInteger, eIntegerFromBytes);
    }

    private static boolean CheckBigFracToNumber(CBORObject cBORObject, int i2) {
        if (cBORObject.getType() != CBORType.Array) {
            return false;
        }
        if (i2 == 268 || i2 == 269) {
            if (cBORObject.size() != 3 || !IsUntaggedInteger(cBORObject.get(2))) {
                return false;
            }
        } else if (cBORObject.size() != 2) {
            return false;
        }
        if (i2 == 4 || i2 == 5) {
            if (!IsUntaggedInteger(cBORObject.get(0))) {
                return false;
            }
        } else if (!IsUntaggedIntegerOrBignum(cBORObject.get(0))) {
            return false;
        }
        if (!IsUntaggedIntegerOrBignum(cBORObject.get(1))) {
            return false;
        }
        if (i2 != 268 && i2 != 269) {
            return true;
        }
        EInteger eIntegerIntegerOrBignum = IntegerOrBignum(cBORObject.get(0));
        EInteger eIntegerIntegerOrBignum2 = IntegerOrBignum(cBORObject.get(1));
        if (eIntegerIntegerOrBignum2.signum() < 0 || !cBORObject.get(2).CanValueFitInInt32()) {
            return false;
        }
        switch (cBORObject.get(2).AsInt32Value()) {
            case 2:
            case 3:
                if (eIntegerIntegerOrBignum.isZero() && eIntegerIntegerOrBignum2.isZero()) {
                    break;
                }
                break;
        }
        return false;
    }

    private static EDecimal CheckOverflow(EDecimal eDecimal, EDecimal eDecimal2, EDecimal eDecimal3) {
        if (eDecimal.isFinite() && eDecimal2.isFinite() && eDecimal3.IsNaN()) {
            throw new OutOfMemoryError("Result might be too big to fit in memory");
        }
        return eDecimal3;
    }

    private static EFloat CheckOverflow(EFloat eFloat, EFloat eFloat2, EFloat eFloat3) {
        if (eFloat.isFinite() && eFloat2.isFinite() && eFloat3.IsNaN()) {
            throw new OutOfMemoryError("Result might be too big to fit in memory");
        }
        return eFloat3;
    }

    private static ERational CheckOverflow(ERational eRational, ERational eRational2, ERational eRational3) {
        if (eRational.isFinite() && eRational2.isFinite() && eRational3.IsNaN()) {
            throw new OutOfMemoryError("Result might be too big to fit in memory");
        }
        return eRational3;
    }

    private static boolean CheckRationalToNumber(CBORObject cBORObject, int i2) {
        if (cBORObject.getType() != CBORType.Array) {
            return false;
        }
        if (i2 == 270) {
            if (cBORObject.size() != 3 || !IsUntaggedInteger(cBORObject.get(2))) {
                return false;
            }
        } else if (cBORObject.size() != 2) {
            return false;
        }
        if (!IsUntaggedIntegerOrBignum(cBORObject.get(0)) || !IsUntaggedIntegerOrBignum(cBORObject.get(1))) {
            return false;
        }
        EInteger eIntegerIntegerOrBignum = IntegerOrBignum(cBORObject.get(1));
        if (eIntegerIntegerOrBignum.signum() <= 0) {
            return false;
        }
        if (i2 != 270) {
            return true;
        }
        EInteger eIntegerIntegerOrBignum2 = IntegerOrBignum(cBORObject.get(0));
        if (eIntegerIntegerOrBignum2.signum() < 0 || !cBORObject.get(2).CanValueFitInInt32()) {
            return false;
        }
        switch (cBORObject.get(2).AsInt32Value()) {
            case 2:
            case 3:
                if (eIntegerIntegerOrBignum2.isZero() && eIntegerIntegerOrBignum.compareTo(1) == 0) {
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                if (eIntegerIntegerOrBignum.compareTo(1) == 0) {
                }
                break;
        }
        return false;
    }

    public static CBORNumber FromByte(byte b2) {
        return FromObject((-1) - (((-1) - b2) | ((-1) - 255)));
    }

    public static CBORNumber FromCBORObject(CBORObject cBORObject) {
        if (cBORObject == null) {
            return null;
        }
        if (IsUntaggedInteger(cBORObject)) {
            return cBORObject.CanValueFitInInt64() ? new CBORNumber(NumberKind.Integer, Long.valueOf(cBORObject.AsInt64Value())) : new CBORNumber(NumberKind.EInteger, cBORObject.AsEIntegerValue());
        }
        if (!cBORObject.isTagged() && cBORObject.getType() == CBORType.FloatingPoint) {
            return FromDoubleBits(cBORObject.AsDoubleBits());
        }
        if (cBORObject.HasOneTag(2) || cBORObject.HasOneTag(3)) {
            return BignumToNumber(cBORObject);
        }
        if (cBORObject.HasOneTag(4) || cBORObject.HasOneTag(5) || cBORObject.HasOneTag(264) || cBORObject.HasOneTag(265) || cBORObject.HasOneTag(268) || cBORObject.HasOneTag(269)) {
            return BigFracToNumber(cBORObject, cBORObject.getMostOuterTag().ToInt32Checked());
        }
        if (cBORObject.HasOneTag(30) || cBORObject.HasOneTag(270)) {
            return RationalToNumber(cBORObject, cBORObject.getMostOuterTag().ToInt32Checked());
        }
        return null;
    }

    static CBORNumber FromDoubleBits(long j2) {
        return new CBORNumber(NumberKind.Double, Long.valueOf(j2));
    }

    public static CBORNumber FromInt16(short s2) {
        return FromObject(s2);
    }

    static CBORNumber FromObject(int i2) {
        return new CBORNumber(NumberKind.Integer, Long.valueOf(i2));
    }

    static CBORNumber FromObject(long j2) {
        return new CBORNumber(NumberKind.Integer, Long.valueOf(j2));
    }

    static CBORNumber FromObject(EDecimal eDecimal) {
        return new CBORNumber(NumberKind.EDecimal, eDecimal);
    }

    static CBORNumber FromObject(EFloat eFloat) {
        return new CBORNumber(NumberKind.EFloat, eFloat);
    }

    static CBORNumber FromObject(EInteger eInteger) {
        return new CBORNumber(NumberKind.EInteger, eInteger);
    }

    static CBORNumber FromObject(ERational eRational) {
        return new CBORNumber(NumberKind.ERational, eRational);
    }

    private static NumberKind GetConvertKind(CBORNumber cBORNumber, CBORNumber cBORNumber2) {
        NumberKind numberKind = cBORNumber.kind;
        NumberKind numberKind2 = cBORNumber2.kind;
        NumberKind numberKind3 = NumberKind.EInteger;
        if (cBORNumber.IsFinite()) {
            if (cBORNumber2.IsFinite()) {
                return (numberKind == NumberKind.ERational || numberKind2 == NumberKind.ERational) ? NumberKind.ERational : (numberKind == NumberKind.EDecimal || numberKind2 == NumberKind.EDecimal) ? NumberKind.EDecimal : (numberKind == NumberKind.EFloat || numberKind2 == NumberKind.EFloat || numberKind == NumberKind.Double || numberKind2 == NumberKind.Double) ? NumberKind.EFloat : NumberKind.EInteger;
            }
            if (numberKind != NumberKind.Integer && numberKind != NumberKind.EInteger) {
                return numberKind == NumberKind.Double ? NumberKind.EFloat : numberKind;
            }
            if (numberKind2 == NumberKind.Double) {
                return NumberKind.EFloat;
            }
        } else {
            if (numberKind2 == NumberKind.Integer || numberKind2 == NumberKind.EInteger) {
                return numberKind == NumberKind.Double ? NumberKind.EFloat : numberKind;
            }
            if (numberKind2 == NumberKind.Double) {
                return NumberKind.EFloat;
            }
        }
        return numberKind2;
    }

    static ICBORNumber GetNumberInterface(NumberKind numberKind) {
        int iOrdinal = numberKind.ordinal();
        if (iOrdinal == 0) {
            return NumberInterfaces[0];
        }
        if (iOrdinal == 1) {
            return NumberInterfaces[1];
        }
        if (iOrdinal == 2) {
            return NumberInterfaces[2];
        }
        if (iOrdinal == 3) {
            return NumberInterfaces[3];
        }
        if (iOrdinal == 4) {
            return NumberInterfaces[4];
        }
        if (iOrdinal == 5) {
            return NumberInterfaces[5];
        }
        throw new IllegalStateException();
    }

    static ICBORNumber GetNumberInterface(CBORObject cBORObject) {
        CBORNumber cBORNumberFromCBORObject = FromCBORObject(cBORObject);
        if (cBORNumberFromCBORObject == null) {
            return null;
        }
        return cBORNumberFromCBORObject.GetNumberInterface();
    }

    private static EInteger IntegerOrBignum(CBORObject cBORObject) {
        if (IsUntaggedInteger(cBORObject)) {
            return cBORObject.AsEIntegerValue();
        }
        CBORNumber cBORNumberBignumToNumber = BignumToNumber(cBORObject);
        return cBORNumberBignumToNumber.GetNumberInterface().AsEInteger(cBORNumberBignumToNumber.GetValue());
    }

    static boolean IsNumber(CBORObject cBORObject) {
        if (IsUntaggedInteger(cBORObject)) {
            return true;
        }
        if (!cBORObject.isTagged() && cBORObject.getType() == CBORType.FloatingPoint) {
            return true;
        }
        if (cBORObject.HasOneTag(2) || cBORObject.HasOneTag(3)) {
            return cBORObject.getType() == CBORType.ByteString;
        }
        if (cBORObject.HasOneTag(4) || cBORObject.HasOneTag(5) || cBORObject.HasOneTag(264) || cBORObject.HasOneTag(265) || cBORObject.HasOneTag(268) || cBORObject.HasOneTag(269)) {
            return CheckBigFracToNumber(cBORObject, cBORObject.getMostOuterTag().ToInt32Checked());
        }
        if (cBORObject.HasOneTag(30) || cBORObject.HasOneTag(270)) {
            return CheckRationalToNumber(cBORObject, cBORObject.getMostOuterTag().ToInt32Checked());
        }
        return false;
    }

    private static boolean IsUntaggedInteger(CBORObject cBORObject) {
        return !cBORObject.isTagged() && cBORObject.getType() == CBORType.Integer;
    }

    private static boolean IsUntaggedIntegerOrBignum(CBORObject cBORObject) {
        return IsUntaggedInteger(cBORObject) || ((cBORObject.HasOneTag(2) || cBORObject.HasOneTag(3)) && cBORObject.getType() == CBORType.ByteString);
    }

    private static CBORNumber RationalToNumber(CBORObject cBORObject, int i2) {
        if (cBORObject.getType() != CBORType.Array) {
            return null;
        }
        if (i2 == 270) {
            if (cBORObject.size() != 3 || !IsUntaggedInteger(cBORObject.get(2))) {
                return null;
            }
        } else if (cBORObject.size() != 2) {
            return null;
        }
        if (!IsUntaggedIntegerOrBignum(cBORObject.get(0)) || !IsUntaggedIntegerOrBignum(cBORObject.get(1))) {
            return null;
        }
        EInteger eIntegerIntegerOrBignum = IntegerOrBignum(cBORObject.get(0));
        EInteger eIntegerIntegerOrBignum2 = IntegerOrBignum(cBORObject.get(1));
        if (eIntegerIntegerOrBignum2.signum() <= 0) {
            return null;
        }
        ERational eRationalCreate = ERational.Create(eIntegerIntegerOrBignum, eIntegerIntegerOrBignum2);
        if (i2 == 270) {
            if (eIntegerIntegerOrBignum.signum() < 0 || !cBORObject.get(2).CanValueFitInInt32()) {
                return null;
            }
            int iAsInt32Value = cBORObject.get(2).AsInt32Value();
            switch (iAsInt32Value) {
                case 0:
                    break;
                case 1:
                    eRationalCreate = eRationalCreate.Negate();
                    break;
                case 2:
                    if (!eIntegerIntegerOrBignum.isZero() || eIntegerIntegerOrBignum2.compareTo(1) != 0) {
                        return null;
                    }
                    eRationalCreate = ERational.PositiveInfinity;
                    break;
                    break;
                case 3:
                    if (!eIntegerIntegerOrBignum.isZero() || eIntegerIntegerOrBignum2.compareTo(1) != 0) {
                        return null;
                    }
                    eRationalCreate = ERational.NegativeInfinity;
                    break;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    if (eIntegerIntegerOrBignum2.compareTo(1) != 0) {
                        return null;
                    }
                    eRationalCreate = ERational.CreateNaN(eIntegerIntegerOrBignum, iAsInt32Value >= 6, iAsInt32Value == 5 || iAsInt32Value == 7);
                    break;
                default:
                    return null;
            }
        }
        return FromObject(eRationalCreate);
    }

    public CBORNumber Abs() {
        int iOrdinal = this.kind.ordinal();
        if (iOrdinal == 0) {
            long jLongValue = ((Long) this.value).longValue();
            return jLongValue == Long.MIN_VALUE ? FromObject(EInteger.FromInt64(jLongValue).Negate()) : jLongValue >= 0 ? this : new CBORNumber(this.kind, Long.valueOf(Math.abs(jLongValue)));
        }
        if (iOrdinal != 2) {
            return new CBORNumber(this.kind, GetNumberInterface().Abs(GetValue()));
        }
        EInteger eInteger = (EInteger) this.value;
        return eInteger.signum() >= 0 ? this : FromObject(eInteger.Abs());
    }

    public CBORNumber Add(CBORNumber cBORNumber) {
        if (cBORNumber == null) {
            throw new NullPointerException("b");
        }
        Object obj = this.value;
        Object obj2 = cBORNumber.value;
        NumberKind numberKind = this.kind;
        NumberKind numberKind2 = cBORNumber.kind;
        if (numberKind == NumberKind.Integer && numberKind2 == NumberKind.Integer) {
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            return ((jLongValue >= 0 || jLongValue2 >= Long.MIN_VALUE - jLongValue) && (jLongValue <= 0 || jLongValue2 <= Long.MAX_VALUE - jLongValue)) ? new CBORNumber(NumberKind.Integer, Long.valueOf(jLongValue + jLongValue2)) : FromObject(EInteger.FromInt64(jLongValue).Add(EInteger.FromInt64(jLongValue2)));
        }
        NumberKind numberKindGetConvertKind = GetConvertKind(this, cBORNumber);
        if (numberKindGetConvertKind == NumberKind.ERational) {
            ERational eRationalAsERational = GetNumberInterface(numberKind).AsERational(obj);
            ERational eRationalAsERational2 = GetNumberInterface(numberKind2).AsERational(obj2);
            return new CBORNumber(NumberKind.ERational, CheckOverflow(eRationalAsERational, eRationalAsERational2, eRationalAsERational.Add(eRationalAsERational2)));
        }
        if (numberKindGetConvertKind == NumberKind.EDecimal) {
            EDecimal eDecimalAsEDecimal = GetNumberInterface(numberKind).AsEDecimal(obj);
            EDecimal eDecimalAsEDecimal2 = GetNumberInterface(numberKind2).AsEDecimal(obj2);
            return new CBORNumber(NumberKind.EDecimal, CheckOverflow(eDecimalAsEDecimal, eDecimalAsEDecimal2, eDecimalAsEDecimal.Add(eDecimalAsEDecimal2)));
        }
        if (numberKindGetConvertKind != NumberKind.EFloat) {
            return new CBORNumber(NumberKind.EInteger, GetNumberInterface(numberKind).AsEInteger(obj).Add(GetNumberInterface(numberKind2).AsEInteger(obj2)));
        }
        EFloat eFloatAsEFloat = GetNumberInterface(numberKind).AsEFloat(obj);
        EFloat eFloatAsEFloat2 = GetNumberInterface(numberKind2).AsEFloat(obj2);
        return new CBORNumber(NumberKind.EFloat, CheckOverflow(eFloatAsEFloat, eFloatAsEFloat2, eFloatAsEFloat.Add(eFloatAsEFloat2)));
    }

    public boolean CanFitInDouble() {
        return GetNumberInterface().CanFitInDouble(GetValue());
    }

    public boolean CanFitInInt32() {
        ICBORNumber iCBORNumberGetNumberInterface = GetNumberInterface();
        Object objGetValue = GetValue();
        if (!iCBORNumberGetNumberInterface.CanFitInInt64(objGetValue)) {
            return false;
        }
        long jAsInt64 = iCBORNumberGetNumberInterface.AsInt64(objGetValue);
        return jAsInt64 >= -2147483648L && jAsInt64 <= 2147483647L;
    }

    public boolean CanFitInInt64() {
        return GetNumberInterface().CanFitInInt64(GetValue());
    }

    public boolean CanFitInSingle() {
        return GetNumberInterface().CanFitInSingle(GetValue());
    }

    public boolean CanFitInUInt64() {
        return GetNumberInterface().CanFitInUInt64(GetValue());
    }

    public boolean CanTruncatedIntFitInInt32() {
        return GetNumberInterface().CanTruncatedIntFitInInt32(GetValue());
    }

    public boolean CanTruncatedIntFitInInt64() {
        if (this.kind.ordinal() != 0) {
            return GetNumberInterface().CanTruncatedIntFitInInt64(GetValue());
        }
        return true;
    }

    public boolean CanTruncatedIntFitInUInt64() {
        return GetNumberInterface().CanTruncatedIntFitInUInt64(GetValue());
    }

    public CBORNumber Divide(CBORNumber cBORNumber) {
        if (cBORNumber == null) {
            throw new NullPointerException("b");
        }
        Object obj = this.value;
        Object obj2 = cBORNumber.value;
        NumberKind numberKind = this.kind;
        NumberKind numberKind2 = cBORNumber.kind;
        if (numberKind == NumberKind.Integer && numberKind2 == NumberKind.Integer) {
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            if (jLongValue2 == 0) {
                return jLongValue == 0 ? FromObject(EDecimal.NaN) : jLongValue < 0 ? FromObject(EDecimal.NegativeInfinity) : FromObject(EDecimal.PositiveInfinity);
            }
            if (jLongValue == Long.MIN_VALUE && jLongValue2 == -1) {
                return new CBORNumber(NumberKind.Integer, Long.valueOf(jLongValue)).Negate();
            }
            long j2 = jLongValue / jLongValue2;
            return jLongValue - (j2 * jLongValue2) == 0 ? new CBORNumber(NumberKind.Integer, Long.valueOf(j2)) : new CBORNumber(NumberKind.ERational, ERational.Create(EInteger.FromInt64(jLongValue), EInteger.FromInt64(jLongValue2)));
        }
        NumberKind numberKindGetConvertKind = GetConvertKind(this, cBORNumber);
        if (numberKindGetConvertKind == NumberKind.ERational) {
            ERational eRationalAsERational = GetNumberInterface(numberKind).AsERational(obj);
            ERational eRationalAsERational2 = GetNumberInterface(numberKind2).AsERational(obj2);
            return new CBORNumber(NumberKind.ERational, CheckOverflow(eRationalAsERational, eRationalAsERational2, eRationalAsERational.Divide(eRationalAsERational2)));
        }
        if (numberKindGetConvertKind == NumberKind.EDecimal) {
            EDecimal eDecimalAsEDecimal = GetNumberInterface(numberKind).AsEDecimal(obj);
            EDecimal eDecimalAsEDecimal2 = GetNumberInterface(numberKind2).AsEDecimal(obj2);
            if (eDecimalAsEDecimal.isZero() && eDecimalAsEDecimal2.isZero()) {
                return new CBORNumber(NumberKind.EDecimal, EDecimal.NaN);
            }
            EDecimal eDecimalDivide = eDecimalAsEDecimal.Divide(eDecimalAsEDecimal2, null);
            if (!eDecimalAsEDecimal.isFinite() || !eDecimalAsEDecimal2.isFinite() || eDecimalDivide.isFinite()) {
                return new CBORNumber(NumberKind.EDecimal, eDecimalDivide);
            }
            ERational eRationalAsERational3 = GetNumberInterface(numberKind).AsERational(obj);
            ERational eRationalAsERational4 = GetNumberInterface(numberKind2).AsERational(obj2);
            return new CBORNumber(NumberKind.ERational, CheckOverflow(eRationalAsERational3, eRationalAsERational4, eRationalAsERational3.Divide(eRationalAsERational4)));
        }
        if (numberKindGetConvertKind != NumberKind.EFloat) {
            EInteger eIntegerAsEInteger = GetNumberInterface(numberKind).AsEInteger(obj);
            EInteger eIntegerAsEInteger2 = GetNumberInterface(numberKind2).AsEInteger(obj2);
            if (eIntegerAsEInteger2.isZero()) {
                return eIntegerAsEInteger.isZero() ? FromObject(EDecimal.NaN) : eIntegerAsEInteger.signum() < 0 ? FromObject(EDecimal.NegativeInfinity) : FromObject(EDecimal.PositiveInfinity);
            }
            EInteger[] eIntegerArrDivRem = eIntegerAsEInteger.DivRem(eIntegerAsEInteger2);
            return eIntegerArrDivRem[1].isZero() ? FromObject(eIntegerArrDivRem[0]) : new CBORNumber(NumberKind.ERational, ERational.Create(eIntegerAsEInteger, eIntegerAsEInteger2));
        }
        EFloat eFloatAsEFloat = GetNumberInterface(numberKind).AsEFloat(obj);
        EFloat eFloatAsEFloat2 = GetNumberInterface(numberKind2).AsEFloat(obj2);
        if (eFloatAsEFloat.isZero() && eFloatAsEFloat2.isZero()) {
            return FromObject(EDecimal.NaN);
        }
        EFloat eFloatDivide = eFloatAsEFloat.Divide(eFloatAsEFloat2, null);
        if (!eFloatAsEFloat.isFinite() || !eFloatAsEFloat2.isFinite() || eFloatDivide.isFinite()) {
            return FromObject(eFloatDivide);
        }
        ERational eRationalAsERational5 = GetNumberInterface(numberKind).AsERational(obj);
        ERational eRationalAsERational6 = GetNumberInterface(numberKind2).AsERational(obj2);
        return new CBORNumber(NumberKind.ERational, CheckOverflow(eRationalAsERational5, eRationalAsERational6, eRationalAsERational5.Divide(eRationalAsERational6)));
    }

    ICBORNumber GetNumberInterface() {
        return GetNumberInterface(this.kind);
    }

    Object GetValue() {
        return this.value;
    }

    public boolean IsFinite() {
        int iOrdinal = this.kind.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            return true;
        }
        return (IsInfinity() || IsNaN()) ? false : true;
    }

    public boolean IsInfinity() {
        return GetNumberInterface().IsInfinity(GetValue());
    }

    public boolean IsInteger() {
        int iOrdinal = this.kind.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            return true;
        }
        return GetNumberInterface().IsIntegral(GetValue());
    }

    public boolean IsNaN() {
        return GetNumberInterface().IsNaN(GetValue());
    }

    public boolean IsNegative() {
        return GetNumberInterface().IsNegative(GetValue());
    }

    public boolean IsNegativeInfinity() {
        return GetNumberInterface().IsNegativeInfinity(GetValue());
    }

    public boolean IsPositiveInfinity() {
        return GetNumberInterface().IsPositiveInfinity(GetValue());
    }

    public boolean IsZero() {
        return this.kind.ordinal() != 0 ? GetNumberInterface().IsNumberZero(GetValue()) : ((Long) this.value).longValue() == 0;
    }

    public CBORNumber Multiply(CBORNumber cBORNumber) {
        if (cBORNumber == null) {
            throw new NullPointerException("b");
        }
        Object obj = this.value;
        Object obj2 = cBORNumber.value;
        NumberKind numberKind = this.kind;
        NumberKind numberKind2 = cBORNumber.kind;
        if (numberKind == NumberKind.Integer && numberKind2 == NumberKind.Integer) {
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            boolean z2 = jLongValue > 0;
            boolean z3 = jLongValue2 > 0;
            return ((!z2 || ((z3 || Long.MIN_VALUE / jLongValue <= jLongValue2) && (!z3 || jLongValue <= Long.MAX_VALUE / jLongValue2))) && (z2 || ((z3 || jLongValue == 0 || Long.MAX_VALUE / jLongValue <= jLongValue2) && (!z3 || jLongValue >= Long.MIN_VALUE / jLongValue2)))) ? FromObject(jLongValue * jLongValue2) : FromObject(EInteger.FromInt64(jLongValue).Multiply(EInteger.FromInt64(jLongValue2)));
        }
        NumberKind numberKindGetConvertKind = GetConvertKind(this, cBORNumber);
        if (numberKindGetConvertKind == NumberKind.ERational) {
            ERational eRationalAsERational = GetNumberInterface(numberKind).AsERational(obj);
            ERational eRationalAsERational2 = GetNumberInterface(numberKind2).AsERational(obj2);
            return FromObject(CheckOverflow(eRationalAsERational, eRationalAsERational2, eRationalAsERational.Multiply(eRationalAsERational2)));
        }
        if (numberKindGetConvertKind == NumberKind.EDecimal) {
            EDecimal eDecimalAsEDecimal = GetNumberInterface(numberKind).AsEDecimal(obj);
            EDecimal eDecimalAsEDecimal2 = GetNumberInterface(numberKind2).AsEDecimal(obj2);
            return FromObject(CheckOverflow(eDecimalAsEDecimal, eDecimalAsEDecimal2, eDecimalAsEDecimal.Multiply(eDecimalAsEDecimal2)));
        }
        if (numberKindGetConvertKind != NumberKind.EFloat) {
            return new CBORNumber(NumberKind.EInteger, GetNumberInterface(numberKind).AsEInteger(obj).Multiply(GetNumberInterface(numberKind2).AsEInteger(obj2)));
        }
        EFloat eFloatAsEFloat = GetNumberInterface(numberKind).AsEFloat(obj);
        EFloat eFloatAsEFloat2 = GetNumberInterface(numberKind2).AsEFloat(obj2);
        return new CBORNumber(NumberKind.EFloat, CheckOverflow(eFloatAsEFloat, eFloatAsEFloat2, eFloatAsEFloat.Multiply(eFloatAsEFloat2)));
    }

    public CBORNumber Negate() {
        int iOrdinal = this.kind.ordinal();
        if (iOrdinal == 0) {
            long jLongValue = ((Long) this.value).longValue();
            return jLongValue == 0 ? FromObject(EDecimal.NegativeZero) : jLongValue == Long.MIN_VALUE ? FromObject(EInteger.FromInt64(jLongValue).Negate()) : new CBORNumber(this.kind, Long.valueOf(-jLongValue));
        }
        if (iOrdinal != 2) {
            return new CBORNumber(this.kind, GetNumberInterface().Negate(GetValue()));
        }
        EInteger eInteger = (EInteger) this.value;
        return eInteger.isZero() ? FromObject(EDecimal.NegativeZero) : FromObject(eInteger.Negate());
    }

    public CBORNumber Remainder(CBORNumber cBORNumber) {
        if (cBORNumber == null) {
            throw new NullPointerException("b");
        }
        Object obj = this.value;
        Object obj2 = cBORNumber.value;
        NumberKind numberKind = this.kind;
        NumberKind numberKind2 = cBORNumber.kind;
        if (numberKind == NumberKind.Integer && numberKind2 == NumberKind.Integer) {
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            return (jLongValue == Long.MIN_VALUE && jLongValue2 == -1) ? FromObject(0) : FromObject(jLongValue % jLongValue2);
        }
        NumberKind numberKindGetConvertKind = GetConvertKind(this, cBORNumber);
        if (numberKindGetConvertKind == NumberKind.ERational) {
            ERational eRationalAsERational = GetNumberInterface(numberKind).AsERational(obj);
            ERational eRationalAsERational2 = GetNumberInterface(numberKind2).AsERational(obj2);
            return FromObject(CheckOverflow(eRationalAsERational, eRationalAsERational2, eRationalAsERational.Remainder(eRationalAsERational2)));
        }
        if (numberKindGetConvertKind == NumberKind.EDecimal) {
            EDecimal eDecimalAsEDecimal = GetNumberInterface(numberKind).AsEDecimal(obj);
            EDecimal eDecimalAsEDecimal2 = GetNumberInterface(numberKind2).AsEDecimal(obj2);
            return FromObject(CheckOverflow(eDecimalAsEDecimal, eDecimalAsEDecimal2, eDecimalAsEDecimal.Remainder(eDecimalAsEDecimal2, null)));
        }
        if (numberKindGetConvertKind != NumberKind.EFloat) {
            return FromObject(GetNumberInterface(numberKind).AsEInteger(obj).Remainder(GetNumberInterface(numberKind2).AsEInteger(obj2)));
        }
        EFloat eFloatAsEFloat = GetNumberInterface(numberKind).AsEFloat(obj);
        EFloat eFloatAsEFloat2 = GetNumberInterface(numberKind2).AsEFloat(obj2);
        return FromObject(CheckOverflow(eFloatAsEFloat, eFloatAsEFloat2, eFloatAsEFloat.Remainder(eFloatAsEFloat2, null)));
    }

    public CBORNumber Subtract(CBORNumber cBORNumber) {
        if (cBORNumber == null) {
            throw new NullPointerException("b");
        }
        Object obj = this.value;
        Object obj2 = cBORNumber.value;
        NumberKind numberKind = this.kind;
        NumberKind numberKind2 = cBORNumber.kind;
        if (numberKind == NumberKind.Integer && numberKind2 == NumberKind.Integer) {
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            return ((jLongValue2 >= 0 || Long.MAX_VALUE + jLongValue2 >= jLongValue) && (jLongValue2 <= 0 || Long.MIN_VALUE + jLongValue2 <= jLongValue)) ? new CBORNumber(NumberKind.Integer, Long.valueOf(jLongValue - jLongValue2)) : FromObject(EInteger.FromInt64(jLongValue).Subtract(EInteger.FromInt64(jLongValue2)));
        }
        NumberKind numberKindGetConvertKind = GetConvertKind(this, cBORNumber);
        if (numberKindGetConvertKind == NumberKind.ERational) {
            ERational eRationalAsERational = GetNumberInterface(numberKind).AsERational(obj);
            ERational eRationalAsERational2 = GetNumberInterface(numberKind2).AsERational(obj2);
            return new CBORNumber(NumberKind.ERational, CheckOverflow(eRationalAsERational, eRationalAsERational2, eRationalAsERational.Subtract(eRationalAsERational2)));
        }
        if (numberKindGetConvertKind == NumberKind.EDecimal) {
            EDecimal eDecimalAsEDecimal = GetNumberInterface(numberKind).AsEDecimal(obj);
            EDecimal eDecimalAsEDecimal2 = GetNumberInterface(numberKind2).AsEDecimal(obj2);
            return new CBORNumber(NumberKind.EDecimal, CheckOverflow(eDecimalAsEDecimal, eDecimalAsEDecimal2, eDecimalAsEDecimal.Subtract(eDecimalAsEDecimal2)));
        }
        if (numberKindGetConvertKind != NumberKind.EFloat) {
            return new CBORNumber(NumberKind.EInteger, GetNumberInterface(numberKind).AsEInteger(obj).Subtract(GetNumberInterface(numberKind2).AsEInteger(obj2)));
        }
        EFloat eFloatAsEFloat = GetNumberInterface(numberKind).AsEFloat(obj);
        EFloat eFloatAsEFloat2 = GetNumberInterface(numberKind2).AsEFloat(obj2);
        return new CBORNumber(NumberKind.EFloat, CheckOverflow(eFloatAsEFloat, eFloatAsEFloat2, eFloatAsEFloat.Subtract(eFloatAsEFloat2)));
    }

    public byte ToByteChecked() {
        if (IsFinite()) {
            return ToEInteger().ToByteChecked();
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public byte ToByteIfExact() {
        if (!IsFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (IsZero()) {
            return (byte) 0;
        }
        if (IsNegative()) {
            throw new ArithmeticException("Value out of range");
        }
        return ToEIntegerIfExact().ToByteChecked();
    }

    public byte ToByteUnchecked() {
        if (IsFinite()) {
            return ToEInteger().ToByteUnchecked();
        }
        return (byte) 0;
    }

    public CBORObject ToCBORObject() {
        return CBORObject.FromObject(this.value);
    }

    public EDecimal ToEDecimal() {
        return GetNumberInterface().AsEDecimal(GetValue());
    }

    public EFloat ToEFloat() {
        return GetNumberInterface().AsEFloat(GetValue());
    }

    public EInteger ToEInteger() {
        return GetNumberInterface().AsEInteger(GetValue());
    }

    public EInteger ToEIntegerIfExact() {
        if (IsInteger()) {
            return ToEInteger();
        }
        throw new ArithmeticException("Not an integer");
    }

    public ERational ToERational() {
        return GetNumberInterface().AsERational(GetValue());
    }

    public short ToInt16Checked() {
        if (IsFinite()) {
            return ToEInteger().ToInt16Checked();
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public short ToInt16IfExact() {
        if (!IsFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (IsZero()) {
            return (short) 0;
        }
        return ToEIntegerIfExact().ToInt16Checked();
    }

    public short ToInt16Unchecked() {
        if (IsFinite()) {
            return ToEInteger().ToInt16Unchecked();
        }
        return (short) 0;
    }

    public int ToInt32Checked() {
        if (IsFinite()) {
            return ToEInteger().ToInt32Checked();
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public int ToInt32IfExact() {
        if (!IsFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (IsZero()) {
            return 0;
        }
        return ToEIntegerIfExact().ToInt32Checked();
    }

    public int ToInt32Unchecked() {
        if (IsFinite()) {
            return ToEInteger().ToInt32Unchecked();
        }
        return 0;
    }

    public long ToInt64Checked() {
        if (IsFinite()) {
            return ToEInteger().ToInt64Checked();
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public long ToInt64IfExact() {
        if (!IsFinite()) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        if (IsZero()) {
            return 0L;
        }
        return ToEIntegerIfExact().ToInt64Checked();
    }

    public long ToInt64Unchecked() {
        if (IsFinite()) {
            return ToEInteger().ToInt64Unchecked();
        }
        return 0L;
    }

    String ToJSONString() {
        int iOrdinal = this.kind.ordinal();
        if (iOrdinal == 0) {
            return CBORUtilities.LongToString(((Long) this.value).longValue());
        }
        if (iOrdinal == 1) {
            long jLongValue = ((Long) this.value).longValue();
            return !CBORUtilities.DoubleBitsFinite(jLongValue) ? "null" : CBORUtilities.TrimDotZero(CBORUtilities.DoubleBitsToString(jLongValue));
        }
        if (iOrdinal == 2) {
            return ((EInteger) this.value).toString();
        }
        if (iOrdinal == 3) {
            EDecimal eDecimal = (EDecimal) this.value;
            return (eDecimal.IsInfinity() || eDecimal.IsNaN()) ? "null" : eDecimal.toString();
        }
        if (iOrdinal != 4) {
            if (iOrdinal != 5) {
                throw new IllegalStateException();
            }
            EDecimal eDecimalToEDecimalExactIfPossible = ((ERational) this.value).ToEDecimalExactIfPossible(EContext.Decimal128.WithUnlimitedExponents());
            return !eDecimalToEDecimalExactIfPossible.isFinite() ? "null" : eDecimalToEDecimalExactIfPossible.toString();
        }
        EFloat eFloat = (EFloat) this.value;
        if (eFloat.IsInfinity() || eFloat.IsNaN()) {
            return "null";
        }
        if (!eFloat.isFinite() || eFloat.getExponent().Abs().compareTo(EInteger.FromInt64(2500L)) <= 0) {
            return eFloat.toString();
        }
        long jToDoubleBits = eFloat.ToDoubleBits();
        return !CBORUtilities.DoubleBitsFinite(jToDoubleBits) ? "null" : CBORUtilities.TrimDotZero(CBORUtilities.DoubleBitsToString(jToDoubleBits));
    }

    public int compareTo(int i2) {
        return compareTo(CBORObject.FromObject(i2).AsNumber());
    }

    public int compareTo(long j2) {
        return compareTo(CBORObject.FromObject(j2).AsNumber());
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0080  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(com.upokecenter.cbor.CBORNumber r14) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORNumber.compareTo(com.upokecenter.cbor.CBORNumber):int");
    }

    public final NumberKind getKind() {
        return this.kind;
    }

    public final int signum() {
        return IsNaN() ? IsNegative() ? -1 : 1 : GetNumberInterface().Sign(this.value);
    }

    public String toString() {
        int iOrdinal = this.kind.ordinal();
        if (iOrdinal == 0) {
            return CBORUtilities.LongToString(((Long) this.value).longValue());
        }
        if (iOrdinal == 1) {
            return CBORUtilities.DoubleBitsToString(((Long) this.value).longValue());
        }
        Object obj = this.value;
        return obj == null ? "" : obj.toString();
    }
}

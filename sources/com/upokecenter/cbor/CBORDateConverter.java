package com.upokecenter.cbor;

import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class CBORDateConverter implements ICBORToFromConverter<Date> {
    private final ConversionType convType;
    public static final CBORDateConverter TaggedString = new CBORDateConverter(ConversionType.TaggedString);
    public static final CBORDateConverter TaggedNumber = new CBORDateConverter(ConversionType.TaggedNumber);
    public static final CBORDateConverter UntaggedNumber = new CBORDateConverter(ConversionType.UntaggedNumber);

    public enum ConversionType {
        TaggedString,
        TaggedNumber,
        UntaggedNumber
    }

    public CBORDateConverter() {
        this(ConversionType.TaggedString);
    }

    public CBORDateConverter(ConversionType conversionType) {
        this.convType = conversionType;
    }

    private static String DateTimeToString(Date date) {
        try {
            int[] iArr = new int[7];
            EInteger[] eIntegerArr = new EInteger[1];
            PropertyMap.BreakDownDateTime(date, eIntegerArr, iArr);
            return CBORUtilities.ToAtomDateTimeString(eIntegerArr[0], iArr);
        } catch (IllegalArgumentException e2) {
            throw new CBORException(e2.getMessage(), e2);
        }
    }

    private String TryGetDateTimeFieldsInternal(CBORObject cBORObject, EInteger[] eIntegerArr, int[] iArr) {
        if (cBORObject == null) {
            return "Object is null";
        }
        if (eIntegerArr == null) {
            throw new NullPointerException("year");
        }
        if (eIntegerArr.length < 1) {
            throw new IllegalArgumentException("\"year\" + \"'s length\" (" + eIntegerArr.length + ") is not greater or equal to 1");
        }
        if (iArr == null) {
            throw new NullPointerException("lesserFields");
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        if (this.convType == ConversionType.UntaggedNumber) {
            if (cBORObject.isTagged()) {
                return "May not be tagged";
            }
            if (!cBORObject.isNumber()) {
                return "Not a finite number";
            }
            CBORNumber cBORNumberAsNumber = cBORObject.AsNumber();
            if (!cBORNumberAsNumber.IsFinite()) {
                return "Not a finite number";
            }
            if (cBORNumberAsNumber.compareTo(Long.MIN_VALUE) < 0 || cBORNumberAsNumber.compareTo(Long.MAX_VALUE) > 0) {
                return "Too big or small to fit a java.util.Date";
            }
            if (cBORNumberAsNumber.CanFitInInt64()) {
                CBORUtilities.BreakDownSecondsSinceEpoch(cBORNumberAsNumber.ToInt64Checked(), eIntegerArr, iArr);
            } else {
                CBORUtilities.BreakDownSecondsSinceEpoch((EDecimal) cBORObject.ToObject(EDecimal.class), eIntegerArr, iArr);
            }
            return null;
        }
        if (cBORObject.HasMostOuterTag(0)) {
            try {
                CBORUtilities.ParseAtomDateTimeString(cBORObject.AsString(), eIntegerArr, iArr);
                return null;
            } catch (ArithmeticException e2) {
                return e2.getMessage();
            } catch (IllegalArgumentException e3) {
                return e3.getMessage();
            } catch (IllegalStateException e4) {
                return e4.getMessage();
            }
        }
        if (!cBORObject.HasMostOuterTag(1)) {
            return "Not tag 0 or 1";
        }
        CBORObject cBORObjectUntagOne = cBORObject.UntagOne();
        if (!cBORObjectUntagOne.isNumber()) {
            return "Not a finite number";
        }
        CBORNumber cBORNumberAsNumber2 = cBORObjectUntagOne.AsNumber();
        if (!cBORNumberAsNumber2.IsFinite()) {
            return "Not a finite number";
        }
        if (cBORNumberAsNumber2.CanFitInInt64()) {
            CBORUtilities.BreakDownSecondsSinceEpoch(cBORNumberAsNumber2.ToInt64Checked(), eIntegerArr, iArr);
        } else {
            CBORUtilities.BreakDownSecondsSinceEpoch((EDecimal) cBORObjectUntagOne.ToObject(EDecimal.class), eIntegerArr, iArr);
        }
        return null;
    }

    public CBORObject DateTimeFieldsToCBORObject(int i2, int i3, int i4) {
        return DateTimeFieldsToCBORObject(EInteger.FromInt32(i2), new int[]{i3, i4, 0, 0, 0, 0, 0});
    }

    public CBORObject DateTimeFieldsToCBORObject(int i2, int i3, int i4, int i5, int i6, int i7) {
        return DateTimeFieldsToCBORObject(EInteger.FromInt32(i2), new int[]{i3, i4, i5, i6, i7, 0, 0});
    }

    public CBORObject DateTimeFieldsToCBORObject(int i2, int[] iArr) {
        return DateTimeFieldsToCBORObject(EInteger.FromInt32(i2), iArr);
    }

    public CBORObject DateTimeFieldsToCBORObject(EInteger eInteger, int[] iArr) {
        if (eInteger == null) {
            throw new NullPointerException("bigYear");
        }
        if (iArr == null) {
            throw new NullPointerException("lesserFields");
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        try {
            CBORUtilities.CheckYearAndLesserFields(eInteger, iArr);
            int iOrdinal = this.convType.ordinal();
            if (iOrdinal == 0) {
                return CBORObject.FromObjectAndTag(CBORUtilities.ToAtomDateTimeString(eInteger, iArr), 0);
            }
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new CBORException("Internal error");
            }
            try {
                int[] iArr2 = new int[1];
                EFloat eFloatDateTimeToIntegerOrDouble = CBORUtilities.DateTimeToIntegerOrDouble(eInteger, iArr, iArr2);
                int i2 = iArr2[0];
                if (i2 == 0) {
                    return this.convType == ConversionType.TaggedNumber ? CBORObject.FromObjectAndTag(eFloatDateTimeToIntegerOrDouble.ToEInteger(), 1) : CBORObject.FromObject(eFloatDateTimeToIntegerOrDouble.ToEInteger());
                }
                if (i2 == 1) {
                    return this.convType == ConversionType.TaggedNumber ? CBORObject.FromFloatingPointBits(eFloatDateTimeToIntegerOrDouble.ToDoubleBits(), 8).WithTag(1) : CBORObject.FromFloatingPointBits(eFloatDateTimeToIntegerOrDouble.ToDoubleBits(), 8);
                }
                throw new CBORException("Too big or small to fit an integer or floating-point number");
            } catch (IllegalArgumentException e2) {
                throw new CBORException(e2.getMessage(), e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new CBORException(e3.getMessage(), e3);
        }
    }

    @Override // com.upokecenter.cbor.ICBORToFromConverter
    public Date FromCBORObject(CBORObject cBORObject) {
        if (cBORObject == null) {
            throw new NullPointerException("obj");
        }
        int[] iArr = new int[7];
        EInteger[] eIntegerArr = new EInteger[1];
        String strTryGetDateTimeFieldsInternal = TryGetDateTimeFieldsInternal(cBORObject, eIntegerArr, iArr);
        if (strTryGetDateTimeFieldsInternal == null) {
            return PropertyMap.BuildUpDateTime(eIntegerArr[0], iArr);
        }
        throw new CBORException(strTryGetDateTimeFieldsInternal);
    }

    @Override // com.upokecenter.cbor.ICBORConverter
    public CBORObject ToCBORObject(Date date) {
        try {
            int[] iArr = new int[7];
            EInteger[] eIntegerArr = new EInteger[1];
            PropertyMap.BreakDownDateTime(date, eIntegerArr, iArr);
            return DateTimeFieldsToCBORObject(eIntegerArr[0], iArr);
        } catch (IllegalArgumentException e2) {
            throw new CBORException(e2.getMessage(), e2);
        }
    }

    public boolean TryGetDateTimeFields(CBORObject cBORObject, EInteger[] eIntegerArr, int[] iArr) {
        if (eIntegerArr == null) {
            throw new NullPointerException("year");
        }
        if (eIntegerArr.length < 1) {
            throw new IllegalArgumentException("\"year\" + \"'s length\" (" + eIntegerArr.length + ") is not greater or equal to 1");
        }
        if (iArr == null) {
            throw new NullPointerException("lesserFields");
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        if (TryGetDateTimeFieldsInternal(cBORObject, eIntegerArr, iArr) == null) {
            return true;
        }
        eIntegerArr[0] = null;
        for (int i2 = 0; i2 < 7; i2++) {
            iArr[i2] = 0;
        }
        return false;
    }

    public final ConversionType getType() {
        return this.convType;
    }
}

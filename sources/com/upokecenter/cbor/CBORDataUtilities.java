package com.upokecenter.cbor;

import com.upokecenter.cbor.JSONOptions;
import com.upokecenter.numbers.EDecimal;
import com.upokecenter.util.DataUtilities;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CBORDataUtilities {
    private static final long DoubleNegInfinity = -4503599627370496L;
    private static final long DoublePosInfinity = 9218868437227405312L;
    private static final String HexAlphabet = "0123456789ABCDEF";
    static final JSONOptions DefaultOptions = new JSONOptions("");
    private static final JSONOptions PreserveNegZeroNo = new JSONOptions("preservenegativezero=0");
    private static final JSONOptions PreserveNegZeroYes = new JSONOptions("preservenegativezero=1");

    /* JADX INFO: renamed from: com.upokecenter.cbor.CBORDataUtilities$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$cbor$CBORType;

        static {
            int[] iArr = new int[CBORType.values().length];
            $SwitchMap$com$upokecenter$cbor$CBORType = iArr;
            try {
                iArr[CBORType.SimpleValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.FloatingPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.ByteString.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.TextString.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Map.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private CBORDataUtilities() {
    }

    public static CBORObject ParseJSONNumber(String str) {
        return ParseJSONNumber(str, PreserveNegZeroNo);
    }

    public static CBORObject ParseJSONNumber(String str, int i2, int i3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return ParseJSONNumber(str, i2, i3, JSONOptions.Default);
    }

    public static CBORObject ParseJSONNumber(String str, int i2, int i3, JSONOptions jSONOptions) {
        return CBORDataUtilitiesTextString.ParseJSONNumber(str, i2, i3, jSONOptions, null);
    }

    public static CBORObject ParseJSONNumber(String str, JSONOptions jSONOptions) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return ParseJSONNumber(str, 0, str.length(), jSONOptions);
    }

    @Deprecated
    public static CBORObject ParseJSONNumber(String str, boolean z2, boolean z3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z2) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) >= '0' && str.charAt(i2) <= '9' && (i2 > 0 || str.charAt(i2) != '-')) {
                    return null;
                }
            }
        }
        if (z3 && str.charAt(0) == '-') {
            return null;
        }
        return ParseJSONNumber(str, 0, str.length(), PreserveNegZeroNo);
    }

    @Deprecated
    public static CBORObject ParseJSONNumber(String str, boolean z2, boolean z3, boolean z4) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z2) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) >= '0' && str.charAt(i2) <= '9' && (i2 > 0 || str.charAt(i2) != '-')) {
                    return null;
                }
            }
        }
        JSONOptions jSONOptions = z4 ? PreserveNegZeroYes : PreserveNegZeroNo;
        if (z3 && str.charAt(0) == '-') {
            return null;
        }
        return ParseJSONNumber(str, 0, str.length(), jSONOptions);
    }

    public static CBORObject ParseJSONNumber(byte[] bArr) {
        return ParseJSONNumber(bArr, PreserveNegZeroNo);
    }

    public static CBORObject ParseJSONNumber(byte[] bArr, int i2, int i3) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return ParseJSONNumber(bArr, i2, i3, JSONOptions.Default);
    }

    public static CBORObject ParseJSONNumber(byte[] bArr, int i2, int i3, JSONOptions jSONOptions) {
        return CBORDataUtilitiesByteArrayString.ParseJSONNumber(bArr, i2, i3, jSONOptions, null);
    }

    public static CBORObject ParseJSONNumber(byte[] bArr, JSONOptions jSONOptions) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return ParseJSONNumber(bArr, 0, bArr.length, jSONOptions);
    }

    public static CBORObject ParseJSONNumber(char[] cArr) {
        return ParseJSONNumber(cArr, PreserveNegZeroNo);
    }

    public static CBORObject ParseJSONNumber(char[] cArr, int i2, int i3) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        return ParseJSONNumber(cArr, i2, i3, JSONOptions.Default);
    }

    public static CBORObject ParseJSONNumber(char[] cArr, int i2, int i3, JSONOptions jSONOptions) {
        return CBORDataUtilitiesCharArrayString.ParseJSONNumber(cArr, i2, i3, jSONOptions, null);
    }

    public static CBORObject ParseJSONNumber(char[] cArr, JSONOptions jSONOptions) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        return ParseJSONNumber(cArr, 0, cArr.length, jSONOptions);
    }

    static CBORObject ParseSmallNumber(int i2, JSONOptions jSONOptions) {
        return (jSONOptions == null || jSONOptions.getNumberConversion() != JSONOptions.ConversionMode.Double) ? (jSONOptions == null || jSONOptions.getNumberConversion() != JSONOptions.ConversionMode.Decimal128) ? CBORObject.FromObject(i2) : CBORObject.FromObject(EDecimal.FromInt32(i2)) : CBORObject.FromFloatingPointBits(CBORUtilities.IntegerToDoubleBits(i2), 8);
    }

    static CBORObject ParseSmallNumberAsNegative(int i2, JSONOptions jSONOptions) {
        return (jSONOptions == null || jSONOptions.getNumberConversion() != JSONOptions.ConversionMode.Double) ? (jSONOptions == null || jSONOptions.getNumberConversion() != JSONOptions.ConversionMode.Decimal128) ? CBORObject.FromObject(-i2) : CBORObject.FromObject(EDecimal.FromInt32(-i2)) : CBORObject.FromFloatingPointBits(CBORUtilities.IntegerToDoubleBits(-i2), 8);
    }

    static String ToStringHelper(CBORObject cBORObject, int i2) {
        StringBuilder sb;
        CBORType type = cBORObject.getType();
        if (cBORObject.isTagged()) {
            sb = type == CBORType.TextString ? new StringBuilder(Math.min(cBORObject.AsString().length(), 4096) + 16) : new StringBuilder();
            for (CBORObject cBORObjectUntagOne = cBORObject; cBORObjectUntagOne.isTagged(); cBORObjectUntagOne = cBORObjectUntagOne.UntagOne()) {
                sb.append(cBORObjectUntagOne.getMostOuterTag().toString());
                sb.append('(');
            }
        } else {
            sb = null;
        }
        boolean z2 = true;
        switch (AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[type.ordinal()]) {
            case 1:
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (cBORObject.isUndefined()) {
                    sb.append("undefined");
                } else if (cBORObject.isNull()) {
                    sb.append("null");
                } else {
                    sb.append("simple(");
                    int simpleValue = cBORObject.getSimpleValue();
                    if (simpleValue >= 100) {
                        sb.append((char) (((simpleValue / 100) % 10) + 48));
                    }
                    if (simpleValue >= 10) {
                        sb.append((char) (((simpleValue / 10) % 10) + 48));
                        simpleValue %= 10;
                    }
                    sb.append((char) (simpleValue + 48));
                    sb.append(')');
                }
                break;
            case 2:
            case 3:
                String strToJSONString = cBORObject.Untag().ToJSONString();
                if (sb == null) {
                    return strToJSONString;
                }
                sb.append(strToJSONString);
                break;
                break;
            case 4:
                long jAsDoubleBits = cBORObject.AsDoubleBits();
                String strToJSONString2 = jAsDoubleBits == DoubleNegInfinity ? "-Infinity" : jAsDoubleBits == DoublePosInfinity ? "Infinity" : CBORUtilities.DoubleBitsNaN(jAsDoubleBits) ? "NaN" : cBORObject.Untag().ToJSONString();
                if (sb == null) {
                    return strToJSONString2;
                }
                sb.append(strToJSONString2);
                break;
                break;
            case 5:
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append("h'");
                byte[] bArrGetByteString = cBORObject.GetByteString();
                int length = bArrGetByteString.length;
                for (int i3 = 0; i3 < length; i3++) {
                    sb.append(HexAlphabet.charAt((-1) - (((-1) - (bArrGetByteString[i3] >> 4)) | ((-1) - 15))));
                    sb.append(HexAlphabet.charAt((-1) - (((-1) - bArrGetByteString[i3]) | ((-1) - 15))));
                }
                sb.append('\'');
                break;
            case 6:
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append('\"');
                String strAsString = cBORObject.AsString();
                int length2 = strAsString.length();
                int i4 = 0;
                while (i4 < length2) {
                    int iCodePointAt = DataUtilities.CodePointAt(strAsString, i4, 0);
                    if (iCodePointAt >= 65536) {
                        sb.append("\\U");
                        sb.append(HexAlphabet.charAt((iCodePointAt >> 20) & 15));
                        sb.append(HexAlphabet.charAt((iCodePointAt >> 16) & 15));
                        int i5 = iCodePointAt >> 12;
                        sb.append(HexAlphabet.charAt((i5 + 15) - (i5 | 15)));
                        sb.append(HexAlphabet.charAt((iCodePointAt >> 8) & 15));
                        int i6 = iCodePointAt >> 4;
                        sb.append(HexAlphabet.charAt((i6 + 15) - (i6 | 15)));
                        sb.append(HexAlphabet.charAt((iCodePointAt + 15) - (iCodePointAt | 15)));
                        i4++;
                    } else if (iCodePointAt >= 127 || iCodePointAt < 32 || iCodePointAt == 92 || iCodePointAt == 34) {
                        sb.append("\\u");
                        int i7 = iCodePointAt >> 12;
                        sb.append(HexAlphabet.charAt((i7 + 15) - (i7 | 15)));
                        sb.append(HexAlphabet.charAt((iCodePointAt >> 8) & 15));
                        int i8 = iCodePointAt >> 4;
                        sb.append(HexAlphabet.charAt((i8 + 15) - (i8 | 15)));
                        sb.append(HexAlphabet.charAt((-1) - (((-1) - iCodePointAt) | ((-1) - 15))));
                    } else {
                        sb.append((char) iCodePointAt);
                    }
                    i4++;
                }
                sb.append('\"');
                break;
            case 7:
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                if (i2 >= 50) {
                    sb.append("...");
                } else {
                    int i9 = 0;
                    while (i9 < cBORObject.size()) {
                        if (!z2) {
                            sb.append(", ");
                        }
                        sb.append(ToStringHelper(cBORObject.get(i9), i2 + 1));
                        i9++;
                        z2 = false;
                    }
                }
                sb.append(AbstractJsonLexerKt.END_LIST);
                break;
            case 8:
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
                if (i2 >= 50) {
                    sb.append("...");
                } else {
                    for (Map.Entry<CBORObject, CBORObject> entry : cBORObject.getEntries()) {
                        CBORObject key = entry.getKey();
                        CBORObject value = entry.getValue();
                        if (!z2) {
                            sb.append(", ");
                        }
                        int i10 = i2 + 1;
                        sb.append(ToStringHelper(key, i10));
                        sb.append(": ");
                        sb.append(ToStringHelper(value, i10));
                        z2 = false;
                    }
                }
                sb.append(AbstractJsonLexerKt.END_OBJ);
                break;
            default:
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append("???");
                break;
        }
        while (cBORObject.isTagged()) {
            sb.append(')');
            cBORObject = cBORObject.UntagOne();
        }
        return sb.toString();
    }
}

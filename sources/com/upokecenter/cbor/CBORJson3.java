package com.upokecenter.cbor;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
final class CBORJson3 {
    private int endPos;
    private int index;
    private final String jstring;
    private final JSONOptions options;
    private StringBuilder sb = null;

    public CBORJson3(String str, int i2, int i3, JSONOptions jSONOptions) {
        this.jstring = str;
        this.index = i2;
        this.endPos = i3;
        this.options = jSONOptions;
    }

    private CBORObject NextJSONNegativeNumber(int[] iArr) {
        int iCharAt;
        int i2 = this.index;
        int i3 = i2 - 1;
        if (i2 < this.endPos) {
            String str = this.jstring;
            this.index = i2 + 1;
            iCharAt = str.charAt(i2) & CharCompanionObject.MAX_VALUE;
        } else {
            iCharAt = -1;
        }
        if (iCharAt < 48 || iCharAt > 57) {
            RaiseError("JSON number can't be parsed.");
        }
        int i4 = this.index;
        if (i4 < this.endPos && iCharAt != 48) {
            char cCharAt = this.jstring.charAt(i4);
            int i5 = (65535 + cCharAt) - (65535 | cCharAt);
            if (i5 == 44 || i5 == 93 || i5 == 125) {
                this.index++;
                CBORObject cBORObjectParseSmallNumberAsNegative = CBORDataUtilities.ParseSmallNumberAsNegative(iCharAt - 48, this.options);
                iArr[0] = i5;
                return cBORObjectParseSmallNumberAsNegative;
            }
            if (i5 == 32 || i5 == 10 || i5 == 13 || i5 == 9) {
                this.index++;
                CBORObject cBORObjectParseSmallNumberAsNegative2 = CBORDataUtilities.ParseSmallNumberAsNegative(iCharAt - 48, this.options);
                iArr[0] = SkipWhitespaceJSON();
                return cBORObjectParseSmallNumberAsNegative2;
            }
        }
        int[] iArr2 = {i3};
        CBORObject cBORObjectParseJSONNumber = CBORDataUtilitiesTextString.ParseJSONNumber(this.jstring, i3, this.endPos - i3, this.options, iArr2);
        int i6 = iArr2[0];
        int i7 = this.endPos;
        if (i6 < i7) {
            i7 = i6 + 1;
        }
        this.index = i7;
        if (cBORObjectParseJSONNumber == null) {
            int i8 = i6 - i3;
            String strSubstring = this.jstring.substring(i3, Math.min(100, i8) + i3);
            if (i8 > 100) {
                strSubstring = strSubstring + "...";
            }
            RaiseError("JSON number can't be parsed. " + strSubstring);
        }
        char cCharAt2 = i6 >= this.endPos ? (char) 65535 : this.jstring.charAt(i6);
        if (cCharAt2 != ',' && cCharAt2 != ']' && cCharAt2 != '}' && cCharAt2 != 65535 && cCharAt2 != ' ' && cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != '\t') {
            RaiseError("Invalid character after JSON number");
        }
        if (cCharAt2 == 65535 || !(cCharAt2 == ' ' || cCharAt2 == '\n' || cCharAt2 == '\r' || cCharAt2 == '\t')) {
            iArr[0] = cCharAt2;
        } else {
            iArr[0] = SkipWhitespaceJSON();
        }
        return cBORObjectParseJSONNumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.upokecenter.cbor.CBORObject NextJSONNonnegativeNumber(int r19, int[] r20) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORJson3.NextJSONNonnegativeNumber(int, int[]):com.upokecenter.cbor.CBORObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String NextJSONString() {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORJson3.NextJSONString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.upokecenter.cbor.CBORObject NextJSONValue(int r10, int[] r11, int r12) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORJson3.NextJSONValue(int, int[], int):com.upokecenter.cbor.CBORObject");
    }

    private CBORObject ParseJSONObject(int i2) {
        if (i2 > 1000) {
            RaiseError("Too deeply nested");
        }
        int[] iArr = new int[1];
        Map mapNewOrderedDict = this.options.getKeepKeyOrder() ? PropertyMap.NewOrderedDict() : new TreeMap();
        boolean z2 = false;
        CBORObject cBORObjectFromRaw = null;
        while (true) {
            int iSkipWhitespaceJSON = SkipWhitespaceJSON();
            if (iSkipWhitespaceJSON == -1) {
                RaiseError("A JSON Object must end with '}'");
            } else {
                if (iSkipWhitespaceJSON == 125) {
                    if (!z2) {
                        return CBORObject.FromRaw((Map<CBORObject, CBORObject>) mapNewOrderedDict);
                    }
                    RaiseError("Trailing comma");
                    return null;
                }
                if (iSkipWhitespaceJSON < 0) {
                    RaiseError("Unexpected end of data");
                    return null;
                }
                if (iSkipWhitespaceJSON != 34) {
                    RaiseError("Expected a String as a key");
                    return null;
                }
                cBORObjectFromRaw = CBORObject.FromRaw(NextJSONString());
            }
            if (SkipWhitespaceJSON() != 58) {
                RaiseError("Expected a ':' after a key");
            }
            int size = mapNewOrderedDict.size();
            mapNewOrderedDict.put(cBORObjectFromRaw, NextJSONValue(SkipWhitespaceJSON(), iArr, i2));
            int size2 = mapNewOrderedDict.size();
            if (!this.options.getAllowDuplicateKeys() && size == size2) {
                RaiseError("Duplicate key already exists");
                return null;
            }
            int i3 = iArr[0];
            if (i3 == 44) {
                z2 = true;
            } else {
                if (i3 == 125) {
                    return CBORObject.FromRaw((Map<CBORObject, CBORObject>) mapNewOrderedDict);
                }
                RaiseError("Expected a ',' or '}'");
            }
        }
    }

    static CBORObject ParseJSONValue(String str, int i2, int i3, JSONOptions jSONOptions) {
        int[] iArr = new int[1];
        CBORJson3 cBORJson3 = new CBORJson3(str, i2, i3, jSONOptions);
        CBORObject cBORObjectParseJSON = cBORJson3.ParseJSON(iArr);
        if (iArr[0] != -1) {
            cBORJson3.RaiseError("End of String not reached");
        }
        return cBORObjectParseJSON;
    }

    static CBORObject ParseJSONValue(String str, int i2, int i3, JSONOptions jSONOptions, int[] iArr) {
        return new CBORJson3(str, i2, i3, jSONOptions).ParseJSON(iArr);
    }

    private int SkipWhitespaceJSON() {
        while (true) {
            int i2 = this.index;
            if (i2 >= this.endPos) {
                return -1;
            }
            String str = this.jstring;
            this.index = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                return cCharAt;
            }
        }
    }

    public CBORObject ParseJSON(int[] iArr) {
        int iSkipWhitespaceJSON = SkipWhitespaceJSON();
        if (iSkipWhitespaceJSON == 91) {
            CBORObject cBORObjectParseJSONArray = ParseJSONArray(0);
            iArr[0] = SkipWhitespaceJSON();
            return cBORObjectParseJSONArray;
        }
        if (iSkipWhitespaceJSON != 123) {
            return NextJSONValue(iSkipWhitespaceJSON, iArr, 0);
        }
        CBORObject cBORObjectParseJSONObject = ParseJSONObject(0);
        iArr[0] = SkipWhitespaceJSON();
        return cBORObjectParseJSONObject;
    }

    CBORObject ParseJSONArray(int i2) {
        if (i2 > 1000) {
            RaiseError("Too deeply nested");
        }
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[1];
        boolean z2 = false;
        while (true) {
            int iSkipWhitespaceJSON = SkipWhitespaceJSON();
            if (iSkipWhitespaceJSON == 93) {
                if (z2) {
                    RaiseError("Trailing comma");
                }
                return CBORObject.FromRaw(arrayList);
            }
            if (iSkipWhitespaceJSON == 44) {
                RaiseError("Empty array element");
            }
            arrayList.add(NextJSONValue(iSkipWhitespaceJSON, iArr, i2));
            int i3 = iArr[0];
            if (i3 == 44) {
                z2 = true;
            } else {
                if (i3 == 93) {
                    return CBORObject.FromRaw(arrayList);
                }
                RaiseError("Expected a ',' or ']'");
            }
        }
    }

    void RaiseError(String str) {
        throw new CBORException(str + " (approx. offset: " + Math.max(0, this.index - 1) + ")");
    }
}

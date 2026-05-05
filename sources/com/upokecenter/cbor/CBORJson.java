package com.upokecenter.cbor;

import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import okio.Utf8;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
final class CBORJson {
    private final JSONOptions options;
    private CharacterInputWithCount reader;
    private StringBuilder sb = null;
    private boolean jsonSequenceMode = false;
    private boolean recordSeparatorSeen = false;

    public CBORJson(CharacterInputWithCount characterInputWithCount, JSONOptions jSONOptions) {
        this.reader = characterInputWithCount;
        this.options = jSONOptions;
    }

    private CBORObject NextJSONNegativeNumber(int[] iArr, int i2) {
        int iReadChar = ReadChar();
        if (iReadChar < 48 || iReadChar > 57) {
            RaiseError("JSON number can't be parsed.");
        }
        int iReadChar2 = ReadChar();
        StringBuilder sb = this.sb;
        if (sb == null) {
            sb = new StringBuilder();
        }
        this.sb = sb;
        sb.delete(0, sb.length());
        this.sb.append(Soundex.SILENT_MARKER);
        this.sb.append((char) iReadChar);
        char[] cArr = new char[32];
        int i3 = 0;
        while (true) {
            if (iReadChar2 != 45 && iReadChar2 != 43 && iReadChar2 != 46 && ((iReadChar2 < 48 || iReadChar2 > 57) && iReadChar2 != 101 && iReadChar2 != 69)) {
                break;
            }
            int i4 = i3 + 1;
            cArr[i3] = (char) iReadChar2;
            if (i4 >= 32) {
                this.sb.append(cArr, 0, 32);
                i3 = 0;
            } else {
                i3 = i4;
            }
            iReadChar2 = ReadChar();
        }
        if (i3 > 0) {
            this.sb.append(cArr, 0, i3);
        }
        if (iReadChar2 != 44 && iReadChar2 != 93 && iReadChar2 != 125 && iReadChar2 != -1 && iReadChar2 != 32 && iReadChar2 != 10 && iReadChar2 != 13 && iReadChar2 != 9) {
            RaiseError("Invalid character after JSON number");
        }
        String string = this.sb.toString();
        CBORObject cBORObjectParseJSONNumber = CBORDataUtilities.ParseJSONNumber(string, this.options);
        if (cBORObjectParseJSONNumber == null) {
            if (string.length() > 100) {
                string = string.substring(0, 100) + "...";
            }
            RaiseError("JSON number can't be parsed. " + string);
        }
        if (iReadChar2 == 32 || iReadChar2 == 10 || iReadChar2 == 13 || iReadChar2 == 9) {
            iArr[0] = SkipWhitespaceJSON();
        } else if (this.jsonSequenceMode && i2 == 0) {
            iArr[0] = iReadChar2;
            RaiseError("JSON whitespace expected after top-level number in JSON sequence");
        } else {
            iArr[0] = iReadChar2;
        }
        return cBORObjectParseJSONNumber;
    }

    private String NextJSONString() {
        int i2;
        int i3;
        int i4;
        int i5;
        StringBuilder sb = this.sb;
        if (sb == null) {
            sb = new StringBuilder();
        }
        this.sb = sb;
        int i6 = 0;
        sb.delete(0, sb.length());
        while (true) {
            int iReadChar = ReadChar();
            if (iReadChar == -1 || iReadChar < 32) {
                RaiseError("Unterminated String");
            }
            if (iReadChar == 34) {
                return this.sb.toString();
            }
            if (iReadChar == 92) {
                int iReadChar2 = ReadChar();
                if (iReadChar2 == 34 || iReadChar2 == 47 || iReadChar2 == 92) {
                    this.sb.append((char) iReadChar2);
                    i6 = 0;
                } else {
                    if (iReadChar2 == 98) {
                        this.sb.append('\b');
                    } else if (iReadChar2 == 102) {
                        this.sb.append('\f');
                    } else if (iReadChar2 == 110) {
                        this.sb.append('\n');
                    } else if (iReadChar2 == 114) {
                        this.sb.append(TokenParser.CR);
                    } else if (iReadChar2 == 116) {
                        this.sb.append('\t');
                    } else if (iReadChar2 != 117) {
                        RaiseError("Invalid escaped character");
                    } else {
                        int i7 = i6;
                        while (i6 < 4) {
                            int iReadChar3 = ReadChar();
                            if (iReadChar3 >= 48 && iReadChar3 <= 57) {
                                i4 = i7 << 4;
                                i5 = iReadChar3 - 48;
                            } else if (iReadChar3 >= 65 && iReadChar3 <= 70) {
                                i4 = i7 << 4;
                                i5 = iReadChar3 - 55;
                            } else if (iReadChar3 < 97 || iReadChar3 > 102) {
                                RaiseError("Invalid Unicode escaped character");
                                i6++;
                            } else {
                                i4 = i7 << 4;
                                i5 = iReadChar3 - 87;
                            }
                            i7 = i4 | i5;
                            i6++;
                        }
                        if ((63488 & i7) != 55296) {
                            this.sb.append((char) i7);
                        } else if ((-1) - (((-1) - i7) | ((-1) - 64512)) == 55296) {
                            if (ReadChar() != 92 || ReadChar() != 117) {
                                RaiseError("Invalid escaped character");
                            }
                            int i8 = 0;
                            for (int i9 = 0; i9 < 4; i9++) {
                                int iReadChar4 = ReadChar();
                                if (iReadChar4 >= 48 && iReadChar4 <= 57) {
                                    i2 = i8 << 4;
                                    i3 = iReadChar4 - 48;
                                } else if (iReadChar4 >= 65 && iReadChar4 <= 70) {
                                    i2 = i8 << 4;
                                    i3 = iReadChar4 - 55;
                                } else if (iReadChar4 < 97 || iReadChar4 > 102) {
                                    RaiseError("Invalid Unicode escaped character");
                                } else {
                                    i2 = i8 << 4;
                                    i3 = iReadChar4 - 87;
                                }
                                i8 = (-1) - (((-1) - i2) & ((-1) - i3));
                            }
                            if ((-1) - (((-1) - i8) | ((-1) - 64512)) != 56320) {
                                RaiseError("Unpaired surrogate code point");
                            } else {
                                this.sb.append((char) i7);
                                this.sb.append((char) i8);
                            }
                        } else {
                            RaiseError("Unpaired surrogate code point");
                        }
                    }
                    i6 = 0;
                }
            } else if ((iReadChar >> 16) == 0) {
                this.sb.append((char) iReadChar);
            } else {
                int i10 = iReadChar - 65536;
                int i11 = (i10 >> 10) & 1023;
                this.sb.append((char) ((55296 + i11) - (55296 & i11)));
                this.sb.append((char) ((i10 & 1023) | Utf8.LOG_SURROGATE_HEADER));
            }
        }
    }

    private CBORObject NextJSONValue(int i2, int[] iArr, int i3) {
        CBORObject cBORObjectParseSmallNumber;
        boolean z2;
        if (i2 < 0) {
            RaiseError("Unexpected end of data");
        }
        if (i2 == 34) {
            CBORObject cBORObjectFromRaw = CBORObject.FromRaw(NextJSONString());
            iArr[0] = SkipWhitespaceJSON();
            return cBORObjectFromRaw;
        }
        if (i2 == 45) {
            return NextJSONNegativeNumber(iArr, i3);
        }
        if (i2 == 91) {
            CBORObject cBORObjectParseJSONArray = ParseJSONArray(1 + i3);
            iArr[0] = SkipWhitespaceJSON();
            return cBORObjectParseJSONArray;
        }
        if (i2 == 102) {
            if (ReadChar() != 97 || ReadChar() != 108 || ReadChar() != 115 || ReadChar() != 101) {
                RaiseError("Value can't be parsed.");
            }
            int iReadChar = ReadChar();
            if (iReadChar == 32 || iReadChar == 10 || iReadChar == 13 || iReadChar == 9) {
                iArr[0] = SkipWhitespaceJSON();
            } else if (this.jsonSequenceMode && i3 == 0) {
                iArr[0] = iReadChar;
                RaiseError("JSON whitespace expected after top-level number in JSON sequence");
            } else {
                iArr[0] = iReadChar;
            }
            return CBORObject.False;
        }
        if (i2 == 110) {
            if (ReadChar() != 117 || ReadChar() != 108 || ReadChar() != 108) {
                RaiseError("Value can't be parsed.");
            }
            int iReadChar2 = ReadChar();
            if (iReadChar2 == 32 || iReadChar2 == 10 || iReadChar2 == 13 || iReadChar2 == 9) {
                iArr[0] = SkipWhitespaceJSON();
            } else if (this.jsonSequenceMode && i3 == 0) {
                iArr[0] = iReadChar2;
                RaiseError("JSON whitespace expected after top-level number in JSON sequence");
            } else {
                iArr[0] = iReadChar2;
            }
            return CBORObject.Null;
        }
        if (i2 == 116) {
            if (ReadChar() != 114 || ReadChar() != 117 || ReadChar() != 101) {
                RaiseError("Value can't be parsed.");
            }
            int iReadChar3 = ReadChar();
            if (iReadChar3 == 32 || iReadChar3 == 10 || iReadChar3 == 13 || iReadChar3 == 9) {
                iArr[0] = SkipWhitespaceJSON();
            } else if (this.jsonSequenceMode && i3 == 0) {
                iArr[0] = iReadChar3;
                RaiseError("JSON whitespace expected after top-level number in JSON sequence");
            } else {
                iArr[0] = iReadChar3;
            }
            return CBORObject.True;
        }
        if (i2 == 123) {
            CBORObject cBORObjectParseJSONObject = ParseJSONObject(1 + i3);
            iArr[0] = SkipWhitespaceJSON();
            return cBORObjectParseJSONObject;
        }
        switch (i2) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                int i4 = i2 - 48;
                int iReadChar4 = ReadChar();
                if (iReadChar4 == 45 || iReadChar4 == 43 || iReadChar4 == 46 || ((iReadChar4 >= 48 && iReadChar4 <= 57) || iReadChar4 == 101 || iReadChar4 == 69)) {
                    if (iReadChar4 < 48 || iReadChar4 > 57) {
                        StringBuilder sb = this.sb;
                        if (sb == null) {
                            sb = new StringBuilder();
                        }
                        this.sb = sb;
                        sb.delete(0, sb.length());
                        this.sb.append((char) i2);
                    } else {
                        if (i2 == 48) {
                            RaiseError("JSON number can't be parsed.");
                        }
                        int i5 = (i4 * 10) + (iReadChar4 - 48);
                        int iReadChar5 = ReadChar();
                        if (iReadChar5 >= 48 && iReadChar5 <= 57) {
                            int[] iArr2 = new int[10];
                            iArr2[0] = i2;
                            iArr2[1] = iReadChar4;
                            int i6 = 2;
                            while (i6 < 9 && iReadChar5 >= 48 && iReadChar5 <= 57) {
                                i5 = (i5 * 10) + (iReadChar5 - 48);
                                iArr2[i6] = iReadChar5;
                                iReadChar5 = ReadChar();
                                i6++;
                            }
                            if (iReadChar5 == 101 || iReadChar5 == 69 || iReadChar5 == 46 || (iReadChar5 >= 48 && iReadChar5 <= 57)) {
                                StringBuilder sb2 = this.sb;
                                if (sb2 == null) {
                                    sb2 = new StringBuilder();
                                }
                                this.sb = sb2;
                                sb2.delete(0, sb2.length());
                                for (int i7 = 0; i7 < i6; i7++) {
                                    this.sb.append((char) iArr2[i7]);
                                }
                                cBORObjectParseSmallNumber = null;
                                z2 = true;
                            } else {
                                cBORObjectParseSmallNumber = CBORDataUtilities.ParseSmallNumber(i5, this.options);
                                z2 = false;
                            }
                            iReadChar4 = iReadChar5;
                        } else if (iReadChar5 == 45 || iReadChar5 == 43 || iReadChar5 == 46 || iReadChar5 == 101 || iReadChar5 == 69) {
                            StringBuilder sb3 = this.sb;
                            if (sb3 == null) {
                                sb3 = new StringBuilder();
                            }
                            this.sb = sb3;
                            sb3.delete(0, sb3.length());
                            this.sb.append((char) i2);
                            this.sb.append((char) iReadChar4);
                            iReadChar4 = iReadChar5;
                        } else {
                            cBORObjectParseSmallNumber = CBORDataUtilities.ParseSmallNumber(i5, this.options);
                            z2 = false;
                            iReadChar4 = iReadChar5;
                        }
                    }
                    cBORObjectParseSmallNumber = null;
                    z2 = true;
                } else {
                    cBORObjectParseSmallNumber = CBORDataUtilities.ParseSmallNumber(i4, this.options);
                    z2 = false;
                }
                if (z2) {
                    char[] cArr = new char[32];
                    int i8 = 0;
                    while (true) {
                        if (iReadChar4 != 45 && iReadChar4 != 43 && iReadChar4 != 46 && ((iReadChar4 < 48 || iReadChar4 > 57) && iReadChar4 != 101 && iReadChar4 != 69)) {
                            if (i8 > 0) {
                                this.sb.append(cArr, 0, i8);
                            }
                            if (iReadChar4 != 44 && iReadChar4 != 93 && iReadChar4 != 125 && iReadChar4 != -1 && iReadChar4 != 32 && iReadChar4 != 10 && iReadChar4 != 13 && iReadChar4 != 9) {
                                RaiseError("Invalid character after JSON number");
                            }
                            String string = this.sb.toString();
                            cBORObjectParseSmallNumber = CBORDataUtilities.ParseJSONNumber(string, this.options);
                            if (cBORObjectParseSmallNumber == null) {
                                if (string.length() > 100) {
                                    string = string.substring(0, 100) + "...";
                                }
                                RaiseError("JSON number can't be parsed. " + string);
                            }
                        }
                        int i9 = i8 + 1;
                        cArr[i8] = (char) iReadChar4;
                        if (i9 >= 32) {
                            this.sb.append(cArr, 0, 32);
                            i9 = 0;
                        }
                        iReadChar4 = ReadChar();
                        i8 = i9;
                    }
                } else if (iReadChar4 != 44 && iReadChar4 != 93 && iReadChar4 != 125 && iReadChar4 != -1 && iReadChar4 != 32 && iReadChar4 != 10 && iReadChar4 != 13 && iReadChar4 != 9) {
                    RaiseError("Invalid character after JSON number");
                }
                if (iReadChar4 == 32 || iReadChar4 == 10 || iReadChar4 == 13 || iReadChar4 == 9) {
                    iArr[0] = SkipWhitespaceJSON();
                } else if (this.jsonSequenceMode && i3 == 0) {
                    iArr[0] = iReadChar4;
                    RaiseError("JSON whitespace expected after top-level number in JSON sequence");
                } else {
                    iArr[0] = iReadChar4;
                }
                return cBORObjectParseSmallNumber;
            default:
                RaiseError("Value can't be parsed.");
                return null;
        }
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

    static CBORObject[] ParseJSONSequence(CharacterInputWithCount characterInputWithCount, JSONOptions jSONOptions, int[] iArr) {
        CBORObject cBORObjectParseJSON;
        CBORJson cBORJson = new CBORJson(characterInputWithCount, jSONOptions);
        cBORJson.SetJSONSequenceMode();
        boolean zSkipRecordSeparators = cBORJson.SkipRecordSeparators(iArr, false);
        int i2 = iArr[0];
        if (i2 >= 0 && !zSkipRecordSeparators) {
            cBORJson.RaiseError("Not a JSON text sequence");
        } else {
            if (i2 < 0 && !zSkipRecordSeparators) {
                return new CBORObject[0];
            }
            if (i2 < 0) {
                return new CBORObject[]{null};
            }
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                cBORObjectParseJSON = cBORJson.ParseJSON(iArr);
            } catch (CBORException unused) {
                cBORJson.SkipToEnd();
                cBORObjectParseJSON = null;
            }
            if (cBORObjectParseJSON != null && iArr[0] >= 0) {
                cBORJson.SkipToEnd();
                cBORObjectParseJSON = null;
            }
            arrayList.add(cBORObjectParseJSON);
            if (!cBORJson.recordSeparatorSeen) {
                iArr[0] = -1;
                break;
            }
            cBORJson.ResetJSONSequenceMode();
            cBORJson.SkipRecordSeparators(iArr, true);
            if (iArr[0] < 0) {
                arrayList.add(null);
                break;
            }
        }
        return (CBORObject[]) arrayList.toArray(new CBORObject[0]);
    }

    static CBORObject ParseJSONValue(CharacterInputWithCount characterInputWithCount, JSONOptions jSONOptions, int[] iArr) {
        return new CBORJson(characterInputWithCount, jSONOptions).ParseJSON(iArr);
    }

    private void RaiseError(String str) {
        this.reader.RaiseError(str);
    }

    private void ResetJSONSequenceMode() {
        this.jsonSequenceMode = true;
        this.recordSeparatorSeen = false;
    }

    private void SetJSONSequenceMode() {
        this.jsonSequenceMode = true;
        this.recordSeparatorSeen = false;
    }

    private int SkipWhitespaceJSON() {
        int iReadChar;
        while (true) {
            iReadChar = ReadChar();
            if (iReadChar == -1 || (iReadChar != 32 && iReadChar != 10 && iReadChar != 13 && iReadChar != 9)) {
                break;
            }
        }
        return iReadChar;
    }

    private int SkipWhitespaceJSON(int i2) {
        while (true) {
            if (i2 != 32 && i2 != 10 && i2 != 13 && i2 != 9) {
                return i2;
            }
            i2 = ReadChar();
        }
    }

    public CBORObject ParseJSON(int[] iArr) {
        int iSkipWhitespaceJSON = this.jsonSequenceMode ? SkipWhitespaceJSON(iArr[0]) : SkipWhitespaceJSON();
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

    public int ReadChar() {
        if (!this.jsonSequenceMode) {
            return this.reader.ReadChar();
        }
        if (this.recordSeparatorSeen) {
            return -1;
        }
        int iReadChar = this.reader.ReadChar();
        if (iReadChar != 30) {
            return iReadChar;
        }
        this.recordSeparatorSeen = true;
        return -1;
    }

    boolean SkipRecordSeparators(int[] iArr, boolean z2) {
        if (!this.jsonSequenceMode) {
            iArr[0] = -1;
            return false;
        }
        while (true) {
            int iReadChar = this.reader.ReadChar();
            iArr[0] = iReadChar;
            if (iReadChar != 30) {
                return z2;
            }
            z2 = true;
        }
    }

    public void SkipToEnd() {
        if (this.jsonSequenceMode) {
            while (ReadChar() >= 0) {
            }
        }
    }
}

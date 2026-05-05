package com.upokecenter.cbor;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
final class CBORJson2 {
    private static byte[] valueEmptyBytes = new byte[0];
    private final byte[] bytes;
    private int endPos;
    private int index;
    private final JSONOptions options;

    public CBORJson2(byte[] bArr, int i2, int i3, JSONOptions jSONOptions) {
        this.bytes = bArr;
        this.index = i2;
        this.endPos = i3;
        this.options = jSONOptions;
    }

    private CBORObject NextJSONNegativeNumber(int[] iArr) {
        int i2;
        CBORObject cBORObjectParseJSONNumber;
        int i3 = this.index;
        int i4 = i3 - 1;
        if (i3 < this.endPos) {
            byte[] bArr = this.bytes;
            this.index = i3 + 1;
            i2 = (-1) - (((-1) - bArr[i3]) | ((-1) - 255));
        } else {
            i2 = -1;
        }
        if (i2 < 48 || i2 > 57) {
            RaiseError("JSON number can't be parsed.");
        }
        int i5 = i2;
        while (true) {
            if (i5 != 45 && i5 != 43 && i5 != 46 && ((i5 < 48 || i5 > 57) && i5 != 101 && i5 != 69)) {
                break;
            }
            int i6 = this.index;
            if (i6 < this.endPos) {
                byte[] bArr2 = this.bytes;
                this.index = i6 + 1;
                byte b2 = bArr2[i6];
                i5 = (b2 + 255) - (b2 | 255);
            } else {
                i5 = -1;
            }
        }
        if (i5 != 44 && i5 != 93 && i5 != 125 && i5 != -1 && i5 != 32 && i5 != 10 && i5 != 13 && i5 != 9) {
            RaiseError("Invalid character after JSON number");
        }
        int i7 = (i5 < 0 ? this.endPos : this.index - 1) - i4;
        if (i7 != 2 || i2 == 48) {
            cBORObjectParseJSONNumber = CBORDataUtilities.ParseJSONNumber(this.bytes, i4, i7, this.options);
            if (cBORObjectParseJSONNumber == null) {
                RaiseError("JSON number can't be parsed. ");
            }
        } else {
            cBORObjectParseJSONNumber = CBORDataUtilities.ParseSmallNumberAsNegative(i2 - 48, this.options);
        }
        if (i5 == -1 || !(i5 == 32 || i5 == 10 || i5 == 13 || i5 == 9)) {
            iArr[0] = i5;
        } else {
            iArr[0] = SkipWhitespaceJSON();
        }
        return cBORObjectParseJSONNumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x004d A[LOOP:0: B:136:0x004d->B:230:0x004d, LOOP_START, PHI: r1
  0x004d: PHI (r1v19 int) = (r1v16 int), (r1v23 int) binds: [B:135:0x004b, B:230:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.upokecenter.cbor.CBORObject NextJSONNonnegativeNumber(int r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORJson2.NextJSONNonnegativeNumber(int, int[]):com.upokecenter.cbor.CBORObject");
    }

    private byte[] NextJSONString() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = this.index;
        byte[] bArr = this.bytes;
        while (true) {
            if (this.index >= this.endPos) {
                RaiseError("Unterminated String");
            }
            int i25 = this.index;
            this.index = i25 + 1;
            int i26 = bArr[i25] & 255;
            int i27 = 32;
            if (i26 < 32) {
                RaiseError("Invalid character in String literal");
            }
            int i28 = 194;
            int i29 = 34;
            int i30 = 92;
            int i31 = 191;
            int i32 = -1;
            if (i26 == 92) {
                int i33 = this.index - 1;
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (i33 > i24) {
                        byteArrayOutputStream.write(bArr, i24, i33 - i24);
                        this.index = i33;
                        i24 = i33;
                    } else {
                        this.index = i24;
                    }
                    while (true) {
                        i2 = this.index;
                        if (i2 < this.endPos) {
                            this.index = i2 + 1;
                            i3 = bArr[i2] & 255;
                        } else {
                            i3 = i32;
                        }
                        if (i3 == i32) {
                            RaiseError("Unterminated String");
                        }
                        if (i3 < i27) {
                            RaiseError("Invalid character in String literal");
                        }
                        if (i3 == i29) {
                            break;
                        }
                        if (i3 == i30) {
                            int i34 = this.index;
                            if (i34 < this.endPos) {
                                this.index = i34 + 1;
                                i4 = bArr[i34] & 255;
                            } else {
                                i4 = -1;
                            }
                            if (i4 == i29 || i4 == 47 || i4 == 92) {
                                if (i2 > i24) {
                                    byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                }
                                i24 = this.index;
                                byteArrayOutputStream.write((byte) i4);
                            } else if (i4 == 98) {
                                if (i2 > i24) {
                                    byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                }
                                i24 = this.index;
                                byteArrayOutputStream.write(8);
                            } else if (i4 == 102) {
                                if (i2 > i24) {
                                    byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                }
                                i24 = this.index;
                                byteArrayOutputStream.write(12);
                            } else if (i4 == 110) {
                                if (i2 > i24) {
                                    byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                }
                                i24 = this.index;
                                byteArrayOutputStream.write(10);
                            } else if (i4 == 114) {
                                if (i2 > i24) {
                                    byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                }
                                i24 = this.index;
                                byteArrayOutputStream.write(13);
                            } else if (i4 == 116) {
                                if (i2 > i24) {
                                    byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                }
                                i24 = this.index;
                                byteArrayOutputStream.write(9);
                            } else if (i4 != 117) {
                                RaiseError("Invalid escaped character");
                            } else {
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    if (i35 >= 4) {
                                        break;
                                    }
                                    int i37 = this.index;
                                    if (i37 < this.endPos) {
                                        this.index = i37 + 1;
                                        b2 = bArr[i37];
                                    } else {
                                        b2 = -1;
                                    }
                                    if (b2 >= 48 && b2 <= 57) {
                                        i9 = i36 << 4;
                                        i10 = b2 + MessagePack.Code.INT8;
                                    } else if (b2 >= 65 && b2 <= 70) {
                                        i9 = i36 << 4;
                                        i10 = b2 + MessagePack.Code.EXT32;
                                    } else if (b2 < 97 || b2 > 102) {
                                        RaiseError("Invalid Unicode escaped character");
                                        i35++;
                                    } else {
                                        i9 = i36 << 4;
                                        i10 = b2 - 87;
                                    }
                                    i36 = (i9 + i10) - (i9 & i10);
                                    i35++;
                                }
                                if ((63488 + i36) - (63488 | i36) != 55296) {
                                    if (i2 > i24) {
                                        byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                    }
                                    i24 = this.index;
                                    if (i36 >= 2048) {
                                        byteArrayOutputStream.write((byte) (((i36 >> 12) & 15) | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
                                        int i38 = (-1) - (((-1) - (i36 >> 6)) | ((-1) - 63));
                                        byteArrayOutputStream.write((byte) ((i38 + 128) - (i38 & 128)));
                                        byteArrayOutputStream.write((byte) (((-1) - (((-1) - i36) | ((-1) - 63))) | 128));
                                    } else if (i36 >= 128) {
                                        byteArrayOutputStream.write((byte) (((i36 >> 6) & 31) | 192));
                                        byteArrayOutputStream.write((byte) (((-1) - (((-1) - i36) | ((-1) - 63))) | 128));
                                    } else {
                                        byteArrayOutputStream.write((byte) i36);
                                    }
                                    i27 = 32;
                                    i28 = 194;
                                    i30 = 92;
                                    i32 = -1;
                                    i31 = 191;
                                } else if ((-1) - (((-1) - 64512) | ((-1) - i36)) == 55296) {
                                    int i39 = this.index;
                                    if (i39 >= this.endPos - 1 || bArr[i39] != 92 || bArr[i39 + 1] != 117) {
                                        RaiseError("Invalid escaped character");
                                    }
                                    this.index += 2;
                                    int i40 = 0;
                                    int i41 = 0;
                                    for (i5 = 4; i40 < i5; i5 = 4) {
                                        int i42 = this.index;
                                        if (i42 < this.endPos) {
                                            this.index = i42 + 1;
                                            i6 = (-1) - (((-1) - bArr[i42]) | ((-1) - 255));
                                        } else {
                                            i6 = -1;
                                        }
                                        if (i6 >= 48 && i6 <= 57) {
                                            i7 = i41 << 4;
                                            i8 = i6 - 48;
                                        } else if (i6 >= 65 && i6 <= 70) {
                                            i7 = i41 << 4;
                                            i8 = i6 - 55;
                                        } else if (i6 < 97 || i6 > 102) {
                                            RaiseError("Invalid Unicode escaped character");
                                            i40++;
                                        } else {
                                            i7 = i41 << 4;
                                            i8 = i6 - 87;
                                        }
                                        i41 = (-1) - (((-1) - i7) & ((-1) - i8));
                                        i40++;
                                    }
                                    if ((64512 & i41) != 56320) {
                                        RaiseError("Unpaired surrogate code point");
                                    } else {
                                        if (i2 > i24) {
                                            byteArrayOutputStream.write(bArr, i24, i2 - i24);
                                        }
                                        i24 = this.index;
                                        int i43 = (((i36 + 1023) - (i36 | 1023)) << 10) + 65536 + (i41 & 1023);
                                        int i44 = (-1) - (((-1) - (i43 >> 18)) | ((-1) - 7));
                                        byteArrayOutputStream.write((byte) ((i44 + 240) - (i44 & 240)));
                                        byteArrayOutputStream.write((byte) (((-1) - (((-1) - (i43 >> 12)) | ((-1) - 63))) | 128));
                                        int i45 = (i43 >> 6) & 63;
                                        byteArrayOutputStream.write((byte) ((i45 + 128) - (i45 & 128)));
                                        byteArrayOutputStream.write((byte) ((-1) - (((-1) - ((i43 + 63) - (i43 | 63))) & ((-1) - 128))));
                                    }
                                } else {
                                    RaiseError("Unpaired surrogate code point");
                                }
                            }
                        } else if (i3 > 127) {
                            if (i3 >= i28 && i3 <= 223) {
                                int i46 = this.index;
                                if (i46 < this.endPos) {
                                    this.index = i46 + 1;
                                    i32 = (-1) - (((-1) - bArr[i46]) | ((-1) - 255));
                                }
                                if (i32 < 128 || i32 > i31) {
                                    RaiseError("Invalid encoding");
                                }
                            } else if (i3 >= 224 && i3 <= 239) {
                                int i47 = this.index;
                                int i48 = this.endPos;
                                if (i47 < i48) {
                                    this.index = i47 + 1;
                                    byte b3 = bArr[i47];
                                    i14 = (b3 + 255) - (b3 | 255);
                                } else {
                                    i14 = -1;
                                }
                                int i49 = this.index;
                                if (i49 < i48) {
                                    this.index = i49 + 1;
                                    i15 = (-1) - (((-1) - bArr[i49]) | ((-1) - 255));
                                } else {
                                    i15 = -1;
                                }
                                int i50 = i3 == 224 ? 160 : 128;
                                int i51 = i3 == 237 ? 159 : i31;
                                if (i14 < i50 || i14 > i51 || i15 < 128 || i15 > i31) {
                                    RaiseError("Invalid encoding");
                                }
                            } else if (i3 < 240 || i3 > 244) {
                                RaiseError("Invalid encoding");
                            } else {
                                int i52 = this.index;
                                int i53 = this.endPos;
                                if (i52 < i53) {
                                    this.index = i52 + 1;
                                    i11 = (-1) - (((-1) - bArr[i52]) | ((-1) - 255));
                                } else {
                                    i11 = -1;
                                }
                                int i54 = this.index;
                                if (i54 < i53) {
                                    this.index = i54 + 1;
                                    i12 = bArr[i54] & 255;
                                } else {
                                    i12 = -1;
                                }
                                int i55 = this.index;
                                if (i55 < i53) {
                                    this.index = i55 + 1;
                                    i13 = (-1) - (((-1) - bArr[i55]) | ((-1) - 255));
                                } else {
                                    i13 = -1;
                                }
                                int i56 = i3 == 240 ? 144 : 128;
                                int i57 = i3 == 244 ? 143 : i31;
                                if (i11 < i56 || i11 > i57 || i12 < 128 || i12 > i31 || i13 < 128 || i13 > i31) {
                                    RaiseError("Invalid encoding");
                                }
                            }
                        }
                        i27 = 32;
                        i28 = 194;
                        i29 = 34;
                        i30 = 92;
                        i32 = -1;
                        i31 = 191;
                    }
                    if (i2 > i24) {
                        byteArrayOutputStream.write(bArr, i24, i2 - i24);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (i26 == 34) {
                int i58 = (this.index - i24) - 1;
                if (i58 == 0) {
                    return valueEmptyBytes;
                }
                byte[] bArr2 = new byte[i58];
                System.arraycopy(bArr, i24, bArr2, 0, i58);
                return bArr2;
            }
            if (i26 >= 128) {
                if (i26 >= 194 && i26 <= 223) {
                    int i59 = this.index;
                    if (i59 < this.endPos) {
                        byte[] bArr3 = this.bytes;
                        this.index = i59 + 1;
                        i23 = bArr3[i59] & 255;
                    } else {
                        i23 = -1;
                    }
                    if (i23 < 128 || i23 > 191) {
                        RaiseError("Invalid encoding");
                    }
                } else if (i26 >= 224 && i26 <= 239) {
                    int i60 = this.index;
                    int i61 = this.endPos;
                    if (i60 < i61) {
                        byte[] bArr4 = this.bytes;
                        this.index = i60 + 1;
                        byte b4 = bArr4[i60];
                        i20 = (b4 + 255) - (b4 | 255);
                    } else {
                        i20 = -1;
                    }
                    int i62 = this.index;
                    if (i62 < i61) {
                        byte[] bArr5 = this.bytes;
                        this.index = i62 + 1;
                        byte b5 = bArr5[i62];
                        i22 = (b5 + 255) - (b5 | 255);
                        i21 = CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY;
                    } else {
                        i21 = CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY;
                        i22 = -1;
                    }
                    int i63 = i26 == i21 ? 160 : 128;
                    int i64 = i26 == 237 ? 159 : 191;
                    if (i20 < i63 || i20 > i64 || i22 < 128 || i22 > 191) {
                        RaiseError("Invalid encoding");
                    }
                } else if (i26 < 240 || i26 > 244) {
                    RaiseError("Invalid encoding");
                } else {
                    int i65 = this.index;
                    int i66 = this.endPos;
                    if (i65 < i66) {
                        byte[] bArr6 = this.bytes;
                        this.index = i65 + 1;
                        byte b6 = bArr6[i65];
                        i16 = (b6 + 255) - (b6 | 255);
                    } else {
                        i16 = -1;
                    }
                    int i67 = this.index;
                    if (i67 < i66) {
                        byte[] bArr7 = this.bytes;
                        this.index = i67 + 1;
                        i17 = (-1) - (((-1) - bArr7[i67]) | ((-1) - 255));
                    } else {
                        i17 = -1;
                    }
                    int i68 = this.index;
                    if (i68 < i66) {
                        byte[] bArr8 = this.bytes;
                        this.index = i68 + 1;
                        byte b7 = bArr8[i68];
                        i19 = (b7 + 255) - (b7 | 255);
                        i18 = 240;
                    } else {
                        i18 = 240;
                        i19 = -1;
                    }
                    int i69 = i26 == i18 ? 144 : 128;
                    int i70 = i26 == 244 ? 143 : 191;
                    if (i16 < i69 || i16 > i70 || i17 < 128 || i17 > 191 || i19 < 128 || i19 > 191) {
                        RaiseError("Invalid encoding");
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.upokecenter.cbor.CBORObject NextJSONValue(int r11, int[] r12, int r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORJson2.NextJSONValue(int, int[], int):com.upokecenter.cbor.CBORObject");
    }

    private CBORObject ParseJSONObject(int i2) {
        if (i2 > 1000) {
            RaiseError("Too deeply nested");
        }
        int[] iArr = new int[1];
        Map mapNewOrderedDict = this.options.getKeepKeyOrder() ? PropertyMap.NewOrderedDict() : new TreeMap();
        boolean z2 = false;
        CBORObject cBORObjectFromRawUtf8 = null;
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
                cBORObjectFromRawUtf8 = CBORObject.FromRawUtf8(NextJSONString());
            }
            if (SkipWhitespaceJSON() != 58) {
                RaiseError("Expected a ':' after a key");
            }
            int size = mapNewOrderedDict.size();
            mapNewOrderedDict.put(cBORObjectFromRawUtf8, NextJSONValue(SkipWhitespaceJSON(), iArr, i2));
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

    static CBORObject ParseJSONValue(byte[] bArr, int i2, int i3, JSONOptions jSONOptions) {
        int[] iArr = new int[1];
        CBORJson2 cBORJson2 = new CBORJson2(bArr, i2, i3, jSONOptions);
        CBORObject cBORObjectParseJSON = cBORJson2.ParseJSON(iArr);
        if (iArr[0] != -1) {
            cBORJson2.RaiseError("End of bytes not reached");
        }
        return cBORObjectParseJSON;
    }

    static CBORObject ParseJSONValue(byte[] bArr, int i2, int i3, JSONOptions jSONOptions, int[] iArr) {
        return new CBORJson2(bArr, i2, i3, jSONOptions).ParseJSON(iArr);
    }

    private int SkipWhitespaceJSON() {
        while (true) {
            int i2 = this.index;
            if (i2 >= this.endPos) {
                return -1;
            }
            byte[] bArr = this.bytes;
            this.index = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 != 32 && b2 != 10 && b2 != 13 && b2 != 9) {
                return b2;
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

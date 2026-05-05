package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class EIntegerByteArrayString {
    private static final int ShortMask = 65535;

    private EIntegerByteArrayString() {
    }

    private static EInteger FromRadixSubstringGeneral(byte[] bArr, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i4 - i3;
        if (i5 <= 72) {
            return FromRadixSubstringInner(bArr, i2, i3, i4, z2, z3);
        }
        int i6 = (i5 / 2) + i3;
        EInteger eIntegerFromRadixSubstringGeneral = FromRadixSubstringGeneral(bArr, i2, i3, i6, false, z3);
        int i7 = i4 - i6;
        EInteger eIntegerAdd = (i2 == 10 ? NumberUtility.MultiplyByPowerOfFive(eIntegerFromRadixSubstringGeneral, i7).ShiftLeft(i7) : i2 == 5 ? NumberUtility.MultiplyByPowerOfFive(eIntegerFromRadixSubstringGeneral, i7) : eIntegerFromRadixSubstringGeneral.Multiply(EInteger.FromInt32(i2).Pow(i7))).Add(FromRadixSubstringGeneral(bArr, i2, i6, i4, false, z3));
        return z2 ? eIntegerAdd.Negate() : eIntegerAdd;
    }

    public static EInteger FromRadixSubstringImpl(byte[] bArr, int i2, int i3, int i4, boolean z2) {
        boolean z3;
        int i5;
        int i6;
        int i7 = i3;
        if (i2 < 2) {
            if (z2) {
                throw new IllegalArgumentException("radix(" + i2 + ") is less than 2");
            }
            return null;
        }
        if (i2 > 36) {
            if (z2) {
                throw new IllegalArgumentException("radix(" + i2 + ") is more than 36");
            }
            return null;
        }
        if (i7 < 0) {
            if (z2) {
                throw new IllegalArgumentException("index(" + i7 + ") is less than 0");
            }
            return null;
        }
        if (i7 > bArr.length) {
            if (z2) {
                throw new IllegalArgumentException("index(" + i7 + ") is more than " + bArr.length);
            }
            return null;
        }
        if (i4 < 0) {
            if (z2) {
                throw new IllegalArgumentException("endIndex(" + i4 + ") is less than 0");
            }
            return null;
        }
        if (i4 > bArr.length) {
            if (z2) {
                throw new IllegalArgumentException("endIndex(" + i4 + ") is more than " + bArr.length);
            }
            return null;
        }
        if (i4 < i7) {
            if (z2) {
                throw new IllegalArgumentException("endIndex(" + i4 + ") is less than " + i7);
            }
            return null;
        }
        if (i7 == i4) {
            if (z2) {
                throw new NumberFormatException("No digits");
            }
            return null;
        }
        int i8 = 0;
        if (bArr[i7] == 45) {
            i7++;
            if (i7 == i4) {
                if (z2) {
                    throw new NumberFormatException("No digits");
                }
                return null;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        while (i7 < i4 && bArr[i7] == 48) {
            i7++;
        }
        int i9 = i4 - i7;
        if (i9 == 0) {
            return EInteger.FromInt32(0);
        }
        int[] iArr = EInteger.CharToDigit;
        if (i2 != 16) {
            if (i2 != 2) {
                return FromRadixSubstringGeneral(bArr, i2, i7, i4, z3, z2);
            }
            int i10 = i9 & 15;
            int i11 = i9 >> 4;
            if (i10 != 0) {
                i11++;
            }
            short[] sArr = new short[i11];
            int i12 = i11 - 1;
            byte b2 = 49;
            if (i10 != 0) {
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 << 1;
                    byte b3 = bArr[i7 + i13];
                    if (b3 == 48) {
                        i5 = 2;
                        i6 = 0;
                    } else if (b3 == b2) {
                        i5 = 2;
                        i6 = 1;
                    } else {
                        i5 = 2;
                        i6 = 2;
                    }
                    if (i6 >= i5) {
                        if (z2) {
                            throw new NumberFormatException("Illegal character found");
                        }
                        return null;
                    }
                    i14 = i15 | i6;
                    i13++;
                    b2 = 49;
                }
                sArr[i12] = (short) i14;
                i7 += i10;
                i12 = i11 - 2;
            }
            while (i7 < i4) {
                int i16 = i7 + 15;
                int i17 = 0;
                for (int i18 = 0; i18 < 16; i18++) {
                    byte b4 = bArr[i16];
                    int i19 = b4 == 48 ? 0 : b4 == 49 ? 1 : 2;
                    if (i19 >= 2) {
                        if (z2) {
                            throw new NumberFormatException("Illegal character found");
                        }
                        return null;
                    }
                    i16--;
                    i17 = (-1) - (((-1) - i17) & ((-1) - (i19 << i18)));
                }
                i7 += 16;
                sArr[i12] = (short) i17;
                i12--;
            }
            int iCountWords = EInteger.CountWords(sArr);
            return iCountWords == 0 ? EInteger.FromInt32(0) : new EInteger(iCountWords, sArr, z3);
        }
        int i20 = (i9 + 3) - (3 | i9);
        int i21 = i9 >> 2;
        if (i20 != 0) {
            i21++;
        }
        short[] sArr2 = new short[i21];
        int i22 = i21 - 1;
        if (i20 != 0) {
            for (int i23 = 0; i23 < i20; i23++) {
                int i24 = i8 << 4;
                byte b5 = bArr[i7 + i23];
                int i25 = b5 >= 128 ? 36 : iArr[b5];
                if (i25 >= 16) {
                    if (z2) {
                        throw new NumberFormatException("Illegal character found");
                    }
                    return null;
                }
                i8 = i24 | i25;
            }
            sArr2[i22] = (short) i8;
            i22 = i21 - 2;
            i7 += i20;
        }
        while (i7 < i4) {
            byte b6 = bArr[i7 + 3];
            int i26 = b6 >= 128 ? 36 : iArr[b6];
            if (i26 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            byte b7 = bArr[i7 + 2];
            int i27 = b7 >= 128 ? 36 : iArr[b7];
            if (i27 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            int i28 = (-1) - (((-1) - i26) & ((-1) - (i27 << 4)));
            byte b8 = bArr[i7 + 1];
            int i29 = b8 >= 128 ? 36 : iArr[b8];
            if (i29 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            int i30 = i29 << 8;
            int i31 = (i28 + i30) - (i28 & i30);
            byte b9 = bArr[i7];
            int i32 = b9 >= 128 ? 36 : iArr[b9];
            if (i32 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            i7 += 4;
            sArr2[i22] = (short) (i31 | (i32 << 12));
            i22--;
        }
        int iCountWords2 = EInteger.CountWords(sArr2);
        return iCountWords2 == 0 ? EInteger.FromInt32(0) : new EInteger(iCountWords2, sArr2, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r27 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        throw new java.lang.NumberFormatException("Illegal character found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r27 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
    
        throw new java.lang.NumberFormatException("Illegal character found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EInteger FromRadixSubstringInner(byte[] r22, int r23, int r24, int r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EIntegerByteArrayString.FromRadixSubstringInner(byte[], int, int, int, boolean, boolean):com.upokecenter.numbers.EInteger");
    }
}

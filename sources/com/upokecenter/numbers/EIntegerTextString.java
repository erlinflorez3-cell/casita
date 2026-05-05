package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class EIntegerTextString {
    private static final int ShortMask = 65535;

    private EIntegerTextString() {
    }

    private static EInteger FromRadixSubstringGeneral(String str, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i4 - i3;
        if (i5 <= 72) {
            return FromRadixSubstringInner(str, i2, i3, i4, z2, z3);
        }
        int i6 = (i5 / 2) + i3;
        EInteger eIntegerFromRadixSubstringGeneral = FromRadixSubstringGeneral(str, i2, i3, i6, false, z3);
        int i7 = i4 - i6;
        EInteger eIntegerAdd = (i2 == 10 ? NumberUtility.MultiplyByPowerOfFive(eIntegerFromRadixSubstringGeneral, i7).ShiftLeft(i7) : i2 == 5 ? NumberUtility.MultiplyByPowerOfFive(eIntegerFromRadixSubstringGeneral, i7) : eIntegerFromRadixSubstringGeneral.Multiply(EInteger.FromInt32(i2).Pow(i7))).Add(FromRadixSubstringGeneral(str, i2, i6, i4, false, z3));
        return z2 ? eIntegerAdd.Negate() : eIntegerAdd;
    }

    public static EInteger FromRadixSubstringImpl(String str, int i2, int i3, int i4, boolean z2) {
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
        if (i7 > str.length()) {
            if (z2) {
                throw new IllegalArgumentException("index(" + i7 + ") is more than " + str.length());
            }
            return null;
        }
        if (i4 < 0) {
            if (z2) {
                throw new IllegalArgumentException("endIndex(" + i4 + ") is less than 0");
            }
            return null;
        }
        if (i4 > str.length()) {
            if (z2) {
                throw new IllegalArgumentException("endIndex(" + i4 + ") is more than " + str.length());
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
        if (str.charAt(i7) == '-') {
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
        while (i7 < i4 && str.charAt(i7) == '0') {
            i7++;
        }
        int i9 = i4 - i7;
        if (i9 == 0) {
            return EInteger.FromInt32(0);
        }
        int[] iArr = EInteger.CharToDigit;
        if (i2 != 16) {
            if (i2 != 2) {
                return FromRadixSubstringGeneral(str, i2, i7, i4, z3, z2);
            }
            int i10 = (i9 + 15) - (15 | i9);
            int i11 = i9 >> 4;
            if (i10 != 0) {
                i11++;
            }
            short[] sArr = new short[i11];
            int i12 = i11 - 1;
            char c2 = '1';
            if (i10 != 0) {
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 << 1;
                    char cCharAt = str.charAt(i7 + i13);
                    if (cCharAt == '0') {
                        i5 = 2;
                        i6 = 0;
                    } else if (cCharAt == c2) {
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
                    c2 = '1';
                }
                sArr[i12] = (short) i14;
                i7 += i10;
                i12 = i11 - 2;
            }
            while (i7 < i4) {
                int i16 = i7 + 15;
                int i17 = 0;
                for (int i18 = 0; i18 < 16; i18++) {
                    char cCharAt2 = str.charAt(i16);
                    int i19 = cCharAt2 == '0' ? 0 : cCharAt2 == '1' ? 1 : 2;
                    if (i19 >= 2) {
                        if (z2) {
                            throw new NumberFormatException("Illegal character found");
                        }
                        return null;
                    }
                    i16--;
                    i17 |= i19 << i18;
                }
                i7 += 16;
                sArr[i12] = (short) i17;
                i12--;
            }
            int iCountWords = EInteger.CountWords(sArr);
            return iCountWords == 0 ? EInteger.FromInt32(0) : new EInteger(iCountWords, sArr, z3);
        }
        int i20 = (-1) - (((-1) - i9) | ((-1) - 3));
        int i21 = i9 >> 2;
        if (i20 != 0) {
            i21++;
        }
        short[] sArr2 = new short[i21];
        int i22 = i21 - 1;
        if (i20 != 0) {
            for (int i23 = 0; i23 < i20; i23++) {
                int i24 = i8 << 4;
                char cCharAt3 = str.charAt(i7 + i23);
                int i25 = cCharAt3 >= 128 ? 36 : iArr[cCharAt3];
                if (i25 >= 16) {
                    if (z2) {
                        throw new NumberFormatException("Illegal character found");
                    }
                    return null;
                }
                i8 = (i24 + i25) - (i24 & i25);
            }
            sArr2[i22] = (short) i8;
            i22 = i21 - 2;
            i7 += i20;
        }
        while (i7 < i4) {
            char cCharAt4 = str.charAt(i7 + 3);
            int i26 = cCharAt4 >= 128 ? 36 : iArr[cCharAt4];
            if (i26 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            char cCharAt5 = str.charAt(i7 + 2);
            int i27 = cCharAt5 >= 128 ? 36 : iArr[cCharAt5];
            if (i27 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            int i28 = i26 | (i27 << 4);
            char cCharAt6 = str.charAt(i7 + 1);
            int i29 = cCharAt6 >= 128 ? 36 : iArr[cCharAt6];
            if (i29 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            int i30 = (-1) - (((-1) - i28) & ((-1) - (i29 << 8)));
            char cCharAt7 = str.charAt(i7);
            int i31 = cCharAt7 >= 128 ? 36 : iArr[cCharAt7];
            if (i31 >= 16) {
                if (z2) {
                    throw new NumberFormatException("Illegal character found");
                }
                return null;
            }
            i7 += 4;
            sArr2[i22] = (short) ((-1) - (((-1) - i30) & ((-1) - (i31 << 12))));
            i22--;
        }
        int iCountWords2 = EInteger.CountWords(sArr2);
        return iCountWords2 == 0 ? EInteger.FromInt32(0) : new EInteger(iCountWords2, sArr2, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r27 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        throw new java.lang.NumberFormatException("Illegal character found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r27 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        throw new java.lang.NumberFormatException("Illegal character found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EInteger FromRadixSubstringInner(java.lang.String r22, int r23, int r24, int r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EIntegerTextString.FromRadixSubstringInner(java.lang.String, int, int, int, boolean, boolean):com.upokecenter.numbers.EInteger");
    }
}

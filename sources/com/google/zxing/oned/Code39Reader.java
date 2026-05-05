package com.google.zxing.oned;

import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Code39Reader extends OneDReader {
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    static final int ASTERISK_ENCODING = 148;
    static final int[] CHARACTER_ENCODINGS = {52, 289, 97, 352, 49, 304, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 37, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, ExifDirectoryBase.TAG_TILE_WIDTH, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};
    private final int[] counters;
    private final StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader() {
        this(false);
    }

    public Code39Reader(boolean z2) {
        this(z2, false);
    }

    public Code39Reader(boolean z2, boolean z3) {
        this.usingCheckDigit = z2;
        this.extendedMode = z3;
        this.decodeRowResult = new StringBuilder(20);
        this.counters = new int[9];
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String decodeExtended(java.lang.CharSequence r12) throws com.google.zxing.FormatException {
        /*
            int r5 = r12.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r11 = 0
            r3 = r11
        Lb:
            if (r3 >= r5) goto Lb7
            char r10 = r12.charAt(r3)
            r9 = 47
            r8 = 37
            r6 = 36
            r7 = 43
            if (r10 == r7) goto L21
            if (r10 == r6) goto L21
            if (r10 == r8) goto L21
            if (r10 != r9) goto L9f
        L21:
            int r3 = r3 + 1
            char r2 = r12.charAt(r3)
            r1 = 90
            r0 = 65
            if (r10 == r6) goto L8b
            r6 = 79
            if (r10 == r8) goto L43
            if (r10 == r7) goto L3c
            if (r10 == r9) goto L92
        L35:
            r0 = r11
        L36:
            r4.append(r0)
        L39:
            int r3 = r3 + 1
            goto Lb
        L3c:
            if (r2 < r0) goto La3
            if (r2 > r1) goto La3
            int r0 = r2 + 32
            goto L98
        L43:
            if (r2 < r0) goto L4c
            r0 = 69
            if (r2 > r0) goto L4c
            int r0 = r2 + (-38)
            goto L98
        L4c:
            r0 = 70
            if (r2 < r0) goto L57
            r0 = 74
            if (r2 > r0) goto L57
            int r0 = r2 + (-11)
            goto L98
        L57:
            r0 = 75
            if (r2 < r0) goto L60
            if (r2 > r6) goto L60
            int r0 = r2 + 16
            goto L98
        L60:
            r0 = 80
            if (r2 < r0) goto L6b
            r0 = 84
            if (r2 > r0) goto L6b
            int r0 = r2 + 43
            goto L98
        L6b:
            r0 = 85
            if (r2 != r0) goto L70
            goto L35
        L70:
            r0 = 86
            if (r2 != r0) goto L77
            r0 = 64
            goto L36
        L77:
            r0 = 87
            if (r2 != r0) goto L7e
            r0 = 96
            goto L36
        L7e:
            r0 = 88
            if (r2 == r0) goto L88
            r0 = 89
            if (r2 == r0) goto L88
            if (r2 != r1) goto La8
        L88:
            r0 = 127(0x7f, float:1.78E-43)
            goto L36
        L8b:
            if (r2 < r0) goto Lb2
            if (r2 > r1) goto Lb2
            int r0 = r2 + (-64)
            goto L98
        L92:
            if (r2 < r0) goto L9a
            if (r2 > r6) goto L9a
            int r0 = r2 + (-32)
        L98:
            char r0 = (char) r0
            goto L36
        L9a:
            if (r2 != r1) goto Lad
            r0 = 58
            goto L36
        L9f:
            r4.append(r10)
            goto L39
        La3:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        La8:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        Lad:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        Lb2:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        Lb7:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code39Reader.decodeExtended(java.lang.CharSequence):java.lang.String");
    }

    private static int[] findAsteriskPattern(BitArray bitArray, int[] iArr) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int length = iArr.length;
        boolean z2 = false;
        int i2 = 0;
        int i3 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z2) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (toNarrowWidePattern(iArr) == 148 && bitArray.isRange(Math.max(0, i3 - ((nextSet - i3) / 2)), i3, false)) {
                        return new int[]{i3, nextSet};
                    }
                    i3 += iArr[0] + iArr[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z2 = !z2;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int i2) throws NotFoundException {
        int i3 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i3 >= iArr.length) {
                if (i2 == 148) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i3] == i2) {
                return ALPHABET_STRING.charAt(i3);
            }
            i3++;
        }
    }

    private static int toNarrowWidePattern(int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            int i3 = Integer.MAX_VALUE;
            for (int i4 : iArr) {
                if (i4 < i3 && i4 > i2) {
                    i3 = i4;
                }
            }
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = iArr[i8];
                if (i9 > i3) {
                    i6 |= 1 << ((length - 1) - i8);
                    i5++;
                    i7 += i9;
                }
            }
            if (i5 == 3) {
                for (int i10 = 0; i10 < length && i5 > 0; i10++) {
                    int i11 = iArr[i10];
                    if (i11 > i3) {
                        i5--;
                        if ((i11 << 1) >= i7) {
                            return -1;
                        }
                    }
                }
                return i6;
            }
            if (i5 <= 3) {
                return -1;
            }
            i2 = i3;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray, iArr)[1]);
        int size = bitArray.getSize();
        while (true) {
            recordPattern(bitArray, nextSet, iArr);
            int narrowWidePattern = toNarrowWidePattern(iArr);
            if (narrowWidePattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cPatternToChar = patternToChar(narrowWidePattern);
            sb.append(cPatternToChar);
            int i3 = nextSet;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int nextSet2 = bitArray.getNextSet(i3);
            if (cPatternToChar == '*') {
                sb.setLength(sb.length() - 1);
                int i5 = 0;
                for (int i6 : iArr) {
                    i5 += i6;
                }
                int i7 = (nextSet2 - nextSet) - i5;
                if (nextSet2 != size && (i7 << 1) < i5) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.usingCheckDigit) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i8 = 0; i8 < length; i8++) {
                        iIndexOf += ALPHABET_STRING.indexOf(this.decodeRowResult.charAt(i8));
                    }
                    if (sb.charAt(length) != ALPHABET_STRING.charAt(iIndexOf % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f2 = i2;
                return new Result(this.extendedMode ? decodeExtended(sb) : sb.toString(), null, new ResultPoint[]{new ResultPoint((r12[1] + r12[0]) / 2.0f, f2), new ResultPoint(nextSet + (i5 / 2.0f), f2)}, BarcodeFormat.CODE_39);
            }
            nextSet = nextSet2;
        }
    }
}

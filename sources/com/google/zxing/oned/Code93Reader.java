package com.google.zxing.oned;

import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Code93Reader extends OneDReader {
    static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private final int[] counters = new int[6];

    static {
        int[] iArr = {276, 328, ExifDirectoryBase.TAG_TILE_OFFSETS, ExifDirectoryBase.TAG_TILE_WIDTH, 296, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, IptcDirectory.TAG_TIME_SENT, 274, 266, 424, 420, 418, HttpStatus.SC_NOT_FOUND, 402, 394, SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS, IptcDirectory.TAG_UNIQUE_OBJECT_NAME, 354, 308, 282, 344, 332, IptcDirectory.TAG_DATE_SENT, 300, 278, 436, 434, 428, 422, HttpStatus.SC_NOT_ACCEPTABLE, HttpStatus.SC_GONE, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    private static void checkChecksums(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static void checkOneChecksum(CharSequence charSequence, int i2, int i3) throws ChecksumException {
        int iIndexOf = 0;
        int i4 = 1;
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            iIndexOf += ALPHABET_STRING.indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i3) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i2) != ALPHABET[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String decodeExtended(java.lang.CharSequence r9) throws com.google.zxing.FormatException {
        /*
            int r3 = r9.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r8 = 0
            r1 = r8
        Lb:
            if (r1 >= r3) goto Laf
            char r7 = r9.charAt(r1)
            r0 = 97
            if (r7 < r0) goto L92
            r0 = 100
            if (r7 > r0) goto L92
            int r0 = r3 + (-1)
            if (r1 >= r0) goto Laa
            int r1 = r1 + 1
            char r5 = r9.charAt(r1)
            r6 = 79
            r4 = 90
            r0 = 65
            switch(r7) {
                case 97: goto L33;
                case 98: goto L3a;
                case 99: goto L7e;
                case 100: goto L8a;
                default: goto L2c;
            }
        L2c:
            r0 = r8
        L2d:
            r2.append(r0)
        L30:
            int r1 = r1 + 1
            goto Lb
        L33:
            if (r5 < r0) goto L96
            if (r5 > r4) goto L96
            int r0 = r5 + (-64)
            goto L90
        L3a:
            if (r5 < r0) goto L43
            r0 = 69
            if (r5 > r0) goto L43
            int r0 = r5 + (-38)
            goto L90
        L43:
            r0 = 70
            if (r5 < r0) goto L4e
            r0 = 74
            if (r5 > r0) goto L4e
            int r0 = r5 + (-11)
            goto L90
        L4e:
            r0 = 75
            if (r5 < r0) goto L57
            if (r5 > r6) goto L57
            int r0 = r5 + 16
            goto L90
        L57:
            r0 = 80
            if (r5 < r0) goto L62
            r0 = 84
            if (r5 > r0) goto L62
            int r0 = r5 + 43
            goto L90
        L62:
            r0 = 85
            if (r5 != r0) goto L67
            goto L2c
        L67:
            r0 = 86
            if (r5 != r0) goto L6e
            r0 = 64
            goto L2d
        L6e:
            r0 = 87
            if (r5 != r0) goto L75
            r0 = 96
            goto L2d
        L75:
            r0 = 88
            if (r5 < r0) goto L9b
            if (r5 > r4) goto L9b
            r0 = 127(0x7f, float:1.78E-43)
            goto L2d
        L7e:
            if (r5 < r0) goto L85
            if (r5 > r6) goto L85
            int r0 = r5 + (-32)
            goto L90
        L85:
            if (r5 != r4) goto La0
            r0 = 58
            goto L2d
        L8a:
            if (r5 < r0) goto La5
            if (r5 > r4) goto La5
            int r0 = r5 + 32
        L90:
            char r0 = (char) r0
            goto L2d
        L92:
            r2.append(r7)
            goto L30
        L96:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        L9b:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        La0:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        La5:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        Laa:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        Laf:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code93Reader.decodeExtended(java.lang.CharSequence):java.lang.String");
    }

    private int[] findAsteriskPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.counters, 0);
        int[] iArr = this.counters;
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
                    if (toPattern(iArr) == ASTERISK_ENCODING) {
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
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i3] == i2) {
                return ALPHABET[i3];
            }
            i3++;
        }
    }

    private static int toPattern(int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int iRound = Math.round((iArr[i5] * 9.0f) / i2);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i5 + 1) - (1 | i5) == 0) {
                for (int i6 = 0; i6 < iRound; i6++) {
                    i4 = (-1) - (((-1) - (i4 << 1)) & ((-1) - 1));
                }
            } else {
                i4 <<= iRound;
            }
        }
        return i4;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray)[1]);
        int size = bitArray.getSize();
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        while (true) {
            recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cPatternToChar = patternToChar(pattern);
            sb.append(cPatternToChar);
            int i3 = nextSet;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int nextSet2 = bitArray.getNextSet(i3);
            if (cPatternToChar == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i5 = 0;
                for (int i6 : iArr) {
                    i5 += i6;
                }
                if (nextSet2 == size || !bitArray.get(nextSet2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                checkChecksums(sb);
                sb.setLength(sb.length() - 2);
                float f2 = i2;
                return new Result(decodeExtended(sb), null, new ResultPoint[]{new ResultPoint((r12[1] + r12[0]) / 2.0f, f2), new ResultPoint(nextSet + (i5 / 2.0f), f2)}, BarcodeFormat.CODE_93);
            }
            nextSet = nextSet2;
        }
    }
}

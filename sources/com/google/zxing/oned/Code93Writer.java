package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Collection;
import java.util.Collections;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    private static int appendPattern(boolean[] zArr, int i2, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            boolean z2 = true;
            int i5 = i2 + i4;
            if (((1 << (8 - i4)) & i3) == 0) {
                z2 = false;
            }
            zArr[i5] = z2;
        }
        return 9;
    }

    @Deprecated
    protected static int appendPattern(boolean[] zArr, int i2, int[] iArr, boolean z2) {
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    private static int computeChecksumIndex(String str, int i2) {
        int iIndexOf = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        return iIndexOf % 47;
    }

    static String convertToExtended(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 0) {
                sb.append("bU");
            } else if (cCharAt <= 26) {
                sb.append('a');
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb.append('b');
                sb.append((char) (cCharAt + Typography.amp));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb.append('c');
                sb.append((char) (cCharAt + TokenParser.SP));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt == ':') {
                sb.append("cZ");
            } else if (cCharAt <= '?') {
                sb.append('b');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb.append("bV");
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('b');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb.append("bW");
            } else if (cCharAt <= 'z') {
                sb.append('d');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
                sb.append('b');
                sb.append((char) (cCharAt - '+'));
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        String strConvertToExtended = convertToExtended(str);
        int length = strConvertToExtended.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[((strConvertToExtended.length() + 4) * 9) + 1];
        int iAppendPattern = appendPattern(zArr, 0, Code93Reader.ASTERISK_ENCODING);
        for (int i2 = 0; i2 < length; i2++) {
            iAppendPattern += appendPattern(zArr, iAppendPattern, Code93Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strConvertToExtended.charAt(i2))]);
        }
        int iComputeChecksumIndex = computeChecksumIndex(strConvertToExtended, 20);
        int iAppendPattern2 = iAppendPattern + appendPattern(zArr, iAppendPattern, Code93Reader.CHARACTER_ENCODINGS[iComputeChecksumIndex]);
        int iAppendPattern3 = iAppendPattern2 + appendPattern(zArr, iAppendPattern2, Code93Reader.CHARACTER_ENCODINGS[computeChecksumIndex(strConvertToExtended + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iComputeChecksumIndex), 15)]);
        zArr[iAppendPattern3 + appendPattern(zArr, iAppendPattern3, Code93Reader.ASTERISK_ENCODING)] = true;
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }
}

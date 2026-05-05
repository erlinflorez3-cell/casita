package com.drew.metadata.iptc;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class Iso2022Converter {
    private static final int DOT = 14844066;
    private static final byte DOT_SIGN = 46;
    private static final byte ESC = 27;
    private static final String ISO_8859_1 = "ISO-8859-1";
    private static final byte LATIN_CAPITAL_A = 65;
    private static final byte LATIN_CAPITAL_G = 71;
    private static final byte PERCENT_SIGN = 37;
    private static final String UTF_8 = "UTF-8";

    private Iso2022Converter() {
    }

    public static String convertISO2022CharsetToJavaCharset(byte[] bArr) {
        if (bArr.length > 2 && bArr[0] == 27 && bArr[1] == 37 && bArr[2] == 71) {
            return "UTF-8";
        }
        if (bArr.length > 2 && bArr[0] == 27 && bArr[1] == 46 && bArr[2] == 65) {
            return "ISO-8859-1";
        }
        if (bArr.length <= 3 || bArr[0] != 27) {
            return null;
        }
        byte b2 = bArr[3];
        int i2 = ((b2 + 255) - (b2 | 255)) | ((bArr[2] & 255) << 8);
        int i3 = ((-1) - (((-1) - bArr[1]) | ((-1) - 255))) << 16;
        if ((i2 + i3) - (i2 & i3) == DOT && bArr[4] == 65) {
            return "ISO-8859-1";
        }
        return null;
    }

    static Charset guessCharSet(byte[] bArr) {
        String[] strArr = {"UTF-8", System.getProperty("file.encoding"), "ISO-8859-1"};
        for (int i2 = 0; i2 < 3; i2++) {
            Charset charsetForName = Charset.forName(strArr[i2]);
            try {
                charsetForName.newDecoder().decode(ByteBuffer.wrap(bArr));
                return charsetForName;
            } catch (CharacterCodingException unused) {
            }
        }
        return null;
    }
}

package com.adobe.internal.xmp.impl;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class Latin1Converter {
    private static final int STATE_START = 0;
    private static final int STATE_UTF8CHAR = 11;

    private Latin1Converter() {
    }

    public static ByteBuffer convert(ByteBuffer byteBuffer) {
        if (!"UTF-8".equals(byteBuffer.getEncoding())) {
            return byteBuffer;
        }
        byte[] bArr = new byte[8];
        ByteBuffer byteBuffer2 = new ByteBuffer((byteBuffer.length() * 4) / 3);
        int i2 = 0;
        char c2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < byteBuffer.length()) {
            int iCharAt = byteBuffer.charAt(i2);
            if (c2 == 11) {
                if (i3 <= 0 || (192 & iCharAt) != 128) {
                    byteBuffer2.append(convertToUTF8(bArr[0]));
                    i2 -= i4;
                } else {
                    int i5 = i4 + 1;
                    bArr[i4] = (byte) iCharAt;
                    i3--;
                    if (i3 == 0) {
                        byteBuffer2.append(bArr, 0, i5);
                    } else {
                        i4 = i5;
                    }
                }
                c2 = 0;
                i4 = 0;
            } else if (iCharAt < 127) {
                byteBuffer2.append((byte) iCharAt);
            } else if (iCharAt >= 192) {
                i3 = -1;
                for (int i6 = iCharAt; i3 < 8 && (-1) - (((-1) - i6) | ((-1) - 128)) == 128; i6 <<= 1) {
                    i3++;
                }
                bArr[i4] = (byte) iCharAt;
                i4++;
                c2 = 11;
            } else {
                byteBuffer2.append(convertToUTF8((byte) iCharAt));
            }
            i2++;
        }
        if (c2 == 11) {
            for (int i7 = 0; i7 < i4; i7++) {
                byteBuffer2.append(convertToUTF8(bArr[i7]));
            }
        }
        return byteBuffer2;
    }

    private static byte[] convertToUTF8(byte b2) {
        int i2 = b2 & 255;
        if (i2 >= 128) {
            try {
                return (i2 == 129 || i2 == 141 || i2 == 143 || i2 == 144 || i2 == 157) ? new byte[]{32} : new String(new byte[]{b2}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b2};
    }
}

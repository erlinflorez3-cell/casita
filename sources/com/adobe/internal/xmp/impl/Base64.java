package com.adobe.internal.xmp.impl;

/* JADX INFO: loaded from: classes4.dex */
public class Base64 {
    private static final byte EQUAL = -3;
    private static final byte INVALID = -1;
    private static final byte WHITESPACE = -2;
    private static byte[] base64 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static byte[] ascii = new byte[255];

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 255; i3++) {
            ascii[i3] = -1;
        }
        while (true) {
            byte[] bArr = base64;
            if (i2 >= bArr.length) {
                byte[] bArr2 = ascii;
                bArr2[9] = WHITESPACE;
                bArr2[10] = WHITESPACE;
                bArr2[13] = WHITESPACE;
                bArr2[32] = WHITESPACE;
                bArr2[61] = EQUAL;
                return;
            }
            ascii[bArr[i2]] = (byte) i2;
            i2++;
        }
    }

    public static final String decode(String str) {
        return new String(decode(str.getBytes()));
    }

    public static final byte[] decode(byte[] bArr) throws IllegalArgumentException {
        int i2 = 0;
        int i3 = 0;
        for (byte b2 : bArr) {
            byte b3 = ascii[b2];
            if (b3 >= 0) {
                bArr[i3] = b3;
                i3++;
            } else if (b3 == -1) {
                throw new IllegalArgumentException("Invalid base 64 string");
            }
        }
        while (i3 > 0 && bArr[i3 - 1] == -3) {
            i3--;
        }
        int i4 = (i3 * 3) / 4;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        while (i2 < i4 - 2) {
            int i6 = (bArr[i5] << 2) & 255;
            int i7 = i5 + 1;
            int i8 = (-1) - (((-1) - (bArr[i7] >>> 4)) | ((-1) - 3));
            bArr2[i2] = (byte) ((i6 + i8) - (i6 & i8));
            int i9 = bArr[i7] << 4;
            int i10 = (i9 + 255) - (i9 | 255);
            int i11 = i5 + 2;
            int i12 = bArr[i11] >>> 2;
            int i13 = (i12 + 15) - (i12 | 15);
            bArr2[i2 + 1] = (byte) ((i10 + i13) - (i10 & i13));
            bArr2[i2 + 2] = (byte) ((-1) - (((-1) - ((bArr[i11] << 6) & 255)) & ((-1) - ((-1) - (((-1) - bArr[i5 + 3]) | ((-1) - 63))))));
            i5 += 4;
            i2 += 3;
        }
        if (i2 < i4) {
            int i14 = (bArr[i5] << 2) & 255;
            int i15 = (bArr[i5 + 1] >>> 4) & 3;
            bArr2[i2] = (byte) ((i14 + i15) - (i14 & i15));
        }
        int i16 = i2 + 1;
        if (i16 < i4) {
            bArr2[i16] = (byte) (((bArr[i5 + 2] >>> 2) & 15) | ((-1) - (((-1) - (bArr[i5 + 1] << 4)) | ((-1) - 255))));
        }
        return bArr2;
    }

    public static final String encode(String str) {
        return new String(encode(str.getBytes()));
    }

    public static final byte[] encode(byte[] bArr) {
        return encode(bArr, 0);
    }

    public static final byte[] encode(byte[] bArr, int i2) {
        int i3 = (i2 / 4) * 4;
        int i4 = 0;
        if (i3 < 0) {
            i3 = 0;
        }
        int length = ((bArr.length + 2) / 3) * 4;
        if (i3 > 0) {
            length += (length - 1) / i3;
        }
        byte[] bArr2 = new byte[length];
        int i5 = 0;
        int i6 = 0;
        while (i4 + 3 <= bArr.length) {
            byte b2 = bArr[i4];
            int i7 = ((b2 + 255) - (b2 | 255)) << 16;
            int i8 = i4 + 2;
            byte b3 = bArr[i4 + 1];
            int i9 = (((b3 + 255) - (b3 | 255)) << 8) | i7;
            i4 += 3;
            int i10 = (-1) - (((-1) - bArr[i8]) | ((-1) - 255));
            int i11 = (i9 + i10) - (i9 & i10);
            byte[] bArr3 = base64;
            bArr2[i5] = bArr3[((-1) - (((-1) - i11) | ((-1) - 16515072))) >> 18];
            bArr2[i5 + 1] = bArr3[((-1) - (((-1) - i11) | ((-1) - 258048))) >> 12];
            bArr2[i5 + 2] = bArr3[((-1) - (((-1) - i11) | ((-1) - 4032))) >> 6];
            int i12 = i5 + 4;
            bArr2[i5 + 3] = bArr3[(-1) - (((-1) - i11) | ((-1) - 63))];
            i6 += 4;
            if (i12 >= length || i3 <= 0 || i6 % i3 != 0) {
                i5 = i12;
            } else {
                i5 += 5;
                bArr2[i12] = 10;
            }
        }
        if (bArr.length - i4 == 2) {
            int i13 = ((-1) - (((-1) - bArr[i4]) | ((-1) - 255))) << 16;
            byte b4 = bArr[i4 + 1];
            int i14 = ((b4 + 255) - (b4 | 255)) << 8;
            int i15 = (i14 + i13) - (i14 & i13);
            byte[] bArr4 = base64;
            bArr2[i5] = bArr4[((-1) - (((-1) - i15) | ((-1) - 16515072))) >> 18];
            bArr2[i5 + 1] = bArr4[(i15 & 258048) >> 12];
            bArr2[i5 + 2] = bArr4[((i15 + 4032) - (i15 | 4032)) >> 6];
            bArr2[i5 + 3] = kotlin.io.encoding.Base64.padSymbol;
        } else if (bArr.length - i4 == 1) {
            byte b5 = bArr[i4];
            int i16 = ((b5 + 255) - (b5 | 255)) << 16;
            byte[] bArr5 = base64;
            bArr2[i5] = bArr5[((-1) - (((-1) - i16) | ((-1) - 16515072))) >> 18];
            bArr2[i5 + 1] = bArr5[(i16 & 258048) >> 12];
            bArr2[i5 + 2] = kotlin.io.encoding.Base64.padSymbol;
            bArr2[i5 + 3] = kotlin.io.encoding.Base64.padSymbol;
        }
        return bArr2;
    }
}

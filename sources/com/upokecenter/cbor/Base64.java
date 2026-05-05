package com.upokecenter.cbor;

import com.google.common.base.Ascii;
import java.io.IOException;
import okio.Utf8;

/* JADX INFO: loaded from: classes5.dex */
final class Base64 {
    private static final String Base64Classic = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final String Base64URL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";

    private Base64() {
    }

    public static void WriteBase64(StringOutput stringOutput, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        WriteBase64(stringOutput, bArr, i2, i3, true, z2);
    }

    private static void WriteBase64(StringOutput stringOutput, byte[] bArr, int i2, int i3, boolean z2, boolean z3) throws IOException {
        int i4 = i2;
        if (stringOutput == null) {
            throw new NullPointerException("writer");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("offset(" + i4 + ") is less than 0 ");
        }
        if (i4 > bArr.length) {
            throw new IllegalArgumentException("offset(" + i4 + ") is more than " + bArr.length);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("count(" + i3 + ") is less than 0 ");
        }
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("count(" + i3 + ") is more than " + bArr.length);
        }
        if (bArr.length - i4 < i3) {
            throw new IllegalArgumentException("data's length minus " + i4 + "(" + (bArr.length - i4) + ") is less than " + i3);
        }
        String str = z2 ? Base64Classic : Base64URL;
        int i5 = i4 + i3;
        byte[] bArr2 = new byte[32];
        int i6 = 0;
        while (i4 < i5 - 2) {
            if (i6 >= 32) {
                stringOutput.WriteAscii(bArr2, 0, i6);
                i6 = 0;
            }
            bArr2[i6] = (byte) str.charAt((bArr[i4] >> 2) & 63);
            int i7 = (bArr[i4] & 3) << 4;
            int i8 = i4 + 1;
            int i9 = bArr[i8] >> 4;
            bArr2[i6 + 1] = (byte) str.charAt(i7 + ((i9 + 15) - (i9 | 15)));
            int i10 = i6 + 3;
            int i11 = i4 + 2;
            bArr2[i6 + 2] = (byte) str.charAt((((-1) - (((-1) - bArr[i8]) | ((-1) - 15))) << 2) + ((bArr[i11] >> 6) & 3));
            i6 += 4;
            byte b2 = bArr[i11];
            bArr2[i10] = (byte) str.charAt((b2 + Utf8.REPLACEMENT_BYTE) - (b2 | Utf8.REPLACEMENT_BYTE));
            i4 += 3;
        }
        int i12 = i3 % 3;
        if (i12 != 0) {
            if (i6 >= 32) {
                stringOutput.WriteAscii(bArr2, 0, i6);
                i6 = 0;
            }
            int i13 = i5 - i12;
            int i14 = i6 + 1;
            int i15 = bArr[i13] >> 2;
            bArr2[i6] = (byte) str.charAt((i15 + 63) - (i15 | 63));
            if (i12 == 2) {
                int i16 = i13 + 1;
                bArr2[i14] = (byte) str.charAt(((bArr[i13] & 3) << 4) + ((-1) - (((-1) - (bArr[i16] >> 4)) | ((-1) - 15))));
                int i17 = i6 + 3;
                byte b3 = bArr[i16];
                bArr2[i6 + 2] = (byte) str.charAt(((b3 + Ascii.SI) - (b3 | Ascii.SI)) << 2);
                if (z3) {
                    i6 += 4;
                    bArr2[i17] = kotlin.io.encoding.Base64.padSymbol;
                } else {
                    i6 = i17;
                }
            } else {
                int i18 = i6 + 2;
                bArr2[i14] = (byte) str.charAt((bArr[i13] & 3) << 4);
                if (z3) {
                    int i19 = i6 + 3;
                    bArr2[i18] = kotlin.io.encoding.Base64.padSymbol;
                    i6 += 4;
                    bArr2[i19] = kotlin.io.encoding.Base64.padSymbol;
                } else {
                    i6 = i18;
                }
            }
        }
        if (i6 >= 0) {
            stringOutput.WriteAscii(bArr2, 0, i6);
        }
    }

    public static void WriteBase64URL(StringOutput stringOutput, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        WriteBase64(stringOutput, bArr, i2, i3, false, z2);
    }
}

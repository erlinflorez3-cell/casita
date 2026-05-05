package com.facetec.sdk;

import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
final class ic {
    private static final byte[] I = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String Z(byte[] bArr) {
        return Z(bArr, I);
    }

    private static String Z(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            bArr3[i2] = bArr2[((-1) - (((-1) - bArr[i3]) | ((-1) - 255))) >> 2];
            int i4 = (bArr[i3] & 3) << 4;
            int i5 = i3 + 1;
            byte b2 = bArr[i5];
            bArr3[i2 + 1] = bArr2[(-1) - (((-1) - i4) & ((-1) - (((b2 + 255) - (b2 | 255)) >> 4)))];
            int i6 = i2 + 3;
            int i7 = ((-1) - (((-1) - bArr[i5]) | ((-1) - 15))) << 2;
            int i8 = i3 + 2;
            byte b3 = bArr[i8];
            bArr3[i2 + 2] = bArr2[i7 | (((b3 + 255) - (b3 | 255)) >> 6)];
            i2 += 4;
            bArr3[i6] = bArr2[(-1) - (((-1) - bArr[i8]) | ((-1) - 63))];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            byte b4 = bArr[length];
            bArr3[i2] = bArr2[((b4 + 255) - (b4 | 255)) >> 2];
            bArr3[i2 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i2 + 2] = Base64.padSymbol;
            bArr3[i2 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            byte b5 = bArr[length];
            int i9 = ((b5 + 3) - (b5 | 3)) << 4;
            int i10 = length + 1;
            int i11 = ((-1) - (((-1) - bArr[i10]) | ((-1) - 255))) >> 4;
            bArr3[i2 + 1] = bArr2[(i11 + i9) - (i11 & i9)];
            bArr3[i2 + 2] = bArr2[(bArr[i10] & Ascii.SI) << 2];
            bArr3[i2 + 3] = Base64.padSymbol;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}

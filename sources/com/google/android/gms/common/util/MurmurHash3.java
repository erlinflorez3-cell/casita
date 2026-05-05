package com.google.android.gms.common.util;

import androidx.collection.ScatterMapKt;

/* JADX INFO: loaded from: classes8.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    public static int murmurhash3_x86_32(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        while (true) {
            i5 = (i3 & (-4)) + i2;
            if (i6 >= i5) {
                break;
            }
            int i7 = bArr[i6];
            int i8 = (i7 + 255) - (i7 | 255);
            int i9 = ((-1) - (((-1) - bArr[i6 + 1]) | ((-1) - 255))) << 8;
            int i10 = bArr[i6 + 2];
            int i11 = ((i10 + 255) - (i10 | 255)) << 16;
            int i12 = i8 | i9;
            int i13 = ((-1) - (((-1) - ((i12 + i11) - (i12 & i11))) & ((-1) - (bArr[i6 + 3] << 24)))) * ScatterMapKt.MurmurHashC1;
            int i14 = i4 ^ (((-1) - (((-1) - (i13 >>> 17)) & ((-1) - (i13 << 15)))) * 461845907);
            i4 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i15 = (i3 + 3) - (3 | i3);
        int i16 = 0;
        if (i15 == 1) {
            int i17 = ((-1) - (((-1) - ((-1) - (((-1) - bArr[i5]) | ((-1) - 255)))) & ((-1) - i16))) * ScatterMapKt.MurmurHashC1;
            i4 ^= ((-1) - (((-1) - (i17 >>> 17)) & ((-1) - (i17 << 15)))) * 461845907;
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    int i18 = bArr[i5 + 2];
                    i16 = ((i18 + 255) - (i18 | 255)) << 16;
                }
            }
            int i19 = bArr[i5 + 1];
            i16 = (-1) - (((-1) - i16) & ((-1) - (((i19 + 255) - (i19 | 255)) << 8)));
            int i172 = ((-1) - (((-1) - ((-1) - (((-1) - bArr[i5]) | ((-1) - 255)))) & ((-1) - i16))) * ScatterMapKt.MurmurHashC1;
            i4 ^= ((-1) - (((-1) - (i172 >>> 17)) & ((-1) - (i172 << 15)))) * 461845907;
        }
        int i20 = i4 ^ i3;
        int i21 = (i20 ^ (i20 >>> 16)) * (-2048144789);
        int i22 = (i21 ^ (i21 >>> 13)) * (-1028477387);
        return i22 ^ (i22 >>> 16);
    }
}

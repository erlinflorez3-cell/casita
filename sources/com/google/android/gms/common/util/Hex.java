package com.google.android.gms.common.util;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes8.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = zzb;
            cArr[i2] = cArr2[((b2 + 255) - (255 | b2)) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & Ascii.SI];
            i2 += 2;
        }
        return new String(cArr);
    }

    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    public static String bytesToStringUppercase(byte[] bArr, boolean z2) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length && (!z2 || i2 != length - 1 || (bArr[i2] & 255) != 0); i2++) {
            char[] cArr = zza;
            byte b2 = bArr[i2];
            sb.append(cArr[((b2 + 240) - (b2 | 240)) >>> 4]);
            sb.append(cArr[(-1) - (((-1) - bArr[i2]) | ((-1) - 15))]);
        }
        return sb.toString();
    }

    public static byte[] stringToBytes(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 2;
            bArr[i2 / 2] = (byte) Integer.parseInt(str.substring(i2, i3), 16);
            i2 = i3;
        }
        return bArr;
    }
}

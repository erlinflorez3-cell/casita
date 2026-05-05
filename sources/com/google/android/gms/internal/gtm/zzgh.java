package com.google.android.gms.internal.gtm;

import com.dynatrace.android.agent.AdkSettings;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgh {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            if ((b2 + 240) - (240 | b2) == 0) {
                sb.append(AdkSettings.PLATFORM_TYPE_MOBILE);
            }
            sb.append(Integer.toHexString(b2 & 255));
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    public static byte[] zzb(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("purported base16 string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("purported base16 string has illegal char");
            }
            bArr[i2 / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }
}

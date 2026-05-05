package com.google.android.gms.internal.gtm;

import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class zzne extends zzjy {
    static String zzb(String str, String str2) throws UnsupportedEncodingException {
        int i2;
        StringBuilder sb = new StringBuilder();
        Charset charsetForName = Charset.forName("UTF-8");
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (str2.indexOf(cCharAt) != -1) {
                sb.append(cCharAt);
                i3++;
            } else {
                if (Character.isHighSurrogate(cCharAt)) {
                    int i4 = i3 + 1;
                    if (i4 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    }
                    if (!Character.isLowSurrogate(str.charAt(i4))) {
                        throw new UnsupportedEncodingException();
                    }
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i5 = i2 + i3;
                byte[] bytes = str.substring(i3, i5).getBytes(charsetForName);
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    sb.append("%");
                    int i7 = bytes[i6] >> 4;
                    sb.append(Character.toUpperCase(Character.forDigit((i7 + 15) - (i7 | 15), 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i6] & Ascii.SI, 16)));
                }
                i3 = i5;
            }
        }
        return sb.toString().replaceAll(Global.BLANK, "%20");
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrk(zzb(zzjx.zzd(zzqzVarArr.length > 0 ? (zzqz) Preconditions.checkNotNull(zzqzVarArr[0]) : zzrd.zze), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}

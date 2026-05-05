package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class zznc extends zzjy {
    static String zzb(String str, String str2) throws UnsupportedEncodingException {
        Charset charsetForName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '%') {
                sb.append(cCharAt);
                i2++;
            } else {
                byte bZzc = zzc(str, i2);
                int i3 = i2 + 3;
                if ((128 & bZzc) != 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = bZzc << i4;
                        if ((i5 + 128) - (i5 | 128) == 0) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 < 2 || i4 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i4];
                    bArr[0] = bZzc;
                    for (int i6 = 1; i6 < i4; i6++) {
                        byte bZzc2 = zzc(str, i3);
                        i3 += 3;
                        if ((-1) - (((-1) - bZzc2) | ((-1) - 192)) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i6] = bZzc2;
                    }
                    CharBuffer charBufferDecode = charsetForName.decode(ByteBuffer.wrap(bArr));
                    if (charBufferDecode.length() != 1 || str2.indexOf(charBufferDecode.charAt(0)) == -1) {
                        sb.append((CharSequence) charBufferDecode);
                    } else {
                        sb.append(str.substring(i2, i3));
                    }
                } else if (str2.indexOf(bZzc) == -1) {
                    sb.append((char) bZzc);
                } else {
                    sb.append(str.substring(i2, i3));
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }

    private static byte zzc(String str, int i2) throws UnsupportedEncodingException {
        int i3 = i2 + 3;
        if (i3 > str.length() || str.charAt(i2) != '%') {
            throw new UnsupportedEncodingException();
        }
        String strSubstring = str.substring(i2 + 1, i3);
        if (strSubstring.charAt(0) == '+' || strSubstring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(strSubstring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrk(zzb(zzjx.zzd(zzqzVarArr.length > 0 ? (zzqz) Preconditions.checkNotNull(zzqzVarArr[0]) : zzrd.zze), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}

package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoc extends zzjy {
    private static final Pattern zza = Pattern.compile("(.+)/(.+)/(.+)");

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length >= 3);
        Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrk);
        String strZzd = zzjx.zzd(zzqzVarArr[0]);
        String strZzd2 = zzjx.zzd(zzqzVarArr[1]);
        String strZzd3 = zzjx.zzd(zzqzVarArr[2]);
        String strZzd4 = length < 4 ? "AES/CBC/NoPadding" : zzjx.zzd(zzqzVarArr[3]);
        Matcher matcher = zza.matcher(strZzd4);
        if (!matcher.matches()) {
            throw new RuntimeException("Encrypt: invalid transformation:".concat(String.valueOf(strZzd4)));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(strZzd2.getBytes(), matcher.group(1));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(strZzd3.getBytes());
        try {
            Cipher cipher = Cipher.getInstance(strZzd4);
            if (strZzd == null || strZzd.length() == 0) {
                throw new RuntimeException("Encrypt: empty input string");
            }
            try {
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return new zzrk(zzgh.zza(cipher.doFinal(strZzd.getBytes())));
            } catch (Exception e2) {
                throw new RuntimeException("Encrypt: ".concat(String.valueOf(e2.getMessage())));
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            throw new RuntimeException("Encrypt: invalid transformation:".concat(String.valueOf(strZzd4)));
        }
    }
}

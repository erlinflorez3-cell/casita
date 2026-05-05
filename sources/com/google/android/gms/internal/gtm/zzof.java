package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes8.dex */
public final class zzof extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        byte[] bArrZzb;
        zzqz zzqzVar;
        zzqz zzqzVar2;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0);
        zzqz zzqzVar3 = zzqzVarArr[0];
        zzrd zzrdVar = zzrd.zze;
        if (zzqzVar3 == zzrdVar) {
            return zzrdVar;
        }
        String strZzd = zzjx.zzd(zzqzVar3);
        String strZzd2 = MessageDigestAlgorithms.MD5;
        if (length > 1 && (zzqzVar2 = zzqzVarArr[1]) != zzrd.zze) {
            strZzd2 = zzjx.zzd(zzqzVar2);
        }
        String strZzd3 = (length <= 2 || (zzqzVar = zzqzVarArr[2]) == zzrd.zze) ? "text" : zzjx.zzd(zzqzVar);
        if ("text".equals(strZzd3)) {
            bArrZzb = strZzd.getBytes();
        } else {
            if (!"base16".equals(strZzd3)) {
                throw new RuntimeException("Hash: Unknown input format: ".concat(String.valueOf(strZzd3)));
            }
            bArrZzb = zzgh.zzb(strZzd);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(strZzd2);
            messageDigest.update(bArrZzb);
            return new zzrk(zzgh.zza(messageDigest.digest()));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Hash: Unknown algorithm: ".concat(String.valueOf(strZzd2)), e2);
        }
    }
}

package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class zznf extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrk(zzne.zzb(zzjx.zzd(zzqzVarArr.length > 0 ? (zzqz) Preconditions.checkNotNull(zzqzVarArr[0]) : zzrd.zze), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()"));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}

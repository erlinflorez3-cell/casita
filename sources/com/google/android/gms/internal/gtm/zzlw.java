package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import io.sentry.SentryEnvelopeItemHeader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlw extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVarZzi;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        zzqz zzqzVar = zzqzVarArr[0];
        boolean z2 = zzqzVar instanceof zzrk;
        zzqz zzqzVar2 = zzqzVarArr[1];
        Preconditions.checkArgument(z2 || !zzrl.zzj(zzqzVar));
        Preconditions.checkArgument(!zzrl.zzi(zzqzVar));
        Preconditions.checkArgument(true ^ zzrl.zzi(zzqzVar2));
        String strZzd = zzjx.zzd(zzqzVar2);
        if (zzqzVar instanceof zzrg) {
            zzrg zzrgVar = (zzrg) zzqzVar;
            if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(strZzd)) {
                return new zzrb(Double.valueOf(zzrgVar.zzk().size()));
            }
            double dZzb = zzjx.zzb(zzqzVar2);
            if (dZzb == Math.floor(dZzb)) {
                int i2 = (int) dZzb;
                if (strZzd.equals(Integer.toString(i2)) && (zzqzVarZzi = zzrgVar.zzi(i2)) != zzrd.zze) {
                    return zzqzVarZzi;
                }
            }
        } else if (z2) {
            zzrk zzrkVar = (zzrk) zzqzVar;
            if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(strZzd)) {
                return new zzrb(Double.valueOf(zzrkVar.zzk().length()));
            }
            double dZzb2 = zzjx.zzb(zzqzVar2);
            if (dZzb2 == Math.floor(dZzb2)) {
                int i3 = (int) dZzb2;
                if (strZzd.equals(Integer.toString(i3))) {
                    return zzrkVar.zzi(i3);
                }
            }
            return zzrd.zze;
        }
        return zzqzVar.zzb(strZzd);
    }
}

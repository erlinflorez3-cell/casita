package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import io.sentry.SentryEnvelopeItemHeader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlx extends zzjy {
    public static final zzlx zza = new zzlx();

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        zzqz zzqzVar = zzqzVarArr[0];
        zzqz zzqzVar2 = zzqzVarArr[1];
        Preconditions.checkArgument(!zzrl.zzi(zzqzVar));
        Preconditions.checkArgument(true ^ zzrl.zzi(zzqzVar2));
        String strZzd = zzjx.zzd(zzqzVar2);
        if (zzqzVar instanceof zzrg) {
            if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(strZzd)) {
                return new zzra(true);
            }
            double dZzb = zzjx.zzb(zzqzVar2);
            if (dZzb == Math.floor(dZzb)) {
                int i2 = (int) dZzb;
                if (strZzd.equals(Integer.toString(i2)) && i2 >= 0 && i2 < ((zzrg) zzqzVar).zzk().size()) {
                    return new zzra(true);
                }
            }
        } else if (zzqzVar instanceof zzrk) {
            if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(strZzd)) {
                return new zzra(true);
            }
            double dZzb2 = zzjx.zzb(zzqzVar2);
            if (dZzb2 == Math.floor(dZzb2)) {
                int i3 = (int) dZzb2;
                if (strZzd.equals(Integer.toString(i3)) && i3 >= 0 && i3 < ((zzrk) zzqzVar).zzk().length()) {
                    return new zzra(true);
                }
            }
            return new zzra(false);
        }
        return new zzra(Boolean.valueOf(zzqzVar.zzh(strZzd)));
    }
}

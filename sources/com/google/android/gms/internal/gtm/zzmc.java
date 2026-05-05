package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import io.sentry.SentryEnvelopeItemHeader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmc extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 3);
        zzqz zzqzVar = zzqzVarArr[0];
        zzqz zzqzVar2 = zzqzVarArr[1];
        zzqz zzqzVar3 = zzqzVarArr[2];
        Preconditions.checkArgument(zzqzVar != zzrd.zzd);
        Preconditions.checkArgument(zzqzVar != zzrd.zze);
        Preconditions.checkArgument(!zzrl.zzi(zzqzVar));
        Preconditions.checkArgument(!zzrl.zzi(zzqzVar2));
        Preconditions.checkArgument(!zzrl.zzi(zzqzVar3));
        if (zzrl.zzj(zzqzVar)) {
            return zzqzVar3;
        }
        String strZzd = zzjx.zzd(zzqzVar2);
        if (zzqzVar instanceof zzrh) {
            zzrh zzrhVar = (zzrh) zzqzVar;
            if (!zzrhVar.zzk()) {
                zzrhVar.zzf(strZzd, zzqzVar3);
            }
            return zzqzVar3;
        }
        if (zzqzVar instanceof zzrg) {
            zzrg zzrgVar = (zzrg) zzqzVar;
            if (SentryEnvelopeItemHeader.JsonKeys.LENGTH.equals(strZzd)) {
                double dZzb = zzjx.zzb(zzqzVar3);
                Preconditions.checkArgument(!Double.isInfinite(dZzb) && dZzb == Math.floor(dZzb));
                zzrgVar.zzm((int) dZzb);
                return zzqzVar3;
            }
            double dZzb2 = zzjx.zzb(zzqzVar2);
            if (!Double.isInfinite(dZzb2) && dZzb2 >= 0.0d) {
                int i2 = (int) dZzb2;
                if (strZzd.equals(Integer.toString(i2))) {
                    zzrgVar.zzl(i2, zzqzVar3);
                    return zzqzVar3;
                }
            }
        }
        zzqzVar.zzf(strZzd, zzqzVar3);
        return zzqzVar3;
    }
}

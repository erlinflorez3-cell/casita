package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
final class zzkp implements Comparator {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ zzie zzb;

    zzkp(zzks zzksVar, zzrc zzrcVar, zzie zzieVar) {
        this.zza = zzrcVar;
        this.zzb = zzieVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzqz zzqzVar = (zzqz) obj;
        zzqz zzqzVar2 = (zzqz) obj2;
        if (zzqzVar == null) {
            return zzqzVar2 != null ? 1 : 0;
        }
        if (zzqzVar2 == null) {
            return -1;
        }
        zzqz zzqzVarZzd = this.zza.zzi().zzd(this.zzb, zzqzVar, zzqzVar2);
        Preconditions.checkState(zzqzVarZzd instanceof zzrb);
        return (int) ((zzrb) zzqzVarZzd).zzi().doubleValue();
    }
}

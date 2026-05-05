package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzok extends zzjy {
    private final zzib zza;

    public zzok(zzib zzibVar) {
        this.zza = zzibVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0);
        Object obj = this.zza.zza().zzd().get(zzjx.zzd(zzqzVarArr[0]));
        Object obj2 = obj;
        obj2 = obj;
        if (obj == null && length > 1) {
            obj2 = zzqzVarArr[1];
        }
        return zzrl.zzb(obj2);
    }
}

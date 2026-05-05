package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzni extends zzjy {
    private final zznh zza;

    public zzni(zznh zznhVar) {
        this.zza = zznhVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        HashMap map = new HashMap();
        if (length >= 2 && (zzqzVar = zzqzVarArr[1]) != zzrd.zze) {
            Preconditions.checkArgument(zzqzVar instanceof zzrh);
            for (Map.Entry entry : ((zzrh) zzqzVarArr[1]).zzi().entrySet()) {
                Preconditions.checkState(!(entry.getValue() instanceof zzri));
                Preconditions.checkState(!zzrl.zzi((zzqz) entry.getValue()));
                map.put((String) entry.getKey(), ((zzqz) entry.getValue()).zzc());
            }
        }
        return zzrl.zzb(this.zza.zza(strZzk, map));
    }
}

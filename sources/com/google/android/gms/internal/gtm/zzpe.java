package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpe extends zzjy {
    private final com.google.android.gms.tagmanager.zzco zza;
    private final zzib zzb;

    public zzpe(com.google.android.gms.tagmanager.zzco zzcoVar, zzib zzibVar) {
        this.zza = zzcoVar;
        this.zzb = zzibVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        boolean z3 = true;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        if (length == 1) {
            z2 = true;
        } else if (length == 2) {
            length = 2;
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        zzqz zzqzVar = length > 1 ? zzqzVarArr[1] : zzrd.zze;
        if (zzqzVar != zzrd.zze && !(zzqzVar instanceof zzrh)) {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        zzgz zzgzVarZza = this.zzb.zza();
        try {
            this.zza.zzc(zzgzVarZza.zzc(), ((zzrk) zzqzVarArr[0]).zzk(), zzqzVar != zzrd.zze ? zzrl.zza(((zzrh) zzqzVar).zzi()) : null, zzgzVarZza.currentTimeMillis());
        } catch (RemoteException e2) {
            zzho.zza("Error calling measurement proxy:".concat(String.valueOf(e2.getMessage())));
        }
        return zzrd.zze;
    }
}

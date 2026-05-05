package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjv extends zzjy {
    private zzie zza = null;
    private final String zzb;
    private final List zzc;
    private final List zzd;

    public zzjv(zzie zzieVar, String str, List list, List list2) {
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
    }

    public final String toString() {
        List list = this.zzd;
        return this.zzb + "\n\tparams: " + this.zzc.toString() + "\n\t: statements: " + list.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    public final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzie zzieVarZza;
        Iterator it;
        try {
            zzieVarZza = this.zza.zza();
            for (int i2 = 0; i2 < this.zzc.size(); i2++) {
                if (zzqzVarArr.length > i2) {
                    zzieVarZza.zzc((String) this.zzc.get(i2), zzqzVarArr[i2]);
                } else {
                    zzieVarZza.zzc((String) this.zzc.get(i2), zzrd.zze);
                }
            }
            zzieVarZza.zzc("arguments", new zzrg(Arrays.asList(zzqzVarArr)));
            it = this.zzd.iterator();
        } catch (RuntimeException e2) {
            zzho.zza("Internal error - Function call: " + this.zzb + "\n" + e2.getMessage());
        }
        while (it.hasNext()) {
            zzqz zzqzVarZzd = zzrl.zzd(zzieVarZza, (zzri) it.next());
            if (zzqzVarZzd instanceof zzrd) {
                zzrd zzrdVar = (zzrd) zzqzVarZzd;
                if (zzrdVar.zzj()) {
                    return zzrdVar.zzi();
                }
                return zzrd.zze;
            }
        }
        return zzrd.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzc(zzie zzieVar) {
        this.zza = zzieVar;
    }
}

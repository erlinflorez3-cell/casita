package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public final class zznj extends zzjy {
    private final int zza;
    private final zzie zzb;

    public zznj(int i2, zzie zzieVar) {
        this.zza = i2;
        this.zzb = zzieVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    public final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        try {
            zzjv zzjvVarZza = zzpj.zza(new JSONArray(((zzrk) zzqzVarArr[0]).zzk()).getJSONArray(0));
            zzjvVarZza.zzc(this.zzb);
            return this.zza == 0 ? zzrd.zze : zzjvVarZza.zzd(zzieVar, new zzqz[0]);
        } catch (JSONException e2) {
            zzho.zzb("Unable to convert Custom Pixie to instruction", e2);
            return zzrd.zze;
        }
    }
}

package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzayb implements zzaxr {
    private final zzarz zza;
    private zzavq zzb = new zzavq();

    private zzayb(zzarz zzarzVar, int i2) {
        this.zza = zzarzVar;
        zzayn.zza();
    }

    public static zzaxr zze(zzarz zzarzVar) {
        return new zzayb(zzarzVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxr
    public final zzaxr zza(zzary zzaryVar) {
        this.zza.zzd(zzaryVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxr
    public final zzaxr zzb(zzavq zzavqVar) {
        this.zzb = zzavqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxr
    public final String zzc() {
        String strZzk;
        zzavs zzavsVarZzd = this.zza.zzg().zzd();
        return (zzavsVarZzd == null || (strZzk = zzavsVarZzd.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzavsVarZzd.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxr
    public final byte[] zzd(int i2, boolean z2) {
        this.zzb.zzf(Boolean.valueOf(1 == (i2 ^ 1)));
        this.zzb.zze(false);
        this.zza.zzf(this.zzb.zzm());
        try {
            zzayn.zza();
            if (i2 == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzaqc.zza).ignoreNullValues(true).build().encode(this.zza.zzg()).getBytes("utf-8");
            }
            zzasb zzasbVarZzg = this.zza.zzg();
            zznv zznvVar = new zznv();
            zzaqc.zza.configure(zznvVar);
            return zznvVar.zza().zza(zzasbVarZzg);
        } catch (UnsupportedEncodingException e2) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
        }
    }
}

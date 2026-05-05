package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzof {
    private zzoh zza;
    private String zzb;
    private zzog zzc;
    private Long zzd;
    private Boolean zze;

    public final zzof zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzof zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzof zzc(zzog zzogVar) {
        this.zzc = zzogVar;
        return this;
    }

    public final zzof zzd(Long l2) {
        this.zzd = Long.valueOf((-1) - (((-1) - l2.longValue()) | ((-1) - Long.MAX_VALUE)));
        return this;
    }

    public final zzof zze(zzoh zzohVar) {
        this.zza = zzohVar;
        return this;
    }

    public final zzoj zzh() {
        return new zzoj(this, null);
    }
}
